
package com.netsuite.webservices.lists.employees_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>EmployeeSearchAdvanced complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EmployeeSearchAdvanced">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="criteria" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeSearch" minOccurs="0"/>
 *         &lt;element name="columns" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeSearchRow" minOccurs="0"/>
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
@XmlType(name = "EmployeeSearchAdvanced", propOrder = {
    "criteria",
    "columns"
})
public class EmployeeSearchAdvanced
    extends SearchRecord
{

    protected EmployeeSearch criteria;
    protected EmployeeSearchRow columns;
    @XmlAttribute(name = "savedSearchId")
    protected String savedSearchId;
    @XmlAttribute(name = "savedSearchScriptId")
    protected String savedSearchScriptId;

    /**
     * ��ȡcriteria���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearch }
     *     
     */
    public EmployeeSearch getCriteria() {
        return criteria;
    }

    /**
     * ����criteria���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearch }
     *     
     */
    public void setCriteria(EmployeeSearch value) {
        this.criteria = value;
    }

    /**
     * ��ȡcolumns���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRow }
     *     
     */
    public EmployeeSearchRow getColumns() {
        return columns;
    }

    /**
     * ����columns���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRow }
     *     
     */
    public void setColumns(EmployeeSearchRow value) {
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