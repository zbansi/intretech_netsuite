
package com.netsuite.webservices.transactions.employees_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PaycheckSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PayrollItemSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>PaycheckSearch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaycheckSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}PaycheckSearchBasic" minOccurs="0"/>
 *         &lt;element name="employeeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="payrollItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PayrollItemSearchBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaycheckSearch", propOrder = {
    "basic",
    "employeeJoin",
    "payrollItemJoin"
})
public class PaycheckSearch
    extends SearchRecord
{

    protected PaycheckSearchBasic basic;
    protected EmployeeSearchBasic employeeJoin;
    protected PayrollItemSearchBasic payrollItemJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaycheckSearchBasic }
     *     
     */
    public PaycheckSearchBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckSearchBasic }
     *     
     */
    public void setBasic(PaycheckSearchBasic value) {
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
     * 获取payrollItemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemSearchBasic }
     *     
     */
    public PayrollItemSearchBasic getPayrollItemJoin() {
        return payrollItemJoin;
    }

    /**
     * 设置payrollItemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemSearchBasic }
     *     
     */
    public void setPayrollItemJoin(PayrollItemSearchBasic value) {
        this.payrollItemJoin = value;
    }

}
