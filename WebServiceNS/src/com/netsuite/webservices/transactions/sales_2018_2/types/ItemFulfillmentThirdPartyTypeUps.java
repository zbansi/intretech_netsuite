
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemFulfillmentThirdPartyTypeUps的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentThirdPartyTypeUps">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_consigneeBilling"/>
 *     &lt;enumeration value="_noneSelected"/>
 *     &lt;enumeration value="_thirdPartyBilling"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentThirdPartyTypeUps", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentThirdPartyTypeUps {

    @XmlEnumValue("_consigneeBilling")
    CONSIGNEE_BILLING("_consigneeBilling"),
    @XmlEnumValue("_noneSelected")
    NONE_SELECTED("_noneSelected"),
    @XmlEnumValue("_thirdPartyBilling")
    THIRD_PARTY_BILLING("_thirdPartyBilling");
    private final String value;

    ItemFulfillmentThirdPartyTypeUps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentThirdPartyTypeUps fromValue(String v) {
        for (ItemFulfillmentThirdPartyTypeUps c: ItemFulfillmentThirdPartyTypeUps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
