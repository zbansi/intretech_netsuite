
package com.netsuite.webservices.platform.common_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShippingCarrier的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingCarrier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_fedexUspsMore"/>
 *     &lt;enumeration value="_ups"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingCarrier", namespace = "urn:types.common_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum ShippingCarrier {

    @XmlEnumValue("_fedexUspsMore")
    FEDEX_USPS_MORE("_fedexUspsMore"),
    @XmlEnumValue("_ups")
    UPS("_ups");
    private final String value;

    ShippingCarrier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingCarrier fromValue(String v) {
        for (ShippingCarrier c: ShippingCarrier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
