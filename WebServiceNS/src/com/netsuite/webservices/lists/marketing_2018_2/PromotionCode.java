
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
 * <p>PromotionCode complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取implementation属性的值。
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
     * 设置implementation属性的值。
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
     * 获取customForm属性的值。
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
     * 设置customForm属性的值。
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
     * 获取useType属性的值。
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
     * 设置useType属性的值。
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
     * 获取displayLineDiscounts属性的值。
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
     * 设置displayLineDiscounts属性的值。
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
     * 获取code属性的值。
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
     * 设置code属性的值。
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
     * 获取codePattern属性的值。
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
     * 设置codePattern属性的值。
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
     * 获取numberToGenerate属性的值。
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
     * 设置numberToGenerate属性的值。
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
     * 获取description属性的值。
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
     * 设置description属性的值。
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
     * 获取locationList属性的值。
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
     * 设置locationList属性的值。
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
     * 获取isInactive属性的值。
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
     * 设置isInactive属性的值。
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
     * 获取discount属性的值。
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
     * 设置discount属性的值。
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
     * 获取rate属性的值。
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
     * 设置rate属性的值。
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
     * 获取discountType属性的值。
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
     * 设置discountType属性的值。
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
     * 获取applyDiscountTo属性的值。
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
     * 设置applyDiscountTo属性的值。
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
     * 获取freeShipMethod属性的值。
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
     * 设置freeShipMethod属性的值。
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
     * 获取minimumOrderAmount属性的值。
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
     * 设置minimumOrderAmount属性的值。
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
     * 获取startDate属性的值。
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
     * 设置startDate属性的值。
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
     * 获取endDate属性的值。
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
     * 设置endDate属性的值。
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
     * 获取isPublic属性的值。
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
     * 设置isPublic属性的值。
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
     * 获取currencyList属性的值。
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
     * 设置currencyList属性的值。
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
     * 获取excludeItems属性的值。
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
     * 设置excludeItems属性的值。
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
     * 获取name属性的值。
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
     * 设置name属性的值。
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
     * 获取itemsList属性的值。
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
     * 设置itemsList属性的值。
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
     * 获取partnersList属性的值。
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
     * 设置partnersList属性的值。
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
     * 获取customFieldList属性的值。
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
     * 设置customFieldList属性的值。
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
     * 获取internalId属性的值。
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
     * 设置internalId属性的值。
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
     * 获取externalId属性的值。
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
     * 设置externalId属性的值。
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
