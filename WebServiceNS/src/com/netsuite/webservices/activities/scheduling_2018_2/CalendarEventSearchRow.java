
package com.netsuite.webservices.activities.scheduling_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.CalendarEventSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.EntitySearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.FileSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.OpportunitySearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.OriginatingLeadSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.SupportCaseSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeBillSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>CalendarEventSearchRow complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CalendarEventSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}CalendarEventSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="attendeeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EntitySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="attendeeContactJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="attendeeCustomerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="caseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SupportCaseSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="opportunityJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}OpportunitySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="originatingLeadJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}OriginatingLeadSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="timeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TimeBillSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}NoteSearchRowBasic" minOccurs="0"/>
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
@XmlType(name = "CalendarEventSearchRow", propOrder = {
    "basic",
    "attendeeJoin",
    "attendeeContactJoin",
    "attendeeCustomerJoin",
    "caseJoin",
    "fileJoin",
    "opportunityJoin",
    "originatingLeadJoin",
    "timeJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "customSearchJoin"
})
public class CalendarEventSearchRow
    extends SearchRow
{

    protected CalendarEventSearchRowBasic basic;
    protected EntitySearchRowBasic attendeeJoin;
    protected ContactSearchRowBasic attendeeContactJoin;
    protected CustomerSearchRowBasic attendeeCustomerJoin;
    protected SupportCaseSearchRowBasic caseJoin;
    protected FileSearchRowBasic fileJoin;
    protected OpportunitySearchRowBasic opportunityJoin;
    protected OriginatingLeadSearchRowBasic originatingLeadJoin;
    protected TimeBillSearchRowBasic timeJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public CalendarEventSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public void setBasic(CalendarEventSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡattendeeJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public EntitySearchRowBasic getAttendeeJoin() {
        return attendeeJoin;
    }

    /**
     * ����attendeeJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public void setAttendeeJoin(EntitySearchRowBasic value) {
        this.attendeeJoin = value;
    }

    /**
     * ��ȡattendeeContactJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public ContactSearchRowBasic getAttendeeContactJoin() {
        return attendeeContactJoin;
    }

    /**
     * ����attendeeContactJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public void setAttendeeContactJoin(ContactSearchRowBasic value) {
        this.attendeeContactJoin = value;
    }

    /**
     * ��ȡattendeeCustomerJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getAttendeeCustomerJoin() {
        return attendeeCustomerJoin;
    }

    /**
     * ����attendeeCustomerJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setAttendeeCustomerJoin(CustomerSearchRowBasic value) {
        this.attendeeCustomerJoin = value;
    }

    /**
     * ��ȡcaseJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }

    /**
     * ����caseJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public void setCaseJoin(SupportCaseSearchRowBasic value) {
        this.caseJoin = value;
    }

    /**
     * ��ȡfileJoin���Ե�ֵ��
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
     * ����fileJoin���Ե�ֵ��
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
     * ��ȡopportunityJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public OpportunitySearchRowBasic getOpportunityJoin() {
        return opportunityJoin;
    }

    /**
     * ����opportunityJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public void setOpportunityJoin(OpportunitySearchRowBasic value) {
        this.opportunityJoin = value;
    }

    /**
     * ��ȡoriginatingLeadJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OriginatingLeadSearchRowBasic }
     *     
     */
    public OriginatingLeadSearchRowBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }

    /**
     * ����originatingLeadJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatingLeadSearchRowBasic }
     *     
     */
    public void setOriginatingLeadJoin(OriginatingLeadSearchRowBasic value) {
        this.originatingLeadJoin = value;
    }

    /**
     * ��ȡtimeJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public TimeBillSearchRowBasic getTimeJoin() {
        return timeJoin;
    }

    /**
     * ����timeJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public void setTimeJoin(TimeBillSearchRowBasic value) {
        this.timeJoin = value;
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
     * ��ȡuserJoin���Ե�ֵ��
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
     * ����userJoin���Ե�ֵ��
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
     * ��ȡuserNotesJoin���Ե�ֵ��
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
     * ����userNotesJoin���Ե�ֵ��
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
