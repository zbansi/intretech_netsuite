
package com.netsuite.webservices.transactions.sales_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.AccountSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.AccountingTransactionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.RevRecScheduleSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>AccountingTransactionSearch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccountingTransactionSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountingTransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="accountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountSearchBasic" minOccurs="0"/>
 *         &lt;element name="revRecScheduleJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}RevRecScheduleSearchBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingTransactionSearch", propOrder = {
    "basic",
    "accountJoin",
    "revRecScheduleJoin",
    "transactionJoin"
})
public class AccountingTransactionSearch
    extends SearchRecord
{

    protected AccountingTransactionSearchBasic basic;
    protected AccountSearchBasic accountJoin;
    protected RevRecScheduleSearchBasic revRecScheduleJoin;
    protected TransactionSearchBasic transactionJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountingTransactionSearchBasic }
     *     
     */
    public AccountingTransactionSearchBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingTransactionSearchBasic }
     *     
     */
    public void setBasic(AccountingTransactionSearchBasic value) {
        this.basic = value;
    }

    /**
     * 获取accountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchBasic }
     *     
     */
    public AccountSearchBasic getAccountJoin() {
        return accountJoin;
    }

    /**
     * 设置accountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchBasic }
     *     
     */
    public void setAccountJoin(AccountSearchBasic value) {
        this.accountJoin = value;
    }

    /**
     * 获取revRecScheduleJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RevRecScheduleSearchBasic }
     *     
     */
    public RevRecScheduleSearchBasic getRevRecScheduleJoin() {
        return revRecScheduleJoin;
    }

    /**
     * 设置revRecScheduleJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RevRecScheduleSearchBasic }
     *     
     */
    public void setRevRecScheduleJoin(RevRecScheduleSearchBasic value) {
        this.revRecScheduleJoin = value;
    }

    /**
     * 获取transactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * 设置transactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchBasic value) {
        this.transactionJoin = value;
    }

}
