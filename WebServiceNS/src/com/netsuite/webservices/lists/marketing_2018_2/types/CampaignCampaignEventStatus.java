
package com.netsuite.webservices.lists.marketing_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CampaignCampaignEventStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignCampaignEventStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_completed"/>
 *     &lt;enumeration value="_execute"/>
 *     &lt;enumeration value="_inProgress"/>
 *     &lt;enumeration value="_notStarted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignCampaignEventStatus", namespace = "urn:types.marketing_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CampaignCampaignEventStatus {

    @XmlEnumValue("_completed")
    COMPLETED("_completed"),
    @XmlEnumValue("_execute")
    EXECUTE("_execute"),
    @XmlEnumValue("_inProgress")
    IN_PROGRESS("_inProgress"),
    @XmlEnumValue("_notStarted")
    NOT_STARTED("_notStarted");
    private final String value;

    CampaignCampaignEventStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignCampaignEventStatus fromValue(String v) {
        for (CampaignCampaignEventStatus c: CampaignCampaignEventStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
