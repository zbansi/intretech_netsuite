
package com.netsuite.webservices.lists.supplychain_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.EntityGroupSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.LocationSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ManufacturingCostTemplateSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ManufacturingRoutingSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>ManufacturingRoutingSearchRow complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ManufacturingRoutingSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}ManufacturingRoutingSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="itemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="locationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="manufacturingCostTemplateJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ManufacturingCostTemplateSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="manufacturingWorkCenterJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EntityGroupSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="customSearchJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomSearchRowBasic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturingRoutingSearchRow", propOrder = {
    "basic",
    "itemJoin",
    "locationJoin",
    "manufacturingCostTemplateJoin",
    "manufacturingWorkCenterJoin",
    "userJoin",
    "customSearchJoin"
})
public class ManufacturingRoutingSearchRow
    extends SearchRow
{

    protected ManufacturingRoutingSearchRowBasic basic;
    protected ItemSearchRowBasic itemJoin;
    protected LocationSearchRowBasic locationJoin;
    protected ManufacturingCostTemplateSearchRowBasic manufacturingCostTemplateJoin;
    protected EntityGroupSearchRowBasic manufacturingWorkCenterJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingRoutingSearchRowBasic }
     *     
     */
    public ManufacturingRoutingSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingRoutingSearchRowBasic }
     *     
     */
    public void setBasic(ManufacturingRoutingSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡitemJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * ����itemJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setItemJoin(ItemSearchRowBasic value) {
        this.itemJoin = value;
    }

    /**
     * ��ȡlocationJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getLocationJoin() {
        return locationJoin;
    }

    /**
     * ����locationJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setLocationJoin(LocationSearchRowBasic value) {
        this.locationJoin = value;
    }

    /**
     * ��ȡmanufacturingCostTemplateJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingCostTemplateSearchRowBasic }
     *     
     */
    public ManufacturingCostTemplateSearchRowBasic getManufacturingCostTemplateJoin() {
        return manufacturingCostTemplateJoin;
    }

    /**
     * ����manufacturingCostTemplateJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingCostTemplateSearchRowBasic }
     *     
     */
    public void setManufacturingCostTemplateJoin(ManufacturingCostTemplateSearchRowBasic value) {
        this.manufacturingCostTemplateJoin = value;
    }

    /**
     * ��ȡmanufacturingWorkCenterJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EntityGroupSearchRowBasic }
     *     
     */
    public EntityGroupSearchRowBasic getManufacturingWorkCenterJoin() {
        return manufacturingWorkCenterJoin;
    }

    /**
     * ����manufacturingWorkCenterJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EntityGroupSearchRowBasic }
     *     
     */
    public void setManufacturingWorkCenterJoin(EntityGroupSearchRowBasic value) {
        this.manufacturingWorkCenterJoin = value;
    }

    /**
     * ��ȡuserJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * ����userJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSearchJoin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSearchJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSearchRowBasic }
     * 
     * 
     */
    public List<CustomSearchRowBasic> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchRowBasic>();
        }
        return this.customSearchJoin;
    }

}
