
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.accounting_2018_2.types.CurrencyCurrencyPrecision;
import com.netsuite.webservices.lists.accounting_2018_2.types.CurrencyFxRateUpdateTimezone;
import com.netsuite.webservices.lists.accounting_2018_2.types.CurrencyLocale;
import com.netsuite.webservices.platform.common_2018_2.types.CurrencySymbolPlacement;
import com.netsuite.webservices.platform.core_2018_2.Record;


/**
 * <p>Currency complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Currency">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isBaseCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="overrideCurrencyFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displaySymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="symbolPlacement" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}CurrencySymbolPlacement" minOccurs="0"/>
 *         &lt;element name="locale" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}CurrencyLocale" minOccurs="0"/>
 *         &lt;element name="formatSample" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fxRateUpdateTimezone" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}CurrencyFxRateUpdateTimezone" minOccurs="0"/>
 *         &lt;element name="inclInFxRateUpdates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="currencyPrecision" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}CurrencyCurrencyPrecision" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Currency", propOrder = {
    "name",
    "symbol",
    "isBaseCurrency",
    "isInactive",
    "overrideCurrencyFormat",
    "displaySymbol",
    "symbolPlacement",
    "locale",
    "formatSample",
    "exchangeRate",
    "fxRateUpdateTimezone",
    "inclInFxRateUpdates",
    "currencyPrecision"
})
public class Currency
    extends Record
{

    protected String name;
    protected String symbol;
    protected Boolean isBaseCurrency;
    protected Boolean isInactive;
    protected Boolean overrideCurrencyFormat;
    protected String displaySymbol;
    @XmlSchemaType(name = "string")
    protected CurrencySymbolPlacement symbolPlacement;
    @XmlSchemaType(name = "string")
    protected CurrencyLocale locale;
    protected String formatSample;
    protected Double exchangeRate;
    @XmlSchemaType(name = "string")
    protected CurrencyFxRateUpdateTimezone fxRateUpdateTimezone;
    protected Boolean inclInFxRateUpdates;
    @XmlSchemaType(name = "string")
    protected CurrencyCurrencyPrecision currencyPrecision;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡsymbol���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * ����symbol���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * ��ȡisBaseCurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBaseCurrency() {
        return isBaseCurrency;
    }

    /**
     * ����isBaseCurrency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBaseCurrency(Boolean value) {
        this.isBaseCurrency = value;
    }

    /**
     * ��ȡisInactive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * ����isInactive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * ��ȡoverrideCurrencyFormat���Ե�ֵ��
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
     * ����overrideCurrencyFormat���Ե�ֵ��
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
     * ��ȡdisplaySymbol���Ե�ֵ��
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
     * ����displaySymbol���Ե�ֵ��
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
     * ��ȡsymbolPlacement���Ե�ֵ��
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
     * ����symbolPlacement���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencySymbolPlacement }
     *     
     */
    public void setSymbolPlacement(CurrencySymbolPlacement value) {
        this.symbolPlacement = value;
    }

    /**
     * ��ȡlocale���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CurrencyLocale }
     *     
     */
    public CurrencyLocale getLocale() {
        return locale;
    }

    /**
     * ����locale���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyLocale }
     *     
     */
    public void setLocale(CurrencyLocale value) {
        this.locale = value;
    }

    /**
     * ��ȡformatSample���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatSample() {
        return formatSample;
    }

    /**
     * ����formatSample���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatSample(String value) {
        this.formatSample = value;
    }

    /**
     * ��ȡexchangeRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * ����exchangeRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExchangeRate(Double value) {
        this.exchangeRate = value;
    }

    /**
     * ��ȡfxRateUpdateTimezone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CurrencyFxRateUpdateTimezone }
     *     
     */
    public CurrencyFxRateUpdateTimezone getFxRateUpdateTimezone() {
        return fxRateUpdateTimezone;
    }

    /**
     * ����fxRateUpdateTimezone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyFxRateUpdateTimezone }
     *     
     */
    public void setFxRateUpdateTimezone(CurrencyFxRateUpdateTimezone value) {
        this.fxRateUpdateTimezone = value;
    }

    /**
     * ��ȡinclInFxRateUpdates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclInFxRateUpdates() {
        return inclInFxRateUpdates;
    }

    /**
     * ����inclInFxRateUpdates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclInFxRateUpdates(Boolean value) {
        this.inclInFxRateUpdates = value;
    }

    /**
     * ��ȡcurrencyPrecision���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCurrencyPrecision }
     *     
     */
    public CurrencyCurrencyPrecision getCurrencyPrecision() {
        return currencyPrecision;
    }

    /**
     * ����currencyPrecision���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCurrencyPrecision }
     *     
     */
    public void setCurrencyPrecision(CurrencyCurrencyPrecision value) {
        this.currencyPrecision = value;
    }

    /**
     * ��ȡinternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * ����internalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * ��ȡexternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * ����externalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
