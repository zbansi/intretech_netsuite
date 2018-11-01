
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.RecordType;


/**
 * <p>GetSelectValueFieldDescription complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取recordType属性的值。
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
     * 设置recordType属性的值。
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
     * 获取customRecordType属性的值。
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
     * 设置customRecordType属性的值。
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
     * 获取customTransactionType属性的值。
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
     * 设置customTransactionType属性的值。
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
     * 获取sublist属性的值。
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
     * 设置sublist属性的值。
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
     * 获取field属性的值。
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
     * 设置field属性的值。
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
     * 获取customForm属性的值。
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
     * 设置customForm属性的值。
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
     * 获取filter属性的值。
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
     * 设置filter属性的值。
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
     * 获取filterByValueList属性的值。
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
     * 设置filterByValueList属性的值。
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
