
package com.netsuite.webservices.platform.core_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomizationRefList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomizationRefList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customizationRef" type="{urn:core_2018_2.platform.webservices.netsuite.com}CustomizationRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationRefList", propOrder = {
    "customizationRef"
})
public class CustomizationRefList {

    protected List<CustomizationRef> customizationRef;

    /**
     * Gets the value of the customizationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customizationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomizationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomizationRef }
     * 
     * 
     */
    public List<CustomizationRef> getCustomizationRef() {
        if (customizationRef == null) {
            customizationRef = new ArrayList<CustomizationRef>();
        }
        return this.customizationRef;
    }

}
