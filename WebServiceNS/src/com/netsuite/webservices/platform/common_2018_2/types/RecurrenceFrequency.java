
package com.netsuite.webservices.platform.common_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RecurrenceFrequency�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="RecurrenceFrequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_none"/>
 *     &lt;enumeration value="_day"/>
 *     &lt;enumeration value="_week"/>
 *     &lt;enumeration value="_month"/>
 *     &lt;enumeration value="_year"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecurrenceFrequency", namespace = "urn:types.common_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum RecurrenceFrequency {

    @XmlEnumValue("_none")
    NONE("_none"),
    @XmlEnumValue("_day")
    DAY("_day"),
    @XmlEnumValue("_week")
    WEEK("_week"),
    @XmlEnumValue("_month")
    MONTH("_month"),
    @XmlEnumValue("_year")
    YEAR("_year");
    private final String value;

    RecurrenceFrequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecurrenceFrequency fromValue(String v) {
        for (RecurrenceFrequency c: RecurrenceFrequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
