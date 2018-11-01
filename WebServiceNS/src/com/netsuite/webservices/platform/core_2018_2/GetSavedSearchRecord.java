
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.SearchRecordType;


/**
 * <p>GetSavedSearchRecord complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetSavedSearchRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="searchType" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}SearchRecordType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSavedSearchRecord")
public class GetSavedSearchRecord {

    @XmlAttribute(name = "searchType")
    protected SearchRecordType searchType;

    /**
     * 获取searchType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchRecordType }
     *     
     */
    public SearchRecordType getSearchType() {
        return searchType;
    }

    /**
     * 设置searchType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRecordType }
     *     
     */
    public void setSearchType(SearchRecordType value) {
        this.searchType = value;
    }

}
