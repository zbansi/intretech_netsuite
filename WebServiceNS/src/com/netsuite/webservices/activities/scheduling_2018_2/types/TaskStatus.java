
package com.netsuite.webservices.activities.scheduling_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaskStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TaskStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_completed"/>
 *     &lt;enumeration value="_inProgress"/>
 *     &lt;enumeration value="_notStarted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskStatus", namespace = "urn:types.scheduling_2018_2.activities.webservices.netsuite.com")
@XmlEnum
public enum TaskStatus {

    @XmlEnumValue("_completed")
    COMPLETED("_completed"),
    @XmlEnumValue("_inProgress")
    IN_PROGRESS("_inProgress"),
    @XmlEnumValue("_notStarted")
    NOT_STARTED("_notStarted");
    private final String value;

    TaskStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskStatus fromValue(String v) {
        for (TaskStatus c: TaskStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
