
package com.netsuite.webservices.setup.customization_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomizationDisplayType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="CustomizationDisplayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_disabled"/>
 *     &lt;enumeration value="_hidden"/>
 *     &lt;enumeration value="_inlineText"/>
 *     &lt;enumeration value="_normal"/>
 *     &lt;enumeration value="_showAsList"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomizationDisplayType", namespace = "urn:types.customization_2018_2.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomizationDisplayType {

    @XmlEnumValue("_disabled")
    DISABLED("_disabled"),
    @XmlEnumValue("_hidden")
    HIDDEN("_hidden"),
    @XmlEnumValue("_inlineText")
    INLINE_TEXT("_inlineText"),
    @XmlEnumValue("_normal")
    NORMAL("_normal"),
    @XmlEnumValue("_showAsList")
    SHOW_AS_LIST("_showAsList");
    private final String value;

    CustomizationDisplayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomizationDisplayType fromValue(String v) {
        for (CustomizationDisplayType c: CustomizationDisplayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
