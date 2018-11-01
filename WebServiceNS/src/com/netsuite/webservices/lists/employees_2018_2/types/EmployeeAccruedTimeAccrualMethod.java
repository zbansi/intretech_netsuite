
package com.netsuite.webservices.lists.employees_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EmployeeAccruedTimeAccrualMethod�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeAccruedTimeAccrualMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_lumpSums"/>
 *     &lt;enumeration value="_perHourWorked"/>
 *     &lt;enumeration value="_perPayPeriod"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmployeeAccruedTimeAccrualMethod", namespace = "urn:types.employees_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeAccruedTimeAccrualMethod {

    @XmlEnumValue("_lumpSums")
    LUMP_SUMS("_lumpSums"),
    @XmlEnumValue("_perHourWorked")
    PER_HOUR_WORKED("_perHourWorked"),
    @XmlEnumValue("_perPayPeriod")
    PER_PAY_PERIOD("_perPayPeriod");
    private final String value;

    EmployeeAccruedTimeAccrualMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeAccruedTimeAccrualMethod fromValue(String v) {
        for (EmployeeAccruedTimeAccrualMethod c: EmployeeAccruedTimeAccrualMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
