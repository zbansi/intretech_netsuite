
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SearchMoreWithIdRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SearchMoreWithIdRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchMoreWithIdRequest", propOrder = {
    "searchId",
    "pageIndex"
})
public class SearchMoreWithIdRequest {

    @XmlElement(required = true)
    protected String searchId;
    protected int pageIndex;

    /**
     * ��ȡsearchId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * ����searchId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchId(String value) {
        this.searchId = value;
    }

    /**
     * ��ȡpageIndex���Ե�ֵ��
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * ����pageIndex���Ե�ֵ��
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

}
