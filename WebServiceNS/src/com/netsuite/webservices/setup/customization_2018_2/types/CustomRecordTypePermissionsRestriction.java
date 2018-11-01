
package com.netsuite.webservices.setup.customization_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomRecordTypePermissionsRestriction�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="CustomRecordTypePermissionsRestriction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_editingOnly"/>
 *     &lt;enumeration value="_viewingAndEditing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomRecordTypePermissionsRestriction", namespace = "urn:types.customization_2018_2.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomRecordTypePermissionsRestriction {

    @XmlEnumValue("_editingOnly")
    EDITING_ONLY("_editingOnly"),
    @XmlEnumValue("_viewingAndEditing")
    VIEWING_AND_EDITING("_viewingAndEditing");
    private final String value;

    CustomRecordTypePermissionsRestriction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomRecordTypePermissionsRestriction fromValue(String v) {
        for (CustomRecordTypePermissionsRestriction c: CustomRecordTypePermissionsRestriction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
