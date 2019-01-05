/**
 * AccountSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2017_1;

public class AccountSearchBasic  extends com.netsuite.webservices.platform.core_2017_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] accountingContext;

    private com.netsuite.webservices.platform.core_2017_1.SearchDoubleField balance;

    private java.lang.String[] cashFlowRateType;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] category1099Misc;

    private com.netsuite.webservices.platform.core_2017_1.SearchStringField description;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] externalId;

    private com.netsuite.webservices.platform.core_2017_1.SearchStringField externalIdString;

    private java.lang.String[] generalRateType;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2017_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2017_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2017_1.SearchStringField legalName;

    private java.lang.String[] locale;

    private com.netsuite.webservices.platform.core_2017_1.SearchStringField localizedLegalName;

    private com.netsuite.webservices.platform.core_2017_1.SearchStringField localizedName;

    private com.netsuite.webservices.platform.core_2017_1.SearchStringField localizedNumber;

    private com.netsuite.webservices.platform.core_2017_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2017_1.SearchStringField number;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] parent;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] subsidiary;

    private java.lang.String[] type;

    private com.netsuite.webservices.platform.core_2017_1.SearchCustomField[] customFieldList;

    public AccountSearchBasic() {
    }

    public AccountSearchBasic(
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] accountingContext,
           com.netsuite.webservices.platform.core_2017_1.SearchDoubleField balance,
           java.lang.String[] cashFlowRateType,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] category1099Misc,
           com.netsuite.webservices.platform.core_2017_1.SearchStringField description,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] externalId,
           com.netsuite.webservices.platform.core_2017_1.SearchStringField externalIdString,
           java.lang.String[] generalRateType,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2017_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2017_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2017_1.SearchStringField legalName,
           java.lang.String[] locale,
           com.netsuite.webservices.platform.core_2017_1.SearchStringField localizedLegalName,
           com.netsuite.webservices.platform.core_2017_1.SearchStringField localizedName,
           com.netsuite.webservices.platform.core_2017_1.SearchStringField localizedNumber,
           com.netsuite.webservices.platform.core_2017_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2017_1.SearchStringField number,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] parent,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] subsidiary,
           java.lang.String[] type,
           com.netsuite.webservices.platform.core_2017_1.SearchCustomField[] customFieldList) {
        this.accountingContext = accountingContext;
        this.balance = balance;
        this.cashFlowRateType = cashFlowRateType;
        this.category1099Misc = category1099Misc;
        this.description = description;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.generalRateType = generalRateType;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.legalName = legalName;
        this.locale = locale;
        this.localizedLegalName = localizedLegalName;
        this.localizedName = localizedName;
        this.localizedNumber = localizedNumber;
        this.name = name;
        this.number = number;
        this.parent = parent;
        this.subsidiary = subsidiary;
        this.type = type;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountingContext value for this AccountSearchBasic.
     * 
     * @return accountingContext
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getAccountingContext() {
        return accountingContext;
    }


    /**
     * Sets the accountingContext value for this AccountSearchBasic.
     * 
     * @param accountingContext
     */
    public void setAccountingContext(com.netsuite.webservices.platform.core_2017_1.RecordRef[] accountingContext) {
        this.accountingContext = accountingContext;
    }


    /**
     * Gets the balance value for this AccountSearchBasic.
     * 
     * @return balance
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchDoubleField getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this AccountSearchBasic.
     * 
     * @param balance
     */
    public void setBalance(com.netsuite.webservices.platform.core_2017_1.SearchDoubleField balance) {
        this.balance = balance;
    }


    /**
     * Gets the cashFlowRateType value for this AccountSearchBasic.
     * 
     * @return cashFlowRateType
     */
    public java.lang.String[] getCashFlowRateType() {
        return cashFlowRateType;
    }


    /**
     * Sets the cashFlowRateType value for this AccountSearchBasic.
     * 
     * @param cashFlowRateType
     */
    public void setCashFlowRateType(java.lang.String[] cashFlowRateType) {
        this.cashFlowRateType = cashFlowRateType;
    }


    /**
     * Gets the category1099Misc value for this AccountSearchBasic.
     * 
     * @return category1099Misc
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getCategory1099Misc() {
        return category1099Misc;
    }


    /**
     * Sets the category1099Misc value for this AccountSearchBasic.
     * 
     * @param category1099Misc
     */
    public void setCategory1099Misc(com.netsuite.webservices.platform.core_2017_1.RecordRef[] category1099Misc) {
        this.category1099Misc = category1099Misc;
    }


    /**
     * Gets the description value for this AccountSearchBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchStringField getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AccountSearchBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2017_1.SearchStringField description) {
        this.description = description;
    }


    /**
     * Gets the externalId value for this AccountSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this AccountSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2017_1.RecordRef[] externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this AccountSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this AccountSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2017_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the generalRateType value for this AccountSearchBasic.
     * 
     * @return generalRateType
     */
    public java.lang.String[] getGeneralRateType() {
        return generalRateType;
    }


    /**
     * Sets the generalRateType value for this AccountSearchBasic.
     * 
     * @param generalRateType
     */
    public void setGeneralRateType(java.lang.String[] generalRateType) {
        this.generalRateType = generalRateType;
    }


    /**
     * Gets the internalId value for this AccountSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AccountSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2017_1.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this AccountSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this AccountSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2017_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this AccountSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this AccountSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2017_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the legalName value for this AccountSearchBasic.
     * 
     * @return legalName
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchStringField getLegalName() {
        return legalName;
    }


    /**
     * Sets the legalName value for this AccountSearchBasic.
     * 
     * @param legalName
     */
    public void setLegalName(com.netsuite.webservices.platform.core_2017_1.SearchStringField legalName) {
        this.legalName = legalName;
    }


    /**
     * Gets the locale value for this AccountSearchBasic.
     * 
     * @return locale
     */
    public java.lang.String[] getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this AccountSearchBasic.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String[] locale) {
        this.locale = locale;
    }


    /**
     * Gets the localizedLegalName value for this AccountSearchBasic.
     * 
     * @return localizedLegalName
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchStringField getLocalizedLegalName() {
        return localizedLegalName;
    }


    /**
     * Sets the localizedLegalName value for this AccountSearchBasic.
     * 
     * @param localizedLegalName
     */
    public void setLocalizedLegalName(com.netsuite.webservices.platform.core_2017_1.SearchStringField localizedLegalName) {
        this.localizedLegalName = localizedLegalName;
    }


    /**
     * Gets the localizedName value for this AccountSearchBasic.
     * 
     * @return localizedName
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchStringField getLocalizedName() {
        return localizedName;
    }


    /**
     * Sets the localizedName value for this AccountSearchBasic.
     * 
     * @param localizedName
     */
    public void setLocalizedName(com.netsuite.webservices.platform.core_2017_1.SearchStringField localizedName) {
        this.localizedName = localizedName;
    }


    /**
     * Gets the localizedNumber value for this AccountSearchBasic.
     * 
     * @return localizedNumber
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchStringField getLocalizedNumber() {
        return localizedNumber;
    }


    /**
     * Sets the localizedNumber value for this AccountSearchBasic.
     * 
     * @param localizedNumber
     */
    public void setLocalizedNumber(com.netsuite.webservices.platform.core_2017_1.SearchStringField localizedNumber) {
        this.localizedNumber = localizedNumber;
    }


    /**
     * Gets the name value for this AccountSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this AccountSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2017_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the number value for this AccountSearchBasic.
     * 
     * @return number
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchStringField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this AccountSearchBasic.
     * 
     * @param number
     */
    public void setNumber(com.netsuite.webservices.platform.core_2017_1.SearchStringField number) {
        this.number = number;
    }


    /**
     * Gets the parent value for this AccountSearchBasic.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this AccountSearchBasic.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2017_1.RecordRef[] parent) {
        this.parent = parent;
    }


    /**
     * Gets the subsidiary value for this AccountSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this AccountSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2017_1.RecordRef[] subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the type value for this AccountSearchBasic.
     * 
     * @return type
     */
    public java.lang.String[] getType() {
        return type;
    }


    /**
     * Sets the type value for this AccountSearchBasic.
     * 
     * @param type
     */
    public void setType(java.lang.String[] type) {
        this.type = type;
    }


    /**
     * Gets the customFieldList value for this AccountSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchCustomField[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this AccountSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2017_1.SearchCustomField[] customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountSearchBasic)) return false;
        AccountSearchBasic other = (AccountSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountingContext==null && other.getAccountingContext()==null) || 
             (this.accountingContext!=null &&
              java.util.Arrays.equals(this.accountingContext, other.getAccountingContext()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.cashFlowRateType==null && other.getCashFlowRateType()==null) || 
             (this.cashFlowRateType!=null &&
              java.util.Arrays.equals(this.cashFlowRateType, other.getCashFlowRateType()))) &&
            ((this.category1099Misc==null && other.getCategory1099Misc()==null) || 
             (this.category1099Misc!=null &&
              java.util.Arrays.equals(this.category1099Misc, other.getCategory1099Misc()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.generalRateType==null && other.getGeneralRateType()==null) || 
             (this.generalRateType!=null &&
              java.util.Arrays.equals(this.generalRateType, other.getGeneralRateType()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.legalName==null && other.getLegalName()==null) || 
             (this.legalName!=null &&
              this.legalName.equals(other.getLegalName()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              java.util.Arrays.equals(this.locale, other.getLocale()))) &&
            ((this.localizedLegalName==null && other.getLocalizedLegalName()==null) || 
             (this.localizedLegalName!=null &&
              this.localizedLegalName.equals(other.getLocalizedLegalName()))) &&
            ((this.localizedName==null && other.getLocalizedName()==null) || 
             (this.localizedName!=null &&
              this.localizedName.equals(other.getLocalizedName()))) &&
            ((this.localizedNumber==null && other.getLocalizedNumber()==null) || 
             (this.localizedNumber!=null &&
              this.localizedNumber.equals(other.getLocalizedNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              java.util.Arrays.equals(this.parent, other.getParent()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
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
        if (getAccountingContext() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingContext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingContext(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getCashFlowRateType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCashFlowRateType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCashFlowRateType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory1099Misc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory1099Misc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory1099Misc(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        if (getGeneralRateType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeneralRateType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeneralRateType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getLegalName() != null) {
            _hashCode += getLegalName().hashCode();
        }
        if (getLocale() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocale());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocale(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalizedLegalName() != null) {
            _hashCode += getLocalizedLegalName().hashCode();
        }
        if (getLocalizedName() != null) {
            _hashCode += getLocalizedName().hashCode();
        }
        if (getLocalizedNumber() != null) {
            _hashCode += getLocalizedNumber().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getParent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParent(), i);
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
        new org.apache.axis.description.TypeDesc(AccountSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "AccountSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "accountingContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashFlowRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "cashFlowRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category1099Misc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "category1099Misc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("generalRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "generalRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedLegalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "localizedLegalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "localizedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "localizedNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "parent"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
