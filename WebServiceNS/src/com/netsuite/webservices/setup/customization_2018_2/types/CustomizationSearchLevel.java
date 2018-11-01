
package com.netsuite.webservices.setup.customization_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomizationSearchLevel的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CustomizationSearchLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_none"/>
 *     &lt;enumeration value="_edit"/>
 *     &lt;enumeration value="_run"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomizationSearchLevel", namespace = "urn:types.customization_2018_2.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomizationSearchLevel {

    @XmlEnumValue("_none")
    NONE("_none"),
    @XmlEnumValue("_edit")
    EDIT("_edit"),
    @XmlEnumValue("_run")
    RUN("_run");
    private final String value;

    CustomizationSearchLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomizationSearchLevel fromValue(String v) {
        for (CustomizationSearchLevel c: CustomizationSearchLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
