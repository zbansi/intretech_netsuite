
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemSupplyLotSizingMethod�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSupplyLotSizingMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_fixedLotSize"/>
 *     &lt;enumeration value="_lotForLot"/>
 *     &lt;enumeration value="_periodsOfSupply"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemSupplyLotSizingMethod", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemSupplyLotSizingMethod {

    @XmlEnumValue("_fixedLotSize")
    FIXED_LOT_SIZE("_fixedLotSize"),
    @XmlEnumValue("_lotForLot")
    LOT_FOR_LOT("_lotForLot"),
    @XmlEnumValue("_periodsOfSupply")
    PERIODS_OF_SUPPLY("_periodsOfSupply");
    private final String value;

    ItemSupplyLotSizingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSupplyLotSizingMethod fromValue(String v) {
        for (ItemSupplyLotSizingMethod c: ItemSupplyLotSizingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
