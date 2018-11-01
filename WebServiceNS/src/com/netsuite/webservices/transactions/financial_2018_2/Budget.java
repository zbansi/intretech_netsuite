
package com.netsuite.webservices.transactions.financial_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.transactions.financial_2018_2.types.BudgetBudgetType;


/**
 * <p>Budget complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Budget">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="year" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="customer" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="account" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="budgetType" type="{urn:types.financial_2018_2.transactions.webservices.netsuite.com}BudgetBudgetType" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="periodAmount1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount5" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount6" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount7" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount8" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount9" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount10" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount11" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount12" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount13" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount14" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount15" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount16" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount17" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount18" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount19" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount20" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount21" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount22" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount23" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodAmount24" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2018_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Budget", propOrder = {
    "year",
    "customer",
    "item",
    "clazz",
    "department",
    "location",
    "account",
    "subsidiary",
    "category",
    "budgetType",
    "currency",
    "periodAmount1",
    "periodAmount2",
    "periodAmount3",
    "periodAmount4",
    "periodAmount5",
    "periodAmount6",
    "periodAmount7",
    "periodAmount8",
    "periodAmount9",
    "periodAmount10",
    "periodAmount11",
    "periodAmount12",
    "periodAmount13",
    "periodAmount14",
    "periodAmount15",
    "periodAmount16",
    "periodAmount17",
    "periodAmount18",
    "periodAmount19",
    "periodAmount20",
    "periodAmount21",
    "periodAmount22",
    "periodAmount23",
    "periodAmount24",
    "amount",
    "customFieldList"
})
public class Budget
    extends Record
{

    protected RecordRef year;
    protected RecordRef customer;
    protected RecordRef item;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef department;
    protected RecordRef location;
    protected RecordRef account;
    protected RecordRef subsidiary;
    protected RecordRef category;
    @XmlSchemaType(name = "string")
    protected BudgetBudgetType budgetType;
    protected RecordRef currency;
    protected Double periodAmount1;
    protected Double periodAmount2;
    protected Double periodAmount3;
    protected Double periodAmount4;
    protected Double periodAmount5;
    protected Double periodAmount6;
    protected Double periodAmount7;
    protected Double periodAmount8;
    protected Double periodAmount9;
    protected Double periodAmount10;
    protected Double periodAmount11;
    protected Double periodAmount12;
    protected Double periodAmount13;
    protected Double periodAmount14;
    protected Double periodAmount15;
    protected Double periodAmount16;
    protected Double periodAmount17;
    protected Double periodAmount18;
    protected Double periodAmount19;
    protected Double periodAmount20;
    protected Double periodAmount21;
    protected Double periodAmount22;
    protected Double periodAmount23;
    protected Double periodAmount24;
    protected Double amount;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;

    /**
     * 获取year属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getYear() {
        return year;
    }

    /**
     * 设置year属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setYear(RecordRef value) {
        this.year = value;
    }

    /**
     * 获取customer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomer() {
        return customer;
    }

    /**
     * 设置customer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomer(RecordRef value) {
        this.customer = value;
    }

    /**
     * 获取item属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItem() {
        return item;
    }

    /**
     * 设置item属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItem(RecordRef value) {
        this.item = value;
    }

    /**
     * 获取clazz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getClazz() {
        return clazz;
    }

    /**
     * 设置clazz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setClazz(RecordRef value) {
        this.clazz = value;
    }

    /**
     * 获取department属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDepartment() {
        return department;
    }

    /**
     * 设置department属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDepartment(RecordRef value) {
        this.department = value;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocation(RecordRef value) {
        this.location = value;
    }

    /**
     * 获取account属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAccount() {
        return account;
    }

    /**
     * 设置account属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAccount(RecordRef value) {
        this.account = value;
    }

    /**
     * 获取subsidiary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubsidiary() {
        return subsidiary;
    }

    /**
     * 设置subsidiary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubsidiary(RecordRef value) {
        this.subsidiary = value;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCategory(RecordRef value) {
        this.category = value;
    }

    /**
     * 获取budgetType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BudgetBudgetType }
     *     
     */
    public BudgetBudgetType getBudgetType() {
        return budgetType;
    }

    /**
     * 设置budgetType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetBudgetType }
     *     
     */
    public void setBudgetType(BudgetBudgetType value) {
        this.budgetType = value;
    }

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
     * 获取periodAmount1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount1() {
        return periodAmount1;
    }

    /**
     * 设置periodAmount1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount1(Double value) {
        this.periodAmount1 = value;
    }

    /**
     * 获取periodAmount2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount2() {
        return periodAmount2;
    }

    /**
     * 设置periodAmount2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount2(Double value) {
        this.periodAmount2 = value;
    }

    /**
     * 获取periodAmount3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount3() {
        return periodAmount3;
    }

    /**
     * 设置periodAmount3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount3(Double value) {
        this.periodAmount3 = value;
    }

    /**
     * 获取periodAmount4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount4() {
        return periodAmount4;
    }

    /**
     * 设置periodAmount4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount4(Double value) {
        this.periodAmount4 = value;
    }

    /**
     * 获取periodAmount5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount5() {
        return periodAmount5;
    }

    /**
     * 设置periodAmount5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount5(Double value) {
        this.periodAmount5 = value;
    }

    /**
     * 获取periodAmount6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount6() {
        return periodAmount6;
    }

    /**
     * 设置periodAmount6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount6(Double value) {
        this.periodAmount6 = value;
    }

    /**
     * 获取periodAmount7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount7() {
        return periodAmount7;
    }

    /**
     * 设置periodAmount7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount7(Double value) {
        this.periodAmount7 = value;
    }

    /**
     * 获取periodAmount8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount8() {
        return periodAmount8;
    }

    /**
     * 设置periodAmount8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount8(Double value) {
        this.periodAmount8 = value;
    }

    /**
     * 获取periodAmount9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount9() {
        return periodAmount9;
    }

    /**
     * 设置periodAmount9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount9(Double value) {
        this.periodAmount9 = value;
    }

    /**
     * 获取periodAmount10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount10() {
        return periodAmount10;
    }

    /**
     * 设置periodAmount10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount10(Double value) {
        this.periodAmount10 = value;
    }

    /**
     * 获取periodAmount11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount11() {
        return periodAmount11;
    }

    /**
     * 设置periodAmount11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount11(Double value) {
        this.periodAmount11 = value;
    }

    /**
     * 获取periodAmount12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount12() {
        return periodAmount12;
    }

    /**
     * 设置periodAmount12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount12(Double value) {
        this.periodAmount12 = value;
    }

    /**
     * 获取periodAmount13属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount13() {
        return periodAmount13;
    }

    /**
     * 设置periodAmount13属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount13(Double value) {
        this.periodAmount13 = value;
    }

    /**
     * 获取periodAmount14属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount14() {
        return periodAmount14;
    }

    /**
     * 设置periodAmount14属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount14(Double value) {
        this.periodAmount14 = value;
    }

    /**
     * 获取periodAmount15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount15() {
        return periodAmount15;
    }

    /**
     * 设置periodAmount15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount15(Double value) {
        this.periodAmount15 = value;
    }

    /**
     * 获取periodAmount16属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount16() {
        return periodAmount16;
    }

    /**
     * 设置periodAmount16属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount16(Double value) {
        this.periodAmount16 = value;
    }

    /**
     * 获取periodAmount17属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount17() {
        return periodAmount17;
    }

    /**
     * 设置periodAmount17属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount17(Double value) {
        this.periodAmount17 = value;
    }

    /**
     * 获取periodAmount18属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount18() {
        return periodAmount18;
    }

    /**
     * 设置periodAmount18属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount18(Double value) {
        this.periodAmount18 = value;
    }

    /**
     * 获取periodAmount19属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount19() {
        return periodAmount19;
    }

    /**
     * 设置periodAmount19属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount19(Double value) {
        this.periodAmount19 = value;
    }

    /**
     * 获取periodAmount20属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount20() {
        return periodAmount20;
    }

    /**
     * 设置periodAmount20属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount20(Double value) {
        this.periodAmount20 = value;
    }

    /**
     * 获取periodAmount21属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount21() {
        return periodAmount21;
    }

    /**
     * 设置periodAmount21属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount21(Double value) {
        this.periodAmount21 = value;
    }

    /**
     * 获取periodAmount22属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount22() {
        return periodAmount22;
    }

    /**
     * 设置periodAmount22属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount22(Double value) {
        this.periodAmount22 = value;
    }

    /**
     * 获取periodAmount23属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount23() {
        return periodAmount23;
    }

    /**
     * 设置periodAmount23属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount23(Double value) {
        this.periodAmount23 = value;
    }

    /**
     * 获取periodAmount24属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount24() {
        return periodAmount24;
    }

    /**
     * 设置periodAmount24属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount24(Double value) {
        this.periodAmount24 = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * 获取customFieldList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * 设置customFieldList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
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

}
