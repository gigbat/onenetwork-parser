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
    E1("com.onenetwork.model.ae_ax.e1"),
    NUMBERS("com.onenetwork.model.ae_ax.numbers"),
    OI("com.onenetwork.model.ae_ax.oi"),
    SE("com.onenetwork.model.ae_ax.se"),
    AEAX("com.onenetwork.model.ae_ax");

    private final String path;
}
