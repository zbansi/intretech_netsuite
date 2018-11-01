
package com.netsuite.webservices.lists.support_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.support_2018_2.types.IssueTrackCode;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.RecordRefList;


/**
 * <p>Issue complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Issue">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="issueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="issueType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="product" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="module" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="productTeam" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="source" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="reportedBy" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="reproduce" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="versionBroken" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="buildBroken" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="versionTarget" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="buildTarget" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="versionFixed" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="buildFixed" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="severity" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="priority" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isShowStopper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="assigned" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="reviewer" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isReviewed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="issueStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="issueTagsList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/>
 *         &lt;element name="issueAbstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trackCode" type="{urn:types.support_2018_2.lists.webservices.netsuite.com}IssueTrackCode" minOccurs="0"/>
 *         &lt;element name="emailAssignee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailEmployeesList" type="{urn:support_2018_2.lists.webservices.netsuite.com}EmailEmployeesList" minOccurs="0"/>
 *         &lt;element name="emailCellsList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/>
 *         &lt;element name="externalAbstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brokenInVersionList" type="{urn:support_2018_2.lists.webservices.netsuite.com}IssueVersionList" minOccurs="0"/>
 *         &lt;element name="targetVersionList" type="{urn:support_2018_2.lists.webservices.netsuite.com}IssueVersionList" minOccurs="0"/>
 *         &lt;element name="fixedInVersionList" type="{urn:support_2018_2.lists.webservices.netsuite.com}IssueVersionList" minOccurs="0"/>
 *         &lt;element name="relatedIssuesList" type="{urn:support_2018_2.lists.webservices.netsuite.com}IssueRelatedIssuesList" minOccurs="0"/>
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
@XmlType(name = "Issue", propOrder = {
    "customForm",
    "issueNumber",
    "createdDate",
    "issueType",
    "product",
    "module",
    "item",
    "productTeam",
    "source",
    "reportedBy",
    "reproduce",
    "versionBroken",
    "buildBroken",
    "versionTarget",
    "buildTarget",
    "versionFixed",
    "buildFixed",
    "severity",
    "priority",
    "isShowStopper",
    "assigned",
    "reviewer",
    "isReviewed",
    "issueStatus",
    "lastModifiedDate",
    "issueTagsList",
    "issueAbstract",
    "newDetails",
    "isOwner",
    "trackCode",
    "emailAssignee",
    "emailEmployeesList",
    "emailCellsList",
    "externalAbstract",
    "externalDetails",
    "brokenInVersionList",
    "targetVersionList",
    "fixedInVersionList",
    "relatedIssuesList",
    "customFieldList"
})
public class Issue
    extends Record
{

    protected RecordRef customForm;
    protected String issueNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected RecordRef issueType;
    protected RecordRef product;
    protected RecordRef module;
    protected RecordRef item;
    protected RecordRef productTeam;
    protected RecordRef source;
    protected RecordRef reportedBy;
    protected RecordRef reproduce;
    protected RecordRef versionBroken;
    protected RecordRef buildBroken;
    protected RecordRef versionTarget;
    protected RecordRef buildTarget;
    protected RecordRef versionFixed;
    protected RecordRef buildFixed;
    protected RecordRef severity;
    protected RecordRef priority;
    protected Boolean isShowStopper;
    protected RecordRef assigned;
    protected RecordRef reviewer;
    protected Boolean isReviewed;
    protected RecordRef issueStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected RecordRefList issueTagsList;
    protected String issueAbstract;
    protected String newDetails;
    protected Boolean isOwner;
    @XmlSchemaType(name = "string")
    protected IssueTrackCode trackCode;
    protected Boolean emailAssignee;
    protected EmailEmployeesList emailEmployeesList;
    protected RecordRefList emailCellsList;
    protected String externalAbstract;
    protected String externalDetails;
    protected IssueVersionList brokenInVersionList;
    protected IssueVersionList targetVersionList;
    protected IssueVersionList fixedInVersionList;
    protected IssueRelatedIssuesList relatedIssuesList;
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
     * 获取issueNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * 设置issueNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
    }

    /**
     * 获取createdDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置createdDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * 获取issueType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIssueType() {
        return issueType;
    }

    /**
     * 设置issueType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIssueType(RecordRef value) {
        this.issueType = value;
    }

    /**
     * 获取product属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getProduct() {
        return product;
    }

    /**
     * 设置product属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setProduct(RecordRef value) {
        this.product = value;
    }

    /**
     * 获取module属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getModule() {
        return module;
    }

    /**
     * 设置module属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setModule(RecordRef value) {
        this.module = value;
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
     * 获取productTeam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getProductTeam() {
        return productTeam;
    }

    /**
     * 设置productTeam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setProductTeam(RecordRef value) {
        this.productTeam = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSource(RecordRef value) {
        this.source = value;
    }

    /**
     * 获取reportedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getReportedBy() {
        return reportedBy;
    }

    /**
     * 设置reportedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setReportedBy(RecordRef value) {
        this.reportedBy = value;
    }

    /**
     * 获取reproduce属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getReproduce() {
        return reproduce;
    }

    /**
     * 设置reproduce属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setReproduce(RecordRef value) {
        this.reproduce = value;
    }

    /**
     * 获取versionBroken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getVersionBroken() {
        return versionBroken;
    }

    /**
     * 设置versionBroken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setVersionBroken(RecordRef value) {
        this.versionBroken = value;
    }

    /**
     * 获取buildBroken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBuildBroken() {
        return buildBroken;
    }

    /**
     * 设置buildBroken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBuildBroken(RecordRef value) {
        this.buildBroken = value;
    }

    /**
     * 获取versionTarget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getVersionTarget() {
        return versionTarget;
    }

    /**
     * 设置versionTarget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setVersionTarget(RecordRef value) {
        this.versionTarget = value;
    }

    /**
     * 获取buildTarget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBuildTarget() {
        return buildTarget;
    }

    /**
     * 设置buildTarget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBuildTarget(RecordRef value) {
        this.buildTarget = value;
    }

    /**
     * 获取versionFixed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getVersionFixed() {
        return versionFixed;
    }

    /**
     * 设置versionFixed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setVersionFixed(RecordRef value) {
        this.versionFixed = value;
    }

    /**
     * 获取buildFixed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBuildFixed() {
        return buildFixed;
    }

    /**
     * 设置buildFixed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBuildFixed(RecordRef value) {
        this.buildFixed = value;
    }

    /**
     * 获取severity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSeverity() {
        return severity;
    }

    /**
     * 设置severity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSeverity(RecordRef value) {
        this.severity = value;
    }

    /**
     * 获取priority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPriority(RecordRef value) {
        this.priority = value;
    }

    /**
     * 获取isShowStopper属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowStopper() {
        return isShowStopper;
    }

    /**
     * 设置isShowStopper属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowStopper(Boolean value) {
        this.isShowStopper = value;
    }

    /**
     * 获取assigned属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAssigned() {
        return assigned;
    }

    /**
     * 设置assigned属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAssigned(RecordRef value) {
        this.assigned = value;
    }

    /**
     * 获取reviewer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getReviewer() {
        return reviewer;
    }

    /**
     * 设置reviewer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setReviewer(RecordRef value) {
        this.reviewer = value;
    }

    /**
     * 获取isReviewed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReviewed() {
        return isReviewed;
    }

    /**
     * 设置isReviewed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReviewed(Boolean value) {
        this.isReviewed = value;
    }

    /**
     * 获取issueStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIssueStatus() {
        return issueStatus;
    }

    /**
     * 设置issueStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIssueStatus(RecordRef value) {
        this.issueStatus = value;
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
     * 获取issueTagsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getIssueTagsList() {
        return issueTagsList;
    }

    /**
     * 设置issueTagsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setIssueTagsList(RecordRefList value) {
        this.issueTagsList = value;
    }

    /**
     * 获取issueAbstract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueAbstract() {
        return issueAbstract;
    }

    /**
     * 设置issueAbstract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueAbstract(String value) {
        this.issueAbstract = value;
    }

    /**
     * 获取newDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDetails() {
        return newDetails;
    }

    /**
     * 设置newDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDetails(String value) {
        this.newDetails = value;
    }

    /**
     * 获取isOwner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOwner() {
        return isOwner;
    }

    /**
     * 设置isOwner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOwner(Boolean value) {
        this.isOwner = value;
    }

    /**
     * 获取trackCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueTrackCode }
     *     
     */
    public IssueTrackCode getTrackCode() {
        return trackCode;
    }

    /**
     * 设置trackCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueTrackCode }
     *     
     */
    public void setTrackCode(IssueTrackCode value) {
        this.trackCode = value;
    }

    /**
     * 获取emailAssignee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailAssignee() {
        return emailAssignee;
    }

    /**
     * 设置emailAssignee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailAssignee(Boolean value) {
        this.emailAssignee = value;
    }

    /**
     * 获取emailEmployeesList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmailEmployeesList }
     *     
     */
    public EmailEmployeesList getEmailEmployeesList() {
        return emailEmployeesList;
    }

    /**
     * 设置emailEmployeesList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmailEmployeesList }
     *     
     */
    public void setEmailEmployeesList(EmailEmployeesList value) {
        this.emailEmployeesList = value;
    }

    /**
     * 获取emailCellsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getEmailCellsList() {
        return emailCellsList;
    }

    /**
     * 设置emailCellsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setEmailCellsList(RecordRefList value) {
        this.emailCellsList = value;
    }

    /**
     * 获取externalAbstract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAbstract() {
        return externalAbstract;
    }

    /**
     * 设置externalAbstract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAbstract(String value) {
        this.externalAbstract = value;
    }

    /**
     * 获取externalDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDetails() {
        return externalDetails;
    }

    /**
     * 设置externalDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDetails(String value) {
        this.externalDetails = value;
    }

    /**
     * 获取brokenInVersionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueVersionList }
     *     
     */
    public IssueVersionList getBrokenInVersionList() {
        return brokenInVersionList;
    }

    /**
     * 设置brokenInVersionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueVersionList }
     *     
     */
    public void setBrokenInVersionList(IssueVersionList value) {
        this.brokenInVersionList = value;
    }

    /**
     * 获取targetVersionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueVersionList }
     *     
     */
    public IssueVersionList getTargetVersionList() {
        return targetVersionList;
    }

    /**
     * 设置targetVersionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueVersionList }
     *     
     */
    public void setTargetVersionList(IssueVersionList value) {
        this.targetVersionList = value;
    }

    /**
     * 获取fixedInVersionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueVersionList }
     *     
     */
    public IssueVersionList getFixedInVersionList() {
        return fixedInVersionList;
    }

    /**
     * 设置fixedInVersionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueVersionList }
     *     
     */
    public void setFixedInVersionList(IssueVersionList value) {
        this.fixedInVersionList = value;
    }

    /**
     * 获取relatedIssuesList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueRelatedIssuesList }
     *     
     */
    public IssueRelatedIssuesList getRelatedIssuesList() {
        return relatedIssuesList;
    }

    /**
     * 设置relatedIssuesList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueRelatedIssuesList }
     *     
     */
    public void setRelatedIssuesList(IssueRelatedIssuesList value) {
        this.relatedIssuesList = value;
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
