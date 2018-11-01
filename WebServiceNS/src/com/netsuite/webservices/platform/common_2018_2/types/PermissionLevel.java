
package com.netsuite.webservices.platform.common_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PermissionLevel�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="PermissionLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_create"/>
 *     &lt;enumeration value="_edit"/>
 *     &lt;enumeration value="_full"/>
 *     &lt;enumeration value="_none"/>
 *     &lt;enumeration value="_view"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PermissionLevel", namespace = "urn:types.common_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum PermissionLevel {

    @XmlEnumValue("_create")
    CREATE("_create"),
    @XmlEnumValue("_edit")
    EDIT("_edit"),
    @XmlEnumValue("_full")
    FULL("_full"),
    @XmlEnumValue("_none")
    NONE("_none"),
    @XmlEnumValue("_view")
    VIEW("_view");
    private final String value;

    PermissionLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PermissionLevel fromValue(String v) {
        for (PermissionLevel c: PermissionLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
