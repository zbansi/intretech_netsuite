
package com.netsuite.webservices.transactions.inventory_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.InventoryDetail;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>BinWorksheetItem complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BinWorksheetItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="itemOnHand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemUnitsLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inventoryDetail" type="{urn:common_2018_2.platform.webservices.netsuite.com}InventoryDetail" minOccurs="0"/>
 *         &lt;element name="itemBins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemBinNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemBinList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemPreferBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemBlank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinWorksheetItem", propOrder = {
    "item",
    "itemName",
    "description",
    "quantity",
    "itemOnHand",
    "itemUnitsLabel",
    "inventoryDetail",
    "itemBins",
    "itemBinNumbers",
    "itemBinList",
    "itemPreferBin",
    "itemBlank"
})
public class BinWorksheetItem {

    protected RecordRef item;
    protected String itemName;
    protected String description;
    protected Double quantity;
    protected String itemOnHand;
    protected String itemUnitsLabel;
    protected InventoryDetail inventoryDetail;
    protected String itemBins;
    protected String itemBinNumbers;
    protected String itemBinList;
    protected String itemPreferBin;
    protected String itemBlank;

    /**
     * ��ȡitem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItem() {
        return item;
    }

    /**
     * ����item���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItem(RecordRef value) {
        this.item = value;
    }

    /**
     * ��ȡitemName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * ����itemName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * ��ȡitemOnHand���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemOnHand() {
        return itemOnHand;
    }

    /**
     * ����itemOnHand���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemOnHand(String value) {
        this.itemOnHand = value;
    }

    /**
     * ��ȡitemUnitsLabel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemUnitsLabel() {
        return itemUnitsLabel;
    }

    /**
     * ����itemUnitsLabel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemUnitsLabel(String value) {
        this.itemUnitsLabel = value;
    }

    /**
     * ��ȡinventoryDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetail }
     *     
     */
    public InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }

    /**
     * ����inventoryDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetail }
     *     
     */
    public void setInventoryDetail(InventoryDetail value) {
        this.inventoryDetail = value;
    }

    /**
     * ��ȡitemBins���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemBins() {
        return itemBins;
    }

    /**
     * ����itemBins���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemBins(String value) {
        this.itemBins = value;
    }

    /**
     * ��ȡitemBinNumbers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemBinNumbers() {
        return itemBinNumbers;
    }

    /**
     * ����itemBinNumbers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemBinNumbers(String value) {
        this.itemBinNumbers = value;
    }

    /**
     * ��ȡitemBinList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemBinList() {
        return itemBinList;
    }

    /**
     * ����itemBinList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemBinList(String value) {
        this.itemBinList = value;
    }

    /**
     * ��ȡitemPreferBin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPreferBin() {
        return itemPreferBin;
    }

    /**
     * ����itemPreferBin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPreferBin(String value) {
        this.itemPreferBin = value;
    }

    /**
     * ��ȡitemBlank���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemBlank() {
        return itemBlank;
    }

    /**
     * ����itemBlank���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemBlank(String value) {
        this.itemBlank = value;
    }

}
