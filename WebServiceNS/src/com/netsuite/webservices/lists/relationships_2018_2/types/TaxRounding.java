
package com.netsuite.webservices.lists.relationships_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaxRounding的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TaxRounding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_roundDown"/>
 *     &lt;enumeration value="_roundOff"/>
 *     &lt;enumeration value="_roundUp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxRounding", namespace = "urn:types.relationships_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum TaxRounding {

    @XmlEnumValue("_roundDown")
    ROUND_DOWN("_roundDown"),
    @XmlEnumValue("_roundOff")
    ROUND_OFF("_roundOff"),
    @XmlEnumValue("_roundUp")
    ROUND_UP("_roundUp");
    private final String value;

    TaxRounding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxRounding fromValue(String v) {
        for (TaxRounding c: TaxRounding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
