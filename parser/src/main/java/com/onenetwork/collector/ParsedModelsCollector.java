package com.onenetwork.collector;

import com.onenetwork.model.DefaultFieldStorage;
import com.onenetwork.parser.LineParser;
import com.onenetwork.response.ResponseMessage;
import com.onenetwork.storage.ContentStorage;
import com.onenetwork.storage.FileInfoStorage;
import com.onenetwork.util.FileExtractor;
import com.onenetwork.util.ResponseXmlExtractor;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParsedModelsCollector {

    private static final String PATH_TO_TEST_FOLDER = "test";

    public List<List<Object>> collectParsedObjects(final Map<DefaultFieldStorage, Object> globalObjectsMap) {
        List<ContentStorage<ResponseMessage>> contentStorages = getContentStorages();
        LineParser lineParser = new LineParser();

        return contentStorages.stream().filter(e -> e.getValue() != null).map(e ->
                lineParser.getModels(e.getValue(), globalObjectsMap)).collect(Collectors.toList());
    }

    private List<ContentStorage<ResponseMessage>> getContentStorages() {
        List<FileInfoStorage> responseFileInfoStorage = FileExtractor.getRootContents(PATH_TO_TEST_FOLDER);
        return ResponseXmlExtractor.getContents(responseFileInfoStorage);
    }
}
