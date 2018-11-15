
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.GetDataCenterUrlsResult;


/**
 * <p>GetDataCenterUrlsResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetDataCenterUrlsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}getDataCenterUrlsResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDataCenterUrlsResponse", propOrder = {
    "getDataCenterUrlsResult"
})
public class GetDataCenterUrlsResponse {

    @XmlElement(namespace = "urn:core_2018_2.platform.webservices.netsuite.com", required = true)
    protected GetDataCenterUrlsResult getDataCenterUrlsResult;

    /**
     * ��ȡgetDataCenterUrlsResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetDataCenterUrlsResult }
     *     
     */
    public GetDataCenterUrlsResult getGetDataCenterUrlsResult() {
        return getDataCenterUrlsResult;
    }

    /**
     * ����getDataCenterUrlsResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetDataCenterUrlsResult }
     *     
     */
    public void setGetDataCenterUrlsResult(GetDataCenterUrlsResult value) {
        this.getDataCenterUrlsResult = value;
    }

}