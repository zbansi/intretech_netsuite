/**
 * CustomizationFilterCompareType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2017_1.types;

public class CustomizationFilterCompareType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomizationFilterCompareType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __equal = "_equal";
    public static final java.lang.String __greaterThan = "_greaterThan";
    public static final java.lang.String __greaterThanOrEqual = "_greaterThanOrEqual";
    public static final java.lang.String __lessThan = "_lessThan";
    public static final java.lang.String __lessThanOrEqual = "_lessThanOrEqual";
    public static final java.lang.String __notEqual = "_notEqual";
    public static final CustomizationFilterCompareType _equal = new CustomizationFilterCompareType(__equal);
    public static final CustomizationFilterCompareType _greaterThan = new CustomizationFilterCompareType(__greaterThan);
    public static final CustomizationFilterCompareType _greaterThanOrEqual = new CustomizationFilterCompareType(__greaterThanOrEqual);
    public static final CustomizationFilterCompareType _lessThan = new CustomizationFilterCompareType(__lessThan);
    public static final CustomizationFilterCompareType _lessThanOrEqual = new CustomizationFilterCompareType(__lessThanOrEqual);
    public static final CustomizationFilterCompareType _notEqual = new CustomizationFilterCompareType(__notEqual);
    public java.lang.String getValue() { return _value_;}
    public static CustomizationFilterCompareType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomizationFilterCompareType enumeration = (CustomizationFilterCompareType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomizationFilterCompareType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomizationFilterCompareType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2017_1.setup.webservices.netsuite.com", "CustomizationFilterCompareType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
