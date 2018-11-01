
package com.netsuite.webservices.transactions.employees_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaycheckPayPto complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaycheckPayPto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payItem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoursAccrued" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="hoursUsed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="hoursBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaycheckPayPto", propOrder = {
    "payItem",
    "payItemName",
    "hoursAccrued",
    "hoursUsed",
    "hoursBalance"
})
public class PaycheckPayPto {

    protected Long payItem;
    protected String payItemName;
    protected Double hoursAccrued;
    protected Double hoursUsed;
    protected Double hoursBalance;

    /**
     * 获取payItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayItem() {
        return payItem;
    }

    /**
     * 设置payItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayItem(Long value) {
        this.payItem = value;
    }

    /**
     * 获取payItemName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayItemName() {
        return payItemName;
    }

    /**
     * 设置payItemName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayItemName(String value) {
        this.payItemName = value;
    }

    /**
     * 获取hoursAccrued属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHoursAccrued() {
        return hoursAccrued;
    }

    /**
     * 设置hoursAccrued属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHoursAccrued(Double value) {
        this.hoursAccrued = value;
    }

    /**
     * 获取hoursUsed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHoursUsed() {
        return hoursUsed;
    }

    /**
     * 设置hoursUsed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHoursUsed(Double value) {
        this.hoursUsed = value;
    }

    /**
     * 获取hoursBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHoursBalance() {
        return hoursBalance;
    }

    /**
     * 设置hoursBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHoursBalance(Double value) {
        this.hoursBalance = value;
    }

}
