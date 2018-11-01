
package com.netsuite.webservices.lists.support_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SolutionStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SolutionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_approved"/>
 *     &lt;enumeration value="_unapproved"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SolutionStatus", namespace = "urn:types.support_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum SolutionStatus {

    @XmlEnumValue("_approved")
    APPROVED("_approved"),
    @XmlEnumValue("_unapproved")
    UNAPPROVED("_unapproved");
    private final String value;

    SolutionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SolutionStatus fromValue(String v) {
        for (SolutionStatus c: SolutionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
