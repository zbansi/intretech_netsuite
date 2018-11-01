
package com.netsuite.webservices.transactions.demandplanning_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PeriodDemandPlanList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PeriodDemandPlanList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="periodDemandPlan" type="{urn:demandplanning_2018_2.transactions.webservices.netsuite.com}PeriodDemandPlan" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodDemandPlanList", propOrder = {
    "periodDemandPlan"
})
public class PeriodDemandPlanList {

    protected List<PeriodDemandPlan> periodDemandPlan;

    /**
     * Gets the value of the periodDemandPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodDemandPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodDemandPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodDemandPlan }
     * 
     * 
     */
    public List<PeriodDemandPlan> getPeriodDemandPlan() {
        if (periodDemandPlan == null) {
            periodDemandPlan = new ArrayList<PeriodDemandPlan>();
        }
        return this.periodDemandPlan;
    }

}
