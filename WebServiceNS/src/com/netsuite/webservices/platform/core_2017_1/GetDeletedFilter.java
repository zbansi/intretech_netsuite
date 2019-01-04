/**
 * GetDeletedFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2017_1;

public class GetDeletedFilter  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2017_1.SearchDateField deletedDate;

    private java.lang.String[] type;

    private com.netsuite.webservices.platform.core_2017_1.SearchStringField scriptId;

    public GetDeletedFilter() {
    }

    public GetDeletedFilter(
           com.netsuite.webservices.platform.core_2017_1.SearchDateField deletedDate,
           java.lang.String[] type,
           com.netsuite.webservices.platform.core_2017_1.SearchStringField scriptId) {
           this.deletedDate = deletedDate;
           this.type = type;
           this.scriptId = scriptId;
    }


    /**
     * Gets the deletedDate value for this GetDeletedFilter.
     * 
     * @return deletedDate
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchDateField getDeletedDate() {
        return deletedDate;
    }


    /**
     * Sets the deletedDate value for this GetDeletedFilter.
     * 
     * @param deletedDate
     */
    public void setDeletedDate(com.netsuite.webservices.platform.core_2017_1.SearchDateField deletedDate) {
        this.deletedDate = deletedDate;
    }


    /**
     * Gets the type value for this GetDeletedFilter.
     * 
     * @return type
     */
    public java.lang.String[] getType() {
        return type;
    }


    /**
     * Sets the type value for this GetDeletedFilter.
     * 
     * @param type
     */
    public void setType(java.lang.String[] type) {
        this.type = type;
    }


    /**
     * Gets the scriptId value for this GetDeletedFilter.
     * 
     * @return scriptId
     */
    public com.netsuite.webservices.platform.core_2017_1.SearchStringField getScriptId() {
        return scriptId;
    }


    /**
     * Sets the scriptId value for this GetDeletedFilter.
     * 
     * @param scriptId
     */
    public void setScriptId(com.netsuite.webservices.platform.core_2017_1.SearchStringField scriptId) {
        this.scriptId = scriptId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeletedFilter)) return false;
        GetDeletedFilter other = (GetDeletedFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deletedDate==null && other.getDeletedDate()==null) || 
             (this.deletedDate!=null &&
              this.deletedDate.equals(other.getDeletedDate()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.scriptId==null && other.getScriptId()==null) || 
             (this.scriptId!=null &&
              this.scriptId.equals(other.getScriptId())));
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
        if (getDeletedDate() != null) {
            _hashCode += getDeletedDate().hashCode();
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
        if (getScriptId() != null) {
            _hashCode += getScriptId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDeletedFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "GetDeletedFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "deletedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "scriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2017_1.platform.webservices.netsuite.com", "SearchStringField"));
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
