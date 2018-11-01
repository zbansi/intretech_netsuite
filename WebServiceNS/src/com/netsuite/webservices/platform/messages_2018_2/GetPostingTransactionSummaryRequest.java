
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.PostingTransactionSummaryField;
import com.netsuite.webservices.platform.core_2018_2.PostingTransactionSummaryFilter;


/**
 * <p>GetPostingTransactionSummaryRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetPostingTransactionSummaryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fields" type="{urn:core_2018_2.platform.webservices.netsuite.com}PostingTransactionSummaryField" minOccurs="0"/>
 *         &lt;element name="filters" type="{urn:core_2018_2.platform.webservices.netsuite.com}PostingTransactionSummaryFilter" minOccurs="0"/>
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPostingTransactionSummaryRequest", propOrder = {
    "fields",
    "filters",
    "pageIndex",
    "operationId"
})
public class GetPostingTransactionSummaryRequest {

    protected PostingTransactionSummaryField fields;
    protected PostingTransactionSummaryFilter filters;
    protected int pageIndex;
    protected String operationId;

    /**
     * ��ȡfields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PostingTransactionSummaryField }
     *     
     */
    public PostingTransactionSummaryField getFields() {
        return fields;
    }

    /**
     * ����fields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PostingTransactionSummaryField }
     *     
     */
    public void setFields(PostingTransactionSummaryField value) {
        this.fields = value;
    }

    /**
     * ��ȡfilters���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PostingTransactionSummaryFilter }
     *     
     */
    public PostingTransactionSummaryFilter getFilters() {
        return filters;
    }

    /**
     * ����filters���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PostingTransactionSummaryFilter }
     *     
     */
    public void setFilters(PostingTransactionSummaryFilter value) {
        this.filters = value;
    }

    /**
     * ��ȡpageIndex���Ե�ֵ��
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * ����pageIndex���Ե�ֵ��
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

    /**
     * ��ȡoperationId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * ����operationId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationId(String value) {
        this.operationId = value;
    }

}
