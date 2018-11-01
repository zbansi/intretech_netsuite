
package com.netsuite.webservices.lists.accounting_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RevRecTemplateRecurrenceList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RevRecTemplateRecurrenceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="revRecTemplateRecurrence" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}RevRecTemplateRecurrence" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="replaceAll" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevRecTemplateRecurrenceList", propOrder = {
    "revRecTemplateRecurrence"
})
public class RevRecTemplateRecurrenceList {

    protected List<RevRecTemplateRecurrence> revRecTemplateRecurrence;
    @XmlAttribute(name = "replaceAll")
    protected Boolean replaceAll;

    /**
     * Gets the value of the revRecTemplateRecurrence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revRecTemplateRecurrence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevRecTemplateRecurrence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevRecTemplateRecurrence }
     * 
     * 
     */
    public List<RevRecTemplateRecurrence> getRevRecTemplateRecurrence() {
        if (revRecTemplateRecurrence == null) {
            revRecTemplateRecurrence = new ArrayList<RevRecTemplateRecurrence>();
        }
        return this.revRecTemplateRecurrence;
    }

    /**
     * 获取replaceAll属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReplaceAll() {
        if (replaceAll == null) {
            return true;
        } else {
            return replaceAll;
        }
    }

    /**
     * 设置replaceAll属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
    }

}
