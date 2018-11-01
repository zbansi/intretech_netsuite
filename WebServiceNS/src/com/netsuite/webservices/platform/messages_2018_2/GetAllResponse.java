
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.GetAllResult;


/**
 * <p>GetAllResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetAllResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}getAllResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllResponse", propOrder = {
    "getAllResult"
})
public class GetAllResponse {

    @XmlElement(namespace = "urn:core_2018_2.platform.webservices.netsuite.com", required = true)
    protected GetAllResult getAllResult;

    /**
     * ��ȡgetAllResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetAllResult }
     *     
     */
    public GetAllResult getGetAllResult() {
        return getAllResult;
    }

    /**
     * ����getAllResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllResult }
     *     
     */
    public void setGetAllResult(GetAllResult value) {
        this.getAllResult = value;
    }

}
