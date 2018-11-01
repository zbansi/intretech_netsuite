
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>SupportCaseSearchBasic complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SupportCaseSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecordBasic">
 *       &lt;sequence>
 *         &lt;element name="assigned" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="awaitingReply" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="caseNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="closedDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="company" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="contact" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="email" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="escalateTo" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalIdString" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="helpDesk" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="inboundEmail" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="issue" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="lastMessage" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="lastReopenedDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="locked" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="message" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="messageAuthor" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="messageDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="messageType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="module" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="number" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="origin" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="priority" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="product" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="profile" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="stage" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="startDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="title" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
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
@XmlType(name = "SupportCaseSearchBasic", propOrder = {
    "assigned",
    "awaitingReply",
    "caseNumber",
    "category",
    "closedDate",
    "company",
    "contact",
    "createdDate",
    "email",
    "escalateTo",
    "externalId",
    "externalIdString",
    "helpDesk",
    "inboundEmail",
    "internalId",
    "internalIdNumber",
    "isInactive",
    "issue",
    "item",
    "lastMessage",
    "lastModifiedDate",
    "lastReopenedDate",
    "locked",
    "message",
    "messageAuthor",
    "messageDate",
    "messageType",
    "module",
    "number",
    "origin",
    "priority",
    "product",
    "profile",
    "serialNumber",
    "stage",
    "startDate",
    "status",
    "subsidiary",
    "title",
    "customFieldList"
})
public class SupportCaseSearchBasic
    extends SearchRecordBasic
{

    protected SearchMultiSelectField assigned;
    protected SearchBooleanField awaitingReply;
    protected SearchStringField caseNumber;
    protected SearchMultiSelectField category;
    protected SearchDateField closedDate;
    protected SearchStringField company;
    protected SearchStringField contact;
    protected SearchDateField createdDate;
    protected SearchStringField email;
    protected SearchMultiSelectField escalateTo;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchBooleanField helpDesk;
    protected SearchStringField inboundEmail;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isInactive;
    protected SearchMultiSelectField issue;
    protected SearchMultiSelectField item;
    protected SearchBooleanField lastMessage;
    protected SearchDateField lastModifiedDate;
    protected SearchDateField lastReopenedDate;
    protected SearchBooleanField locked;
    protected SearchStringField message;
    protected SearchMultiSelectField messageAuthor;
    protected SearchDateField messageDate;
    protected SearchBooleanField messageType;
    protected SearchMultiSelectField module;
    protected SearchLongField number;
    protected SearchMultiSelectField origin;
    protected SearchMultiSelectField priority;
    protected SearchMultiSelectField product;
    protected SearchMultiSelectField profile;
    protected SearchStringField serialNumber;
    protected SearchEnumMultiSelectField stage;
    protected SearchDateField startDate;
    protected SearchMultiSelectField status;
    protected SearchMultiSelectField subsidiary;
    protected SearchStringField title;
    protected SearchCustomFieldList customFieldList;

    /**
     * ��ȡassigned���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAssigned() {
        return assigned;
    }

    /**
     * ����assigned���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAssigned(SearchMultiSelectField value) {
        this.assigned = value;
    }

    /**
     * ��ȡawaitingReply���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAwaitingReply() {
        return awaitingReply;
    }

    /**
     * ����awaitingReply���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAwaitingReply(SearchBooleanField value) {
        this.awaitingReply = value;
    }

    /**
     * ��ȡcaseNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCaseNumber() {
        return caseNumber;
    }

    /**
     * ����caseNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCaseNumber(SearchStringField value) {
        this.caseNumber = value;
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
     * ��ȡclosedDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getClosedDate() {
        return closedDate;
    }

    /**
     * ����closedDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setClosedDate(SearchDateField value) {
        this.closedDate = value;
    }

    /**
     * ��ȡcompany���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCompany() {
        return company;
    }

    /**
     * ����company���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCompany(SearchStringField value) {
        this.company = value;
    }

    /**
     * ��ȡcontact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getContact() {
        return contact;
    }

    /**
     * ����contact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setContact(SearchStringField value) {
        this.contact = value;
    }

    /**
     * ��ȡcreatedDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCreatedDate() {
        return createdDate;
    }

    /**
     * ����createdDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCreatedDate(SearchDateField value) {
        this.createdDate = value;
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
     * ��ȡescalateTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getEscalateTo() {
        return escalateTo;
    }

    /**
     * ����escalateTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setEscalateTo(SearchMultiSelectField value) {
        this.escalateTo = value;
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
     * ��ȡhelpDesk���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getHelpDesk() {
        return helpDesk;
    }

    /**
     * ����helpDesk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setHelpDesk(SearchBooleanField value) {
        this.helpDesk = value;
    }

    /**
     * ��ȡinboundEmail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getInboundEmail() {
        return inboundEmail;
    }

    /**
     * ����inboundEmail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setInboundEmail(SearchStringField value) {
        this.inboundEmail = value;
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
     * ��ȡissue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getIssue() {
        return issue;
    }

    /**
     * ����issue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setIssue(SearchMultiSelectField value) {
        this.issue = value;
    }

    /**
     * ��ȡitem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItem() {
        return item;
    }

    /**
     * ����item���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItem(SearchMultiSelectField value) {
        this.item = value;
    }

    /**
     * ��ȡlastMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getLastMessage() {
        return lastMessage;
    }

    /**
     * ����lastMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setLastMessage(SearchBooleanField value) {
        this.lastMessage = value;
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
     * ��ȡlastReopenedDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLastReopenedDate() {
        return lastReopenedDate;
    }

    /**
     * ����lastReopenedDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLastReopenedDate(SearchDateField value) {
        this.lastReopenedDate = value;
    }

    /**
     * ��ȡlocked���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getLocked() {
        return locked;
    }

    /**
     * ����locked���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setLocked(SearchBooleanField value) {
        this.locked = value;
    }

    /**
     * ��ȡmessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMessage() {
        return message;
    }

    /**
     * ����message���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMessage(SearchStringField value) {
        this.message = value;
    }

    /**
     * ��ȡmessageAuthor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getMessageAuthor() {
        return messageAuthor;
    }

    /**
     * ����messageAuthor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setMessageAuthor(SearchMultiSelectField value) {
        this.messageAuthor = value;
    }

    /**
     * ��ȡmessageDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getMessageDate() {
        return messageDate;
    }

    /**
     * ����messageDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setMessageDate(SearchDateField value) {
        this.messageDate = value;
    }

    /**
     * ��ȡmessageType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMessageType() {
        return messageType;
    }

    /**
     * ����messageType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMessageType(SearchBooleanField value) {
        this.messageType = value;
    }

    /**
     * ��ȡmodule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getModule() {
        return module;
    }

    /**
     * ����module���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setModule(SearchMultiSelectField value) {
        this.module = value;
    }

    /**
     * ��ȡnumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getNumber() {
        return number;
    }

    /**
     * ����number���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setNumber(SearchLongField value) {
        this.number = value;
    }

    /**
     * ��ȡorigin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getOrigin() {
        return origin;
    }

    /**
     * ����origin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setOrigin(SearchMultiSelectField value) {
        this.origin = value;
    }

    /**
     * ��ȡpriority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPriority() {
        return priority;
    }

    /**
     * ����priority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPriority(SearchMultiSelectField value) {
        this.priority = value;
    }

    /**
     * ��ȡproduct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getProduct() {
        return product;
    }

    /**
     * ����product���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setProduct(SearchMultiSelectField value) {
        this.product = value;
    }

    /**
     * ��ȡprofile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getProfile() {
        return profile;
    }

    /**
     * ����profile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setProfile(SearchMultiSelectField value) {
        this.profile = value;
    }

    /**
     * ��ȡserialNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getSerialNumber() {
        return serialNumber;
    }

    /**
     * ����serialNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setSerialNumber(SearchStringField value) {
        this.serialNumber = value;
    }

    /**
     * ��ȡstage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getStage() {
        return stage;
    }

    /**
     * ����stage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setStage(SearchEnumMultiSelectField value) {
        this.stage = value;
    }

    /**
     * ��ȡstartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getStartDate() {
        return startDate;
    }

    /**
     * ����startDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setStartDate(SearchDateField value) {
        this.startDate = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setStatus(SearchMultiSelectField value) {
        this.status = value;
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
