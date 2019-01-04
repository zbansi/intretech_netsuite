/**
 * SalesTaxItemSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2017_1;

public class SalesTaxItemSearch  extends com.netsuite.webservices.platform.core_2017_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2017_1.SalesTaxItemSearchBasic basic;

    private com.netsuite.webservices.platform.common_2017_1.TaxTypeSearchBasic taxTypeJoin;

    private com.netsuite.webservices.platform.common_2017_1.EmployeeSearchBasic userJoin;

    public SalesTaxItemSearch() {
    }

    public SalesTaxItemSearch(
           com.netsuite.webservices.platform.common_2017_1.SalesTaxItemSearchBasic basic,
           com.netsuite.webservices.platform.common_2017_1.TaxTypeSearchBasic taxTypeJoin,
           com.netsuite.webservices.platform.common_2017_1.EmployeeSearchBasic userJoin) {
        this.basic = basic;
        this.taxTypeJoin = taxTypeJoin;
        this.userJoin = userJoin;
    }


    /**
     * Gets the basic value for this SalesTaxItemSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2017_1.SalesTaxItemSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this SalesTaxItemSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2017_1.SalesTaxItemSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the taxTypeJoin value for this SalesTaxItemSearch.
     * 
     * @return taxTypeJoin
     */
    public com.netsuite.webservices.platform.common_2017_1.TaxTypeSearchBasic getTaxTypeJoin() {
        return taxTypeJoin;
    }


    /**
     * Sets the taxTypeJoin value for this SalesTaxItemSearch.
     * 
     * @param taxTypeJoin
     */
    public void setTaxTypeJoin(com.netsuite.webservices.platform.common_2017_1.TaxTypeSearchBasic taxTypeJoin) {
        this.taxTypeJoin = taxTypeJoin;
    }


    /**
     * Gets the userJoin value for this SalesTaxItemSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2017_1.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this SalesTaxItemSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2017_1.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesTaxItemSearch)) return false;
        SalesTaxItemSearch other = (SalesTaxItemSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.taxTypeJoin==null && other.getTaxTypeJoin()==null) || 
             (this.taxTypeJoin!=null &&
              this.taxTypeJoin.equals(other.getTaxTypeJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin())));
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
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getTaxTypeJoin() != null) {
            _hashCode += getTaxTypeJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesTaxItemSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2017_1.lists.webservices.netsuite.com", "SalesTaxItemSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2017_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "SalesTaxItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTypeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2017_1.lists.webservices.netsuite.com", "taxTypeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "TaxTypeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2017_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2017_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
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
