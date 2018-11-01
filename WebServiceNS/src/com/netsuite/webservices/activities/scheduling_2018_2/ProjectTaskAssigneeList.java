
package com.netsuite.webservices.activities.scheduling_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProjectTaskAssigneeList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProjectTaskAssigneeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projectTaskAssignee" type="{urn:scheduling_2018_2.activities.webservices.netsuite.com}ProjectTaskAssignee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="replaceAll" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectTaskAssigneeList", propOrder = {
    "projectTaskAssignee"
})
public class ProjectTaskAssigneeList {

    protected List<ProjectTaskAssignee> projectTaskAssignee;
    @XmlAttribute(name = "replaceAll")
    protected Boolean replaceAll;

    /**
     * Gets the value of the projectTaskAssignee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectTaskAssignee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectTaskAssignee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectTaskAssignee }
     * 
     * 
     */
    public List<ProjectTaskAssignee> getProjectTaskAssignee() {
        if (projectTaskAssignee == null) {
            projectTaskAssignee = new ArrayList<ProjectTaskAssignee>();
        }
        return this.projectTaskAssignee;
    }

    /**
     * 获取replaceAll属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReplaceAll() {
        if (replaceAll == null) {
            return true;
        } else {
            return replaceAll;
        }
    }

    /**
     * 设置replaceAll属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
    }

}
