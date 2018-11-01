
package com.netsuite.webservices.transactions.sales_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageUpsCodMethodUps;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageUpsDeliveryConfUps;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageUpsPackagingUps;


/**
 * <p>ItemFulfillmentPackageUps complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemFulfillmentPackageUps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageWeightUps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="packageDescrUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageTrackingNumberUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packagingUps" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUpsPackagingUps" minOccurs="0"/>
 *         &lt;element name="useInsuredValueUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="insuredValueUps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="reference1Ups" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference2Ups" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageLengthUps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="packageWidthUps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="packageHeightUps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="additionalHandlingUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useCodUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="codAmountUps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="codMethodUps" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUpsCodMethodUps" minOccurs="0"/>
 *         &lt;element name="deliveryConfUps" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUpsDeliveryConfUps" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemFulfillmentPackageUps", propOrder = {
    "packageWeightUps",
    "packageDescrUps",
    "packageTrackingNumberUps",
    "packagingUps",
    "useInsuredValueUps",
    "insuredValueUps",
    "reference1Ups",
    "reference2Ups",
    "packageLengthUps",
    "packageWidthUps",
    "packageHeightUps",
    "additionalHandlingUps",
    "useCodUps",
    "codAmountUps",
    "codMethodUps",
    "deliveryConfUps"
})
public class ItemFulfillmentPackageUps {

    protected Double packageWeightUps;
    protected String packageDescrUps;
    protected String packageTrackingNumberUps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageUpsPackagingUps packagingUps;
    protected Boolean useInsuredValueUps;
    protected Double insuredValueUps;
    protected String reference1Ups;
    protected String reference2Ups;
    protected Long packageLengthUps;
    protected Long packageWidthUps;
    protected Long packageHeightUps;
    protected Boolean additionalHandlingUps;
    protected Boolean useCodUps;
    protected Double codAmountUps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageUpsCodMethodUps codMethodUps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageUpsDeliveryConfUps deliveryConfUps;

    /**
     * 获取packageWeightUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPackageWeightUps() {
        return packageWeightUps;
    }

    /**
     * 设置packageWeightUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPackageWeightUps(Double value) {
        this.packageWeightUps = value;
    }

    /**
     * 获取packageDescrUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDescrUps() {
        return packageDescrUps;
    }

    /**
     * 设置packageDescrUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDescrUps(String value) {
        this.packageDescrUps = value;
    }

    /**
     * 获取packageTrackingNumberUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTrackingNumberUps() {
        return packageTrackingNumberUps;
    }

    /**
     * 设置packageTrackingNumberUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTrackingNumberUps(String value) {
        this.packageTrackingNumberUps = value;
    }

    /**
     * 获取packagingUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUpsPackagingUps }
     *     
     */
    public ItemFulfillmentPackageUpsPackagingUps getPackagingUps() {
        return packagingUps;
    }

    /**
     * 设置packagingUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUpsPackagingUps }
     *     
     */
    public void setPackagingUps(ItemFulfillmentPackageUpsPackagingUps value) {
        this.packagingUps = value;
    }

    /**
     * 获取useInsuredValueUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseInsuredValueUps() {
        return useInsuredValueUps;
    }

    /**
     * 设置useInsuredValueUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseInsuredValueUps(Boolean value) {
        this.useInsuredValueUps = value;
    }

    /**
     * 获取insuredValueUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInsuredValueUps() {
        return insuredValueUps;
    }

    /**
     * 设置insuredValueUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInsuredValueUps(Double value) {
        this.insuredValueUps = value;
    }

    /**
     * 获取reference1Ups属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference1Ups() {
        return reference1Ups;
    }

    /**
     * 设置reference1Ups属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference1Ups(String value) {
        this.reference1Ups = value;
    }

    /**
     * 获取reference2Ups属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference2Ups() {
        return reference2Ups;
    }

    /**
     * 设置reference2Ups属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference2Ups(String value) {
        this.reference2Ups = value;
    }

    /**
     * 获取packageLengthUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageLengthUps() {
        return packageLengthUps;
    }

    /**
     * 设置packageLengthUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageLengthUps(Long value) {
        this.packageLengthUps = value;
    }

    /**
     * 获取packageWidthUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageWidthUps() {
        return packageWidthUps;
    }

    /**
     * 设置packageWidthUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageWidthUps(Long value) {
        this.packageWidthUps = value;
    }

    /**
     * 获取packageHeightUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageHeightUps() {
        return packageHeightUps;
    }

    /**
     * 设置packageHeightUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageHeightUps(Long value) {
        this.packageHeightUps = value;
    }

    /**
     * 获取additionalHandlingUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalHandlingUps() {
        return additionalHandlingUps;
    }

    /**
     * 设置additionalHandlingUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalHandlingUps(Boolean value) {
        this.additionalHandlingUps = value;
    }

    /**
     * 获取useCodUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCodUps() {
        return useCodUps;
    }

    /**
     * 设置useCodUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCodUps(Boolean value) {
        this.useCodUps = value;
    }

    /**
     * 获取codAmountUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCodAmountUps() {
        return codAmountUps;
    }

    /**
     * 设置codAmountUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCodAmountUps(Double value) {
        this.codAmountUps = value;
    }

    /**
     * 获取codMethodUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUpsCodMethodUps }
     *     
     */
    public ItemFulfillmentPackageUpsCodMethodUps getCodMethodUps() {
        return codMethodUps;
    }

    /**
     * 设置codMethodUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUpsCodMethodUps }
     *     
     */
    public void setCodMethodUps(ItemFulfillmentPackageUpsCodMethodUps value) {
        this.codMethodUps = value;
    }

    /**
     * 获取deliveryConfUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUpsDeliveryConfUps }
     *     
     */
    public ItemFulfillmentPackageUpsDeliveryConfUps getDeliveryConfUps() {
        return deliveryConfUps;
    }

    /**
     * 设置deliveryConfUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUpsDeliveryConfUps }
     *     
     */
    public void setDeliveryConfUps(ItemFulfillmentPackageUpsDeliveryConfUps value) {
        this.deliveryConfUps = value;
    }

}
