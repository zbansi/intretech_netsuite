
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HazmatPackingGroup�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="HazmatPackingGroup">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_i"/>
 *     &lt;enumeration value="_ii"/>
 *     &lt;enumeration value="_iii"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HazmatPackingGroup", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum HazmatPackingGroup {

    @XmlEnumValue("_i")
    I("_i"),
    @XmlEnumValue("_ii")
    II("_ii"),
    @XmlEnumValue("_iii")
    III("_iii");
    private final String value;

    HazmatPackingGroup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HazmatPackingGroup fromValue(String v) {
        for (HazmatPackingGroup c: HazmatPackingGroup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
