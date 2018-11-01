
package com.netsuite.webservices.transactions.inventory_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WorkOrderOrderStatus�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="WorkOrderOrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_built"/>
 *     &lt;enumeration value="_cancelled"/>
 *     &lt;enumeration value="_closed"/>
 *     &lt;enumeration value="_inProcess"/>
 *     &lt;enumeration value="_planned"/>
 *     &lt;enumeration value="_released"/>
 *     &lt;enumeration value="_undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkOrderOrderStatus", namespace = "urn:types.inventory_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum WorkOrderOrderStatus {

    @XmlEnumValue("_built")
    BUILT("_built"),
    @XmlEnumValue("_cancelled")
    CANCELLED("_cancelled"),
    @XmlEnumValue("_closed")
    CLOSED("_closed"),
    @XmlEnumValue("_inProcess")
    IN_PROCESS("_inProcess"),
    @XmlEnumValue("_planned")
    PLANNED("_planned"),
    @XmlEnumValue("_released")
    RELEASED("_released"),
    @XmlEnumValue("_undefined")
    UNDEFINED("_undefined");
    private final String value;

    WorkOrderOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkOrderOrderStatus fromValue(String v) {
        for (WorkOrderOrderStatus c: WorkOrderOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
