
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.Status;
import com.netsuite.webservices.platform.core_2018_2.WsRoleList;


/**
 * <p>SessionResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SessionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}status"/>
 *         &lt;element name="userId" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}wsRoleList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionResponse", propOrder = {
    "status",
    "userId",
    "wsRoleList"
})
public class SessionResponse {

    @XmlElement(namespace = "urn:core_2018_2.platform.webservices.netsuite.com", required = true)
    protected Status status;
    protected RecordRef userId;
    @XmlElement(namespace = "urn:core_2018_2.platform.webservices.netsuite.com")
    protected WsRoleList wsRoleList;

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * ��ȡuserId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getUserId() {
        return userId;
    }

    /**
     * ����userId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setUserId(RecordRef value) {
        this.userId = value;
    }

    /**
     * ��ȡwsRoleList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WsRoleList }
     *     
     */
    public WsRoleList getWsRoleList() {
        return wsRoleList;
    }

    /**
     * ����wsRoleList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WsRoleList }
     *     
     */
    public void setWsRoleList(WsRoleList value) {
        this.wsRoleList = value;
    }

}
