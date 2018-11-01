
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ChangeEmail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ChangeEmail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newEmail2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="justThisAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeEmail", propOrder = {
    "currentPassword",
    "newEmail",
    "newEmail2",
    "justThisAccount"
})
public class ChangeEmail {

    @XmlElement(required = true)
    protected String currentPassword;
    @XmlElement(required = true)
    protected String newEmail;
    @XmlElement(required = true)
    protected String newEmail2;
    protected Boolean justThisAccount;

    /**
     * ��ȡcurrentPassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * ����currentPassword���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPassword(String value) {
        this.currentPassword = value;
    }

    /**
     * ��ȡnewEmail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEmail() {
        return newEmail;
    }

    /**
     * ����newEmail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEmail(String value) {
        this.newEmail = value;
    }

    /**
     * ��ȡnewEmail2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEmail2() {
        return newEmail2;
    }

    /**
     * ����newEmail2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEmail2(String value) {
        this.newEmail2 = value;
    }

    /**
     * ��ȡjustThisAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJustThisAccount() {
        return justThisAccount;
    }

    /**
     * ����justThisAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJustThisAccount(Boolean value) {
        this.justThisAccount = value;
    }

}
