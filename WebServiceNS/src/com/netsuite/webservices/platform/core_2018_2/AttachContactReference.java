
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AttachContactReference complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AttachContactReference">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}AttachReference">
 *       &lt;sequence>
 *         &lt;element name="contact" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef"/>
 *         &lt;element name="contactRole" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachContactReference", propOrder = {
    "contact",
    "contactRole"
})
public class AttachContactReference
    extends AttachReference
{

    @XmlElement(required = true)
    protected RecordRef contact;
    protected RecordRef contactRole;

    /**
     * ��ȡcontact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getContact() {
        return contact;
    }

    /**
     * ����contact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setContact(RecordRef value) {
        this.contact = value;
    }

    /**
     * ��ȡcontactRole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getContactRole() {
        return contactRole;
    }

    /**
     * ����contactRole���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setContactRole(RecordRef value) {
        this.contactRole = value;
    }

}
