
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.RevRecScheduleSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>RevRecScheduleSearch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RevRecScheduleSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}RevRecScheduleSearchBasic" minOccurs="0"/>
 *         &lt;element name="appliedToTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="itemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevRecScheduleSearch", propOrder = {
    "basic",
    "appliedToTransactionJoin",
    "customerJoin",
    "itemJoin",
    "transactionJoin",
    "userJoin"
})
public class RevRecScheduleSearch
    extends SearchRecord
{

    protected RevRecScheduleSearchBasic basic;
    protected TransactionSearchBasic appliedToTransactionJoin;
    protected CustomerSearchBasic customerJoin;
    protected ItemSearchBasic itemJoin;
    protected TransactionSearchBasic transactionJoin;
    protected EmployeeSearchBasic userJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RevRecScheduleSearchBasic }
     *     
     */
    public RevRecScheduleSearchBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RevRecScheduleSearchBasic }
     *     
     */
    public void setBasic(RevRecScheduleSearchBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡappliedToTransactionJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getAppliedToTransactionJoin() {
        return appliedToTransactionJoin;
    }

    /**
     * ����appliedToTransactionJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setAppliedToTransactionJoin(TransactionSearchBasic value) {
        this.appliedToTransactionJoin = value;
    }

    /**
     * ��ȡcustomerJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * ����customerJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchBasic value) {
        this.customerJoin = value;
    }

    /**
     * ��ȡitemJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * ����itemJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setItemJoin(ItemSearchBasic value) {
        this.itemJoin = value;
    }

    /**
     * ��ȡtransactionJoin���Ե�ֵ��
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
     * ����transactionJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchBasic value) {
        this.transactionJoin = value;
    }

    /**
     * ��ȡuserJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * ����userJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
        this.userJoin = value;
    }

}
