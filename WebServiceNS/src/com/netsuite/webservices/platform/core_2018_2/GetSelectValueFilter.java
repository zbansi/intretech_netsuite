
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.GetSelectValueFilterOperator;


/**
 * <p>GetSelectValueFilter complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfilterValue���Ե�ֵ��
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
     * ����filterValue���Ե�ֵ��
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
     * ��ȡoperator���Ե�ֵ��
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
     * ����operator���Ե�ֵ��
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
