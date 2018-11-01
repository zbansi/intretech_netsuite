
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AttachBasicReference complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AttachBasicReference">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}AttachReference">
 *       &lt;sequence>
 *         &lt;element name="attachedRecord" type="{urn:core_2018_2.platform.webservices.netsuite.com}BaseRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachBasicReference", propOrder = {
    "attachedRecord"
})
public class AttachBasicReference
    extends AttachReference
{

    @XmlElement(required = true)
    protected BaseRef attachedRecord;

    /**
     * ��ȡattachedRecord���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BaseRef }
     *     
     */
    public BaseRef getAttachedRecord() {
        return attachedRecord;
    }

    /**
     * ����attachedRecord���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRef }
     *     
     */
    public void setAttachedRecord(BaseRef value) {
        this.attachedRecord = value;
    }

}
