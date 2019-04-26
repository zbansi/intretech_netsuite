/**
 * BomRevisionComponentSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class BomRevisionComponentSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField bomQuantity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] bomRevision;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField componentYield;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField description;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] item;

    private java.lang.String[] itemSource;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField itemSubtype;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] itemType;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField lineId;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField units;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField weight;

    public BomRevisionComponentSearchBasic() {
    }

    public BomRevisionComponentSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField bomQuantity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] bomRevision,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField componentYield,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField description,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] item,
           java.lang.String[] itemSource,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField itemSubtype,
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] itemType,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField lineId,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantity,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField units,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField weight) {
        this.bomQuantity = bomQuantity;
        this.bomRevision = bomRevision;
        this.componentYield = componentYield;
        this.description = description;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.item = item;
        this.itemSource = itemSource;
        this.itemSubtype = itemSubtype;
        this.itemType = itemType;
        this.lineId = lineId;
        this.quantity = quantity;
        this.units = units;
        this.weight = weight;
    }


    /**
     * Gets the bomQuantity value for this BomRevisionComponentSearchBasic.
     * 
     * @return bomQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBomQuantity() {
        return bomQuantity;
    }


    /**
     * Sets the bomQuantity value for this BomRevisionComponentSearchBasic.
     * 
     * @param bomQuantity
     */
    public void setBomQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField bomQuantity) {
        this.bomQuantity = bomQuantity;
    }


    /**
     * Gets the bomRevision value for this BomRevisionComponentSearchBasic.
     * 
     * @return bomRevision
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getBomRevision() {
        return bomRevision;
    }


    /**
     * Sets the bomRevision value for this BomRevisionComponentSearchBasic.
     * 
     * @param bomRevision
     */
    public void setBomRevision(com.netsuite.webservices.platform.core_2019_1.RecordRef[] bomRevision) {
        this.bomRevision = bomRevision;
    }


    /**
     * Gets the componentYield value for this BomRevisionComponentSearchBasic.
     * 
     * @return componentYield
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getComponentYield() {
        return componentYield;
    }


    /**
     * Sets the componentYield value for this BomRevisionComponentSearchBasic.
     * 
     * @param componentYield
     */
    public void setComponentYield(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField componentYield) {
        this.componentYield = componentYield;
    }


    /**
     * Gets the description value for this BomRevisionComponentSearchBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BomRevisionComponentSearchBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2019_1.SearchStringField description) {
        this.description = description;
    }


    /**
     * Gets the internalId value for this BomRevisionComponentSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this BomRevisionComponentSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this BomRevisionComponentSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this BomRevisionComponentSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the item value for this BomRevisionComponentSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this BomRevisionComponentSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef[] item) {
        this.item = item;
    }


    /**
     * Gets the itemSource value for this BomRevisionComponentSearchBasic.
     * 
     * @return itemSource
     */
    public java.lang.String[] getItemSource() {
        return itemSource;
    }


    /**
     * Sets the itemSource value for this BomRevisionComponentSearchBasic.
     * 
     * @param itemSource
     */
    public void setItemSource(java.lang.String[] itemSource) {
        this.itemSource = itemSource;
    }


    /**
     * Gets the itemSubtype value for this BomRevisionComponentSearchBasic.
     * 
     * @return itemSubtype
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getItemSubtype() {
        return itemSubtype;
    }


    /**
     * Sets the itemSubtype value for this BomRevisionComponentSearchBasic.
     * 
     * @param itemSubtype
     */
    public void setItemSubtype(com.netsuite.webservices.platform.core_2019_1.SearchStringField itemSubtype) {
        this.itemSubtype = itemSubtype;
    }


    /**
     * Gets the itemType value for this BomRevisionComponentSearchBasic.
     * 
     * @return itemType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this BomRevisionComponentSearchBasic.
     * 
     * @param itemType
     */
    public void setItemType(com.netsuite.webservices.platform.core_2019_1.RecordRef[] itemType) {
        this.itemType = itemType;
    }


    /**
     * Gets the lineId value for this BomRevisionComponentSearchBasic.
     * 
     * @return lineId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLineId() {
        return lineId;
    }


    /**
     * Sets the lineId value for this BomRevisionComponentSearchBasic.
     * 
     * @param lineId
     */
    public void setLineId(com.netsuite.webservices.platform.core_2019_1.SearchLongField lineId) {
        this.lineId = lineId;
    }


    /**
     * Gets the quantity value for this BomRevisionComponentSearchBasic.
     * 
     * @return quantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this BomRevisionComponentSearchBasic.
     * 
     * @param quantity
     */
    public void setQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the units value for this BomRevisionComponentSearchBasic.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getUnits() {
        return units;
    }


    /**
     * Sets the units value for this BomRevisionComponentSearchBasic.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.SearchStringField units) {
        this.units = units;
    }


    /**
     * Gets the weight value for this BomRevisionComponentSearchBasic.
     * 
     * @return weight
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this BomRevisionComponentSearchBasic.
     * 
     * @param weight
     */
    public void setWeight(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField weight) {
        this.weight = weight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BomRevisionComponentSearchBasic)) return false;
        BomRevisionComponentSearchBasic other = (BomRevisionComponentSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bomQuantity==null && other.getBomQuantity()==null) || 
             (this.bomQuantity!=null &&
              this.bomQuantity.equals(other.getBomQuantity()))) &&
            ((this.bomRevision==null && other.getBomRevision()==null) || 
             (this.bomRevision!=null &&
              java.util.Arrays.equals(this.bomRevision, other.getBomRevision()))) &&
            ((this.componentYield==null && other.getComponentYield()==null) || 
             (this.componentYield!=null &&
              this.componentYield.equals(other.getComponentYield()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.itemSource==null && other.getItemSource()==null) || 
             (this.itemSource!=null &&
              java.util.Arrays.equals(this.itemSource, other.getItemSource()))) &&
            ((this.itemSubtype==null && other.getItemSubtype()==null) || 
             (this.itemSubtype!=null &&
              this.itemSubtype.equals(other.getItemSubtype()))) &&
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              java.util.Arrays.equals(this.itemType, other.getItemType()))) &&
            ((this.lineId==null && other.getLineId()==null) || 
             (this.lineId!=null &&
              this.lineId.equals(other.getLineId()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight())));
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
        if (getBomQuantity() != null) {
            _hashCode += getBomQuantity().hashCode();
        }
        if (getBomRevision() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBomRevision());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBomRevision(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComponentYield() != null) {
            _hashCode += getComponentYield().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemSubtype() != null) {
            _hashCode += getItemSubtype().hashCode();
        }
        if (getItemType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineId() != null) {
            _hashCode += getLineId().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BomRevisionComponentSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BomRevisionComponentSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "bomRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSubtype");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemSubtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "weight"));
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
