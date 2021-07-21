package com.onenetwork.util;

import com.onenetwork.model.ControlIdentifierSelector;
import com.onenetwork.model.custom_object.CustomObject;
import com.onenetwork.model.position.Position;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.lang.reflect.Field;
import java.util.Map;

import static com.onenetwork.constant.DelimiterConstant.DELIMITER_EMPTY;

@UtilityClass
public class FieldExtractor {

    private final String CLASS_NAME_POSITION = "Position";
    private final String CLASS_NAME_CUSTOM_OBJECT = "CustomObject";
    private final String DEFAULT_FIELD_CONTROL_IDENTIFIER = "defaultControlIdentifier";
    private final String DEFAULT_FIELD_MESSAGE_TYPE = "messageType";

    @SneakyThrows
    public Object getParsedValue(final Object object,
                                 final String line,
                                 final String type,
                                 final Map<ControlIdentifierSelector, Object> selectorObjectMap) {
        Class<?> clazz = object.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            generateFieldValue(line, declaredField, object, type, selectorObjectMap);
        }
        return object;
    }

    @SneakyThrows
    private void generateFieldValue(final String line, final Field field, final Object object,
                                    final String type,
                                    final Map<ControlIdentifierSelector, Object> selectorObjectMap) {
        if (isNotDefaultField(field)) {
            Object fieldObject = field.get(object);
            if (fieldObject instanceof Position) {
                fieldObject = getParsedValue(fieldObject, line, CLASS_NAME_POSITION, selectorObjectMap);
                field.set(object, fieldObject);
            } else if (fieldObject instanceof CustomObject) {
                fieldObject = getParsedValue(fieldObject, line, CLASS_NAME_CUSTOM_OBJECT, selectorObjectMap);
                field.set(object, fieldObject);
            } else {
                if (type.equals(CLASS_NAME_POSITION)) {
                    generatePositionValue(line, object);
                } else if (type.equals(CLASS_NAME_CUSTOM_OBJECT)) {
                    generateCustomObjectValue(line, object, selectorObjectMap);
                }
            }
        }
    }

    private boolean isNotDefaultField(final Field field) {
        return !field.getName().equals(DEFAULT_FIELD_CONTROL_IDENTIFIER)
                && !field.getName().equals(DEFAULT_FIELD_MESSAGE_TYPE);
    }

    @SneakyThrows
    private void generatePositionValue(final String line, final Object object) {
        Field fieldStartPosition = object.getClass().getDeclaredField("startPosition");
        Field fieldEndPosition = object.getClass().getDeclaredField("endPosition");
        Field fieldValue = object.getClass().getDeclaredField("value");
        fieldStartPosition.setAccessible(true);
        fieldEndPosition.setAccessible(true);
        fieldValue.setAccessible(true);

        int startPosition = fieldStartPosition.getInt(object) - 1;
        int endPosition = fieldEndPosition.getInt(object);
        String substring = line.substring(startPosition, endPosition);
        fieldValue.set(object, substring);
    }

    @SneakyThrows
    private void generateCustomObjectValue(final String line, final Object object,
                                           final Map<ControlIdentifierSelector, Object> selectorObjectMap) {
        Field fieldRefPosition = object.getClass().getDeclaredField("refPosition");
        Field fieldObject = object.getClass().getDeclaredField("object");
        fieldRefPosition.setAccessible(true);
        fieldObject.setAccessible(true);

        Object fieldPosition = fieldRefPosition.get(object);
        generatePositionValue(line, fieldPosition);
        Field fieldValue = fieldPosition.getClass().getDeclaredField("value");
        fieldValue.setAccessible(true);
        String value = String.valueOf(fieldValue.get(fieldPosition));
        for (Object selectorObject : selectorObjectMap.values()) {
            if (selectorObject.getClass().getSimpleName().equals(value)) {
                fieldObject.set(object,
                        getParsedValue(selectorObject, line, DELIMITER_EMPTY, selectorObjectMap));
            }
        }
    }
}
