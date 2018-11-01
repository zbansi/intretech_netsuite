
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DoubleCustomFieldRef complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DoubleCustomFieldRef">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}CustomFieldRef">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoubleCustomFieldRef", propOrder = {
    "value"
})
public class DoubleCustomFieldRef
    extends CustomFieldRef
{

    protected double value;

    /**
     * 获取value属性的值。
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

}
