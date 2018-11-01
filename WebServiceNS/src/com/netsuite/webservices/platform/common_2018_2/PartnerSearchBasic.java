
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchBooleanField;
import com.netsuite.webservices.platform.core_2018_2.SearchCustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.SearchDateField;
import com.netsuite.webservices.platform.core_2018_2.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchLongField;
import com.netsuite.webservices.platform.core_2018_2.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchRecordBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchStringField;


/**
 * <p>PartnerSearchBasic complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PartnerSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecordBasic">
 *       &lt;sequence>
 *         &lt;element name="address" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="addressee" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="addressLabel" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="addressPhone" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="assignTasks" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="attention" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="billAddress" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="city" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="comments" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="commissionPlan" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="country" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="county" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="eligibleForCommission" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="email" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="emailPreference" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="entityId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalIdString" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="fax" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="firstName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="giveAccess" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="globalSubscriptionStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="group" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="hasDuplicates" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="image" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="isDefaultBilling" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isDefaultShipping" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isPerson" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="language" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="lastName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="level" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="middleName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="otherRelationships" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="partnerCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="permission" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="phone" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="phoneticName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="promoCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salutation" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="shipAddress" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="state" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="title" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="URL" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchCustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerSearchBasic", propOrder = {
    "address",
    "addressee",
    "addressLabel",
    "addressPhone",
    "assignTasks",
    "attention",
    "billAddress",
    "category",
    "city",
    "clazz",
    "comments",
    "commissionPlan",
    "country",
    "county",
    "dateCreated",
    "department",
    "eligibleForCommission",
    "email",
    "emailPreference",
    "entityId",
    "externalId",
    "externalIdString",
    "fax",
    "firstName",
    "giveAccess",
    "globalSubscriptionStatus",
    "group",
    "hasDuplicates",
    "image",
    "internalId",
    "internalIdNumber",
    "isDefaultBilling",
    "isDefaultShipping",
    "isInactive",
    "isPerson",
    "language",
    "lastModifiedDate",
    "lastName",
    "level",
    "location",
    "middleName",
    "otherRelationships",
    "parent",
    "partnerCode",
    "permission",
    "phone",
    "phoneticName",
    "promoCode",
    "salutation",
    "shipAddress",
    "state",
    "subsidiary",
    "title",
    "url",
    "zipCode",
    "customFieldList"
})
public class PartnerSearchBasic
    extends SearchRecordBasic
{

    protected SearchStringField address;
    protected SearchStringField addressee;
    protected SearchStringField addressLabel;
    protected SearchStringField addressPhone;
    protected SearchBooleanField assignTasks;
    protected SearchStringField attention;
    protected SearchStringField billAddress;
    protected SearchMultiSelectField category;
    protected SearchStringField city;
    @XmlElement(name = "class")
    protected SearchMultiSelectField clazz;
    protected SearchStringField comments;
    protected SearchMultiSelectField commissionPlan;
    protected SearchEnumMultiSelectField country;
    protected SearchStringField county;
    protected SearchDateField dateCreated;
    protected SearchMultiSelectField department;
    protected SearchBooleanField eligibleForCommission;
    protected SearchStringField email;
    protected SearchEnumMultiSelectField emailPreference;
    protected SearchStringField entityId;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchStringField fax;
    protected SearchStringField firstName;
    protected SearchBooleanField giveAccess;
    protected SearchEnumMultiSelectField globalSubscriptionStatus;
    protected SearchMultiSelectField group;
    protected SearchBooleanField hasDuplicates;
    protected SearchStringField image;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isDefaultBilling;
    protected SearchBooleanField isDefaultShipping;
    protected SearchBooleanField isInactive;
    protected SearchBooleanField isPerson;
    protected SearchEnumMultiSelectField language;
    protected SearchDateField lastModifiedDate;
    protected SearchStringField lastName;
    protected SearchEnumMultiSelectField level;
    protected SearchMultiSelectField location;
    protected SearchStringField middleName;
    protected SearchEnumMultiSelectField otherRelationships;
    protected SearchMultiSelectField parent;
    protected SearchStringField partnerCode;
    protected SearchEnumMultiSelectField permission;
    protected SearchStringField phone;
    protected SearchStringField phoneticName;
    protected SearchMultiSelectField promoCode;
    protected SearchStringField salutation;
    protected SearchStringField shipAddress;
    protected SearchStringField state;
    protected SearchMultiSelectField subsidiary;
    protected SearchStringField title;
    @XmlElement(name = "URL")
    protected SearchStringField url;
    protected SearchStringField zipCode;
    protected SearchCustomFieldList customFieldList;

    /**
     * ��ȡaddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAddress(SearchStringField value) {
        this.address = value;
    }

    /**
     * ��ȡaddressee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAddressee() {
        return addressee;
    }

    /**
     * ����addressee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAddressee(SearchStringField value) {
        this.addressee = value;
    }

    /**
     * ��ȡaddressLabel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAddressLabel() {
        return addressLabel;
    }

    /**
     * ����addressLabel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAddressLabel(SearchStringField value) {
        this.addressLabel = value;
    }

    /**
     * ��ȡaddressPhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAddressPhone() {
        return addressPhone;
    }

    /**
     * ����addressPhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAddressPhone(SearchStringField value) {
        this.addressPhone = value;
    }

    /**
     * ��ȡassignTasks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAssignTasks() {
        return assignTasks;
    }

    /**
     * ����assignTasks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAssignTasks(SearchBooleanField value) {
        this.assignTasks = value;
    }

    /**
     * ��ȡattention���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAttention() {
        return attention;
    }

    /**
     * ����attention���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAttention(SearchStringField value) {
        this.attention = value;
    }

    /**
     * ��ȡbillAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillAddress() {
        return billAddress;
    }

    /**
     * ����billAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillAddress(SearchStringField value) {
        this.billAddress = value;
    }

    /**
     * ��ȡcategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCategory() {
        return category;
    }

    /**
     * ����category���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCategory(SearchMultiSelectField value) {
        this.category = value;
    }

    /**
     * ��ȡcity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCity() {
        return city;
    }

    /**
     * ����city���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCity(SearchStringField value) {
        this.city = value;
    }

    /**
     * ��ȡclazz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getClazz() {
        return clazz;
    }

    /**
     * ����clazz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setClazz(SearchMultiSelectField value) {
        this.clazz = value;
    }

    /**
     * ��ȡcomments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getComments() {
        return comments;
    }

    /**
     * ����comments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setComments(SearchStringField value) {
        this.comments = value;
    }

    /**
     * ��ȡcommissionPlan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCommissionPlan() {
        return commissionPlan;
    }

    /**
     * ����commissionPlan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCommissionPlan(SearchMultiSelectField value) {
        this.commissionPlan = value;
    }

    /**
     * ��ȡcountry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCountry() {
        return country;
    }

    /**
     * ����country���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCountry(SearchEnumMultiSelectField value) {
        this.country = value;
    }

    /**
     * ��ȡcounty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCounty() {
        return county;
    }

    /**
     * ����county���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCounty(SearchStringField value) {
        this.county = value;
    }

    /**
     * ��ȡdateCreated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getDateCreated() {
        return dateCreated;
    }

    /**
     * ����dateCreated���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setDateCreated(SearchDateField value) {
        this.dateCreated = value;
    }

    /**
     * ��ȡdepartment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDepartment() {
        return department;
    }

    /**
     * ����department���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDepartment(SearchMultiSelectField value) {
        this.department = value;
    }

    /**
     * ��ȡeligibleForCommission���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getEligibleForCommission() {
        return eligibleForCommission;
    }

    /**
     * ����eligibleForCommission���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setEligibleForCommission(SearchBooleanField value) {
        this.eligibleForCommission = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEmail() {
        return email;
    }

    /**
     * ����email���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEmail(SearchStringField value) {
        this.email = value;
    }

    /**
     * ��ȡemailPreference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getEmailPreference() {
        return emailPreference;
    }

    /**
     * ����emailPreference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setEmailPreference(SearchEnumMultiSelectField value) {
        this.emailPreference = value;
    }

    /**
     * ��ȡentityId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEntityId() {
        return entityId;
    }

    /**
     * ����entityId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEntityId(SearchStringField value) {
        this.entityId = value;
    }

    /**
     * ��ȡexternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalId() {
        return externalId;
    }

    /**
     * ����externalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalId(SearchMultiSelectField value) {
        this.externalId = value;
    }

    /**
     * ��ȡexternalIdString���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalIdString() {
        return externalIdString;
    }

    /**
     * ����externalIdString���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalIdString(SearchStringField value) {
        this.externalIdString = value;
    }

    /**
     * ��ȡfax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getFax() {
        return fax;
    }

    /**
     * ����fax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setFax(SearchStringField value) {
        this.fax = value;
    }

    /**
     * ��ȡfirstName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getFirstName() {
        return firstName;
    }

    /**
     * ����firstName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setFirstName(SearchStringField value) {
        this.firstName = value;
    }

    /**
     * ��ȡgiveAccess���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getGiveAccess() {
        return giveAccess;
    }

    /**
     * ����giveAccess���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setGiveAccess(SearchBooleanField value) {
        this.giveAccess = value;
    }

    /**
     * ��ȡglobalSubscriptionStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }

    /**
     * ����globalSubscriptionStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setGlobalSubscriptionStatus(SearchEnumMultiSelectField value) {
        this.globalSubscriptionStatus = value;
    }

    /**
     * ��ȡgroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getGroup() {
        return group;
    }

    /**
     * ����group���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setGroup(SearchMultiSelectField value) {
        this.group = value;
    }

    /**
     * ��ȡhasDuplicates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getHasDuplicates() {
        return hasDuplicates;
    }

    /**
     * ����hasDuplicates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setHasDuplicates(SearchBooleanField value) {
        this.hasDuplicates = value;
    }

    /**
     * ��ȡimage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getImage() {
        return image;
    }

    /**
     * ����image���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setImage(SearchStringField value) {
        this.image = value;
    }

    /**
     * ��ȡinternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * ����internalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * ��ȡinternalIdNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * ����internalIdNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * ��ȡisDefaultBilling���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsDefaultBilling() {
        return isDefaultBilling;
    }

    /**
     * ����isDefaultBilling���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsDefaultBilling(SearchBooleanField value) {
        this.isDefaultBilling = value;
    }

    /**
     * ��ȡisDefaultShipping���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsDefaultShipping() {
        return isDefaultShipping;
    }

    /**
     * ����isDefaultShipping���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsDefaultShipping(SearchBooleanField value) {
        this.isDefaultShipping = value;
    }

    /**
     * ��ȡisInactive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsInactive() {
        return isInactive;
    }

    /**
     * ����isInactive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsInactive(SearchBooleanField value) {
        this.isInactive = value;
    }

    /**
     * ��ȡisPerson���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsPerson() {
        return isPerson;
    }

    /**
     * ����isPerson���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsPerson(SearchBooleanField value) {
        this.isPerson = value;
    }

    /**
     * ��ȡlanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLanguage() {
        return language;
    }

    /**
     * ����language���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLanguage(SearchEnumMultiSelectField value) {
        this.language = value;
    }

    /**
     * ��ȡlastModifiedDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * ����lastModifiedDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLastModifiedDate(SearchDateField value) {
        this.lastModifiedDate = value;
    }

    /**
     * ��ȡlastName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getLastName() {
        return lastName;
    }

    /**
     * ����lastName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setLastName(SearchStringField value) {
        this.lastName = value;
    }

    /**
     * ��ȡlevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLevel() {
        return level;
    }

    /**
     * ����level���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLevel(SearchEnumMultiSelectField value) {
        this.level = value;
    }

    /**
     * ��ȡlocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLocation() {
        return location;
    }

    /**
     * ����location���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLocation(SearchMultiSelectField value) {
        this.location = value;
    }

    /**
     * ��ȡmiddleName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMiddleName() {
        return middleName;
    }

    /**
     * ����middleName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMiddleName(SearchStringField value) {
        this.middleName = value;
    }

    /**
     * ��ȡotherRelationships���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getOtherRelationships() {
        return otherRelationships;
    }

    /**
     * ����otherRelationships���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setOtherRelationships(SearchEnumMultiSelectField value) {
        this.otherRelationships = value;
    }

    /**
     * ��ȡparent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getParent() {
        return parent;
    }

    /**
     * ����parent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setParent(SearchMultiSelectField value) {
        this.parent = value;
    }

    /**
     * ��ȡpartnerCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPartnerCode() {
        return partnerCode;
    }

    /**
     * ����partnerCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPartnerCode(SearchStringField value) {
        this.partnerCode = value;
    }

    /**
     * ��ȡpermission���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getPermission() {
        return permission;
    }

    /**
     * ����permission���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setPermission(SearchEnumMultiSelectField value) {
        this.permission = value;
    }

    /**
     * ��ȡphone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPhone() {
        return phone;
    }

    /**
     * ����phone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPhone(SearchStringField value) {
        this.phone = value;
    }

    /**
     * ��ȡphoneticName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPhoneticName() {
        return phoneticName;
    }

    /**
     * ����phoneticName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPhoneticName(SearchStringField value) {
        this.phoneticName = value;
    }

    /**
     * ��ȡpromoCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPromoCode() {
        return promoCode;
    }

    /**
     * ����promoCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPromoCode(SearchMultiSelectField value) {
        this.promoCode = value;
    }

    /**
     * ��ȡsalutation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getSalutation() {
        return salutation;
    }

    /**
     * ����salutation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setSalutation(SearchStringField value) {
        this.salutation = value;
    }

    /**
     * ��ȡshipAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipAddress() {
        return shipAddress;
    }

    /**
     * ����shipAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipAddress(SearchStringField value) {
        this.shipAddress = value;
    }

    /**
     * ��ȡstate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getState() {
        return state;
    }

    /**
     * ����state���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setState(SearchStringField value) {
        this.state = value;
    }

    /**
     * ��ȡsubsidiary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }

    /**
     * ����subsidiary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSubsidiary(SearchMultiSelectField value) {
        this.subsidiary = value;
    }

    /**
     * ��ȡtitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getTitle() {
        return title;
    }

    /**
     * ����title���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setTitle(SearchStringField value) {
        this.title = value;
    }

    /**
     * ��ȡurl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getURL() {
        return url;
    }

    /**
     * ����url���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setURL(SearchStringField value) {
        this.url = value;
    }

    /**
     * ��ȡzipCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getZipCode() {
        return zipCode;
    }

    /**
     * ����zipCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setZipCode(SearchStringField value) {
        this.zipCode = value;
    }

    /**
     * ��ȡcustomFieldList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * ����customFieldList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchCustomFieldList value) {
        this.customFieldList = value;
    }

}
