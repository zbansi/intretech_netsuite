
package com.netsuite.webservices.lists.accounting_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.AccountSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ClassificationSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.DepartmentSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemAccountMappingSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.LocationSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.SubsidiarySearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>ItemAccountMappingSearchRow complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemAccountMappingSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemAccountMappingSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="classJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ClassificationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="departmentJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}DepartmentSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="destinationAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="locationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="sourceAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="subsidiaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SubsidiarySearchRowBasic" minOccurs="0"/>
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
@XmlType(name = "ItemAccountMappingSearchRow", propOrder = {
    "basic",
    "classJoin",
    "departmentJoin",
    "destinationAccountJoin",
    "locationJoin",
    "sourceAccountJoin",
    "subsidiaryJoin",
    "customSearchJoin"
})
public class ItemAccountMappingSearchRow
    extends SearchRow
{

    protected ItemAccountMappingSearchRowBasic basic;
    protected ClassificationSearchRowBasic classJoin;
    protected DepartmentSearchRowBasic departmentJoin;
    protected AccountSearchRowBasic destinationAccountJoin;
    protected LocationSearchRowBasic locationJoin;
    protected AccountSearchRowBasic sourceAccountJoin;
    protected SubsidiarySearchRowBasic subsidiaryJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemAccountMappingSearchRowBasic }
     *     
     */
    public ItemAccountMappingSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAccountMappingSearchRowBasic }
     *     
     */
    public void setBasic(ItemAccountMappingSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * 获取classJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSearchRowBasic }
     *     
     */
    public ClassificationSearchRowBasic getClassJoin() {
        return classJoin;
    }

    /**
     * 设置classJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSearchRowBasic }
     *     
     */
    public void setClassJoin(ClassificationSearchRowBasic value) {
        this.classJoin = value;
    }

    /**
     * 获取departmentJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DepartmentSearchRowBasic }
     *     
     */
    public DepartmentSearchRowBasic getDepartmentJoin() {
        return departmentJoin;
    }

    /**
     * 设置departmentJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentSearchRowBasic }
     *     
     */
    public void setDepartmentJoin(DepartmentSearchRowBasic value) {
        this.departmentJoin = value;
    }

    /**
     * 获取destinationAccountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getDestinationAccountJoin() {
        return destinationAccountJoin;
    }

    /**
     * 设置destinationAccountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setDestinationAccountJoin(AccountSearchRowBasic value) {
        this.destinationAccountJoin = value;
    }

    /**
     * 获取locationJoin属性的值。
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
     * 设置locationJoin属性的值。
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
     * 获取sourceAccountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getSourceAccountJoin() {
        return sourceAccountJoin;
    }

    /**
     * 设置sourceAccountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setSourceAccountJoin(AccountSearchRowBasic value) {
        this.sourceAccountJoin = value;
    }

    /**
     * 获取subsidiaryJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public SubsidiarySearchRowBasic getSubsidiaryJoin() {
        return subsidiaryJoin;
    }

    /**
     * 设置subsidiaryJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public void setSubsidiaryJoin(SubsidiarySearchRowBasic value) {
        this.subsidiaryJoin = value;
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
