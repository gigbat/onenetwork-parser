package com.onenetwork.starter;

import com.onenetwork.model.ControlIdentifierSelector;
import com.onenetwork.parser.LineParser;
import com.onenetwork.parser.XmlParser;
import com.onenetwork.response.ResponseMessage;
import com.onenetwork.storage.RootContentStorage;
import com.onenetwork.storage.Storage;
import com.onenetwork.util.ControlIdentifierCollector;
import com.onenetwork.util.FileExtractor;
import com.onenetwork.util.ResponseXmlExtractor;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.onenetwork.constant.PreparedAliasData.GLOBAL_DATA;

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
        List<RootContentStorage> xmlnsRootContentStorage = FileExtractor.getRootContents(PATH_TO_XMLNS_FOLDER);
        XmlParser xmlParser = new XmlParser();
        List<Object> list = new ArrayList<>();
        for (RootContentStorage rootContentStorage : xmlnsRootContentStorage) {
            String xml = rootContentStorage.getXml();
            String path = rootContentStorage.getPath();
            Class<?> clazz = GLOBAL_DATA.get(path.substring(path.lastIndexOf(File.separator) + 1));
            list.add(xmlParser.apply(clazz, xml).content);
        }
        Map<ControlIdentifierSelector, Object> collect = ControlIdentifierCollector.collect(list.get(0));
        List<RootContentStorage> responseRootContentStorage = FileExtractor.getRootContents(PATH_TO_TEST_FOLDER);
        List<Storage<ResponseMessage>> storages = ResponseXmlExtractor.getContents(responseRootContentStorage);
        LineParser lineParser = new LineParser();
        for (Storage<ResponseMessage> storage : storages) {
            ResponseMessage responseMessage = storage.getValue();
            if (responseMessage != null) {
                List<Object> models = lineParser.getModels(responseMessage, collect);
            }
        }
    }
}