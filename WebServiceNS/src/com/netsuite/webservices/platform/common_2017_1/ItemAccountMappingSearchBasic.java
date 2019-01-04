/**
 * ItemAccountMappingSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2017_1;

public class ItemAccountMappingSearchBasic  extends com.netsuite.webservices.platform.core_2017_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] accountingBook;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] _class;

    private com.netsuite.webservices.platform.core_2017_1.SearchMultiSelectCustomField customDimension;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] department;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] destinationAccount;

    private com.netsuite.webservices.platform.core_2017_1.SearchDateField effectiveDate;

    private com.netsuite.webservices.platform.core_2017_1.SearchDateField endDate;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] externalId;

    private com.netsuite.webservices.platform.core_2017_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2017_1.SearchLongField internalIdNumber;

    private java.lang.String[] itemAccount;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] location;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] sourceAccount;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] subsidiary;

    private com.netsuite.webservices.platform.core_2017_1.SearchCustomField[] customFieldList;

    public ItemAccountMappingSearchBasic() {
    }

    public ItemAccountMappingSearchBasic(
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] accountingBook,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] _class,
           com.netsuite.webservices.platform.core_2017_1.SearchMultiSelectCustomField customDimension,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] department,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] destinationAccount,
           com.netsuite.webservices.platform.core_2017_1.SearchDateField effectiveDate,
           com.netsuite.webservices.platform.core_2017_1.SearchDateField endDate,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] externalId,
           com.netsuite.webservices.platform.core_2017_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2017_1.SearchLongField internalIdNumber,
           java.lang.String[] itemAccount,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] location,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] sourceAccount,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] subsidiary,
           com.netsuite.webservices.platform.core_2017_1.SearchCustomField[] customFieldList) {
        this.accountingBook = accountingBook;
        this._class = _class;
        this.customDimension = customDimension;
        this.department = department;
        this.destinationAccount = destinationAccount;
        this.effectiveDate = effectiveDate;
        this.endDate = endDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.itemAccount = itemAccount;
        this.location = location;
        this.sourceAccount = sourceAccount;
        this.subsidiary = subsidiary;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountingBook value for this ItemAccountMappingSearchBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this ItemAccountMappingSearchBasic.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2017_1.RecordRef[] accountingBook) {
        this.accountingBook = accountingBook;
    }


    /**
     * Gets the _class value for this ItemAccountMappingSearchBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this ItemAccountMappingSearchBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2017_1.RecordRef[] _class) {
        this._class = _class;
    }


    /**
     * Gets the customDimension value for this ItemAccountMappingSearchBasic.
     * 
     * @return customDimension
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchMultiSelectCustomField getCustomDimension() {
        return customDimension;
    }


    /**
     * Sets the customDimension value for this ItemAccountMappingSearchBasic.
     * 
     * @param customDimension
     */
    public void setCustomDimension(com.netsuite.webservices.platform.core_2017_1.SearchMultiSelectCustomField customDimension) {
        this.customDimension = customDimension;
    }


    /**
     * Gets the department value for this ItemAccountMappingSearchBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ItemAccountMappingSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2017_1.RecordRef[] department) {
        this.department = department;
    }


    /**
     * Gets the destinationAccount value for this ItemAccountMappingSearchBasic.
     * 
     * @return destinationAccount
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getDestinationAccount() {
        return destinationAccount;
    }


    /**
     * Sets the destinationAccount value for this ItemAccountMappingSearchBasic.
     * 
     * @param destinationAccount
     */
    public void setDestinationAccount(com.netsuite.webservices.platform.core_2017_1.RecordRef[] destinationAccount) {
        this.destinationAccount = destinationAccount;
    }


    /**
     * Gets the effectiveDate value for this ItemAccountMappingSearchBasic.
     * 
     * @return effectiveDate
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchDateField getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ItemAccountMappingSearchBasic.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(com.netsuite.webservices.platform.core_2017_1.SearchDateField effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the endDate value for this ItemAccountMappingSearchBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ItemAccountMappingSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2017_1.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the externalId value for this ItemAccountMappingSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ItemAccountMappingSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2017_1.RecordRef[] externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this ItemAccountMappingSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this ItemAccountMappingSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2017_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this ItemAccountMappingSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ItemAccountMappingSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2017_1.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this ItemAccountMappingSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this ItemAccountMappingSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2017_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the itemAccount value for this ItemAccountMappingSearchBasic.
     * 
     * @return itemAccount
     */
    public java.lang.String[] getItemAccount() {
        return itemAccount;
    }


    /**
     * Sets the itemAccount value for this ItemAccountMappingSearchBasic.
     * 
     * @param itemAccount
     */
    public void setItemAccount(java.lang.String[] itemAccount) {
        this.itemAccount = itemAccount;
    }


    /**
     * Gets the location value for this ItemAccountMappingSearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ItemAccountMappingSearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2017_1.RecordRef[] location) {
        this.location = location;
    }


    /**
     * Gets the sourceAccount value for this ItemAccountMappingSearchBasic.
     * 
     * @return sourceAccount
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getSourceAccount() {
        return sourceAccount;
    }


    /**
     * Sets the sourceAccount value for this ItemAccountMappingSearchBasic.
     * 
     * @param sourceAccount
     */
    public void setSourceAccount(com.netsuite.webservices.platform.core_2017_1.RecordRef[] sourceAccount) {
        this.sourceAccount = sourceAccount;
    }


    /**
     * Gets the subsidiary value for this ItemAccountMappingSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this ItemAccountMappingSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2017_1.RecordRef[] subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the customFieldList value for this ItemAccountMappingSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchCustomField[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ItemAccountMappingSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2017_1.SearchCustomField[] customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemAccountMappingSearchBasic)) return false;
        ItemAccountMappingSearchBasic other = (ItemAccountMappingSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              java.util.Arrays.equals(this.accountingBook, other.getAccountingBook()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.customDimension==null && other.getCustomDimension()==null) || 
             (this.customDimension!=null &&
              this.customDimension.equals(other.getCustomDimension()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.destinationAccount==null && other.getDestinationAccount()==null) || 
             (this.destinationAccount!=null &&
              java.util.Arrays.equals(this.destinationAccount, other.getDestinationAccount()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
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
            ((this.itemAccount==null && other.getItemAccount()==null) || 
             (this.itemAccount!=null &&
              java.util.Arrays.equals(this.itemAccount, other.getItemAccount()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.sourceAccount==null && other.getSourceAccount()==null) || 
             (this.sourceAccount!=null &&
              java.util.Arrays.equals(this.sourceAccount, other.getSourceAccount()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
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
        if (getCustomDimension() != null) {
            _hashCode += getCustomDimension().hashCode();
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
        if (getDestinationAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestinationAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinationAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
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
        if (getItemAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getSourceAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSourceAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSourceAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(ItemAccountMappingSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "ItemAccountMappingSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDimension");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "customDimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchMultiSelectCustomField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "destinationAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "itemAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "sourceAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchCustomField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "customField"));
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
