
package com.netsuite.webservices.transactions.inventory_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WorkOrderSchedulingMethod�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="WorkOrderSchedulingMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_backward"/>
 *     &lt;enumeration value="_forward"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkOrderSchedulingMethod", namespace = "urn:types.inventory_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum WorkOrderSchedulingMethod {

    @XmlEnumValue("_backward")
    BACKWARD("_backward"),
    @XmlEnumValue("_forward")
    FORWARD("_forward");
    private final String value;

    WorkOrderSchedulingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkOrderSchedulingMethod fromValue(String v) {
        for (WorkOrderSchedulingMethod c: WorkOrderSchedulingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
