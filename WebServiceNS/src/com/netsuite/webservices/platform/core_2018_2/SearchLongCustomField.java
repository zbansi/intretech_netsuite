
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.SearchLongFieldOperator;


/**
 * <p>SearchLongCustomField complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsearchValue���Ե�ֵ��
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
     * ����searchValue���Ե�ֵ��
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
     * ��ȡsearchValue2���Ե�ֵ��
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
     * ����searchValue2���Ե�ֵ��
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
     * ��ȡoperator���Ե�ֵ��
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
     * ����operator���Ե�ֵ��
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
