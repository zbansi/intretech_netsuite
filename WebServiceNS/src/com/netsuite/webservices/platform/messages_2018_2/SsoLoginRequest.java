
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SsoPassport;


/**
 * <p>SsoLoginRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SsoLoginRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssoPassport" type="{urn:core_2018_2.platform.webservices.netsuite.com}SsoPassport"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsoLoginRequest", propOrder = {
    "ssoPassport"
})
public class SsoLoginRequest {

    @XmlElement(required = true)
    protected SsoPassport ssoPassport;

    /**
     * 获取ssoPassport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SsoPassport }
     *     
     */
    public SsoPassport getSsoPassport() {
        return ssoPassport;
    }

    /**
     * 设置ssoPassport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SsoPassport }
     *     
     */
    public void setSsoPassport(SsoPassport value) {
        this.ssoPassport = value;
    }

}
