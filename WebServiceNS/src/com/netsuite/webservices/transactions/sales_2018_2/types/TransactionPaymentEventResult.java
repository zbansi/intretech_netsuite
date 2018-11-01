
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransactionPaymentEventResult的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionPaymentEventResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_accept"/>
 *     &lt;enumeration value="_holdOverride"/>
 *     &lt;enumeration value="_paymentHold"/>
 *     &lt;enumeration value="_pending"/>
 *     &lt;enumeration value="_reject"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionPaymentEventResult", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionPaymentEventResult {

    @XmlEnumValue("_accept")
    ACCEPT("_accept"),
    @XmlEnumValue("_holdOverride")
    HOLD_OVERRIDE("_holdOverride"),
    @XmlEnumValue("_paymentHold")
    PAYMENT_HOLD("_paymentHold"),
    @XmlEnumValue("_pending")
    PENDING("_pending"),
    @XmlEnumValue("_reject")
    REJECT("_reject");
    private final String value;

    TransactionPaymentEventResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionPaymentEventResult fromValue(String v) {
        for (TransactionPaymentEventResult c: TransactionPaymentEventResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
