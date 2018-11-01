
package com.netsuite.webservices.setup.customization_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.types.Language;


/**
 * <p>CustomListTranslations complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CustomListTranslations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locale" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}Language" minOccurs="0"/>
 *         &lt;element name="localeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomListTranslations", propOrder = {
    "locale",
    "localeDescription",
    "name"
})
public class CustomListTranslations {

    @XmlSchemaType(name = "string")
    protected Language locale;
    protected String localeDescription;
    protected String name;

    /**
     * ��ȡlocale���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLocale() {
        return locale;
    }

    /**
     * ����locale���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLocale(Language value) {
        this.locale = value;
    }

    /**
     * ��ȡlocaleDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleDescription() {
        return localeDescription;
    }

    /**
     * ����localeDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleDescription(String value) {
        this.localeDescription = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
