
package com.netsuite.webservices.transactions.purchases_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PurchaseOrderOrderStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PurchaseOrderOrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_closed"/>
 *     &lt;enumeration value="_fullyBilled"/>
 *     &lt;enumeration value="_partiallyReceived"/>
 *     &lt;enumeration value="_pendingBillingPartiallyReceived"/>
 *     &lt;enumeration value="_pendingBilling"/>
 *     &lt;enumeration value="_pendingReceipt"/>
 *     &lt;enumeration value="_pendingSupervisorApproval"/>
 *     &lt;enumeration value="_rejectedBySupervisor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurchaseOrderOrderStatus", namespace = "urn:types.purchases_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum PurchaseOrderOrderStatus {

    @XmlEnumValue("_closed")
    CLOSED("_closed"),
    @XmlEnumValue("_fullyBilled")
    FULLY_BILLED("_fullyBilled"),
    @XmlEnumValue("_partiallyReceived")
    PARTIALLY_RECEIVED("_partiallyReceived"),
    @XmlEnumValue("_pendingBillingPartiallyReceived")
    PENDING_BILLING_PARTIALLY_RECEIVED("_pendingBillingPartiallyReceived"),
    @XmlEnumValue("_pendingBilling")
    PENDING_BILLING("_pendingBilling"),
    @XmlEnumValue("_pendingReceipt")
    PENDING_RECEIPT("_pendingReceipt"),
    @XmlEnumValue("_pendingSupervisorApproval")
    PENDING_SUPERVISOR_APPROVAL("_pendingSupervisorApproval"),
    @XmlEnumValue("_rejectedBySupervisor")
    REJECTED_BY_SUPERVISOR("_rejectedBySupervisor");
    private final String value;

    PurchaseOrderOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseOrderOrderStatus fromValue(String v) {
        for (PurchaseOrderOrderStatus c: PurchaseOrderOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
