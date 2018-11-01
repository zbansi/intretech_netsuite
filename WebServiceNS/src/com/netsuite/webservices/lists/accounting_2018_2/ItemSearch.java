
package com.netsuite.webservices.lists.accounting_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.AssemblyItemBomSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BinSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.FileSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.InventoryDetailSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.InventoryNumberBinSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.InventoryNumberSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemBinNumberSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemRevisionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.LocationSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PricingSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.VendorSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>ItemSearch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="assemblyItemBillOfMaterialsJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AssemblyItemBomSearchBasic" minOccurs="0"/>
 *         &lt;element name="binNumberJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BinSearchBasic" minOccurs="0"/>
 *         &lt;element name="binOnHandJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemBinNumberSearchBasic" minOccurs="0"/>
 *         &lt;element name="correlatedItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="effectiveRevisionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemRevisionSearchBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/>
 *         &lt;element name="inventoryDetailJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}InventoryDetailSearchBasic" minOccurs="0"/>
 *         &lt;element name="inventoryLocationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/>
 *         &lt;element name="inventoryNumberJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}InventoryNumberSearchBasic" minOccurs="0"/>
 *         &lt;element name="inventoryNumberBinOnHandJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}InventoryNumberBinSearchBasic" minOccurs="0"/>
 *         &lt;element name="memberItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="obsoleteRevisionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemRevisionSearchBasic" minOccurs="0"/>
 *         &lt;element name="parentJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="preferredLocationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/>
 *         &lt;element name="preferredVendorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
 *         &lt;element name="pricingJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PricingSearchBasic" minOccurs="0"/>
 *         &lt;element name="shopperJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}NoteSearchBasic" minOccurs="0"/>
 *         &lt;element name="vendorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
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
@XmlType(name = "ItemSearch", propOrder = {
    "basic",
    "assemblyItemBillOfMaterialsJoin",
    "binNumberJoin",
    "binOnHandJoin",
    "correlatedItemJoin",
    "effectiveRevisionJoin",
    "fileJoin",
    "inventoryDetailJoin",
    "inventoryLocationJoin",
    "inventoryNumberJoin",
    "inventoryNumberBinOnHandJoin",
    "memberItemJoin",
    "obsoleteRevisionJoin",
    "parentJoin",
    "preferredLocationJoin",
    "preferredVendorJoin",
    "pricingJoin",
    "shopperJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "vendorJoin",
    "customSearchJoin"
})
public class ItemSearch
    extends SearchRecord
{

    protected ItemSearchBasic basic;
    protected AssemblyItemBomSearchBasic assemblyItemBillOfMaterialsJoin;
    protected BinSearchBasic binNumberJoin;
    protected ItemBinNumberSearchBasic binOnHandJoin;
    protected ItemSearchBasic correlatedItemJoin;
    protected ItemRevisionSearchBasic effectiveRevisionJoin;
    protected FileSearchBasic fileJoin;
    protected InventoryDetailSearchBasic inventoryDetailJoin;
    protected LocationSearchBasic inventoryLocationJoin;
    protected InventoryNumberSearchBasic inventoryNumberJoin;
    protected InventoryNumberBinSearchBasic inventoryNumberBinOnHandJoin;
    protected ItemSearchBasic memberItemJoin;
    protected ItemRevisionSearchBasic obsoleteRevisionJoin;
    protected ItemSearchBasic parentJoin;
    protected LocationSearchBasic preferredLocationJoin;
    protected VendorSearchBasic preferredVendorJoin;
    protected PricingSearchBasic pricingJoin;
    protected CustomerSearchBasic shopperJoin;
    protected TransactionSearchBasic transactionJoin;
    protected EmployeeSearchBasic userJoin;
    protected NoteSearchBasic userNotesJoin;
    protected VendorSearchBasic vendorJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setBasic(ItemSearchBasic value) {
        this.basic = value;
    }

    /**
     * 获取assemblyItemBillOfMaterialsJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AssemblyItemBomSearchBasic }
     *     
     */
    public AssemblyItemBomSearchBasic getAssemblyItemBillOfMaterialsJoin() {
        return assemblyItemBillOfMaterialsJoin;
    }

    /**
     * 设置assemblyItemBillOfMaterialsJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyItemBomSearchBasic }
     *     
     */
    public void setAssemblyItemBillOfMaterialsJoin(AssemblyItemBomSearchBasic value) {
        this.assemblyItemBillOfMaterialsJoin = value;
    }

    /**
     * 获取binNumberJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BinSearchBasic }
     *     
     */
    public BinSearchBasic getBinNumberJoin() {
        return binNumberJoin;
    }

    /**
     * 设置binNumberJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BinSearchBasic }
     *     
     */
    public void setBinNumberJoin(BinSearchBasic value) {
        this.binNumberJoin = value;
    }

    /**
     * 获取binOnHandJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemBinNumberSearchBasic }
     *     
     */
    public ItemBinNumberSearchBasic getBinOnHandJoin() {
        return binOnHandJoin;
    }

    /**
     * 设置binOnHandJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemBinNumberSearchBasic }
     *     
     */
    public void setBinOnHandJoin(ItemBinNumberSearchBasic value) {
        this.binOnHandJoin = value;
    }

    /**
     * 获取correlatedItemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getCorrelatedItemJoin() {
        return correlatedItemJoin;
    }

    /**
     * 设置correlatedItemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setCorrelatedItemJoin(ItemSearchBasic value) {
        this.correlatedItemJoin = value;
    }

    /**
     * 获取effectiveRevisionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearchBasic }
     *     
     */
    public ItemRevisionSearchBasic getEffectiveRevisionJoin() {
        return effectiveRevisionJoin;
    }

    /**
     * 设置effectiveRevisionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearchBasic }
     *     
     */
    public void setEffectiveRevisionJoin(ItemRevisionSearchBasic value) {
        this.effectiveRevisionJoin = value;
    }

    /**
     * 获取fileJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FileSearchBasic }
     *     
     */
    public FileSearchBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * 设置fileJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchBasic }
     *     
     */
    public void setFileJoin(FileSearchBasic value) {
        this.fileJoin = value;
    }

    /**
     * 获取inventoryDetailJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetailSearchBasic }
     *     
     */
    public InventoryDetailSearchBasic getInventoryDetailJoin() {
        return inventoryDetailJoin;
    }

    /**
     * 设置inventoryDetailJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetailSearchBasic }
     *     
     */
    public void setInventoryDetailJoin(InventoryDetailSearchBasic value) {
        this.inventoryDetailJoin = value;
    }

    /**
     * 获取inventoryLocationJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getInventoryLocationJoin() {
        return inventoryLocationJoin;
    }

    /**
     * 设置inventoryLocationJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setInventoryLocationJoin(LocationSearchBasic value) {
        this.inventoryLocationJoin = value;
    }

    /**
     * 获取inventoryNumberJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryNumberSearchBasic }
     *     
     */
    public InventoryNumberSearchBasic getInventoryNumberJoin() {
        return inventoryNumberJoin;
    }

    /**
     * 设置inventoryNumberJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryNumberSearchBasic }
     *     
     */
    public void setInventoryNumberJoin(InventoryNumberSearchBasic value) {
        this.inventoryNumberJoin = value;
    }

    /**
     * 获取inventoryNumberBinOnHandJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryNumberBinSearchBasic }
     *     
     */
    public InventoryNumberBinSearchBasic getInventoryNumberBinOnHandJoin() {
        return inventoryNumberBinOnHandJoin;
    }

    /**
     * 设置inventoryNumberBinOnHandJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryNumberBinSearchBasic }
     *     
     */
    public void setInventoryNumberBinOnHandJoin(InventoryNumberBinSearchBasic value) {
        this.inventoryNumberBinOnHandJoin = value;
    }

    /**
     * 获取memberItemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getMemberItemJoin() {
        return memberItemJoin;
    }

    /**
     * 设置memberItemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setMemberItemJoin(ItemSearchBasic value) {
        this.memberItemJoin = value;
    }

    /**
     * 获取obsoleteRevisionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearchBasic }
     *     
     */
    public ItemRevisionSearchBasic getObsoleteRevisionJoin() {
        return obsoleteRevisionJoin;
    }

    /**
     * 设置obsoleteRevisionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearchBasic }
     *     
     */
    public void setObsoleteRevisionJoin(ItemRevisionSearchBasic value) {
        this.obsoleteRevisionJoin = value;
    }

    /**
     * 获取parentJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getParentJoin() {
        return parentJoin;
    }

    /**
     * 设置parentJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setParentJoin(ItemSearchBasic value) {
        this.parentJoin = value;
    }

    /**
     * 获取preferredLocationJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getPreferredLocationJoin() {
        return preferredLocationJoin;
    }

    /**
     * 设置preferredLocationJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setPreferredLocationJoin(LocationSearchBasic value) {
        this.preferredLocationJoin = value;
    }

    /**
     * 获取preferredVendorJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getPreferredVendorJoin() {
        return preferredVendorJoin;
    }

    /**
     * 设置preferredVendorJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setPreferredVendorJoin(VendorSearchBasic value) {
        this.preferredVendorJoin = value;
    }

    /**
     * 获取pricingJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricingSearchBasic }
     *     
     */
    public PricingSearchBasic getPricingJoin() {
        return pricingJoin;
    }

    /**
     * 设置pricingJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSearchBasic }
     *     
     */
    public void setPricingJoin(PricingSearchBasic value) {
        this.pricingJoin = value;
    }

    /**
     * 获取shopperJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getShopperJoin() {
        return shopperJoin;
    }

    /**
     * 设置shopperJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setShopperJoin(CustomerSearchBasic value) {
        this.shopperJoin = value;
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
     * 获取userJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * 设置userJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
        this.userJoin = value;
    }

    /**
     * 获取userNotesJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchBasic }
     *     
     */
    public NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * 设置userNotesJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchBasic value) {
        this.userNotesJoin = value;
    }

    /**
     * 获取vendorJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * 设置vendorJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setVendorJoin(VendorSearchBasic value) {
        this.vendorJoin = value;
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
