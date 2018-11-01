
package com.netsuite.webservices.setup.customization_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomizationFilterCompareType;


/**
 * <p>CrmCustomFieldFilter complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CrmCustomFieldFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fldFilter" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="fldFilterChecked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fldFilterCompareType" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomizationFilterCompareType" minOccurs="0"/>
 *         &lt;element name="fldFilterVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fldFilterSelList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}FldFilterSelList" minOccurs="0"/>
 *         &lt;element name="fldFilterNotNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmCustomFieldFilter", propOrder = {
    "fldFilter",
    "fldFilterChecked",
    "fldFilterCompareType",
    "fldFilterVal",
    "fldFilterSelList",
    "fldFilterNotNull"
})
public class CrmCustomFieldFilter {

    protected RecordRef fldFilter;
    protected Boolean fldFilterChecked;
    @XmlSchemaType(name = "string")
    protected CustomizationFilterCompareType fldFilterCompareType;
    protected String fldFilterVal;
    protected FldFilterSelList fldFilterSelList;
    protected Boolean fldFilterNotNull;

    /**
     * ��ȡfldFilter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFldFilter() {
        return fldFilter;
    }

    /**
     * ����fldFilter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFldFilter(RecordRef value) {
        this.fldFilter = value;
    }

    /**
     * ��ȡfldFilterChecked���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFldFilterChecked() {
        return fldFilterChecked;
    }

    /**
     * ����fldFilterChecked���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFldFilterChecked(Boolean value) {
        this.fldFilterChecked = value;
    }

    /**
     * ��ȡfldFilterCompareType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomizationFilterCompareType }
     *     
     */
    public CustomizationFilterCompareType getFldFilterCompareType() {
        return fldFilterCompareType;
    }

    /**
     * ����fldFilterCompareType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationFilterCompareType }
     *     
     */
    public void setFldFilterCompareType(CustomizationFilterCompareType value) {
        this.fldFilterCompareType = value;
    }

    /**
     * ��ȡfldFilterVal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFldFilterVal() {
        return fldFilterVal;
    }

    /**
     * ����fldFilterVal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFldFilterVal(String value) {
        this.fldFilterVal = value;
    }

    /**
     * ��ȡfldFilterSelList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FldFilterSelList }
     *     
     */
    public FldFilterSelList getFldFilterSelList() {
        return fldFilterSelList;
    }

    /**
     * ����fldFilterSelList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FldFilterSelList }
     *     
     */
    public void setFldFilterSelList(FldFilterSelList value) {
        this.fldFilterSelList = value;
    }

    /**
     * ��ȡfldFilterNotNull���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFldFilterNotNull() {
        return fldFilterNotNull;
    }

    /**
     * ����fldFilterNotNull���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFldFilterNotNull(Boolean value) {
        this.fldFilterNotNull = value;
    }

}
