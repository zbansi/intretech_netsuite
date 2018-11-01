
package com.netsuite.webservices.platform.common_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnBooleanField;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnDateField;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnStringField;
import com.netsuite.webservices.platform.core_2018_2.SearchRowBasic;


/**
 * <p>BomSearchRowBasic complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BomSearchRowBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRowBasic">
 *       &lt;sequence>
 *         &lt;element name="availableForAllAssemblies" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="availableForAllLocations" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="includeChildren" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="legacyBomForAssembly" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="memo" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="restrictToAssemblies" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="restrictToLocations" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="revisionName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subsidiaryNoHierarchy" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="useComponentYield" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="usedOnAssembly" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BomSearchRowBasic", propOrder = {
    "availableForAllAssemblies",
    "availableForAllLocations",
    "createdDate",
    "externalId",
    "includeChildren",
    "internalId",
    "isInactive",
    "legacyBomForAssembly",
    "memo",
    "name",
    "restrictToAssemblies",
    "restrictToLocations",
    "revisionName",
    "subsidiary",
    "subsidiaryNoHierarchy",
    "useComponentYield",
    "usedOnAssembly"
})
public class BomSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnBooleanField> availableForAllAssemblies;
    protected List<SearchColumnBooleanField> availableForAllLocations;
    protected List<SearchColumnDateField> createdDate;
    protected List<SearchColumnSelectField> externalId;
    protected List<SearchColumnBooleanField> includeChildren;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnBooleanField> isInactive;
    protected List<SearchColumnSelectField> legacyBomForAssembly;
    protected List<SearchColumnStringField> memo;
    protected List<SearchColumnStringField> name;
    protected List<SearchColumnSelectField> restrictToAssemblies;
    protected List<SearchColumnSelectField> restrictToLocations;
    protected List<SearchColumnStringField> revisionName;
    protected List<SearchColumnSelectField> subsidiary;
    protected List<SearchColumnSelectField> subsidiaryNoHierarchy;
    protected List<SearchColumnBooleanField> useComponentYield;
    protected List<SearchColumnBooleanField> usedOnAssembly;

    /**
     * Gets the value of the availableForAllAssemblies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableForAllAssemblies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableForAllAssemblies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getAvailableForAllAssemblies() {
        if (availableForAllAssemblies == null) {
            availableForAllAssemblies = new ArrayList<SearchColumnBooleanField>();
        }
        return this.availableForAllAssemblies;
    }

    /**
     * Gets the value of the availableForAllLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableForAllLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableForAllLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getAvailableForAllLocations() {
        if (availableForAllLocations == null) {
            availableForAllLocations = new ArrayList<SearchColumnBooleanField>();
        }
        return this.availableForAllLocations;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createdDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreatedDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getCreatedDate() {
        if (createdDate == null) {
            createdDate = new ArrayList<SearchColumnDateField>();
        }
        return this.createdDate;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getExternalId() {
        if (externalId == null) {
            externalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.externalId;
    }

    /**
     * Gets the value of the includeChildren property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeChildren property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIncludeChildren() {
        if (includeChildren == null) {
            includeChildren = new ArrayList<SearchColumnBooleanField>();
        }
        return this.includeChildren;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getInternalId() {
        if (internalId == null) {
            internalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.internalId;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isInactive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsInactive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsInactive() {
        if (isInactive == null) {
            isInactive = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isInactive;
    }

    /**
     * Gets the value of the legacyBomForAssembly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legacyBomForAssembly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegacyBomForAssembly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getLegacyBomForAssembly() {
        if (legacyBomForAssembly == null) {
            legacyBomForAssembly = new ArrayList<SearchColumnSelectField>();
        }
        return this.legacyBomForAssembly;
    }

    /**
     * Gets the value of the memo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMemo() {
        if (memo == null) {
            memo = new ArrayList<SearchColumnStringField>();
        }
        return this.memo;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getName() {
        if (name == null) {
            name = new ArrayList<SearchColumnStringField>();
        }
        return this.name;
    }

    /**
     * Gets the value of the restrictToAssemblies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictToAssemblies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictToAssemblies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getRestrictToAssemblies() {
        if (restrictToAssemblies == null) {
            restrictToAssemblies = new ArrayList<SearchColumnSelectField>();
        }
        return this.restrictToAssemblies;
    }

    /**
     * Gets the value of the restrictToLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictToLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictToLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getRestrictToLocations() {
        if (restrictToLocations == null) {
            restrictToLocations = new ArrayList<SearchColumnSelectField>();
        }
        return this.restrictToLocations;
    }

    /**
     * Gets the value of the revisionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revisionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevisionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getRevisionName() {
        if (revisionName == null) {
            revisionName = new ArrayList<SearchColumnStringField>();
        }
        return this.revisionName;
    }

    /**
     * Gets the value of the subsidiary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsidiary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidiary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSubsidiary() {
        if (subsidiary == null) {
            subsidiary = new ArrayList<SearchColumnSelectField>();
        }
        return this.subsidiary;
    }

    /**
     * Gets the value of the subsidiaryNoHierarchy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsidiaryNoHierarchy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidiaryNoHierarchy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSubsidiaryNoHierarchy() {
        if (subsidiaryNoHierarchy == null) {
            subsidiaryNoHierarchy = new ArrayList<SearchColumnSelectField>();
        }
        return this.subsidiaryNoHierarchy;
    }

    /**
     * Gets the value of the useComponentYield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useComponentYield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseComponentYield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getUseComponentYield() {
        if (useComponentYield == null) {
            useComponentYield = new ArrayList<SearchColumnBooleanField>();
        }
        return this.useComponentYield;
    }

    /**
     * Gets the value of the usedOnAssembly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usedOnAssembly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsedOnAssembly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getUsedOnAssembly() {
        if (usedOnAssembly == null) {
            usedOnAssembly = new ArrayList<SearchColumnBooleanField>();
        }
        return this.usedOnAssembly;
    }

}
