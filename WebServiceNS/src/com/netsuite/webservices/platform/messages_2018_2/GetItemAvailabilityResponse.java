
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.GetItemAvailabilityResult;


/**
 * <p>GetItemAvailabilityResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetItemAvailabilityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}getItemAvailabilityResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemAvailabilityResponse", propOrder = {
    "getItemAvailabilityResult"
})
public class GetItemAvailabilityResponse {

    @XmlElement(namespace = "urn:core_2018_2.platform.webservices.netsuite.com", required = true)
    protected GetItemAvailabilityResult getItemAvailabilityResult;

    /**
     * 获取getItemAvailabilityResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetItemAvailabilityResult }
     *     
     */
    public GetItemAvailabilityResult getGetItemAvailabilityResult() {
        return getItemAvailabilityResult;
    }

    /**
     * 设置getItemAvailabilityResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetItemAvailabilityResult }
     *     
     */
    public void setGetItemAvailabilityResult(GetItemAvailabilityResult value) {
        this.getItemAvailabilityResult = value;
    }

}
