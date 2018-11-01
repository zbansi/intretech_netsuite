
package com.netsuite.webservices.transactions.sales_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.common_2018_2.AccountingBookDetailList;
import com.netsuite.webservices.platform.common_2018_2.Address;
import com.netsuite.webservices.platform.common_2018_2.types.Country;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentAccessibilityTypeFedEx;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentAncillaryEndorsementFedEx;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentB13AFilingOptionFedEx;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentExportTypeUps;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentHazmatTypeFedEx;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentHomeDeliveryTypeFedEx;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentLicenseExceptionUps;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentMethodOfTransportUps;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentShipStatus;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentTermsOfSaleFedEx;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentThirdPartyTypeFedEx;
import com.netsuite.webservices.transactions.sales_2018_2.types.ItemFulfillmentThirdPartyTypeUps;


/**
 * <p>ItemFulfillment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemFulfillment">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="postingPeriod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="entity" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="createdFrom" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="requestedBy" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="createdFromShipGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="partner" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shippingAddress" type="{urn:common_2018_2.platform.webservices.netsuite.com}Address" minOccurs="0"/>
 *         &lt;element name="pickedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="packedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="shippedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="shipIsResidential" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shipAddressList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shipStatus" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentShipStatus" minOccurs="0"/>
 *         &lt;element name="saturdayDeliveryUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendShipNotifyEmailUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendBackupEmailUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shipNotifyEmailAddressUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipNotifyEmailAddress2Ups" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backupEmailAddressUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipNotifyEmailMessageUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyAcctUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyZipcodeUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyCountryUps" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *         &lt;element name="thirdPartyTypeUps" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentThirdPartyTypeUps" minOccurs="0"/>
 *         &lt;element name="partiesToTransactionUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="exportTypeUps" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentExportTypeUps" minOccurs="0"/>
 *         &lt;element name="methodOfTransportUps" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentMethodOfTransportUps" minOccurs="0"/>
 *         &lt;element name="carrierIdUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entryNumberUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inbondCodeUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isRoutedExportTransactionUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="licenseNumberUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenseDateUps" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="licenseExceptionUps" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentLicenseExceptionUps" minOccurs="0"/>
 *         &lt;element name="eccNumberUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientTaxIdUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blanketStartDateUps" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="blanketEndDateUps" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="shipmentWeightUps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="saturdayDeliveryFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="saturdayPickupFedex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendShipNotifyEmailFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendBackupEmailFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="signatureHomeDeliveryFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shipNotifyEmailAddressFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backupEmailAddressFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipDateFedEx" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="homeDeliveryTypeFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentHomeDeliveryTypeFedEx" minOccurs="0"/>
 *         &lt;element name="homeDeliveryDateFedEx" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bookingConfirmationNumFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intlExemptionNumFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="b13aFilingOptionFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentB13AFilingOptionFedEx" minOccurs="0"/>
 *         &lt;element name="b13aStatementDataFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyAcctFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyCountryFedEx" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *         &lt;element name="thirdPartyTypeFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentThirdPartyTypeFedEx" minOccurs="0"/>
 *         &lt;element name="shipmentWeightFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="termsOfSaleFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentTermsOfSaleFedEx" minOccurs="0"/>
 *         &lt;element name="termsFreightChargeFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="termsInsuranceChargeFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="insideDeliveryFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="insidePickupFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ancillaryEndorsementFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentAncillaryEndorsementFedEx" minOccurs="0"/>
 *         &lt;element name="holdAtLocationFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="halPhoneFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="halAddr1FedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="halAddr2FedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="halAddr3FedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="halCityFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="halZipFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="halStateFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="halCountryFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hazmatTypeFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentHazmatTypeFedEx" minOccurs="0"/>
 *         &lt;element name="accessibilityTypeFedEx" type="{urn:types.sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentAccessibilityTypeFedEx" minOccurs="0"/>
 *         &lt;element name="isCargoAircraftOnlyFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tranDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tranId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="generateIntegratedShipperLabel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shippingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="handlingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transferLocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="packageList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageList" minOccurs="0"/>
 *         &lt;element name="packageUpsList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUpsList" minOccurs="0"/>
 *         &lt;element name="packageUspsList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUspsList" minOccurs="0"/>
 *         &lt;element name="packageFedExList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExList" minOccurs="0"/>
 *         &lt;element name="itemList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}ItemFulfillmentItemList" minOccurs="0"/>
 *         &lt;element name="accountingBookDetailList" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountingBookDetailList" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2018_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemFulfillment", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "customForm",
    "postingPeriod",
    "entity",
    "createdFrom",
    "requestedBy",
    "createdFromShipGroup",
    "partner",
    "shippingAddress",
    "pickedDate",
    "packedDate",
    "shippedDate",
    "shipIsResidential",
    "shipAddressList",
    "shipStatus",
    "saturdayDeliveryUps",
    "sendShipNotifyEmailUps",
    "sendBackupEmailUps",
    "shipNotifyEmailAddressUps",
    "shipNotifyEmailAddress2Ups",
    "backupEmailAddressUps",
    "shipNotifyEmailMessageUps",
    "thirdPartyAcctUps",
    "thirdPartyZipcodeUps",
    "thirdPartyCountryUps",
    "thirdPartyTypeUps",
    "partiesToTransactionUps",
    "exportTypeUps",
    "methodOfTransportUps",
    "carrierIdUps",
    "entryNumberUps",
    "inbondCodeUps",
    "isRoutedExportTransactionUps",
    "licenseNumberUps",
    "licenseDateUps",
    "licenseExceptionUps",
    "eccNumberUps",
    "recipientTaxIdUps",
    "blanketStartDateUps",
    "blanketEndDateUps",
    "shipmentWeightUps",
    "saturdayDeliveryFedEx",
    "saturdayPickupFedex",
    "sendShipNotifyEmailFedEx",
    "sendBackupEmailFedEx",
    "signatureHomeDeliveryFedEx",
    "shipNotifyEmailAddressFedEx",
    "backupEmailAddressFedEx",
    "shipDateFedEx",
    "homeDeliveryTypeFedEx",
    "homeDeliveryDateFedEx",
    "bookingConfirmationNumFedEx",
    "intlExemptionNumFedEx",
    "b13AFilingOptionFedEx",
    "b13AStatementDataFedEx",
    "thirdPartyAcctFedEx",
    "thirdPartyCountryFedEx",
    "thirdPartyTypeFedEx",
    "shipmentWeightFedEx",
    "termsOfSaleFedEx",
    "termsFreightChargeFedEx",
    "termsInsuranceChargeFedEx",
    "insideDeliveryFedEx",
    "insidePickupFedEx",
    "ancillaryEndorsementFedEx",
    "holdAtLocationFedEx",
    "halPhoneFedEx",
    "halAddr1FedEx",
    "halAddr2FedEx",
    "halAddr3FedEx",
    "halCityFedEx",
    "halZipFedEx",
    "halStateFedEx",
    "halCountryFedEx",
    "hazmatTypeFedEx",
    "accessibilityTypeFedEx",
    "isCargoAircraftOnlyFedEx",
    "tranDate",
    "tranId",
    "shipMethod",
    "generateIntegratedShipperLabel",
    "shippingCost",
    "handlingCost",
    "memo",
    "transferLocation",
    "packageList",
    "packageUpsList",
    "packageUspsList",
    "packageFedExList",
    "itemList",
    "accountingBookDetailList",
    "customFieldList"
})
public class ItemFulfillment
    extends Record
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected RecordRef customForm;
    protected RecordRef postingPeriod;
    protected RecordRef entity;
    protected RecordRef createdFrom;
    protected RecordRef requestedBy;
    protected Long createdFromShipGroup;
    protected RecordRef partner;
    protected Address shippingAddress;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar packedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippedDate;
    protected Boolean shipIsResidential;
    protected RecordRef shipAddressList;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentShipStatus shipStatus;
    protected Boolean saturdayDeliveryUps;
    protected Boolean sendShipNotifyEmailUps;
    protected Boolean sendBackupEmailUps;
    protected String shipNotifyEmailAddressUps;
    protected String shipNotifyEmailAddress2Ups;
    protected String backupEmailAddressUps;
    protected String shipNotifyEmailMessageUps;
    protected String thirdPartyAcctUps;
    protected String thirdPartyZipcodeUps;
    @XmlSchemaType(name = "string")
    protected Country thirdPartyCountryUps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentThirdPartyTypeUps thirdPartyTypeUps;
    protected Boolean partiesToTransactionUps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentExportTypeUps exportTypeUps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentMethodOfTransportUps methodOfTransportUps;
    protected String carrierIdUps;
    protected String entryNumberUps;
    protected String inbondCodeUps;
    protected Boolean isRoutedExportTransactionUps;
    protected String licenseNumberUps;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar licenseDateUps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentLicenseExceptionUps licenseExceptionUps;
    protected String eccNumberUps;
    protected String recipientTaxIdUps;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar blanketStartDateUps;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar blanketEndDateUps;
    protected Double shipmentWeightUps;
    protected Boolean saturdayDeliveryFedEx;
    protected Boolean saturdayPickupFedex;
    protected Boolean sendShipNotifyEmailFedEx;
    protected Boolean sendBackupEmailFedEx;
    protected Boolean signatureHomeDeliveryFedEx;
    protected String shipNotifyEmailAddressFedEx;
    protected String backupEmailAddressFedEx;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipDateFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentHomeDeliveryTypeFedEx homeDeliveryTypeFedEx;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar homeDeliveryDateFedEx;
    protected String bookingConfirmationNumFedEx;
    protected String intlExemptionNumFedEx;
    @XmlElement(name = "b13aFilingOptionFedEx")
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentB13AFilingOptionFedEx b13AFilingOptionFedEx;
    @XmlElement(name = "b13aStatementDataFedEx")
    protected String b13AStatementDataFedEx;
    protected String thirdPartyAcctFedEx;
    @XmlSchemaType(name = "string")
    protected Country thirdPartyCountryFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentThirdPartyTypeFedEx thirdPartyTypeFedEx;
    protected Double shipmentWeightFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentTermsOfSaleFedEx termsOfSaleFedEx;
    protected Double termsFreightChargeFedEx;
    protected Double termsInsuranceChargeFedEx;
    protected Boolean insideDeliveryFedEx;
    protected Boolean insidePickupFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentAncillaryEndorsementFedEx ancillaryEndorsementFedEx;
    protected Boolean holdAtLocationFedEx;
    protected String halPhoneFedEx;
    protected String halAddr1FedEx;
    protected String halAddr2FedEx;
    protected String halAddr3FedEx;
    protected String halCityFedEx;
    protected String halZipFedEx;
    protected String halStateFedEx;
    protected String halCountryFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentHazmatTypeFedEx hazmatTypeFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentAccessibilityTypeFedEx accessibilityTypeFedEx;
    protected Boolean isCargoAircraftOnlyFedEx;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranDate;
    protected String tranId;
    protected RecordRef shipMethod;
    protected Boolean generateIntegratedShipperLabel;
    protected Double shippingCost;
    protected Double handlingCost;
    protected String memo;
    protected RecordRef transferLocation;
    protected ItemFulfillmentPackageList packageList;
    protected ItemFulfillmentPackageUpsList packageUpsList;
    protected ItemFulfillmentPackageUspsList packageUspsList;
    protected ItemFulfillmentPackageFedExList packageFedExList;
    protected ItemFulfillmentItemList itemList;
    protected AccountingBookDetailList accountingBookDetailList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * 获取createdDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置createdDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * 获取lastModifiedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * 设置lastModifiedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * 获取customForm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * 设置customForm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

    /**
     * 获取postingPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPostingPeriod() {
        return postingPeriod;
    }

    /**
     * 设置postingPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPostingPeriod(RecordRef value) {
        this.postingPeriod = value;
    }

    /**
     * 获取entity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEntity() {
        return entity;
    }

    /**
     * 设置entity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEntity(RecordRef value) {
        this.entity = value;
    }

    /**
     * 获取createdFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCreatedFrom() {
        return createdFrom;
    }

    /**
     * 设置createdFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCreatedFrom(RecordRef value) {
        this.createdFrom = value;
    }

    /**
     * 获取requestedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRequestedBy() {
        return requestedBy;
    }

    /**
     * 设置requestedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRequestedBy(RecordRef value) {
        this.requestedBy = value;
    }

    /**
     * 获取createdFromShipGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreatedFromShipGroup() {
        return createdFromShipGroup;
    }

    /**
     * 设置createdFromShipGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreatedFromShipGroup(Long value) {
        this.createdFromShipGroup = value;
    }

    /**
     * 获取partner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPartner() {
        return partner;
    }

    /**
     * 设置partner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPartner(RecordRef value) {
        this.partner = value;
    }

    /**
     * 获取shippingAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * 设置shippingAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShippingAddress(Address value) {
        this.shippingAddress = value;
    }

    /**
     * 获取pickedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickedDate() {
        return pickedDate;
    }

    /**
     * 设置pickedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickedDate(XMLGregorianCalendar value) {
        this.pickedDate = value;
    }

    /**
     * 获取packedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPackedDate() {
        return packedDate;
    }

    /**
     * 设置packedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPackedDate(XMLGregorianCalendar value) {
        this.packedDate = value;
    }

    /**
     * 获取shippedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippedDate() {
        return shippedDate;
    }

    /**
     * 设置shippedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippedDate(XMLGregorianCalendar value) {
        this.shippedDate = value;
    }

    /**
     * 获取shipIsResidential属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipIsResidential() {
        return shipIsResidential;
    }

    /**
     * 设置shipIsResidential属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipIsResidential(Boolean value) {
        this.shipIsResidential = value;
    }

    /**
     * 获取shipAddressList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipAddressList() {
        return shipAddressList;
    }

    /**
     * 设置shipAddressList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipAddressList(RecordRef value) {
        this.shipAddressList = value;
    }

    /**
     * 获取shipStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentShipStatus }
     *     
     */
    public ItemFulfillmentShipStatus getShipStatus() {
        return shipStatus;
    }

    /**
     * 设置shipStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentShipStatus }
     *     
     */
    public void setShipStatus(ItemFulfillmentShipStatus value) {
        this.shipStatus = value;
    }

    /**
     * 获取saturdayDeliveryUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaturdayDeliveryUps() {
        return saturdayDeliveryUps;
    }

    /**
     * 设置saturdayDeliveryUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaturdayDeliveryUps(Boolean value) {
        this.saturdayDeliveryUps = value;
    }

    /**
     * 获取sendShipNotifyEmailUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendShipNotifyEmailUps() {
        return sendShipNotifyEmailUps;
    }

    /**
     * 设置sendShipNotifyEmailUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendShipNotifyEmailUps(Boolean value) {
        this.sendShipNotifyEmailUps = value;
    }

    /**
     * 获取sendBackupEmailUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendBackupEmailUps() {
        return sendBackupEmailUps;
    }

    /**
     * 设置sendBackupEmailUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendBackupEmailUps(Boolean value) {
        this.sendBackupEmailUps = value;
    }

    /**
     * 获取shipNotifyEmailAddressUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipNotifyEmailAddressUps() {
        return shipNotifyEmailAddressUps;
    }

    /**
     * 设置shipNotifyEmailAddressUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipNotifyEmailAddressUps(String value) {
        this.shipNotifyEmailAddressUps = value;
    }

    /**
     * 获取shipNotifyEmailAddress2Ups属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipNotifyEmailAddress2Ups() {
        return shipNotifyEmailAddress2Ups;
    }

    /**
     * 设置shipNotifyEmailAddress2Ups属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipNotifyEmailAddress2Ups(String value) {
        this.shipNotifyEmailAddress2Ups = value;
    }

    /**
     * 获取backupEmailAddressUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupEmailAddressUps() {
        return backupEmailAddressUps;
    }

    /**
     * 设置backupEmailAddressUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupEmailAddressUps(String value) {
        this.backupEmailAddressUps = value;
    }

    /**
     * 获取shipNotifyEmailMessageUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipNotifyEmailMessageUps() {
        return shipNotifyEmailMessageUps;
    }

    /**
     * 设置shipNotifyEmailMessageUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipNotifyEmailMessageUps(String value) {
        this.shipNotifyEmailMessageUps = value;
    }

    /**
     * 获取thirdPartyAcctUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAcctUps() {
        return thirdPartyAcctUps;
    }

    /**
     * 设置thirdPartyAcctUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAcctUps(String value) {
        this.thirdPartyAcctUps = value;
    }

    /**
     * 获取thirdPartyZipcodeUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyZipcodeUps() {
        return thirdPartyZipcodeUps;
    }

    /**
     * 设置thirdPartyZipcodeUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyZipcodeUps(String value) {
        this.thirdPartyZipcodeUps = value;
    }

    /**
     * 获取thirdPartyCountryUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getThirdPartyCountryUps() {
        return thirdPartyCountryUps;
    }

    /**
     * 设置thirdPartyCountryUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setThirdPartyCountryUps(Country value) {
        this.thirdPartyCountryUps = value;
    }

    /**
     * 获取thirdPartyTypeUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentThirdPartyTypeUps }
     *     
     */
    public ItemFulfillmentThirdPartyTypeUps getThirdPartyTypeUps() {
        return thirdPartyTypeUps;
    }

    /**
     * 设置thirdPartyTypeUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentThirdPartyTypeUps }
     *     
     */
    public void setThirdPartyTypeUps(ItemFulfillmentThirdPartyTypeUps value) {
        this.thirdPartyTypeUps = value;
    }

    /**
     * 获取partiesToTransactionUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartiesToTransactionUps() {
        return partiesToTransactionUps;
    }

    /**
     * 设置partiesToTransactionUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartiesToTransactionUps(Boolean value) {
        this.partiesToTransactionUps = value;
    }

    /**
     * 获取exportTypeUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentExportTypeUps }
     *     
     */
    public ItemFulfillmentExportTypeUps getExportTypeUps() {
        return exportTypeUps;
    }

    /**
     * 设置exportTypeUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentExportTypeUps }
     *     
     */
    public void setExportTypeUps(ItemFulfillmentExportTypeUps value) {
        this.exportTypeUps = value;
    }

    /**
     * 获取methodOfTransportUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentMethodOfTransportUps }
     *     
     */
    public ItemFulfillmentMethodOfTransportUps getMethodOfTransportUps() {
        return methodOfTransportUps;
    }

    /**
     * 设置methodOfTransportUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentMethodOfTransportUps }
     *     
     */
    public void setMethodOfTransportUps(ItemFulfillmentMethodOfTransportUps value) {
        this.methodOfTransportUps = value;
    }

    /**
     * 获取carrierIdUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierIdUps() {
        return carrierIdUps;
    }

    /**
     * 设置carrierIdUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierIdUps(String value) {
        this.carrierIdUps = value;
    }

    /**
     * 获取entryNumberUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryNumberUps() {
        return entryNumberUps;
    }

    /**
     * 设置entryNumberUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryNumberUps(String value) {
        this.entryNumberUps = value;
    }

    /**
     * 获取inbondCodeUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInbondCodeUps() {
        return inbondCodeUps;
    }

    /**
     * 设置inbondCodeUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInbondCodeUps(String value) {
        this.inbondCodeUps = value;
    }

    /**
     * 获取isRoutedExportTransactionUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRoutedExportTransactionUps() {
        return isRoutedExportTransactionUps;
    }

    /**
     * 设置isRoutedExportTransactionUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRoutedExportTransactionUps(Boolean value) {
        this.isRoutedExportTransactionUps = value;
    }

    /**
     * 获取licenseNumberUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumberUps() {
        return licenseNumberUps;
    }

    /**
     * 设置licenseNumberUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumberUps(String value) {
        this.licenseNumberUps = value;
    }

    /**
     * 获取licenseDateUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLicenseDateUps() {
        return licenseDateUps;
    }

    /**
     * 设置licenseDateUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLicenseDateUps(XMLGregorianCalendar value) {
        this.licenseDateUps = value;
    }

    /**
     * 获取licenseExceptionUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentLicenseExceptionUps }
     *     
     */
    public ItemFulfillmentLicenseExceptionUps getLicenseExceptionUps() {
        return licenseExceptionUps;
    }

    /**
     * 设置licenseExceptionUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentLicenseExceptionUps }
     *     
     */
    public void setLicenseExceptionUps(ItemFulfillmentLicenseExceptionUps value) {
        this.licenseExceptionUps = value;
    }

    /**
     * 获取eccNumberUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEccNumberUps() {
        return eccNumberUps;
    }

    /**
     * 设置eccNumberUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEccNumberUps(String value) {
        this.eccNumberUps = value;
    }

    /**
     * 获取recipientTaxIdUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientTaxIdUps() {
        return recipientTaxIdUps;
    }

    /**
     * 设置recipientTaxIdUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientTaxIdUps(String value) {
        this.recipientTaxIdUps = value;
    }

    /**
     * 获取blanketStartDateUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBlanketStartDateUps() {
        return blanketStartDateUps;
    }

    /**
     * 设置blanketStartDateUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBlanketStartDateUps(XMLGregorianCalendar value) {
        this.blanketStartDateUps = value;
    }

    /**
     * 获取blanketEndDateUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBlanketEndDateUps() {
        return blanketEndDateUps;
    }

    /**
     * 设置blanketEndDateUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBlanketEndDateUps(XMLGregorianCalendar value) {
        this.blanketEndDateUps = value;
    }

    /**
     * 获取shipmentWeightUps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShipmentWeightUps() {
        return shipmentWeightUps;
    }

    /**
     * 设置shipmentWeightUps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShipmentWeightUps(Double value) {
        this.shipmentWeightUps = value;
    }

    /**
     * 获取saturdayDeliveryFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaturdayDeliveryFedEx() {
        return saturdayDeliveryFedEx;
    }

    /**
     * 设置saturdayDeliveryFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaturdayDeliveryFedEx(Boolean value) {
        this.saturdayDeliveryFedEx = value;
    }

    /**
     * 获取saturdayPickupFedex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaturdayPickupFedex() {
        return saturdayPickupFedex;
    }

    /**
     * 设置saturdayPickupFedex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaturdayPickupFedex(Boolean value) {
        this.saturdayPickupFedex = value;
    }

    /**
     * 获取sendShipNotifyEmailFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendShipNotifyEmailFedEx() {
        return sendShipNotifyEmailFedEx;
    }

    /**
     * 设置sendShipNotifyEmailFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendShipNotifyEmailFedEx(Boolean value) {
        this.sendShipNotifyEmailFedEx = value;
    }

    /**
     * 获取sendBackupEmailFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendBackupEmailFedEx() {
        return sendBackupEmailFedEx;
    }

    /**
     * 设置sendBackupEmailFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendBackupEmailFedEx(Boolean value) {
        this.sendBackupEmailFedEx = value;
    }

    /**
     * 获取signatureHomeDeliveryFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignatureHomeDeliveryFedEx() {
        return signatureHomeDeliveryFedEx;
    }

    /**
     * 设置signatureHomeDeliveryFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignatureHomeDeliveryFedEx(Boolean value) {
        this.signatureHomeDeliveryFedEx = value;
    }

    /**
     * 获取shipNotifyEmailAddressFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipNotifyEmailAddressFedEx() {
        return shipNotifyEmailAddressFedEx;
    }

    /**
     * 设置shipNotifyEmailAddressFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipNotifyEmailAddressFedEx(String value) {
        this.shipNotifyEmailAddressFedEx = value;
    }

    /**
     * 获取backupEmailAddressFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupEmailAddressFedEx() {
        return backupEmailAddressFedEx;
    }

    /**
     * 设置backupEmailAddressFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupEmailAddressFedEx(String value) {
        this.backupEmailAddressFedEx = value;
    }

    /**
     * 获取shipDateFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDateFedEx() {
        return shipDateFedEx;
    }

    /**
     * 设置shipDateFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDateFedEx(XMLGregorianCalendar value) {
        this.shipDateFedEx = value;
    }

    /**
     * 获取homeDeliveryTypeFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentHomeDeliveryTypeFedEx }
     *     
     */
    public ItemFulfillmentHomeDeliveryTypeFedEx getHomeDeliveryTypeFedEx() {
        return homeDeliveryTypeFedEx;
    }

    /**
     * 设置homeDeliveryTypeFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentHomeDeliveryTypeFedEx }
     *     
     */
    public void setHomeDeliveryTypeFedEx(ItemFulfillmentHomeDeliveryTypeFedEx value) {
        this.homeDeliveryTypeFedEx = value;
    }

    /**
     * 获取homeDeliveryDateFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHomeDeliveryDateFedEx() {
        return homeDeliveryDateFedEx;
    }

    /**
     * 设置homeDeliveryDateFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHomeDeliveryDateFedEx(XMLGregorianCalendar value) {
        this.homeDeliveryDateFedEx = value;
    }

    /**
     * 获取bookingConfirmationNumFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingConfirmationNumFedEx() {
        return bookingConfirmationNumFedEx;
    }

    /**
     * 设置bookingConfirmationNumFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingConfirmationNumFedEx(String value) {
        this.bookingConfirmationNumFedEx = value;
    }

    /**
     * 获取intlExemptionNumFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntlExemptionNumFedEx() {
        return intlExemptionNumFedEx;
    }

    /**
     * 设置intlExemptionNumFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntlExemptionNumFedEx(String value) {
        this.intlExemptionNumFedEx = value;
    }

    /**
     * 获取b13AFilingOptionFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentB13AFilingOptionFedEx }
     *     
     */
    public ItemFulfillmentB13AFilingOptionFedEx getB13AFilingOptionFedEx() {
        return b13AFilingOptionFedEx;
    }

    /**
     * 设置b13AFilingOptionFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentB13AFilingOptionFedEx }
     *     
     */
    public void setB13AFilingOptionFedEx(ItemFulfillmentB13AFilingOptionFedEx value) {
        this.b13AFilingOptionFedEx = value;
    }

    /**
     * 获取b13AStatementDataFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB13AStatementDataFedEx() {
        return b13AStatementDataFedEx;
    }

    /**
     * 设置b13AStatementDataFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB13AStatementDataFedEx(String value) {
        this.b13AStatementDataFedEx = value;
    }

    /**
     * 获取thirdPartyAcctFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAcctFedEx() {
        return thirdPartyAcctFedEx;
    }

    /**
     * 设置thirdPartyAcctFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAcctFedEx(String value) {
        this.thirdPartyAcctFedEx = value;
    }

    /**
     * 获取thirdPartyCountryFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getThirdPartyCountryFedEx() {
        return thirdPartyCountryFedEx;
    }

    /**
     * 设置thirdPartyCountryFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setThirdPartyCountryFedEx(Country value) {
        this.thirdPartyCountryFedEx = value;
    }

    /**
     * 获取thirdPartyTypeFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentThirdPartyTypeFedEx }
     *     
     */
    public ItemFulfillmentThirdPartyTypeFedEx getThirdPartyTypeFedEx() {
        return thirdPartyTypeFedEx;
    }

    /**
     * 设置thirdPartyTypeFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentThirdPartyTypeFedEx }
     *     
     */
    public void setThirdPartyTypeFedEx(ItemFulfillmentThirdPartyTypeFedEx value) {
        this.thirdPartyTypeFedEx = value;
    }

    /**
     * 获取shipmentWeightFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShipmentWeightFedEx() {
        return shipmentWeightFedEx;
    }

    /**
     * 设置shipmentWeightFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShipmentWeightFedEx(Double value) {
        this.shipmentWeightFedEx = value;
    }

    /**
     * 获取termsOfSaleFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentTermsOfSaleFedEx }
     *     
     */
    public ItemFulfillmentTermsOfSaleFedEx getTermsOfSaleFedEx() {
        return termsOfSaleFedEx;
    }

    /**
     * 设置termsOfSaleFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentTermsOfSaleFedEx }
     *     
     */
    public void setTermsOfSaleFedEx(ItemFulfillmentTermsOfSaleFedEx value) {
        this.termsOfSaleFedEx = value;
    }

    /**
     * 获取termsFreightChargeFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTermsFreightChargeFedEx() {
        return termsFreightChargeFedEx;
    }

    /**
     * 设置termsFreightChargeFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTermsFreightChargeFedEx(Double value) {
        this.termsFreightChargeFedEx = value;
    }

    /**
     * 获取termsInsuranceChargeFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTermsInsuranceChargeFedEx() {
        return termsInsuranceChargeFedEx;
    }

    /**
     * 设置termsInsuranceChargeFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTermsInsuranceChargeFedEx(Double value) {
        this.termsInsuranceChargeFedEx = value;
    }

    /**
     * 获取insideDeliveryFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsideDeliveryFedEx() {
        return insideDeliveryFedEx;
    }

    /**
     * 设置insideDeliveryFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsideDeliveryFedEx(Boolean value) {
        this.insideDeliveryFedEx = value;
    }

    /**
     * 获取insidePickupFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsidePickupFedEx() {
        return insidePickupFedEx;
    }

    /**
     * 设置insidePickupFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsidePickupFedEx(Boolean value) {
        this.insidePickupFedEx = value;
    }

    /**
     * 获取ancillaryEndorsementFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentAncillaryEndorsementFedEx }
     *     
     */
    public ItemFulfillmentAncillaryEndorsementFedEx getAncillaryEndorsementFedEx() {
        return ancillaryEndorsementFedEx;
    }

    /**
     * 设置ancillaryEndorsementFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentAncillaryEndorsementFedEx }
     *     
     */
    public void setAncillaryEndorsementFedEx(ItemFulfillmentAncillaryEndorsementFedEx value) {
        this.ancillaryEndorsementFedEx = value;
    }

    /**
     * 获取holdAtLocationFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoldAtLocationFedEx() {
        return holdAtLocationFedEx;
    }

    /**
     * 设置holdAtLocationFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoldAtLocationFedEx(Boolean value) {
        this.holdAtLocationFedEx = value;
    }

    /**
     * 获取halPhoneFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalPhoneFedEx() {
        return halPhoneFedEx;
    }

    /**
     * 设置halPhoneFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalPhoneFedEx(String value) {
        this.halPhoneFedEx = value;
    }

    /**
     * 获取halAddr1FedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalAddr1FedEx() {
        return halAddr1FedEx;
    }

    /**
     * 设置halAddr1FedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalAddr1FedEx(String value) {
        this.halAddr1FedEx = value;
    }

    /**
     * 获取halAddr2FedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalAddr2FedEx() {
        return halAddr2FedEx;
    }

    /**
     * 设置halAddr2FedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalAddr2FedEx(String value) {
        this.halAddr2FedEx = value;
    }

    /**
     * 获取halAddr3FedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalAddr3FedEx() {
        return halAddr3FedEx;
    }

    /**
     * 设置halAddr3FedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalAddr3FedEx(String value) {
        this.halAddr3FedEx = value;
    }

    /**
     * 获取halCityFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalCityFedEx() {
        return halCityFedEx;
    }

    /**
     * 设置halCityFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalCityFedEx(String value) {
        this.halCityFedEx = value;
    }

    /**
     * 获取halZipFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalZipFedEx() {
        return halZipFedEx;
    }

    /**
     * 设置halZipFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalZipFedEx(String value) {
        this.halZipFedEx = value;
    }

    /**
     * 获取halStateFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalStateFedEx() {
        return halStateFedEx;
    }

    /**
     * 设置halStateFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalStateFedEx(String value) {
        this.halStateFedEx = value;
    }

    /**
     * 获取halCountryFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalCountryFedEx() {
        return halCountryFedEx;
    }

    /**
     * 设置halCountryFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalCountryFedEx(String value) {
        this.halCountryFedEx = value;
    }

    /**
     * 获取hazmatTypeFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentHazmatTypeFedEx }
     *     
     */
    public ItemFulfillmentHazmatTypeFedEx getHazmatTypeFedEx() {
        return hazmatTypeFedEx;
    }

    /**
     * 设置hazmatTypeFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentHazmatTypeFedEx }
     *     
     */
    public void setHazmatTypeFedEx(ItemFulfillmentHazmatTypeFedEx value) {
        this.hazmatTypeFedEx = value;
    }

    /**
     * 获取accessibilityTypeFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentAccessibilityTypeFedEx }
     *     
     */
    public ItemFulfillmentAccessibilityTypeFedEx getAccessibilityTypeFedEx() {
        return accessibilityTypeFedEx;
    }

    /**
     * 设置accessibilityTypeFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentAccessibilityTypeFedEx }
     *     
     */
    public void setAccessibilityTypeFedEx(ItemFulfillmentAccessibilityTypeFedEx value) {
        this.accessibilityTypeFedEx = value;
    }

    /**
     * 获取isCargoAircraftOnlyFedEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCargoAircraftOnlyFedEx() {
        return isCargoAircraftOnlyFedEx;
    }

    /**
     * 设置isCargoAircraftOnlyFedEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCargoAircraftOnlyFedEx(Boolean value) {
        this.isCargoAircraftOnlyFedEx = value;
    }

    /**
     * 获取tranDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranDate() {
        return tranDate;
    }

    /**
     * 设置tranDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranDate(XMLGregorianCalendar value) {
        this.tranDate = value;
    }

    /**
     * 获取tranId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranId() {
        return tranId;
    }

    /**
     * 设置tranId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranId(String value) {
        this.tranId = value;
    }

    /**
     * 获取shipMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipMethod() {
        return shipMethod;
    }

    /**
     * 设置shipMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipMethod(RecordRef value) {
        this.shipMethod = value;
    }

    /**
     * 获取generateIntegratedShipperLabel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateIntegratedShipperLabel() {
        return generateIntegratedShipperLabel;
    }

    /**
     * 设置generateIntegratedShipperLabel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateIntegratedShipperLabel(Boolean value) {
        this.generateIntegratedShipperLabel = value;
    }

    /**
     * 获取shippingCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingCost() {
        return shippingCost;
    }

    /**
     * 设置shippingCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingCost(Double value) {
        this.shippingCost = value;
    }

    /**
     * 获取handlingCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandlingCost() {
        return handlingCost;
    }

    /**
     * 设置handlingCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandlingCost(Double value) {
        this.handlingCost = value;
    }

    /**
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * 获取transferLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTransferLocation() {
        return transferLocation;
    }

    /**
     * 设置transferLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTransferLocation(RecordRef value) {
        this.transferLocation = value;
    }

    /**
     * 获取packageList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageList }
     *     
     */
    public ItemFulfillmentPackageList getPackageList() {
        return packageList;
    }

    /**
     * 设置packageList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageList }
     *     
     */
    public void setPackageList(ItemFulfillmentPackageList value) {
        this.packageList = value;
    }

    /**
     * 获取packageUpsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUpsList }
     *     
     */
    public ItemFulfillmentPackageUpsList getPackageUpsList() {
        return packageUpsList;
    }

    /**
     * 设置packageUpsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUpsList }
     *     
     */
    public void setPackageUpsList(ItemFulfillmentPackageUpsList value) {
        this.packageUpsList = value;
    }

    /**
     * 获取packageUspsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUspsList }
     *     
     */
    public ItemFulfillmentPackageUspsList getPackageUspsList() {
        return packageUspsList;
    }

    /**
     * 设置packageUspsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUspsList }
     *     
     */
    public void setPackageUspsList(ItemFulfillmentPackageUspsList value) {
        this.packageUspsList = value;
    }

    /**
     * 获取packageFedExList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExList }
     *     
     */
    public ItemFulfillmentPackageFedExList getPackageFedExList() {
        return packageFedExList;
    }

    /**
     * 设置packageFedExList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExList }
     *     
     */
    public void setPackageFedExList(ItemFulfillmentPackageFedExList value) {
        this.packageFedExList = value;
    }

    /**
     * 获取itemList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentItemList }
     *     
     */
    public ItemFulfillmentItemList getItemList() {
        return itemList;
    }

    /**
     * 设置itemList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentItemList }
     *     
     */
    public void setItemList(ItemFulfillmentItemList value) {
        this.itemList = value;
    }

    /**
     * 获取accountingBookDetailList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountingBookDetailList }
     *     
     */
    public AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }

    /**
     * 设置accountingBookDetailList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingBookDetailList }
     *     
     */
    public void setAccountingBookDetailList(AccountingBookDetailList value) {
        this.accountingBookDetailList = value;
    }

    /**
     * 获取customFieldList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * 设置customFieldList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
    }

    /**
     * 获取internalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * 设置internalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * 获取externalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * 设置externalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
