
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.AccountSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CostCategorySearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>CostCategorySearchRow complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CostCategorySearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}CostCategorySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="accountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostCategorySearchRow", propOrder = {
    "basic",
    "accountJoin",
    "transactionJoin"
})
public class CostCategorySearchRow
    extends SearchRow
{

    protected CostCategorySearchRowBasic basic;
    protected AccountSearchRowBasic accountJoin;
    protected TransactionSearchRowBasic transactionJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CostCategorySearchRowBasic }
     *     
     */
    public CostCategorySearchRowBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CostCategorySearchRowBasic }
     *     
     */
    public void setBasic(CostCategorySearchRowBasic value) {
        this.basic = value;
    }

    /**
     * 获取accountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getAccountJoin() {
        return accountJoin;
    }

    /**
     * 设置accountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setAccountJoin(AccountSearchRowBasic value) {
        this.accountJoin = value;
    }

    /**
     * 获取transactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * 设置transactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchRowBasic value) {
        this.transactionJoin = value;
    }

}
