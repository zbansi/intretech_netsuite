
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BillingScheduleRecurrencePattern的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BillingScheduleRecurrencePattern">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_anniversaryBillDate"/>
 *     &lt;enumeration value="_fixedBillDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingScheduleRecurrencePattern", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum BillingScheduleRecurrencePattern {

    @XmlEnumValue("_anniversaryBillDate")
    ANNIVERSARY_BILL_DATE("_anniversaryBillDate"),
    @XmlEnumValue("_fixedBillDate")
    FIXED_BILL_DATE("_fixedBillDate");
    private final String value;

    BillingScheduleRecurrencePattern(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingScheduleRecurrencePattern fromValue(String v) {
        for (BillingScheduleRecurrencePattern c: BillingScheduleRecurrencePattern.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
