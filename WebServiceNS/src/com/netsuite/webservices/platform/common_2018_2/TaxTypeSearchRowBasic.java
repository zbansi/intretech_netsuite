
package com.netsuite.webservices.platform.common_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnBooleanField;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnEnumSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnStringField;
import com.netsuite.webservices.platform.core_2018_2.SearchRowBasic;


/**
 * <p>TaxTypeSearchRowBasic complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TaxTypeSearchRowBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRowBasic">
 *       &lt;sequence>
 *         &lt;element name="country" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="doesNotAddToTotal" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nexus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="payablesAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="postToItemCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="receivablesAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reverseCharge" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taxInNetAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxTypeSearchRowBasic", propOrder = {
    "country",
    "description",
    "doesNotAddToTotal",
    "externalId",
    "internalId",
    "isInactive",
    "name",
    "nexus",
    "payablesAccount",
    "postToItemCost",
    "receivablesAccount",
    "reverseCharge",
    "taxInNetAmount"
})
public class TaxTypeSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnEnumSelectField> country;
    protected List<SearchColumnStringField> description;
    protected List<SearchColumnBooleanField> doesNotAddToTotal;
    protected List<SearchColumnSelectField> externalId;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnBooleanField> isInactive;
    protected List<SearchColumnStringField> name;
    protected List<SearchColumnSelectField> nexus;
    protected List<SearchColumnSelectField> payablesAccount;
    protected List<SearchColumnBooleanField> postToItemCost;
    protected List<SearchColumnSelectField> receivablesAccount;
    protected List<SearchColumnBooleanField> reverseCharge;
    protected List<SearchColumnBooleanField> taxInNetAmount;

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getCountry() {
        if (country == null) {
            country = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.country;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getDescription() {
        if (description == null) {
            description = new ArrayList<SearchColumnStringField>();
        }
        return this.description;
    }

    /**
     * Gets the value of the doesNotAddToTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doesNotAddToTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoesNotAddToTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getDoesNotAddToTotal() {
        if (doesNotAddToTotal == null) {
            doesNotAddToTotal = new ArrayList<SearchColumnBooleanField>();
        }
        return this.doesNotAddToTotal;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getExternalId() {
        if (externalId == null) {
            externalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.externalId;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getInternalId() {
        if (internalId == null) {
            internalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.internalId;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isInactive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsInactive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsInactive() {
        if (isInactive == null) {
            isInactive = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isInactive;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getName() {
        if (name == null) {
            name = new ArrayList<SearchColumnStringField>();
        }
        return this.name;
    }

    /**
     * Gets the value of the nexus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nexus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNexus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getNexus() {
        if (nexus == null) {
            nexus = new ArrayList<SearchColumnSelectField>();
        }
        return this.nexus;
    }

    /**
     * Gets the value of the payablesAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payablesAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayablesAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPayablesAccount() {
        if (payablesAccount == null) {
            payablesAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.payablesAccount;
    }

    /**
     * Gets the value of the postToItemCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postToItemCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostToItemCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getPostToItemCost() {
        if (postToItemCost == null) {
            postToItemCost = new ArrayList<SearchColumnBooleanField>();
        }
        return this.postToItemCost;
    }

    /**
     * Gets the value of the receivablesAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivablesAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivablesAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getReceivablesAccount() {
        if (receivablesAccount == null) {
            receivablesAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.receivablesAccount;
    }

    /**
     * Gets the value of the reverseCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reverseCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReverseCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getReverseCharge() {
        if (reverseCharge == null) {
            reverseCharge = new ArrayList<SearchColumnBooleanField>();
        }
        return this.reverseCharge;
    }

    /**
     * Gets the value of the taxInNetAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInNetAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInNetAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getTaxInNetAmount() {
        if (taxInNetAmount == null) {
            taxInNetAmount = new ArrayList<SearchColumnBooleanField>();
        }
        return this.taxInNetAmount;
    }

}
