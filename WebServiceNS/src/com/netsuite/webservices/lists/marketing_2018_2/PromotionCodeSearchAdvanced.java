
package com.netsuite.webservices.lists.marketing_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>PromotionCodeSearchAdvanced complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PromotionCodeSearchAdvanced">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="criteria" type="{urn:marketing_2018_2.lists.webservices.netsuite.com}PromotionCodeSearch" minOccurs="0"/>
 *         &lt;element name="columns" type="{urn:marketing_2018_2.lists.webservices.netsuite.com}PromotionCodeSearchRow" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="savedSearchScriptId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="savedSearchId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionCodeSearchAdvanced", propOrder = {
    "criteria",
    "columns"
})
public class PromotionCodeSearchAdvanced
    extends SearchRecord
{

    protected PromotionCodeSearch criteria;
    protected PromotionCodeSearchRow columns;
    @XmlAttribute(name = "savedSearchScriptId")
    protected String savedSearchScriptId;
    @XmlAttribute(name = "savedSearchId")
    protected String savedSearchId;

    /**
     * ��ȡcriteria���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodeSearch }
     *     
     */
    public PromotionCodeSearch getCriteria() {
        return criteria;
    }

    /**
     * ����criteria���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodeSearch }
     *     
     */
    public void setCriteria(PromotionCodeSearch value) {
        this.criteria = value;
    }

    /**
     * ��ȡcolumns���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodeSearchRow }
     *     
     */
    public PromotionCodeSearchRow getColumns() {
        return columns;
    }

    /**
     * ����columns���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodeSearchRow }
     *     
     */
    public void setColumns(PromotionCodeSearchRow value) {
        this.columns = value;
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

}
