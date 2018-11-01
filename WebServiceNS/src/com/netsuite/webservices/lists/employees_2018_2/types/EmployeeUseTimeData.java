
package com.netsuite.webservices.lists.employees_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EmployeeUseTimeData的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeUseTimeData">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_wage"/>
 *     &lt;enumeration value="_salary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmployeeUseTimeData", namespace = "urn:types.employees_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeUseTimeData {

    @XmlEnumValue("_wage")
    WAGE("_wage"),
    @XmlEnumValue("_salary")
    SALARY("_salary");
    private final String value;

    EmployeeUseTimeData(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeUseTimeData fromValue(String v) {
        for (EmployeeUseTimeData c: EmployeeUseTimeData.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
