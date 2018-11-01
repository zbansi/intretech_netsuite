
package com.netsuite.webservices.platform.core_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InitializeRefList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="InitializeRefList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initializeRef" type="{urn:core_2018_2.platform.webservices.netsuite.com}InitializeRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitializeRefList", propOrder = {
    "initializeRef"
})
public class InitializeRefList {

    protected List<InitializeRef> initializeRef;

    /**
     * Gets the value of the initializeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initializeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitializeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InitializeRef }
     * 
     * 
     */
    public List<InitializeRef> getInitializeRef() {
        if (initializeRef == null) {
            initializeRef = new ArrayList<InitializeRef>();
        }
        return this.initializeRef;
    }

}
