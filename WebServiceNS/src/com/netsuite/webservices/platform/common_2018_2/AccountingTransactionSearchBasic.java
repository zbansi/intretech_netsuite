
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchBooleanField;
import com.netsuite.webservices.platform.core_2018_2.SearchDateField;
import com.netsuite.webservices.platform.core_2018_2.SearchDoubleField;
import com.netsuite.webservices.platform.core_2018_2.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchLongField;
import com.netsuite.webservices.platform.core_2018_2.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchRecordBasic;


/**
 * <p>AccountingTransactionSearchBasic complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccountingTransactionSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecordBasic">
 *       &lt;sequence>
 *         &lt;element name="account" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="accountingBook" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="accountType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="altSalesAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="altSalesNetAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="amount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="bookSpecificTransaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="catchUpPeriod" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="creditAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="customGL" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="debitAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="deferRevRec" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="grossAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="multiSubsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="netAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="posting" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="quantityRevCommitted" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="recognizedRevenue" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="revCommitStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="revenueStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="revRecEndDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="revRecOnRevCommitment" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="revRecStartDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="tranIsVsoeBundle" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="vsoeAllocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingTransactionSearchBasic", propOrder = {
    "account",
    "accountingBook",
    "accountType",
    "altSalesAmount",
    "altSalesNetAmount",
    "amount",
    "bookSpecificTransaction",
    "catchUpPeriod",
    "creditAmount",
    "customGL",
    "debitAmount",
    "deferRevRec",
    "exchangeRate",
    "grossAmount",
    "internalId",
    "internalIdNumber",
    "multiSubsidiary",
    "netAmount",
    "posting",
    "quantityRevCommitted",
    "recognizedRevenue",
    "revCommitStatus",
    "revenueStatus",
    "revRecEndDate",
    "revRecOnRevCommitment",
    "revRecStartDate",
    "subsidiary",
    "tranIsVsoeBundle",
    "type",
    "vsoeAllocation"
})
public class AccountingTransactionSearchBasic
    extends SearchRecordBasic
{

    protected SearchMultiSelectField account;
    protected SearchMultiSelectField accountingBook;
    protected SearchMultiSelectField accountType;
    protected SearchDoubleField altSalesAmount;
    protected SearchDoubleField altSalesNetAmount;
    protected SearchDoubleField amount;
    protected SearchBooleanField bookSpecificTransaction;
    protected SearchMultiSelectField catchUpPeriod;
    protected SearchDoubleField creditAmount;
    protected SearchBooleanField customGL;
    protected SearchDoubleField debitAmount;
    protected SearchBooleanField deferRevRec;
    protected SearchDoubleField exchangeRate;
    protected SearchDoubleField grossAmount;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField multiSubsidiary;
    protected SearchDoubleField netAmount;
    protected SearchBooleanField posting;
    protected SearchDoubleField quantityRevCommitted;
    protected SearchDoubleField recognizedRevenue;
    protected SearchEnumMultiSelectField revCommitStatus;
    protected SearchEnumMultiSelectField revenueStatus;
    protected SearchDateField revRecEndDate;
    protected SearchBooleanField revRecOnRevCommitment;
    protected SearchDateField revRecStartDate;
    protected SearchMultiSelectField subsidiary;
    protected SearchBooleanField tranIsVsoeBundle;
    protected SearchEnumMultiSelectField type;
    protected SearchDoubleField vsoeAllocation;

    /**
     * 获取account属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccount() {
        return account;
    }

    /**
     * 设置account属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccount(SearchMultiSelectField value) {
        this.account = value;
    }

    /**
     * 获取accountingBook属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccountingBook() {
        return accountingBook;
    }

    /**
     * 设置accountingBook属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccountingBook(SearchMultiSelectField value) {
        this.accountingBook = value;
    }

    /**
     * 获取accountType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccountType() {
        return accountType;
    }

    /**
     * 设置accountType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccountType(SearchMultiSelectField value) {
        this.accountType = value;
    }

    /**
     * 获取altSalesAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAltSalesAmount() {
        return altSalesAmount;
    }

    /**
     * 设置altSalesAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAltSalesAmount(SearchDoubleField value) {
        this.altSalesAmount = value;
    }

    /**
     * 获取altSalesNetAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAltSalesNetAmount() {
        return altSalesNetAmount;
    }

    /**
     * 设置altSalesNetAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAltSalesNetAmount(SearchDoubleField value) {
        this.altSalesNetAmount = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAmount(SearchDoubleField value) {
        this.amount = value;
    }

    /**
     * 获取bookSpecificTransaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getBookSpecificTransaction() {
        return bookSpecificTransaction;
    }

    /**
     * 设置bookSpecificTransaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setBookSpecificTransaction(SearchBooleanField value) {
        this.bookSpecificTransaction = value;
    }

    /**
     * 获取catchUpPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCatchUpPeriod() {
        return catchUpPeriod;
    }

    /**
     * 设置catchUpPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCatchUpPeriod(SearchMultiSelectField value) {
        this.catchUpPeriod = value;
    }

    /**
     * 获取creditAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCreditAmount() {
        return creditAmount;
    }

    /**
     * 设置creditAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCreditAmount(SearchDoubleField value) {
        this.creditAmount = value;
    }

    /**
     * 获取customGL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCustomGL() {
        return customGL;
    }

    /**
     * 设置customGL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCustomGL(SearchBooleanField value) {
        this.customGL = value;
    }

    /**
     * 获取debitAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDebitAmount() {
        return debitAmount;
    }

    /**
     * 设置debitAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDebitAmount(SearchDoubleField value) {
        this.debitAmount = value;
    }

    /**
     * 获取deferRevRec属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getDeferRevRec() {
        return deferRevRec;
    }

    /**
     * 设置deferRevRec属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setDeferRevRec(SearchBooleanField value) {
        this.deferRevRec = value;
    }

    /**
     * 获取exchangeRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getExchangeRate() {
        return exchangeRate;
    }

    /**
     * 设置exchangeRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setExchangeRate(SearchDoubleField value) {
        this.exchangeRate = value;
    }

    /**
     * 获取grossAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGrossAmount() {
        return grossAmount;
    }

    /**
     * 设置grossAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGrossAmount(SearchDoubleField value) {
        this.grossAmount = value;
    }

    /**
     * 获取internalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * 设置internalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * 获取internalIdNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * 设置internalIdNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * 获取multiSubsidiary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMultiSubsidiary() {
        return multiSubsidiary;
    }

    /**
     * 设置multiSubsidiary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMultiSubsidiary(SearchBooleanField value) {
        this.multiSubsidiary = value;
    }

    /**
     * 获取netAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getNetAmount() {
        return netAmount;
    }

    /**
     * 设置netAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setNetAmount(SearchDoubleField value) {
        this.netAmount = value;
    }

    /**
     * 获取posting属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPosting() {
        return posting;
    }

    /**
     * 设置posting属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPosting(SearchBooleanField value) {
        this.posting = value;
    }

    /**
     * 获取quantityRevCommitted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityRevCommitted() {
        return quantityRevCommitted;
    }

    /**
     * 设置quantityRevCommitted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityRevCommitted(SearchDoubleField value) {
        this.quantityRevCommitted = value;
    }

    /**
     * 获取recognizedRevenue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getRecognizedRevenue() {
        return recognizedRevenue;
    }

    /**
     * 设置recognizedRevenue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setRecognizedRevenue(SearchDoubleField value) {
        this.recognizedRevenue = value;
    }

    /**
     * 获取revCommitStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getRevCommitStatus() {
        return revCommitStatus;
    }

    /**
     * 设置revCommitStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setRevCommitStatus(SearchEnumMultiSelectField value) {
        this.revCommitStatus = value;
    }

    /**
     * 获取revenueStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getRevenueStatus() {
        return revenueStatus;
    }

    /**
     * 设置revenueStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setRevenueStatus(SearchEnumMultiSelectField value) {
        this.revenueStatus = value;
    }

    /**
     * 获取revRecEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getRevRecEndDate() {
        return revRecEndDate;
    }

    /**
     * 设置revRecEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setRevRecEndDate(SearchDateField value) {
        this.revRecEndDate = value;
    }

    /**
     * 获取revRecOnRevCommitment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }

    /**
     * 设置revRecOnRevCommitment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setRevRecOnRevCommitment(SearchBooleanField value) {
        this.revRecOnRevCommitment = value;
    }

    /**
     * 获取revRecStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getRevRecStartDate() {
        return revRecStartDate;
    }

    /**
     * 设置revRecStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setRevRecStartDate(SearchDateField value) {
        this.revRecStartDate = value;
    }

    /**
     * 获取subsidiary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }

    /**
     * 设置subsidiary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSubsidiary(SearchMultiSelectField value) {
        this.subsidiary = value;
    }

    /**
     * 获取tranIsVsoeBundle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }

    /**
     * 设置tranIsVsoeBundle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setTranIsVsoeBundle(SearchBooleanField value) {
        this.tranIsVsoeBundle = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setType(SearchEnumMultiSelectField value) {
        this.type = value;
    }

    /**
     * 获取vsoeAllocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getVsoeAllocation() {
        return vsoeAllocation;
    }

    /**
     * 设置vsoeAllocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setVsoeAllocation(SearchDoubleField value) {
        this.vsoeAllocation = value;
    }

}
