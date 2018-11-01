
package com.netsuite.webservices.activities.scheduling_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResourceAllocationAllocationUnit�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceAllocationAllocationUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_hours"/>
 *     &lt;enumeration value="_percentOfTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceAllocationAllocationUnit", namespace = "urn:types.scheduling_2018_2.activities.webservices.netsuite.com")
@XmlEnum
public enum ResourceAllocationAllocationUnit {

    @XmlEnumValue("_hours")
    HOURS("_hours"),
    @XmlEnumValue("_percentOfTime")
    PERCENT_OF_TIME("_percentOfTime");
    private final String value;

    ResourceAllocationAllocationUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceAllocationAllocationUnit fromValue(String v) {
        for (ResourceAllocationAllocationUnit c: ResourceAllocationAllocationUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
