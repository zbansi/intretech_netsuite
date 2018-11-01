
package com.netsuite.webservices.activities.scheduling_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResourceAllocationApprovalStatus�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceAllocationApprovalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_approved"/>
 *     &lt;enumeration value="_pendingApproval"/>
 *     &lt;enumeration value="_rejected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceAllocationApprovalStatus", namespace = "urn:types.scheduling_2018_2.activities.webservices.netsuite.com")
@XmlEnum
public enum ResourceAllocationApprovalStatus {

    @XmlEnumValue("_approved")
    APPROVED("_approved"),
    @XmlEnumValue("_pendingApproval")
    PENDING_APPROVAL("_pendingApproval"),
    @XmlEnumValue("_rejected")
    REJECTED("_rejected");
    private final String value;

    ResourceAllocationApprovalStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceAllocationApprovalStatus fromValue(String v) {
        for (ResourceAllocationApprovalStatus c: ResourceAllocationApprovalStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
