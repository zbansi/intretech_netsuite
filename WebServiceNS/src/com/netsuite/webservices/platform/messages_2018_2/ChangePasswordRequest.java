
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.ChangePassword;


/**
 * <p>ChangePasswordRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ChangePasswordRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changePassword" type="{urn:core_2018_2.platform.webservices.netsuite.com}ChangePassword"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePasswordRequest", propOrder = {
    "changePassword"
})
public class ChangePasswordRequest {

    @XmlElement(required = true)
    protected ChangePassword changePassword;

    /**
     * ��ȡchangePassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ChangePassword }
     *     
     */
    public ChangePassword getChangePassword() {
        return changePassword;
    }

    /**
     * ����changePassword���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePassword }
     *     
     */
    public void setChangePassword(ChangePassword value) {
        this.changePassword = value;
    }

}
