
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemOverheadType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ItemOverheadType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_amountBaseUnit"/>
 *     &lt;enumeration value="_percentOfMaterial"/>
 *     &lt;enumeration value="_percentOfTotal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemOverheadType", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemOverheadType {

    @XmlEnumValue("_amountBaseUnit")
    AMOUNT_BASE_UNIT("_amountBaseUnit"),
    @XmlEnumValue("_percentOfMaterial")
    PERCENT_OF_MATERIAL("_percentOfMaterial"),
    @XmlEnumValue("_percentOfTotal")
    PERCENT_OF_TOTAL("_percentOfTotal");
    private final String value;

    ItemOverheadType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemOverheadType fromValue(String v) {
        for (ItemOverheadType c: ItemOverheadType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
