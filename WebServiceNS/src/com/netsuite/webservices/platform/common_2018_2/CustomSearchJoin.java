
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.CustomizationRef;
import com.netsuite.webservices.platform.core_2018_2.SearchRecordBasic;


/**
 * <p>CustomSearchJoin complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CustomSearchJoin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customizationRef" type="{urn:core_2018_2.platform.webservices.netsuite.com}CustomizationRef"/>
 *         &lt;element name="searchRecordBasic" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecordBasic"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSearchJoin", propOrder = {
    "customizationRef",
    "searchRecordBasic"
})
public class CustomSearchJoin {

    @XmlElement(required = true)
    protected CustomizationRef customizationRef;
    @XmlElement(required = true)
    protected SearchRecordBasic searchRecordBasic;

    /**
     * ��ȡcustomizationRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomizationRef }
     *     
     */
    public CustomizationRef getCustomizationRef() {
        return customizationRef;
    }

    /**
     * ����customizationRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationRef }
     *     
     */
    public void setCustomizationRef(CustomizationRef value) {
        this.customizationRef = value;
    }

    /**
     * ��ȡsearchRecordBasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchRecordBasic }
     *     
     */
    public SearchRecordBasic getSearchRecordBasic() {
        return searchRecordBasic;
    }

    /**
     * ����searchRecordBasic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRecordBasic }
     *     
     */
    public void setSearchRecordBasic(SearchRecordBasic value) {
        this.searchRecordBasic = value;
    }

}
