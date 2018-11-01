
package com.netsuite.webservices.transactions.sales_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageUspsDeliveryConfUsps;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageUspsPackagingUsps;


/**
 * <p>ItemFulfillmentPackageUsps complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemFulfillmentPackageUsps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageWeightUsps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="packageDescrUsps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageTrackingNumberUsps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packagingUsps" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUspsPackagingUsps" minOccurs="0"/>
 *         &lt;element name="useInsuredValueUsps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="insuredValueUsps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="reference1Usps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference2Usps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageLengthUsps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="packageWidthUsps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="packageHeightUsps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deliveryConfUsps" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUspsDeliveryConfUsps" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemFulfillmentPackageUsps", propOrder = {
    "packageWeightUsps",
    "packageDescrUsps",
    "packageTrackingNumberUsps",
    "packagingUsps",
    "useInsuredValueUsps",
    "insuredValueUsps",
    "reference1Usps",
    "reference2Usps",
    "packageLengthUsps",
    "packageWidthUsps",
    "packageHeightUsps",
    "deliveryConfUsps"
})
public class ItemFulfillmentPackageUsps {

    protected Double packageWeightUsps;
    protected String packageDescrUsps;
    protected String packageTrackingNumberUsps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageUspsPackagingUsps packagingUsps;
    protected Boolean useInsuredValueUsps;
    protected Double insuredValueUsps;
    protected String reference1Usps;
    protected String reference2Usps;
    protected Long packageLengthUsps;
    protected Long packageWidthUsps;
    protected Long packageHeightUsps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageUspsDeliveryConfUsps deliveryConfUsps;

    /**
     * 获取packageWeightUsps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPackageWeightUsps() {
        return packageWeightUsps;
    }

    /**
     * 设置packageWeightUsps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPackageWeightUsps(Double value) {
        this.packageWeightUsps = value;
    }

    /**
     * 获取packageDescrUsps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDescrUsps() {
        return packageDescrUsps;
    }

    /**
     * 设置packageDescrUsps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDescrUsps(String value) {
        this.packageDescrUsps = value;
    }

    /**
     * 获取packageTrackingNumberUsps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTrackingNumberUsps() {
        return packageTrackingNumberUsps;
    }

    /**
     * 设置packageTrackingNumberUsps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTrackingNumberUsps(String value) {
        this.packageTrackingNumberUsps = value;
    }

    /**
     * 获取packagingUsps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUspsPackagingUsps }
     *     
     */
    public ItemFulfillmentPackageUspsPackagingUsps getPackagingUsps() {
        return packagingUsps;
    }

    /**
     * 设置packagingUsps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUspsPackagingUsps }
     *     
     */
    public void setPackagingUsps(ItemFulfillmentPackageUspsPackagingUsps value) {
        this.packagingUsps = value;
    }

    /**
     * 获取useInsuredValueUsps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseInsuredValueUsps() {
        return useInsuredValueUsps;
    }

    /**
     * 设置useInsuredValueUsps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseInsuredValueUsps(Boolean value) {
        this.useInsuredValueUsps = value;
    }

    /**
     * 获取insuredValueUsps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInsuredValueUsps() {
        return insuredValueUsps;
    }

    /**
     * 设置insuredValueUsps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInsuredValueUsps(Double value) {
        this.insuredValueUsps = value;
    }

    /**
     * 获取reference1Usps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference1Usps() {
        return reference1Usps;
    }

    /**
     * 设置reference1Usps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference1Usps(String value) {
        this.reference1Usps = value;
    }

    /**
     * 获取reference2Usps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference2Usps() {
        return reference2Usps;
    }

    /**
     * 设置reference2Usps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference2Usps(String value) {
        this.reference2Usps = value;
    }

    /**
     * 获取packageLengthUsps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageLengthUsps() {
        return packageLengthUsps;
    }

    /**
     * 设置packageLengthUsps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageLengthUsps(Long value) {
        this.packageLengthUsps = value;
    }

    /**
     * 获取packageWidthUsps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageWidthUsps() {
        return packageWidthUsps;
    }

    /**
     * 设置packageWidthUsps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageWidthUsps(Long value) {
        this.packageWidthUsps = value;
    }

    /**
     * 获取packageHeightUsps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageHeightUsps() {
        return packageHeightUsps;
    }

    /**
     * 设置packageHeightUsps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageHeightUsps(Long value) {
        this.packageHeightUsps = value;
    }

    /**
     * 获取deliveryConfUsps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUspsDeliveryConfUsps }
     *     
     */
    public ItemFulfillmentPackageUspsDeliveryConfUsps getDeliveryConfUsps() {
        return deliveryConfUsps;
    }

    /**
     * 设置deliveryConfUsps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUspsDeliveryConfUsps }
     *     
     */
    public void setDeliveryConfUsps(ItemFulfillmentPackageUspsDeliveryConfUsps value) {
        this.deliveryConfUsps = value;
    }

}
