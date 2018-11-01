
package com.netsuite.webservices.setup.customization_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomRecordTypePermissionsPermittedLevel;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomRecordTypePermissionsRestriction;


/**
 * <p>CustomRecordTypePermissions complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡpermittedRole���Ե�ֵ��
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
     * ����permittedRole���Ե�ֵ��
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
     * ��ȡpermittedLevel���Ե�ֵ��
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
     * ����permittedLevel���Ե�ֵ��
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
     * ��ȡrestriction���Ե�ֵ��
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
     * ����restriction���Ե�ֵ��
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
     * ��ȡdefaultForm���Ե�ֵ��
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
     * ����defaultForm���Ե�ֵ��
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
     * ��ȡrestrictForm���Ե�ֵ��
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
     * ����restrictForm���Ե�ֵ��
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
     * ��ȡsearchForm���Ե�ֵ��
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
     * ����searchForm���Ե�ֵ��
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
     * ��ȡsearchResults���Ե�ֵ��
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
     * ����searchResults���Ե�ֵ��
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
     * ��ȡlistView���Ե�ֵ��
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
     * ����listView���Ե�ֵ��
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
     * ��ȡlistViewRestricted���Ե�ֵ��
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
     * ����listViewRestricted���Ե�ֵ��
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
     * ��ȡdashboardView���Ե�ֵ��
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
     * ����dashboardView���Ե�ֵ��
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
     * ��ȡrestrictDashboardView���Ե�ֵ��
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
     * ����restrictDashboardView���Ե�ֵ��
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
     * ��ȡsublistView���Ե�ֵ��
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
     * ����sublistView���Ե�ֵ��
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
     * ��ȡrestrictSublistView���Ե�ֵ��
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
     * ����restrictSublistView���Ե�ֵ��
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
