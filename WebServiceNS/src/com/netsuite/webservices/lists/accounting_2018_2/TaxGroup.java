
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.RecordRefList;


/**
 * <p>TaxGroup complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TaxGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsidiaryList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/>
 *         &lt;element name="taxitem1" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="unitprice1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxitem2" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="unitprice2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="piggyback" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="includeChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nexusCountry" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxItemList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}TaxGroupTaxItemList" minOccurs="0"/>
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
@XmlType(name = "TaxGroup", propOrder = {
    "itemId",
    "description",
    "state",
    "subsidiaryList",
    "taxitem1",
    "unitprice1",
    "taxitem2",
    "unitprice2",
    "piggyback",
    "isInactive",
    "rate",
    "taxType",
    "includeChildren",
    "county",
    "city",
    "zip",
    "nexusCountry",
    "isDefault",
    "taxItemList"
})
public class TaxGroup
    extends Record
{

    protected String itemId;
    protected String description;
    protected String state;
    protected RecordRefList subsidiaryList;
    protected RecordRef taxitem1;
    protected String unitprice1;
    protected RecordRef taxitem2;
    protected String unitprice2;
    protected Boolean piggyback;
    protected Boolean isInactive;
    protected Double rate;
    protected RecordRef taxType;
    protected Boolean includeChildren;
    protected String county;
    protected String city;
    protected String zip;
    protected RecordRef nexusCountry;
    protected Boolean isDefault;
    protected TaxGroupTaxItemList taxItemList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * ��ȡitemId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * ����itemId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
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
     * ��ȡstate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * ����state���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * ��ȡsubsidiaryList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }

    /**
     * ����subsidiaryList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setSubsidiaryList(RecordRefList value) {
        this.subsidiaryList = value;
    }

    /**
     * ��ȡtaxitem1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxitem1() {
        return taxitem1;
    }

    /**
     * ����taxitem1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxitem1(RecordRef value) {
        this.taxitem1 = value;
    }

    /**
     * ��ȡunitprice1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitprice1() {
        return unitprice1;
    }

    /**
     * ����unitprice1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitprice1(String value) {
        this.unitprice1 = value;
    }

    /**
     * ��ȡtaxitem2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxitem2() {
        return taxitem2;
    }

    /**
     * ����taxitem2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxitem2(RecordRef value) {
        this.taxitem2 = value;
    }

    /**
     * ��ȡunitprice2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitprice2() {
        return unitprice2;
    }

    /**
     * ����unitprice2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitprice2(String value) {
        this.unitprice2 = value;
    }

    /**
     * ��ȡpiggyback���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPiggyback() {
        return piggyback;
    }

    /**
     * ����piggyback���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPiggyback(Boolean value) {
        this.piggyback = value;
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
     * ��ȡrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRate() {
        return rate;
    }

    /**
     * ����rate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRate(Double value) {
        this.rate = value;
    }

    /**
     * ��ȡtaxType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxType() {
        return taxType;
    }

    /**
     * ����taxType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxType(RecordRef value) {
        this.taxType = value;
    }

    /**
     * ��ȡincludeChildren���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeChildren() {
        return includeChildren;
    }

    /**
     * ����includeChildren���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeChildren(Boolean value) {
        this.includeChildren = value;
    }

    /**
     * ��ȡcounty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * ����county���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * ��ȡcity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * ����city���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * ��ȡzip���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * ����zip���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * ��ȡnexusCountry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getNexusCountry() {
        return nexusCountry;
    }

    /**
     * ����nexusCountry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setNexusCountry(RecordRef value) {
        this.nexusCountry = value;
    }

    /**
     * ��ȡisDefault���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * ����isDefault���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * ��ȡtaxItemList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TaxGroupTaxItemList }
     *     
     */
    public TaxGroupTaxItemList getTaxItemList() {
        return taxItemList;
    }

    /**
     * ����taxItemList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TaxGroupTaxItemList }
     *     
     */
    public void setTaxItemList(TaxGroupTaxItemList value) {
        this.taxItemList = value;
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
