
package com.netsuite.webservices.setup.customization_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomizationAccessLevel的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CustomizationAccessLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_none"/>
 *     &lt;enumeration value="_edit"/>
 *     &lt;enumeration value="_view"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomizationAccessLevel", namespace = "urn:types.customization_2018_2.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomizationAccessLevel {

    @XmlEnumValue("_none")
    NONE("_none"),
    @XmlEnumValue("_edit")
    EDIT("_edit"),
    @XmlEnumValue("_view")
    VIEW("_view");
    private final String value;

    CustomizationAccessLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomizationAccessLevel fromValue(String v) {
        for (CustomizationAccessLevel c: CustomizationAccessLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
