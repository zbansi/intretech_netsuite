
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.RecordType;


/**
 * <p>GetSelectValueFieldDescription complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetSelectValueFieldDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordType" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}RecordType" minOccurs="0"/>
 *         &lt;element name="customRecordType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="customTransactionType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sublist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="filter" type="{urn:core_2018_2.platform.webservices.netsuite.com}GetSelectValueFilter" minOccurs="0"/>
 *         &lt;element name="filterByValueList" type="{urn:core_2018_2.platform.webservices.netsuite.com}GetSelectFilterByFieldValueList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSelectValueFieldDescription", propOrder = {
    "recordType",
    "customRecordType",
    "customTransactionType",
    "sublist",
    "field",
    "customForm",
    "filter",
    "filterByValueList"
})
public class GetSelectValueFieldDescription {

    @XmlSchemaType(name = "string")
    protected RecordType recordType;
    protected RecordRef customRecordType;
    protected RecordRef customTransactionType;
    protected String sublist;
    @XmlElement(required = true)
    protected String field;
    protected RecordRef customForm;
    protected GetSelectValueFilter filter;
    protected GetSelectFilterByFieldValueList filterByValueList;

    /**
     * ��ȡrecordType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordType }
     *     
     */
    public RecordType getRecordType() {
        return recordType;
    }

    /**
     * ����recordType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordType }
     *     
     */
    public void setRecordType(RecordType value) {
        this.recordType = value;
    }

    /**
     * ��ȡcustomRecordType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomRecordType() {
        return customRecordType;
    }

    /**
     * ����customRecordType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomRecordType(RecordRef value) {
        this.customRecordType = value;
    }

    /**
     * ��ȡcustomTransactionType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomTransactionType() {
        return customTransactionType;
    }

    /**
     * ����customTransactionType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomTransactionType(RecordRef value) {
        this.customTransactionType = value;
    }

    /**
     * ��ȡsublist���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSublist() {
        return sublist;
    }

    /**
     * ����sublist���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSublist(String value) {
        this.sublist = value;
    }

    /**
     * ��ȡfield���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * ����field���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * ��ȡcustomForm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * ����customForm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

    /**
     * ��ȡfilter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetSelectValueFilter }
     *     
     */
    public GetSelectValueFilter getFilter() {
        return filter;
    }

    /**
     * ����filter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetSelectValueFilter }
     *     
     */
    public void setFilter(GetSelectValueFilter value) {
        this.filter = value;
    }

    /**
     * ��ȡfilterByValueList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetSelectFilterByFieldValueList }
     *     
     */
    public GetSelectFilterByFieldValueList getFilterByValueList() {
        return filterByValueList;
    }

    /**
     * ����filterByValueList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetSelectFilterByFieldValueList }
     *     
     */
    public void setFilterByValueList(GetSelectFilterByFieldValueList value) {
        this.filterByValueList = value;
    }

}
