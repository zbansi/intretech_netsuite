
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.GetSelectValueFieldDescription;


/**
 * <p>getSelectValueRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getSelectValueRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldDescription" type="{urn:core_2018_2.platform.webservices.netsuite.com}GetSelectValueFieldDescription"/>
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelectValueRequest", propOrder = {
    "fieldDescription",
    "pageIndex"
})
public class GetSelectValueRequest {

    @XmlElement(required = true)
    protected GetSelectValueFieldDescription fieldDescription;
    protected int pageIndex;

    /**
     * 获取fieldDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetSelectValueFieldDescription }
     *     
     */
    public GetSelectValueFieldDescription getFieldDescription() {
        return fieldDescription;
    }

    /**
     * 设置fieldDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetSelectValueFieldDescription }
     *     
     */
    public void setFieldDescription(GetSelectValueFieldDescription value) {
        this.fieldDescription = value;
    }

    /**
     * 获取pageIndex属性的值。
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * 设置pageIndex属性的值。
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

}
