//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 06:27:02 PM EEST 
//


package com.onenetwork.model.objectsfactory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagePathToObjectFactoryConstant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PackagePathToObjectFactoryConstant"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="com.onenetwork.webservice"/&gt;
 *     &lt;enumeration value="com.onenetwork.response"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.ae_ax.cw"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.ae_ax.e0"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.ae_ax.e0.reference"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.ae_ax.e1"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.ae_ax.numbers"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.ae_ax.oi"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.ae_ax.se"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.ae_ax"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.nr"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.so"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.custom_object"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.entry_model"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.isf_model"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.position"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.sa"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.sn_us_isf10"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.sx.se"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.sx.sf"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.sx"/&gt;
 *     &lt;enumeration value="com.onenetwork.model.objectsfactory"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PackagePathToObjectFactoryConstant", namespace = "http://www.model.onenetwork.com/objectsFactory")
@XmlEnum
public enum PackagePathToObjectFactoryConstant {

    @XmlEnumValue("com.onenetwork.webservice")
    COM_ONENETWORK_WEBSERVICE("com.onenetwork.webservice"),
    @XmlEnumValue("com.onenetwork.response")
    COM_ONENETWORK_RESPONSE("com.onenetwork.response"),
    @XmlEnumValue("com.onenetwork.model.ae_ax.cw")
    COM_ONENETWORK_MODEL_AE_AX_CW("com.onenetwork.model.ae_ax.cw"),
    @XmlEnumValue("com.onenetwork.model.ae_ax.e0")
    COM_ONENETWORK_MODEL_AE_AX_E_0("com.onenetwork.model.ae_ax.e0"),
    @XmlEnumValue("com.onenetwork.model.ae_ax.e0.reference")
    COM_ONENETWORK_MODEL_AE_AX_E_0_REFERENCE("com.onenetwork.model.ae_ax.e0.reference"),
    @XmlEnumValue("com.onenetwork.model.ae_ax.e1")
    COM_ONENETWORK_MODEL_AE_AX_E_1("com.onenetwork.model.ae_ax.e1"),
    @XmlEnumValue("com.onenetwork.model.ae_ax.numbers")
    COM_ONENETWORK_MODEL_AE_AX_NUMBERS("com.onenetwork.model.ae_ax.numbers"),
    @XmlEnumValue("com.onenetwork.model.ae_ax.oi")
    COM_ONENETWORK_MODEL_AE_AX_OI("com.onenetwork.model.ae_ax.oi"),
    @XmlEnumValue("com.onenetwork.model.ae_ax.se")
    COM_ONENETWORK_MODEL_AE_AX_SE("com.onenetwork.model.ae_ax.se"),
    @XmlEnumValue("com.onenetwork.model.ae_ax")
    COM_ONENETWORK_MODEL_AE_AX("com.onenetwork.model.ae_ax"),
    @XmlEnumValue("com.onenetwork.model.nr")
    COM_ONENETWORK_MODEL_NR("com.onenetwork.model.nr"),
    @XmlEnumValue("com.onenetwork.model.so")
    COM_ONENETWORK_MODEL_SO("com.onenetwork.model.so"),
    @XmlEnumValue("com.onenetwork.model.custom_object")
    COM_ONENETWORK_MODEL_CUSTOM_OBJECT("com.onenetwork.model.custom_object"),
    @XmlEnumValue("com.onenetwork.model.entry_model")
    COM_ONENETWORK_MODEL_ENTRY_MODEL("com.onenetwork.model.entry_model"),
    @XmlEnumValue("com.onenetwork.model.isf_model")
    COM_ONENETWORK_MODEL_ISF_MODEL("com.onenetwork.model.isf_model"),
    @XmlEnumValue("com.onenetwork.model.position")
    COM_ONENETWORK_MODEL_POSITION("com.onenetwork.model.position"),
    @XmlEnumValue("com.onenetwork.model.sa")
    COM_ONENETWORK_MODEL_SA("com.onenetwork.model.sa"),
    @XmlEnumValue("com.onenetwork.model.sn_us_isf10")
    COM_ONENETWORK_MODEL_SN_US_ISF_10("com.onenetwork.model.sn_us_isf10"),
    @XmlEnumValue("com.onenetwork.model.sx.se")
    COM_ONENETWORK_MODEL_SX_SE("com.onenetwork.model.sx.se"),
    @XmlEnumValue("com.onenetwork.model.sx.sf")
    COM_ONENETWORK_MODEL_SX_SF("com.onenetwork.model.sx.sf"),
    @XmlEnumValue("com.onenetwork.model.sx")
    COM_ONENETWORK_MODEL_SX("com.onenetwork.model.sx"),
    @XmlEnumValue("com.onenetwork.model.objectsfactory")
    COM_ONENETWORK_MODEL_OBJECTSFACTORY("com.onenetwork.model.objectsfactory");
    private final String value;

    PackagePathToObjectFactoryConstant(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PackagePathToObjectFactoryConstant fromValue(String v) {
        for (PackagePathToObjectFactoryConstant c: PackagePathToObjectFactoryConstant.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
