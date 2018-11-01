
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.SearchLongFieldOperator;


/**
 * <p>SearchLongCustomField complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchLongCustomField">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchCustomField">
 *       &lt;sequence>
 *         &lt;element name="searchValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="searchValue2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}SearchLongFieldOperator" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchLongCustomField", propOrder = {
    "searchValue",
    "searchValue2"
})
public class SearchLongCustomField
    extends SearchCustomField
{

    protected Long searchValue;
    protected Long searchValue2;
    @XmlAttribute(name = "operator")
    protected SearchLongFieldOperator operator;

    /**
     * 获取searchValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSearchValue() {
        return searchValue;
    }

    /**
     * 设置searchValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSearchValue(Long value) {
        this.searchValue = value;
    }

    /**
     * 获取searchValue2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSearchValue2() {
        return searchValue2;
    }

    /**
     * 设置searchValue2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSearchValue2(Long value) {
        this.searchValue2 = value;
    }

    /**
     * 获取operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongFieldOperator }
     *     
     */
    public SearchLongFieldOperator getOperator() {
        return operator;
    }

    /**
     * 设置operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongFieldOperator }
     *     
     */
    public void setOperator(SearchLongFieldOperator value) {
        this.operator = value;
    }

}
