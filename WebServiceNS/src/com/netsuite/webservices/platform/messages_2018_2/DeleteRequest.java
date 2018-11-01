
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.BaseRef;
import com.netsuite.webservices.platform.core_2018_2.DeletionReason;


/**
 * <p>DeleteRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DeleteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseRef" type="{urn:core_2018_2.platform.webservices.netsuite.com}BaseRef"/>
 *         &lt;element name="deletionReason" type="{urn:core_2018_2.platform.webservices.netsuite.com}DeletionReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteRequest", propOrder = {
    "baseRef",
    "deletionReason"
})
public class DeleteRequest {

    @XmlElement(required = true)
    protected BaseRef baseRef;
    protected DeletionReason deletionReason;

    /**
     * 获取baseRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseRef }
     *     
     */
    public BaseRef getBaseRef() {
        return baseRef;
    }

    /**
     * 设置baseRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRef }
     *     
     */
    public void setBaseRef(BaseRef value) {
        this.baseRef = value;
    }

    /**
     * 获取deletionReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeletionReason }
     *     
     */
    public DeletionReason getDeletionReason() {
        return deletionReason;
    }

    /**
     * 设置deletionReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeletionReason }
     *     
     */
    public void setDeletionReason(DeletionReason value) {
        this.deletionReason = value;
    }

}
