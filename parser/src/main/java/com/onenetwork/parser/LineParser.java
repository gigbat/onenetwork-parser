package com.onenetwork.parser;

import com.onenetwork.model.ControlIdentifier;
import com.onenetwork.model.ControlIdentifierSelector;
import com.onenetwork.model.SimpleControlIdentifier;
import com.onenetwork.response.ResponseMessage;
import com.onenetwork.storage.Storage;
import com.onenetwork.util.PositionExtractor;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

import static com.onenetwork.constant.DelimiterConstant.DELIMITER_EMPTY;
import static com.onenetwork.constant.DelimiterConstant.DELIMITER_SEMICOLON;
import static com.onenetwork.constant.DelimiterConstant.DELIMITER_SPACE;
import static com.onenetwork.constant.PreparedSimpleRecordDataElement.SIMPLE_RECORD_DATA_ELEMENT;
import static com.onenetwork.constant.RegexConstant.REGEX_SPACE;
import static com.onenetwork.constant.RegexConstant.REGEX_SPACE_FROM_5;
import static com.onenetwork.constant.TypeConstant.TYPE_AE;
import static com.onenetwork.constant.TypeConstant.TYPE_AE_AX;
import static com.onenetwork.constant.TypeConstant.TYPE_AX;
import static com.onenetwork.constant.TypeConstant.TYPE_ENTRY_VALIDATE;
import static com.onenetwork.constant.TypeConstant.TYPE_ISF_VALIDATE;
import static com.onenetwork.constant.TypeConstant.TYPE_NR;
import static com.onenetwork.constant.TypeConstant.TYPE_SA;
import static com.onenetwork.constant.TypeConstant.TYPE_SN;
import static com.onenetwork.constant.TypeConstant.TYPE_SN_US_SF10;
import static com.onenetwork.constant.TypeConstant.TYPE_SO;
import static com.onenetwork.constant.TypeConstant.TYPE_SX;
import static com.onenetwork.constant.TypeConstant.TYPE_US_ISF10;

public class LineParser {

    private static final int CHARACTERS_IN_LINE = 80;

    @SneakyThrows
    public List<Object> getModels(final ResponseMessage responseMessage,
                                  final Map<ControlIdentifierSelector, Object> selectorClassMap) {
        String messageType = responseMessage.getResponse().getMessageType();
        if (isCatairFormat(messageType)) {
            return generateCatairInstances(responseMessage, selectorClassMap);
        } else if (isSimpleFormat(messageType)) {
            generateSimpleInstances(responseMessage, Collections.emptyList());
        }
        return Collections.emptyList();
    }

    private boolean isCatairFormat(final String messageType) {
        return messageType.equals(TYPE_AX) || messageType.equals(TYPE_AE)
                || messageType.equals(TYPE_SO) || messageType.equals(TYPE_SX)
                || messageType.equals(TYPE_SN) || messageType.equals(TYPE_SA)
                || messageType.equals(TYPE_US_ISF10) || messageType.equals(TYPE_NR);
    }

    private boolean isSimpleFormat(final String messageType) {
        return messageType.equals(TYPE_ISF_VALIDATE) || messageType.equals(TYPE_ENTRY_VALIDATE);
    }

    @SneakyThrows
    private List<Object> generateCatairInstances(final ResponseMessage responseMessage,
                                                 final Map<ControlIdentifierSelector, Object> selectorClassMap) {
        String message = removeFirstSpaces(responseMessage.getResponse().getMessage());
        String[] lines = getLines(message);
        List<Object> list = new ArrayList<>();
        for (String line : lines) {
            Integer endPosition = getEndPosition(line);
            String controlIdentifier = line.substring(0, endPosition);
            String messageType = concatDoubleType(responseMessage.getResponse().getMessageType());
            ControlIdentifierSelector selector = new ControlIdentifierSelector(messageType, controlIdentifier);
            Object object = selectorClassMap.get(selector);
            Object recordDataElement = PositionExtractor.getParsedValue(object, line, DELIMITER_EMPTY, selectorClassMap);
            list.add(recordDataElement);
        }
        return list;
    }

    private String removeFirstSpaces(final String message) {
        return message.startsWith(DELIMITER_SPACE)
                ? message.replaceFirst(REGEX_SPACE, DELIMITER_EMPTY)
                : message;
    }

    private Integer getEndPosition(final String line) {
        ControlIdentifier[] values = ControlIdentifier.values();
        for (ControlIdentifier value : values) {
            String identifier = value.getIdentifier();
            if (line.startsWith(identifier)) {
                return value.getEndPosition();
            }
        }
        return 0;
    }

    private void generateSimpleInstances(final ResponseMessage responseMessage, final List<Object> list) {
        String message = responseMessage.getResponse().getMessage();
        String[] lines = message.split(REGEX_SPACE_FROM_5);
        String messageType = responseMessage.getResponse().getMessageType();
        for (String line : lines) {
            Object simpleDataRecordElement = createSimpleDataRecordElement(line, messageType);
            list.add(simpleDataRecordElement);
        }
    }

    private String[] getLines(final String message) {
        char[] chars = message.toCharArray();
        List<String> stringList = new ArrayList<>();

        separateByLine(chars, stringList, message);
        return stringList.toArray(new String[0]);
    }

    private void separateByLine(final char[] chars, final List<String> stringList, final String message) {
        int length = chars.length;
        int currentPosition = 0;

        if (length >= CHARACTERS_IN_LINE) {
            for (int i = CHARACTERS_IN_LINE; i < chars.length + 1; i++) {
                if (i % CHARACTERS_IN_LINE == 0) {
                    stringList.add(message.substring(currentPosition, i));
                    currentPosition = i;
                }
            }
        }
    }

    private Object createSimpleDataRecordElement(final String line, final String messageType) {
        SimpleControlIdentifier simpleControlIdentifier = getSimpleControlIdentifier(line);
        String messageDescription = separateSimpleRecord(line);
        BiFunction<SimpleControlIdentifier, String, Object> function =
                SIMPLE_RECORD_DATA_ELEMENT.get(messageType);
        return function.apply(simpleControlIdentifier, messageDescription);
    }

    private SimpleControlIdentifier getSimpleControlIdentifier(final String line) {
        SimpleControlIdentifier[] values = SimpleControlIdentifier.values();

        for (SimpleControlIdentifier value : values) {
            if (line.startsWith(value.getSymbol())) {
                return value;
            }
        }
        return null;
    }

    private String separateSimpleRecord(final String line) {
        return String.valueOf(line.charAt(1)).matches(REGEX_SPACE)
                ? line.replaceFirst(REGEX_SPACE, DELIMITER_SEMICOLON)
                : line;
    }

    private String concatDoubleType(final String messageType) {
        if (messageType.equals(TYPE_AE) || messageType.equals(TYPE_AX)) {
            return TYPE_AE_AX;
        } else if (messageType.equals(TYPE_SN) || messageType.equals(TYPE_US_ISF10)) {
            return TYPE_SN_US_SF10;
        }
        return messageType;
    }
}
