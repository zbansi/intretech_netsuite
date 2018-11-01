
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetAsyncResultResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetAsyncResultResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:messages_2018_2.platform.webservices.netsuite.com}asyncResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAsyncResultResponse", propOrder = {
    "asyncResult"
})
public class GetAsyncResultResponse {

    @XmlElement(required = true)
    protected AsyncResult asyncResult;

    /**
     * ��ȡasyncResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AsyncResult }
     *     
     */
    public AsyncResult getAsyncResult() {
        return asyncResult;
    }

    /**
     * ����asyncResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncResult }
     *     
     */
    public void setAsyncResult(AsyncResult value) {
        this.asyncResult = value;
    }

}
