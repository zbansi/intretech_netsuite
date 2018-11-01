
package com.netsuite.webservices.platform.core_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AsyncStatusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AsyncStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="failed"/>
 *     &lt;enumeration value="finishedWithErrors"/>
 *     &lt;enumeration value="pending"/>
 *     &lt;enumeration value="processing"/>
 *     &lt;enumeration value="finished"/>
 *     &lt;enumeration value="retry"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AsyncStatusType", namespace = "urn:types.core_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum AsyncStatusType {

    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("finishedWithErrors")
    FINISHED_WITH_ERRORS("finishedWithErrors"),
    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("processing")
    PROCESSING("processing"),
    @XmlEnumValue("finished")
    FINISHED("finished"),
    @XmlEnumValue("retry")
    RETRY("retry");
    private final String value;

    AsyncStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AsyncStatusType fromValue(String v) {
        for (AsyncStatusType c: AsyncStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
