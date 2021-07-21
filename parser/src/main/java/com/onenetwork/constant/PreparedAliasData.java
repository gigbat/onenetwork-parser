package com.onenetwork.constant;

import com.onenetwork.model.ae_ax.AEAX;
import com.onenetwork.model.nr.NRGlobal;
import com.onenetwork.model.sa.SAGlobal;
import com.onenetwork.model.sn_us_isf10.SNUSISF10Global;
import com.onenetwork.model.so.SOGlobal;
import com.onenetwork.model.sx.SXGlobal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PreparedAliasData {

    private static final Map<String, Class<?>> SERVICE_GLOBAL_DATA = new HashMap<>(6);

    static {
        SERVICE_GLOBAL_DATA.put("ae-ax.xml", AEAX.class);
        SERVICE_GLOBAL_DATA.put("nr.xml", NRGlobal.class);
        SERVICE_GLOBAL_DATA.put("sa.xml", SAGlobal.class);
        SERVICE_GLOBAL_DATA.put("sn_us_isf10.xml", SNUSISF10Global.class);
        SERVICE_GLOBAL_DATA.put("so.xml", SOGlobal.class);
        SERVICE_GLOBAL_DATA.put("sx.xml", SXGlobal.class);
    }

    public static final Map<String, Class<?>> GLOBAL_DATA = Collections.unmodifiableMap(SERVICE_GLOBAL_DATA);
}
