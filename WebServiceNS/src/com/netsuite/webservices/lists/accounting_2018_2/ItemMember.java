
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.common_2018_2.types.ItemSource;
import com.netsuite.webservices.platform.common_2018_2.types.VsoeDeferral;
import com.netsuite.webservices.platform.common_2018_2.types.VsoePermitDiscount;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>ItemMember complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="componentYield" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bomQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="itemSource" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}ItemSource" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="memberUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vsoeDeferral" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}VsoeDeferral" minOccurs="0"/>
 *         &lt;element name="vsoePermitDiscount" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}VsoePermitDiscount" minOccurs="0"/>
 *         &lt;element name="vsoeDelivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="taxcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="obsoleteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="effectiveRevision" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="obsoleteRevision" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="memberKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemMember", propOrder = {
    "memberDescr",
    "componentYield",
    "bomQuantity",
    "itemSource",
    "quantity",
    "memberUnit",
    "vsoeDeferral",
    "vsoePermitDiscount",
    "vsoeDelivered",
    "taxSchedule",
    "taxcode",
    "item",
    "taxrate",
    "effectiveDate",
    "obsoleteDate",
    "effectiveRevision",
    "obsoleteRevision",
    "lineNumber",
    "memberKey"
})
public class ItemMember {

    protected String memberDescr;
    protected Double componentYield;
    protected Double bomQuantity;
    @XmlSchemaType(name = "string")
    protected ItemSource itemSource;
    protected Double quantity;
    protected String memberUnit;
    @XmlSchemaType(name = "string")
    protected VsoeDeferral vsoeDeferral;
    @XmlSchemaType(name = "string")
    protected VsoePermitDiscount vsoePermitDiscount;
    protected Boolean vsoeDelivered;
    protected RecordRef taxSchedule;
    protected String taxcode;
    protected RecordRef item;
    protected Double taxrate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar obsoleteDate;
    protected RecordRef effectiveRevision;
    protected RecordRef obsoleteRevision;
    protected Long lineNumber;
    protected String memberKey;

    /**
     * 获取memberDescr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberDescr() {
        return memberDescr;
    }

    /**
     * 设置memberDescr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberDescr(String value) {
        this.memberDescr = value;
    }

    /**
     * 获取componentYield属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getComponentYield() {
        return componentYield;
    }

    /**
     * 设置componentYield属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setComponentYield(Double value) {
        this.componentYield = value;
    }

    /**
     * 获取bomQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBomQuantity() {
        return bomQuantity;
    }

    /**
     * 设置bomQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBomQuantity(Double value) {
        this.bomQuantity = value;
    }

    /**
     * 获取itemSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSource }
     *     
     */
    public ItemSource getItemSource() {
        return itemSource;
    }

    /**
     * 设置itemSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSource }
     *     
     */
    public void setItemSource(ItemSource value) {
        this.itemSource = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * 获取memberUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberUnit() {
        return memberUnit;
    }

    /**
     * 设置memberUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberUnit(String value) {
        this.memberUnit = value;
    }

    /**
     * 获取vsoeDeferral属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VsoeDeferral }
     *     
     */
    public VsoeDeferral getVsoeDeferral() {
        return vsoeDeferral;
    }

    /**
     * 设置vsoeDeferral属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VsoeDeferral }
     *     
     */
    public void setVsoeDeferral(VsoeDeferral value) {
        this.vsoeDeferral = value;
    }

    /**
     * 获取vsoePermitDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VsoePermitDiscount }
     *     
     */
    public VsoePermitDiscount getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }

    /**
     * 设置vsoePermitDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VsoePermitDiscount }
     *     
     */
    public void setVsoePermitDiscount(VsoePermitDiscount value) {
        this.vsoePermitDiscount = value;
    }

    /**
     * 获取vsoeDelivered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVsoeDelivered() {
        return vsoeDelivered;
    }

    /**
     * 设置vsoeDelivered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVsoeDelivered(Boolean value) {
        this.vsoeDelivered = value;
    }

    /**
     * 获取taxSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxSchedule() {
        return taxSchedule;
    }

    /**
     * 设置taxSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxSchedule(RecordRef value) {
        this.taxSchedule = value;
    }

    /**
     * 获取taxcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxcode() {
        return taxcode;
    }

    /**
     * 设置taxcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxcode(String value) {
        this.taxcode = value;
    }

    /**
     * 获取item属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItem() {
        return item;
    }

    /**
     * 设置item属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItem(RecordRef value) {
        this.item = value;
    }

    /**
     * 获取taxrate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxrate() {
        return taxrate;
    }

    /**
     * 设置taxrate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxrate(Double value) {
        this.taxrate = value;
    }

    /**
     * 获取effectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * 获取obsoleteDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObsoleteDate() {
        return obsoleteDate;
    }

    /**
     * 设置obsoleteDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObsoleteDate(XMLGregorianCalendar value) {
        this.obsoleteDate = value;
    }

    /**
     * 获取effectiveRevision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEffectiveRevision() {
        return effectiveRevision;
    }

    /**
     * 设置effectiveRevision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEffectiveRevision(RecordRef value) {
        this.effectiveRevision = value;
    }

    /**
     * 获取obsoleteRevision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getObsoleteRevision() {
        return obsoleteRevision;
    }

    /**
     * 设置obsoleteRevision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setObsoleteRevision(RecordRef value) {
        this.obsoleteRevision = value;
    }

    /**
     * 获取lineNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineNumber() {
        return lineNumber;
    }

    /**
     * 设置lineNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineNumber(Long value) {
        this.lineNumber = value;
    }

    /**
     * 获取memberKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberKey() {
        return memberKey;
    }

    /**
     * 设置memberKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberKey(String value) {
        this.memberKey = value;
    }

}
