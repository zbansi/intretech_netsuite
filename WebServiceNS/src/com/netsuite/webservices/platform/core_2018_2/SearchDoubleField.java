
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.SearchDoubleFieldOperator;


/**
 * <p>SearchDoubleField complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchDoubleField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="searchValue2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}SearchDoubleFieldOperator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchDoubleField", propOrder = {
    "searchValue",
    "searchValue2"
})
public class SearchDoubleField {

    protected Double searchValue;
    protected Double searchValue2;
    @XmlAttribute(name = "operator")
    protected SearchDoubleFieldOperator operator;

    /**
     * 获取searchValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSearchValue() {
        return searchValue;
    }

    /**
     * 设置searchValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSearchValue(Double value) {
        this.searchValue = value;
    }

    /**
     * 获取searchValue2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSearchValue2() {
        return searchValue2;
    }

    /**
     * 设置searchValue2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSearchValue2(Double value) {
        this.searchValue2 = value;
    }

    /**
     * 获取operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleFieldOperator }
     *     
     */
    public SearchDoubleFieldOperator getOperator() {
        return operator;
    }

    /**
     * 设置operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleFieldOperator }
     *     
     */
    public void setOperator(SearchDoubleFieldOperator value) {
        this.operator = value;
    }

}
