
package com.netsuite.webservices.lists.relationships_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.relationships_2018_2.types.EmailPreference;
import com.netsuite.webservices.lists.relationships_2018_2.types.TaxRounding;
import com.netsuite.webservices.platform.common_2018_2.types.GlobalSubscriptionStatus;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.RecordRefList;


/**
 * <p>Partner complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Partner">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPerson" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="phoneticName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="globalSubscriptionStatus" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}GlobalSubscriptionStatus" minOccurs="0"/>
 *         &lt;element name="referringUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/>
 *         &lt;element name="categoryList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}CategoryList" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="printOnCheckAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxIdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vatRegNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bcn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="image" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="taxFractionUnit" type="{urn:types.relationships_2018_2.lists.webservices.netsuite.com}TaxFractionUnit" minOccurs="0"/>
 *         &lt;element name="emailPreference" type="{urn:types.relationships_2018_2.lists.webservices.netsuite.com}EmailPreference" minOccurs="0"/>
 *         &lt;element name="taxRounding" type="{urn:types.relationships_2018_2.lists.webservices.netsuite.com}TaxRounding" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giveAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="accessRole" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requirePwdChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subPartnerLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="loginAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligibleForCommission" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contactRolesList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}ContactAccessRolesList" minOccurs="0"/>
 *         &lt;element name="promoCodeList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}PartnerPromoCodeList" minOccurs="0"/>
 *         &lt;element name="addressbookList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}PartnerAddressbookList" minOccurs="0"/>
 *         &lt;element name="subscriptionsList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}SubscriptionsList" minOccurs="0"/>
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
@XmlType(name = "Partner", propOrder = {
    "customForm",
    "entityId",
    "altName",
    "partnerCode",
    "isPerson",
    "phoneticName",
    "salutation",
    "firstName",
    "middleName",
    "lastName",
    "companyName",
    "parent",
    "phone",
    "fax",
    "email",
    "url",
    "defaultAddress",
    "isInactive",
    "lastModifiedDate",
    "dateCreated",
    "globalSubscriptionStatus",
    "referringUrl",
    "roleList",
    "categoryList",
    "title",
    "printOnCheckAs",
    "taxIdNum",
    "vatRegNumber",
    "comments",
    "bcn",
    "image",
    "taxFractionUnit",
    "emailPreference",
    "taxRounding",
    "department",
    "location",
    "clazz",
    "subsidiary",
    "homePhone",
    "mobilePhone",
    "altEmail",
    "giveAccess",
    "accessRole",
    "sendEmail",
    "password",
    "password2",
    "requirePwdChange",
    "subPartnerLogin",
    "loginAs",
    "eligibleForCommission",
    "contactRolesList",
    "promoCodeList",
    "addressbookList",
    "subscriptionsList",
    "customFieldList"
})
public class Partner
    extends Record
{

    protected RecordRef customForm;
    protected String entityId;
    protected String altName;
    protected String partnerCode;
    protected Boolean isPerson;
    protected String phoneticName;
    protected String salutation;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String companyName;
    protected RecordRef parent;
    protected String phone;
    protected String fax;
    protected String email;
    protected String url;
    protected String defaultAddress;
    protected Boolean isInactive;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlSchemaType(name = "string")
    protected GlobalSubscriptionStatus globalSubscriptionStatus;
    protected String referringUrl;
    protected RecordRefList roleList;
    protected CategoryList categoryList;
    protected String title;
    protected String printOnCheckAs;
    protected String taxIdNum;
    protected String vatRegNumber;
    protected String comments;
    protected String bcn;
    protected RecordRef image;
    protected String taxFractionUnit;
    @XmlSchemaType(name = "string")
    protected EmailPreference emailPreference;
    @XmlSchemaType(name = "string")
    protected TaxRounding taxRounding;
    protected RecordRef department;
    protected RecordRef location;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef subsidiary;
    protected String homePhone;
    protected String mobilePhone;
    protected String altEmail;
    protected Boolean giveAccess;
    protected RecordRef accessRole;
    protected Boolean sendEmail;
    protected String password;
    protected String password2;
    protected Boolean requirePwdChange;
    protected Boolean subPartnerLogin;
    protected String loginAs;
    protected Boolean eligibleForCommission;
    protected ContactAccessRolesList contactRolesList;
    protected PartnerPromoCodeList promoCodeList;
    protected PartnerAddressbookList addressbookList;
    protected SubscriptionsList subscriptionsList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

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
     * 获取entityId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * 设置entityId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * 获取altName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltName() {
        return altName;
    }

    /**
     * 设置altName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltName(String value) {
        this.altName = value;
    }

    /**
     * 获取partnerCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerCode() {
        return partnerCode;
    }

    /**
     * 设置partnerCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerCode(String value) {
        this.partnerCode = value;
    }

    /**
     * 获取isPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPerson() {
        return isPerson;
    }

    /**
     * 设置isPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPerson(Boolean value) {
        this.isPerson = value;
    }

    /**
     * 获取phoneticName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneticName() {
        return phoneticName;
    }

    /**
     * 设置phoneticName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneticName(String value) {
        this.phoneticName = value;
    }

    /**
     * 获取salutation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * 设置salutation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * 获取firstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置firstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * 获取middleName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * 设置middleName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * 获取lastName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置lastName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * 获取companyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置companyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
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
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * 获取fax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置fax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取url属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * 获取defaultAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAddress() {
        return defaultAddress;
    }

    /**
     * 设置defaultAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAddress(String value) {
        this.defaultAddress = value;
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
     * 获取lastModifiedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * 设置lastModifiedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * 获取dateCreated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * 设置dateCreated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * 获取globalSubscriptionStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GlobalSubscriptionStatus }
     *     
     */
    public GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }

    /**
     * 设置globalSubscriptionStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSubscriptionStatus }
     *     
     */
    public void setGlobalSubscriptionStatus(GlobalSubscriptionStatus value) {
        this.globalSubscriptionStatus = value;
    }

    /**
     * 获取referringUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferringUrl() {
        return referringUrl;
    }

    /**
     * 设置referringUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferringUrl(String value) {
        this.referringUrl = value;
    }

    /**
     * 获取roleList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getRoleList() {
        return roleList;
    }

    /**
     * 设置roleList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setRoleList(RecordRefList value) {
        this.roleList = value;
    }

    /**
     * 获取categoryList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CategoryList }
     *     
     */
    public CategoryList getCategoryList() {
        return categoryList;
    }

    /**
     * 设置categoryList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryList }
     *     
     */
    public void setCategoryList(CategoryList value) {
        this.categoryList = value;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取printOnCheckAs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintOnCheckAs() {
        return printOnCheckAs;
    }

    /**
     * 设置printOnCheckAs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintOnCheckAs(String value) {
        this.printOnCheckAs = value;
    }

    /**
     * 获取taxIdNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdNum() {
        return taxIdNum;
    }

    /**
     * 设置taxIdNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdNum(String value) {
        this.taxIdNum = value;
    }

    /**
     * 获取vatRegNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatRegNumber() {
        return vatRegNumber;
    }

    /**
     * 设置vatRegNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatRegNumber(String value) {
        this.vatRegNumber = value;
    }

    /**
     * 获取comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * 获取bcn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBcn() {
        return bcn;
    }

    /**
     * 设置bcn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBcn(String value) {
        this.bcn = value;
    }

    /**
     * 获取image属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getImage() {
        return image;
    }

    /**
     * 设置image属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setImage(RecordRef value) {
        this.image = value;
    }

    /**
     * 获取taxFractionUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxFractionUnit() {
        return taxFractionUnit;
    }

    /**
     * 设置taxFractionUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxFractionUnit(String value) {
        this.taxFractionUnit = value;
    }

    /**
     * 获取emailPreference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmailPreference }
     *     
     */
    public EmailPreference getEmailPreference() {
        return emailPreference;
    }

    /**
     * 设置emailPreference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmailPreference }
     *     
     */
    public void setEmailPreference(EmailPreference value) {
        this.emailPreference = value;
    }

    /**
     * 获取taxRounding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxRounding }
     *     
     */
    public TaxRounding getTaxRounding() {
        return taxRounding;
    }

    /**
     * 设置taxRounding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRounding }
     *     
     */
    public void setTaxRounding(TaxRounding value) {
        this.taxRounding = value;
    }

    /**
     * 获取department属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDepartment() {
        return department;
    }

    /**
     * 设置department属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDepartment(RecordRef value) {
        this.department = value;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocation(RecordRef value) {
        this.location = value;
    }

    /**
     * 获取clazz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getClazz() {
        return clazz;
    }

    /**
     * 设置clazz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setClazz(RecordRef value) {
        this.clazz = value;
    }

    /**
     * 获取subsidiary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubsidiary() {
        return subsidiary;
    }

    /**
     * 设置subsidiary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubsidiary(RecordRef value) {
        this.subsidiary = value;
    }

    /**
     * 获取homePhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * 设置homePhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * 获取mobilePhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置mobilePhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * 获取altEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltEmail() {
        return altEmail;
    }

    /**
     * 设置altEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltEmail(String value) {
        this.altEmail = value;
    }

    /**
     * 获取giveAccess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGiveAccess() {
        return giveAccess;
    }

    /**
     * 设置giveAccess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGiveAccess(Boolean value) {
        this.giveAccess = value;
    }

    /**
     * 获取accessRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAccessRole() {
        return accessRole;
    }

    /**
     * 设置accessRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAccessRole(RecordRef value) {
        this.accessRole = value;
    }

    /**
     * 获取sendEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * 设置sendEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmail(Boolean value) {
        this.sendEmail = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取password2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword2() {
        return password2;
    }

    /**
     * 设置password2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword2(String value) {
        this.password2 = value;
    }

    /**
     * 获取requirePwdChange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequirePwdChange() {
        return requirePwdChange;
    }

    /**
     * 设置requirePwdChange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequirePwdChange(Boolean value) {
        this.requirePwdChange = value;
    }

    /**
     * 获取subPartnerLogin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubPartnerLogin() {
        return subPartnerLogin;
    }

    /**
     * 设置subPartnerLogin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubPartnerLogin(Boolean value) {
        this.subPartnerLogin = value;
    }

    /**
     * 获取loginAs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginAs() {
        return loginAs;
    }

    /**
     * 设置loginAs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginAs(String value) {
        this.loginAs = value;
    }

    /**
     * 获取eligibleForCommission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForCommission() {
        return eligibleForCommission;
    }

    /**
     * 设置eligibleForCommission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForCommission(Boolean value) {
        this.eligibleForCommission = value;
    }

    /**
     * 获取contactRolesList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactAccessRolesList }
     *     
     */
    public ContactAccessRolesList getContactRolesList() {
        return contactRolesList;
    }

    /**
     * 设置contactRolesList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAccessRolesList }
     *     
     */
    public void setContactRolesList(ContactAccessRolesList value) {
        this.contactRolesList = value;
    }

    /**
     * 获取promoCodeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartnerPromoCodeList }
     *     
     */
    public PartnerPromoCodeList getPromoCodeList() {
        return promoCodeList;
    }

    /**
     * 设置promoCodeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerPromoCodeList }
     *     
     */
    public void setPromoCodeList(PartnerPromoCodeList value) {
        this.promoCodeList = value;
    }

    /**
     * 获取addressbookList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartnerAddressbookList }
     *     
     */
    public PartnerAddressbookList getAddressbookList() {
        return addressbookList;
    }

    /**
     * 设置addressbookList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerAddressbookList }
     *     
     */
    public void setAddressbookList(PartnerAddressbookList value) {
        this.addressbookList = value;
    }

    /**
     * 获取subscriptionsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionsList }
     *     
     */
    public SubscriptionsList getSubscriptionsList() {
        return subscriptionsList;
    }

    /**
     * 设置subscriptionsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionsList }
     *     
     */
    public void setSubscriptionsList(SubscriptionsList value) {
        this.subscriptionsList = value;
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
