
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.RecordRefList;


/**
 * <p>SerializedAssemblyItemBillOfMaterials complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SerializedAssemblyItemBillOfMaterials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billOfMaterials" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="currentRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masterDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultForLocationList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/>
 *         &lt;element name="inactive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerializedAssemblyItemBillOfMaterials", propOrder = {
    "billOfMaterials",
    "currentRevision",
    "masterDefault",
    "defaultForLocationList",
    "inactive",
    "memo"
})
public class SerializedAssemblyItemBillOfMaterials {

    protected RecordRef billOfMaterials;
    protected String currentRevision;
    protected Boolean masterDefault;
    protected RecordRefList defaultForLocationList;
    protected String inactive;
    protected String memo;

    /**
     * ��ȡbillOfMaterials���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillOfMaterials() {
        return billOfMaterials;
    }

    /**
     * ����billOfMaterials���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillOfMaterials(RecordRef value) {
        this.billOfMaterials = value;
    }

    /**
     * ��ȡcurrentRevision���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentRevision() {
        return currentRevision;
    }

    /**
     * ����currentRevision���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentRevision(String value) {
        this.currentRevision = value;
    }

    /**
     * ��ȡmasterDefault���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMasterDefault() {
        return masterDefault;
    }

    /**
     * ����masterDefault���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMasterDefault(Boolean value) {
        this.masterDefault = value;
    }

    /**
     * ��ȡdefaultForLocationList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getDefaultForLocationList() {
        return defaultForLocationList;
    }

    /**
     * ����defaultForLocationList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setDefaultForLocationList(RecordRefList value) {
        this.defaultForLocationList = value;
    }

    /**
     * ��ȡinactive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactive() {
        return inactive;
    }

    /**
     * ����inactive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactive(String value) {
        this.inactive = value;
    }

    /**
     * ��ȡmemo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * ����memo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

}
