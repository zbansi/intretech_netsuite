
package com.netsuite.webservices.transactions.demandplanning_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemDemandPlanProjectionMethod�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ItemDemandPlanProjectionMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_linearRegression"/>
 *     &lt;enumeration value="_movingAverage"/>
 *     &lt;enumeration value="_salesForecast"/>
 *     &lt;enumeration value="_seasonalAverage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemDemandPlanProjectionMethod", namespace = "urn:types.demandplanning_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemDemandPlanProjectionMethod {

    @XmlEnumValue("_linearRegression")
    LINEAR_REGRESSION("_linearRegression"),
    @XmlEnumValue("_movingAverage")
    MOVING_AVERAGE("_movingAverage"),
    @XmlEnumValue("_salesForecast")
    SALES_FORECAST("_salesForecast"),
    @XmlEnumValue("_seasonalAverage")
    SEASONAL_AVERAGE("_seasonalAverage");
    private final String value;

    ItemDemandPlanProjectionMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemDemandPlanProjectionMethod fromValue(String v) {
        for (ItemDemandPlanProjectionMethod c: ItemDemandPlanProjectionMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
