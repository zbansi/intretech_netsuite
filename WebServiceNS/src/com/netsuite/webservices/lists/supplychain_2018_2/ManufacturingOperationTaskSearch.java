
package com.netsuite.webservices.lists.supplychain_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ManufacturingOperationTaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>ManufacturingOperationTaskSearch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ManufacturingOperationTaskSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}ManufacturingOperationTaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="predecessorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ManufacturingOperationTaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="workOrderJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
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
@XmlType(name = "ManufacturingOperationTaskSearch", propOrder = {
    "basic",
    "predecessorJoin",
    "userJoin",
    "workOrderJoin",
    "customSearchJoin"
})
public class ManufacturingOperationTaskSearch
    extends SearchRecord
{

    protected ManufacturingOperationTaskSearchBasic basic;
    protected ManufacturingOperationTaskSearchBasic predecessorJoin;
    protected EmployeeSearchBasic userJoin;
    protected TransactionSearchBasic workOrderJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskSearchBasic }
     *     
     */
    public ManufacturingOperationTaskSearchBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskSearchBasic }
     *     
     */
    public void setBasic(ManufacturingOperationTaskSearchBasic value) {
        this.basic = value;
    }

    /**
     * 获取predecessorJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskSearchBasic }
     *     
     */
    public ManufacturingOperationTaskSearchBasic getPredecessorJoin() {
        return predecessorJoin;
    }

    /**
     * 设置predecessorJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskSearchBasic }
     *     
     */
    public void setPredecessorJoin(ManufacturingOperationTaskSearchBasic value) {
        this.predecessorJoin = value;
    }

    /**
     * 获取userJoin属性的值。
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
     * 设置userJoin属性的值。
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
     * 获取workOrderJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getWorkOrderJoin() {
        return workOrderJoin;
    }

    /**
     * 设置workOrderJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setWorkOrderJoin(TransactionSearchBasic value) {
        this.workOrderJoin = value;
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
