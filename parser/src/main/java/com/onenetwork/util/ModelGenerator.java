package com.onenetwork.util;

import com.onenetwork.model.DefaultFieldStorage;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import javax.xml.bind.annotation.XmlElement;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import static com.onenetwork.constant.FieldNameConstant.DEFAULT_FIELD_CONTROL_IDENTIFIER;
import static com.onenetwork.constant.FieldNameConstant.DEFAULT_FIELD_END_POSITION_CONTROL_IDENTIFIER;
import static com.onenetwork.constant.FieldNameConstant.DEFAULT_FIELD_MESSAGE_TYPE;

@UtilityClass
public class ModelGenerator {

    @SneakyThrows
    public Map<DefaultFieldStorage, Object> generateModels(final Object globalObject) {
        Class<?> globalClass = globalObject.getClass();
        Map<DefaultFieldStorage, Object> globalObjectsMap = new HashMap<>();

        try {
            Field fieldDefaultControlIdentifier = globalClass.getDeclaredField(DEFAULT_FIELD_CONTROL_IDENTIFIER);
            Field fieldMessageType = globalClass.getDeclaredField(DEFAULT_FIELD_MESSAGE_TYPE);
            Field fieldEndPositionControlIdentifier =
                    globalClass.getDeclaredField(DEFAULT_FIELD_END_POSITION_CONTROL_IDENTIFIER);

            setDefaultValue(fieldEndPositionControlIdentifier, fieldDefaultControlIdentifier,
                    fieldMessageType, globalObject);

            String controlIdentifier = String.valueOf(fieldDefaultControlIdentifier.get(globalObject));
            String messageType = String.valueOf(fieldMessageType.get(globalObject));
            Integer endPosition = Integer.parseInt(String.valueOf(fieldEndPositionControlIdentifier.get(globalObject)));
            DefaultFieldStorage storage = new DefaultFieldStorage(messageType, controlIdentifier, endPosition);

            globalObjectsMap.put(storage, globalObject);
            return globalObjectsMap;
        } catch (Exception e) {
            generateModelsInsideGlobalClass(globalClass, globalObject, globalObjectsMap);
        }
        return globalObjectsMap;
    }

    @SneakyThrows
    private void setDefaultValue(final Field fieldDefaultEndPositionControlIdentifier,
                                 final Field fieldDefaultControlIdentifier,
                                 final Field fieldMessageType,
                                 final Object globalObject) {
        Integer endPosition = Integer.parseInt(fieldDefaultEndPositionControlIdentifier.getAnnotation(XmlElement.class)
                .defaultValue());
        String controlIdentifier = fieldDefaultControlIdentifier.getAnnotation(XmlElement.class).defaultValue();
        String messageType = fieldMessageType.getAnnotation(XmlElement.class).defaultValue();

        fieldDefaultEndPositionControlIdentifier.setAccessible(true);
        fieldDefaultControlIdentifier.setAccessible(true);
        fieldMessageType.setAccessible(true);

        fieldDefaultEndPositionControlIdentifier.set(globalObject, endPosition);
        fieldDefaultControlIdentifier.set(globalObject, controlIdentifier);
        fieldMessageType.set(globalObject, messageType);
    }

    @SneakyThrows
    private void generateModelsInsideGlobalClass(final Class<?> globalClass,
                                                 final Object globalObject,
                                                 final Map<DefaultFieldStorage, Object> globalObjectsMap) {
        Field[] declaredFields = globalClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object fieldObject = declaredField.get(globalObject);
            globalObjectsMap.putAll(generateModels(fieldObject));
        }
    }
}
