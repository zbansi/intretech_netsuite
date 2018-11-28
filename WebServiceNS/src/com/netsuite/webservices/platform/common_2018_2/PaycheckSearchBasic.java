/**
 * PaycheckSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2018_2;

public class PaycheckSearchBasic  extends com.netsuite.webservices.platform.core_2018_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] account;

    private com.netsuite.webservices.platform.core_2018_2.SearchLongField batchNumber;

    private com.netsuite.webservices.platform.core_2018_2.SearchDateField checkDate;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] employee;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] externalId;

    private com.netsuite.webservices.platform.core_2018_2.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2018_2.SearchBooleanField hasGLImpact;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2018_2.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] payrollItem;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] payrollItemType;

    public PaycheckSearchBasic() {
    }

    public PaycheckSearchBasic(
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] account,
           com.netsuite.webservices.platform.core_2018_2.SearchLongField batchNumber,
           com.netsuite.webservices.platform.core_2018_2.SearchDateField checkDate,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] employee,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] externalId,
           com.netsuite.webservices.platform.core_2018_2.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2018_2.SearchBooleanField hasGLImpact,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2018_2.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] payrollItem,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] payrollItemType) {
        this.account = account;
        this.batchNumber = batchNumber;
        this.checkDate = checkDate;
        this.employee = employee;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.hasGLImpact = hasGLImpact;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.payrollItem = payrollItem;
        this.payrollItemType = payrollItemType;
    }


    /**
     * Gets the account value for this PaycheckSearchBasic.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this PaycheckSearchBasic.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2018_2.RecordRef[] account) {
        this.account = account;
    }


    /**
     * Gets the batchNumber value for this PaycheckSearchBasic.
     * 
     * @return batchNumber
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchLongField getBatchNumber() {
        return batchNumber;
    }


    /**
     * Sets the batchNumber value for this PaycheckSearchBasic.
     * 
     * @param batchNumber
     */
    public void setBatchNumber(com.netsuite.webservices.platform.core_2018_2.SearchLongField batchNumber) {
        this.batchNumber = batchNumber;
    }


    /**
     * Gets the checkDate value for this PaycheckSearchBasic.
     * 
     * @return checkDate
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDateField getCheckDate() {
        return checkDate;
    }


    /**
     * Sets the checkDate value for this PaycheckSearchBasic.
     * 
     * @param checkDate
     */
    public void setCheckDate(com.netsuite.webservices.platform.core_2018_2.SearchDateField checkDate) {
        this.checkDate = checkDate;
    }


    /**
     * Gets the employee value for this PaycheckSearchBasic.
     * 
     * @return employee
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this PaycheckSearchBasic.
     * 
     * @param employee
     */
    public void setEmployee(com.netsuite.webservices.platform.core_2018_2.RecordRef[] employee) {
        this.employee = employee;
    }


    /**
     * Gets the externalId value for this PaycheckSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PaycheckSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2018_2.RecordRef[] externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this PaycheckSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this PaycheckSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2018_2.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the hasGLImpact value for this PaycheckSearchBasic.
     * 
     * @return hasGLImpact
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchBooleanField getHasGLImpact() {
        return hasGLImpact;
    }


    /**
     * Sets the hasGLImpact value for this PaycheckSearchBasic.
     * 
     * @param hasGLImpact
     */
    public void setHasGLImpact(com.netsuite.webservices.platform.core_2018_2.SearchBooleanField hasGLImpact) {
        this.hasGLImpact = hasGLImpact;
    }


    /**
     * Gets the internalId value for this PaycheckSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PaycheckSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2018_2.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this PaycheckSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this PaycheckSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2018_2.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the payrollItem value for this PaycheckSearchBasic.
     * 
     * @return payrollItem
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getPayrollItem() {
        return payrollItem;
    }


    /**
     * Sets the payrollItem value for this PaycheckSearchBasic.
     * 
     * @param payrollItem
     */
    public void setPayrollItem(com.netsuite.webservices.platform.core_2018_2.RecordRef[] payrollItem) {
        this.payrollItem = payrollItem;
    }


    /**
     * Gets the payrollItemType value for this PaycheckSearchBasic.
     * 
     * @return payrollItemType
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getPayrollItemType() {
        return payrollItemType;
    }


    /**
     * Sets the payrollItemType value for this PaycheckSearchBasic.
     * 
     * @param payrollItemType
     */
    public void setPayrollItemType(com.netsuite.webservices.platform.core_2018_2.RecordRef[] payrollItemType) {
        this.payrollItemType = payrollItemType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckSearchBasic)) return false;
        PaycheckSearchBasic other = (PaycheckSearchBasic) obj;
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
            ((this.batchNumber==null && other.getBatchNumber()==null) || 
             (this.batchNumber!=null &&
              this.batchNumber.equals(other.getBatchNumber()))) &&
            ((this.checkDate==null && other.getCheckDate()==null) || 
             (this.checkDate!=null &&
              this.checkDate.equals(other.getCheckDate()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              java.util.Arrays.equals(this.employee, other.getEmployee()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.hasGLImpact==null && other.getHasGLImpact()==null) || 
             (this.hasGLImpact!=null &&
              this.hasGLImpact.equals(other.getHasGLImpact()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.payrollItem==null && other.getPayrollItem()==null) || 
             (this.payrollItem!=null &&
              java.util.Arrays.equals(this.payrollItem, other.getPayrollItem()))) &&
            ((this.payrollItemType==null && other.getPayrollItemType()==null) || 
             (this.payrollItemType!=null &&
              java.util.Arrays.equals(this.payrollItemType, other.getPayrollItemType())));
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
        if (getBatchNumber() != null) {
            _hashCode += getBatchNumber().hashCode();
        }
        if (getCheckDate() != null) {
            _hashCode += getCheckDate().hashCode();
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
        if (getHasGLImpact() != null) {
            _hashCode += getHasGLImpact().hashCode();
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
        if (getPayrollItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayrollItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayrollItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayrollItemType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayrollItemType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayrollItemType(), i);
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
        new org.apache.axis.description.TypeDesc(PaycheckSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "PaycheckSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "batchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "checkDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasGLImpact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "hasGLImpact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "payrollItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
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
