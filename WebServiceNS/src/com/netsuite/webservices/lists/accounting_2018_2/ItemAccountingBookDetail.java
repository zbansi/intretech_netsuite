
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>ItemAccountingBookDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemAccountingBookDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountingBook" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="createRevenuePlansOn" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revenueRecognitionRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revRecForecastRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revRecSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sameAsPrimaryRevRec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="amortizationTemplate" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sameAsPrimaryAmortization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAccountingBookDetail", propOrder = {
    "accountingBook",
    "createRevenuePlansOn",
    "revenueRecognitionRule",
    "revRecForecastRule",
    "revRecSchedule",
    "sameAsPrimaryRevRec",
    "amortizationTemplate",
    "sameAsPrimaryAmortization"
})
public class ItemAccountingBookDetail {

    protected RecordRef accountingBook;
    protected RecordRef createRevenuePlansOn;
    protected RecordRef revenueRecognitionRule;
    protected RecordRef revRecForecastRule;
    protected RecordRef revRecSchedule;
    protected Boolean sameAsPrimaryRevRec;
    protected RecordRef amortizationTemplate;
    protected Boolean sameAsPrimaryAmortization;

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
     * 获取createRevenuePlansOn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCreateRevenuePlansOn() {
        return createRevenuePlansOn;
    }

    /**
     * 设置createRevenuePlansOn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCreateRevenuePlansOn(RecordRef value) {
        this.createRevenuePlansOn = value;
    }

    /**
     * 获取revenueRecognitionRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevenueRecognitionRule() {
        return revenueRecognitionRule;
    }

    /**
     * 设置revenueRecognitionRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevenueRecognitionRule(RecordRef value) {
        this.revenueRecognitionRule = value;
    }

    /**
     * 获取revRecForecastRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevRecForecastRule() {
        return revRecForecastRule;
    }

    /**
     * 设置revRecForecastRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevRecForecastRule(RecordRef value) {
        this.revRecForecastRule = value;
    }

    /**
     * 获取revRecSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }

    /**
     * 设置revRecSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevRecSchedule(RecordRef value) {
        this.revRecSchedule = value;
    }

    /**
     * 获取sameAsPrimaryRevRec属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSameAsPrimaryRevRec() {
        return sameAsPrimaryRevRec;
    }

    /**
     * 设置sameAsPrimaryRevRec属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSameAsPrimaryRevRec(Boolean value) {
        this.sameAsPrimaryRevRec = value;
    }

    /**
     * 获取amortizationTemplate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAmortizationTemplate() {
        return amortizationTemplate;
    }

    /**
     * 设置amortizationTemplate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAmortizationTemplate(RecordRef value) {
        this.amortizationTemplate = value;
    }

    /**
     * 获取sameAsPrimaryAmortization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSameAsPrimaryAmortization() {
        return sameAsPrimaryAmortization;
    }

    /**
     * 设置sameAsPrimaryAmortization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSameAsPrimaryAmortization(Boolean value) {
        this.sameAsPrimaryAmortization = value;
    }

}
