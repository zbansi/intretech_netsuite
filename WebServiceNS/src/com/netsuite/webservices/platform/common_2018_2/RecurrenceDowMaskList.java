
package com.netsuite.webservices.platform.common_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.types.RecurrenceDow;


/**
 * <p>RecurrenceDowMaskList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RecurrenceDowMaskList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recurrenceDowMask" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}RecurrenceDow" maxOccurs="7"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrenceDowMaskList", propOrder = {
    "recurrenceDowMask"
})
public class RecurrenceDowMaskList {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<RecurrenceDow> recurrenceDowMask;

    /**
     * Gets the value of the recurrenceDowMask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurrenceDowMask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurrenceDowMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurrenceDow }
     * 
     * 
     */
    public List<RecurrenceDow> getRecurrenceDowMask() {
        if (recurrenceDowMask == null) {
            recurrenceDowMask = new ArrayList<RecurrenceDow>();
        }
        return this.recurrenceDowMask;
    }

}
