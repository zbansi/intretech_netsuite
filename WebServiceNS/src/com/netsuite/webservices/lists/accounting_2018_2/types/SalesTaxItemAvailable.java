
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SalesTaxItemAvailable的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SalesTaxItemAvailable">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_both"/>
 *     &lt;enumeration value="_purchase"/>
 *     &lt;enumeration value="_sale"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SalesTaxItemAvailable", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum SalesTaxItemAvailable {

    @XmlEnumValue("_both")
    BOTH("_both"),
    @XmlEnumValue("_purchase")
    PURCHASE("_purchase"),
    @XmlEnumValue("_sale")
    SALE("_sale");
    private final String value;

    SalesTaxItemAvailable(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalesTaxItemAvailable fromValue(String v) {
        for (SalesTaxItemAvailable c: SalesTaxItemAvailable.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
