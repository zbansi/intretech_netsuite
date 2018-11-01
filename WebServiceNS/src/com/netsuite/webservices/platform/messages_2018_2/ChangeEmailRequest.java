
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.ChangeEmail;


/**
 * <p>ChangeEmailRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ChangeEmailRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changeEmail" type="{urn:core_2018_2.platform.webservices.netsuite.com}ChangeEmail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeEmailRequest", propOrder = {
    "changeEmail"
})
public class ChangeEmailRequest {

    @XmlElement(required = true)
    protected ChangeEmail changeEmail;

    /**
     * 获取changeEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChangeEmail }
     *     
     */
    public ChangeEmail getChangeEmail() {
        return changeEmail;
    }

    /**
     * 设置changeEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeEmail }
     *     
     */
    public void setChangeEmail(ChangeEmail value) {
        this.changeEmail = value;
    }

}
