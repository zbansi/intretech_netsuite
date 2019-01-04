/**
 * ConsolidatedExchangeRateSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2017_1;

public class ConsolidatedExchangeRateSearchBasic  extends com.netsuite.webservices.platform.core_2017_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] accountingBook;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] externalId;

    private com.netsuite.webservices.platform.core_2017_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] fromSubsidiary;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2017_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2017_1.SearchBooleanField isDerivedRate;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] period;

    private com.netsuite.webservices.platform.core_2017_1.SearchDateField periodStartDate;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef[] toSubsidiary;

    public ConsolidatedExchangeRateSearchBasic() {
    }

    public ConsolidatedExchangeRateSearchBasic(
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] accountingBook,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] externalId,
           com.netsuite.webservices.platform.core_2017_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] fromSubsidiary,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2017_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2017_1.SearchBooleanField isDerivedRate,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] period,
           com.netsuite.webservices.platform.core_2017_1.SearchDateField periodStartDate,
           com.netsuite.webservices.platform.core_2017_1.RecordRef[] toSubsidiary) {
        this.accountingBook = accountingBook;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fromSubsidiary = fromSubsidiary;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDerivedRate = isDerivedRate;
        this.period = period;
        this.periodStartDate = periodStartDate;
        this.toSubsidiary = toSubsidiary;
    }


    /**
     * Gets the accountingBook value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2017_1.RecordRef[] accountingBook) {
        this.accountingBook = accountingBook;
    }


    /**
     * Gets the externalId value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2017_1.RecordRef[] externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2017_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the fromSubsidiary value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @return fromSubsidiary
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getFromSubsidiary() {
        return fromSubsidiary;
    }


    /**
     * Sets the fromSubsidiary value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @param fromSubsidiary
     */
    public void setFromSubsidiary(com.netsuite.webservices.platform.core_2017_1.RecordRef[] fromSubsidiary) {
        this.fromSubsidiary = fromSubsidiary;
    }


    /**
     * Gets the internalId value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2017_1.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2017_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isDerivedRate value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @return isDerivedRate
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchBooleanField getIsDerivedRate() {
        return isDerivedRate;
    }


    /**
     * Sets the isDerivedRate value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @param isDerivedRate
     */
    public void setIsDerivedRate(com.netsuite.webservices.platform.core_2017_1.SearchBooleanField isDerivedRate) {
        this.isDerivedRate = isDerivedRate;
    }


    /**
     * Gets the period value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @return period
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @param period
     */
    public void setPeriod(com.netsuite.webservices.platform.core_2017_1.RecordRef[] period) {
        this.period = period;
    }


    /**
     * Gets the periodStartDate value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @return periodStartDate
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchDateField getPeriodStartDate() {
        return periodStartDate;
    }


    /**
     * Sets the periodStartDate value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @param periodStartDate
     */
    public void setPeriodStartDate(com.netsuite.webservices.platform.core_2017_1.SearchDateField periodStartDate) {
        this.periodStartDate = periodStartDate;
    }


    /**
     * Gets the toSubsidiary value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @return toSubsidiary
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef[] getToSubsidiary() {
        return toSubsidiary;
    }


    /**
     * Sets the toSubsidiary value for this ConsolidatedExchangeRateSearchBasic.
     * 
     * @param toSubsidiary
     */
    public void setToSubsidiary(com.netsuite.webservices.platform.core_2017_1.RecordRef[] toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsolidatedExchangeRateSearchBasic)) return false;
        ConsolidatedExchangeRateSearchBasic other = (ConsolidatedExchangeRateSearchBasic) obj;
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
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.fromSubsidiary==null && other.getFromSubsidiary()==null) || 
             (this.fromSubsidiary!=null &&
              java.util.Arrays.equals(this.fromSubsidiary, other.getFromSubsidiary()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isDerivedRate==null && other.getIsDerivedRate()==null) || 
             (this.isDerivedRate!=null &&
              this.isDerivedRate.equals(other.getIsDerivedRate()))) &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              java.util.Arrays.equals(this.period, other.getPeriod()))) &&
            ((this.periodStartDate==null && other.getPeriodStartDate()==null) || 
             (this.periodStartDate!=null &&
              this.periodStartDate.equals(other.getPeriodStartDate()))) &&
            ((this.toSubsidiary==null && other.getToSubsidiary()==null) || 
             (this.toSubsidiary!=null &&
              java.util.Arrays.equals(this.toSubsidiary, other.getToSubsidiary())));
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
        if (getFromSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFromSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFromSubsidiary(), i);
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
        if (getIsDerivedRate() != null) {
            _hashCode += getIsDerivedRate().hashCode();
        }
        if (getPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPeriodStartDate() != null) {
            _hashCode += getPeriodStartDate().hashCode();
        }
        if (getToSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getToSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getToSubsidiary(), i);
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
        new org.apache.axis.description.TypeDesc(ConsolidatedExchangeRateSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "ConsolidatedExchangeRateSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
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
        elemField.setFieldName("fromSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "fromSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("isDerivedRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "isDerivedRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "periodStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
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
