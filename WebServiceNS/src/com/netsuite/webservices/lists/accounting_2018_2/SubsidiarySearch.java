
package com.netsuite.webservices.lists.accounting_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.AccountSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.AddressSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SubsidiarySearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>SubsidiarySearch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SubsidiarySearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}SubsidiarySearchBasic" minOccurs="0"/>
 *         &lt;element name="addressJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AddressSearchBasic" minOccurs="0"/>
 *         &lt;element name="defaultAdvanceToApplyAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountSearchBasic" minOccurs="0"/>
 *         &lt;element name="returnAddressJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AddressSearchBasic" minOccurs="0"/>
 *         &lt;element name="shippingAddressJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AddressSearchBasic" minOccurs="0"/>
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
@XmlType(name = "SubsidiarySearch", propOrder = {
    "basic",
    "addressJoin",
    "defaultAdvanceToApplyAccountJoin",
    "returnAddressJoin",
    "shippingAddressJoin",
    "userJoin",
    "customSearchJoin"
})
public class SubsidiarySearch
    extends SearchRecord
{

    protected SubsidiarySearchBasic basic;
    protected AddressSearchBasic addressJoin;
    protected AccountSearchBasic defaultAdvanceToApplyAccountJoin;
    protected AddressSearchBasic returnAddressJoin;
    protected AddressSearchBasic shippingAddressJoin;
    protected EmployeeSearchBasic userJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public SubsidiarySearchBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public void setBasic(SubsidiarySearchBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡaddressJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchBasic }
     *     
     */
    public AddressSearchBasic getAddressJoin() {
        return addressJoin;
    }

    /**
     * ����addressJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchBasic }
     *     
     */
    public void setAddressJoin(AddressSearchBasic value) {
        this.addressJoin = value;
    }

    /**
     * ��ȡdefaultAdvanceToApplyAccountJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchBasic }
     *     
     */
    public AccountSearchBasic getDefaultAdvanceToApplyAccountJoin() {
        return defaultAdvanceToApplyAccountJoin;
    }

    /**
     * ����defaultAdvanceToApplyAccountJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchBasic }
     *     
     */
    public void setDefaultAdvanceToApplyAccountJoin(AccountSearchBasic value) {
        this.defaultAdvanceToApplyAccountJoin = value;
    }

    /**
     * ��ȡreturnAddressJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchBasic }
     *     
     */
    public AddressSearchBasic getReturnAddressJoin() {
        return returnAddressJoin;
    }

    /**
     * ����returnAddressJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchBasic }
     *     
     */
    public void setReturnAddressJoin(AddressSearchBasic value) {
        this.returnAddressJoin = value;
    }

    /**
     * ��ȡshippingAddressJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchBasic }
     *     
     */
    public AddressSearchBasic getShippingAddressJoin() {
        return shippingAddressJoin;
    }

    /**
     * ����shippingAddressJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchBasic }
     *     
     */
    public void setShippingAddressJoin(AddressSearchBasic value) {
        this.shippingAddressJoin = value;
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
