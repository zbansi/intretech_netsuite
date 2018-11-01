
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.types.Language;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>AccountLocalizations complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccountLocalizations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountingContext" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="acctNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acctName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locale" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}Language" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountLocalizations", propOrder = {
    "accountingContext",
    "acctNumber",
    "acctName",
    "legalName",
    "locale"
})
public class AccountLocalizations {

    protected RecordRef accountingContext;
    protected String acctNumber;
    protected String acctName;
    protected String legalName;
    @XmlSchemaType(name = "string")
    protected Language locale;

    /**
     * 获取accountingContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAccountingContext() {
        return accountingContext;
    }

    /**
     * 设置accountingContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAccountingContext(RecordRef value) {
        this.accountingContext = value;
    }

    /**
     * 获取acctNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNumber() {
        return acctNumber;
    }

    /**
     * 设置acctNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNumber(String value) {
        this.acctNumber = value;
    }

    /**
     * 获取acctName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * 设置acctName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
    }

    /**
     * 获取legalName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * 设置legalName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * 获取locale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLocale() {
        return locale;
    }

    /**
     * 设置locale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLocale(Language value) {
        this.locale = value;
    }

}
