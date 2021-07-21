package com.onenetwork.util;

import com.onenetwork.parser.XmlParser;
import com.onenetwork.response.ResponseMessage;
import com.onenetwork.storage.FileInfoStorage;
import com.onenetwork.storage.ContentStorage;
import com.onenetwork.webservice.TMicInterface;
import com.onenetwork.webservice.TMicInterfaceMessage;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UtilityClass
public class ResponseXmlExtractor {

    public List<ContentStorage<ResponseMessage>> getContents(final List<FileInfoStorage> rootContents) {
        XmlParser parser = new XmlParser();
        List<ContentStorage<ResponseMessage>> responseMessageList = new ArrayList<>();

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

    private List<ContentStorage<ResponseMessage>> getResponseMessage(final XmlParser parser,
                                                                     final FileInfoStorage rootContent,
                                                                     final List<TMicInterfaceMessage> messageContent) {
        List<ContentStorage<ResponseMessage>> contentStorageList = new ArrayList<>();
        for (TMicInterfaceMessage micInterfaceMessage : messageContent) {
            String value = micInterfaceMessage.getBody().getValue();

            XmlParser.MappingResult<ResponseMessage> responseMessageMappingResult =
                    parser.apply(ResponseMessage.class, value);
            contentStorageList.add(new ContentStorage<>(rootContent.getPath(), responseMessageMappingResult.content));
        }
        return contentStorageList;
    }

    private static List<TMicInterfaceMessage> getMessages(final TMicInterface micInterface) {
        return micInterface != null
                ? micInterface.getMessages().getMessage()
                : Collections.emptyList();
    }
}
