
package com.netsuite.webservices.transactions.general_2018_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.transactions.general_2018_2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StatisticalJournalEntry_QNAME = new QName("urn:general_2018_2.transactions.webservices.netsuite.com", "StatisticalJournalEntry");
    private final static QName _InterCompanyJournalEntry_QNAME = new QName("urn:general_2018_2.transactions.webservices.netsuite.com", "InterCompanyJournalEntry");
    private final static QName _JournalEntry_QNAME = new QName("urn:general_2018_2.transactions.webservices.netsuite.com", "JournalEntry");
    private final static QName _AdvInterCompanyJournalEntry_QNAME = new QName("urn:general_2018_2.transactions.webservices.netsuite.com", "AdvInterCompanyJournalEntry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.transactions.general_2018_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StatisticalJournalEntry }
     * 
     */
    public StatisticalJournalEntry createStatisticalJournalEntry() {
        return new StatisticalJournalEntry();
    }

    /**
     * Create an instance of {@link InterCompanyJournalEntry }
     * 
     */
    public InterCompanyJournalEntry createInterCompanyJournalEntry() {
        return new InterCompanyJournalEntry();
    }

    /**
     * Create an instance of {@link AdvInterCompanyJournalEntry }
     * 
     */
    public AdvInterCompanyJournalEntry createAdvInterCompanyJournalEntry() {
        return new AdvInterCompanyJournalEntry();
    }

    /**
     * Create an instance of {@link JournalEntry }
     * 
     */
    public JournalEntry createJournalEntry() {
        return new JournalEntry();
    }

    /**
     * Create an instance of {@link StatisticalJournalEntryLine }
     * 
     */
    public StatisticalJournalEntryLine createStatisticalJournalEntryLine() {
        return new StatisticalJournalEntryLine();
    }

    /**
     * Create an instance of {@link AdvInterCompanyJournalEntryLineList }
     * 
     */
    public AdvInterCompanyJournalEntryLineList createAdvInterCompanyJournalEntryLineList() {
        return new AdvInterCompanyJournalEntryLineList();
    }

    /**
     * Create an instance of {@link InterCompanyJournalEntryAccountingBookDetail }
     * 
     */
    public InterCompanyJournalEntryAccountingBookDetail createInterCompanyJournalEntryAccountingBookDetail() {
        return new InterCompanyJournalEntryAccountingBookDetail();
    }

    /**
     * Create an instance of {@link InterCompanyJournalEntryLineList }
     * 
     */
    public InterCompanyJournalEntryLineList createInterCompanyJournalEntryLineList() {
        return new InterCompanyJournalEntryLineList();
    }

    /**
     * Create an instance of {@link StatisticalJournalEntryLineList }
     * 
     */
    public StatisticalJournalEntryLineList createStatisticalJournalEntryLineList() {
        return new StatisticalJournalEntryLineList();
    }

    /**
     * Create an instance of {@link JournalEntryLineList }
     * 
     */
    public JournalEntryLineList createJournalEntryLineList() {
        return new JournalEntryLineList();
    }

    /**
     * Create an instance of {@link AdvInterCompanyJournalEntryLine }
     * 
     */
    public AdvInterCompanyJournalEntryLine createAdvInterCompanyJournalEntryLine() {
        return new AdvInterCompanyJournalEntryLine();
    }

    /**
     * Create an instance of {@link InterCompanyJournalEntryAccountingBookDetailList }
     * 
     */
    public InterCompanyJournalEntryAccountingBookDetailList createInterCompanyJournalEntryAccountingBookDetailList() {
        return new InterCompanyJournalEntryAccountingBookDetailList();
    }

    /**
     * Create an instance of {@link JournalEntryLine }
     * 
     */
    public JournalEntryLine createJournalEntryLine() {
        return new JournalEntryLine();
    }

    /**
     * Create an instance of {@link AdvInterCompanyJournalEntryAccountingBookDetailList }
     * 
     */
    public AdvInterCompanyJournalEntryAccountingBookDetailList createAdvInterCompanyJournalEntryAccountingBookDetailList() {
        return new AdvInterCompanyJournalEntryAccountingBookDetailList();
    }

    /**
     * Create an instance of {@link InterCompanyJournalEntryLine }
     * 
     */
    public InterCompanyJournalEntryLine createInterCompanyJournalEntryLine() {
        return new InterCompanyJournalEntryLine();
    }

    /**
     * Create an instance of {@link AdvInterCompanyJournalEntryAccountingBookDetail }
     * 
     */
    public AdvInterCompanyJournalEntryAccountingBookDetail createAdvInterCompanyJournalEntryAccountingBookDetail() {
        return new AdvInterCompanyJournalEntryAccountingBookDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatisticalJournalEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:general_2018_2.transactions.webservices.netsuite.com", name = "StatisticalJournalEntry")
    public JAXBElement<StatisticalJournalEntry> createStatisticalJournalEntry(StatisticalJournalEntry value) {
        return new JAXBElement<StatisticalJournalEntry>(_StatisticalJournalEntry_QNAME, StatisticalJournalEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterCompanyJournalEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:general_2018_2.transactions.webservices.netsuite.com", name = "InterCompanyJournalEntry")
    public JAXBElement<InterCompanyJournalEntry> createInterCompanyJournalEntry(InterCompanyJournalEntry value) {
        return new JAXBElement<InterCompanyJournalEntry>(_InterCompanyJournalEntry_QNAME, InterCompanyJournalEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JournalEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:general_2018_2.transactions.webservices.netsuite.com", name = "JournalEntry")
    public JAXBElement<JournalEntry> createJournalEntry(JournalEntry value) {
        return new JAXBElement<JournalEntry>(_JournalEntry_QNAME, JournalEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvInterCompanyJournalEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:general_2018_2.transactions.webservices.netsuite.com", name = "AdvInterCompanyJournalEntry")
    public JAXBElement<AdvInterCompanyJournalEntry> createAdvInterCompanyJournalEntry(AdvInterCompanyJournalEntry value) {
        return new JAXBElement<AdvInterCompanyJournalEntry>(_AdvInterCompanyJournalEntry_QNAME, AdvInterCompanyJournalEntry.class, null, value);
    }

}
