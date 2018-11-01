
package com.netsuite.webservices.lists.support_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.SolutionSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TopicSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>TopicSearchRow complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TopicSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}TopicSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="solutionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SolutionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopicSearchRow", propOrder = {
    "basic",
    "solutionJoin",
    "userJoin"
})
public class TopicSearchRow
    extends SearchRow
{

    protected TopicSearchRowBasic basic;
    protected SolutionSearchRowBasic solutionJoin;
    protected EmployeeSearchRowBasic userJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TopicSearchRowBasic }
     *     
     */
    public TopicSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TopicSearchRowBasic }
     *     
     */
    public void setBasic(TopicSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡsolutionJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SolutionSearchRowBasic }
     *     
     */
    public SolutionSearchRowBasic getSolutionJoin() {
        return solutionJoin;
    }

    /**
     * ����solutionJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionSearchRowBasic }
     *     
     */
    public void setSolutionJoin(SolutionSearchRowBasic value) {
        this.solutionJoin = value;
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

}
