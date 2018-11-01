
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DataCenterUrls complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrestDomain���Ե�ֵ��
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
     * ����restDomain���Ե�ֵ��
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
     * ��ȡwebservicesDomain���Ե�ֵ��
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
     * ����webservicesDomain���Ե�ֵ��
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
     * ��ȡsystemDomain���Ե�ֵ��
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
     * ����systemDomain���Ե�ֵ��
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
