
package com.netsuite.webservices.lists.relationships_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BillingAccountFrequency�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="BillingAccountFrequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_annually"/>
 *     &lt;enumeration value="_custom"/>
 *     &lt;enumeration value="_daily"/>
 *     &lt;enumeration value="_endOfPeriod"/>
 *     &lt;enumeration value="_everyFourWeeks"/>
 *     &lt;enumeration value="_everyThreeYears"/>
 *     &lt;enumeration value="_everyTwoMonths"/>
 *     &lt;enumeration value="_everyTwoWeeks"/>
 *     &lt;enumeration value="_everyTwoYears"/>
 *     &lt;enumeration value="_hourly"/>
 *     &lt;enumeration value="_monthly"/>
 *     &lt;enumeration value="_never"/>
 *     &lt;enumeration value="_oneTime"/>
 *     &lt;enumeration value="_quarterly"/>
 *     &lt;enumeration value="_startOfPeriod"/>
 *     &lt;enumeration value="_twiceAMonth"/>
 *     &lt;enumeration value="_twiceAYear"/>
 *     &lt;enumeration value="_weekly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingAccountFrequency", namespace = "urn:types.relationships_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum BillingAccountFrequency {

    @XmlEnumValue("_annually")
    ANNUALLY("_annually"),
    @XmlEnumValue("_custom")
    CUSTOM("_custom"),
    @XmlEnumValue("_daily")
    DAILY("_daily"),
    @XmlEnumValue("_endOfPeriod")
    END_OF_PERIOD("_endOfPeriod"),
    @XmlEnumValue("_everyFourWeeks")
    EVERY_FOUR_WEEKS("_everyFourWeeks"),
    @XmlEnumValue("_everyThreeYears")
    EVERY_THREE_YEARS("_everyThreeYears"),
    @XmlEnumValue("_everyTwoMonths")
    EVERY_TWO_MONTHS("_everyTwoMonths"),
    @XmlEnumValue("_everyTwoWeeks")
    EVERY_TWO_WEEKS("_everyTwoWeeks"),
    @XmlEnumValue("_everyTwoYears")
    EVERY_TWO_YEARS("_everyTwoYears"),
    @XmlEnumValue("_hourly")
    HOURLY("_hourly"),
    @XmlEnumValue("_monthly")
    MONTHLY("_monthly"),
    @XmlEnumValue("_never")
    NEVER("_never"),
    @XmlEnumValue("_oneTime")
    ONE_TIME("_oneTime"),
    @XmlEnumValue("_quarterly")
    QUARTERLY("_quarterly"),
    @XmlEnumValue("_startOfPeriod")
    START_OF_PERIOD("_startOfPeriod"),
    @XmlEnumValue("_twiceAMonth")
    TWICE_A_MONTH("_twiceAMonth"),
    @XmlEnumValue("_twiceAYear")
    TWICE_A_YEAR("_twiceAYear"),
    @XmlEnumValue("_weekly")
    WEEKLY("_weekly");
    private final String value;

    BillingAccountFrequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingAccountFrequency fromValue(String v) {
        for (BillingAccountFrequency c: BillingAccountFrequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
