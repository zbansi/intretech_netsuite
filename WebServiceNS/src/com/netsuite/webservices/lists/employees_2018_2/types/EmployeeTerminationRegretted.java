
package com.netsuite.webservices.lists.employees_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EmployeeTerminationRegretted的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeTerminationRegretted">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_no"/>
 *     &lt;enumeration value="_unspecified"/>
 *     &lt;enumeration value="_yes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmployeeTerminationRegretted", namespace = "urn:types.employees_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeTerminationRegretted {

    @XmlEnumValue("_no")
    NO("_no"),
    @XmlEnumValue("_unspecified")
    UNSPECIFIED("_unspecified"),
    @XmlEnumValue("_yes")
    YES("_yes");
    private final String value;

    EmployeeTerminationRegretted(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeTerminationRegretted fromValue(String v) {
        for (EmployeeTerminationRegretted c: EmployeeTerminationRegretted.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
