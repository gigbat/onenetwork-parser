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
        List<Object> globalObjects = new ArrayList<>();
        for (FileInfoStorage fileInfoStorage : xmlnsFileInfoStorage) {
            String xml = fileInfoStorage.getXml();
            String path = fileInfoStorage.getPath();
            Class<?> clazz = GLOBAL_XSD_MODEL.get(path.substring(path.lastIndexOf(File.separator) + 1));
            globalObjects.add(xmlParser.apply(clazz, xml).content);
        }
        return globalObjects;
    }
}
