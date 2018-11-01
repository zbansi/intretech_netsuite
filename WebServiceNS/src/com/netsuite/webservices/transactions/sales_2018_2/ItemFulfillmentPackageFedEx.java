
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
 * <p>ItemFulfillmentPackageFedEx complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡpackageWeightFedEx���Ե�ֵ��
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
     * ����packageWeightFedEx���Ե�ֵ��
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
     * ��ȡdryIceWeightFedEx���Ե�ֵ��
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
     * ����dryIceWeightFedEx���Ե�ֵ��
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
     * ��ȡpackageTrackingNumberFedEx���Ե�ֵ��
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
     * ����packageTrackingNumberFedEx���Ե�ֵ��
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
     * ��ȡpackagingFedEx���Ե�ֵ��
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
     * ����packagingFedEx���Ե�ֵ��
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
     * ��ȡadmPackageTypeFedEx���Ե�ֵ��
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
     * ����admPackageTypeFedEx���Ե�ֵ��
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
     * ��ȡisNonStandardContainerFedEx���Ե�ֵ��
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
     * ����isNonStandardContainerFedEx���Ե�ֵ��
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
     * ��ȡisAlcoholFedEx���Ե�ֵ��
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
     * ����isAlcoholFedEx���Ե�ֵ��
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
     * ��ȡalcoholRecipientTypeFedEx���Ե�ֵ��
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
     * ����alcoholRecipientTypeFedEx���Ե�ֵ��
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
     * ��ȡisNonHazLithiumFedEx���Ե�ֵ��
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
     * ����isNonHazLithiumFedEx���Ե�ֵ��
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
     * ��ȡinsuredValueFedEx���Ե�ֵ��
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
     * ����insuredValueFedEx���Ե�ֵ��
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
     * ��ȡuseInsuredValueFedEx���Ե�ֵ��
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
     * ����useInsuredValueFedEx���Ե�ֵ��
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
     * ��ȡreference1FedEx���Ե�ֵ��
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
     * ����reference1FedEx���Ե�ֵ��
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
     * ��ȡpriorityAlertTypeFedEx���Ե�ֵ��
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
     * ����priorityAlertTypeFedEx���Ե�ֵ��
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
     * ��ȡpriorityAlertContentFedEx���Ե�ֵ��
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
     * ����priorityAlertContentFedEx���Ե�ֵ��
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
     * ��ȡpackageLengthFedEx���Ե�ֵ��
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
     * ����packageLengthFedEx���Ե�ֵ��
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
     * ��ȡpackageWidthFedEx���Ե�ֵ��
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
     * ����packageWidthFedEx���Ե�ֵ��
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
     * ��ȡpackageHeightFedEx���Ե�ֵ��
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
     * ����packageHeightFedEx���Ե�ֵ��
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
     * ��ȡuseCodFedEx���Ե�ֵ��
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
     * ����useCodFedEx���Ե�ֵ��
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
     * ��ȡcodAmountFedEx���Ե�ֵ��
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
     * ����codAmountFedEx���Ե�ֵ��
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
     * ��ȡcodMethodFedEx���Ե�ֵ��
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
     * ����codMethodFedEx���Ե�ֵ��
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
     * ��ȡcodFreightTypeFedEx���Ե�ֵ��
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
     * ����codFreightTypeFedEx���Ե�ֵ��
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
     * ��ȡdeliveryConfFedEx���Ե�ֵ��
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
     * ����deliveryConfFedEx���Ե�ֵ��
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
     * ��ȡsignatureOptionsFedEx���Ե�ֵ��
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
     * ����signatureOptionsFedEx���Ե�ֵ��
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
     * ��ȡsignatureReleaseFedEx���Ե�ֵ��
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
     * ����signatureReleaseFedEx���Ե�ֵ��
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
     * ��ȡauthorizationNumberFedEx���Ե�ֵ��
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
     * ����authorizationNumberFedEx���Ե�ֵ��
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
