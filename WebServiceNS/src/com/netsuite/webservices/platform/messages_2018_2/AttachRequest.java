
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.AttachReference;


/**
 * <p>AttachRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡattachReference���Ե�ֵ��
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
     * ����attachReference���Ե�ֵ��
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
