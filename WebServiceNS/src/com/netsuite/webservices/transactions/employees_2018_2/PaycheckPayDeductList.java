
package com.netsuite.webservices.transactions.employees_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaycheckPayDeductList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PaycheckPayDeductList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paycheckPayDeduct" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}PaycheckPayDeduct" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PaycheckPayDeductList", propOrder = {
    "paycheckPayDeduct"
})
public class PaycheckPayDeductList {

    protected List<PaycheckPayDeduct> paycheckPayDeduct;
    @XmlAttribute(name = "replaceAll")
    protected Boolean replaceAll;

    /**
     * Gets the value of the paycheckPayDeduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paycheckPayDeduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaycheckPayDeduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaycheckPayDeduct }
     * 
     * 
     */
    public List<PaycheckPayDeduct> getPaycheckPayDeduct() {
        if (paycheckPayDeduct == null) {
            paycheckPayDeduct = new ArrayList<PaycheckPayDeduct>();
        }
        return this.paycheckPayDeduct;
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
