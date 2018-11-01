
package com.netsuite.webservices.lists.supplychain_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EntityGroupSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.LocationSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ManufacturingCostTemplateSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ManufacturingRoutingSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>ManufacturingRoutingSearch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ManufacturingRoutingSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}ManufacturingRoutingSearchBasic" minOccurs="0"/>
 *         &lt;element name="itemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="locationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/>
 *         &lt;element name="manufacturingCostTemplateJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ManufacturingCostTemplateSearchBasic" minOccurs="0"/>
 *         &lt;element name="manufacturingWorkCenterJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EntityGroupSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="customSearchJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomSearchJoin" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturingRoutingSearch", propOrder = {
    "basic",
    "itemJoin",
    "locationJoin",
    "manufacturingCostTemplateJoin",
    "manufacturingWorkCenterJoin",
    "userJoin",
    "customSearchJoin"
})
public class ManufacturingRoutingSearch
    extends SearchRecord
{

    protected ManufacturingRoutingSearchBasic basic;
    protected ItemSearchBasic itemJoin;
    protected LocationSearchBasic locationJoin;
    protected ManufacturingCostTemplateSearchBasic manufacturingCostTemplateJoin;
    protected EntityGroupSearchBasic manufacturingWorkCenterJoin;
    protected EmployeeSearchBasic userJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingRoutingSearchBasic }
     *     
     */
    public ManufacturingRoutingSearchBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingRoutingSearchBasic }
     *     
     */
    public void setBasic(ManufacturingRoutingSearchBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡitemJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * ����itemJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setItemJoin(ItemSearchBasic value) {
        this.itemJoin = value;
    }

    /**
     * ��ȡlocationJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getLocationJoin() {
        return locationJoin;
    }

    /**
     * ����locationJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setLocationJoin(LocationSearchBasic value) {
        this.locationJoin = value;
    }

    /**
     * ��ȡmanufacturingCostTemplateJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingCostTemplateSearchBasic }
     *     
     */
    public ManufacturingCostTemplateSearchBasic getManufacturingCostTemplateJoin() {
        return manufacturingCostTemplateJoin;
    }

    /**
     * ����manufacturingCostTemplateJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingCostTemplateSearchBasic }
     *     
     */
    public void setManufacturingCostTemplateJoin(ManufacturingCostTemplateSearchBasic value) {
        this.manufacturingCostTemplateJoin = value;
    }

    /**
     * ��ȡmanufacturingWorkCenterJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EntityGroupSearchBasic }
     *     
     */
    public EntityGroupSearchBasic getManufacturingWorkCenterJoin() {
        return manufacturingWorkCenterJoin;
    }

    /**
     * ����manufacturingWorkCenterJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EntityGroupSearchBasic }
     *     
     */
    public void setManufacturingWorkCenterJoin(EntityGroupSearchBasic value) {
        this.manufacturingWorkCenterJoin = value;
    }

    /**
     * ��ȡuserJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * ����userJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
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
     * {@link CustomSearchJoin }
     * 
     * 
     */
    public List<CustomSearchJoin> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchJoin>();
        }
        return this.customSearchJoin;
    }

}
