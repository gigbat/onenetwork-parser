package com.onenetwork.collector;

import com.onenetwork.model.DefaultFieldStorage;
import com.onenetwork.parser.XmlParser;
import com.onenetwork.storage.FileInfoStorage;
import com.onenetwork.util.FileExtractor;
import com.onenetwork.util.ModelGenerator;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.onenetwork.constant.PreparedGlobalXsdModel.GLOBAL_XSD_MODEL;

public class ModelsCollector {

    private static final String PATH_TO_XMLNS_FOLDER = "xmlns";

    public Map<DefaultFieldStorage, Object> collectObjects() {
        Map<DefaultFieldStorage, Object> globalObjectsMap = new HashMap<>();
        List<Object> globalObjects = getGlobalObjects();
        for (Object globalObject : globalObjects) {
            globalObjectsMap.putAll(ModelGenerator.generateModels(globalObject));
        }
        return globalObjectsMap;
    }

    private List<Object> getGlobalObjects() {
        List<FileInfoStorage> xmlnsFileInfoStorage = FileExtractor.getRootContents(PATH_TO_XMLNS_FOLDER);
        XmlParser xmlParser = new XmlParser();

        return xmlnsFileInfoStorage.stream().map(e -> {
            String xml = e.getXml();
            String path = e.getPath();
            Class<?> clazz = GLOBAL_XSD_MODEL.get(path.substring(path.lastIndexOf(File.separator) + 1));
            return xmlParser.apply(clazz, xml).content;
        }).collect(Collectors.toList());
    }
}
