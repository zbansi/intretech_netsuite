
package com.netsuite.webservices.transactions.demandplanning_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemSupplyPlanOrderList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemSupplyPlanOrderList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemSupplyPlanOrder" type="{urn:demandplanning_2018_2.transactions.webservices.netsuite.com}ItemSupplyPlanOrder" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ItemSupplyPlanOrderList", propOrder = {
    "itemSupplyPlanOrder"
})
public class ItemSupplyPlanOrderList {

    protected List<ItemSupplyPlanOrder> itemSupplyPlanOrder;
    @XmlAttribute(name = "replaceAll")
    protected Boolean replaceAll;

    /**
     * Gets the value of the itemSupplyPlanOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemSupplyPlanOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemSupplyPlanOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSupplyPlanOrder }
     * 
     * 
     */
    public List<ItemSupplyPlanOrder> getItemSupplyPlanOrder() {
        if (itemSupplyPlanOrder == null) {
            itemSupplyPlanOrder = new ArrayList<ItemSupplyPlanOrder>();
        }
        return this.itemSupplyPlanOrder;
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
