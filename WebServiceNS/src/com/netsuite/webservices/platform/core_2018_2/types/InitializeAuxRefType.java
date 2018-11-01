
package com.netsuite.webservices.platform.core_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InitializeAuxRefType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="InitializeAuxRefType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="shippingGroup"/>
 *     &lt;enumeration value="arAccount"/>
 *     &lt;enumeration value="apAccount"/>
 *     &lt;enumeration value="itemFulfillment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InitializeAuxRefType", namespace = "urn:types.core_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum InitializeAuxRefType {

    @XmlEnumValue("shippingGroup")
    SHIPPING_GROUP("shippingGroup"),
    @XmlEnumValue("arAccount")
    AR_ACCOUNT("arAccount"),
    @XmlEnumValue("apAccount")
    AP_ACCOUNT("apAccount"),
    @XmlEnumValue("itemFulfillment")
    ITEM_FULFILLMENT("itemFulfillment");
    private final String value;

    InitializeAuxRefType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InitializeAuxRefType fromValue(String v) {
        for (InitializeAuxRefType c: InitializeAuxRefType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
