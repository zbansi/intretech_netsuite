
package com.netsuite.webservices.transactions.employees_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaycheckPayTimeList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PaycheckPayTimeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paycheckPayTime" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}PaycheckPayTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="replaceAll" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaycheckPayTimeList", propOrder = {
    "paycheckPayTime"
})
public class PaycheckPayTimeList {

    protected List<PaycheckPayTime> paycheckPayTime;
    @XmlAttribute(name = "replaceAll")
    protected Boolean replaceAll;

    /**
     * Gets the value of the paycheckPayTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paycheckPayTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaycheckPayTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaycheckPayTime }
     * 
     * 
     */
    public List<PaycheckPayTime> getPaycheckPayTime() {
        if (paycheckPayTime == null) {
            paycheckPayTime = new ArrayList<PaycheckPayTime>();
        }
        return this.paycheckPayTime;
    }

    /**
     * ��ȡreplaceAll���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReplaceAll() {
        if (replaceAll == null) {
            return true;
        } else {
            return replaceAll;
        }
    }

    /**
     * ����replaceAll���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
    }

}
