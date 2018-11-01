
package com.netsuite.webservices.platform.core_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetAllRecordType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="GetAllRecordType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="budgetCategory"/>
 *     &lt;enumeration value="campaignAudience"/>
 *     &lt;enumeration value="campaignCategory"/>
 *     &lt;enumeration value="campaignChannel"/>
 *     &lt;enumeration value="campaignFamily"/>
 *     &lt;enumeration value="campaignOffer"/>
 *     &lt;enumeration value="campaignSearchEngine"/>
 *     &lt;enumeration value="campaignSubscription"/>
 *     &lt;enumeration value="campaignVertical"/>
 *     &lt;enumeration value="currency"/>
 *     &lt;enumeration value="leadSource"/>
 *     &lt;enumeration value="state"/>
 *     &lt;enumeration value="supportCaseIssue"/>
 *     &lt;enumeration value="supportCaseOrigin"/>
 *     &lt;enumeration value="supportCasePriority"/>
 *     &lt;enumeration value="supportCaseStatus"/>
 *     &lt;enumeration value="supportCaseType"/>
 *     &lt;enumeration value="taxAcct"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetAllRecordType", namespace = "urn:types.core_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum GetAllRecordType {

    @XmlEnumValue("budgetCategory")
    BUDGET_CATEGORY("budgetCategory"),
    @XmlEnumValue("campaignAudience")
    CAMPAIGN_AUDIENCE("campaignAudience"),
    @XmlEnumValue("campaignCategory")
    CAMPAIGN_CATEGORY("campaignCategory"),
    @XmlEnumValue("campaignChannel")
    CAMPAIGN_CHANNEL("campaignChannel"),
    @XmlEnumValue("campaignFamily")
    CAMPAIGN_FAMILY("campaignFamily"),
    @XmlEnumValue("campaignOffer")
    CAMPAIGN_OFFER("campaignOffer"),
    @XmlEnumValue("campaignSearchEngine")
    CAMPAIGN_SEARCH_ENGINE("campaignSearchEngine"),
    @XmlEnumValue("campaignSubscription")
    CAMPAIGN_SUBSCRIPTION("campaignSubscription"),
    @XmlEnumValue("campaignVertical")
    CAMPAIGN_VERTICAL("campaignVertical"),
    @XmlEnumValue("currency")
    CURRENCY("currency"),
    @XmlEnumValue("leadSource")
    LEAD_SOURCE("leadSource"),
    @XmlEnumValue("state")
    STATE("state"),
    @XmlEnumValue("supportCaseIssue")
    SUPPORT_CASE_ISSUE("supportCaseIssue"),
    @XmlEnumValue("supportCaseOrigin")
    SUPPORT_CASE_ORIGIN("supportCaseOrigin"),
    @XmlEnumValue("supportCasePriority")
    SUPPORT_CASE_PRIORITY("supportCasePriority"),
    @XmlEnumValue("supportCaseStatus")
    SUPPORT_CASE_STATUS("supportCaseStatus"),
    @XmlEnumValue("supportCaseType")
    SUPPORT_CASE_TYPE("supportCaseType"),
    @XmlEnumValue("taxAcct")
    TAX_ACCT("taxAcct");
    private final String value;

    GetAllRecordType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetAllRecordType fromValue(String v) {
        for (GetAllRecordType c: GetAllRecordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
