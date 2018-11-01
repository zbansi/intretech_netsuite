
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SearchColumnSelectCustomField complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchColumnSelectCustomField">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnCustomField">
 *       &lt;sequence>
 *         &lt;element name="searchValue" type="{urn:core_2018_2.platform.webservices.netsuite.com}ListOrRecordRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchColumnSelectCustomField", propOrder = {
    "searchValue"
})
public class SearchColumnSelectCustomField
    extends SearchColumnCustomField
{

    protected ListOrRecordRef searchValue;

    /**
     * 获取searchValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ListOrRecordRef }
     *     
     */
    public ListOrRecordRef getSearchValue() {
        return searchValue;
    }

    /**
     * 设置searchValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ListOrRecordRef }
     *     
     */
    public void setSearchValue(ListOrRecordRef value) {
        this.searchValue = value;
    }

}
