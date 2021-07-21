package com.onenetwork.constant;

import com.onenetwork.model.ae_ax.AEAX;
import com.onenetwork.model.ae_ax.cw.CW02RecordDataElement;
import com.onenetwork.model.ae_ax.numbers.Numbers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PreparedAliasData {

    private static final Map<String, Class<?>> SERVICE_ALIAS_DATA = new HashMap<>();

    static {
        SERVICE_ALIAS_DATA.put("ae-ax.xml", AEAX.class);
    }

    public static final Map<String, Class<?>> ALIAS_DATA = Collections.unmodifiableMap(SERVICE_ALIAS_DATA);
}
