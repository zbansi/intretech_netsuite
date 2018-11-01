
package com.netsuite.webservices.setup.customization_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>CustomRecordTypeSublists complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomRecordTypeSublists">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordSearch" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="recordDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordDescrLanguageValueList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}LanguageValueList" minOccurs="0"/>
 *         &lt;element name="recordTab" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRecordTypeSublists", propOrder = {
    "recordSearch",
    "recordDescr",
    "recordDescrLanguageValueList",
    "recordTab",
    "recordId"
})
public class CustomRecordTypeSublists {

    protected RecordRef recordSearch;
    protected String recordDescr;
    protected LanguageValueList recordDescrLanguageValueList;
    protected RecordRef recordTab;
    protected String recordId;

    /**
     * 获取recordSearch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRecordSearch() {
        return recordSearch;
    }

    /**
     * 设置recordSearch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRecordSearch(RecordRef value) {
        this.recordSearch = value;
    }

    /**
     * 获取recordDescr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordDescr() {
        return recordDescr;
    }

    /**
     * 设置recordDescr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordDescr(String value) {
        this.recordDescr = value;
    }

    /**
     * 获取recordDescrLanguageValueList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LanguageValueList }
     *     
     */
    public LanguageValueList getRecordDescrLanguageValueList() {
        return recordDescrLanguageValueList;
    }

    /**
     * 设置recordDescrLanguageValueList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageValueList }
     *     
     */
    public void setRecordDescrLanguageValueList(LanguageValueList value) {
        this.recordDescrLanguageValueList = value;
    }

    /**
     * 获取recordTab属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRecordTab() {
        return recordTab;
    }

    /**
     * 设置recordTab属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRecordTab(RecordRef value) {
        this.recordTab = value;
    }

    /**
     * 获取recordId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * 设置recordId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordId(String value) {
        this.recordId = value;
    }

}
