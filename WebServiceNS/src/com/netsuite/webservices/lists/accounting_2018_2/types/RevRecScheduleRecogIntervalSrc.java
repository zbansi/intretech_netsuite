
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RevRecScheduleRecogIntervalSrc的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RevRecScheduleRecogIntervalSrc">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_revRecDatesSpecifiedOnTransaction"/>
 *     &lt;enumeration value="_billingScheduleTranDateOnSalesOrder"/>
 *     &lt;enumeration value="_billingScheduleRevRecDateOnSalesOrder"/>
 *     &lt;enumeration value="_revRecDatesSpecifiedOnSalesOrder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RevRecScheduleRecogIntervalSrc", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum RevRecScheduleRecogIntervalSrc {

    @XmlEnumValue("_revRecDatesSpecifiedOnTransaction")
    REV_REC_DATES_SPECIFIED_ON_TRANSACTION("_revRecDatesSpecifiedOnTransaction"),
    @XmlEnumValue("_billingScheduleTranDateOnSalesOrder")
    BILLING_SCHEDULE_TRAN_DATE_ON_SALES_ORDER("_billingScheduleTranDateOnSalesOrder"),
    @XmlEnumValue("_billingScheduleRevRecDateOnSalesOrder")
    BILLING_SCHEDULE_REV_REC_DATE_ON_SALES_ORDER("_billingScheduleRevRecDateOnSalesOrder"),
    @XmlEnumValue("_revRecDatesSpecifiedOnSalesOrder")
    REV_REC_DATES_SPECIFIED_ON_SALES_ORDER("_revRecDatesSpecifiedOnSalesOrder");
    private final String value;

    RevRecScheduleRecogIntervalSrc(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RevRecScheduleRecogIntervalSrc fromValue(String v) {
        for (RevRecScheduleRecogIntervalSrc c: RevRecScheduleRecogIntervalSrc.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
