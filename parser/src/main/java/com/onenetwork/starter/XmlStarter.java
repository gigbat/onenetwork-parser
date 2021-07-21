package com.onenetwork.starter;

import com.onenetwork.model.DefaultFieldStorage;
import com.onenetwork.parser.LineParser;
import com.onenetwork.parser.XmlParser;
import com.onenetwork.response.ResponseMessage;
import com.onenetwork.storage.FileInfoStorage;
import com.onenetwork.storage.ContentStorage;
import com.onenetwork.util.FileExtractor;
import com.onenetwork.util.ModelGenerator;
import com.onenetwork.util.ResponseXmlExtractor;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.onenetwork.constant.PreparedGlobalXsdModel.GLOBAL_XSD_MODEL;

public class XmlStarter {

    private static final String PATH_TO_TEST_FOLDER = "test";
    private static final String PATH_TO_XMLNS_FOLDER = "xmlns";

    public static void main(String[] args) {
        /*
         * 1. Collect data from the test folder
         * 2. Scan model and collect data to map where key is control identifier, value is class
         * 3. Get <Message> to define <messageType> + <message>
         * 4. Extract from Map classes by first identifier and parsing data to class
         * */
        List<FileInfoStorage> xmlnsFileInfoStorage = FileExtractor.getRootContents(PATH_TO_XMLNS_FOLDER);
        XmlParser xmlParser = new XmlParser();
        List<Object> globalObjects = new ArrayList<>();
        for (FileInfoStorage fileInfoStorage : xmlnsFileInfoStorage) {
            String xml = fileInfoStorage.getXml();
            String path = fileInfoStorage.getPath();
            Class<?> clazz = GLOBAL_XSD_MODEL.get(path.substring(path.lastIndexOf(File.separator) + 1));
            globalObjects.add(xmlParser.apply(clazz, xml).content);
        }
        Map<DefaultFieldStorage, Object> globalObjectsMap = new HashMap<>();
        for (Object globalObject : globalObjects) {
            globalObjectsMap.putAll(ModelGenerator.generateModels(globalObject));
        }
        List<FileInfoStorage> responseFileInfoStorage = FileExtractor.getRootContents(PATH_TO_TEST_FOLDER);
        List<ContentStorage<ResponseMessage>> contentStorages = ResponseXmlExtractor.getContents(responseFileInfoStorage);
        LineParser lineParser = new LineParser();
        for (ContentStorage<ResponseMessage> contentStorage : contentStorages) {
            ResponseMessage responseMessage = contentStorage.getValue();
            if (responseMessage != null) {
                List<Object> models = lineParser.getModels(responseMessage, globalObjectsMap);
            }
        }
    }
}
