
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AddResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AddResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:messages_2018_2.platform.webservices.netsuite.com}writeResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddResponse", propOrder = {
    "writeResponse"
})
public class AddResponse {

    @XmlElement(required = true)
    protected WriteResponse writeResponse;

    /**
     * ��ȡwriteResponse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WriteResponse }
     *     
     */
    public WriteResponse getWriteResponse() {
        return writeResponse;
    }

    /**
     * ����writeResponse���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WriteResponse }
     *     
     */
    public void setWriteResponse(WriteResponse value) {
        this.writeResponse = value;
    }

}
