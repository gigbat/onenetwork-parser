package com.onenetwork.test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.onenetwork.collector.ModelsCollector;
import com.onenetwork.collector.ParsedModelsCollector;
import com.onenetwork.model.DefaultFieldStorage;
import lombok.SneakyThrows;
import com.onenetwork.comparator.TreeComparator;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


public class JsonTest {

    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final String SUFFIX_JSON = ".json";
    private static final String PATH_TO_TEST_FOLDER = "test";

    @BeforeAll
    public static void configure() {
        MAPPER.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }

    @SneakyThrows
    @Test
    public void starter() {
        ModelsCollector modelsCollector = new ModelsCollector();
        Map<DefaultFieldStorage, Object> globalObjectsMap = modelsCollector.collectObjects();
        ParsedModelsCollector parsedModelsCollector = new ParsedModelsCollector();

        URL resource = Thread.currentThread().getContextClassLoader().getResource(PATH_TO_TEST_FOLDER);
        List<List<Object>> actuals = parsedModelsCollector.collectParsedObjects(globalObjectsMap);
        List<File> expectedFiles = getExpectedFiles(String.valueOf(resource.toURI()).substring(6));

        Assertions.assertEquals(expectedFiles.size(), actuals.size());
        for (int i = 0; i < expectedFiles.size(); i++) {
            String expected = FileUtils.readFileToString(expectedFiles.get(i), StandardCharsets.UTF_8);
            String actual = MAPPER.writeValueAsString(actuals.get(i));

            TreeComparator.compare(expected, actual);
        }
    }

    private List<File> getExpectedFiles(final String resource) {
        List<File> files = new ArrayList<>();
        File file = new File(resource);
        if (file.isDirectory()) {
            files.addAll(Arrays.stream(Objects.requireNonNull(file.listFiles()))
                    .flatMap(e -> getExpectedFiles(e.getAbsolutePath()).stream()).collect(Collectors.toList()));
        } else if (file.isFile() && file.getName().endsWith(SUFFIX_JSON)) {
            files.add(file);
        }
        return files;
    }
}
