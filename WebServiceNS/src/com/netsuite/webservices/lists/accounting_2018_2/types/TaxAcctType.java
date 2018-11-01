
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaxAcctType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TaxAcctType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_sale"/>
 *     &lt;enumeration value="_purchase"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxAcctType", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum TaxAcctType {

    @XmlEnumValue("_sale")
    SALE("_sale"),
    @XmlEnumValue("_purchase")
    PURCHASE("_purchase");
    private final String value;

    TaxAcctType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxAcctType fromValue(String v) {
        for (TaxAcctType c: TaxAcctType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
