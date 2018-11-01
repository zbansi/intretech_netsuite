
package com.netsuite.webservices.transactions.employees_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TimeBillTimeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TimeBillTimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_actualTime"/>
 *     &lt;enumeration value="_allocatedTime"/>
 *     &lt;enumeration value="_plannedTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeBillTimeType", namespace = "urn:types.employees_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TimeBillTimeType {

    @XmlEnumValue("_actualTime")
    ACTUAL_TIME("_actualTime"),
    @XmlEnumValue("_allocatedTime")
    ALLOCATED_TIME("_allocatedTime"),
    @XmlEnumValue("_plannedTime")
    PLANNED_TIME("_plannedTime");
    private final String value;

    TimeBillTimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeBillTimeType fromValue(String v) {
        for (TimeBillTimeType c: TimeBillTimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
