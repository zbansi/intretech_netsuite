
package com.netsuite.webservices.lists.support_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.support_2018_2.types.IssueRelationship;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>IssueRelatedIssues complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IssueRelatedIssues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relationship" type="{urn:types.support_2018_2.lists.webservices.netsuite.com}IssueRelationship" minOccurs="0"/>
 *         &lt;element name="issueNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="relationshipComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueRelatedIssues", propOrder = {
    "relationship",
    "issueNumber",
    "relationshipComment"
})
public class IssueRelatedIssues {

    @XmlSchemaType(name = "string")
    protected IssueRelationship relationship;
    protected RecordRef issueNumber;
    protected String relationshipComment;

    /**
     * 获取relationship属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueRelationship }
     *     
     */
    public IssueRelationship getRelationship() {
        return relationship;
    }

    /**
     * 设置relationship属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueRelationship }
     *     
     */
    public void setRelationship(IssueRelationship value) {
        this.relationship = value;
    }

    /**
     * 获取issueNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIssueNumber() {
        return issueNumber;
    }

    /**
     * 设置issueNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIssueNumber(RecordRef value) {
        this.issueNumber = value;
    }

    /**
     * 获取relationshipComment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipComment() {
        return relationshipComment;
    }

    /**
     * 设置relationshipComment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipComment(String value) {
        this.relationshipComment = value;
    }

}
