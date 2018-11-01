
package com.netsuite.webservices.lists.accounting_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.accounting_2018_2.types.PaymentInstrumentSupportedOperation;


/**
 * <p>GeneralTokenSupportedOperationsListList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GeneralTokenSupportedOperationsListList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeneralTokenSupportedOperationsList" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}PaymentInstrumentSupportedOperation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralTokenSupportedOperationsListList", propOrder = {
    "generalTokenSupportedOperationsList"
})
public class GeneralTokenSupportedOperationsListList {

    @XmlElement(name = "GeneralTokenSupportedOperationsList")
    @XmlSchemaType(name = "string")
    protected List<PaymentInstrumentSupportedOperation> generalTokenSupportedOperationsList;

    /**
     * Gets the value of the generalTokenSupportedOperationsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalTokenSupportedOperationsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralTokenSupportedOperationsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstrumentSupportedOperation }
     * 
     * 
     */
    public List<PaymentInstrumentSupportedOperation> getGeneralTokenSupportedOperationsList() {
        if (generalTokenSupportedOperationsList == null) {
            generalTokenSupportedOperationsList = new ArrayList<PaymentInstrumentSupportedOperation>();
        }
        return this.generalTokenSupportedOperationsList;
    }

}
