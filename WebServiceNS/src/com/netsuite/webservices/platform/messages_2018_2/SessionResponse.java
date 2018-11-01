
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.Status;
import com.netsuite.webservices.platform.core_2018_2.WsRoleList;


/**
 * <p>SessionResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取status属性的值。
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
     * 设置status属性的值。
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
     * 获取userId属性的值。
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
     * 设置userId属性的值。
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
     * 获取wsRoleList属性的值。
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
     * 设置wsRoleList属性的值。
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
