
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.types.Country;
import com.netsuite.webservices.platform.core_2018_2.Record;


/**
 * <p>TaxType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TaxType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doesNotAddToTotal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="postToItemCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxInNetAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reverseCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nexusAccountsList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}TaxTypeNexusAccountsList" minOccurs="0"/>
 *         &lt;element name="nexusesTaxList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}TaxTypeNexusesTaxList" minOccurs="0"/>
 *         &lt;element name="country" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", propOrder = {
    "name",
    "description",
    "doesNotAddToTotal",
    "postToItemCost",
    "taxInNetAmount",
    "reverseCharge",
    "isInactive",
    "nexusAccountsList",
    "nexusesTaxList",
    "country"
})
public class TaxType
    extends Record
{

    protected String name;
    protected String description;
    protected Boolean doesNotAddToTotal;
    protected Boolean postToItemCost;
    protected Boolean taxInNetAmount;
    protected Boolean reverseCharge;
    protected Boolean isInactive;
    protected TaxTypeNexusAccountsList nexusAccountsList;
    protected TaxTypeNexusesTaxList nexusesTaxList;
    @XmlSchemaType(name = "string")
    protected Country country;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡdoesNotAddToTotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoesNotAddToTotal() {
        return doesNotAddToTotal;
    }

    /**
     * ����doesNotAddToTotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoesNotAddToTotal(Boolean value) {
        this.doesNotAddToTotal = value;
    }

    /**
     * ��ȡpostToItemCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostToItemCost() {
        return postToItemCost;
    }

    /**
     * ����postToItemCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostToItemCost(Boolean value) {
        this.postToItemCost = value;
    }

    /**
     * ��ȡtaxInNetAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxInNetAmount() {
        return taxInNetAmount;
    }

    /**
     * ����taxInNetAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxInNetAmount(Boolean value) {
        this.taxInNetAmount = value;
    }

    /**
     * ��ȡreverseCharge���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverseCharge() {
        return reverseCharge;
    }

    /**
     * ����reverseCharge���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseCharge(Boolean value) {
        this.reverseCharge = value;
    }

    /**
     * ��ȡisInactive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * ����isInactive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * ��ȡnexusAccountsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeNexusAccountsList }
     *     
     */
    public TaxTypeNexusAccountsList getNexusAccountsList() {
        return nexusAccountsList;
    }

    /**
     * ����nexusAccountsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeNexusAccountsList }
     *     
     */
    public void setNexusAccountsList(TaxTypeNexusAccountsList value) {
        this.nexusAccountsList = value;
    }

    /**
     * ��ȡnexusesTaxList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeNexusesTaxList }
     *     
     */
    public TaxTypeNexusesTaxList getNexusesTaxList() {
        return nexusesTaxList;
    }

    /**
     * ����nexusesTaxList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeNexusesTaxList }
     *     
     */
    public void setNexusesTaxList(TaxTypeNexusesTaxList value) {
        this.nexusesTaxList = value;
    }

    /**
     * ��ȡcountry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * ����country���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * ��ȡinternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * ����internalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * ��ȡexternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * ����externalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
