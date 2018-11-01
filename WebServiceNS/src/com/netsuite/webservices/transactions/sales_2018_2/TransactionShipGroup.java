
package com.netsuite.webservices.transactions.sales_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>TransactionShipGroup complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TransactionShipGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isFulfilled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sourceAddressRef" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sourceAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationAddressRef" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="destinationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingMethodRef" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shippingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isHandlingTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="handlingTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="handlingTaxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handlingTax2Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handlingRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="handlingTaxAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="handlingTax2Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="isShippingTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shippingTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shippingTaxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingTax2Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="shippingTaxAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="shippingTax2Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionShipGroup", propOrder = {
    "id",
    "isFulfilled",
    "weight",
    "sourceAddressRef",
    "sourceAddress",
    "destinationAddressRef",
    "destinationAddress",
    "shippingMethodRef",
    "shippingMethod",
    "isHandlingTaxable",
    "handlingTaxCode",
    "handlingTaxRate",
    "handlingTax2Rate",
    "handlingRate",
    "handlingTaxAmt",
    "handlingTax2Amt",
    "isShippingTaxable",
    "shippingTaxCode",
    "shippingTaxRate",
    "shippingTax2Rate",
    "shippingRate",
    "shippingTaxAmt",
    "shippingTax2Amt"
})
public class TransactionShipGroup {

    protected Long id;
    protected Boolean isFulfilled;
    protected Double weight;
    protected RecordRef sourceAddressRef;
    protected String sourceAddress;
    protected RecordRef destinationAddressRef;
    protected String destinationAddress;
    protected RecordRef shippingMethodRef;
    protected String shippingMethod;
    protected Boolean isHandlingTaxable;
    protected RecordRef handlingTaxCode;
    protected String handlingTaxRate;
    protected String handlingTax2Rate;
    protected Double handlingRate;
    protected Double handlingTaxAmt;
    protected Double handlingTax2Amt;
    protected Boolean isShippingTaxable;
    protected RecordRef shippingTaxCode;
    protected String shippingTaxRate;
    protected String shippingTax2Rate;
    protected Double shippingRate;
    protected Double shippingTaxAmt;
    protected Double shippingTax2Amt;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * 获取isFulfilled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFulfilled() {
        return isFulfilled;
    }

    /**
     * 设置isFulfilled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFulfilled(Boolean value) {
        this.isFulfilled = value;
    }

    /**
     * 获取weight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * 设置weight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * 获取sourceAddressRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSourceAddressRef() {
        return sourceAddressRef;
    }

    /**
     * 设置sourceAddressRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSourceAddressRef(RecordRef value) {
        this.sourceAddressRef = value;
    }

    /**
     * 获取sourceAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    /**
     * 设置sourceAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAddress(String value) {
        this.sourceAddress = value;
    }

    /**
     * 获取destinationAddressRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDestinationAddressRef() {
        return destinationAddressRef;
    }

    /**
     * 设置destinationAddressRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDestinationAddressRef(RecordRef value) {
        this.destinationAddressRef = value;
    }

    /**
     * 获取destinationAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * 设置destinationAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAddress(String value) {
        this.destinationAddress = value;
    }

    /**
     * 获取shippingMethodRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShippingMethodRef() {
        return shippingMethodRef;
    }

    /**
     * 设置shippingMethodRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShippingMethodRef(RecordRef value) {
        this.shippingMethodRef = value;
    }

    /**
     * 获取shippingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * 设置shippingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * 获取isHandlingTaxable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHandlingTaxable() {
        return isHandlingTaxable;
    }

    /**
     * 设置isHandlingTaxable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHandlingTaxable(Boolean value) {
        this.isHandlingTaxable = value;
    }

    /**
     * 获取handlingTaxCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getHandlingTaxCode() {
        return handlingTaxCode;
    }

    /**
     * 设置handlingTaxCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setHandlingTaxCode(RecordRef value) {
        this.handlingTaxCode = value;
    }

    /**
     * 获取handlingTaxRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingTaxRate() {
        return handlingTaxRate;
    }

    /**
     * 设置handlingTaxRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingTaxRate(String value) {
        this.handlingTaxRate = value;
    }

    /**
     * 获取handlingTax2Rate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingTax2Rate() {
        return handlingTax2Rate;
    }

    /**
     * 设置handlingTax2Rate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingTax2Rate(String value) {
        this.handlingTax2Rate = value;
    }

    /**
     * 获取handlingRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandlingRate() {
        return handlingRate;
    }

    /**
     * 设置handlingRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandlingRate(Double value) {
        this.handlingRate = value;
    }

    /**
     * 获取handlingTaxAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandlingTaxAmt() {
        return handlingTaxAmt;
    }

    /**
     * 设置handlingTaxAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandlingTaxAmt(Double value) {
        this.handlingTaxAmt = value;
    }

    /**
     * 获取handlingTax2Amt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandlingTax2Amt() {
        return handlingTax2Amt;
    }

    /**
     * 设置handlingTax2Amt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandlingTax2Amt(Double value) {
        this.handlingTax2Amt = value;
    }

    /**
     * 获取isShippingTaxable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShippingTaxable() {
        return isShippingTaxable;
    }

    /**
     * 设置isShippingTaxable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShippingTaxable(Boolean value) {
        this.isShippingTaxable = value;
    }

    /**
     * 获取shippingTaxCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShippingTaxCode() {
        return shippingTaxCode;
    }

    /**
     * 设置shippingTaxCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShippingTaxCode(RecordRef value) {
        this.shippingTaxCode = value;
    }

    /**
     * 获取shippingTaxRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTaxRate() {
        return shippingTaxRate;
    }

    /**
     * 设置shippingTaxRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTaxRate(String value) {
        this.shippingTaxRate = value;
    }

    /**
     * 获取shippingTax2Rate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTax2Rate() {
        return shippingTax2Rate;
    }

    /**
     * 设置shippingTax2Rate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTax2Rate(String value) {
        this.shippingTax2Rate = value;
    }

    /**
     * 获取shippingRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingRate() {
        return shippingRate;
    }

    /**
     * 设置shippingRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingRate(Double value) {
        this.shippingRate = value;
    }

    /**
     * 获取shippingTaxAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingTaxAmt() {
        return shippingTaxAmt;
    }

    /**
     * 设置shippingTaxAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingTaxAmt(Double value) {
        this.shippingTaxAmt = value;
    }

    /**
     * 获取shippingTax2Amt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingTax2Amt() {
        return shippingTax2Amt;
    }

    /**
     * 设置shippingTax2Amt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingTax2Amt(Double value) {
        this.shippingTax2Amt = value;
    }

}
