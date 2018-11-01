
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.GetAllRecord;


/**
 * <p>GetAllRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetAllRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="record" type="{urn:core_2018_2.platform.webservices.netsuite.com}GetAllRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllRequest", propOrder = {
    "record"
})
public class GetAllRequest {

    @XmlElement(required = true)
    protected GetAllRecord record;

    /**
     * 获取record属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetAllRecord }
     *     
     */
    public GetAllRecord getRecord() {
        return record;
    }

    /**
     * 设置record属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllRecord }
     *     
     */
    public void setRecord(GetAllRecord value) {
        this.record = value;
    }

}
