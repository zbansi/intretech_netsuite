
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BooleanCustomFieldRef complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BooleanCustomFieldRef">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}CustomFieldRef">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BooleanCustomFieldRef", propOrder = {
    "value"
})
public class BooleanCustomFieldRef
    extends CustomFieldRef
{

    protected boolean value;

    /**
     * 获取value属性的值。
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

}
