
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetItemAvailabilityResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetItemAvailabilityResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}status"/>
 *         &lt;element name="itemAvailabilityList" type="{urn:core_2018_2.platform.webservices.netsuite.com}ItemAvailabilityList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemAvailabilityResult", propOrder = {
    "status",
    "itemAvailabilityList"
})
public class GetItemAvailabilityResult {

    @XmlElement(required = true)
    protected Status status;
    protected ItemAvailabilityList itemAvailabilityList;

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * ��ȡitemAvailabilityList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemAvailabilityList }
     *     
     */
    public ItemAvailabilityList getItemAvailabilityList() {
        return itemAvailabilityList;
    }

    /**
     * ����itemAvailabilityList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAvailabilityList }
     *     
     */
    public void setItemAvailabilityList(ItemAvailabilityList value) {
        this.itemAvailabilityList = value;
    }

}
