
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DetachBasicReference complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DetachBasicReference">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}DetachReference">
 *       &lt;sequence>
 *         &lt;element name="detachedRecord" type="{urn:core_2018_2.platform.webservices.netsuite.com}BaseRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetachBasicReference", propOrder = {
    "detachedRecord"
})
public class DetachBasicReference
    extends DetachReference
{

    @XmlElement(required = true)
    protected BaseRef detachedRecord;

    /**
     * 获取detachedRecord属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseRef }
     *     
     */
    public BaseRef getDetachedRecord() {
        return detachedRecord;
    }

    /**
     * 设置detachedRecord属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRef }
     *     
     */
    public void setDetachedRecord(BaseRef value) {
        this.detachedRecord = value;
    }

}
