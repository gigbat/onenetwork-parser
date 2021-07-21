package com.onenetwork.util;

import com.onenetwork.storage.FileInfoStorage;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.io.File;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static com.onenetwork.constant.DelimiterConstant.DELIMITER_EMPTY;

@UtilityClass
public class FileExtractor {

    private final String SUFFIX_XML = ".xml";

    @SneakyThrows
    public List<FileInfoStorage> getRootContents(final String folder) {
        URL resource = Thread.currentThread().getContextClassLoader().getResource(folder);
        if (resource != null) {
            File rootFile = new File(resource.toURI());
            List<FileInfoStorage> rootContents = new ArrayList<>();

            File[] listFiles = rootFile.listFiles();
            if (listFiles != null) {
                walk(listFiles, rootContents);
                return rootContents;
            }
        }
        return null;
    }

    @SneakyThrows
    private void walk(final File[] listFiles, final List<FileInfoStorage> rootContents) {

        for (File file : listFiles) {
            if (file.isFile() && matchingXmlFile(file)) {
                String path = file.getAbsolutePath();
                String xml = String.join(DELIMITER_EMPTY,
                        Files.readAllLines(Paths.get(path), StandardCharsets.US_ASCII));
                rootContents.add(new FileInfoStorage(path, xml));
            } else if (file.isDirectory()) {
                File[] directoryListFiles = file.listFiles();
                if (directoryListFiles != null) {
                    walk(directoryListFiles, rootContents);
                }
            }
        }
    }

    private boolean matchingXmlFile(final File file) {
        return file.getAbsolutePath().endsWith(SUFFIX_XML);
    }
}
