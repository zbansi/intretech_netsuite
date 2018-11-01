
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.accounting_2018_2.types.LocationAutoAssignmentRegionSetting;
import com.netsuite.webservices.lists.accounting_2018_2.types.LocationGeolocationMethod;
import com.netsuite.webservices.lists.accounting_2018_2.types.LocationTimeZone;
import com.netsuite.webservices.lists.accounting_2018_2.types.LocationType;
import com.netsuite.webservices.platform.common_2018_2.Address;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.RecordRefList;


/**
 * <p>Location complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Location">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="includeChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subsidiaryList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tranPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainAddress" type="{urn:common_2018_2.platform.webservices.netsuite.com}Address" minOccurs="0"/>
 *         &lt;element name="returnAddress" type="{urn:common_2018_2.platform.webservices.netsuite.com}Address" minOccurs="0"/>
 *         &lt;element name="locationType" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}LocationType" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}LocationTimeZone" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="logo" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="useBins" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="makeInventoryAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="makeInventoryAvailableStore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="geolocationMethod" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}LocationGeolocationMethod" minOccurs="0"/>
 *         &lt;element name="autoAssignmentRegionSetting" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}LocationAutoAssignmentRegionSetting" minOccurs="0"/>
 *         &lt;element name="nextPickupCutOffTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bufferStock" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="allowStorePickup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="storePickupBufferStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dailyShippingCapacity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalShippingCapacity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="includeLocationRegionsList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}LocationRegionsList" minOccurs="0"/>
 *         &lt;element name="excludeLocationRegionsList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}LocationRegionsList" minOccurs="0"/>
 *         &lt;element name="businessHoursList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}LocationBusinessHoursList" minOccurs="0"/>
 *         &lt;element name="classTranslationList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ClassTranslationList" minOccurs="0"/>
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
@XmlType(name = "Location", propOrder = {
    "name",
    "parent",
    "includeChildren",
    "subsidiaryList",
    "isInactive",
    "tranPrefix",
    "mainAddress",
    "returnAddress",
    "locationType",
    "timeZone",
    "latitude",
    "longitude",
    "logo",
    "useBins",
    "makeInventoryAvailable",
    "makeInventoryAvailableStore",
    "geolocationMethod",
    "autoAssignmentRegionSetting",
    "nextPickupCutOffTime",
    "bufferStock",
    "allowStorePickup",
    "storePickupBufferStock",
    "dailyShippingCapacity",
    "totalShippingCapacity",
    "includeLocationRegionsList",
    "excludeLocationRegionsList",
    "businessHoursList",
    "classTranslationList",
    "customFieldList"
})
public class Location
    extends Record
{

    protected String name;
    protected RecordRef parent;
    protected Boolean includeChildren;
    protected RecordRefList subsidiaryList;
    protected Boolean isInactive;
    protected String tranPrefix;
    protected Address mainAddress;
    protected Address returnAddress;
    @XmlSchemaType(name = "string")
    protected LocationType locationType;
    @XmlSchemaType(name = "string")
    protected LocationTimeZone timeZone;
    protected Double latitude;
    protected Double longitude;
    protected RecordRef logo;
    protected Boolean useBins;
    protected Boolean makeInventoryAvailable;
    protected Boolean makeInventoryAvailableStore;
    @XmlSchemaType(name = "string")
    protected LocationGeolocationMethod geolocationMethod;
    @XmlSchemaType(name = "string")
    protected LocationAutoAssignmentRegionSetting autoAssignmentRegionSetting;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextPickupCutOffTime;
    protected Long bufferStock;
    protected Boolean allowStorePickup;
    protected Double storePickupBufferStock;
    protected Long dailyShippingCapacity;
    protected Long totalShippingCapacity;
    protected LocationRegionsList includeLocationRegionsList;
    protected LocationRegionsList excludeLocationRegionsList;
    protected LocationBusinessHoursList businessHoursList;
    protected ClassTranslationList classTranslationList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

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
     * ��ȡparent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getParent() {
        return parent;
    }

    /**
     * ����parent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setParent(RecordRef value) {
        this.parent = value;
    }

    /**
     * ��ȡincludeChildren���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeChildren() {
        return includeChildren;
    }

    /**
     * ����includeChildren���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeChildren(Boolean value) {
        this.includeChildren = value;
    }

    /**
     * ��ȡsubsidiaryList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }

    /**
     * ����subsidiaryList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setSubsidiaryList(RecordRefList value) {
        this.subsidiaryList = value;
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
     * ��ȡtranPrefix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranPrefix() {
        return tranPrefix;
    }

    /**
     * ����tranPrefix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranPrefix(String value) {
        this.tranPrefix = value;
    }

    /**
     * ��ȡmainAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getMainAddress() {
        return mainAddress;
    }

    /**
     * ����mainAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setMainAddress(Address value) {
        this.mainAddress = value;
    }

    /**
     * ��ȡreturnAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getReturnAddress() {
        return returnAddress;
    }

    /**
     * ����returnAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setReturnAddress(Address value) {
        this.returnAddress = value;
    }

    /**
     * ��ȡlocationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocationType() {
        return locationType;
    }

    /**
     * ����locationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocationType(LocationType value) {
        this.locationType = value;
    }

    /**
     * ��ȡtimeZone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LocationTimeZone }
     *     
     */
    public LocationTimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * ����timeZone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTimeZone }
     *     
     */
    public void setTimeZone(LocationTimeZone value) {
        this.timeZone = value;
    }

    /**
     * ��ȡlatitude���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * ����latitude���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * ��ȡlongitude���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * ����longitude���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * ��ȡlogo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLogo() {
        return logo;
    }

    /**
     * ����logo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLogo(RecordRef value) {
        this.logo = value;
    }

    /**
     * ��ȡuseBins���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseBins() {
        return useBins;
    }

    /**
     * ����useBins���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseBins(Boolean value) {
        this.useBins = value;
    }

    /**
     * ��ȡmakeInventoryAvailable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMakeInventoryAvailable() {
        return makeInventoryAvailable;
    }

    /**
     * ����makeInventoryAvailable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMakeInventoryAvailable(Boolean value) {
        this.makeInventoryAvailable = value;
    }

    /**
     * ��ȡmakeInventoryAvailableStore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMakeInventoryAvailableStore() {
        return makeInventoryAvailableStore;
    }

    /**
     * ����makeInventoryAvailableStore���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMakeInventoryAvailableStore(Boolean value) {
        this.makeInventoryAvailableStore = value;
    }

    /**
     * ��ȡgeolocationMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LocationGeolocationMethod }
     *     
     */
    public LocationGeolocationMethod getGeolocationMethod() {
        return geolocationMethod;
    }

    /**
     * ����geolocationMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LocationGeolocationMethod }
     *     
     */
    public void setGeolocationMethod(LocationGeolocationMethod value) {
        this.geolocationMethod = value;
    }

    /**
     * ��ȡautoAssignmentRegionSetting���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LocationAutoAssignmentRegionSetting }
     *     
     */
    public LocationAutoAssignmentRegionSetting getAutoAssignmentRegionSetting() {
        return autoAssignmentRegionSetting;
    }

    /**
     * ����autoAssignmentRegionSetting���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LocationAutoAssignmentRegionSetting }
     *     
     */
    public void setAutoAssignmentRegionSetting(LocationAutoAssignmentRegionSetting value) {
        this.autoAssignmentRegionSetting = value;
    }

    /**
     * ��ȡnextPickupCutOffTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextPickupCutOffTime() {
        return nextPickupCutOffTime;
    }

    /**
     * ����nextPickupCutOffTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPickupCutOffTime(XMLGregorianCalendar value) {
        this.nextPickupCutOffTime = value;
    }

    /**
     * ��ȡbufferStock���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBufferStock() {
        return bufferStock;
    }

    /**
     * ����bufferStock���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBufferStock(Long value) {
        this.bufferStock = value;
    }

    /**
     * ��ȡallowStorePickup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowStorePickup() {
        return allowStorePickup;
    }

    /**
     * ����allowStorePickup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowStorePickup(Boolean value) {
        this.allowStorePickup = value;
    }

    /**
     * ��ȡstorePickupBufferStock���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStorePickupBufferStock() {
        return storePickupBufferStock;
    }

    /**
     * ����storePickupBufferStock���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStorePickupBufferStock(Double value) {
        this.storePickupBufferStock = value;
    }

    /**
     * ��ȡdailyShippingCapacity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDailyShippingCapacity() {
        return dailyShippingCapacity;
    }

    /**
     * ����dailyShippingCapacity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDailyShippingCapacity(Long value) {
        this.dailyShippingCapacity = value;
    }

    /**
     * ��ȡtotalShippingCapacity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalShippingCapacity() {
        return totalShippingCapacity;
    }

    /**
     * ����totalShippingCapacity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalShippingCapacity(Long value) {
        this.totalShippingCapacity = value;
    }

    /**
     * ��ȡincludeLocationRegionsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LocationRegionsList }
     *     
     */
    public LocationRegionsList getIncludeLocationRegionsList() {
        return includeLocationRegionsList;
    }

    /**
     * ����includeLocationRegionsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LocationRegionsList }
     *     
     */
    public void setIncludeLocationRegionsList(LocationRegionsList value) {
        this.includeLocationRegionsList = value;
    }

    /**
     * ��ȡexcludeLocationRegionsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LocationRegionsList }
     *     
     */
    public LocationRegionsList getExcludeLocationRegionsList() {
        return excludeLocationRegionsList;
    }

    /**
     * ����excludeLocationRegionsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LocationRegionsList }
     *     
     */
    public void setExcludeLocationRegionsList(LocationRegionsList value) {
        this.excludeLocationRegionsList = value;
    }

    /**
     * ��ȡbusinessHoursList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LocationBusinessHoursList }
     *     
     */
    public LocationBusinessHoursList getBusinessHoursList() {
        return businessHoursList;
    }

    /**
     * ����businessHoursList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LocationBusinessHoursList }
     *     
     */
    public void setBusinessHoursList(LocationBusinessHoursList value) {
        this.businessHoursList = value;
    }

    /**
     * ��ȡclassTranslationList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ClassTranslationList }
     *     
     */
    public ClassTranslationList getClassTranslationList() {
        return classTranslationList;
    }

    /**
     * ����classTranslationList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ClassTranslationList }
     *     
     */
    public void setClassTranslationList(ClassTranslationList value) {
        this.classTranslationList = value;
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
