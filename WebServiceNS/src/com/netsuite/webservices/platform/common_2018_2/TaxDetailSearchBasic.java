/**
 * TaxDetailSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2018_2;

public class TaxDetailSearchBasic  extends com.netsuite.webservices.platform.core_2018_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] account;

    private com.netsuite.webservices.platform.core_2018_2.SearchLongField lineNumber;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField taxAmount;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField taxBasis;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] taxCode;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField taxRate;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] taxType;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] tranId;

    public TaxDetailSearchBasic() {
    }

    public TaxDetailSearchBasic(
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] account,
           com.netsuite.webservices.platform.core_2018_2.SearchLongField lineNumber,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField taxAmount,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField taxBasis,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] taxCode,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField taxRate,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] taxType,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] tranId) {
        this.account = account;
        this.lineNumber = lineNumber;
        this.taxAmount = taxAmount;
        this.taxBasis = taxBasis;
        this.taxCode = taxCode;
        this.taxRate = taxRate;
        this.taxType = taxType;
        this.tranId = tranId;
    }


    /**
     * Gets the account value for this TaxDetailSearchBasic.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this TaxDetailSearchBasic.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2018_2.RecordRef[] account) {
        this.account = account;
    }


    /**
     * Gets the lineNumber value for this TaxDetailSearchBasic.
     * 
     * @return lineNumber
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchLongField getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this TaxDetailSearchBasic.
     * 
     * @param lineNumber
     */
    public void setLineNumber(com.netsuite.webservices.platform.core_2018_2.SearchLongField lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the taxAmount value for this TaxDetailSearchBasic.
     * 
     * @return taxAmount
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TaxDetailSearchBasic.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxBasis value for this TaxDetailSearchBasic.
     * 
     * @return taxBasis
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getTaxBasis() {
        return taxBasis;
    }


    /**
     * Sets the taxBasis value for this TaxDetailSearchBasic.
     * 
     * @param taxBasis
     */
    public void setTaxBasis(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField taxBasis) {
        this.taxBasis = taxBasis;
    }


    /**
     * Gets the taxCode value for this TaxDetailSearchBasic.
     * 
     * @return taxCode
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this TaxDetailSearchBasic.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.netsuite.webservices.platform.core_2018_2.RecordRef[] taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxRate value for this TaxDetailSearchBasic.
     * 
     * @return taxRate
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this TaxDetailSearchBasic.
     * 
     * @param taxRate
     */
    public void setTaxRate(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the taxType value for this TaxDetailSearchBasic.
     * 
     * @return taxType
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this TaxDetailSearchBasic.
     * 
     * @param taxType
     */
    public void setTaxType(com.netsuite.webservices.platform.core_2018_2.RecordRef[] taxType) {
        this.taxType = taxType;
    }


    /**
     * Gets the tranId value for this TaxDetailSearchBasic.
     * 
     * @return tranId
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this TaxDetailSearchBasic.
     * 
     * @param tranId
     */
    public void setTranId(com.netsuite.webservices.platform.core_2018_2.RecordRef[] tranId) {
        this.tranId = tranId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxDetailSearchBasic)) return false;
        TaxDetailSearchBasic other = (TaxDetailSearchBasic) obj;
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
            ((this.lineNumber==null && other.getLineNumber()==null) || 
             (this.lineNumber!=null &&
              this.lineNumber.equals(other.getLineNumber()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.taxBasis==null && other.getTaxBasis()==null) || 
             (this.taxBasis!=null &&
              this.taxBasis.equals(other.getTaxBasis()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              java.util.Arrays.equals(this.taxCode, other.getTaxCode()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              java.util.Arrays.equals(this.taxType, other.getTaxType()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              java.util.Arrays.equals(this.tranId, other.getTranId())));
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
        if (getLineNumber() != null) {
            _hashCode += getLineNumber().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTaxBasis() != null) {
            _hashCode += getTaxBasis().hashCode();
        }
        if (getTaxCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getTaxType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranId(), i);
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
        new org.apache.axis.description.TypeDesc(TaxDetailSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "TaxDetailSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "lineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxBasis");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "taxBasis"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "tranId"));
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
