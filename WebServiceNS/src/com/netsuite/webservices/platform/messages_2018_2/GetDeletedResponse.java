
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.GetDeletedResult;


/**
 * <p>GetDeletedResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetDeletedResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}getDeletedResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDeletedResponse", propOrder = {
    "getDeletedResult"
})
public class GetDeletedResponse {

    @XmlElement(namespace = "urn:core_2018_2.platform.webservices.netsuite.com", required = true)
    protected GetDeletedResult getDeletedResult;

    /**
     * ��ȡgetDeletedResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetDeletedResult }
     *     
     */
    public GetDeletedResult getGetDeletedResult() {
        return getDeletedResult;
    }

    /**
     * ����getDeletedResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetDeletedResult }
     *     
     */
    public void setGetDeletedResult(GetDeletedResult value) {
        this.getDeletedResult = value;
    }

}
