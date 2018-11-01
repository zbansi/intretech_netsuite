
package com.netsuite.webservices.lists.marketing_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.marketing_2018_2.types.PromotionCodeApplyDiscountTo;
import com.netsuite.webservices.lists.marketing_2018_2.types.PromotionCodeUseType;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.RecordRefList;


/**
 * <p>PromotionCode complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PromotionCode">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="implementation" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="useType" type="{urn:types.marketing_2018_2.lists.webservices.netsuite.com}PromotionCodeUseType" minOccurs="0"/>
 *         &lt;element name="displayLineDiscounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberToGenerate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="discount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="applyDiscountTo" type="{urn:types.marketing_2018_2.lists.webservices.netsuite.com}PromotionCodeApplyDiscountTo" minOccurs="0"/>
 *         &lt;element name="freeShipMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="minimumOrderAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="currencyList" type="{urn:marketing_2018_2.lists.webservices.netsuite.com}PromotionCodeCurrencyList" minOccurs="0"/>
 *         &lt;element name="excludeItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemsList" type="{urn:marketing_2018_2.lists.webservices.netsuite.com}PromotionCodeItemsList" minOccurs="0"/>
 *         &lt;element name="partnersList" type="{urn:marketing_2018_2.lists.webservices.netsuite.com}PromotionCodePartnersList" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2018_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionCode", propOrder = {
    "implementation",
    "customForm",
    "useType",
    "displayLineDiscounts",
    "code",
    "codePattern",
    "numberToGenerate",
    "description",
    "locationList",
    "isInactive",
    "discount",
    "rate",
    "discountType",
    "applyDiscountTo",
    "freeShipMethod",
    "minimumOrderAmount",
    "startDate",
    "endDate",
    "isPublic",
    "currencyList",
    "excludeItems",
    "name",
    "itemsList",
    "partnersList",
    "customFieldList"
})
public class PromotionCode
    extends Record
{

    protected RecordRef implementation;
    protected RecordRef customForm;
    @XmlSchemaType(name = "string")
    protected PromotionCodeUseType useType;
    protected Boolean displayLineDiscounts;
    protected String code;
    protected String codePattern;
    protected Long numberToGenerate;
    protected String description;
    protected RecordRefList locationList;
    protected Boolean isInactive;
    protected RecordRef discount;
    protected String rate;
    protected Boolean discountType;
    @XmlSchemaType(name = "string")
    protected PromotionCodeApplyDiscountTo applyDiscountTo;
    protected RecordRef freeShipMethod;
    protected Double minimumOrderAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Boolean isPublic;
    protected PromotionCodeCurrencyList currencyList;
    protected Boolean excludeItems;
    protected String name;
    protected PromotionCodeItemsList itemsList;
    protected PromotionCodePartnersList partnersList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * ��ȡimplementation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getImplementation() {
        return implementation;
    }

    /**
     * ����implementation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setImplementation(RecordRef value) {
        this.implementation = value;
    }

    /**
     * ��ȡcustomForm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * ����customForm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

    /**
     * ��ȡuseType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodeUseType }
     *     
     */
    public PromotionCodeUseType getUseType() {
        return useType;
    }

    /**
     * ����useType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodeUseType }
     *     
     */
    public void setUseType(PromotionCodeUseType value) {
        this.useType = value;
    }

    /**
     * ��ȡdisplayLineDiscounts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayLineDiscounts() {
        return displayLineDiscounts;
    }

    /**
     * ����displayLineDiscounts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayLineDiscounts(Boolean value) {
        this.displayLineDiscounts = value;
    }

    /**
     * ��ȡcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * ����code���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * ��ȡcodePattern���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePattern() {
        return codePattern;
    }

    /**
     * ����codePattern���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePattern(String value) {
        this.codePattern = value;
    }

    /**
     * ��ȡnumberToGenerate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberToGenerate() {
        return numberToGenerate;
    }

    /**
     * ����numberToGenerate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberToGenerate(Long value) {
        this.numberToGenerate = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡlocationList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getLocationList() {
        return locationList;
    }

    /**
     * ����locationList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setLocationList(RecordRefList value) {
        this.locationList = value;
    }

    /**
     * ��ȡisInactive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * ����isInactive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * ��ȡdiscount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDiscount() {
        return discount;
    }

    /**
     * ����discount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDiscount(RecordRef value) {
        this.discount = value;
    }

    /**
     * ��ȡrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * ����rate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * ��ȡdiscountType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscountType() {
        return discountType;
    }

    /**
     * ����discountType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscountType(Boolean value) {
        this.discountType = value;
    }

    /**
     * ��ȡapplyDiscountTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodeApplyDiscountTo }
     *     
     */
    public PromotionCodeApplyDiscountTo getApplyDiscountTo() {
        return applyDiscountTo;
    }

    /**
     * ����applyDiscountTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodeApplyDiscountTo }
     *     
     */
    public void setApplyDiscountTo(PromotionCodeApplyDiscountTo value) {
        this.applyDiscountTo = value;
    }

    /**
     * ��ȡfreeShipMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFreeShipMethod() {
        return freeShipMethod;
    }

    /**
     * ����freeShipMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFreeShipMethod(RecordRef value) {
        this.freeShipMethod = value;
    }

    /**
     * ��ȡminimumOrderAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumOrderAmount() {
        return minimumOrderAmount;
    }

    /**
     * ����minimumOrderAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumOrderAmount(Double value) {
        this.minimumOrderAmount = value;
    }

    /**
     * ��ȡstartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * ����startDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * ��ȡendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * ����endDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * ��ȡisPublic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPublic() {
        return isPublic;
    }

    /**
     * ����isPublic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPublic(Boolean value) {
        this.isPublic = value;
    }

    /**
     * ��ȡcurrencyList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodeCurrencyList }
     *     
     */
    public PromotionCodeCurrencyList getCurrencyList() {
        return currencyList;
    }

    /**
     * ����currencyList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodeCurrencyList }
     *     
     */
    public void setCurrencyList(PromotionCodeCurrencyList value) {
        this.currencyList = value;
    }

    /**
     * ��ȡexcludeItems���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeItems() {
        return excludeItems;
    }

    /**
     * ����excludeItems���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeItems(Boolean value) {
        this.excludeItems = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡitemsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodeItemsList }
     *     
     */
    public PromotionCodeItemsList getItemsList() {
        return itemsList;
    }

    /**
     * ����itemsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodeItemsList }
     *     
     */
    public void setItemsList(PromotionCodeItemsList value) {
        this.itemsList = value;
    }

    /**
     * ��ȡpartnersList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodePartnersList }
     *     
     */
    public PromotionCodePartnersList getPartnersList() {
        return partnersList;
    }

    /**
     * ����partnersList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodePartnersList }
     *     
     */
    public void setPartnersList(PromotionCodePartnersList value) {
        this.partnersList = value;
    }

    /**
     * ��ȡcustomFieldList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * ����customFieldList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
    }

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
     * ��ȡexternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * ����externalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
