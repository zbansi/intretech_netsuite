
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>InventoryDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡinventoryAssignmentList���Ե�ֵ��
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
     * ����inventoryAssignmentList���Ե�ֵ��
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
     * ��ȡcustomForm���Ե�ֵ��
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
     * ����customForm���Ե�ֵ��
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
