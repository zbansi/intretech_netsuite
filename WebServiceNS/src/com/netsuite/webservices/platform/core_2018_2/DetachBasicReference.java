
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DetachBasicReference complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdetachedRecord���Ե�ֵ��
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
     * ����detachedRecord���Ե�ֵ��
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
