
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeletionReason complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DeletionReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deletionReasonCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef"/>
 *         &lt;element name="deletionReasonMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeletionReason", propOrder = {
    "deletionReasonCode",
    "deletionReasonMemo"
})
public class DeletionReason {

    @XmlElement(required = true)
    protected RecordRef deletionReasonCode;
    protected String deletionReasonMemo;

    /**
     * 获取deletionReasonCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDeletionReasonCode() {
        return deletionReasonCode;
    }

    /**
     * 设置deletionReasonCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDeletionReasonCode(RecordRef value) {
        this.deletionReasonCode = value;
    }

    /**
     * 获取deletionReasonMemo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeletionReasonMemo() {
        return deletionReasonMemo;
    }

    /**
     * 设置deletionReasonMemo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeletionReasonMemo(String value) {
        this.deletionReasonMemo = value;
    }

}
