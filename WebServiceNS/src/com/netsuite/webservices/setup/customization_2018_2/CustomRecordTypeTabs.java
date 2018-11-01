
package com.netsuite.webservices.setup.customization_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>CustomRecordTypeTabs complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CustomRecordTypeTabs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tabTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tabParent" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="tabTitleLanguageValueList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}LanguageValueList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRecordTypeTabs", propOrder = {
    "tabTitle",
    "tabParent",
    "tabTitleLanguageValueList"
})
public class CustomRecordTypeTabs {

    protected String tabTitle;
    protected RecordRef tabParent;
    protected LanguageValueList tabTitleLanguageValueList;

    /**
     * ��ȡtabTitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabTitle() {
        return tabTitle;
    }

    /**
     * ����tabTitle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabTitle(String value) {
        this.tabTitle = value;
    }

    /**
     * ��ȡtabParent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTabParent() {
        return tabParent;
    }

    /**
     * ����tabParent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTabParent(RecordRef value) {
        this.tabParent = value;
    }

    /**
     * ��ȡtabTitleLanguageValueList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LanguageValueList }
     *     
     */
    public LanguageValueList getTabTitleLanguageValueList() {
        return tabTitleLanguageValueList;
    }

    /**
     * ����tabTitleLanguageValueList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageValueList }
     *     
     */
    public void setTabTitleLanguageValueList(LanguageValueList value) {
        this.tabTitleLanguageValueList = value;
    }

}
