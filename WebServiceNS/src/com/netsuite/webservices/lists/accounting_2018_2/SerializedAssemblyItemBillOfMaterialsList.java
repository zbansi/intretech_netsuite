
package com.netsuite.webservices.lists.accounting_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SerializedAssemblyItemBillOfMaterialsList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SerializedAssemblyItemBillOfMaterialsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serializedAssemblyItemBillOfMaterials" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}SerializedAssemblyItemBillOfMaterials" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SerializedAssemblyItemBillOfMaterialsList", propOrder = {
    "serializedAssemblyItemBillOfMaterials"
})
public class SerializedAssemblyItemBillOfMaterialsList {

    protected List<SerializedAssemblyItemBillOfMaterials> serializedAssemblyItemBillOfMaterials;
    @XmlAttribute(name = "replaceAll")
    protected Boolean replaceAll;

    /**
     * Gets the value of the serializedAssemblyItemBillOfMaterials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serializedAssemblyItemBillOfMaterials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerializedAssemblyItemBillOfMaterials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerializedAssemblyItemBillOfMaterials }
     * 
     * 
     */
    public List<SerializedAssemblyItemBillOfMaterials> getSerializedAssemblyItemBillOfMaterials() {
        if (serializedAssemblyItemBillOfMaterials == null) {
            serializedAssemblyItemBillOfMaterials = new ArrayList<SerializedAssemblyItemBillOfMaterials>();
        }
        return this.serializedAssemblyItemBillOfMaterials;
    }

    /**
     * ��ȡreplaceAll���Ե�ֵ��
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
     * ����replaceAll���Ե�ֵ��
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
