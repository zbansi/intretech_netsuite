
package com.netsuite.webservices.setup.customization_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>CustomRecordTypeSublists complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrecordSearch���Ե�ֵ��
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
     * ����recordSearch���Ե�ֵ��
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
     * ��ȡrecordDescr���Ե�ֵ��
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
     * ����recordDescr���Ե�ֵ��
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
     * ��ȡrecordDescrLanguageValueList���Ե�ֵ��
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
     * ����recordDescrLanguageValueList���Ե�ֵ��
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
     * ��ȡrecordTab���Ե�ֵ��
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
     * ����recordTab���Ե�ֵ��
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
     * ��ȡrecordId���Ե�ֵ��
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
     * ����recordId���Ե�ֵ��
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
