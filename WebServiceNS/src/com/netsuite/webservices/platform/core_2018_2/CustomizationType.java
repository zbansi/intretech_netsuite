
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.GetCustomizationType;


/**
 * <p>CustomizationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="getCustomizationType" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}GetCustomizationType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationType")
public class CustomizationType {

    @XmlAttribute(name = "getCustomizationType")
    protected GetCustomizationType getCustomizationType;

    /**
     * 获取getCustomizationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetCustomizationType }
     *     
     */
    public GetCustomizationType getGetCustomizationType() {
        return getCustomizationType;
    }

    /**
     * 设置getCustomizationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomizationType }
     *     
     */
    public void setGetCustomizationType(GetCustomizationType value) {
        this.getCustomizationType = value;
    }

}
