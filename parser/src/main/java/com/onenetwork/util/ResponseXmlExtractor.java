package com.onenetwork.util;

import com.onenetwork.parser.XmlParser;
import com.onenetwork.response.ResponseMessage;
import com.onenetwork.storage.RootContentStorage;
import com.onenetwork.storage.Storage;
import com.onenetwork.webservice.TMicInterface;
import com.onenetwork.webservice.TMicInterfaceMessage;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UtilityClass
public class ResponseXmlExtractor {

    public List<Storage<ResponseMessage>> getContents(final List<RootContentStorage> rootContents) {
        XmlParser parser = new XmlParser();
        List<Storage<ResponseMessage>> responseMessageList = new ArrayList<>();

        rootContents.forEach(e -> {
            if (e != null) {
                XmlParser.MappingResult<TMicInterface> result = parser.apply(TMicInterface.class, e.getXml());
                List<TMicInterfaceMessage> messageContent = getMessages(result.content);
                if (messageContent != null && !messageContent.isEmpty()) {
                    responseMessageList.addAll(getResponseMessage(parser, e, messageContent));
                }
            }
        });
        return responseMessageList;
    }

    private List<Storage<ResponseMessage>> getResponseMessage(final XmlParser parser,
                                                              final RootContentStorage rootContent,
                                                              final List<TMicInterfaceMessage> messageContent) {
        List<Storage<ResponseMessage>> storageList = new ArrayList<>();
        for (TMicInterfaceMessage micInterfaceMessage : messageContent) {
            String value = micInterfaceMessage.getBody().getValue();

            XmlParser.MappingResult<ResponseMessage> responseMessageMappingResult =
                    parser.apply(ResponseMessage.class, value);
            storageList.add(new Storage<>(rootContent.getPath(), responseMessageMappingResult.content));
        }
        return storageList;
    }

    private static List<TMicInterfaceMessage> getMessages(final TMicInterface micInterface) {
        return micInterface != null
                ? micInterface.getMessages().getMessage()
                : Collections.emptyList();
    }
}
