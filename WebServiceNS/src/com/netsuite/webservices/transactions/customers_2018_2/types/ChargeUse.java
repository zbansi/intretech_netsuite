
package com.netsuite.webservices.transactions.customers_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ChargeUse�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeUse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_actual"/>
 *     &lt;enumeration value="_forecast"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargeUse", namespace = "urn:types.customers_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ChargeUse {

    @XmlEnumValue("_actual")
    ACTUAL("_actual"),
    @XmlEnumValue("_forecast")
    FORECAST("_forecast");
    private final String value;

    ChargeUse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargeUse fromValue(String v) {
        for (ChargeUse c: ChargeUse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
