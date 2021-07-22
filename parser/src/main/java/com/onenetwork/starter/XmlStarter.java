package com.onenetwork.starter;

import com.onenetwork.collector.ModelsCollector;
import com.onenetwork.collector.ParsedModelsCollector;
import com.onenetwork.model.DefaultFieldStorage;

import java.util.List;
import java.util.Map;

public class XmlStarter {

    public static void main(String[] args) {
        ModelsCollector modelsCollector = new ModelsCollector();
        Map<DefaultFieldStorage, Object> globalObjectsMap = modelsCollector.collectObjects();
        ParsedModelsCollector parsedModelsCollector = new ParsedModelsCollector();
        List<List<Object>> listOfParsedModels = parsedModelsCollector.collectParsedObjects(globalObjectsMap);
        for (List<Object> parsedModels : listOfParsedModels) {
            System.out.println();
        }
    }
}
