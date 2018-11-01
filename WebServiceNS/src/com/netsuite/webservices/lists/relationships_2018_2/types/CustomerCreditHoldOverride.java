
package com.netsuite.webservices.lists.relationships_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerCreditHoldOverride的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerCreditHoldOverride">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_auto"/>
 *     &lt;enumeration value="_on"/>
 *     &lt;enumeration value="_off"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerCreditHoldOverride", namespace = "urn:types.relationships_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CustomerCreditHoldOverride {

    @XmlEnumValue("_auto")
    AUTO("_auto"),
    @XmlEnumValue("_on")
    ON("_on"),
    @XmlEnumValue("_off")
    OFF("_off");
    private final String value;

    CustomerCreditHoldOverride(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerCreditHoldOverride fromValue(String v) {
        for (CustomerCreditHoldOverride c: CustomerCreditHoldOverride.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
