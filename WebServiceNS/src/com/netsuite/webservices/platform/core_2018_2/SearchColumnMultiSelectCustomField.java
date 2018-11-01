
package com.netsuite.webservices.platform.core_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SearchColumnMultiSelectCustomField complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchColumnMultiSelectCustomField">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchColumnCustomField">
 *       &lt;sequence>
 *         &lt;element name="searchValue" type="{urn:core_2018_2.platform.webservices.netsuite.com}ListOrRecordRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchColumnMultiSelectCustomField", propOrder = {
    "searchValue"
})
public class SearchColumnMultiSelectCustomField
    extends SearchColumnCustomField
{

    protected List<ListOrRecordRef> searchValue;

    /**
     * Gets the value of the searchValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOrRecordRef }
     * 
     * 
     */
    public List<ListOrRecordRef> getSearchValue() {
        if (searchValue == null) {
            searchValue = new ArrayList<ListOrRecordRef>();
        }
        return this.searchValue;
    }

}
