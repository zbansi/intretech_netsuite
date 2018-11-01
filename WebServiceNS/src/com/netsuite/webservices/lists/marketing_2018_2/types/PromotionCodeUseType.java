
package com.netsuite.webservices.lists.marketing_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PromotionCodeUseType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionCodeUseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_multipleUses"/>
 *     &lt;enumeration value="_singleUse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionCodeUseType", namespace = "urn:types.marketing_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PromotionCodeUseType {

    @XmlEnumValue("_multipleUses")
    MULTIPLE_USES("_multipleUses"),
    @XmlEnumValue("_singleUse")
    SINGLE_USE("_singleUse");
    private final String value;

    PromotionCodeUseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionCodeUseType fromValue(String v) {
        for (PromotionCodeUseType c: PromotionCodeUseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
