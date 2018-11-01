
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CurrencyFxRateUpdateTimezone的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyFxRateUpdateTimezone">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_americaNewYork"/>
 *     &lt;enumeration value="_asiaMagadan"/>
 *     &lt;enumeration value="_asiaTokyo"/>
 *     &lt;enumeration value="_europeParis"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyFxRateUpdateTimezone", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CurrencyFxRateUpdateTimezone {

    @XmlEnumValue("_americaNewYork")
    AMERICA_NEW_YORK("_americaNewYork"),
    @XmlEnumValue("_asiaMagadan")
    ASIA_MAGADAN("_asiaMagadan"),
    @XmlEnumValue("_asiaTokyo")
    ASIA_TOKYO("_asiaTokyo"),
    @XmlEnumValue("_europeParis")
    EUROPE_PARIS("_europeParis");
    private final String value;

    CurrencyFxRateUpdateTimezone(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyFxRateUpdateTimezone fromValue(String v) {
        for (CurrencyFxRateUpdateTimezone c: CurrencyFxRateUpdateTimezone.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
