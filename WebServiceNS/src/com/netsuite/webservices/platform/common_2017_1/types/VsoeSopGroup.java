/**
 * VsoeSopGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2017_1.types;

public class VsoeSopGroup implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VsoeSopGroup(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __exclude = "_exclude";
    public static final java.lang.String __normal = "_normal";
    public static final java.lang.String __software = "_software";
    public static final VsoeSopGroup _exclude = new VsoeSopGroup(__exclude);
    public static final VsoeSopGroup _normal = new VsoeSopGroup(__normal);
    public static final VsoeSopGroup _software = new VsoeSopGroup(__software);
    public java.lang.String getValue() { return _value_;}
    public static VsoeSopGroup fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VsoeSopGroup enumeration = (VsoeSopGroup)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VsoeSopGroup fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VsoeSopGroup.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.common_2017_1.platform.webservices.netsuite.com", "VsoeSopGroup"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
