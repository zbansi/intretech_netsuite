
package com.netsuite.webservices.platform.common_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnBooleanField;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnDateField;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnStringField;
import com.netsuite.webservices.platform.core_2018_2.SearchRowBasic;


/**
 * <p>ConsolidatedExchangeRateSearchRowBasic complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ConsolidatedExchangeRateSearchRowBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRowBasic">
 *       &lt;sequence>
 *         &lt;element name="accountingBook" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="averageRate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="closed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currentRate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fromCurrency" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fromSubsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="historicalRate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="periodEndDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="periodName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="periodStartDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="toCurrency" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="toSubsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidatedExchangeRateSearchRowBasic", propOrder = {
    "accountingBook",
    "averageRate",
    "closed",
    "currentRate",
    "externalId",
    "fromCurrency",
    "fromSubsidiary",
    "historicalRate",
    "internalId",
    "periodEndDate",
    "periodName",
    "periodStartDate",
    "toCurrency",
    "toSubsidiary"
})
public class ConsolidatedExchangeRateSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnStringField> accountingBook;
    protected List<SearchColumnStringField> averageRate;
    protected List<SearchColumnBooleanField> closed;
    protected List<SearchColumnStringField> currentRate;
    protected List<SearchColumnSelectField> externalId;
    protected List<SearchColumnStringField> fromCurrency;
    protected List<SearchColumnStringField> fromSubsidiary;
    protected List<SearchColumnStringField> historicalRate;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnDateField> periodEndDate;
    protected List<SearchColumnStringField> periodName;
    protected List<SearchColumnDateField> periodStartDate;
    protected List<SearchColumnStringField> toCurrency;
    protected List<SearchColumnStringField> toSubsidiary;

    /**
     * Gets the value of the accountingBook property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingBook property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingBook().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAccountingBook() {
        if (accountingBook == null) {
            accountingBook = new ArrayList<SearchColumnStringField>();
        }
        return this.accountingBook;
    }

    /**
     * Gets the value of the averageRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the averageRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAverageRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAverageRate() {
        if (averageRate == null) {
            averageRate = new ArrayList<SearchColumnStringField>();
        }
        return this.averageRate;
    }

    /**
     * Gets the value of the closed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the closed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClosed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getClosed() {
        if (closed == null) {
            closed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.closed;
    }

    /**
     * Gets the value of the currentRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCurrentRate() {
        if (currentRate == null) {
            currentRate = new ArrayList<SearchColumnStringField>();
        }
        return this.currentRate;
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
     * Gets the value of the fromCurrency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromCurrency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFromCurrency() {
        if (fromCurrency == null) {
            fromCurrency = new ArrayList<SearchColumnStringField>();
        }
        return this.fromCurrency;
    }

    /**
     * Gets the value of the fromSubsidiary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromSubsidiary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromSubsidiary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFromSubsidiary() {
        if (fromSubsidiary == null) {
            fromSubsidiary = new ArrayList<SearchColumnStringField>();
        }
        return this.fromSubsidiary;
    }

    /**
     * Gets the value of the historicalRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicalRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricalRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getHistoricalRate() {
        if (historicalRate == null) {
            historicalRate = new ArrayList<SearchColumnStringField>();
        }
        return this.historicalRate;
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
     * Gets the value of the periodEndDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodEndDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodEndDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getPeriodEndDate() {
        if (periodEndDate == null) {
            periodEndDate = new ArrayList<SearchColumnDateField>();
        }
        return this.periodEndDate;
    }

    /**
     * Gets the value of the periodName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPeriodName() {
        if (periodName == null) {
            periodName = new ArrayList<SearchColumnStringField>();
        }
        return this.periodName;
    }

    /**
     * Gets the value of the periodStartDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodStartDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodStartDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getPeriodStartDate() {
        if (periodStartDate == null) {
            periodStartDate = new ArrayList<SearchColumnDateField>();
        }
        return this.periodStartDate;
    }

    /**
     * Gets the value of the toCurrency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toCurrency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getToCurrency() {
        if (toCurrency == null) {
            toCurrency = new ArrayList<SearchColumnStringField>();
        }
        return this.toCurrency;
    }

    /**
     * Gets the value of the toSubsidiary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toSubsidiary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToSubsidiary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getToSubsidiary() {
        if (toSubsidiary == null) {
            toSubsidiary = new ArrayList<SearchColumnStringField>();
        }
        return this.toSubsidiary;
    }

}
