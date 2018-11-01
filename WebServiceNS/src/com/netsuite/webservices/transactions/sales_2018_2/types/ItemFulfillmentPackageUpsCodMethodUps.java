
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemFulfillmentPackageUpsCodMethodUps的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageUpsCodMethodUps">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_cashiersCheckMoneyOrder"/>
 *     &lt;enumeration value="_checkCashiersCheckMoneyOrder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageUpsCodMethodUps", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageUpsCodMethodUps {

    @XmlEnumValue("_cashiersCheckMoneyOrder")
    CASHIERS_CHECK_MONEY_ORDER("_cashiersCheckMoneyOrder"),
    @XmlEnumValue("_checkCashiersCheckMoneyOrder")
    CHECK_CASHIERS_CHECK_MONEY_ORDER("_checkCashiersCheckMoneyOrder");
    private final String value;

    ItemFulfillmentPackageUpsCodMethodUps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageUpsCodMethodUps fromValue(String v) {
        for (ItemFulfillmentPackageUpsCodMethodUps c: ItemFulfillmentPackageUpsCodMethodUps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
