
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DetachReference complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdetachFrom���Ե�ֵ��
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
     * ����detachFrom���Ե�ֵ��
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
