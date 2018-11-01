
package com.netsuite.webservices.transactions.inventory_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WorkOrderItemItemCommitInventory的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="WorkOrderItemItemCommitInventory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_availableQty"/>
 *     &lt;enumeration value="_completeQty"/>
 *     &lt;enumeration value="_doNotCommit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkOrderItemItemCommitInventory", namespace = "urn:types.inventory_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum WorkOrderItemItemCommitInventory {

    @XmlEnumValue("_availableQty")
    AVAILABLE_QTY("_availableQty"),
    @XmlEnumValue("_completeQty")
    COMPLETE_QTY("_completeQty"),
    @XmlEnumValue("_doNotCommit")
    DO_NOT_COMMIT("_doNotCommit");
    private final String value;

    WorkOrderItemItemCommitInventory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkOrderItemItemCommitInventory fromValue(String v) {
        for (WorkOrderItemItemCommitInventory c: WorkOrderItemItemCommitInventory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
