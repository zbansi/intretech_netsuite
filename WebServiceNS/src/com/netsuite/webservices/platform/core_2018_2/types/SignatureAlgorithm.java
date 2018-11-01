
package com.netsuite.webservices.platform.core_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SignatureAlgorithm的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SignatureAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HMAC_SHA256"/>
 *     &lt;enumeration value="HMAC_SHA1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignatureAlgorithm", namespace = "urn:types.core_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SignatureAlgorithm {

    @XmlEnumValue("HMAC_SHA256")
    HMAC_SHA_256("HMAC_SHA256"),
    @XmlEnumValue("HMAC_SHA1")
    HMAC_SHA_1("HMAC_SHA1");
    private final String value;

    SignatureAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignatureAlgorithm fromValue(String v) {
        for (SignatureAlgorithm c: SignatureAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
