
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.Record;


/**
 * <p>LandedCost complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="LandedCost">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="landedCostDataList" type="{urn:common_2018_2.platform.webservices.netsuite.com}LandedCostDataList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandedCost", propOrder = {
    "landedCostDataList"
})
public class LandedCost
    extends Record
{

    protected LandedCostDataList landedCostDataList;

    /**
     * ��ȡlandedCostDataList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LandedCostDataList }
     *     
     */
    public LandedCostDataList getLandedCostDataList() {
        return landedCostDataList;
    }

    /**
     * ����landedCostDataList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LandedCostDataList }
     *     
     */
    public void setLandedCostDataList(LandedCostDataList value) {
        this.landedCostDataList = value;
    }

}
