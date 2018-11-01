
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemCostAccountingStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemCostAccountingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_complete"/>
 *     &lt;enumeration value="_failed"/>
 *     &lt;enumeration value="_pending"/>
 *     &lt;enumeration value="_processing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemCostAccountingStatus", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemCostAccountingStatus {

    @XmlEnumValue("_complete")
    COMPLETE("_complete"),
    @XmlEnumValue("_failed")
    FAILED("_failed"),
    @XmlEnumValue("_pending")
    PENDING("_pending"),
    @XmlEnumValue("_processing")
    PROCESSING("_processing");
    private final String value;

    ItemCostAccountingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCostAccountingStatus fromValue(String v) {
        for (ItemCostAccountingStatus c: ItemCostAccountingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
