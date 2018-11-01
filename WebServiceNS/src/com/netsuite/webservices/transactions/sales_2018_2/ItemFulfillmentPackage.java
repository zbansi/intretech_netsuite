
package com.netsuite.webservices.transactions.sales_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemFulfillmentPackage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ItemFulfillmentPackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="packageDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemFulfillmentPackage", propOrder = {
    "packageWeight",
    "packageDescr",
    "packageTrackingNumber"
})
public class ItemFulfillmentPackage {

    protected Double packageWeight;
    protected String packageDescr;
    protected String packageTrackingNumber;

    /**
     * ��ȡpackageWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPackageWeight() {
        return packageWeight;
    }

    /**
     * ����packageWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPackageWeight(Double value) {
        this.packageWeight = value;
    }

    /**
     * ��ȡpackageDescr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDescr() {
        return packageDescr;
    }

    /**
     * ����packageDescr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDescr(String value) {
        this.packageDescr = value;
    }

    /**
     * ��ȡpackageTrackingNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTrackingNumber() {
        return packageTrackingNumber;
    }

    /**
     * ����packageTrackingNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTrackingNumber(String value) {
        this.packageTrackingNumber = value;
    }

}
