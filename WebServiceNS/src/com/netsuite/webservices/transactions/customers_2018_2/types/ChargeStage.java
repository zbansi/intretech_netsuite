
package com.netsuite.webservices.transactions.customers_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ChargeStage�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeStage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_hold"/>
 *     &lt;enumeration value="_nonBillable"/>
 *     &lt;enumeration value="_processed"/>
 *     &lt;enumeration value="_ready"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargeStage", namespace = "urn:types.customers_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ChargeStage {

    @XmlEnumValue("_hold")
    HOLD("_hold"),
    @XmlEnumValue("_nonBillable")
    NON_BILLABLE("_nonBillable"),
    @XmlEnumValue("_processed")
    PROCESSED("_processed"),
    @XmlEnumValue("_ready")
    READY("_ready");
    private final String value;

    ChargeStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargeStage fromValue(String v) {
        for (ChargeStage c: ChargeStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
