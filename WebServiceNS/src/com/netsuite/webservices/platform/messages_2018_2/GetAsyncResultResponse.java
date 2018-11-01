
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetAsyncResultResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取asyncResult属性的值。
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
     * 设置asyncResult属性的值。
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
