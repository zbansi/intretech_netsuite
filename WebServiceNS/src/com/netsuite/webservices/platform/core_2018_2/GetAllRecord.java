
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.GetAllRecordType;


/**
 * <p>GetAllRecord complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetAllRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="recordType" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}GetAllRecordType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllRecord")
public class GetAllRecord {

    @XmlAttribute(name = "recordType")
    protected GetAllRecordType recordType;

    /**
     * ��ȡrecordType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetAllRecordType }
     *     
     */
    public GetAllRecordType getRecordType() {
        return recordType;
    }

    /**
     * ����recordType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllRecordType }
     *     
     */
    public void setRecordType(GetAllRecordType value) {
        this.recordType = value;
    }

}
