
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemFulfillmentB13AFilingOptionFedEx的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentB13AFilingOptionFedEx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_filedElectronically"/>
 *     &lt;enumeration value="_manuallyAttached"/>
 *     &lt;enumeration value="_notRequired"/>
 *     &lt;enumeration value="_summaryReporting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentB13AFilingOptionFedEx", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentB13AFilingOptionFedEx {

    @XmlEnumValue("_filedElectronically")
    FILED_ELECTRONICALLY("_filedElectronically"),
    @XmlEnumValue("_manuallyAttached")
    MANUALLY_ATTACHED("_manuallyAttached"),
    @XmlEnumValue("_notRequired")
    NOT_REQUIRED("_notRequired"),
    @XmlEnumValue("_summaryReporting")
    SUMMARY_REPORTING("_summaryReporting");
    private final String value;

    ItemFulfillmentB13AFilingOptionFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentB13AFilingOptionFedEx fromValue(String v) {
        for (ItemFulfillmentB13AFilingOptionFedEx c: ItemFulfillmentB13AFilingOptionFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
