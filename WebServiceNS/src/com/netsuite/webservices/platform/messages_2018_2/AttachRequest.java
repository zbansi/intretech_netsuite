
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.AttachReference;


/**
 * <p>AttachRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AttachRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachReference" type="{urn:core_2018_2.platform.webservices.netsuite.com}AttachReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachRequest", propOrder = {
    "attachReference"
})
public class AttachRequest {

    @XmlElement(required = true)
    protected AttachReference attachReference;

    /**
     * 获取attachReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AttachReference }
     *     
     */
    public AttachReference getAttachReference() {
        return attachReference;
    }

    /**
     * 设置attachReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AttachReference }
     *     
     */
    public void setAttachReference(AttachReference value) {
        this.attachReference = value;
    }

}
