
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemCostingMethod的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemCostingMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_average"/>
 *     &lt;enumeration value="_fifo"/>
 *     &lt;enumeration value="_groupAverage"/>
 *     &lt;enumeration value="_lifo"/>
 *     &lt;enumeration value="_lotNumbered"/>
 *     &lt;enumeration value="_serialized"/>
 *     &lt;enumeration value="_standard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemCostingMethod", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemCostingMethod {

    @XmlEnumValue("_average")
    AVERAGE("_average"),
    @XmlEnumValue("_fifo")
    FIFO("_fifo"),
    @XmlEnumValue("_groupAverage")
    GROUP_AVERAGE("_groupAverage"),
    @XmlEnumValue("_lifo")
    LIFO("_lifo"),
    @XmlEnumValue("_lotNumbered")
    LOT_NUMBERED("_lotNumbered"),
    @XmlEnumValue("_serialized")
    SERIALIZED("_serialized"),
    @XmlEnumValue("_standard")
    STANDARD("_standard");
    private final String value;

    ItemCostingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCostingMethod fromValue(String v) {
        for (ItemCostingMethod c: ItemCostingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
