
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SearchBooleanCustomField complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SearchBooleanCustomField">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchCustomField">
 *       &lt;sequence>
 *         &lt;element name="searchValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBooleanCustomField", propOrder = {
    "searchValue"
})
public class SearchBooleanCustomField
    extends SearchCustomField
{

    protected Boolean searchValue;

    /**
     * ��ȡsearchValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchValue() {
        return searchValue;
    }

    /**
     * ����searchValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchValue(Boolean value) {
        this.searchValue = value;
    }

}
