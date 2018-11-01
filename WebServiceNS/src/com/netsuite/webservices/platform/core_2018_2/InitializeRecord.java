
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.InitializeType;


/**
 * <p>InitializeRecord complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InitializeRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}InitializeType"/>
 *         &lt;element name="reference" type="{urn:core_2018_2.platform.webservices.netsuite.com}InitializeRef" minOccurs="0"/>
 *         &lt;element name="auxReference" type="{urn:core_2018_2.platform.webservices.netsuite.com}InitializeAuxRef" minOccurs="0"/>
 *         &lt;element name="referenceList" type="{urn:core_2018_2.platform.webservices.netsuite.com}InitializeRefList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitializeRecord", propOrder = {
    "type",
    "reference",
    "auxReference",
    "referenceList"
})
public class InitializeRecord {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InitializeType type;
    protected InitializeRef reference;
    protected InitializeAuxRef auxReference;
    protected InitializeRefList referenceList;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InitializeType }
     *     
     */
    public InitializeType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InitializeType }
     *     
     */
    public void setType(InitializeType value) {
        this.type = value;
    }

    /**
     * 获取reference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InitializeRef }
     *     
     */
    public InitializeRef getReference() {
        return reference;
    }

    /**
     * 设置reference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InitializeRef }
     *     
     */
    public void setReference(InitializeRef value) {
        this.reference = value;
    }

    /**
     * 获取auxReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InitializeAuxRef }
     *     
     */
    public InitializeAuxRef getAuxReference() {
        return auxReference;
    }

    /**
     * 设置auxReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InitializeAuxRef }
     *     
     */
    public void setAuxReference(InitializeAuxRef value) {
        this.auxReference = value;
    }

    /**
     * 获取referenceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InitializeRefList }
     *     
     */
    public InitializeRefList getReferenceList() {
        return referenceList;
    }

    /**
     * 设置referenceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InitializeRefList }
     *     
     */
    public void setReferenceList(InitializeRefList value) {
        this.referenceList = value;
    }

}
