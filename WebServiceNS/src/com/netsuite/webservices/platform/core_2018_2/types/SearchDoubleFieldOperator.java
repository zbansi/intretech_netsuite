
package com.netsuite.webservices.platform.core_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SearchDoubleFieldOperator的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SearchDoubleFieldOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="between"/>
 *     &lt;enumeration value="empty"/>
 *     &lt;enumeration value="equalTo"/>
 *     &lt;enumeration value="greaterThan"/>
 *     &lt;enumeration value="greaterThanOrEqualTo"/>
 *     &lt;enumeration value="lessThan"/>
 *     &lt;enumeration value="lessThanOrEqualTo"/>
 *     &lt;enumeration value="notBetween"/>
 *     &lt;enumeration value="notEmpty"/>
 *     &lt;enumeration value="notEqualTo"/>
 *     &lt;enumeration value="notGreaterThan"/>
 *     &lt;enumeration value="notGreaterThanOrEqualTo"/>
 *     &lt;enumeration value="notLessThan"/>
 *     &lt;enumeration value="notLessThanOrEqualTo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchDoubleFieldOperator", namespace = "urn:types.core_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SearchDoubleFieldOperator {

    @XmlEnumValue("between")
    BETWEEN("between"),
    @XmlEnumValue("empty")
    EMPTY("empty"),
    @XmlEnumValue("equalTo")
    EQUAL_TO("equalTo"),
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),
    @XmlEnumValue("greaterThanOrEqualTo")
    GREATER_THAN_OR_EQUAL_TO("greaterThanOrEqualTo"),
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),
    @XmlEnumValue("lessThanOrEqualTo")
    LESS_THAN_OR_EQUAL_TO("lessThanOrEqualTo"),
    @XmlEnumValue("notBetween")
    NOT_BETWEEN("notBetween"),
    @XmlEnumValue("notEmpty")
    NOT_EMPTY("notEmpty"),
    @XmlEnumValue("notEqualTo")
    NOT_EQUAL_TO("notEqualTo"),
    @XmlEnumValue("notGreaterThan")
    NOT_GREATER_THAN("notGreaterThan"),
    @XmlEnumValue("notGreaterThanOrEqualTo")
    NOT_GREATER_THAN_OR_EQUAL_TO("notGreaterThanOrEqualTo"),
    @XmlEnumValue("notLessThan")
    NOT_LESS_THAN("notLessThan"),
    @XmlEnumValue("notLessThanOrEqualTo")
    NOT_LESS_THAN_OR_EQUAL_TO("notLessThanOrEqualTo");
    private final String value;

    SearchDoubleFieldOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchDoubleFieldOperator fromValue(String v) {
        for (SearchDoubleFieldOperator c: SearchDoubleFieldOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
