
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.accounting_2018_2.types.AccountingBookStatus;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>SubsidiaryAccountingBookDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SubsidiaryAccountingBookDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountingBook" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="bookStatus" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}AccountingBookStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsidiaryAccountingBookDetail", propOrder = {
    "accountingBook",
    "currency",
    "bookStatus"
})
public class SubsidiaryAccountingBookDetail {

    protected RecordRef accountingBook;
    protected RecordRef currency;
    @XmlSchemaType(name = "string")
    protected AccountingBookStatus bookStatus;

    /**
     * ��ȡaccountingBook���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAccountingBook() {
        return accountingBook;
    }

    /**
     * ����accountingBook���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAccountingBook(RecordRef value) {
        this.accountingBook = value;
    }

    /**
     * ��ȡcurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCurrency() {
        return currency;
    }

    /**
     * ����currency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCurrency(RecordRef value) {
        this.currency = value;
    }

    /**
     * ��ȡbookStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccountingBookStatus }
     *     
     */
    public AccountingBookStatus getBookStatus() {
        return bookStatus;
    }

    /**
     * ����bookStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingBookStatus }
     *     
     */
    public void setBookStatus(AccountingBookStatus value) {
        this.bookStatus = value;
    }

}
