
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.AsyncStatusType;


/**
 * <p>AsyncStatusResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AsyncStatusResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}AsyncStatusType"/>
 *         &lt;element name="percentCompleted" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="estRemainingDuration" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncStatusResult", propOrder = {
    "jobId",
    "status",
    "percentCompleted",
    "estRemainingDuration"
})
public class AsyncStatusResult {

    @XmlElement(required = true)
    protected String jobId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AsyncStatusType status;
    protected double percentCompleted;
    protected double estRemainingDuration;

    /**
     * 获取jobId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * 设置jobId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AsyncStatusType }
     *     
     */
    public AsyncStatusType getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncStatusType }
     *     
     */
    public void setStatus(AsyncStatusType value) {
        this.status = value;
    }

    /**
     * 获取percentCompleted属性的值。
     * 
     */
    public double getPercentCompleted() {
        return percentCompleted;
    }

    /**
     * 设置percentCompleted属性的值。
     * 
     */
    public void setPercentCompleted(double value) {
        this.percentCompleted = value;
    }

    /**
     * 获取estRemainingDuration属性的值。
     * 
     */
    public double getEstRemainingDuration() {
        return estRemainingDuration;
    }

    /**
     * 设置estRemainingDuration属性的值。
     * 
     */
    public void setEstRemainingDuration(double value) {
        this.estRemainingDuration = value;
    }

}
