
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>ItemRevisionSearchAdvanced complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ItemRevisionSearchAdvanced">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="criteria" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ItemRevisionSearch" minOccurs="0"/>
 *         &lt;element name="columns" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ItemRevisionSearchRow" minOccurs="0"/>
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
@XmlType(name = "ItemRevisionSearchAdvanced", propOrder = {
    "criteria",
    "columns"
})
public class ItemRevisionSearchAdvanced
    extends SearchRecord
{

    protected ItemRevisionSearch criteria;
    protected ItemRevisionSearchRow columns;
    @XmlAttribute(name = "savedSearchId")
    protected String savedSearchId;
    @XmlAttribute(name = "savedSearchScriptId")
    protected String savedSearchScriptId;

    /**
     * ��ȡcriteria���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearch }
     *     
     */
    public ItemRevisionSearch getCriteria() {
        return criteria;
    }

    /**
     * ����criteria���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearch }
     *     
     */
    public void setCriteria(ItemRevisionSearch value) {
        this.criteria = value;
    }

    /**
     * ��ȡcolumns���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearchRow }
     *     
     */
    public ItemRevisionSearchRow getColumns() {
        return columns;
    }

    /**
     * ����columns���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearchRow }
     *     
     */
    public void setColumns(ItemRevisionSearchRow value) {
        this.columns = value;
    }

    /**
     * ��ȡsavedSearchId���Ե�ֵ��
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
     * ����savedSearchId���Ե�ֵ��
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
     * ��ȡsavedSearchScriptId���Ե�ֵ��
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
     * ����savedSearchScriptId���Ե�ֵ��
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
