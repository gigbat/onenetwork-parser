package com.onenetwork.constant;

import com.onenetwork.model.SimpleControlIdentifier;
import com.onenetwork.model.entry_model.EntryModel;
import com.onenetwork.model.isf_model.ISFModel;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import static com.onenetwork.constant.TypeConstant.TYPE_ENTRY_VALIDATE;
import static com.onenetwork.constant.TypeConstant.TYPE_ISF_VALIDATE;

public class PreparedSimpleRecordDataElement {

    private static final Map<String, BiFunction<SimpleControlIdentifier, String, Object>>
            SERVICE_SIMPLE_RECORD_DATA_ELEMENT = new HashMap<>(2);

    static {
        SERVICE_SIMPLE_RECORD_DATA_ELEMENT.put(TYPE_ISF_VALIDATE, (s, m) -> {
            ISFModel isfModel = new ISFModel();
            isfModel.setSymbol(s.getSymbol());
            isfModel.setSymbolDescription(s.getDescription());
            isfModel.setMessageDescription(m);
            return isfModel;
        });
        SERVICE_SIMPLE_RECORD_DATA_ELEMENT.put(TYPE_ENTRY_VALIDATE, (s, m) -> {
            EntryModel entryModel = new EntryModel();
            entryModel.setSymbol(s.getSymbol());
            entryModel.setSymbolDescription(s.getDescription());
            entryModel.setMessageDescription(m);
            return entryModel;
        });
    }

    public static final Map<String, BiFunction<SimpleControlIdentifier, String, Object>> SIMPLE_RECORD_DATA_ELEMENT =
            Collections.unmodifiableMap(SERVICE_SIMPLE_RECORD_DATA_ELEMENT);
}
