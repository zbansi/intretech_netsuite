
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
 * <p>Location complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取parent属性的值。
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
     * 设置parent属性的值。
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
     * 获取includeChildren属性的值。
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
     * 设置includeChildren属性的值。
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
     * 获取subsidiaryList属性的值。
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
     * 设置subsidiaryList属性的值。
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
     * 获取tranPrefix属性的值。
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
     * 设置tranPrefix属性的值。
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
     * 获取mainAddress属性的值。
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
     * 设置mainAddress属性的值。
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
     * 获取returnAddress属性的值。
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
     * 设置returnAddress属性的值。
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
     * 获取locationType属性的值。
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
     * 设置locationType属性的值。
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
     * 获取timeZone属性的值。
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
     * 设置timeZone属性的值。
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
     * 获取latitude属性的值。
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
     * 设置latitude属性的值。
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
     * 获取longitude属性的值。
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
     * 设置longitude属性的值。
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
     * 获取logo属性的值。
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
     * 设置logo属性的值。
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
     * 获取useBins属性的值。
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
     * 设置useBins属性的值。
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
     * 获取makeInventoryAvailable属性的值。
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
     * 设置makeInventoryAvailable属性的值。
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
     * 获取makeInventoryAvailableStore属性的值。
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
     * 设置makeInventoryAvailableStore属性的值。
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
     * 获取geolocationMethod属性的值。
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
     * 设置geolocationMethod属性的值。
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
     * 获取autoAssignmentRegionSetting属性的值。
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
     * 设置autoAssignmentRegionSetting属性的值。
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
     * 获取nextPickupCutOffTime属性的值。
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
     * 设置nextPickupCutOffTime属性的值。
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
     * 获取bufferStock属性的值。
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
     * 设置bufferStock属性的值。
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
     * 获取allowStorePickup属性的值。
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
     * 设置allowStorePickup属性的值。
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
     * 获取storePickupBufferStock属性的值。
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
     * 设置storePickupBufferStock属性的值。
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
     * 获取dailyShippingCapacity属性的值。
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
     * 设置dailyShippingCapacity属性的值。
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
     * 获取totalShippingCapacity属性的值。
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
     * 设置totalShippingCapacity属性的值。
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
     * 获取includeLocationRegionsList属性的值。
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
     * 设置includeLocationRegionsList属性的值。
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
     * 获取excludeLocationRegionsList属性的值。
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
     * 设置excludeLocationRegionsList属性的值。
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
     * 获取businessHoursList属性的值。
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
     * 设置businessHoursList属性的值。
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
     * 获取classTranslationList属性的值。
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
     * 设置classTranslationList属性的值。
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
