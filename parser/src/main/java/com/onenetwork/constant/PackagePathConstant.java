package com.onenetwork.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PackagePathConstant {
    WEBSERVICE("com.onenetwork.webservice"),
    RESPONSE("com.onenetwork.response"),
    CW02("com.onenetwork.model.ae_ax.cw"),
    E0("com.onenetwork.model.ae_ax.e0"),
    E0_REFERENCE("com.onenetwork.model.ae_ax.e0.reference"),
    E1("com.onenetwork.model.ae_ax.e1"),
    NUMBERS("com.onenetwork.model.ae_ax.numbers"),
    OI("com.onenetwork.model.ae_ax.oi"),
    SE("com.onenetwork.model.ae_ax.se"),
    AEAX("com.onenetwork.model.ae_ax"),
    CUSTOM_OBJECT("com.onenetwork.model.custom_object"),
    ENTRY_MODEL("com.onenetwork.model.entry_model"),
    ISF_MODEL("com.onenetwork.model.isf_model"),
    NR("com.onenetwork.model.nr"),
    POSITION("com.onenetwork.model.position"),
    SA("com.onenetwork.model.sa"),
    SN_US_ISF10("com.onenetwork.model.sn_us_isf10"),
    SO("com.onenetwork.model.so"),
    SX_SE("com.onenetwork.model.sx.se"),
    SX_SF("com.onenetwork.model.sx.sf"),
    SX("com.onenetwork.model.sx");

    private final String path;
}
