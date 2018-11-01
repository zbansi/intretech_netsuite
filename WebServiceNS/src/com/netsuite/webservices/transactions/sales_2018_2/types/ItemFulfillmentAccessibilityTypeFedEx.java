
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemFulfillmentAccessibilityTypeFedEx�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentAccessibilityTypeFedEx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_accessible"/>
 *     &lt;enumeration value="_inaccessible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentAccessibilityTypeFedEx", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentAccessibilityTypeFedEx {

    @XmlEnumValue("_accessible")
    ACCESSIBLE("_accessible"),
    @XmlEnumValue("_inaccessible")
    INACCESSIBLE("_inaccessible");
    private final String value;

    ItemFulfillmentAccessibilityTypeFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentAccessibilityTypeFedEx fromValue(String v) {
        for (ItemFulfillmentAccessibilityTypeFedEx c: ItemFulfillmentAccessibilityTypeFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
