
package com.netsuite.webservices.platform.common_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AvsMatchCode�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="AvsMatchCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_n"/>
 *     &lt;enumeration value="_x"/>
 *     &lt;enumeration value="_y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AvsMatchCode", namespace = "urn:types.common_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum AvsMatchCode {

    @XmlEnumValue("_n")
    N("_n"),
    @XmlEnumValue("_x")
    X("_x"),
    @XmlEnumValue("_y")
    Y("_y");
    private final String value;

    AvsMatchCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvsMatchCode fromValue(String v) {
        for (AvsMatchCode c: AvsMatchCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
