
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DetachReference complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DetachReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detachFrom" type="{urn:core_2018_2.platform.webservices.netsuite.com}BaseRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetachReference", propOrder = {
    "detachFrom"
})
@XmlSeeAlso({
    DetachBasicReference.class
})
public abstract class DetachReference {

    @XmlElement(required = true)
    protected BaseRef detachFrom;

    /**
     * 获取detachFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseRef }
     *     
     */
    public BaseRef getDetachFrom() {
        return detachFrom;
    }

    /**
     * 设置detachFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRef }
     *     
     */
    public void setDetachFrom(BaseRef value) {
        this.detachFrom = value;
    }

}
