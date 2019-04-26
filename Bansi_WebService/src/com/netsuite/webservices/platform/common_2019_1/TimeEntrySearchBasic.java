/**
 * TimeEntrySearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TimeEntrySearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] approvalStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField billable;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] billingClass;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField billingStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] customer;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField date;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] department;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField duration;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] employee;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField exempt;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isCharged;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModified;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField memo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] nextApprover;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paidByPayroll;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paidExternally;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] payItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField productive;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] subsidiary;

    private java.lang.String[] type;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField utilized;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomField[] customFieldList;

    public TimeEntrySearchBasic() {
    }

    public TimeEntrySearchBasic(
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] approvalStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField billable,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] billingClass,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField billingStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] customer,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField date,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] department,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField duration,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] employee,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField exempt,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isCharged,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModified,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] location,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField memo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] nextApprover,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paidByPayroll,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paidExternally,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] payItem,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField productive,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] subsidiary,
           java.lang.String[] type,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField utilized,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomField[] customFieldList) {
        this.approvalStatus = approvalStatus;
        this.billable = billable;
        this.billingClass = billingClass;
        this.billingStatus = billingStatus;
        this._class = _class;
        this.customer = customer;
        this.date = date;
        this.dateCreated = dateCreated;
        this.department = department;
        this.duration = duration;
        this.employee = employee;
        this.exempt = exempt;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isCharged = isCharged;
        this.item = item;
        this.lastModified = lastModified;
        this.location = location;
        this.memo = memo;
        this.nextApprover = nextApprover;
        this.paidByPayroll = paidByPayroll;
        this.paidExternally = paidExternally;
        this.payItem = payItem;
        this.productive = productive;
        this.subsidiary = subsidiary;
        this.type = type;
        this.utilized = utilized;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the approvalStatus value for this TimeEntrySearchBasic.
     * 
     * @return approvalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this TimeEntrySearchBasic.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(com.netsuite.webservices.platform.core_2019_1.RecordRef[] approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the billable value for this TimeEntrySearchBasic.
     * 
     * @return billable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getBillable() {
        return billable;
    }


    /**
     * Sets the billable value for this TimeEntrySearchBasic.
     * 
     * @param billable
     */
    public void setBillable(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField billable) {
        this.billable = billable;
    }


    /**
     * Gets the billingClass value for this TimeEntrySearchBasic.
     * 
     * @return billingClass
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getBillingClass() {
        return billingClass;
    }


    /**
     * Sets the billingClass value for this TimeEntrySearchBasic.
     * 
     * @param billingClass
     */
    public void setBillingClass(com.netsuite.webservices.platform.core_2019_1.RecordRef[] billingClass) {
        this.billingClass = billingClass;
    }


    /**
     * Gets the billingStatus value for this TimeEntrySearchBasic.
     * 
     * @return billingStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getBillingStatus() {
        return billingStatus;
    }


    /**
     * Sets the billingStatus value for this TimeEntrySearchBasic.
     * 
     * @param billingStatus
     */
    public void setBillingStatus(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField billingStatus) {
        this.billingStatus = billingStatus;
    }


    /**
     * Gets the _class value for this TimeEntrySearchBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TimeEntrySearchBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef[] _class) {
        this._class = _class;
    }


    /**
     * Gets the customer value for this TimeEntrySearchBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this TimeEntrySearchBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.RecordRef[] customer) {
        this.customer = customer;
    }


    /**
     * Gets the date value for this TimeEntrySearchBasic.
     * 
     * @return date
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDate() {
        return date;
    }


    /**
     * Sets the date value for this TimeEntrySearchBasic.
     * 
     * @param date
     */
    public void setDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField date) {
        this.date = date;
    }


    /**
     * Gets the dateCreated value for this TimeEntrySearchBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this TimeEntrySearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the department value for this TimeEntrySearchBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TimeEntrySearchBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef[] department) {
        this.department = department;
    }


    /**
     * Gets the duration value for this TimeEntrySearchBasic.
     * 
     * @return duration
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this TimeEntrySearchBasic.
     * 
     * @param duration
     */
    public void setDuration(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField duration) {
        this.duration = duration;
    }


    /**
     * Gets the employee value for this TimeEntrySearchBasic.
     * 
     * @return employee
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this TimeEntrySearchBasic.
     * 
     * @param employee
     */
    public void setEmployee(com.netsuite.webservices.platform.core_2019_1.RecordRef[] employee) {
        this.employee = employee;
    }


    /**
     * Gets the exempt value for this TimeEntrySearchBasic.
     * 
     * @return exempt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getExempt() {
        return exempt;
    }


    /**
     * Sets the exempt value for this TimeEntrySearchBasic.
     * 
     * @param exempt
     */
    public void setExempt(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField exempt) {
        this.exempt = exempt;
    }


    /**
     * Gets the externalId value for this TimeEntrySearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TimeEntrySearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.RecordRef[] externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this TimeEntrySearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this TimeEntrySearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this TimeEntrySearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TimeEntrySearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this TimeEntrySearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this TimeEntrySearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isCharged value for this TimeEntrySearchBasic.
     * 
     * @return isCharged
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsCharged() {
        return isCharged;
    }


    /**
     * Sets the isCharged value for this TimeEntrySearchBasic.
     * 
     * @param isCharged
     */
    public void setIsCharged(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isCharged) {
        this.isCharged = isCharged;
    }


    /**
     * Gets the item value for this TimeEntrySearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this TimeEntrySearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef[] item) {
        this.item = item;
    }


    /**
     * Gets the lastModified value for this TimeEntrySearchBasic.
     * 
     * @return lastModified
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this TimeEntrySearchBasic.
     * 
     * @param lastModified
     */
    public void setLastModified(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModified) {
        this.lastModified = lastModified;
    }


    /**
     * Gets the location value for this TimeEntrySearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TimeEntrySearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef[] location) {
        this.location = location;
    }


    /**
     * Gets the memo value for this TimeEntrySearchBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this TimeEntrySearchBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the nextApprover value for this TimeEntrySearchBasic.
     * 
     * @return nextApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getNextApprover() {
        return nextApprover;
    }


    /**
     * Sets the nextApprover value for this TimeEntrySearchBasic.
     * 
     * @param nextApprover
     */
    public void setNextApprover(com.netsuite.webservices.platform.core_2019_1.RecordRef[] nextApprover) {
        this.nextApprover = nextApprover;
    }


    /**
     * Gets the paidByPayroll value for this TimeEntrySearchBasic.
     * 
     * @return paidByPayroll
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPaidByPayroll() {
        return paidByPayroll;
    }


    /**
     * Sets the paidByPayroll value for this TimeEntrySearchBasic.
     * 
     * @param paidByPayroll
     */
    public void setPaidByPayroll(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paidByPayroll) {
        this.paidByPayroll = paidByPayroll;
    }


    /**
     * Gets the paidExternally value for this TimeEntrySearchBasic.
     * 
     * @return paidExternally
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPaidExternally() {
        return paidExternally;
    }


    /**
     * Sets the paidExternally value for this TimeEntrySearchBasic.
     * 
     * @param paidExternally
     */
    public void setPaidExternally(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paidExternally) {
        this.paidExternally = paidExternally;
    }


    /**
     * Gets the payItem value for this TimeEntrySearchBasic.
     * 
     * @return payItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getPayItem() {
        return payItem;
    }


    /**
     * Sets the payItem value for this TimeEntrySearchBasic.
     * 
     * @param payItem
     */
    public void setPayItem(com.netsuite.webservices.platform.core_2019_1.RecordRef[] payItem) {
        this.payItem = payItem;
    }


    /**
     * Gets the productive value for this TimeEntrySearchBasic.
     * 
     * @return productive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getProductive() {
        return productive;
    }


    /**
     * Sets the productive value for this TimeEntrySearchBasic.
     * 
     * @param productive
     */
    public void setProductive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField productive) {
        this.productive = productive;
    }


    /**
     * Gets the subsidiary value for this TimeEntrySearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TimeEntrySearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef[] subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the type value for this TimeEntrySearchBasic.
     * 
     * @return type
     */
    public java.lang.String[] getType() {
        return type;
    }


    /**
     * Sets the type value for this TimeEntrySearchBasic.
     * 
     * @param type
     */
    public void setType(java.lang.String[] type) {
        this.type = type;
    }


    /**
     * Gets the utilized value for this TimeEntrySearchBasic.
     * 
     * @return utilized
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getUtilized() {
        return utilized;
    }


    /**
     * Sets the utilized value for this TimeEntrySearchBasic.
     * 
     * @param utilized
     */
    public void setUtilized(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField utilized) {
        this.utilized = utilized;
    }


    /**
     * Gets the customFieldList value for this TimeEntrySearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomField[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TimeEntrySearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomField[] customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeEntrySearchBasic)) return false;
        TimeEntrySearchBasic other = (TimeEntrySearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              java.util.Arrays.equals(this.approvalStatus, other.getApprovalStatus()))) &&
            ((this.billable==null && other.getBillable()==null) || 
             (this.billable!=null &&
              this.billable.equals(other.getBillable()))) &&
            ((this.billingClass==null && other.getBillingClass()==null) || 
             (this.billingClass!=null &&
              java.util.Arrays.equals(this.billingClass, other.getBillingClass()))) &&
            ((this.billingStatus==null && other.getBillingStatus()==null) || 
             (this.billingStatus!=null &&
              this.billingStatus.equals(other.getBillingStatus()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              java.util.Arrays.equals(this.customer, other.getCustomer()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              java.util.Arrays.equals(this.employee, other.getEmployee()))) &&
            ((this.exempt==null && other.getExempt()==null) || 
             (this.exempt!=null &&
              this.exempt.equals(other.getExempt()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isCharged==null && other.getIsCharged()==null) || 
             (this.isCharged!=null &&
              this.isCharged.equals(other.getIsCharged()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.lastModified==null && other.getLastModified()==null) || 
             (this.lastModified!=null &&
              this.lastModified.equals(other.getLastModified()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.nextApprover==null && other.getNextApprover()==null) || 
             (this.nextApprover!=null &&
              java.util.Arrays.equals(this.nextApprover, other.getNextApprover()))) &&
            ((this.paidByPayroll==null && other.getPaidByPayroll()==null) || 
             (this.paidByPayroll!=null &&
              this.paidByPayroll.equals(other.getPaidByPayroll()))) &&
            ((this.paidExternally==null && other.getPaidExternally()==null) || 
             (this.paidExternally!=null &&
              this.paidExternally.equals(other.getPaidExternally()))) &&
            ((this.payItem==null && other.getPayItem()==null) || 
             (this.payItem!=null &&
              java.util.Arrays.equals(this.payItem, other.getPayItem()))) &&
            ((this.productive==null && other.getProductive()==null) || 
             (this.productive!=null &&
              this.productive.equals(other.getProductive()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.utilized==null && other.getUtilized()==null) || 
             (this.utilized!=null &&
              this.utilized.equals(other.getUtilized()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              java.util.Arrays.equals(this.customFieldList, other.getCustomFieldList())));
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
        if (getApprovalStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovalStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovalStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillable() != null) {
            _hashCode += getBillable().hashCode();
        }
        if (getBillingClass() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingClass());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingClass(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillingStatus() != null) {
            _hashCode += getBillingStatus().hashCode();
        }
        if (get_class() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_class());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_class(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDepartment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getEmployee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExempt() != null) {
            _hashCode += getExempt().hashCode();
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
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
        if (getIsCharged() != null) {
            _hashCode += getIsCharged().hashCode();
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModified() != null) {
            _hashCode += getLastModified().hashCode();
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getNextApprover() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextApprover());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextApprover(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaidByPayroll() != null) {
            _hashCode += getPaidByPayroll().hashCode();
        }
        if (getPaidExternally() != null) {
            _hashCode += getPaidExternally().hashCode();
        }
        if (getPayItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductive() != null) {
            _hashCode += getProductive().hashCode();
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
        if (getUtilized() != null) {
            _hashCode += getUtilized().hashCode();
        }
        if (getCustomFieldList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeEntrySearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeEntrySearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exempt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "exempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCharged");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isCharged"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidByPayroll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paidByPayroll"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidExternally");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paidExternally"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "productive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "utilized"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchCustomField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "customField"));
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
