
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AccountingTransactionRevCommitStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AccountingTransactionRevCommitStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_committed"/>
 *     &lt;enumeration value="_partiallyCommitted"/>
 *     &lt;enumeration value="_pendingCommitment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountingTransactionRevCommitStatus", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum AccountingTransactionRevCommitStatus {

    @XmlEnumValue("_committed")
    COMMITTED("_committed"),
    @XmlEnumValue("_partiallyCommitted")
    PARTIALLY_COMMITTED("_partiallyCommitted"),
    @XmlEnumValue("_pendingCommitment")
    PENDING_COMMITMENT("_pendingCommitment");
    private final String value;

    AccountingTransactionRevCommitStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountingTransactionRevCommitStatus fromValue(String v) {
        for (AccountingTransactionRevCommitStatus c: AccountingTransactionRevCommitStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
