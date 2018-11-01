
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.CustomizationType;


/**
 * <p>GetCustomizationIdRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetCustomizationIdRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customizationType" type="{urn:core_2018_2.platform.webservices.netsuite.com}CustomizationType"/>
 *         &lt;element name="includeInactives" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomizationIdRequest", propOrder = {
    "customizationType",
    "includeInactives"
})
public class GetCustomizationIdRequest {

    @XmlElement(required = true)
    protected CustomizationType customizationType;
    protected boolean includeInactives;

    /**
     * 获取customizationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomizationType }
     *     
     */
    public CustomizationType getCustomizationType() {
        return customizationType;
    }

    /**
     * 设置customizationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationType }
     *     
     */
    public void setCustomizationType(CustomizationType value) {
        this.customizationType = value;
    }

    /**
     * 获取includeInactives属性的值。
     * 
     */
    public boolean isIncludeInactives() {
        return includeInactives;
    }

    /**
     * 设置includeInactives属性的值。
     * 
     */
    public void setIncludeInactives(boolean value) {
        this.includeInactives = value;
    }

}
