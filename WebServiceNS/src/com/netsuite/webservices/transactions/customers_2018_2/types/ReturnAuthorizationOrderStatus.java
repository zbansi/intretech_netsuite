
package com.netsuite.webservices.transactions.customers_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReturnAuthorizationOrderStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnAuthorizationOrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_pendingApproval"/>
 *     &lt;enumeration value="_pendingReceipt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReturnAuthorizationOrderStatus", namespace = "urn:types.customers_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ReturnAuthorizationOrderStatus {

    @XmlEnumValue("_pendingApproval")
    PENDING_APPROVAL("_pendingApproval"),
    @XmlEnumValue("_pendingReceipt")
    PENDING_RECEIPT("_pendingReceipt");
    private final String value;

    ReturnAuthorizationOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnAuthorizationOrderStatus fromValue(String v) {
        for (ReturnAuthorizationOrderStatus c: ReturnAuthorizationOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
