
package com.netsuite.webservices.platform.core_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PostingTransactionSummaryList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PostingTransactionSummaryList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postingTransactionSummary" type="{urn:core_2018_2.platform.webservices.netsuite.com}PostingTransactionSummary" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingTransactionSummaryList", propOrder = {
    "postingTransactionSummary"
})
public class PostingTransactionSummaryList {

    @XmlElement(required = true)
    protected List<PostingTransactionSummary> postingTransactionSummary;

    /**
     * Gets the value of the postingTransactionSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postingTransactionSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostingTransactionSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostingTransactionSummary }
     * 
     * 
     */
    public List<PostingTransactionSummary> getPostingTransactionSummary() {
        if (postingTransactionSummary == null) {
            postingTransactionSummary = new ArrayList<PostingTransactionSummary>();
        }
        return this.postingTransactionSummary;
    }

}
