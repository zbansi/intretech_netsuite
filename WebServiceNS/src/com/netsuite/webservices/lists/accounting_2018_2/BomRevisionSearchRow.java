
package com.netsuite.webservices.lists.accounting_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.BomRevisionComponentSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.BomRevisionSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.BomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>BomRevisionSearchRow complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BomRevisionSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}BomRevisionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="billOfMaterialsJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BomSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="componentJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BomRevisionComponentSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="customSearchJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomSearchJoin" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BomRevisionSearchRow", propOrder = {
    "basic",
    "billOfMaterialsJoin",
    "componentJoin",
    "transactionJoin",
    "customSearchJoin"
})
public class BomRevisionSearchRow
    extends SearchRow
{

    protected BomRevisionSearchRowBasic basic;
    protected BomSearchRowBasic billOfMaterialsJoin;
    protected BomRevisionComponentSearchRowBasic componentJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BomRevisionSearchRowBasic }
     *     
     */
    public BomRevisionSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BomRevisionSearchRowBasic }
     *     
     */
    public void setBasic(BomRevisionSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡbillOfMaterialsJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BomSearchRowBasic }
     *     
     */
    public BomSearchRowBasic getBillOfMaterialsJoin() {
        return billOfMaterialsJoin;
    }

    /**
     * ����billOfMaterialsJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BomSearchRowBasic }
     *     
     */
    public void setBillOfMaterialsJoin(BomSearchRowBasic value) {
        this.billOfMaterialsJoin = value;
    }

    /**
     * ��ȡcomponentJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BomRevisionComponentSearchRowBasic }
     *     
     */
    public BomRevisionComponentSearchRowBasic getComponentJoin() {
        return componentJoin;
    }

    /**
     * ����componentJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BomRevisionComponentSearchRowBasic }
     *     
     */
    public void setComponentJoin(BomRevisionComponentSearchRowBasic value) {
        this.componentJoin = value;
    }

    /**
     * ��ȡtransactionJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * ����transactionJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchRowBasic value) {
        this.transactionJoin = value;
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
     * {@link CustomSearchJoin }
     * 
     * 
     */
    public List<CustomSearchJoin> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchJoin>();
        }
        return this.customSearchJoin;
    }

}
