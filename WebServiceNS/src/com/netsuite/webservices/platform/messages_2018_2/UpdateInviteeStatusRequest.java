
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.UpdateInviteeStatusReference;


/**
 * <p>UpdateInviteeStatusRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UpdateInviteeStatusRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateInviteeStatusReference" type="{urn:core_2018_2.platform.webservices.netsuite.com}UpdateInviteeStatusReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInviteeStatusRequest", propOrder = {
    "updateInviteeStatusReference"
})
public class UpdateInviteeStatusRequest {

    @XmlElement(required = true)
    protected UpdateInviteeStatusReference updateInviteeStatusReference;

    /**
     * 获取updateInviteeStatusReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UpdateInviteeStatusReference }
     *     
     */
    public UpdateInviteeStatusReference getUpdateInviteeStatusReference() {
        return updateInviteeStatusReference;
    }

    /**
     * 设置updateInviteeStatusReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateInviteeStatusReference }
     *     
     */
    public void setUpdateInviteeStatusReference(UpdateInviteeStatusReference value) {
        this.updateInviteeStatusReference = value;
    }

}
