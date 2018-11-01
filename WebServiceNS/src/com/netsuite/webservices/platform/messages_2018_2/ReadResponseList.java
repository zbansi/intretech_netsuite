
package com.netsuite.webservices.platform.messages_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.Status;


/**
 * <p>ReadResponseList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReadResponseList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}status" minOccurs="0"/>
 *         &lt;element name="readResponse" type="{urn:messages_2018_2.platform.webservices.netsuite.com}ReadResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadResponseList", propOrder = {
    "status",
    "readResponse"
})
public class ReadResponseList {

    @XmlElement(namespace = "urn:core_2018_2.platform.webservices.netsuite.com")
    protected Status status;
    protected List<ReadResponse> readResponse;

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the readResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadResponse }
     * 
     * 
     */
    public List<ReadResponse> getReadResponse() {
        if (readResponse == null) {
            readResponse = new ArrayList<ReadResponse>();
        }
        return this.readResponse;
    }

}
