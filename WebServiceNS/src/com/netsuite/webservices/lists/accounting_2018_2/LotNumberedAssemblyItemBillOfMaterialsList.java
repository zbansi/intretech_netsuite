
package com.netsuite.webservices.lists.accounting_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LotNumberedAssemblyItemBillOfMaterialsList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LotNumberedAssemblyItemBillOfMaterialsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lotNumberedAssemblyItemBillOfMaterials" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}LotNumberedAssemblyItemBillOfMaterials" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LotNumberedAssemblyItemBillOfMaterialsList", propOrder = {
    "lotNumberedAssemblyItemBillOfMaterials"
})
public class LotNumberedAssemblyItemBillOfMaterialsList {

    protected List<LotNumberedAssemblyItemBillOfMaterials> lotNumberedAssemblyItemBillOfMaterials;
    @XmlAttribute(name = "replaceAll")
    protected Boolean replaceAll;

    /**
     * Gets the value of the lotNumberedAssemblyItemBillOfMaterials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotNumberedAssemblyItemBillOfMaterials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotNumberedAssemblyItemBillOfMaterials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotNumberedAssemblyItemBillOfMaterials }
     * 
     * 
     */
    public List<LotNumberedAssemblyItemBillOfMaterials> getLotNumberedAssemblyItemBillOfMaterials() {
        if (lotNumberedAssemblyItemBillOfMaterials == null) {
            lotNumberedAssemblyItemBillOfMaterials = new ArrayList<LotNumberedAssemblyItemBillOfMaterials>();
        }
        return this.lotNumberedAssemblyItemBillOfMaterials;
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
