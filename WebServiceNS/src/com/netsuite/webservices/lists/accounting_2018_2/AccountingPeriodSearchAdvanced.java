
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>AccountingPeriodSearchAdvanced complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccountingPeriodSearchAdvanced">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="criteria" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}AccountingPeriodSearch" minOccurs="0"/>
 *         &lt;element name="columns" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}AccountingPeriodSearchRow" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="savedSearchId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="savedSearchScriptId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingPeriodSearchAdvanced", propOrder = {
    "criteria",
    "columns"
})
public class AccountingPeriodSearchAdvanced
    extends SearchRecord
{

    protected AccountingPeriodSearch criteria;
    protected AccountingPeriodSearchRow columns;
    @XmlAttribute(name = "savedSearchId")
    protected String savedSearchId;
    @XmlAttribute(name = "savedSearchScriptId")
    protected String savedSearchScriptId;

    /**
     * 获取criteria属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodSearch }
     *     
     */
    public AccountingPeriodSearch getCriteria() {
        return criteria;
    }

    /**
     * 设置criteria属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodSearch }
     *     
     */
    public void setCriteria(AccountingPeriodSearch value) {
        this.criteria = value;
    }

    /**
     * 获取columns属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodSearchRow }
     *     
     */
    public AccountingPeriodSearchRow getColumns() {
        return columns;
    }

    /**
     * 设置columns属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodSearchRow }
     *     
     */
    public void setColumns(AccountingPeriodSearchRow value) {
        this.columns = value;
    }

    /**
     * 获取savedSearchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedSearchId() {
        return savedSearchId;
    }

    /**
     * 设置savedSearchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedSearchId(String value) {
        this.savedSearchId = value;
    }

    /**
     * 获取savedSearchScriptId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedSearchScriptId() {
        return savedSearchScriptId;
    }

    /**
     * 设置savedSearchScriptId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedSearchScriptId(String value) {
        this.savedSearchScriptId = value;
    }

}
