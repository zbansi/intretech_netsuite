
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaymentCardBrand的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentCardBrand">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_amex"/>
 *     &lt;enumeration value="_cirrus"/>
 *     &lt;enumeration value="_dinersClub"/>
 *     &lt;enumeration value="_discover"/>
 *     &lt;enumeration value="_jcb"/>
 *     &lt;enumeration value="_laser"/>
 *     &lt;enumeration value="_localCard"/>
 *     &lt;enumeration value="_maestro"/>
 *     &lt;enumeration value="_masterCard"/>
 *     &lt;enumeration value="_solo"/>
 *     &lt;enumeration value="_unionPay"/>
 *     &lt;enumeration value="_visa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentCardBrand", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PaymentCardBrand {

    @XmlEnumValue("_amex")
    AMEX("_amex"),
    @XmlEnumValue("_cirrus")
    CIRRUS("_cirrus"),
    @XmlEnumValue("_dinersClub")
    DINERS_CLUB("_dinersClub"),
    @XmlEnumValue("_discover")
    DISCOVER("_discover"),
    @XmlEnumValue("_jcb")
    JCB("_jcb"),
    @XmlEnumValue("_laser")
    LASER("_laser"),
    @XmlEnumValue("_localCard")
    LOCAL_CARD("_localCard"),
    @XmlEnumValue("_maestro")
    MAESTRO("_maestro"),
    @XmlEnumValue("_masterCard")
    MASTER_CARD("_masterCard"),
    @XmlEnumValue("_solo")
    SOLO("_solo"),
    @XmlEnumValue("_unionPay")
    UNION_PAY("_unionPay"),
    @XmlEnumValue("_visa")
    VISA("_visa");
    private final String value;

    PaymentCardBrand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentCardBrand fromValue(String v) {
        for (PaymentCardBrand c: PaymentCardBrand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
