
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SearchPreferences complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SearchPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bodyFieldsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="returnSearchColumns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPreferences", propOrder = {
    "bodyFieldsOnly",
    "returnSearchColumns",
    "pageSize"
})
public class SearchPreferences {

    @XmlElement(defaultValue = "true")
    protected Boolean bodyFieldsOnly;
    @XmlElement(defaultValue = "true")
    protected Boolean returnSearchColumns;
    protected Integer pageSize;

    /**
     * ��ȡbodyFieldsOnly���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBodyFieldsOnly() {
        return bodyFieldsOnly;
    }

    /**
     * ����bodyFieldsOnly���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBodyFieldsOnly(Boolean value) {
        this.bodyFieldsOnly = value;
    }

    /**
     * ��ȡreturnSearchColumns���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSearchColumns() {
        return returnSearchColumns;
    }

    /**
     * ����returnSearchColumns���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSearchColumns(Boolean value) {
        this.returnSearchColumns = value;
    }

    /**
     * ��ȡpageSize���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * ����pageSize���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

}
