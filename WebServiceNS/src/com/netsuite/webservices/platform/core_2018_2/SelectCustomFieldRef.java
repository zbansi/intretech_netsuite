
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SelectCustomFieldRef complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SelectCustomFieldRef">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}CustomFieldRef">
 *       &lt;sequence>
 *         &lt;element name="value" type="{urn:core_2018_2.platform.webservices.netsuite.com}ListOrRecordRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectCustomFieldRef", propOrder = {
    "value"
})
public class SelectCustomFieldRef
    extends CustomFieldRef
{

    @XmlElement(required = true)
    protected ListOrRecordRef value;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ListOrRecordRef }
     *     
     */
    public ListOrRecordRef getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ListOrRecordRef }
     *     
     */
    public void setValue(ListOrRecordRef value) {
        this.value = value;
    }

}
