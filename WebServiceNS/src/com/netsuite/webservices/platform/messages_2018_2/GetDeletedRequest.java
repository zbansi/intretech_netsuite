
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.GetDeletedFilter;


/**
 * <p>GetDeletedRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetDeletedRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getDeletedFilter" type="{urn:core_2018_2.platform.webservices.netsuite.com}GetDeletedFilter"/>
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
@XmlType(name = "GetDeletedRequest", propOrder = {
    "getDeletedFilter",
    "pageIndex"
})
public class GetDeletedRequest {

    @XmlElement(required = true)
    protected GetDeletedFilter getDeletedFilter;
    protected int pageIndex;

    /**
     * ��ȡgetDeletedFilter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetDeletedFilter }
     *     
     */
    public GetDeletedFilter getGetDeletedFilter() {
        return getDeletedFilter;
    }

    /**
     * ����getDeletedFilter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetDeletedFilter }
     *     
     */
    public void setGetDeletedFilter(GetDeletedFilter value) {
        this.getDeletedFilter = value;
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
