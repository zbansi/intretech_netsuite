
package com.netsuite.webservices.platform.messages_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.InitializeRecord;


/**
 * <p>AsyncInitializeListRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AsyncInitializeListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initializeRecord" type="{urn:core_2018_2.platform.webservices.netsuite.com}InitializeRecord" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncInitializeListRequest", propOrder = {
    "initializeRecord"
})
public class AsyncInitializeListRequest {

    @XmlElement(required = true)
    protected List<InitializeRecord> initializeRecord;

    /**
     * Gets the value of the initializeRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initializeRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitializeRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InitializeRecord }
     * 
     * 
     */
    public List<InitializeRecord> getInitializeRecord() {
        if (initializeRecord == null) {
            initializeRecord = new ArrayList<InitializeRecord>();
        }
        return this.initializeRecord;
    }

}
