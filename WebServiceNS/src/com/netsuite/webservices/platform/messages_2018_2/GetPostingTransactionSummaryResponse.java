
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.GetPostingTransactionSummaryResult;


/**
 * <p>GetPostingTransactionSummaryResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetPostingTransactionSummaryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}getPostingTransactionSummaryResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPostingTransactionSummaryResponse", propOrder = {
    "getPostingTransactionSummaryResult"
})
public class GetPostingTransactionSummaryResponse {

    @XmlElement(namespace = "urn:core_2018_2.platform.webservices.netsuite.com", required = true)
    protected GetPostingTransactionSummaryResult getPostingTransactionSummaryResult;

    /**
     * 获取getPostingTransactionSummaryResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetPostingTransactionSummaryResult }
     *     
     */
    public GetPostingTransactionSummaryResult getGetPostingTransactionSummaryResult() {
        return getPostingTransactionSummaryResult;
    }

    /**
     * 设置getPostingTransactionSummaryResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetPostingTransactionSummaryResult }
     *     
     */
    public void setGetPostingTransactionSummaryResult(GetPostingTransactionSummaryResult value) {
        this.getPostingTransactionSummaryResult = value;
    }

}
