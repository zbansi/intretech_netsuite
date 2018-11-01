
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemSupplyType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSupplyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_build"/>
 *     &lt;enumeration value="_purchase"/>
 *     &lt;enumeration value="_transfer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemSupplyType", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemSupplyType {

    @XmlEnumValue("_build")
    BUILD("_build"),
    @XmlEnumValue("_purchase")
    PURCHASE("_purchase"),
    @XmlEnumValue("_transfer")
    TRANSFER("_transfer");
    private final String value;

    ItemSupplyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSupplyType fromValue(String v) {
        for (ItemSupplyType c: ItemSupplyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
