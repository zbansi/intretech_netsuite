
package com.netsuite.webservices.platform.core_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.SearchEnumMultiSelectFieldOperator;


/**
 * <p>SearchEnumMultiSelectCustomField complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchEnumMultiSelectCustomField">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchCustomField">
 *       &lt;sequence>
 *         &lt;element name="searchValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectFieldOperator" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchEnumMultiSelectCustomField", propOrder = {
    "searchValue"
})
public class SearchEnumMultiSelectCustomField
    extends SearchCustomField
{

    protected List<String> searchValue;
    @XmlAttribute(name = "operator")
    protected SearchEnumMultiSelectFieldOperator operator;

    /**
     * Gets the value of the searchValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSearchValue() {
        if (searchValue == null) {
            searchValue = new ArrayList<String>();
        }
        return this.searchValue;
    }

    /**
     * 获取operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectFieldOperator }
     *     
     */
    public SearchEnumMultiSelectFieldOperator getOperator() {
        return operator;
    }

    /**
     * 设置operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectFieldOperator }
     *     
     */
    public void setOperator(SearchEnumMultiSelectFieldOperator value) {
        this.operator = value;
    }

}
