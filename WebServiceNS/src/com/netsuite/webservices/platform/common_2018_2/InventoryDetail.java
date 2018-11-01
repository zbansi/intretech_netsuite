
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>InventoryDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InventoryDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="inventoryAssignmentList" type="{urn:common_2018_2.platform.webservices.netsuite.com}InventoryAssignmentList" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryDetail", propOrder = {
    "inventoryAssignmentList",
    "customForm"
})
public class InventoryDetail
    extends Record
{

    protected InventoryAssignmentList inventoryAssignmentList;
    protected RecordRef customForm;

    /**
     * 获取inventoryAssignmentList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryAssignmentList }
     *     
     */
    public InventoryAssignmentList getInventoryAssignmentList() {
        return inventoryAssignmentList;
    }

    /**
     * 设置inventoryAssignmentList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryAssignmentList }
     *     
     */
    public void setInventoryAssignmentList(InventoryAssignmentList value) {
        this.inventoryAssignmentList = value;
    }

    /**
     * 获取customForm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * 设置customForm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

}
