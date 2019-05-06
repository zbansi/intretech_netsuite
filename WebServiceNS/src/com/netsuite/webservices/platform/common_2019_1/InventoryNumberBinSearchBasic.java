/**
 * InventoryNumberBinSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class InventoryNumberBinSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] binNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField inventoryNumber;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityOnHand;

    public InventoryNumberBinSearchBasic() {
    }

    public InventoryNumberBinSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] binNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField inventoryNumber,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] location,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityAvailable,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityOnHand) {
        this.binNumber = binNumber;
        this.inventoryNumber = inventoryNumber;
        this.location = location;
        this.quantityAvailable = quantityAvailable;
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the binNumber value for this InventoryNumberBinSearchBasic.
     * 
     * @return binNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this InventoryNumberBinSearchBasic.
     * 
     * @param binNumber
     */
    public void setBinNumber(com.netsuite.webservices.platform.core_2019_1.RecordRef[] binNumber) {
        this.binNumber = binNumber;
    }


    /**
     * Gets the inventoryNumber value for this InventoryNumberBinSearchBasic.
     * 
     * @return inventoryNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getInventoryNumber() {
        return inventoryNumber;
    }


    /**
     * Sets the inventoryNumber value for this InventoryNumberBinSearchBasic.
     * 
     * @param inventoryNumber
     */
    public void setInventoryNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }


    /**
     * Gets the location value for this InventoryNumberBinSearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this InventoryNumberBinSearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef[] location) {
        this.location = location;
    }


    /**
     * Gets the quantityAvailable value for this InventoryNumberBinSearchBasic.
     * 
     * @return quantityAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this InventoryNumberBinSearchBasic.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    /**
     * Gets the quantityOnHand value for this InventoryNumberBinSearchBasic.
     * 
     * @return quantityOnHand
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this InventoryNumberBinSearchBasic.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryNumberBinSearchBasic)) return false;
        InventoryNumberBinSearchBasic other = (InventoryNumberBinSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              java.util.Arrays.equals(this.binNumber, other.getBinNumber()))) &&
            ((this.inventoryNumber==null && other.getInventoryNumber()==null) || 
             (this.inventoryNumber!=null &&
              this.inventoryNumber.equals(other.getInventoryNumber()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              this.quantityAvailable.equals(other.getQuantityAvailable()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand())));
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
        if (getBinNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInventoryNumber() != null) {
            _hashCode += getInventoryNumber().hashCode();
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityAvailable() != null) {
            _hashCode += getQuantityAvailable().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryNumberBinSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryNumberBinSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inventoryNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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