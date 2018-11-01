
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemFulfillmentPackageUpsDeliveryConfUps的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageUpsDeliveryConfUps">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_noneSelected"/>
 *     &lt;enumeration value="_adultSignatureRequired"/>
 *     &lt;enumeration value="_deliveryConfirmation"/>
 *     &lt;enumeration value="_signatureRequired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageUpsDeliveryConfUps", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageUpsDeliveryConfUps {

    @XmlEnumValue("_noneSelected")
    NONE_SELECTED("_noneSelected"),
    @XmlEnumValue("_adultSignatureRequired")
    ADULT_SIGNATURE_REQUIRED("_adultSignatureRequired"),
    @XmlEnumValue("_deliveryConfirmation")
    DELIVERY_CONFIRMATION("_deliveryConfirmation"),
    @XmlEnumValue("_signatureRequired")
    SIGNATURE_REQUIRED("_signatureRequired");
    private final String value;

    ItemFulfillmentPackageUpsDeliveryConfUps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageUpsDeliveryConfUps fromValue(String v) {
        for (ItemFulfillmentPackageUpsDeliveryConfUps c: ItemFulfillmentPackageUpsDeliveryConfUps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
