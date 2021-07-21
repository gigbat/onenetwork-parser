package com.onenetwork.util;

import com.onenetwork.model.DefaultFieldStorage;
import com.onenetwork.model.custom_object.CustomObject;
import com.onenetwork.model.position.Position;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

import static com.onenetwork.constant.DelimiterConstant.DELIMITER_EMPTY;
import static com.onenetwork.constant.FieldNameConstant.DEFAULT_FIELD_CONTROL_IDENTIFIER;
import static com.onenetwork.constant.FieldNameConstant.DEFAULT_FIELD_END_POSITION;
import static com.onenetwork.constant.FieldNameConstant.DEFAULT_FIELD_MESSAGE_TYPE;
import static com.onenetwork.constant.FieldNameConstant.DEFAULT_FIELD_OBJECT;
import static com.onenetwork.constant.FieldNameConstant.DEFAULT_FIELD_REF_POSITION;
import static com.onenetwork.constant.FieldNameConstant.DEFAULT_FIELD_START_POSITION;
import static com.onenetwork.constant.FieldNameConstant.DEFAULT_FIELD_VALUE;

@UtilityClass
public class FieldsGenerator {

    private final String CLASS_NAME_POSITION = "Position";
    private final String CLASS_NAME_CUSTOM_OBJECT = "CustomObject";

    @SneakyThrows
    public Object getParsedValue(final Object object, final String line, final String type,
                                 final Map<DefaultFieldStorage, Object> globalObjectsMap) {
        Class<?> clazz = object.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            generateFieldValue(line, declaredField, object, type, globalObjectsMap);
        }
        return object;
    }

    @SneakyThrows
    private void generateFieldValue(final String line, final Field field, final Object object, final String type,
                                    final Map<DefaultFieldStorage, Object> globalObjectsMap) {
        if (isNotDefaultField(field)) {
            Object fieldObject = field.get(object);
            if (fieldObject instanceof Position) {
                Object parsedValue = getParsedValue(fieldObject, line, CLASS_NAME_POSITION, globalObjectsMap);
                field.set(object, parsedValue);
            } else if (fieldObject instanceof CustomObject) {
                Object parsedValue = getParsedValue(fieldObject, line, CLASS_NAME_CUSTOM_OBJECT, globalObjectsMap);
                field.set(object, parsedValue);
            } else {
                generateFieldValueByClassType(line, object, type, globalObjectsMap);
            }
        }
    }

    private boolean isNotDefaultField(final Field field) {
        return !field.getName().equals(DEFAULT_FIELD_CONTROL_IDENTIFIER)
                && !field.getName().equals(DEFAULT_FIELD_MESSAGE_TYPE);
    }

    private void generateFieldValueByClassType(final String line, final Object object, final String type,
                                               final Map<DefaultFieldStorage, Object> globalObjectsMap) {
        if (type.equals(CLASS_NAME_POSITION)) {
            generatePositionValue(line, object);
        } else if (type.equals(CLASS_NAME_CUSTOM_OBJECT)) {
            generateCustomObjectValue(line, object, globalObjectsMap);
        }
    }

    @SneakyThrows
    private void generatePositionValue(final String line, final Object object) {
        Field fieldStartPosition = object.getClass().getDeclaredField(DEFAULT_FIELD_START_POSITION);
        Field fieldEndPosition = object.getClass().getDeclaredField(DEFAULT_FIELD_END_POSITION);
        Field fieldValue = object.getClass().getDeclaredField(DEFAULT_FIELD_VALUE);

        setFieldAccessible(fieldStartPosition, fieldEndPosition, fieldValue);

        int startPosition = fieldStartPosition.getInt(object) - 1;
        int endPosition = fieldEndPosition.getInt(object);
        String substring = line.substring(startPosition, endPosition);
        fieldValue.set(object, substring);
    }

    private void setFieldAccessible(final Field... fields) {
        Arrays.stream(fields).forEach(e -> e.setAccessible(true));
    }

    @SneakyThrows
    private void generateCustomObjectValue(final String line, final Object object,
                                           final Map<DefaultFieldStorage, Object> globalObjectsMap) {
        Field fieldPosition = object.getClass().getDeclaredField(DEFAULT_FIELD_REF_POSITION);
        Field fieldObject = object.getClass().getDeclaredField(DEFAULT_FIELD_OBJECT);

        setFieldAccessible(fieldPosition, fieldObject);

        Object objectPosition = fieldPosition.get(object);
        generatePositionValue(line, objectPosition);

        Field fieldValue = objectPosition.getClass().getDeclaredField(DEFAULT_FIELD_VALUE);
        setFieldAccessible(fieldValue);
        String value = String.valueOf(fieldValue.get(objectPosition));
        for (Object globalObject : globalObjectsMap.values()) {
            if (globalObject.getClass().getSimpleName().equals(value)) {
                fieldObject.set(object, getParsedValue(globalObject, line, DELIMITER_EMPTY, globalObjectsMap));
            }
        }
    }
}
