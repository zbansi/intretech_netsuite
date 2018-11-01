
package com.netsuite.webservices.transactions.employees_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeBillSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeEntrySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeSheetSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>TimeSheetSearch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TimeSheetSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}TimeSheetSearchBasic" minOccurs="0"/>
 *         &lt;element name="employeeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="timeBillJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TimeBillSearchBasic" minOccurs="0"/>
 *         &lt;element name="timeEntryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TimeEntrySearchBasic" minOccurs="0"/>
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
@XmlType(name = "TimeSheetSearch", propOrder = {
    "basic",
    "employeeJoin",
    "timeBillJoin",
    "timeEntryJoin",
    "customSearchJoin"
})
public class TimeSheetSearch
    extends SearchRecord
{

    protected TimeSheetSearchBasic basic;
    protected EmployeeSearchBasic employeeJoin;
    protected TimeBillSearchBasic timeBillJoin;
    protected TimeEntrySearchBasic timeEntryJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeSheetSearchBasic }
     *     
     */
    public TimeSheetSearchBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSheetSearchBasic }
     *     
     */
    public void setBasic(TimeSheetSearchBasic value) {
        this.basic = value;
    }

    /**
     * 获取employeeJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * 设置employeeJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchBasic value) {
        this.employeeJoin = value;
    }

    /**
     * 获取timeBillJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public TimeBillSearchBasic getTimeBillJoin() {
        return timeBillJoin;
    }

    /**
     * 设置timeBillJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public void setTimeBillJoin(TimeBillSearchBasic value) {
        this.timeBillJoin = value;
    }

    /**
     * 获取timeEntryJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeEntrySearchBasic }
     *     
     */
    public TimeEntrySearchBasic getTimeEntryJoin() {
        return timeEntryJoin;
    }

    /**
     * 设置timeEntryJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntrySearchBasic }
     *     
     */
    public void setTimeEntryJoin(TimeEntrySearchBasic value) {
        this.timeEntryJoin = value;
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
