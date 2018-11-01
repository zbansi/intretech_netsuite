
package com.netsuite.webservices.platform.common_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LandedCostSource的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LandedCostSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_manual"/>
 *     &lt;enumeration value="_otherTransaction"/>
 *     &lt;enumeration value="_otherTransactionExcludeTax"/>
 *     &lt;enumeration value="_thisTransaction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LandedCostSource", namespace = "urn:types.common_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum LandedCostSource {

    @XmlEnumValue("_manual")
    MANUAL("_manual"),
    @XmlEnumValue("_otherTransaction")
    OTHER_TRANSACTION("_otherTransaction"),
    @XmlEnumValue("_otherTransactionExcludeTax")
    OTHER_TRANSACTION_EXCLUDE_TAX("_otherTransactionExcludeTax"),
    @XmlEnumValue("_thisTransaction")
    THIS_TRANSACTION("_thisTransaction");
    private final String value;

    LandedCostSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LandedCostSource fromValue(String v) {
        for (LandedCostSource c: LandedCostSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
