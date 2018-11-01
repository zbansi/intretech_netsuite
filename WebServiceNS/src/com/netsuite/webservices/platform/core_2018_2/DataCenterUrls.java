
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DataCenterUrls complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DataCenterUrls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webservicesDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="systemDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataCenterUrls", propOrder = {
    "restDomain",
    "webservicesDomain",
    "systemDomain"
})
public class DataCenterUrls {

    @XmlElement(required = true)
    protected String restDomain;
    @XmlElement(required = true)
    protected String webservicesDomain;
    @XmlElement(required = true)
    protected String systemDomain;

    /**
     * 获取restDomain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestDomain() {
        return restDomain;
    }

    /**
     * 设置restDomain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestDomain(String value) {
        this.restDomain = value;
    }

    /**
     * 获取webservicesDomain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebservicesDomain() {
        return webservicesDomain;
    }

    /**
     * 设置webservicesDomain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebservicesDomain(String value) {
        this.webservicesDomain = value;
    }

    /**
     * 获取systemDomain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemDomain() {
        return systemDomain;
    }

    /**
     * 设置systemDomain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemDomain(String value) {
        this.systemDomain = value;
    }

}
