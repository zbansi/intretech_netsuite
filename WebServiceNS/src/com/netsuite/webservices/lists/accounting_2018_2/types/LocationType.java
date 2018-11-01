
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LocationType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="LocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_store"/>
 *     &lt;enumeration value="_warehouse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationType", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum LocationType {

    @XmlEnumValue("_store")
    STORE("_store"),
    @XmlEnumValue("_warehouse")
    WAREHOUSE("_warehouse");
    private final String value;

    LocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationType fromValue(String v) {
        for (LocationType c: LocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
