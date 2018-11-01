
package com.netsuite.webservices.lists.accounting_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.AssemblyItemBomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.BinSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.FileSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.InventoryDetailSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.InventoryNumberBinSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.InventoryNumberSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemBinNumberSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemRevisionSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.LocationSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.PricingSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.VendorSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>ItemSearchRow complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="assemblyItemBillOfMaterialsJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AssemblyItemBomSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="binNumberJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BinSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="binOnHandJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemBinNumberSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="correlatedItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="effectiveRevisionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemRevisionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="inventoryDetailJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}InventoryDetailSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="inventoryLocationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="inventoryNumberJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}InventoryNumberSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="inventoryNumberBinOnHandJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}InventoryNumberBinSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="memberItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="obsoleteRevisionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemRevisionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="parentJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="preferredLocationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="preferredVendorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="pricingJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PricingSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="shopperJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}NoteSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="vendorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/>
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
@XmlType(name = "ItemSearchRow", propOrder = {
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
public class ItemSearchRow
    extends SearchRow
{

    protected ItemSearchRowBasic basic;
    protected AssemblyItemBomSearchRowBasic assemblyItemBillOfMaterialsJoin;
    protected BinSearchRowBasic binNumberJoin;
    protected ItemBinNumberSearchRowBasic binOnHandJoin;
    protected ItemSearchRowBasic correlatedItemJoin;
    protected ItemRevisionSearchRowBasic effectiveRevisionJoin;
    protected FileSearchRowBasic fileJoin;
    protected InventoryDetailSearchRowBasic inventoryDetailJoin;
    protected LocationSearchRowBasic inventoryLocationJoin;
    protected InventoryNumberSearchRowBasic inventoryNumberJoin;
    protected InventoryNumberBinSearchRowBasic inventoryNumberBinOnHandJoin;
    protected ItemSearchRowBasic memberItemJoin;
    protected ItemRevisionSearchRowBasic obsoleteRevisionJoin;
    protected ItemSearchRowBasic parentJoin;
    protected LocationSearchRowBasic preferredLocationJoin;
    protected VendorSearchRowBasic preferredVendorJoin;
    protected PricingSearchRowBasic pricingJoin;
    protected CustomerSearchRowBasic shopperJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected VendorSearchRowBasic vendorJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setBasic(ItemSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * 获取assemblyItemBillOfMaterialsJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AssemblyItemBomSearchRowBasic }
     *     
     */
    public AssemblyItemBomSearchRowBasic getAssemblyItemBillOfMaterialsJoin() {
        return assemblyItemBillOfMaterialsJoin;
    }

    /**
     * 设置assemblyItemBillOfMaterialsJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyItemBomSearchRowBasic }
     *     
     */
    public void setAssemblyItemBillOfMaterialsJoin(AssemblyItemBomSearchRowBasic value) {
        this.assemblyItemBillOfMaterialsJoin = value;
    }

    /**
     * 获取binNumberJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BinSearchRowBasic }
     *     
     */
    public BinSearchRowBasic getBinNumberJoin() {
        return binNumberJoin;
    }

    /**
     * 设置binNumberJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BinSearchRowBasic }
     *     
     */
    public void setBinNumberJoin(BinSearchRowBasic value) {
        this.binNumberJoin = value;
    }

    /**
     * 获取binOnHandJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemBinNumberSearchRowBasic }
     *     
     */
    public ItemBinNumberSearchRowBasic getBinOnHandJoin() {
        return binOnHandJoin;
    }

    /**
     * 设置binOnHandJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemBinNumberSearchRowBasic }
     *     
     */
    public void setBinOnHandJoin(ItemBinNumberSearchRowBasic value) {
        this.binOnHandJoin = value;
    }

    /**
     * 获取correlatedItemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getCorrelatedItemJoin() {
        return correlatedItemJoin;
    }

    /**
     * 设置correlatedItemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setCorrelatedItemJoin(ItemSearchRowBasic value) {
        this.correlatedItemJoin = value;
    }

    /**
     * 获取effectiveRevisionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearchRowBasic }
     *     
     */
    public ItemRevisionSearchRowBasic getEffectiveRevisionJoin() {
        return effectiveRevisionJoin;
    }

    /**
     * 设置effectiveRevisionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearchRowBasic }
     *     
     */
    public void setEffectiveRevisionJoin(ItemRevisionSearchRowBasic value) {
        this.effectiveRevisionJoin = value;
    }

    /**
     * 获取fileJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * 设置fileJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public void setFileJoin(FileSearchRowBasic value) {
        this.fileJoin = value;
    }

    /**
     * 获取inventoryDetailJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetailSearchRowBasic }
     *     
     */
    public InventoryDetailSearchRowBasic getInventoryDetailJoin() {
        return inventoryDetailJoin;
    }

    /**
     * 设置inventoryDetailJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetailSearchRowBasic }
     *     
     */
    public void setInventoryDetailJoin(InventoryDetailSearchRowBasic value) {
        this.inventoryDetailJoin = value;
    }

    /**
     * 获取inventoryLocationJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getInventoryLocationJoin() {
        return inventoryLocationJoin;
    }

    /**
     * 设置inventoryLocationJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setInventoryLocationJoin(LocationSearchRowBasic value) {
        this.inventoryLocationJoin = value;
    }

    /**
     * 获取inventoryNumberJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryNumberSearchRowBasic }
     *     
     */
    public InventoryNumberSearchRowBasic getInventoryNumberJoin() {
        return inventoryNumberJoin;
    }

    /**
     * 设置inventoryNumberJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryNumberSearchRowBasic }
     *     
     */
    public void setInventoryNumberJoin(InventoryNumberSearchRowBasic value) {
        this.inventoryNumberJoin = value;
    }

    /**
     * 获取inventoryNumberBinOnHandJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryNumberBinSearchRowBasic }
     *     
     */
    public InventoryNumberBinSearchRowBasic getInventoryNumberBinOnHandJoin() {
        return inventoryNumberBinOnHandJoin;
    }

    /**
     * 设置inventoryNumberBinOnHandJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryNumberBinSearchRowBasic }
     *     
     */
    public void setInventoryNumberBinOnHandJoin(InventoryNumberBinSearchRowBasic value) {
        this.inventoryNumberBinOnHandJoin = value;
    }

    /**
     * 获取memberItemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getMemberItemJoin() {
        return memberItemJoin;
    }

    /**
     * 设置memberItemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setMemberItemJoin(ItemSearchRowBasic value) {
        this.memberItemJoin = value;
    }

    /**
     * 获取obsoleteRevisionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearchRowBasic }
     *     
     */
    public ItemRevisionSearchRowBasic getObsoleteRevisionJoin() {
        return obsoleteRevisionJoin;
    }

    /**
     * 设置obsoleteRevisionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearchRowBasic }
     *     
     */
    public void setObsoleteRevisionJoin(ItemRevisionSearchRowBasic value) {
        this.obsoleteRevisionJoin = value;
    }

    /**
     * 获取parentJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getParentJoin() {
        return parentJoin;
    }

    /**
     * 设置parentJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setParentJoin(ItemSearchRowBasic value) {
        this.parentJoin = value;
    }

    /**
     * 获取preferredLocationJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getPreferredLocationJoin() {
        return preferredLocationJoin;
    }

    /**
     * 设置preferredLocationJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setPreferredLocationJoin(LocationSearchRowBasic value) {
        this.preferredLocationJoin = value;
    }

    /**
     * 获取preferredVendorJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getPreferredVendorJoin() {
        return preferredVendorJoin;
    }

    /**
     * 设置preferredVendorJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setPreferredVendorJoin(VendorSearchRowBasic value) {
        this.preferredVendorJoin = value;
    }

    /**
     * 获取pricingJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricingSearchRowBasic }
     *     
     */
    public PricingSearchRowBasic getPricingJoin() {
        return pricingJoin;
    }

    /**
     * 设置pricingJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSearchRowBasic }
     *     
     */
    public void setPricingJoin(PricingSearchRowBasic value) {
        this.pricingJoin = value;
    }

    /**
     * 获取shopperJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getShopperJoin() {
        return shopperJoin;
    }

    /**
     * 设置shopperJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setShopperJoin(CustomerSearchRowBasic value) {
        this.shopperJoin = value;
    }

    /**
     * 获取transactionJoin属性的值。
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
     * 设置transactionJoin属性的值。
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
     * 获取userJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * 设置userJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

    /**
     * 获取userNotesJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * 设置userNotesJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchRowBasic value) {
        this.userNotesJoin = value;
    }

    /**
     * 获取vendorJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * 设置vendorJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setVendorJoin(VendorSearchRowBasic value) {
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
