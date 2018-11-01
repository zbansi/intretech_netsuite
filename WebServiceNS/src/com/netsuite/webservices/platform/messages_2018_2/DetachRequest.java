
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.DetachReference;


/**
 * <p>DetachRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DetachRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detachReference" type="{urn:core_2018_2.platform.webservices.netsuite.com}DetachReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetachRequest", propOrder = {
    "detachReference"
})
public class DetachRequest {

    @XmlElement(required = true)
    protected DetachReference detachReference;

    /**
     * 获取detachReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DetachReference }
     *     
     */
    public DetachReference getDetachReference() {
        return detachReference;
    }

    /**
     * 设置detachReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DetachReference }
     *     
     */
    public void setDetachReference(DetachReference value) {
        this.detachReference = value;
    }

}
