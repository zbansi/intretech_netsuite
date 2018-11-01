
package com.netsuite.webservices.lists.accounting_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.AddressSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.LocationSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>LocationSearchRow complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LocationSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="addressJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AddressSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="returnAddressJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AddressSearchRowBasic" minOccurs="0"/>
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
@XmlType(name = "LocationSearchRow", propOrder = {
    "basic",
    "addressJoin",
    "returnAddressJoin",
    "userJoin",
    "customSearchJoin"
})
public class LocationSearchRow
    extends SearchRow
{

    protected LocationSearchRowBasic basic;
    protected AddressSearchRowBasic addressJoin;
    protected AddressSearchRowBasic returnAddressJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setBasic(LocationSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * 获取addressJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchRowBasic }
     *     
     */
    public AddressSearchRowBasic getAddressJoin() {
        return addressJoin;
    }

    /**
     * 设置addressJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchRowBasic }
     *     
     */
    public void setAddressJoin(AddressSearchRowBasic value) {
        this.addressJoin = value;
    }

    /**
     * 获取returnAddressJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchRowBasic }
     *     
     */
    public AddressSearchRowBasic getReturnAddressJoin() {
        return returnAddressJoin;
    }

    /**
     * 设置returnAddressJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchRowBasic }
     *     
     */
    public void setReturnAddressJoin(AddressSearchRowBasic value) {
        this.returnAddressJoin = value;
    }

    /**
     * 获取userJoin属性的值。
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
     * 设置userJoin属性的值。
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
