
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemFulfillmentTermsOfSaleFedEx的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentTermsOfSaleFedEx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_cfr"/>
 *     &lt;enumeration value="_cif"/>
 *     &lt;enumeration value="_cip"/>
 *     &lt;enumeration value="_cpt"/>
 *     &lt;enumeration value="_dap"/>
 *     &lt;enumeration value="_dat"/>
 *     &lt;enumeration value="_ddp"/>
 *     &lt;enumeration value="_ddu"/>
 *     &lt;enumeration value="_exw"/>
 *     &lt;enumeration value="_fca"/>
 *     &lt;enumeration value="_fob"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentTermsOfSaleFedEx", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentTermsOfSaleFedEx {

    @XmlEnumValue("_cfr")
    CFR("_cfr"),
    @XmlEnumValue("_cif")
    CIF("_cif"),
    @XmlEnumValue("_cip")
    CIP("_cip"),
    @XmlEnumValue("_cpt")
    CPT("_cpt"),
    @XmlEnumValue("_dap")
    DAP("_dap"),
    @XmlEnumValue("_dat")
    DAT("_dat"),
    @XmlEnumValue("_ddp")
    DDP("_ddp"),
    @XmlEnumValue("_ddu")
    DDU("_ddu"),
    @XmlEnumValue("_exw")
    EXW("_exw"),
    @XmlEnumValue("_fca")
    FCA("_fca"),
    @XmlEnumValue("_fob")
    FOB("_fob");
    private final String value;

    ItemFulfillmentTermsOfSaleFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentTermsOfSaleFedEx fromValue(String v) {
        for (ItemFulfillmentTermsOfSaleFedEx c: ItemFulfillmentTermsOfSaleFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
