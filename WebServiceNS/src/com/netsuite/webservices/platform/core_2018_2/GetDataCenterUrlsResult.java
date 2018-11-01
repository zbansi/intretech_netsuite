
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetDataCenterUrlsResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetDataCenterUrlsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}status"/>
 *         &lt;element name="dataCenterUrls" type="{urn:core_2018_2.platform.webservices.netsuite.com}DataCenterUrls" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDataCenterUrlsResult", propOrder = {
    "status",
    "dataCenterUrls"
})
public class GetDataCenterUrlsResult {

    @XmlElement(required = true)
    protected Status status;
    protected DataCenterUrls dataCenterUrls;

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
     * ��ȡdataCenterUrls���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DataCenterUrls }
     *     
     */
    public DataCenterUrls getDataCenterUrls() {
        return dataCenterUrls;
    }

    /**
     * ����dataCenterUrls���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DataCenterUrls }
     *     
     */
    public void setDataCenterUrls(DataCenterUrls value) {
        this.dataCenterUrls = value;
    }

}
