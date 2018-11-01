
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
 * <p>IssueSearchBasic complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="IssueSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecordBasic">
 *       &lt;sequence>
 *         &lt;element name="ageInMonths" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="assigned" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="buildBroken" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="buildBrokenName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="buildFixed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="buildFixedName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="buildTarget" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="buildTargetName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="caseCount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="caseNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="closedDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="dateReleased" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="details" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="duplicateOf" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="eFix" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="employeeOrTeam" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="eventStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalAbstract" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="externalDetails" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="externalFixedIn" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalIdString" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="externalStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="fixed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="fixedBy" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="isOwner" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isReviewed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isShowStopper" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="issueAbstract" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="issueNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="module" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="number" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="originalFixedIn" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="priority" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="product" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="productTeam" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="relatedIssue" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="relationship" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="relationshipComment" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="reportedBy" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="reproduce" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="resolved" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="resolvedBy" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="reviewer" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="severity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="source" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="tags" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="tracking" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="userType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="versionBroken" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="versionFixed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="versionTarget" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
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
@XmlType(name = "IssueSearchBasic", propOrder = {
    "ageInMonths",
    "assigned",
    "buildBroken",
    "buildBrokenName",
    "buildFixed",
    "buildFixedName",
    "buildTarget",
    "buildTargetName",
    "caseCount",
    "caseNumber",
    "closedDate",
    "createdDate",
    "dateReleased",
    "details",
    "duplicateOf",
    "eFix",
    "employeeOrTeam",
    "eventStatus",
    "externalAbstract",
    "externalDetails",
    "externalFixedIn",
    "externalId",
    "externalIdString",
    "externalStatus",
    "fixed",
    "fixedBy",
    "internalId",
    "internalIdNumber",
    "isOwner",
    "isReviewed",
    "isShowStopper",
    "issueAbstract",
    "issueNumber",
    "item",
    "lastModifiedDate",
    "module",
    "number",
    "originalFixedIn",
    "priority",
    "product",
    "productTeam",
    "relatedIssue",
    "relationship",
    "relationshipComment",
    "reportedBy",
    "reproduce",
    "resolved",
    "resolvedBy",
    "reviewer",
    "severity",
    "source",
    "status",
    "tags",
    "tracking",
    "type",
    "userType",
    "versionBroken",
    "versionFixed",
    "versionTarget",
    "customFieldList"
})
public class IssueSearchBasic
    extends SearchRecordBasic
{

    protected SearchLongField ageInMonths;
    protected SearchMultiSelectField assigned;
    protected SearchMultiSelectField buildBroken;
    protected SearchStringField buildBrokenName;
    protected SearchMultiSelectField buildFixed;
    protected SearchStringField buildFixedName;
    protected SearchMultiSelectField buildTarget;
    protected SearchStringField buildTargetName;
    protected SearchLongField caseCount;
    protected SearchStringField caseNumber;
    protected SearchDateField closedDate;
    protected SearchDateField createdDate;
    protected SearchDateField dateReleased;
    protected SearchStringField details;
    protected SearchMultiSelectField duplicateOf;
    protected SearchBooleanField eFix;
    protected SearchMultiSelectField employeeOrTeam;
    protected SearchEnumMultiSelectField eventStatus;
    protected SearchStringField externalAbstract;
    protected SearchStringField externalDetails;
    protected SearchMultiSelectField externalFixedIn;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchMultiSelectField externalStatus;
    protected SearchDateField fixed;
    protected SearchMultiSelectField fixedBy;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isOwner;
    protected SearchBooleanField isReviewed;
    protected SearchBooleanField isShowStopper;
    protected SearchStringField issueAbstract;
    protected SearchStringField issueNumber;
    protected SearchMultiSelectField item;
    protected SearchDateField lastModifiedDate;
    protected SearchMultiSelectField module;
    protected SearchLongField number;
    protected SearchStringField originalFixedIn;
    protected SearchMultiSelectField priority;
    protected SearchMultiSelectField product;
    protected SearchMultiSelectField productTeam;
    protected SearchMultiSelectField relatedIssue;
    protected SearchEnumMultiSelectField relationship;
    protected SearchStringField relationshipComment;
    protected SearchMultiSelectField reportedBy;
    protected SearchMultiSelectField reproduce;
    protected SearchDateField resolved;
    protected SearchMultiSelectField resolvedBy;
    protected SearchMultiSelectField reviewer;
    protected SearchMultiSelectField severity;
    protected SearchEnumMultiSelectField source;
    protected SearchMultiSelectField status;
    protected SearchMultiSelectField tags;
    protected SearchBooleanField tracking;
    protected SearchMultiSelectField type;
    protected SearchMultiSelectField userType;
    protected SearchMultiSelectField versionBroken;
    protected SearchMultiSelectField versionFixed;
    protected SearchMultiSelectField versionTarget;
    protected SearchCustomFieldList customFieldList;

    /**
     * ��ȡageInMonths���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getAgeInMonths() {
        return ageInMonths;
    }

    /**
     * ����ageInMonths���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setAgeInMonths(SearchLongField value) {
        this.ageInMonths = value;
    }

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
     * ��ȡbuildBroken���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBuildBroken() {
        return buildBroken;
    }

    /**
     * ����buildBroken���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBuildBroken(SearchMultiSelectField value) {
        this.buildBroken = value;
    }

    /**
     * ��ȡbuildBrokenName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBuildBrokenName() {
        return buildBrokenName;
    }

    /**
     * ����buildBrokenName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBuildBrokenName(SearchStringField value) {
        this.buildBrokenName = value;
    }

    /**
     * ��ȡbuildFixed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBuildFixed() {
        return buildFixed;
    }

    /**
     * ����buildFixed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBuildFixed(SearchMultiSelectField value) {
        this.buildFixed = value;
    }

    /**
     * ��ȡbuildFixedName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBuildFixedName() {
        return buildFixedName;
    }

    /**
     * ����buildFixedName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBuildFixedName(SearchStringField value) {
        this.buildFixedName = value;
    }

    /**
     * ��ȡbuildTarget���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBuildTarget() {
        return buildTarget;
    }

    /**
     * ����buildTarget���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBuildTarget(SearchMultiSelectField value) {
        this.buildTarget = value;
    }

    /**
     * ��ȡbuildTargetName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBuildTargetName() {
        return buildTargetName;
    }

    /**
     * ����buildTargetName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBuildTargetName(SearchStringField value) {
        this.buildTargetName = value;
    }

    /**
     * ��ȡcaseCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getCaseCount() {
        return caseCount;
    }

    /**
     * ����caseCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setCaseCount(SearchLongField value) {
        this.caseCount = value;
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
     * ��ȡdateReleased���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getDateReleased() {
        return dateReleased;
    }

    /**
     * ����dateReleased���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setDateReleased(SearchDateField value) {
        this.dateReleased = value;
    }

    /**
     * ��ȡdetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getDetails() {
        return details;
    }

    /**
     * ����details���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setDetails(SearchStringField value) {
        this.details = value;
    }

    /**
     * ��ȡduplicateOf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDuplicateOf() {
        return duplicateOf;
    }

    /**
     * ����duplicateOf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDuplicateOf(SearchMultiSelectField value) {
        this.duplicateOf = value;
    }

    /**
     * ��ȡeFix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getEFix() {
        return eFix;
    }

    /**
     * ����eFix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setEFix(SearchBooleanField value) {
        this.eFix = value;
    }

    /**
     * ��ȡemployeeOrTeam���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getEmployeeOrTeam() {
        return employeeOrTeam;
    }

    /**
     * ����employeeOrTeam���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setEmployeeOrTeam(SearchMultiSelectField value) {
        this.employeeOrTeam = value;
    }

    /**
     * ��ȡeventStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getEventStatus() {
        return eventStatus;
    }

    /**
     * ����eventStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setEventStatus(SearchEnumMultiSelectField value) {
        this.eventStatus = value;
    }

    /**
     * ��ȡexternalAbstract���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalAbstract() {
        return externalAbstract;
    }

    /**
     * ����externalAbstract���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalAbstract(SearchStringField value) {
        this.externalAbstract = value;
    }

    /**
     * ��ȡexternalDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalDetails() {
        return externalDetails;
    }

    /**
     * ����externalDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalDetails(SearchStringField value) {
        this.externalDetails = value;
    }

    /**
     * ��ȡexternalFixedIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalFixedIn() {
        return externalFixedIn;
    }

    /**
     * ����externalFixedIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalFixedIn(SearchMultiSelectField value) {
        this.externalFixedIn = value;
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
     * ��ȡexternalStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalStatus() {
        return externalStatus;
    }

    /**
     * ����externalStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalStatus(SearchMultiSelectField value) {
        this.externalStatus = value;
    }

    /**
     * ��ȡfixed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getFixed() {
        return fixed;
    }

    /**
     * ����fixed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setFixed(SearchDateField value) {
        this.fixed = value;
    }

    /**
     * ��ȡfixedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getFixedBy() {
        return fixedBy;
    }

    /**
     * ����fixedBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setFixedBy(SearchMultiSelectField value) {
        this.fixedBy = value;
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
     * ��ȡisOwner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsOwner() {
        return isOwner;
    }

    /**
     * ����isOwner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsOwner(SearchBooleanField value) {
        this.isOwner = value;
    }

    /**
     * ��ȡisReviewed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsReviewed() {
        return isReviewed;
    }

    /**
     * ����isReviewed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsReviewed(SearchBooleanField value) {
        this.isReviewed = value;
    }

    /**
     * ��ȡisShowStopper���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsShowStopper() {
        return isShowStopper;
    }

    /**
     * ����isShowStopper���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsShowStopper(SearchBooleanField value) {
        this.isShowStopper = value;
    }

    /**
     * ��ȡissueAbstract���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getIssueAbstract() {
        return issueAbstract;
    }

    /**
     * ����issueAbstract���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setIssueAbstract(SearchStringField value) {
        this.issueAbstract = value;
    }

    /**
     * ��ȡissueNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getIssueNumber() {
        return issueNumber;
    }

    /**
     * ����issueNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setIssueNumber(SearchStringField value) {
        this.issueNumber = value;
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
     * ��ȡoriginalFixedIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getOriginalFixedIn() {
        return originalFixedIn;
    }

    /**
     * ����originalFixedIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setOriginalFixedIn(SearchStringField value) {
        this.originalFixedIn = value;
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
     * ��ȡproductTeam���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getProductTeam() {
        return productTeam;
    }

    /**
     * ����productTeam���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setProductTeam(SearchMultiSelectField value) {
        this.productTeam = value;
    }

    /**
     * ��ȡrelatedIssue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getRelatedIssue() {
        return relatedIssue;
    }

    /**
     * ����relatedIssue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setRelatedIssue(SearchMultiSelectField value) {
        this.relatedIssue = value;
    }

    /**
     * ��ȡrelationship���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getRelationship() {
        return relationship;
    }

    /**
     * ����relationship���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setRelationship(SearchEnumMultiSelectField value) {
        this.relationship = value;
    }

    /**
     * ��ȡrelationshipComment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getRelationshipComment() {
        return relationshipComment;
    }

    /**
     * ����relationshipComment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setRelationshipComment(SearchStringField value) {
        this.relationshipComment = value;
    }

    /**
     * ��ȡreportedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getReportedBy() {
        return reportedBy;
    }

    /**
     * ����reportedBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setReportedBy(SearchMultiSelectField value) {
        this.reportedBy = value;
    }

    /**
     * ��ȡreproduce���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getReproduce() {
        return reproduce;
    }

    /**
     * ����reproduce���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setReproduce(SearchMultiSelectField value) {
        this.reproduce = value;
    }

    /**
     * ��ȡresolved���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getResolved() {
        return resolved;
    }

    /**
     * ����resolved���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setResolved(SearchDateField value) {
        this.resolved = value;
    }

    /**
     * ��ȡresolvedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getResolvedBy() {
        return resolvedBy;
    }

    /**
     * ����resolvedBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setResolvedBy(SearchMultiSelectField value) {
        this.resolvedBy = value;
    }

    /**
     * ��ȡreviewer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getReviewer() {
        return reviewer;
    }

    /**
     * ����reviewer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setReviewer(SearchMultiSelectField value) {
        this.reviewer = value;
    }

    /**
     * ��ȡseverity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSeverity() {
        return severity;
    }

    /**
     * ����severity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSeverity(SearchMultiSelectField value) {
        this.severity = value;
    }

    /**
     * ��ȡsource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSource() {
        return source;
    }

    /**
     * ����source���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSource(SearchEnumMultiSelectField value) {
        this.source = value;
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
     * ��ȡtags���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTags() {
        return tags;
    }

    /**
     * ����tags���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTags(SearchMultiSelectField value) {
        this.tags = value;
    }

    /**
     * ��ȡtracking���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getTracking() {
        return tracking;
    }

    /**
     * ����tracking���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setTracking(SearchBooleanField value) {
        this.tracking = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setType(SearchMultiSelectField value) {
        this.type = value;
    }

    /**
     * ��ȡuserType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getUserType() {
        return userType;
    }

    /**
     * ����userType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setUserType(SearchMultiSelectField value) {
        this.userType = value;
    }

    /**
     * ��ȡversionBroken���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getVersionBroken() {
        return versionBroken;
    }

    /**
     * ����versionBroken���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setVersionBroken(SearchMultiSelectField value) {
        this.versionBroken = value;
    }

    /**
     * ��ȡversionFixed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getVersionFixed() {
        return versionFixed;
    }

    /**
     * ����versionFixed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setVersionFixed(SearchMultiSelectField value) {
        this.versionFixed = value;
    }

    /**
     * ��ȡversionTarget���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getVersionTarget() {
        return versionTarget;
    }

    /**
     * ����versionTarget���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setVersionTarget(SearchMultiSelectField value) {
        this.versionTarget = value;
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
