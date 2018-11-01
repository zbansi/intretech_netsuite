
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
 * <p>IssueSearchBasic complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取ageInMonths属性的值。
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
     * 设置ageInMonths属性的值。
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
     * 获取assigned属性的值。
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
     * 设置assigned属性的值。
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
     * 获取buildBroken属性的值。
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
     * 设置buildBroken属性的值。
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
     * 获取buildBrokenName属性的值。
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
     * 设置buildBrokenName属性的值。
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
     * 获取buildFixed属性的值。
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
     * 设置buildFixed属性的值。
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
     * 获取buildFixedName属性的值。
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
     * 设置buildFixedName属性的值。
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
     * 获取buildTarget属性的值。
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
     * 设置buildTarget属性的值。
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
     * 获取buildTargetName属性的值。
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
     * 设置buildTargetName属性的值。
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
     * 获取caseCount属性的值。
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
     * 设置caseCount属性的值。
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
     * 获取caseNumber属性的值。
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
     * 设置caseNumber属性的值。
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
     * 获取closedDate属性的值。
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
     * 设置closedDate属性的值。
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
     * 获取createdDate属性的值。
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
     * 设置createdDate属性的值。
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
     * 获取dateReleased属性的值。
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
     * 设置dateReleased属性的值。
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
     * 获取details属性的值。
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
     * 设置details属性的值。
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
     * 获取duplicateOf属性的值。
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
     * 设置duplicateOf属性的值。
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
     * 获取eFix属性的值。
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
     * 设置eFix属性的值。
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
     * 获取employeeOrTeam属性的值。
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
     * 设置employeeOrTeam属性的值。
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
     * 获取eventStatus属性的值。
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
     * 设置eventStatus属性的值。
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
     * 获取externalAbstract属性的值。
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
     * 设置externalAbstract属性的值。
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
     * 获取externalDetails属性的值。
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
     * 设置externalDetails属性的值。
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
     * 获取externalFixedIn属性的值。
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
     * 设置externalFixedIn属性的值。
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
     * 获取externalId属性的值。
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
     * 设置externalId属性的值。
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
     * 获取externalIdString属性的值。
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
     * 设置externalIdString属性的值。
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
     * 获取externalStatus属性的值。
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
     * 设置externalStatus属性的值。
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
     * 获取fixed属性的值。
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
     * 设置fixed属性的值。
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
     * 获取fixedBy属性的值。
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
     * 设置fixedBy属性的值。
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
     * 获取internalId属性的值。
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
     * 设置internalId属性的值。
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
     * 获取internalIdNumber属性的值。
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
     * 设置internalIdNumber属性的值。
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
     * 获取isOwner属性的值。
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
     * 设置isOwner属性的值。
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
     * 获取isReviewed属性的值。
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
     * 设置isReviewed属性的值。
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
     * 获取isShowStopper属性的值。
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
     * 设置isShowStopper属性的值。
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
     * 获取issueAbstract属性的值。
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
     * 设置issueAbstract属性的值。
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
     * 获取issueNumber属性的值。
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
     * 设置issueNumber属性的值。
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
     * 获取item属性的值。
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
     * 设置item属性的值。
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
     * 获取lastModifiedDate属性的值。
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
     * 设置lastModifiedDate属性的值。
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
     * 获取module属性的值。
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
     * 设置module属性的值。
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
     * 获取number属性的值。
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
     * 设置number属性的值。
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
     * 获取originalFixedIn属性的值。
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
     * 设置originalFixedIn属性的值。
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
     * 获取priority属性的值。
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
     * 设置priority属性的值。
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
     * 获取product属性的值。
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
     * 设置product属性的值。
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
     * 获取productTeam属性的值。
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
     * 设置productTeam属性的值。
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
     * 获取relatedIssue属性的值。
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
     * 设置relatedIssue属性的值。
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
     * 获取relationship属性的值。
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
     * 设置relationship属性的值。
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
     * 获取relationshipComment属性的值。
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
     * 设置relationshipComment属性的值。
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
     * 获取reportedBy属性的值。
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
     * 设置reportedBy属性的值。
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
     * 获取reproduce属性的值。
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
     * 设置reproduce属性的值。
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
     * 获取resolved属性的值。
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
     * 设置resolved属性的值。
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
     * 获取resolvedBy属性的值。
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
     * 设置resolvedBy属性的值。
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
     * 获取reviewer属性的值。
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
     * 设置reviewer属性的值。
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
     * 获取severity属性的值。
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
     * 设置severity属性的值。
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
     * 获取source属性的值。
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
     * 设置source属性的值。
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
     * 获取status属性的值。
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
     * 设置status属性的值。
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
     * 获取tags属性的值。
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
     * 设置tags属性的值。
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
     * 获取tracking属性的值。
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
     * 设置tracking属性的值。
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
     * 获取type属性的值。
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
     * 设置type属性的值。
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
     * 获取userType属性的值。
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
     * 设置userType属性的值。
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
     * 获取versionBroken属性的值。
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
     * 设置versionBroken属性的值。
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
     * 获取versionFixed属性的值。
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
     * 设置versionFixed属性的值。
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
     * 获取versionTarget属性的值。
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
     * 设置versionTarget属性的值。
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
     * 获取customFieldList属性的值。
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
     * 设置customFieldList属性的值。
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
