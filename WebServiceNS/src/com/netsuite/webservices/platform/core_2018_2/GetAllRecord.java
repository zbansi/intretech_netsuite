
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.GetAllRecordType;


/**
 * <p>GetAllRecord complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetAllRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="recordType" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}GetAllRecordType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllRecord")
public class GetAllRecord {

    @XmlAttribute(name = "recordType")
    protected GetAllRecordType recordType;

    /**
     * 获取recordType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetAllRecordType }
     *     
     */
    public GetAllRecordType getRecordType() {
        return recordType;
    }

    /**
     * 设置recordType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllRecordType }
     *     
     */
    public void setRecordType(GetAllRecordType value) {
        this.recordType = value;
    }

}
