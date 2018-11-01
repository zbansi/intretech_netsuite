
package com.netsuite.webservices.lists.accounting_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.AssemblyItemBomSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BomRevisionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BomSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>BomSearch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BomSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}BomSearchBasic" minOccurs="0"/>
 *         &lt;element name="revisionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BomRevisionSearchBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="assemblyItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AssemblyItemBomSearchBasic" minOccurs="0"/>
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
@XmlType(name = "BomSearch", propOrder = {
    "basic",
    "revisionJoin",
    "transactionJoin",
    "assemblyItemJoin",
    "customSearchJoin"
})
public class BomSearch
    extends SearchRecord
{

    protected BomSearchBasic basic;
    protected BomRevisionSearchBasic revisionJoin;
    protected TransactionSearchBasic transactionJoin;
    protected AssemblyItemBomSearchBasic assemblyItemJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BomSearchBasic }
     *     
     */
    public BomSearchBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BomSearchBasic }
     *     
     */
    public void setBasic(BomSearchBasic value) {
        this.basic = value;
    }

    /**
     * 获取revisionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BomRevisionSearchBasic }
     *     
     */
    public BomRevisionSearchBasic getRevisionJoin() {
        return revisionJoin;
    }

    /**
     * 设置revisionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BomRevisionSearchBasic }
     *     
     */
    public void setRevisionJoin(BomRevisionSearchBasic value) {
        this.revisionJoin = value;
    }

    /**
     * 获取transactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * 设置transactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchBasic value) {
        this.transactionJoin = value;
    }

    /**
     * 获取assemblyItemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AssemblyItemBomSearchBasic }
     *     
     */
    public AssemblyItemBomSearchBasic getAssemblyItemJoin() {
        return assemblyItemJoin;
    }

    /**
     * 设置assemblyItemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyItemBomSearchBasic }
     *     
     */
    public void setAssemblyItemJoin(AssemblyItemBomSearchBasic value) {
        this.assemblyItemJoin = value;
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
