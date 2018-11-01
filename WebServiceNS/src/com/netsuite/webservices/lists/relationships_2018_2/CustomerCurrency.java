
package com.netsuite.webservices.lists.relationships_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.types.CurrencySymbolPlacement;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>CustomerCurrency complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomerCurrency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="depositBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolDepositBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="overdueBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolOverdueBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unbilledOrders" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolUnbilledOrders" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="overrideCurrencyFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displaySymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="symbolPlacement" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}CurrencySymbolPlacement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCurrency", propOrder = {
    "currency",
    "balance",
    "consolBalance",
    "depositBalance",
    "consolDepositBalance",
    "overdueBalance",
    "consolOverdueBalance",
    "unbilledOrders",
    "consolUnbilledOrders",
    "overrideCurrencyFormat",
    "displaySymbol",
    "symbolPlacement"
})
public class CustomerCurrency {

    protected RecordRef currency;
    protected Double balance;
    protected Double consolBalance;
    protected Double depositBalance;
    protected Double consolDepositBalance;
    protected Double overdueBalance;
    protected Double consolOverdueBalance;
    protected Double unbilledOrders;
    protected Double consolUnbilledOrders;
    protected Boolean overrideCurrencyFormat;
    protected String displaySymbol;
    @XmlSchemaType(name = "string")
    protected CurrencySymbolPlacement symbolPlacement;

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCurrency(RecordRef value) {
        this.currency = value;
    }

    /**
     * 获取balance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 设置balance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalance(Double value) {
        this.balance = value;
    }

    /**
     * 获取consolBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolBalance() {
        return consolBalance;
    }

    /**
     * 设置consolBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolBalance(Double value) {
        this.consolBalance = value;
    }

    /**
     * 获取depositBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepositBalance() {
        return depositBalance;
    }

    /**
     * 设置depositBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepositBalance(Double value) {
        this.depositBalance = value;
    }

    /**
     * 获取consolDepositBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolDepositBalance() {
        return consolDepositBalance;
    }

    /**
     * 设置consolDepositBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolDepositBalance(Double value) {
        this.consolDepositBalance = value;
    }

    /**
     * 获取overdueBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverdueBalance() {
        return overdueBalance;
    }

    /**
     * 设置overdueBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverdueBalance(Double value) {
        this.overdueBalance = value;
    }

    /**
     * 获取consolOverdueBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolOverdueBalance() {
        return consolOverdueBalance;
    }

    /**
     * 设置consolOverdueBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolOverdueBalance(Double value) {
        this.consolOverdueBalance = value;
    }

    /**
     * 获取unbilledOrders属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnbilledOrders() {
        return unbilledOrders;
    }

    /**
     * 设置unbilledOrders属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnbilledOrders(Double value) {
        this.unbilledOrders = value;
    }

    /**
     * 获取consolUnbilledOrders属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolUnbilledOrders() {
        return consolUnbilledOrders;
    }

    /**
     * 设置consolUnbilledOrders属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolUnbilledOrders(Double value) {
        this.consolUnbilledOrders = value;
    }

    /**
     * 获取overrideCurrencyFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideCurrencyFormat() {
        return overrideCurrencyFormat;
    }

    /**
     * 设置overrideCurrencyFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideCurrencyFormat(Boolean value) {
        this.overrideCurrencyFormat = value;
    }

    /**
     * 获取displaySymbol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaySymbol() {
        return displaySymbol;
    }

    /**
     * 设置displaySymbol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaySymbol(String value) {
        this.displaySymbol = value;
    }

    /**
     * 获取symbolPlacement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencySymbolPlacement }
     *     
     */
    public CurrencySymbolPlacement getSymbolPlacement() {
        return symbolPlacement;
    }

    /**
     * 设置symbolPlacement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencySymbolPlacement }
     *     
     */
    public void setSymbolPlacement(CurrencySymbolPlacement value) {
        this.symbolPlacement = value;
    }

}
