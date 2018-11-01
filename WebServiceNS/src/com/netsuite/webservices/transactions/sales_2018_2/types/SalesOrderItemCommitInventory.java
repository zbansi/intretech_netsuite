
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SalesOrderItemCommitInventory�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="SalesOrderItemCommitInventory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_availableQty"/>
 *     &lt;enumeration value="_completeQty"/>
 *     &lt;enumeration value="_doNotCommit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SalesOrderItemCommitInventory", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum SalesOrderItemCommitInventory {

    @XmlEnumValue("_availableQty")
    AVAILABLE_QTY("_availableQty"),
    @XmlEnumValue("_completeQty")
    COMPLETE_QTY("_completeQty"),
    @XmlEnumValue("_doNotCommit")
    DO_NOT_COMMIT("_doNotCommit");
    private final String value;

    SalesOrderItemCommitInventory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalesOrderItemCommitInventory fromValue(String v) {
        for (SalesOrderItemCommitInventory c: SalesOrderItemCommitInventory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
