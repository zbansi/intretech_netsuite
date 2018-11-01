
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2018_2.types.SearchDate;
import com.netsuite.webservices.platform.core_2018_2.types.SearchDateFieldOperator;


/**
 * <p>SearchDateField complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SearchDateField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="predefinedSearchValue" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}SearchDate" minOccurs="0"/>
 *         &lt;element name="searchValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="searchValue2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}SearchDateFieldOperator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchDateField", propOrder = {
    "predefinedSearchValue",
    "searchValue",
    "searchValue2"
})
public class SearchDateField {

    @XmlSchemaType(name = "string")
    protected SearchDate predefinedSearchValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchValue2;
    @XmlAttribute(name = "operator")
    protected SearchDateFieldOperator operator;

    /**
     * ��ȡpredefinedSearchValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDate }
     *     
     */
    public SearchDate getPredefinedSearchValue() {
        return predefinedSearchValue;
    }

    /**
     * ����predefinedSearchValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDate }
     *     
     */
    public void setPredefinedSearchValue(SearchDate value) {
        this.predefinedSearchValue = value;
    }

    /**
     * ��ȡsearchValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchValue() {
        return searchValue;
    }

    /**
     * ����searchValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchValue(XMLGregorianCalendar value) {
        this.searchValue = value;
    }

    /**
     * ��ȡsearchValue2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchValue2() {
        return searchValue2;
    }

    /**
     * ����searchValue2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchValue2(XMLGregorianCalendar value) {
        this.searchValue2 = value;
    }

    /**
     * ��ȡoperator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateFieldOperator }
     *     
     */
    public SearchDateFieldOperator getOperator() {
        return operator;
    }

    /**
     * ����operator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateFieldOperator }
     *     
     */
    public void setOperator(SearchDateFieldOperator value) {
        this.operator = value;
    }

}
