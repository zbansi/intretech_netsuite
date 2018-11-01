
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeletionReason complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DeletionReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deletionReasonCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef"/>
 *         &lt;element name="deletionReasonMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeletionReason", propOrder = {
    "deletionReasonCode",
    "deletionReasonMemo"
})
public class DeletionReason {

    @XmlElement(required = true)
    protected RecordRef deletionReasonCode;
    protected String deletionReasonMemo;

    /**
     * ��ȡdeletionReasonCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDeletionReasonCode() {
        return deletionReasonCode;
    }

    /**
     * ����deletionReasonCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDeletionReasonCode(RecordRef value) {
        this.deletionReasonCode = value;
    }

    /**
     * ��ȡdeletionReasonMemo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeletionReasonMemo() {
        return deletionReasonMemo;
    }

    /**
     * ����deletionReasonMemo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeletionReasonMemo(String value) {
        this.deletionReasonMemo = value;
    }

}
