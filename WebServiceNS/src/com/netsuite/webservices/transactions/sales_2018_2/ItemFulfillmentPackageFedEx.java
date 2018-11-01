
package com.netsuite.webservices.transactions.sales_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.types.AlcoholRecipientType;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageFedExAdmPackageTypeFedEx;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageFedExCodFreightTypeFedEx;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageFedExCodMethodFedEx;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageFedExDeliveryConfFedEx;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageFedExPackagingFedEx;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageFedExPriorityAlertTypeFedEx;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentPackageFedExSignatureOptionsFedEx;


/**
 * <p>ItemFulfillmentPackageFedEx complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemFulfillmentPackageFedEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageWeightFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dryIceWeightFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="packageTrackingNumberFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packagingFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExPackagingFedEx" minOccurs="0"/>
 *         &lt;element name="admPackageTypeFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExAdmPackageTypeFedEx" minOccurs="0"/>
 *         &lt;element name="isNonStandardContainerFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isAlcoholFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="alcoholRecipientTypeFedEx" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}AlcoholRecipientType" minOccurs="0"/>
 *         &lt;element name="isNonHazLithiumFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="insuredValueFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="useInsuredValueFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reference1FedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityAlertTypeFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExPriorityAlertTypeFedEx" minOccurs="0"/>
 *         &lt;element name="priorityAlertContentFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageLengthFedEx" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="packageWidthFedEx" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="packageHeightFedEx" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="useCodFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="codAmountFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="codMethodFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExCodMethodFedEx" minOccurs="0"/>
 *         &lt;element name="codFreightTypeFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExCodFreightTypeFedEx" minOccurs="0"/>
 *         &lt;element name="deliveryConfFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExDeliveryConfFedEx" minOccurs="0"/>
 *         &lt;element name="signatureOptionsFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExSignatureOptionsFedEx" minOccurs="0"/>
 *         &lt;element name="signatureReleaseFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationNumberFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemFulfillmentPackageFedEx", propOrder = {
    "packageWeightFedEx",
    "dryIceWeightFedEx",
    "packageTrackingNumberFedEx",
    "packagingFedEx",
    "admPackageTypeFedEx",
    "isNonStandardContainerFedEx",
    "isAlcoholFedEx",
    "alcoholRecipientTypeFedEx",
    "isNonHazLithiumFedEx",
    "insuredValueFedEx",
    "useInsuredValueFedEx",
    "reference1FedEx",
    "priorityAlertTypeFedEx",
    "priorityAlertContentFedEx",
    "packageLengthFedEx",
    "packageWidthFedEx",
    "packageHeightFedEx",
    "useCodFedEx",
    "codAmountFedEx",
    "codMethodFedEx",
    "codFreightTypeFedEx",
    "deliveryConfFedEx",
    "signatureOptionsFedEx",
    "signatureReleaseFedEx",
    "authorizationNumberFedEx"
})
public class ItemFulfillmentPackageFedEx {

    protected Double packageWeightFedEx;
    protected Double dryIceWeightFedEx;
    protected String packageTrackingNumberFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExPackagingFedEx packagingFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExAdmPackageTypeFedEx admPackageTypeFedEx;
    protected Boolean isNonStandardContainerFedEx;
    protected Boolean isAlcoholFedEx;
    @XmlSchemaType(name = "string")
    protected AlcoholRecipientType alcoholRecipientTypeFedEx;
    protected Boolean isNonHazLithiumFedEx;
    protected Double insuredValueFedEx;
    protected Boolean useInsuredValueFedEx;
    protected String reference1FedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExPriorityAlertTypeFedEx priorityAlertTypeFedEx;
    protected String priorityAlertContentFedEx;
    protected Long packageLengthFedEx;
    protected Long packageWidthFedEx;
    protected Long packageHeightFedEx;
    protected Boolean useCodFedEx;
    protected Double codAmountFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExCodMethodFedEx codMethodFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExCodFreightTypeFedEx codFreightTypeFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExDeliveryConfFedEx deliveryConfFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExSignatureOptionsFedEx signatureOptionsFedEx;
    protected String signatureReleaseFedEx;
    protected String authorizationNumberFedEx;

    /**
     * 获取packageWeightFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPackageWeightFedEx() {
        return packageWeightFedEx;
    }

    /**
     * 设置packageWeightFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPackageWeightFedEx(Double value) {
        this.packageWeightFedEx = value;
    }

    /**
     * 获取dryIceWeightFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDryIceWeightFedEx() {
        return dryIceWeightFedEx;
    }

    /**
     * 设置dryIceWeightFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDryIceWeightFedEx(Double value) {
        this.dryIceWeightFedEx = value;
    }

    /**
     * 获取packageTrackingNumberFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTrackingNumberFedEx() {
        return packageTrackingNumberFedEx;
    }

    /**
     * 设置packageTrackingNumberFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTrackingNumberFedEx(String value) {
        this.packageTrackingNumberFedEx = value;
    }

    /**
     * 获取packagingFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExPackagingFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExPackagingFedEx getPackagingFedEx() {
        return packagingFedEx;
    }

    /**
     * 设置packagingFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExPackagingFedEx }
     *     
     */
    public void setPackagingFedEx(ItemFulfillmentPackageFedExPackagingFedEx value) {
        this.packagingFedEx = value;
    }

    /**
     * 获取admPackageTypeFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExAdmPackageTypeFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExAdmPackageTypeFedEx getAdmPackageTypeFedEx() {
        return admPackageTypeFedEx;
    }

    /**
     * 设置admPackageTypeFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExAdmPackageTypeFedEx }
     *     
     */
    public void setAdmPackageTypeFedEx(ItemFulfillmentPackageFedExAdmPackageTypeFedEx value) {
        this.admPackageTypeFedEx = value;
    }

    /**
     * 获取isNonStandardContainerFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNonStandardContainerFedEx() {
        return isNonStandardContainerFedEx;
    }

    /**
     * 设置isNonStandardContainerFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonStandardContainerFedEx(Boolean value) {
        this.isNonStandardContainerFedEx = value;
    }

    /**
     * 获取isAlcoholFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlcoholFedEx() {
        return isAlcoholFedEx;
    }

    /**
     * 设置isAlcoholFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlcoholFedEx(Boolean value) {
        this.isAlcoholFedEx = value;
    }

    /**
     * 获取alcoholRecipientTypeFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AlcoholRecipientType }
     *     
     */
    public AlcoholRecipientType getAlcoholRecipientTypeFedEx() {
        return alcoholRecipientTypeFedEx;
    }

    /**
     * 设置alcoholRecipientTypeFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AlcoholRecipientType }
     *     
     */
    public void setAlcoholRecipientTypeFedEx(AlcoholRecipientType value) {
        this.alcoholRecipientTypeFedEx = value;
    }

    /**
     * 获取isNonHazLithiumFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNonHazLithiumFedEx() {
        return isNonHazLithiumFedEx;
    }

    /**
     * 设置isNonHazLithiumFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonHazLithiumFedEx(Boolean value) {
        this.isNonHazLithiumFedEx = value;
    }

    /**
     * 获取insuredValueFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInsuredValueFedEx() {
        return insuredValueFedEx;
    }

    /**
     * 设置insuredValueFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInsuredValueFedEx(Double value) {
        this.insuredValueFedEx = value;
    }

    /**
     * 获取useInsuredValueFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseInsuredValueFedEx() {
        return useInsuredValueFedEx;
    }

    /**
     * 设置useInsuredValueFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseInsuredValueFedEx(Boolean value) {
        this.useInsuredValueFedEx = value;
    }

    /**
     * 获取reference1FedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference1FedEx() {
        return reference1FedEx;
    }

    /**
     * 设置reference1FedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference1FedEx(String value) {
        this.reference1FedEx = value;
    }

    /**
     * 获取priorityAlertTypeFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExPriorityAlertTypeFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExPriorityAlertTypeFedEx getPriorityAlertTypeFedEx() {
        return priorityAlertTypeFedEx;
    }

    /**
     * 设置priorityAlertTypeFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExPriorityAlertTypeFedEx }
     *     
     */
    public void setPriorityAlertTypeFedEx(ItemFulfillmentPackageFedExPriorityAlertTypeFedEx value) {
        this.priorityAlertTypeFedEx = value;
    }

    /**
     * 获取priorityAlertContentFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityAlertContentFedEx() {
        return priorityAlertContentFedEx;
    }

    /**
     * 设置priorityAlertContentFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityAlertContentFedEx(String value) {
        this.priorityAlertContentFedEx = value;
    }

    /**
     * 获取packageLengthFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageLengthFedEx() {
        return packageLengthFedEx;
    }

    /**
     * 设置packageLengthFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageLengthFedEx(Long value) {
        this.packageLengthFedEx = value;
    }

    /**
     * 获取packageWidthFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageWidthFedEx() {
        return packageWidthFedEx;
    }

    /**
     * 设置packageWidthFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageWidthFedEx(Long value) {
        this.packageWidthFedEx = value;
    }

    /**
     * 获取packageHeightFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageHeightFedEx() {
        return packageHeightFedEx;
    }

    /**
     * 设置packageHeightFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageHeightFedEx(Long value) {
        this.packageHeightFedEx = value;
    }

    /**
     * 获取useCodFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCodFedEx() {
        return useCodFedEx;
    }

    /**
     * 设置useCodFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCodFedEx(Boolean value) {
        this.useCodFedEx = value;
    }

    /**
     * 获取codAmountFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCodAmountFedEx() {
        return codAmountFedEx;
    }

    /**
     * 设置codAmountFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCodAmountFedEx(Double value) {
        this.codAmountFedEx = value;
    }

    /**
     * 获取codMethodFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExCodMethodFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExCodMethodFedEx getCodMethodFedEx() {
        return codMethodFedEx;
    }

    /**
     * 设置codMethodFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExCodMethodFedEx }
     *     
     */
    public void setCodMethodFedEx(ItemFulfillmentPackageFedExCodMethodFedEx value) {
        this.codMethodFedEx = value;
    }

    /**
     * 获取codFreightTypeFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExCodFreightTypeFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExCodFreightTypeFedEx getCodFreightTypeFedEx() {
        return codFreightTypeFedEx;
    }

    /**
     * 设置codFreightTypeFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExCodFreightTypeFedEx }
     *     
     */
    public void setCodFreightTypeFedEx(ItemFulfillmentPackageFedExCodFreightTypeFedEx value) {
        this.codFreightTypeFedEx = value;
    }

    /**
     * 获取deliveryConfFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExDeliveryConfFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExDeliveryConfFedEx getDeliveryConfFedEx() {
        return deliveryConfFedEx;
    }

    /**
     * 设置deliveryConfFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExDeliveryConfFedEx }
     *     
     */
    public void setDeliveryConfFedEx(ItemFulfillmentPackageFedExDeliveryConfFedEx value) {
        this.deliveryConfFedEx = value;
    }

    /**
     * 获取signatureOptionsFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExSignatureOptionsFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExSignatureOptionsFedEx getSignatureOptionsFedEx() {
        return signatureOptionsFedEx;
    }

    /**
     * 设置signatureOptionsFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExSignatureOptionsFedEx }
     *     
     */
    public void setSignatureOptionsFedEx(ItemFulfillmentPackageFedExSignatureOptionsFedEx value) {
        this.signatureOptionsFedEx = value;
    }

    /**
     * 获取signatureReleaseFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureReleaseFedEx() {
        return signatureReleaseFedEx;
    }

    /**
     * 设置signatureReleaseFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureReleaseFedEx(String value) {
        this.signatureReleaseFedEx = value;
    }

    /**
     * 获取authorizationNumberFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationNumberFedEx() {
        return authorizationNumberFedEx;
    }

    /**
     * 设置authorizationNumberFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationNumberFedEx(String value) {
        this.authorizationNumberFedEx = value;
    }

}
