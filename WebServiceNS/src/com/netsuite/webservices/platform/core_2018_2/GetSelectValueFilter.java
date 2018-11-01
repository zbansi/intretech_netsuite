
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.GetSelectValueFilterOperator;


/**
 * <p>GetSelectValueFilter complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetSelectValueFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filterValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" use="required" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}GetSelectValueFilterOperator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSelectValueFilter", propOrder = {
    "filterValue"
})
public class GetSelectValueFilter {

    @XmlElement(required = true)
    protected String filterValue;
    @XmlAttribute(name = "operator", required = true)
    protected GetSelectValueFilterOperator operator;

    /**
     * 获取filterValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterValue() {
        return filterValue;
    }

    /**
     * 设置filterValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterValue(String value) {
        this.filterValue = value;
    }

    /**
     * 获取operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetSelectValueFilterOperator }
     *     
     */
    public GetSelectValueFilterOperator getOperator() {
        return operator;
    }

    /**
     * 设置operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetSelectValueFilterOperator }
     *     
     */
    public void setOperator(GetSelectValueFilterOperator value) {
        this.operator = value;
    }

}
