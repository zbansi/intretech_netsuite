
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.BaseRef;


/**
 * <p>GetRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseRef" type="{urn:core_2018_2.platform.webservices.netsuite.com}BaseRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRequest", propOrder = {
    "baseRef"
})
public class GetRequest {

    @XmlElement(required = true)
    protected BaseRef baseRef;

    /**
     * ��ȡbaseRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseRef }
     *     
     */
    public BaseRef getBaseRef() {
        return baseRef;
    }

    /**
     * ����baseRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRef }
     *     
     */
    public void setBaseRef(BaseRef value) {
        this.baseRef = value;
    }

}
