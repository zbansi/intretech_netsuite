
package com.netsuite.webservices.lists.support_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.SolutionSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.SupportCaseSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TopicSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>SolutionSearchRow complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SolutionSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}SolutionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="caseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SupportCaseSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="relatedSolutionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SolutionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="topicJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TopicSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}NoteSearchRowBasic" minOccurs="0"/>
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
@XmlType(name = "SolutionSearchRow", propOrder = {
    "basic",
    "caseJoin",
    "relatedSolutionJoin",
    "topicJoin",
    "userJoin",
    "userNotesJoin",
    "customSearchJoin"
})
public class SolutionSearchRow
    extends SearchRow
{

    protected SolutionSearchRowBasic basic;
    protected SupportCaseSearchRowBasic caseJoin;
    protected SolutionSearchRowBasic relatedSolutionJoin;
    protected TopicSearchRowBasic topicJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SolutionSearchRowBasic }
     *     
     */
    public SolutionSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionSearchRowBasic }
     *     
     */
    public void setBasic(SolutionSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * 获取caseJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }

    /**
     * 设置caseJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public void setCaseJoin(SupportCaseSearchRowBasic value) {
        this.caseJoin = value;
    }

    /**
     * 获取relatedSolutionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SolutionSearchRowBasic }
     *     
     */
    public SolutionSearchRowBasic getRelatedSolutionJoin() {
        return relatedSolutionJoin;
    }

    /**
     * 设置relatedSolutionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionSearchRowBasic }
     *     
     */
    public void setRelatedSolutionJoin(SolutionSearchRowBasic value) {
        this.relatedSolutionJoin = value;
    }

    /**
     * 获取topicJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TopicSearchRowBasic }
     *     
     */
    public TopicSearchRowBasic getTopicJoin() {
        return topicJoin;
    }

    /**
     * 设置topicJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TopicSearchRowBasic }
     *     
     */
    public void setTopicJoin(TopicSearchRowBasic value) {
        this.topicJoin = value;
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
     * 获取userNotesJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * 设置userNotesJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchRowBasic value) {
        this.userNotesJoin = value;
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
