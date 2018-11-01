
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.InitializeType;


/**
 * <p>InitializeRecord complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtype���Ե�ֵ��
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
     * ����type���Ե�ֵ��
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
     * ��ȡreference���Ե�ֵ��
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
     * ����reference���Ե�ֵ��
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
     * ��ȡauxReference���Ե�ֵ��
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
     * ����auxReference���Ե�ֵ��
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
     * ��ȡreferenceList���Ե�ֵ��
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
     * ����referenceList���Ե�ֵ��
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
