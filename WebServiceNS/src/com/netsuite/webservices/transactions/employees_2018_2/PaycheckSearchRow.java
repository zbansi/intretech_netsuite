
package com.netsuite.webservices.transactions.employees_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.PaycheckSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.PayrollItemSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>PaycheckSearchRow complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PaycheckSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}PaycheckSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="employeeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="payrollItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PayrollItemSearchRowBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaycheckSearchRow", propOrder = {
    "basic",
    "employeeJoin",
    "payrollItemJoin"
})
public class PaycheckSearchRow
    extends SearchRow
{

    protected PaycheckSearchRowBasic basic;
    protected EmployeeSearchRowBasic employeeJoin;
    protected PayrollItemSearchRowBasic payrollItemJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PaycheckSearchRowBasic }
     *     
     */
    public PaycheckSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckSearchRowBasic }
     *     
     */
    public void setBasic(PaycheckSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡemployeeJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * ����employeeJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchRowBasic value) {
        this.employeeJoin = value;
    }

    /**
     * ��ȡpayrollItemJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemSearchRowBasic }
     *     
     */
    public PayrollItemSearchRowBasic getPayrollItemJoin() {
        return payrollItemJoin;
    }

    /**
     * ����payrollItemJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemSearchRowBasic }
     *     
     */
    public void setPayrollItemJoin(PayrollItemSearchRowBasic value) {
        this.payrollItemJoin = value;
    }

}
