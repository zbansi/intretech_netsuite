
package com.netsuite.webservices.transactions.sales_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageUpsCodMethodUps;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageUpsDeliveryConfUps;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageUpsPackagingUps;


/**
 * <p>ItemFulfillmentPackageUps complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡpackageWeightUps���Ե�ֵ��
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
     * ����packageWeightUps���Ե�ֵ��
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
     * ��ȡpackageDescrUps���Ե�ֵ��
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
     * ����packageDescrUps���Ե�ֵ��
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
     * ��ȡpackageTrackingNumberUps���Ե�ֵ��
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
     * ����packageTrackingNumberUps���Ե�ֵ��
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
     * ��ȡpackagingUps���Ե�ֵ��
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
     * ����packagingUps���Ե�ֵ��
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
     * ��ȡuseInsuredValueUps���Ե�ֵ��
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
     * ����useInsuredValueUps���Ե�ֵ��
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
     * ��ȡinsuredValueUps���Ե�ֵ��
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
     * ����insuredValueUps���Ե�ֵ��
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
     * ��ȡreference1Ups���Ե�ֵ��
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
     * ����reference1Ups���Ե�ֵ��
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
     * ��ȡreference2Ups���Ե�ֵ��
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
     * ����reference2Ups���Ե�ֵ��
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
     * ��ȡpackageLengthUps���Ե�ֵ��
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
     * ����packageLengthUps���Ե�ֵ��
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
     * ��ȡpackageWidthUps���Ե�ֵ��
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
     * ����packageWidthUps���Ե�ֵ��
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
     * ��ȡpackageHeightUps���Ե�ֵ��
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
     * ����packageHeightUps���Ե�ֵ��
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
     * ��ȡadditionalHandlingUps���Ե�ֵ��
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
     * ����additionalHandlingUps���Ե�ֵ��
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
     * ��ȡuseCodUps���Ե�ֵ��
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
     * ����useCodUps���Ե�ֵ��
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
     * ��ȡcodAmountUps���Ե�ֵ��
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
     * ����codAmountUps���Ե�ֵ��
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
     * ��ȡcodMethodUps���Ե�ֵ��
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
     * ����codMethodUps���Ե�ֵ��
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
     * ��ȡdeliveryConfUps���Ե�ֵ��
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
     * ����deliveryConfUps���Ե�ֵ��
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
