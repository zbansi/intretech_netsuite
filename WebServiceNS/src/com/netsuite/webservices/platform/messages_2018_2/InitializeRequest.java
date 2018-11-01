
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.InitializeRecord;


/**
 * <p>InitializeRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InitializeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initializeRecord" type="{urn:core_2018_2.platform.webservices.netsuite.com}InitializeRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitializeRequest", propOrder = {
    "initializeRecord"
})
public class InitializeRequest {

    @XmlElement(required = true)
    protected InitializeRecord initializeRecord;

    /**
     * 获取initializeRecord属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InitializeRecord }
     *     
     */
    public InitializeRecord getInitializeRecord() {
        return initializeRecord;
    }

    /**
     * 设置initializeRecord属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InitializeRecord }
     *     
     */
    public void setInitializeRecord(InitializeRecord value) {
        this.initializeRecord = value;
    }

}
