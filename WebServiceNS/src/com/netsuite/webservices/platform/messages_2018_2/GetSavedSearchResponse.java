
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.GetSavedSearchResult;


/**
 * <p>GetSavedSearchResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetSavedSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}getSavedSearchResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSavedSearchResponse", propOrder = {
    "getSavedSearchResult"
})
public class GetSavedSearchResponse {

    @XmlElement(namespace = "urn:core_2018_2.platform.webservices.netsuite.com", required = true)
    protected GetSavedSearchResult getSavedSearchResult;

    /**
     * 获取getSavedSearchResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetSavedSearchResult }
     *     
     */
    public GetSavedSearchResult getGetSavedSearchResult() {
        return getSavedSearchResult;
    }

    /**
     * 设置getSavedSearchResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetSavedSearchResult }
     *     
     */
    public void setGetSavedSearchResult(GetSavedSearchResult value) {
        this.getSavedSearchResult = value;
    }

}
