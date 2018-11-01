
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemFulfillmentPackageFedExSignatureOptionsFedEx的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageFedExSignatureOptionsFedEx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_adult"/>
 *     &lt;enumeration value="_direct"/>
 *     &lt;enumeration value="_indirect"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageFedExSignatureOptionsFedEx", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageFedExSignatureOptionsFedEx {

    @XmlEnumValue("_adult")
    ADULT("_adult"),
    @XmlEnumValue("_direct")
    DIRECT("_direct"),
    @XmlEnumValue("_indirect")
    INDIRECT("_indirect");
    private final String value;

    ItemFulfillmentPackageFedExSignatureOptionsFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageFedExSignatureOptionsFedEx fromValue(String v) {
        for (ItemFulfillmentPackageFedExSignatureOptionsFedEx c: ItemFulfillmentPackageFedExSignatureOptionsFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
