
package com.netsuite.webservices.lists.relationships_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>CustomerCreditCards complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CustomerCreditCards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ccName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="cardState" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="stateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="debitcardIssueNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validfrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ccDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCreditCards", propOrder = {
    "internalId",
    "ccNumber",
    "ccExpireDate",
    "ccName",
    "paymentMethod",
    "cardState",
    "stateFrom",
    "debitcardIssueNo",
    "ccMemo",
    "validfrom",
    "ccDefault"
})
public class CustomerCreditCards {

    protected String internalId;
    protected String ccNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ccExpireDate;
    protected String ccName;
    protected RecordRef paymentMethod;
    protected RecordRef cardState;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stateFrom;
    protected String debitcardIssueNo;
    protected String ccMemo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validfrom;
    protected Boolean ccDefault;

    /**
     * ��ȡinternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * ����internalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * ��ȡccNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcNumber() {
        return ccNumber;
    }

    /**
     * ����ccNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcNumber(String value) {
        this.ccNumber = value;
    }

    /**
     * ��ȡccExpireDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCcExpireDate() {
        return ccExpireDate;
    }

    /**
     * ����ccExpireDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCcExpireDate(XMLGregorianCalendar value) {
        this.ccExpireDate = value;
    }

    /**
     * ��ȡccName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcName() {
        return ccName;
    }

    /**
     * ����ccName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcName(String value) {
        this.ccName = value;
    }

    /**
     * ��ȡpaymentMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * ����paymentMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPaymentMethod(RecordRef value) {
        this.paymentMethod = value;
    }

    /**
     * ��ȡcardState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCardState() {
        return cardState;
    }

    /**
     * ����cardState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCardState(RecordRef value) {
        this.cardState = value;
    }

    /**
     * ��ȡstateFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStateFrom() {
        return stateFrom;
    }

    /**
     * ����stateFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStateFrom(XMLGregorianCalendar value) {
        this.stateFrom = value;
    }

    /**
     * ��ȡdebitcardIssueNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitcardIssueNo() {
        return debitcardIssueNo;
    }

    /**
     * ����debitcardIssueNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitcardIssueNo(String value) {
        this.debitcardIssueNo = value;
    }

    /**
     * ��ȡccMemo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcMemo() {
        return ccMemo;
    }

    /**
     * ����ccMemo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcMemo(String value) {
        this.ccMemo = value;
    }

    /**
     * ��ȡvalidfrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidfrom() {
        return validfrom;
    }

    /**
     * ����validfrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidfrom(XMLGregorianCalendar value) {
        this.validfrom = value;
    }

    /**
     * ��ȡccDefault���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCcDefault() {
        return ccDefault;
    }

    /**
     * ����ccDefault���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCcDefault(Boolean value) {
        this.ccDefault = value;
    }

}
