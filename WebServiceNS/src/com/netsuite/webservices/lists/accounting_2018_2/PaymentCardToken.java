
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.accounting_2018_2.types.PaymentCardBrand;
import com.netsuite.webservices.lists.accounting_2018_2.types.PaymentCardType;
import com.netsuite.webservices.lists.accounting_2018_2.types.PaymentInstrumentState;
import com.netsuite.webservices.lists.accounting_2018_2.types.TokenFamily;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>PaymentCardToken complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaymentCardToken">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="entity" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="mask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}PaymentInstrumentState" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="preserveOnFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tokenFamily" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}TokenFamily" minOccurs="0"/>
 *         &lt;element name="tokenNamespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardIssuerIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardBrand" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}PaymentCardBrand" minOccurs="0"/>
 *         &lt;element name="cardType" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}PaymentCardType" minOccurs="0"/>
 *         &lt;element name="cardLastFourDigits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "PaymentCardToken", propOrder = {
    "entity",
    "mask",
    "paymentMethod",
    "memo",
    "state",
    "isInactive",
    "preserveOnFile",
    "isDefault",
    "token",
    "tokenExpirationDate",
    "tokenFamily",
    "tokenNamespace",
    "cardIssuerIdNumber",
    "cardBrand",
    "cardType",
    "cardLastFourDigits",
    "cardExpirationDate"
})
public class PaymentCardToken
    extends Record
{

    protected RecordRef entity;
    protected String mask;
    protected RecordRef paymentMethod;
    protected String memo;
    @XmlSchemaType(name = "string")
    protected PaymentInstrumentState state;
    protected Boolean isInactive;
    protected Boolean preserveOnFile;
    protected Boolean isDefault;
    protected String token;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tokenExpirationDate;
    @XmlSchemaType(name = "string")
    protected TokenFamily tokenFamily;
    protected String tokenNamespace;
    protected String cardIssuerIdNumber;
    @XmlSchemaType(name = "string")
    protected PaymentCardBrand cardBrand;
    @XmlSchemaType(name = "string")
    protected PaymentCardType cardType;
    protected String cardLastFourDigits;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cardExpirationDate;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * 获取entity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEntity() {
        return entity;
    }

    /**
     * 设置entity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEntity(RecordRef value) {
        this.entity = value;
    }

    /**
     * 获取mask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * 设置mask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * 获取paymentMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置paymentMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPaymentMethod(RecordRef value) {
        this.paymentMethod = value;
    }

    /**
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentState }
     *     
     */
    public PaymentInstrumentState getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentState }
     *     
     */
    public void setState(PaymentInstrumentState value) {
        this.state = value;
    }

    /**
     * 获取isInactive属性的值。
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
     * 设置isInactive属性的值。
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
     * 获取preserveOnFile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreserveOnFile() {
        return preserveOnFile;
    }

    /**
     * 设置preserveOnFile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreserveOnFile(Boolean value) {
        this.preserveOnFile = value;
    }

    /**
     * 获取isDefault属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * 设置isDefault属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * 获取token属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置token属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * 获取tokenExpirationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTokenExpirationDate() {
        return tokenExpirationDate;
    }

    /**
     * 设置tokenExpirationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTokenExpirationDate(XMLGregorianCalendar value) {
        this.tokenExpirationDate = value;
    }

    /**
     * 获取tokenFamily属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TokenFamily }
     *     
     */
    public TokenFamily getTokenFamily() {
        return tokenFamily;
    }

    /**
     * 设置tokenFamily属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TokenFamily }
     *     
     */
    public void setTokenFamily(TokenFamily value) {
        this.tokenFamily = value;
    }

    /**
     * 获取tokenNamespace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenNamespace() {
        return tokenNamespace;
    }

    /**
     * 设置tokenNamespace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenNamespace(String value) {
        this.tokenNamespace = value;
    }

    /**
     * 获取cardIssuerIdNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuerIdNumber() {
        return cardIssuerIdNumber;
    }

    /**
     * 设置cardIssuerIdNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuerIdNumber(String value) {
        this.cardIssuerIdNumber = value;
    }

    /**
     * 获取cardBrand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardBrand }
     *     
     */
    public PaymentCardBrand getCardBrand() {
        return cardBrand;
    }

    /**
     * 设置cardBrand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardBrand }
     *     
     */
    public void setCardBrand(PaymentCardBrand value) {
        this.cardBrand = value;
    }

    /**
     * 获取cardType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType }
     *     
     */
    public PaymentCardType getCardType() {
        return cardType;
    }

    /**
     * 设置cardType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType }
     *     
     */
    public void setCardType(PaymentCardType value) {
        this.cardType = value;
    }

    /**
     * 获取cardLastFourDigits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLastFourDigits() {
        return cardLastFourDigits;
    }

    /**
     * 设置cardLastFourDigits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLastFourDigits(String value) {
        this.cardLastFourDigits = value;
    }

    /**
     * 获取cardExpirationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardExpirationDate() {
        return cardExpirationDate;
    }

    /**
     * 设置cardExpirationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardExpirationDate(XMLGregorianCalendar value) {
        this.cardExpirationDate = value;
    }

    /**
     * 获取internalId属性的值。
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
     * 设置internalId属性的值。
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
     * 获取externalId属性的值。
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
     * 设置externalId属性的值。
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
