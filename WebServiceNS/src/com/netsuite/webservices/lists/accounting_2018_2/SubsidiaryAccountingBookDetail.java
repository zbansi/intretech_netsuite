
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.accounting_2018_2.types.AccountingBookStatus;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>SubsidiaryAccountingBookDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取accountingBook属性的值。
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
     * 设置accountingBook属性的值。
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
     * 获取currency属性的值。
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
     * 设置currency属性的值。
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
     * 获取bookStatus属性的值。
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
     * 设置bookStatus属性的值。
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
