
package com.netsuite.webservices.lists.supplychain_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ManufacturingLagType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ManufacturingLagType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_quantity"/>
 *     &lt;enumeration value="_quantityPercentage"/>
 *     &lt;enumeration value="_time"/>
 *     &lt;enumeration value="_timePercentage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManufacturingLagType", namespace = "urn:types.supplychain_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ManufacturingLagType {

    @XmlEnumValue("_quantity")
    QUANTITY("_quantity"),
    @XmlEnumValue("_quantityPercentage")
    QUANTITY_PERCENTAGE("_quantityPercentage"),
    @XmlEnumValue("_time")
    TIME("_time"),
    @XmlEnumValue("_timePercentage")
    TIME_PERCENTAGE("_timePercentage");
    private final String value;

    ManufacturingLagType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManufacturingLagType fromValue(String v) {
        for (ManufacturingLagType c: ManufacturingLagType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
