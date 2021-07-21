package com.onenetwork.util;

import com.google.gson.Gson;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SerialUtils {
    public String serializeObject(Object o) {
        Gson gson = new Gson();
        return gson.toJson(o);
    }

    public static Object unserializeObject(String s, Object o) {
        Gson gson = new Gson();
        return gson.fromJson(s, o.getClass());
    }

    public static Object cloneObject(Object o) {
        String s = serializeObject(o);
        return unserializeObject(s, o);
    }
}