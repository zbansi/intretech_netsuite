
package com.netsuite.webservices.lists.relationships_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ContactType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ContactType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_customer"/>
 *     &lt;enumeration value="_employee"/>
 *     &lt;enumeration value="_otherName"/>
 *     &lt;enumeration value="_partner"/>
 *     &lt;enumeration value="_vendor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactType", namespace = "urn:types.relationships_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ContactType {

    @XmlEnumValue("_customer")
    CUSTOMER("_customer"),
    @XmlEnumValue("_employee")
    EMPLOYEE("_employee"),
    @XmlEnumValue("_otherName")
    OTHER_NAME("_otherName"),
    @XmlEnumValue("_partner")
    PARTNER("_partner"),
    @XmlEnumValue("_vendor")
    VENDOR("_vendor");
    private final String value;

    ContactType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactType fromValue(String v) {
        for (ContactType c: ContactType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
