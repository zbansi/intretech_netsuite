
package com.netsuite.webservices.setup.customization_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomizationFilterCompareType;


/**
 * <p>CrmCustomFieldFilter complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CrmCustomFieldFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fldFilter" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="fldFilterChecked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fldFilterCompareType" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomizationFilterCompareType" minOccurs="0"/>
 *         &lt;element name="fldFilterVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fldFilterSelList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}FldFilterSelList" minOccurs="0"/>
 *         &lt;element name="fldFilterNotNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmCustomFieldFilter", propOrder = {
    "fldFilter",
    "fldFilterChecked",
    "fldFilterCompareType",
    "fldFilterVal",
    "fldFilterSelList",
    "fldFilterNotNull"
})
public class CrmCustomFieldFilter {

    protected RecordRef fldFilter;
    protected Boolean fldFilterChecked;
    @XmlSchemaType(name = "string")
    protected CustomizationFilterCompareType fldFilterCompareType;
    protected String fldFilterVal;
    protected FldFilterSelList fldFilterSelList;
    protected Boolean fldFilterNotNull;

    /**
     * 获取fldFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFldFilter() {
        return fldFilter;
    }

    /**
     * 设置fldFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFldFilter(RecordRef value) {
        this.fldFilter = value;
    }

    /**
     * 获取fldFilterChecked属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFldFilterChecked() {
        return fldFilterChecked;
    }

    /**
     * 设置fldFilterChecked属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFldFilterChecked(Boolean value) {
        this.fldFilterChecked = value;
    }

    /**
     * 获取fldFilterCompareType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomizationFilterCompareType }
     *     
     */
    public CustomizationFilterCompareType getFldFilterCompareType() {
        return fldFilterCompareType;
    }

    /**
     * 设置fldFilterCompareType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationFilterCompareType }
     *     
     */
    public void setFldFilterCompareType(CustomizationFilterCompareType value) {
        this.fldFilterCompareType = value;
    }

    /**
     * 获取fldFilterVal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFldFilterVal() {
        return fldFilterVal;
    }

    /**
     * 设置fldFilterVal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFldFilterVal(String value) {
        this.fldFilterVal = value;
    }

    /**
     * 获取fldFilterSelList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FldFilterSelList }
     *     
     */
    public FldFilterSelList getFldFilterSelList() {
        return fldFilterSelList;
    }

    /**
     * 设置fldFilterSelList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FldFilterSelList }
     *     
     */
    public void setFldFilterSelList(FldFilterSelList value) {
        this.fldFilterSelList = value;
    }

    /**
     * 获取fldFilterNotNull属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFldFilterNotNull() {
        return fldFilterNotNull;
    }

    /**
     * 设置fldFilterNotNull属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFldFilterNotNull(Boolean value) {
        this.fldFilterNotNull = value;
    }

}
