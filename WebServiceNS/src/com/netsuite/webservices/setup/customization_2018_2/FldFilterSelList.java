
package com.netsuite.webservices.setup.customization_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>FldFilterSelList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FldFilterSelList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fldFilterSel" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FldFilterSelList", propOrder = {
    "fldFilterSel"
})
public class FldFilterSelList {

    @XmlElement(required = true)
    protected List<RecordRef> fldFilterSel;

    /**
     * Gets the value of the fldFilterSel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fldFilterSel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFldFilterSel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordRef }
     * 
     * 
     */
    public List<RecordRef> getFldFilterSel() {
        if (fldFilterSel == null) {
            fldFilterSel = new ArrayList<RecordRef>();
        }
        return this.fldFilterSel;
    }

}
