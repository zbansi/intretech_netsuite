
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemSupplyReplenishmentMethod的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSupplyReplenishmentMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_reorderPoint"/>
 *     &lt;enumeration value="_timePhased"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemSupplyReplenishmentMethod", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemSupplyReplenishmentMethod {

    @XmlEnumValue("_reorderPoint")
    REORDER_POINT("_reorderPoint"),
    @XmlEnumValue("_timePhased")
    TIME_PHASED("_timePhased");
    private final String value;

    ItemSupplyReplenishmentMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSupplyReplenishmentMethod fromValue(String v) {
        for (ItemSupplyReplenishmentMethod c: ItemSupplyReplenishmentMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
