
package com.netsuite.webservices.lists.supplychain_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ManufacturingOperationTaskStatus�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ManufacturingOperationTaskStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_completed"/>
 *     &lt;enumeration value="_inProgress"/>
 *     &lt;enumeration value="_notStarted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManufacturingOperationTaskStatus", namespace = "urn:types.supplychain_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ManufacturingOperationTaskStatus {

    @XmlEnumValue("_completed")
    COMPLETED("_completed"),
    @XmlEnumValue("_inProgress")
    IN_PROGRESS("_inProgress"),
    @XmlEnumValue("_notStarted")
    NOT_STARTED("_notStarted");
    private final String value;

    ManufacturingOperationTaskStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManufacturingOperationTaskStatus fromValue(String v) {
        for (ManufacturingOperationTaskStatus c: ManufacturingOperationTaskStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
