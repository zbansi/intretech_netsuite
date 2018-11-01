
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaymentInstrumentSupportedOperation的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentInstrumentSupportedOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_authorization"/>
 *     &lt;enumeration value="_capture"/>
 *     &lt;enumeration value="_sale"/>
 *     &lt;enumeration value="_credit"/>
 *     &lt;enumeration value="_refund"/>
 *     &lt;enumeration value="_override"/>
 *     &lt;enumeration value="_void"/>
 *     &lt;enumeration value="_refresh"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentInstrumentSupportedOperation", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PaymentInstrumentSupportedOperation {

    @XmlEnumValue("_authorization")
    AUTHORIZATION("_authorization"),
    @XmlEnumValue("_capture")
    CAPTURE("_capture"),
    @XmlEnumValue("_sale")
    SALE("_sale"),
    @XmlEnumValue("_credit")
    CREDIT("_credit"),
    @XmlEnumValue("_refund")
    REFUND("_refund"),
    @XmlEnumValue("_override")
    OVERRIDE("_override"),
    @XmlEnumValue("_void")
    VOID("_void"),
    @XmlEnumValue("_refresh")
    REFRESH("_refresh");
    private final String value;

    PaymentInstrumentSupportedOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentInstrumentSupportedOperation fromValue(String v) {
        for (PaymentInstrumentSupportedOperation c: PaymentInstrumentSupportedOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
