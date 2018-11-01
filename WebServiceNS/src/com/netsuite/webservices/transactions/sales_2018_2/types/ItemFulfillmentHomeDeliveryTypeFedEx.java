
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemFulfillmentHomeDeliveryTypeFedEx的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentHomeDeliveryTypeFedEx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_appointment"/>
 *     &lt;enumeration value="_dateCertain"/>
 *     &lt;enumeration value="_evening"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentHomeDeliveryTypeFedEx", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentHomeDeliveryTypeFedEx {

    @XmlEnumValue("_appointment")
    APPOINTMENT("_appointment"),
    @XmlEnumValue("_dateCertain")
    DATE_CERTAIN("_dateCertain"),
    @XmlEnumValue("_evening")
    EVENING("_evening");
    private final String value;

    ItemFulfillmentHomeDeliveryTypeFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentHomeDeliveryTypeFedEx fromValue(String v) {
        for (ItemFulfillmentHomeDeliveryTypeFedEx c: ItemFulfillmentHomeDeliveryTypeFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
