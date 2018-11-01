
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InventoryItemFraudRisk的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryItemFraudRisk">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_high"/>
 *     &lt;enumeration value="_low"/>
 *     &lt;enumeration value="_medium"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InventoryItemFraudRisk", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum InventoryItemFraudRisk {

    @XmlEnumValue("_high")
    HIGH("_high"),
    @XmlEnumValue("_low")
    LOW("_low"),
    @XmlEnumValue("_medium")
    MEDIUM("_medium");
    private final String value;

    InventoryItemFraudRisk(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryItemFraudRisk fromValue(String v) {
        for (InventoryItemFraudRisk c: InventoryItemFraudRisk.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
