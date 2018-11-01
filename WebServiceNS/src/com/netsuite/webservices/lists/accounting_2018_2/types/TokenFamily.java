
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TokenFamily的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TokenFamily">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_adyen"/>
 *     &lt;enumeration value="_altaPay"/>
 *     &lt;enumeration value="_cyberSource"/>
 *     &lt;enumeration value="_eway"/>
 *     &lt;enumeration value="_freedomPay"/>
 *     &lt;enumeration value="_merchantESolutions"/>
 *     &lt;enumeration value="_payCorp"/>
 *     &lt;enumeration value="_payu"/>
 *     &lt;enumeration value="_securePay"/>
 *     &lt;enumeration value="_soluPay"/>
 *     &lt;enumeration value="_vantivPayments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TokenFamily", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum TokenFamily {

    @XmlEnumValue("_adyen")
    ADYEN("_adyen"),
    @XmlEnumValue("_altaPay")
    ALTA_PAY("_altaPay"),
    @XmlEnumValue("_cyberSource")
    CYBER_SOURCE("_cyberSource"),
    @XmlEnumValue("_eway")
    EWAY("_eway"),
    @XmlEnumValue("_freedomPay")
    FREEDOM_PAY("_freedomPay"),
    @XmlEnumValue("_merchantESolutions")
    MERCHANT_E_SOLUTIONS("_merchantESolutions"),
    @XmlEnumValue("_payCorp")
    PAY_CORP("_payCorp"),
    @XmlEnumValue("_payu")
    PAYU("_payu"),
    @XmlEnumValue("_securePay")
    SECURE_PAY("_securePay"),
    @XmlEnumValue("_soluPay")
    SOLU_PAY("_soluPay"),
    @XmlEnumValue("_vantivPayments")
    VANTIV_PAYMENTS("_vantivPayments");
    private final String value;

    TokenFamily(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TokenFamily fromValue(String v) {
        for (TokenFamily c: TokenFamily.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
