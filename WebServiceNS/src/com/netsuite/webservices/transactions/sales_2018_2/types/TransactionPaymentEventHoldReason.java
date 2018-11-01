
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransactionPaymentEventHoldReason的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionPaymentEventHoldReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_amountExceedsMaximumAllowedAmount"/>
 *     &lt;enumeration value="_authorizationDecline"/>
 *     &lt;enumeration value="_cardExpired"/>
 *     &lt;enumeration value="_cardInvalid"/>
 *     &lt;enumeration value="_confirmationOfTheOperationIsPending"/>
 *     &lt;enumeration value="_externalFraudRejection"/>
 *     &lt;enumeration value="_externalFraudReview"/>
 *     &lt;enumeration value="_fatalError"/>
 *     &lt;enumeration value="_forwardedToPayerAuthentication"/>
 *     &lt;enumeration value="_forwardRequested"/>
 *     &lt;enumeration value="_gatewayAsynchronousNotification"/>
 *     &lt;enumeration value="_gatewayError"/>
 *     &lt;enumeration value="_generalHold"/>
 *     &lt;enumeration value="_generalReject"/>
 *     &lt;enumeration value="_operationWasSuccessful"/>
 *     &lt;enumeration value="_operationWasTerminated"/>
 *     &lt;enumeration value="_overridenBy"/>
 *     &lt;enumeration value="_partnerDecline"/>
 *     &lt;enumeration value="_paymentDeviceWasPrimed"/>
 *     &lt;enumeration value="_paymentOperationWasCanceled"/>
 *     &lt;enumeration value="_systemError"/>
 *     &lt;enumeration value="_verbalAuthorizationRequested"/>
 *     &lt;enumeration value="_verificationRejection"/>
 *     &lt;enumeration value="_verificationRequired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionPaymentEventHoldReason", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionPaymentEventHoldReason {

    @XmlEnumValue("_amountExceedsMaximumAllowedAmount")
    AMOUNT_EXCEEDS_MAXIMUM_ALLOWED_AMOUNT("_amountExceedsMaximumAllowedAmount"),
    @XmlEnumValue("_authorizationDecline")
    AUTHORIZATION_DECLINE("_authorizationDecline"),
    @XmlEnumValue("_cardExpired")
    CARD_EXPIRED("_cardExpired"),
    @XmlEnumValue("_cardInvalid")
    CARD_INVALID("_cardInvalid"),
    @XmlEnumValue("_confirmationOfTheOperationIsPending")
    CONFIRMATION_OF_THE_OPERATION_IS_PENDING("_confirmationOfTheOperationIsPending"),
    @XmlEnumValue("_externalFraudRejection")
    EXTERNAL_FRAUD_REJECTION("_externalFraudRejection"),
    @XmlEnumValue("_externalFraudReview")
    EXTERNAL_FRAUD_REVIEW("_externalFraudReview"),
    @XmlEnumValue("_fatalError")
    FATAL_ERROR("_fatalError"),
    @XmlEnumValue("_forwardedToPayerAuthentication")
    FORWARDED_TO_PAYER_AUTHENTICATION("_forwardedToPayerAuthentication"),
    @XmlEnumValue("_forwardRequested")
    FORWARD_REQUESTED("_forwardRequested"),
    @XmlEnumValue("_gatewayAsynchronousNotification")
    GATEWAY_ASYNCHRONOUS_NOTIFICATION("_gatewayAsynchronousNotification"),
    @XmlEnumValue("_gatewayError")
    GATEWAY_ERROR("_gatewayError"),
    @XmlEnumValue("_generalHold")
    GENERAL_HOLD("_generalHold"),
    @XmlEnumValue("_generalReject")
    GENERAL_REJECT("_generalReject"),
    @XmlEnumValue("_operationWasSuccessful")
    OPERATION_WAS_SUCCESSFUL("_operationWasSuccessful"),
    @XmlEnumValue("_operationWasTerminated")
    OPERATION_WAS_TERMINATED("_operationWasTerminated"),
    @XmlEnumValue("_overridenBy")
    OVERRIDEN_BY("_overridenBy"),
    @XmlEnumValue("_partnerDecline")
    PARTNER_DECLINE("_partnerDecline"),
    @XmlEnumValue("_paymentDeviceWasPrimed")
    PAYMENT_DEVICE_WAS_PRIMED("_paymentDeviceWasPrimed"),
    @XmlEnumValue("_paymentOperationWasCanceled")
    PAYMENT_OPERATION_WAS_CANCELED("_paymentOperationWasCanceled"),
    @XmlEnumValue("_systemError")
    SYSTEM_ERROR("_systemError"),
    @XmlEnumValue("_verbalAuthorizationRequested")
    VERBAL_AUTHORIZATION_REQUESTED("_verbalAuthorizationRequested"),
    @XmlEnumValue("_verificationRejection")
    VERIFICATION_REJECTION("_verificationRejection"),
    @XmlEnumValue("_verificationRequired")
    VERIFICATION_REQUIRED("_verificationRequired");
    private final String value;

    TransactionPaymentEventHoldReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionPaymentEventHoldReason fromValue(String v) {
        for (TransactionPaymentEventHoldReason c: TransactionPaymentEventHoldReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
