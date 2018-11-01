
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FairValuePriceFairValueRangePolicy的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FairValuePriceFairValueRangePolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_boundary"/>
 *     &lt;enumeration value="_fairValue"/>
 *     &lt;enumeration value="_high"/>
 *     &lt;enumeration value="_low"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FairValuePriceFairValueRangePolicy", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum FairValuePriceFairValueRangePolicy {

    @XmlEnumValue("_boundary")
    BOUNDARY("_boundary"),
    @XmlEnumValue("_fairValue")
    FAIR_VALUE("_fairValue"),
    @XmlEnumValue("_high")
    HIGH("_high"),
    @XmlEnumValue("_low")
    LOW("_low");
    private final String value;

    FairValuePriceFairValueRangePolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FairValuePriceFairValueRangePolicy fromValue(String v) {
        for (FairValuePriceFairValueRangePolicy c: FairValuePriceFairValueRangePolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
