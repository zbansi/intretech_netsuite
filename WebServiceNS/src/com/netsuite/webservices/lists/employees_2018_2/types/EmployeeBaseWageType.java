
package com.netsuite.webservices.lists.employees_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EmployeeBaseWageType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeBaseWageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_annualSalary"/>
 *     &lt;enumeration value="_hourly"/>
 *     &lt;enumeration value="_monthlySalary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmployeeBaseWageType", namespace = "urn:types.employees_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeBaseWageType {

    @XmlEnumValue("_annualSalary")
    ANNUAL_SALARY("_annualSalary"),
    @XmlEnumValue("_hourly")
    HOURLY("_hourly"),
    @XmlEnumValue("_monthlySalary")
    MONTHLY_SALARY("_monthlySalary");
    private final String value;

    EmployeeBaseWageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeBaseWageType fromValue(String v) {
        for (EmployeeBaseWageType c: EmployeeBaseWageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
