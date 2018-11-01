
package com.netsuite.webservices.transactions.purchases_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InboundShipmentShipmentStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="InboundShipmentShipmentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_closed"/>
 *     &lt;enumeration value="_inTransit"/>
 *     &lt;enumeration value="_partiallyReceived"/>
 *     &lt;enumeration value="_received"/>
 *     &lt;enumeration value="_toBeShipped"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InboundShipmentShipmentStatus", namespace = "urn:types.purchases_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum InboundShipmentShipmentStatus {

    @XmlEnumValue("_closed")
    CLOSED("_closed"),
    @XmlEnumValue("_inTransit")
    IN_TRANSIT("_inTransit"),
    @XmlEnumValue("_partiallyReceived")
    PARTIALLY_RECEIVED("_partiallyReceived"),
    @XmlEnumValue("_received")
    RECEIVED("_received"),
    @XmlEnumValue("_toBeShipped")
    TO_BE_SHIPPED("_toBeShipped");
    private final String value;

    InboundShipmentShipmentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InboundShipmentShipmentStatus fromValue(String v) {
        for (InboundShipmentShipmentStatus c: InboundShipmentShipmentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
