
package com.netsuite.webservices.setup.customization_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomRecordTypePermissionsPermittedLevel;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomRecordTypePermissionsRestriction;


/**
 * <p>CustomRecordTypePermissions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomRecordTypePermissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="permittedRole" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="permittedLevel" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypePermissionsPermittedLevel" minOccurs="0"/>
 *         &lt;element name="restriction" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypePermissionsRestriction" minOccurs="0"/>
 *         &lt;element name="defaultForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="restrictForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="searchForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="searchResults" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="listView" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="listViewRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dashboardView" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="restrictDashboardView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sublistView" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="restrictSublistView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRecordTypePermissions", propOrder = {
    "permittedRole",
    "permittedLevel",
    "restriction",
    "defaultForm",
    "restrictForm",
    "searchForm",
    "searchResults",
    "listView",
    "listViewRestricted",
    "dashboardView",
    "restrictDashboardView",
    "sublistView",
    "restrictSublistView"
})
public class CustomRecordTypePermissions {

    protected RecordRef permittedRole;
    @XmlSchemaType(name = "string")
    protected CustomRecordTypePermissionsPermittedLevel permittedLevel;
    @XmlSchemaType(name = "string")
    protected CustomRecordTypePermissionsRestriction restriction;
    protected RecordRef defaultForm;
    protected Boolean restrictForm;
    protected RecordRef searchForm;
    protected RecordRef searchResults;
    protected RecordRef listView;
    protected Boolean listViewRestricted;
    protected RecordRef dashboardView;
    protected Boolean restrictDashboardView;
    protected RecordRef sublistView;
    protected Boolean restrictSublistView;

    /**
     * 获取permittedRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPermittedRole() {
        return permittedRole;
    }

    /**
     * 设置permittedRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPermittedRole(RecordRef value) {
        this.permittedRole = value;
    }

    /**
     * 获取permittedLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypePermissionsPermittedLevel }
     *     
     */
    public CustomRecordTypePermissionsPermittedLevel getPermittedLevel() {
        return permittedLevel;
    }

    /**
     * 设置permittedLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypePermissionsPermittedLevel }
     *     
     */
    public void setPermittedLevel(CustomRecordTypePermissionsPermittedLevel value) {
        this.permittedLevel = value;
    }

    /**
     * 获取restriction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypePermissionsRestriction }
     *     
     */
    public CustomRecordTypePermissionsRestriction getRestriction() {
        return restriction;
    }

    /**
     * 设置restriction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypePermissionsRestriction }
     *     
     */
    public void setRestriction(CustomRecordTypePermissionsRestriction value) {
        this.restriction = value;
    }

    /**
     * 获取defaultForm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDefaultForm() {
        return defaultForm;
    }

    /**
     * 设置defaultForm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDefaultForm(RecordRef value) {
        this.defaultForm = value;
    }

    /**
     * 获取restrictForm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictForm() {
        return restrictForm;
    }

    /**
     * 设置restrictForm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictForm(Boolean value) {
        this.restrictForm = value;
    }

    /**
     * 获取searchForm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSearchForm() {
        return searchForm;
    }

    /**
     * 设置searchForm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSearchForm(RecordRef value) {
        this.searchForm = value;
    }

    /**
     * 获取searchResults属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSearchResults() {
        return searchResults;
    }

    /**
     * 设置searchResults属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSearchResults(RecordRef value) {
        this.searchResults = value;
    }

    /**
     * 获取listView属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getListView() {
        return listView;
    }

    /**
     * 设置listView属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setListView(RecordRef value) {
        this.listView = value;
    }

    /**
     * 获取listViewRestricted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListViewRestricted() {
        return listViewRestricted;
    }

    /**
     * 设置listViewRestricted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListViewRestricted(Boolean value) {
        this.listViewRestricted = value;
    }

    /**
     * 获取dashboardView属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDashboardView() {
        return dashboardView;
    }

    /**
     * 设置dashboardView属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDashboardView(RecordRef value) {
        this.dashboardView = value;
    }

    /**
     * 获取restrictDashboardView属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictDashboardView() {
        return restrictDashboardView;
    }

    /**
     * 设置restrictDashboardView属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictDashboardView(Boolean value) {
        this.restrictDashboardView = value;
    }

    /**
     * 获取sublistView属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSublistView() {
        return sublistView;
    }

    /**
     * 设置sublistView属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSublistView(RecordRef value) {
        this.sublistView = value;
    }

    /**
     * 获取restrictSublistView属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictSublistView() {
        return restrictSublistView;
    }

    /**
     * 设置restrictSublistView属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictSublistView(Boolean value) {
        this.restrictSublistView = value;
    }

}
