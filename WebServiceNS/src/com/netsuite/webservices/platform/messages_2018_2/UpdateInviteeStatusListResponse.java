
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UpdateInviteeStatusListResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UpdateInviteeStatusListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:messages_2018_2.platform.webservices.netsuite.com}writeResponseList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInviteeStatusListResponse", propOrder = {
    "writeResponseList"
})
public class UpdateInviteeStatusListResponse {

    @XmlElement(required = true)
    protected WriteResponseList writeResponseList;

    /**
     * ��ȡwriteResponseList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WriteResponseList }
     *     
     */
    public WriteResponseList getWriteResponseList() {
        return writeResponseList;
    }

    /**
     * ����writeResponseList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WriteResponseList }
     *     
     */
    public void setWriteResponseList(WriteResponseList value) {
        this.writeResponseList = value;
    }

}
