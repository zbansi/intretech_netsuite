
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AssemblyItemEffectiveBomControl�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="AssemblyItemEffectiveBomControl">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_effectiveDate"/>
 *     &lt;enumeration value="_revisionControl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssemblyItemEffectiveBomControl", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum AssemblyItemEffectiveBomControl {

    @XmlEnumValue("_effectiveDate")
    EFFECTIVE_DATE("_effectiveDate"),
    @XmlEnumValue("_revisionControl")
    REVISION_CONTROL("_revisionControl");
    private final String value;

    AssemblyItemEffectiveBomControl(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssemblyItemEffectiveBomControl fromValue(String v) {
        for (AssemblyItemEffectiveBomControl c: AssemblyItemEffectiveBomControl.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
