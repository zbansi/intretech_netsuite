
package com.netsuite.webservices.lists.relationships_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.BillingAccountSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.JobSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>BillingAccountSearchRow complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BillingAccountSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}BillingAccountSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="jobJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}JobSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="customSearchJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomSearchRowBasic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingAccountSearchRow", propOrder = {
    "basic",
    "jobJoin",
    "customSearchJoin"
})
public class BillingAccountSearchRow
    extends SearchRow
{

    protected BillingAccountSearchRowBasic basic;
    protected JobSearchRowBasic jobJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public BillingAccountSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public void setBasic(BillingAccountSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡjobJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }

    /**
     * ����jobJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public void setJobJoin(JobSearchRowBasic value) {
        this.jobJoin = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSearchJoin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSearchJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSearchRowBasic }
     * 
     * 
     */
    public List<CustomSearchRowBasic> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchRowBasic>();
        }
        return this.customSearchJoin;
    }

}
