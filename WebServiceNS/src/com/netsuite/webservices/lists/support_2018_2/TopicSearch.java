
package com.netsuite.webservices.lists.support_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SolutionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TopicSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>TopicSearch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TopicSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}TopicSearchBasic" minOccurs="0"/>
 *         &lt;element name="solutionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SolutionSearchBasic" minOccurs="0"/>
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
@XmlType(name = "TopicSearch", propOrder = {
    "basic",
    "solutionJoin",
    "userJoin"
})
public class TopicSearch
    extends SearchRecord
{

    protected TopicSearchBasic basic;
    protected SolutionSearchBasic solutionJoin;
    protected EmployeeSearchBasic userJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TopicSearchBasic }
     *     
     */
    public TopicSearchBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TopicSearchBasic }
     *     
     */
    public void setBasic(TopicSearchBasic value) {
        this.basic = value;
    }

    /**
     * 获取solutionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SolutionSearchBasic }
     *     
     */
    public SolutionSearchBasic getSolutionJoin() {
        return solutionJoin;
    }

    /**
     * 设置solutionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionSearchBasic }
     *     
     */
    public void setSolutionJoin(SolutionSearchBasic value) {
        this.solutionJoin = value;
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

}
