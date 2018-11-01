
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.CustomizationType;


/**
 * <p>GetCustomizationIdRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcustomizationType���Ե�ֵ��
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
     * ����customizationType���Ե�ֵ��
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
     * ��ȡincludeInactives���Ե�ֵ��
     * 
     */
    public boolean isIncludeInactives() {
        return includeInactives;
    }

    /**
     * ����includeInactives���Ե�ֵ��
     * 
     */
    public void setIncludeInactives(boolean value) {
        this.includeInactives = value;
    }

}
