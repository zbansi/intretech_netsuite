
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaymentInstrumentState的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentInstrumentState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_expired"/>
 *     &lt;enumeration value="_invalid"/>
 *     &lt;enumeration value="_unknown"/>
 *     &lt;enumeration value="_verified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentInstrumentState", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PaymentInstrumentState {

    @XmlEnumValue("_expired")
    EXPIRED("_expired"),
    @XmlEnumValue("_invalid")
    INVALID("_invalid"),
    @XmlEnumValue("_unknown")
    UNKNOWN("_unknown"),
    @XmlEnumValue("_verified")
    VERIFIED("_verified");
    private final String value;

    PaymentInstrumentState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentInstrumentState fromValue(String v) {
        for (PaymentInstrumentState c: PaymentInstrumentState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
