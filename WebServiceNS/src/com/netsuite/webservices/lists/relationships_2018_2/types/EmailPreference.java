
package com.netsuite.webservices.lists.relationships_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EmailPreference�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="EmailPreference">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_default"/>
 *     &lt;enumeration value="_hTML"/>
 *     &lt;enumeration value="_pDF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailPreference", namespace = "urn:types.relationships_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmailPreference {

    @XmlEnumValue("_default")
    DEFAULT("_default"),
    @XmlEnumValue("_hTML")
    H_TML("_hTML"),
    @XmlEnumValue("_pDF")
    P_DF("_pDF");
    private final String value;

    EmailPreference(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailPreference fromValue(String v) {
        for (EmailPreference c: EmailPreference.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
