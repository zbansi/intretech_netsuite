
package com.netsuite.webservices.platform.common_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PresentationItemType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PresentationItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_fileCabinetItem"/>
 *     &lt;enumeration value="_informationItem"/>
 *     &lt;enumeration value="_item"/>
 *     &lt;enumeration value="_presentationCategory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PresentationItemType", namespace = "urn:types.common_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum PresentationItemType {

    @XmlEnumValue("_fileCabinetItem")
    FILE_CABINET_ITEM("_fileCabinetItem"),
    @XmlEnumValue("_informationItem")
    INFORMATION_ITEM("_informationItem"),
    @XmlEnumValue("_item")
    ITEM("_item"),
    @XmlEnumValue("_presentationCategory")
    PRESENTATION_CATEGORY("_presentationCategory");
    private final String value;

    PresentationItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PresentationItemType fromValue(String v) {
        for (PresentationItemType c: PresentationItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
