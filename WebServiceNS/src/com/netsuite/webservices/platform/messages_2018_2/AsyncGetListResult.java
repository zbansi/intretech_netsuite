
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AsyncGetListResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AsyncGetListResult">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:messages_2018_2.platform.webservices.netsuite.com}AsyncResult">
 *       &lt;sequence>
 *         &lt;element ref="{urn:messages_2018_2.platform.webservices.netsuite.com}readResponseList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncGetListResult", propOrder = {
    "readResponseList"
})
public class AsyncGetListResult
    extends AsyncResult
{

    @XmlElement(required = true)
    protected ReadResponseList readResponseList;

    /**
     * ��ȡreadResponseList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ReadResponseList }
     *     
     */
    public ReadResponseList getReadResponseList() {
        return readResponseList;
    }

    /**
     * ����readResponseList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ReadResponseList }
     *     
     */
    public void setReadResponseList(ReadResponseList value) {
        this.readResponseList = value;
    }

}
