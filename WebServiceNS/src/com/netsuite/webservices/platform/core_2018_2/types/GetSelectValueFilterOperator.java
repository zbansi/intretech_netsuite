
package com.netsuite.webservices.platform.core_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSelectValueFilterOperator的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="GetSelectValueFilterOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="contains"/>
 *     &lt;enumeration value="is"/>
 *     &lt;enumeration value="startsWith"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetSelectValueFilterOperator", namespace = "urn:types.core_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum GetSelectValueFilterOperator {

    @XmlEnumValue("contains")
    CONTAINS("contains"),
    @XmlEnumValue("is")
    IS("is"),
    @XmlEnumValue("startsWith")
    STARTS_WITH("startsWith");
    private final String value;

    GetSelectValueFilterOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetSelectValueFilterOperator fromValue(String v) {
        for (GetSelectValueFilterOperator c: GetSelectValueFilterOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
