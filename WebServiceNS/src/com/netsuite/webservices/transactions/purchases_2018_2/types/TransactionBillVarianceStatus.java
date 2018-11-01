
package com.netsuite.webservices.transactions.purchases_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransactionBillVarianceStatus�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionBillVarianceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_journalNotPosted"/>
 *     &lt;enumeration value="_journalPosted"/>
 *     &lt;enumeration value="_noVariances"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionBillVarianceStatus", namespace = "urn:types.purchases_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionBillVarianceStatus {

    @XmlEnumValue("_journalNotPosted")
    JOURNAL_NOT_POSTED("_journalNotPosted"),
    @XmlEnumValue("_journalPosted")
    JOURNAL_POSTED("_journalPosted"),
    @XmlEnumValue("_noVariances")
    NO_VARIANCES("_noVariances");
    private final String value;

    TransactionBillVarianceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionBillVarianceStatus fromValue(String v) {
        for (TransactionBillVarianceStatus c: TransactionBillVarianceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
