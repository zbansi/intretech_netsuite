
package com.netsuite.webservices.platform.common_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IntercoStatus�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="IntercoStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_paired"/>
 *     &lt;enumeration value="_pending"/>
 *     &lt;enumeration value="_rejected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntercoStatus", namespace = "urn:types.common_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum IntercoStatus {

    @XmlEnumValue("_paired")
    PAIRED("_paired"),
    @XmlEnumValue("_pending")
    PENDING("_pending"),
    @XmlEnumValue("_rejected")
    REJECTED("_rejected");
    private final String value;

    IntercoStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntercoStatus fromValue(String v) {
        for (IntercoStatus c: IntercoStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
