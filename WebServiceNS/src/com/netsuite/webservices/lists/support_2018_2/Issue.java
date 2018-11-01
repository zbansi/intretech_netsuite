
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
 * <p>Issue complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡissueNumber���Ե�ֵ��
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
     * ����issueNumber���Ե�ֵ��
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
     * ��ȡcreatedDate���Ե�ֵ��
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
     * ����createdDate���Ե�ֵ��
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
     * ��ȡissueType���Ե�ֵ��
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
     * ����issueType���Ե�ֵ��
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
     * ��ȡproduct���Ե�ֵ��
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
     * ����product���Ե�ֵ��
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
     * ��ȡmodule���Ե�ֵ��
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
     * ����module���Ե�ֵ��
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
     * ��ȡitem���Ե�ֵ��
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
     * ����item���Ե�ֵ��
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
     * ��ȡproductTeam���Ե�ֵ��
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
     * ����productTeam���Ե�ֵ��
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
     * ��ȡsource���Ե�ֵ��
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
     * ����source���Ե�ֵ��
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
     * ��ȡreportedBy���Ե�ֵ��
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
     * ����reportedBy���Ե�ֵ��
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
     * ��ȡreproduce���Ե�ֵ��
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
     * ����reproduce���Ե�ֵ��
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
     * ��ȡversionBroken���Ե�ֵ��
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
     * ����versionBroken���Ե�ֵ��
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
     * ��ȡbuildBroken���Ե�ֵ��
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
     * ����buildBroken���Ե�ֵ��
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
     * ��ȡversionTarget���Ե�ֵ��
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
     * ����versionTarget���Ե�ֵ��
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
     * ��ȡbuildTarget���Ե�ֵ��
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
     * ����buildTarget���Ե�ֵ��
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
     * ��ȡversionFixed���Ե�ֵ��
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
     * ����versionFixed���Ե�ֵ��
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
     * ��ȡbuildFixed���Ե�ֵ��
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
     * ����buildFixed���Ե�ֵ��
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
     * ��ȡseverity���Ե�ֵ��
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
     * ����severity���Ե�ֵ��
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
     * ��ȡpriority���Ե�ֵ��
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
     * ����priority���Ե�ֵ��
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
     * ��ȡisShowStopper���Ե�ֵ��
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
     * ����isShowStopper���Ե�ֵ��
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
     * ��ȡassigned���Ե�ֵ��
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
     * ����assigned���Ե�ֵ��
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
     * ��ȡreviewer���Ե�ֵ��
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
     * ����reviewer���Ե�ֵ��
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
     * ��ȡisReviewed���Ե�ֵ��
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
     * ����isReviewed���Ե�ֵ��
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
     * ��ȡissueStatus���Ե�ֵ��
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
     * ����issueStatus���Ե�ֵ��
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
     * ��ȡlastModifiedDate���Ե�ֵ��
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
     * ����lastModifiedDate���Ե�ֵ��
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
     * ��ȡissueTagsList���Ե�ֵ��
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
     * ����issueTagsList���Ե�ֵ��
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
     * ��ȡissueAbstract���Ե�ֵ��
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
     * ����issueAbstract���Ե�ֵ��
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
     * ��ȡnewDetails���Ե�ֵ��
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
     * ����newDetails���Ե�ֵ��
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
     * ��ȡisOwner���Ե�ֵ��
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
     * ����isOwner���Ե�ֵ��
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
     * ��ȡtrackCode���Ե�ֵ��
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
     * ����trackCode���Ե�ֵ��
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
     * ��ȡemailAssignee���Ե�ֵ��
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
     * ����emailAssignee���Ե�ֵ��
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
     * ��ȡemailEmployeesList���Ե�ֵ��
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
     * ����emailEmployeesList���Ե�ֵ��
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
     * ��ȡemailCellsList���Ե�ֵ��
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
     * ����emailCellsList���Ե�ֵ��
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
     * ��ȡexternalAbstract���Ե�ֵ��
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
     * ����externalAbstract���Ե�ֵ��
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
     * ��ȡexternalDetails���Ե�ֵ��
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
     * ����externalDetails���Ե�ֵ��
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
     * ��ȡbrokenInVersionList���Ե�ֵ��
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
     * ����brokenInVersionList���Ե�ֵ��
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
     * ��ȡtargetVersionList���Ե�ֵ��
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
     * ����targetVersionList���Ե�ֵ��
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
     * ��ȡfixedInVersionList���Ե�ֵ��
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
     * ����fixedInVersionList���Ե�ֵ��
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
     * ��ȡrelatedIssuesList���Ե�ֵ��
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
     * ����relatedIssuesList���Ե�ֵ��
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
