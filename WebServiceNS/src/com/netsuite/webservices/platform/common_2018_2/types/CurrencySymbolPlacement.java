
package com.netsuite.webservices.platform.common_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CurrencySymbolPlacement的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencySymbolPlacement">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_afterNumber"/>
 *     &lt;enumeration value="_beforeNumber"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencySymbolPlacement", namespace = "urn:types.common_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum CurrencySymbolPlacement {

    @XmlEnumValue("_afterNumber")
    AFTER_NUMBER("_afterNumber"),
    @XmlEnumValue("_beforeNumber")
    BEFORE_NUMBER("_beforeNumber");
    private final String value;

    CurrencySymbolPlacement(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencySymbolPlacement fromValue(String v) {
        for (CurrencySymbolPlacement c: CurrencySymbolPlacement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
