
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BillingScheduleYearDowim�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="BillingScheduleYearDowim">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_first"/>
 *     &lt;enumeration value="_second"/>
 *     &lt;enumeration value="_third"/>
 *     &lt;enumeration value="_fourth"/>
 *     &lt;enumeration value="_last"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingScheduleYearDowim", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum BillingScheduleYearDowim {

    @XmlEnumValue("_first")
    FIRST("_first"),
    @XmlEnumValue("_second")
    SECOND("_second"),
    @XmlEnumValue("_third")
    THIRD("_third"),
    @XmlEnumValue("_fourth")
    FOURTH("_fourth"),
    @XmlEnumValue("_last")
    LAST("_last");
    private final String value;

    BillingScheduleYearDowim(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingScheduleYearDowim fromValue(String v) {
        for (BillingScheduleYearDowim c: BillingScheduleYearDowim.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
