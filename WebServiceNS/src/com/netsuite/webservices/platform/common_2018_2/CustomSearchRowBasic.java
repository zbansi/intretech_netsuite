
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.CustomizationRef;
import com.netsuite.webservices.platform.core_2018_2.SearchRowBasic;


/**
 * <p>CustomSearchRowBasic complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomSearchRowBasic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customizationRef" type="{urn:core_2018_2.platform.webservices.netsuite.com}CustomizationRef"/>
 *         &lt;element name="searchRowBasic" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRowBasic"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSearchRowBasic", propOrder = {
    "customizationRef",
    "searchRowBasic"
})
public class CustomSearchRowBasic {

    @XmlElement(required = true)
    protected CustomizationRef customizationRef;
    @XmlElement(required = true)
    protected SearchRowBasic searchRowBasic;

    /**
     * 获取customizationRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomizationRef }
     *     
     */
    public CustomizationRef getCustomizationRef() {
        return customizationRef;
    }

    /**
     * 设置customizationRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationRef }
     *     
     */
    public void setCustomizationRef(CustomizationRef value) {
        this.customizationRef = value;
    }

    /**
     * 获取searchRowBasic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchRowBasic }
     *     
     */
    public SearchRowBasic getSearchRowBasic() {
        return searchRowBasic;
    }

    /**
     * 设置searchRowBasic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRowBasic }
     *     
     */
    public void setSearchRowBasic(SearchRowBasic value) {
        this.searchRowBasic = value;
    }

}
