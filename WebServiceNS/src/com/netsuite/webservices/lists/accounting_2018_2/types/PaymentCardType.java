
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaymentCardType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentCardType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_credit"/>
 *     &lt;enumeration value="_debit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentCardType", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PaymentCardType {

    @XmlEnumValue("_credit")
    CREDIT("_credit"),
    @XmlEnumValue("_debit")
    DEBIT("_debit");
    private final String value;

    PaymentCardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentCardType fromValue(String v) {
        for (PaymentCardType c: PaymentCardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
