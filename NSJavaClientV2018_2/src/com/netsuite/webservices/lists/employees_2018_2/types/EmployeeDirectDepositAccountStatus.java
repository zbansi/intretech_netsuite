/**
 * EmployeeDirectDepositAccountStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2018_2.types;

public class EmployeeDirectDepositAccountStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EmployeeDirectDepositAccountStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __active = "_active";
    public static final java.lang.String __pending = "_pending";
    public static final java.lang.String __verifying = "_verifying";
    public static final java.lang.String __failed = "_failed";
    public static final java.lang.String __inactive = "_inactive";
    public static final EmployeeDirectDepositAccountStatus _active = new EmployeeDirectDepositAccountStatus(__active);
    public static final EmployeeDirectDepositAccountStatus _pending = new EmployeeDirectDepositAccountStatus(__pending);
    public static final EmployeeDirectDepositAccountStatus _verifying = new EmployeeDirectDepositAccountStatus(__verifying);
    public static final EmployeeDirectDepositAccountStatus _failed = new EmployeeDirectDepositAccountStatus(__failed);
    public static final EmployeeDirectDepositAccountStatus _inactive = new EmployeeDirectDepositAccountStatus(__inactive);
    public java.lang.String getValue() { return _value_;}
    public static EmployeeDirectDepositAccountStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EmployeeDirectDepositAccountStatus enumeration = (EmployeeDirectDepositAccountStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EmployeeDirectDepositAccountStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeDirectDepositAccountStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2018_2.lists.webservices.netsuite.com", "EmployeeDirectDepositAccountStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}