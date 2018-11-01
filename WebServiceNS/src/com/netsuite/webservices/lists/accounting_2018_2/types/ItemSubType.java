
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemSubType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSubType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_forPurchase"/>
 *     &lt;enumeration value="_forResale"/>
 *     &lt;enumeration value="_forSale"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemSubType", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemSubType {

    @XmlEnumValue("_forPurchase")
    FOR_PURCHASE("_forPurchase"),
    @XmlEnumValue("_forResale")
    FOR_RESALE("_forResale"),
    @XmlEnumValue("_forSale")
    FOR_SALE("_forSale");
    private final String value;

    ItemSubType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSubType fromValue(String v) {
        for (ItemSubType c: ItemSubType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
