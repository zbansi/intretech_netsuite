
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransactionPaymentEventType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionPaymentEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_authorizationRequest"/>
 *     &lt;enumeration value="_captureRequest"/>
 *     &lt;enumeration value="_creditRequest"/>
 *     &lt;enumeration value="_overrideHold"/>
 *     &lt;enumeration value="_refreshRequest"/>
 *     &lt;enumeration value="_refundRequest"/>
 *     &lt;enumeration value="_saleRequest"/>
 *     &lt;enumeration value="_voidRequest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionPaymentEventType", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionPaymentEventType {

    @XmlEnumValue("_authorizationRequest")
    AUTHORIZATION_REQUEST("_authorizationRequest"),
    @XmlEnumValue("_captureRequest")
    CAPTURE_REQUEST("_captureRequest"),
    @XmlEnumValue("_creditRequest")
    CREDIT_REQUEST("_creditRequest"),
    @XmlEnumValue("_overrideHold")
    OVERRIDE_HOLD("_overrideHold"),
    @XmlEnumValue("_refreshRequest")
    REFRESH_REQUEST("_refreshRequest"),
    @XmlEnumValue("_refundRequest")
    REFUND_REQUEST("_refundRequest"),
    @XmlEnumValue("_saleRequest")
    SALE_REQUEST("_saleRequest"),
    @XmlEnumValue("_voidRequest")
    VOID_REQUEST("_voidRequest");
    private final String value;

    TransactionPaymentEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionPaymentEventType fromValue(String v) {
        for (TransactionPaymentEventType c: TransactionPaymentEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
