
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.GetSelectValueResult;


/**
 * <p>getSelectValueResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getSelectValueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}getSelectValueResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelectValueResponse", propOrder = {
    "getSelectValueResult"
})
public class GetSelectValueResponse {

    @XmlElement(namespace = "urn:core_2018_2.platform.webservices.netsuite.com", required = true)
    protected GetSelectValueResult getSelectValueResult;

    /**
     * ��ȡgetSelectValueResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetSelectValueResult }
     *     
     */
    public GetSelectValueResult getGetSelectValueResult() {
        return getSelectValueResult;
    }

    /**
     * ����getSelectValueResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetSelectValueResult }
     *     
     */
    public void setGetSelectValueResult(GetSelectValueResult value) {
        this.getSelectValueResult = value;
    }

}
