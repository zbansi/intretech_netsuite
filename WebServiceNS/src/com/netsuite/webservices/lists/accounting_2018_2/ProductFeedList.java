
package com.netsuite.webservices.lists.accounting_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemProductFeed;


/**
 * <p>ProductFeedList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProductFeedList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productFeed" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemProductFeed" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductFeedList", propOrder = {
    "productFeed"
})
public class ProductFeedList {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<ItemProductFeed> productFeed;

    /**
     * Gets the value of the productFeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemProductFeed }
     * 
     * 
     */
    public List<ItemProductFeed> getProductFeed() {
        if (productFeed == null) {
            productFeed = new ArrayList<ItemProductFeed>();
        }
        return this.productFeed;
    }

}
