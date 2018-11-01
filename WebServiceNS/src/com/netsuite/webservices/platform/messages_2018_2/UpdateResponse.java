
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UpdateResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UpdateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:messages_2018_2.platform.webservices.netsuite.com}writeResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateResponse", propOrder = {
    "writeResponse"
})
public class UpdateResponse {

    @XmlElement(required = true)
    protected WriteResponse writeResponse;

    /**
     * 获取writeResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WriteResponse }
     *     
     */
    public WriteResponse getWriteResponse() {
        return writeResponse;
    }

    /**
     * 设置writeResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WriteResponse }
     *     
     */
    public void setWriteResponse(WriteResponse value) {
        this.writeResponse = value;
    }

}
