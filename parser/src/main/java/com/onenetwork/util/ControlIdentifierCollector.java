package com.onenetwork.util;

import com.onenetwork.model.ControlIdentifierSelector;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import javax.xml.bind.annotation.XmlElement;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@UtilityClass
public class ControlIdentifierCollector {
    @SneakyThrows
    public Map<ControlIdentifierSelector, Object> collect(final Object globalObject) {
        Class<?> globalClass = globalObject.getClass();
        Map<ControlIdentifierSelector, Object> controlIdentifierSelectorClassMap = new HashMap<>();
        Field fieldDefaultControlIdentifier;
        Field fieldMessageType;
        try {
            fieldDefaultControlIdentifier = globalClass.getDeclaredField("defaultControlIdentifier");
            fieldMessageType = globalClass.getDeclaredField("messageType");

            String defaultValue = fieldDefaultControlIdentifier.getAnnotation(XmlElement.class).defaultValue();
            String messageType = fieldMessageType.getAnnotation(XmlElement.class).defaultValue();
            validateDefaultValue(defaultValue, messageType);
            controlIdentifierSelectorClassMap.put(new ControlIdentifierSelector(messageType, defaultValue), globalObject);
            return controlIdentifierSelectorClassMap;
        } catch (Exception e) {
            Field[] declaredFields = globalClass.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                declaredField.setAccessible(true);
                Object fieldObject = declaredField.get(globalObject);
                controlIdentifierSelectorClassMap.putAll(collect(fieldObject));
            }
        }
        return controlIdentifierSelectorClassMap;
    }

    private void validateDefaultValue(final String defaultValue, final String messageType) {
        if ((defaultValue == null || defaultValue.isEmpty())
                || (messageType == null || messageType.isEmpty())) {
            throw new RuntimeException("Default value not found in the end class");
        }
    }
}
