
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.WinLossReasonSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>WinLossReasonSearch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WinLossReasonSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}WinLossReasonSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WinLossReasonSearch", propOrder = {
    "basic",
    "userJoin"
})
public class WinLossReasonSearch
    extends SearchRecord
{

    protected WinLossReasonSearchBasic basic;
    protected EmployeeSearchBasic userJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WinLossReasonSearchBasic }
     *     
     */
    public WinLossReasonSearchBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WinLossReasonSearchBasic }
     *     
     */
    public void setBasic(WinLossReasonSearchBasic value) {
        this.basic = value;
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

}
