/**
 * AccountingTransactionSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2018_2;

public class AccountingTransactionSearchBasic  extends com.netsuite.webservices.platform.core_2018_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] account;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] accountingBook;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] accountType;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField altSalesAmount;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField altSalesNetAmount;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField amount;

    private com.netsuite.webservices.platform.core_2018_2.SearchBooleanField bookSpecificTransaction;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] catchUpPeriod;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField creditAmount;

    private com.netsuite.webservices.platform.core_2018_2.SearchBooleanField customGL;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField debitAmount;

    private com.netsuite.webservices.platform.core_2018_2.SearchBooleanField deferRevRec;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField exchangeRate;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField grossAmount;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2018_2.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2018_2.SearchBooleanField multiSubsidiary;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField netAmount;

    private com.netsuite.webservices.platform.core_2018_2.SearchBooleanField posting;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField quantityRevCommitted;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField recognizedRevenue;

    private java.lang.String[] revCommitStatus;

    private java.lang.String[] revenueStatus;

    private com.netsuite.webservices.platform.core_2018_2.SearchDateField revRecEndDate;

    private com.netsuite.webservices.platform.core_2018_2.SearchBooleanField revRecOnRevCommitment;

    private com.netsuite.webservices.platform.core_2018_2.SearchDateField revRecStartDate;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] subsidiary;

    private com.netsuite.webservices.platform.core_2018_2.SearchBooleanField tranIsVsoeBundle;

    private java.lang.String[] type;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField vsoeAllocation;

    public AccountingTransactionSearchBasic() {
    }

    public AccountingTransactionSearchBasic(
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] account,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] accountingBook,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] accountType,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField altSalesAmount,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField altSalesNetAmount,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField amount,
           com.netsuite.webservices.platform.core_2018_2.SearchBooleanField bookSpecificTransaction,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] catchUpPeriod,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField creditAmount,
           com.netsuite.webservices.platform.core_2018_2.SearchBooleanField customGL,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField debitAmount,
           com.netsuite.webservices.platform.core_2018_2.SearchBooleanField deferRevRec,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField exchangeRate,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField grossAmount,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2018_2.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2018_2.SearchBooleanField multiSubsidiary,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField netAmount,
           com.netsuite.webservices.platform.core_2018_2.SearchBooleanField posting,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField quantityRevCommitted,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField recognizedRevenue,
           java.lang.String[] revCommitStatus,
           java.lang.String[] revenueStatus,
           com.netsuite.webservices.platform.core_2018_2.SearchDateField revRecEndDate,
           com.netsuite.webservices.platform.core_2018_2.SearchBooleanField revRecOnRevCommitment,
           com.netsuite.webservices.platform.core_2018_2.SearchDateField revRecStartDate,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] subsidiary,
           com.netsuite.webservices.platform.core_2018_2.SearchBooleanField tranIsVsoeBundle,
           java.lang.String[] type,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField vsoeAllocation) {
        this.account = account;
        this.accountingBook = accountingBook;
        this.accountType = accountType;
        this.altSalesAmount = altSalesAmount;
        this.altSalesNetAmount = altSalesNetAmount;
        this.amount = amount;
        this.bookSpecificTransaction = bookSpecificTransaction;
        this.catchUpPeriod = catchUpPeriod;
        this.creditAmount = creditAmount;
        this.customGL = customGL;
        this.debitAmount = debitAmount;
        this.deferRevRec = deferRevRec;
        this.exchangeRate = exchangeRate;
        this.grossAmount = grossAmount;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.multiSubsidiary = multiSubsidiary;
        this.netAmount = netAmount;
        this.posting = posting;
        this.quantityRevCommitted = quantityRevCommitted;
        this.recognizedRevenue = recognizedRevenue;
        this.revCommitStatus = revCommitStatus;
        this.revenueStatus = revenueStatus;
        this.revRecEndDate = revRecEndDate;
        this.revRecOnRevCommitment = revRecOnRevCommitment;
        this.revRecStartDate = revRecStartDate;
        this.subsidiary = subsidiary;
        this.tranIsVsoeBundle = tranIsVsoeBundle;
        this.type = type;
        this.vsoeAllocation = vsoeAllocation;
    }


    /**
     * Gets the account value for this AccountingTransactionSearchBasic.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this AccountingTransactionSearchBasic.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2018_2.RecordRef[] account) {
        this.account = account;
    }


    /**
     * Gets the accountingBook value for this AccountingTransactionSearchBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this AccountingTransactionSearchBasic.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2018_2.RecordRef[] accountingBook) {
        this.accountingBook = accountingBook;
    }


    /**
     * Gets the accountType value for this AccountingTransactionSearchBasic.
     * 
     * @return accountType
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this AccountingTransactionSearchBasic.
     * 
     * @param accountType
     */
    public void setAccountType(com.netsuite.webservices.platform.core_2018_2.RecordRef[] accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the altSalesAmount value for this AccountingTransactionSearchBasic.
     * 
     * @return altSalesAmount
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getAltSalesAmount() {
        return altSalesAmount;
    }


    /**
     * Sets the altSalesAmount value for this AccountingTransactionSearchBasic.
     * 
     * @param altSalesAmount
     */
    public void setAltSalesAmount(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField altSalesAmount) {
        this.altSalesAmount = altSalesAmount;
    }


    /**
     * Gets the altSalesNetAmount value for this AccountingTransactionSearchBasic.
     * 
     * @return altSalesNetAmount
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getAltSalesNetAmount() {
        return altSalesNetAmount;
    }


    /**
     * Sets the altSalesNetAmount value for this AccountingTransactionSearchBasic.
     * 
     * @param altSalesNetAmount
     */
    public void setAltSalesNetAmount(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField altSalesNetAmount) {
        this.altSalesNetAmount = altSalesNetAmount;
    }


    /**
     * Gets the amount value for this AccountingTransactionSearchBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AccountingTransactionSearchBasic.
     * 
     * @param amount
     */
    public void setAmount(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField amount) {
        this.amount = amount;
    }


    /**
     * Gets the bookSpecificTransaction value for this AccountingTransactionSearchBasic.
     * 
     * @return bookSpecificTransaction
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchBooleanField getBookSpecificTransaction() {
        return bookSpecificTransaction;
    }


    /**
     * Sets the bookSpecificTransaction value for this AccountingTransactionSearchBasic.
     * 
     * @param bookSpecificTransaction
     */
    public void setBookSpecificTransaction(com.netsuite.webservices.platform.core_2018_2.SearchBooleanField bookSpecificTransaction) {
        this.bookSpecificTransaction = bookSpecificTransaction;
    }


    /**
     * Gets the catchUpPeriod value for this AccountingTransactionSearchBasic.
     * 
     * @return catchUpPeriod
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getCatchUpPeriod() {
        return catchUpPeriod;
    }


    /**
     * Sets the catchUpPeriod value for this AccountingTransactionSearchBasic.
     * 
     * @param catchUpPeriod
     */
    public void setCatchUpPeriod(com.netsuite.webservices.platform.core_2018_2.RecordRef[] catchUpPeriod) {
        this.catchUpPeriod = catchUpPeriod;
    }


    /**
     * Gets the creditAmount value for this AccountingTransactionSearchBasic.
     * 
     * @return creditAmount
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getCreditAmount() {
        return creditAmount;
    }


    /**
     * Sets the creditAmount value for this AccountingTransactionSearchBasic.
     * 
     * @param creditAmount
     */
    public void setCreditAmount(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField creditAmount) {
        this.creditAmount = creditAmount;
    }


    /**
     * Gets the customGL value for this AccountingTransactionSearchBasic.
     * 
     * @return customGL
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchBooleanField getCustomGL() {
        return customGL;
    }


    /**
     * Sets the customGL value for this AccountingTransactionSearchBasic.
     * 
     * @param customGL
     */
    public void setCustomGL(com.netsuite.webservices.platform.core_2018_2.SearchBooleanField customGL) {
        this.customGL = customGL;
    }


    /**
     * Gets the debitAmount value for this AccountingTransactionSearchBasic.
     * 
     * @return debitAmount
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getDebitAmount() {
        return debitAmount;
    }


    /**
     * Sets the debitAmount value for this AccountingTransactionSearchBasic.
     * 
     * @param debitAmount
     */
    public void setDebitAmount(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField debitAmount) {
        this.debitAmount = debitAmount;
    }


    /**
     * Gets the deferRevRec value for this AccountingTransactionSearchBasic.
     * 
     * @return deferRevRec
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchBooleanField getDeferRevRec() {
        return deferRevRec;
    }


    /**
     * Sets the deferRevRec value for this AccountingTransactionSearchBasic.
     * 
     * @param deferRevRec
     */
    public void setDeferRevRec(com.netsuite.webservices.platform.core_2018_2.SearchBooleanField deferRevRec) {
        this.deferRevRec = deferRevRec;
    }


    /**
     * Gets the exchangeRate value for this AccountingTransactionSearchBasic.
     * 
     * @return exchangeRate
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this AccountingTransactionSearchBasic.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the grossAmount value for this AccountingTransactionSearchBasic.
     * 
     * @return grossAmount
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getGrossAmount() {
        return grossAmount;
    }


    /**
     * Sets the grossAmount value for this AccountingTransactionSearchBasic.
     * 
     * @param grossAmount
     */
    public void setGrossAmount(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField grossAmount) {
        this.grossAmount = grossAmount;
    }


    /**
     * Gets the internalId value for this AccountingTransactionSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AccountingTransactionSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2018_2.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this AccountingTransactionSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this AccountingTransactionSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2018_2.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the multiSubsidiary value for this AccountingTransactionSearchBasic.
     * 
     * @return multiSubsidiary
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchBooleanField getMultiSubsidiary() {
        return multiSubsidiary;
    }


    /**
     * Sets the multiSubsidiary value for this AccountingTransactionSearchBasic.
     * 
     * @param multiSubsidiary
     */
    public void setMultiSubsidiary(com.netsuite.webservices.platform.core_2018_2.SearchBooleanField multiSubsidiary) {
        this.multiSubsidiary = multiSubsidiary;
    }


    /**
     * Gets the netAmount value for this AccountingTransactionSearchBasic.
     * 
     * @return netAmount
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this AccountingTransactionSearchBasic.
     * 
     * @param netAmount
     */
    public void setNetAmount(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField netAmount) {
        this.netAmount = netAmount;
    }


    /**
     * Gets the posting value for this AccountingTransactionSearchBasic.
     * 
     * @return posting
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchBooleanField getPosting() {
        return posting;
    }


    /**
     * Sets the posting value for this AccountingTransactionSearchBasic.
     * 
     * @param posting
     */
    public void setPosting(com.netsuite.webservices.platform.core_2018_2.SearchBooleanField posting) {
        this.posting = posting;
    }


    /**
     * Gets the quantityRevCommitted value for this AccountingTransactionSearchBasic.
     * 
     * @return quantityRevCommitted
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getQuantityRevCommitted() {
        return quantityRevCommitted;
    }


    /**
     * Sets the quantityRevCommitted value for this AccountingTransactionSearchBasic.
     * 
     * @param quantityRevCommitted
     */
    public void setQuantityRevCommitted(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField quantityRevCommitted) {
        this.quantityRevCommitted = quantityRevCommitted;
    }


    /**
     * Gets the recognizedRevenue value for this AccountingTransactionSearchBasic.
     * 
     * @return recognizedRevenue
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getRecognizedRevenue() {
        return recognizedRevenue;
    }


    /**
     * Sets the recognizedRevenue value for this AccountingTransactionSearchBasic.
     * 
     * @param recognizedRevenue
     */
    public void setRecognizedRevenue(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }


    /**
     * Gets the revCommitStatus value for this AccountingTransactionSearchBasic.
     * 
     * @return revCommitStatus
     */
    public java.lang.String[] getRevCommitStatus() {
        return revCommitStatus;
    }


    /**
     * Sets the revCommitStatus value for this AccountingTransactionSearchBasic.
     * 
     * @param revCommitStatus
     */
    public void setRevCommitStatus(java.lang.String[] revCommitStatus) {
        this.revCommitStatus = revCommitStatus;
    }


    /**
     * Gets the revenueStatus value for this AccountingTransactionSearchBasic.
     * 
     * @return revenueStatus
     */
    public java.lang.String[] getRevenueStatus() {
        return revenueStatus;
    }


    /**
     * Sets the revenueStatus value for this AccountingTransactionSearchBasic.
     * 
     * @param revenueStatus
     */
    public void setRevenueStatus(java.lang.String[] revenueStatus) {
        this.revenueStatus = revenueStatus;
    }


    /**
     * Gets the revRecEndDate value for this AccountingTransactionSearchBasic.
     * 
     * @return revRecEndDate
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDateField getRevRecEndDate() {
        return revRecEndDate;
    }


    /**
     * Sets the revRecEndDate value for this AccountingTransactionSearchBasic.
     * 
     * @param revRecEndDate
     */
    public void setRevRecEndDate(com.netsuite.webservices.platform.core_2018_2.SearchDateField revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }


    /**
     * Gets the revRecOnRevCommitment value for this AccountingTransactionSearchBasic.
     * 
     * @return revRecOnRevCommitment
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchBooleanField getRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }


    /**
     * Sets the revRecOnRevCommitment value for this AccountingTransactionSearchBasic.
     * 
     * @param revRecOnRevCommitment
     */
    public void setRevRecOnRevCommitment(com.netsuite.webservices.platform.core_2018_2.SearchBooleanField revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }


    /**
     * Gets the revRecStartDate value for this AccountingTransactionSearchBasic.
     * 
     * @return revRecStartDate
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDateField getRevRecStartDate() {
        return revRecStartDate;
    }


    /**
     * Sets the revRecStartDate value for this AccountingTransactionSearchBasic.
     * 
     * @param revRecStartDate
     */
    public void setRevRecStartDate(com.netsuite.webservices.platform.core_2018_2.SearchDateField revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }


    /**
     * Gets the subsidiary value for this AccountingTransactionSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this AccountingTransactionSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2018_2.RecordRef[] subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the tranIsVsoeBundle value for this AccountingTransactionSearchBasic.
     * 
     * @return tranIsVsoeBundle
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchBooleanField getTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }


    /**
     * Sets the tranIsVsoeBundle value for this AccountingTransactionSearchBasic.
     * 
     * @param tranIsVsoeBundle
     */
    public void setTranIsVsoeBundle(com.netsuite.webservices.platform.core_2018_2.SearchBooleanField tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }


    /**
     * Gets the type value for this AccountingTransactionSearchBasic.
     * 
     * @return type
     */
    public java.lang.String[] getType() {
        return type;
    }


    /**
     * Sets the type value for this AccountingTransactionSearchBasic.
     * 
     * @param type
     */
    public void setType(java.lang.String[] type) {
        this.type = type;
    }


    /**
     * Gets the vsoeAllocation value for this AccountingTransactionSearchBasic.
     * 
     * @return vsoeAllocation
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getVsoeAllocation() {
        return vsoeAllocation;
    }


    /**
     * Sets the vsoeAllocation value for this AccountingTransactionSearchBasic.
     * 
     * @param vsoeAllocation
     */
    public void setVsoeAllocation(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountingTransactionSearchBasic)) return false;
        AccountingTransactionSearchBasic other = (AccountingTransactionSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              java.util.Arrays.equals(this.account, other.getAccount()))) &&
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              java.util.Arrays.equals(this.accountingBook, other.getAccountingBook()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              java.util.Arrays.equals(this.accountType, other.getAccountType()))) &&
            ((this.altSalesAmount==null && other.getAltSalesAmount()==null) || 
             (this.altSalesAmount!=null &&
              this.altSalesAmount.equals(other.getAltSalesAmount()))) &&
            ((this.altSalesNetAmount==null && other.getAltSalesNetAmount()==null) || 
             (this.altSalesNetAmount!=null &&
              this.altSalesNetAmount.equals(other.getAltSalesNetAmount()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.bookSpecificTransaction==null && other.getBookSpecificTransaction()==null) || 
             (this.bookSpecificTransaction!=null &&
              this.bookSpecificTransaction.equals(other.getBookSpecificTransaction()))) &&
            ((this.catchUpPeriod==null && other.getCatchUpPeriod()==null) || 
             (this.catchUpPeriod!=null &&
              java.util.Arrays.equals(this.catchUpPeriod, other.getCatchUpPeriod()))) &&
            ((this.creditAmount==null && other.getCreditAmount()==null) || 
             (this.creditAmount!=null &&
              this.creditAmount.equals(other.getCreditAmount()))) &&
            ((this.customGL==null && other.getCustomGL()==null) || 
             (this.customGL!=null &&
              this.customGL.equals(other.getCustomGL()))) &&
            ((this.debitAmount==null && other.getDebitAmount()==null) || 
             (this.debitAmount!=null &&
              this.debitAmount.equals(other.getDebitAmount()))) &&
            ((this.deferRevRec==null && other.getDeferRevRec()==null) || 
             (this.deferRevRec!=null &&
              this.deferRevRec.equals(other.getDeferRevRec()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.grossAmount==null && other.getGrossAmount()==null) || 
             (this.grossAmount!=null &&
              this.grossAmount.equals(other.getGrossAmount()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.multiSubsidiary==null && other.getMultiSubsidiary()==null) || 
             (this.multiSubsidiary!=null &&
              this.multiSubsidiary.equals(other.getMultiSubsidiary()))) &&
            ((this.netAmount==null && other.getNetAmount()==null) || 
             (this.netAmount!=null &&
              this.netAmount.equals(other.getNetAmount()))) &&
            ((this.posting==null && other.getPosting()==null) || 
             (this.posting!=null &&
              this.posting.equals(other.getPosting()))) &&
            ((this.quantityRevCommitted==null && other.getQuantityRevCommitted()==null) || 
             (this.quantityRevCommitted!=null &&
              this.quantityRevCommitted.equals(other.getQuantityRevCommitted()))) &&
            ((this.recognizedRevenue==null && other.getRecognizedRevenue()==null) || 
             (this.recognizedRevenue!=null &&
              this.recognizedRevenue.equals(other.getRecognizedRevenue()))) &&
            ((this.revCommitStatus==null && other.getRevCommitStatus()==null) || 
             (this.revCommitStatus!=null &&
              java.util.Arrays.equals(this.revCommitStatus, other.getRevCommitStatus()))) &&
            ((this.revenueStatus==null && other.getRevenueStatus()==null) || 
             (this.revenueStatus!=null &&
              java.util.Arrays.equals(this.revenueStatus, other.getRevenueStatus()))) &&
            ((this.revRecEndDate==null && other.getRevRecEndDate()==null) || 
             (this.revRecEndDate!=null &&
              this.revRecEndDate.equals(other.getRevRecEndDate()))) &&
            ((this.revRecOnRevCommitment==null && other.getRevRecOnRevCommitment()==null) || 
             (this.revRecOnRevCommitment!=null &&
              this.revRecOnRevCommitment.equals(other.getRevRecOnRevCommitment()))) &&
            ((this.revRecStartDate==null && other.getRevRecStartDate()==null) || 
             (this.revRecStartDate!=null &&
              this.revRecStartDate.equals(other.getRevRecStartDate()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.tranIsVsoeBundle==null && other.getTranIsVsoeBundle()==null) || 
             (this.tranIsVsoeBundle!=null &&
              this.tranIsVsoeBundle.equals(other.getTranIsVsoeBundle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.vsoeAllocation==null && other.getVsoeAllocation()==null) || 
             (this.vsoeAllocation!=null &&
              this.vsoeAllocation.equals(other.getVsoeAllocation())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountingBook() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingBook());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingBook(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltSalesAmount() != null) {
            _hashCode += getAltSalesAmount().hashCode();
        }
        if (getAltSalesNetAmount() != null) {
            _hashCode += getAltSalesNetAmount().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBookSpecificTransaction() != null) {
            _hashCode += getBookSpecificTransaction().hashCode();
        }
        if (getCatchUpPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCatchUpPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCatchUpPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditAmount() != null) {
            _hashCode += getCreditAmount().hashCode();
        }
        if (getCustomGL() != null) {
            _hashCode += getCustomGL().hashCode();
        }
        if (getDebitAmount() != null) {
            _hashCode += getDebitAmount().hashCode();
        }
        if (getDeferRevRec() != null) {
            _hashCode += getDeferRevRec().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getGrossAmount() != null) {
            _hashCode += getGrossAmount().hashCode();
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getMultiSubsidiary() != null) {
            _hashCode += getMultiSubsidiary().hashCode();
        }
        if (getNetAmount() != null) {
            _hashCode += getNetAmount().hashCode();
        }
        if (getPosting() != null) {
            _hashCode += getPosting().hashCode();
        }
        if (getQuantityRevCommitted() != null) {
            _hashCode += getQuantityRevCommitted().hashCode();
        }
        if (getRecognizedRevenue() != null) {
            _hashCode += getRecognizedRevenue().hashCode();
        }
        if (getRevCommitStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevCommitStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevCommitStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevenueStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevenueStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevenueStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevRecEndDate() != null) {
            _hashCode += getRevRecEndDate().hashCode();
        }
        if (getRevRecOnRevCommitment() != null) {
            _hashCode += getRevRecOnRevCommitment().hashCode();
        }
        if (getRevRecStartDate() != null) {
            _hashCode += getRevRecStartDate().hashCode();
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranIsVsoeBundle() != null) {
            _hashCode += getTranIsVsoeBundle().hashCode();
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeAllocation() != null) {
            _hashCode += getVsoeAllocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountingTransactionSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "AccountingTransactionSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "altSalesAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesNetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "altSalesNetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookSpecificTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "bookSpecificTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catchUpPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "catchUpPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "creditAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customGL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "customGL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "debitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "multiSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "netAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "posting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRevCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "quantityRevCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
