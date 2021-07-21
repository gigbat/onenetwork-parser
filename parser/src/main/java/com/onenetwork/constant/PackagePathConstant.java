package com.onenetwork.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PackagePathConstant {
    WEBSERVICE("com.onenetwork.webservice"),
    RESPONSE("com.onenetwork.response"),
    MODEL("com.onenetwork.model");
    /*AEAX("com.onenetwork.model.ae_ax"),
    CW02("com.onenetwork.model.ae_ax.cw"),
    E0("com.onenetwork.model.ae_ax.e0"),
    E0_REFERENCE("com.onenetwork.model.ae_ax.e0.reference"),
    E1("com.onenetwork.model.ae_ax.e1"),
    NUMBERS("com.onenetwork.model.ae_ax.numbers"),
    OI("com.onenetwork.model.ae_ax.oi"),
    SE("com.onenetwork.model.ae_ax.se"),
    CUSTOM_OBJECT("com.onenetwork.model.custom_object"),
    ENTRY_MODEL("com.onenetwork.model.entry_model"),
    ISF_MODEL("com.onenetwork.model.isf_model"),
    NR("com.onenetwork.model.nr"),
    POSITION("com.onenetwork.model.position"),*/

    private final String path;
}
