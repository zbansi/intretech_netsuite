
package com.netsuite.webservices.platform.common_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnBooleanField;
import com.netsuite.webservices.platform.core_2018_2.SearchColumnSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchRowBasic;


/**
 * <p>AssemblyItemBomSearchRowBasic complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AssemblyItemBomSearchRowBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRowBasic">
 *       &lt;sequence>
 *         &lt;element name="assembly" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billOfMaterials" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="default" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locations" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssemblyItemBomSearchRowBasic", propOrder = {
    "assembly",
    "billOfMaterials",
    "_default",
    "locations"
})
public class AssemblyItemBomSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnSelectField> assembly;
    protected List<SearchColumnSelectField> billOfMaterials;
    @XmlElement(name = "default")
    protected List<SearchColumnBooleanField> _default;
    protected List<SearchColumnSelectField> locations;

    /**
     * Gets the value of the assembly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assembly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssembly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getAssembly() {
        if (assembly == null) {
            assembly = new ArrayList<SearchColumnSelectField>();
        }
        return this.assembly;
    }

    /**
     * Gets the value of the billOfMaterials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billOfMaterials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillOfMaterials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getBillOfMaterials() {
        if (billOfMaterials == null) {
            billOfMaterials = new ArrayList<SearchColumnSelectField>();
        }
        return this.billOfMaterials;
    }

    /**
     * Gets the value of the default property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the default property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getDefault() {
        if (_default == null) {
            _default = new ArrayList<SearchColumnBooleanField>();
        }
        return this._default;
    }

    /**
     * Gets the value of the locations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getLocations() {
        if (locations == null) {
            locations = new ArrayList<SearchColumnSelectField>();
        }
        return this.locations;
    }

}
