package com.onenetwork.util;

import com.onenetwork.model.ControlIdentifierSelector;
import com.onenetwork.model.custom_object.CustomObject;
import com.onenetwork.model.position.Position;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.lang.reflect.Field;
import java.util.Map;

@UtilityClass
public class PositionExtractor {

    private final String CLASS_NAME_POSITION = "Position";
    private final String CLASS_NAME_CUSTOM_OBJECT = "CustomObject";

    @SneakyThrows
    public Object getParsedValue(final Object object, final String line, final String type,
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
        if (!field.getName().equals("defaultControlIdentifier") && !field.getName().equals("messageType")) {
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
        //Field fieldPathToPackage = object.getClass().getDeclaredField("pathToPackage");
        fieldRefPosition.setAccessible(true);
        fieldObject.setAccessible(true);
        //fieldPathToPackage.setAccessible(true);

        Object fieldPosition = fieldRefPosition.get(object);
        generatePositionValue(line, fieldPosition);
        Field fieldValue = fieldPosition.getClass().getDeclaredField("value");
        fieldValue.setAccessible(true);
        String value = String.valueOf(fieldValue.get(fieldPosition));
        for (Object selectorObject : selectorObjectMap.values()) {
            if (selectorObject.getClass().getSimpleName().equals(value)) {
                fieldObject.set(object, selectorObject);
            }
        }
    }
}
