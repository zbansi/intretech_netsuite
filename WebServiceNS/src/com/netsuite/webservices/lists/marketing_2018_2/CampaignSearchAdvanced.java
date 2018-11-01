
package com.netsuite.webservices.lists.marketing_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>CampaignSearchAdvanced complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CampaignSearchAdvanced">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="criteria" type="{urn:marketing_2018_2.lists.webservices.netsuite.com}CampaignSearch" minOccurs="0"/>
 *         &lt;element name="columns" type="{urn:marketing_2018_2.lists.webservices.netsuite.com}CampaignSearchRow" minOccurs="0"/>
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
@XmlType(name = "CampaignSearchAdvanced", propOrder = {
    "criteria",
    "columns"
})
public class CampaignSearchAdvanced
    extends SearchRecord
{

    protected CampaignSearch criteria;
    protected CampaignSearchRow columns;
    @XmlAttribute(name = "savedSearchId")
    protected String savedSearchId;
    @XmlAttribute(name = "savedSearchScriptId")
    protected String savedSearchScriptId;

    /**
     * 获取criteria属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearch }
     *     
     */
    public CampaignSearch getCriteria() {
        return criteria;
    }

    /**
     * 设置criteria属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearch }
     *     
     */
    public void setCriteria(CampaignSearch value) {
        this.criteria = value;
    }

    /**
     * 获取columns属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchRow }
     *     
     */
    public CampaignSearchRow getColumns() {
        return columns;
    }

    /**
     * 设置columns属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchRow }
     *     
     */
    public void setColumns(CampaignSearchRow value) {
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
