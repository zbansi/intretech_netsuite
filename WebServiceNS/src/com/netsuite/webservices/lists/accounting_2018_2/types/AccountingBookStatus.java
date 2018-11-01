
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AccountingBookStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AccountingBookStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_active"/>
 *     &lt;enumeration value="_inactive"/>
 *     &lt;enumeration value="_pending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountingBookStatus", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum AccountingBookStatus {

    @XmlEnumValue("_active")
    ACTIVE("_active"),
    @XmlEnumValue("_inactive")
    INACTIVE("_inactive"),
    @XmlEnumValue("_pending")
    PENDING("_pending");
    private final String value;

    AccountingBookStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountingBookStatus fromValue(String v) {
        for (AccountingBookStatus c: AccountingBookStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
