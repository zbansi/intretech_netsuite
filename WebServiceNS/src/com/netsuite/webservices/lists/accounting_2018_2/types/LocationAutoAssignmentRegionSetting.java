
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LocationAutoAssignmentRegionSetting的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LocationAutoAssignmentRegionSetting">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_allowSpecifiedRegionsOnly"/>
 *     &lt;enumeration value="_allowWorldwide"/>
 *     &lt;enumeration value="_allowWorldwideExceptExcludedRegions"/>
 *     &lt;enumeration value="_disallow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationAutoAssignmentRegionSetting", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum LocationAutoAssignmentRegionSetting {

    @XmlEnumValue("_allowSpecifiedRegionsOnly")
    ALLOW_SPECIFIED_REGIONS_ONLY("_allowSpecifiedRegionsOnly"),
    @XmlEnumValue("_allowWorldwide")
    ALLOW_WORLDWIDE("_allowWorldwide"),
    @XmlEnumValue("_allowWorldwideExceptExcludedRegions")
    ALLOW_WORLDWIDE_EXCEPT_EXCLUDED_REGIONS("_allowWorldwideExceptExcludedRegions"),
    @XmlEnumValue("_disallow")
    DISALLOW("_disallow");
    private final String value;

    LocationAutoAssignmentRegionSetting(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationAutoAssignmentRegionSetting fromValue(String v) {
        for (LocationAutoAssignmentRegionSetting c: LocationAutoAssignmentRegionSetting.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
