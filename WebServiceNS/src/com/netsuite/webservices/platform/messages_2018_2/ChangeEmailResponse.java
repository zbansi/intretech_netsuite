
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ChangeEmailResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ChangeEmailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:messages_2018_2.platform.webservices.netsuite.com}sessionResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeEmailResponse", propOrder = {
    "sessionResponse"
})
public class ChangeEmailResponse {

    @XmlElement(required = true)
    protected SessionResponse sessionResponse;

    /**
     * 获取sessionResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SessionResponse }
     *     
     */
    public SessionResponse getSessionResponse() {
        return sessionResponse;
    }

    /**
     * 设置sessionResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SessionResponse }
     *     
     */
    public void setSessionResponse(SessionResponse value) {
        this.sessionResponse = value;
    }

}
