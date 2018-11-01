
package com.netsuite.webservices.platform.common_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemSource的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_stock"/>
 *     &lt;enumeration value="_phantom"/>
 *     &lt;enumeration value="_workOrder"/>
 *     &lt;enumeration value="_purchaseOrder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemSource", namespace = "urn:types.common_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum ItemSource {

    @XmlEnumValue("_stock")
    STOCK("_stock"),
    @XmlEnumValue("_phantom")
    PHANTOM("_phantom"),
    @XmlEnumValue("_workOrder")
    WORK_ORDER("_workOrder"),
    @XmlEnumValue("_purchaseOrder")
    PURCHASE_ORDER("_purchaseOrder");
    private final String value;

    ItemSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSource fromValue(String v) {
        for (ItemSource c: ItemSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
