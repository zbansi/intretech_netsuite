
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SsoCredentials;


/**
 * <p>MapSsoRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MapSsoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssoCredentials" type="{urn:core_2018_2.platform.webservices.netsuite.com}SsoCredentials"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapSsoRequest", propOrder = {
    "ssoCredentials"
})
public class MapSsoRequest {

    @XmlElement(required = true)
    protected SsoCredentials ssoCredentials;

    /**
     * 获取ssoCredentials属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SsoCredentials }
     *     
     */
    public SsoCredentials getSsoCredentials() {
        return ssoCredentials;
    }

    /**
     * 设置ssoCredentials属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SsoCredentials }
     *     
     */
    public void setSsoCredentials(SsoCredentials value) {
        this.ssoCredentials = value;
    }

}
