/**
 * ItemAccountingBookDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2017_1;

public class ItemAccountingBookDetail  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2017_1.RecordRef accountingBook;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef revRecSchedule;

    private java.lang.Boolean sameAsPrimaryRevRec;

    private com.netsuite.webservices.platform.core_2017_1.RecordRef amortizationTemplate;

    private java.lang.Boolean sameAsPrimaryAmortization;

    public ItemAccountingBookDetail() {
    }

    public ItemAccountingBookDetail(
           com.netsuite.webservices.platform.core_2017_1.RecordRef accountingBook,
           com.netsuite.webservices.platform.core_2017_1.RecordRef revRecSchedule,
           java.lang.Boolean sameAsPrimaryRevRec,
           com.netsuite.webservices.platform.core_2017_1.RecordRef amortizationTemplate,
           java.lang.Boolean sameAsPrimaryAmortization) {
           this.accountingBook = accountingBook;
           this.revRecSchedule = revRecSchedule;
           this.sameAsPrimaryRevRec = sameAsPrimaryRevRec;
           this.amortizationTemplate = amortizationTemplate;
           this.sameAsPrimaryAmortization = sameAsPrimaryAmortization;
    }


    /**
     * Gets the accountingBook value for this ItemAccountingBookDetail.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this ItemAccountingBookDetail.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2017_1.RecordRef accountingBook) {
        this.accountingBook = accountingBook;
    }


    /**
     * Gets the revRecSchedule value for this ItemAccountingBookDetail.
     * 
     * @return revRecSchedule
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this ItemAccountingBookDetail.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(com.netsuite.webservices.platform.core_2017_1.RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }


    /**
     * Gets the sameAsPrimaryRevRec value for this ItemAccountingBookDetail.
     * 
     * @return sameAsPrimaryRevRec
     */
    public java.lang.Boolean getSameAsPrimaryRevRec() {
        return sameAsPrimaryRevRec;
    }


    /**
     * Sets the sameAsPrimaryRevRec value for this ItemAccountingBookDetail.
     * 
     * @param sameAsPrimaryRevRec
     */
    public void setSameAsPrimaryRevRec(java.lang.Boolean sameAsPrimaryRevRec) {
        this.sameAsPrimaryRevRec = sameAsPrimaryRevRec;
    }


    /**
     * Gets the amortizationTemplate value for this ItemAccountingBookDetail.
     * 
     * @return amortizationTemplate
     */
    public com.netsuite.webservices.platform.core_2017_1.RecordRef getAmortizationTemplate() {
        return amortizationTemplate;
    }


    /**
     * Sets the amortizationTemplate value for this ItemAccountingBookDetail.
     * 
     * @param amortizationTemplate
     */
    public void setAmortizationTemplate(com.netsuite.webservices.platform.core_2017_1.RecordRef amortizationTemplate) {
        this.amortizationTemplate = amortizationTemplate;
    }


    /**
     * Gets the sameAsPrimaryAmortization value for this ItemAccountingBookDetail.
     * 
     * @return sameAsPrimaryAmortization
     */
    public java.lang.Boolean getSameAsPrimaryAmortization() {
        return sameAsPrimaryAmortization;
    }


    /**
     * Sets the sameAsPrimaryAmortization value for this ItemAccountingBookDetail.
     * 
     * @param sameAsPrimaryAmortization
     */
    public void setSameAsPrimaryAmortization(java.lang.Boolean sameAsPrimaryAmortization) {
        this.sameAsPrimaryAmortization = sameAsPrimaryAmortization;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemAccountingBookDetail)) return false;
        ItemAccountingBookDetail other = (ItemAccountingBookDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              this.accountingBook.equals(other.getAccountingBook()))) &&
            ((this.revRecSchedule==null && other.getRevRecSchedule()==null) || 
             (this.revRecSchedule!=null &&
              this.revRecSchedule.equals(other.getRevRecSchedule()))) &&
            ((this.sameAsPrimaryRevRec==null && other.getSameAsPrimaryRevRec()==null) || 
             (this.sameAsPrimaryRevRec!=null &&
              this.sameAsPrimaryRevRec.equals(other.getSameAsPrimaryRevRec()))) &&
            ((this.amortizationTemplate==null && other.getAmortizationTemplate()==null) || 
             (this.amortizationTemplate!=null &&
              this.amortizationTemplate.equals(other.getAmortizationTemplate()))) &&
            ((this.sameAsPrimaryAmortization==null && other.getSameAsPrimaryAmortization()==null) || 
             (this.sameAsPrimaryAmortization!=null &&
              this.sameAsPrimaryAmortization.equals(other.getSameAsPrimaryAmortization())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountingBook() != null) {
            _hashCode += getAccountingBook().hashCode();
        }
        if (getRevRecSchedule() != null) {
            _hashCode += getRevRecSchedule().hashCode();
        }
        if (getSameAsPrimaryRevRec() != null) {
            _hashCode += getSameAsPrimaryRevRec().hashCode();
        }
        if (getAmortizationTemplate() != null) {
            _hashCode += getAmortizationTemplate().hashCode();
        }
        if (getSameAsPrimaryAmortization() != null) {
            _hashCode += getSameAsPrimaryAmortization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemAccountingBookDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2017_1.lists.webservices.netsuite.com", "ItemAccountingBookDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2017_1.lists.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2017_1.lists.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameAsPrimaryRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2017_1.lists.webservices.netsuite.com", "sameAsPrimaryRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizationTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2017_1.lists.webservices.netsuite.com", "amortizationTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameAsPrimaryAmortization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2017_1.lists.webservices.netsuite.com", "sameAsPrimaryAmortization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
