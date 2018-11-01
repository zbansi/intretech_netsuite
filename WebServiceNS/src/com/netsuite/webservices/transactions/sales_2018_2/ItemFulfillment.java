
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
 * <p>ItemFulfillment complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcreatedDate���Ե�ֵ��
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
     * ����createdDate���Ե�ֵ��
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
     * ��ȡlastModifiedDate���Ե�ֵ��
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
     * ����lastModifiedDate���Ե�ֵ��
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
     * ��ȡcustomForm���Ե�ֵ��
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
     * ����customForm���Ե�ֵ��
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
     * ��ȡpostingPeriod���Ե�ֵ��
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
     * ����postingPeriod���Ե�ֵ��
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
     * ��ȡentity���Ե�ֵ��
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
     * ����entity���Ե�ֵ��
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
     * ��ȡcreatedFrom���Ե�ֵ��
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
     * ����createdFrom���Ե�ֵ��
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
     * ��ȡrequestedBy���Ե�ֵ��
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
     * ����requestedBy���Ե�ֵ��
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
     * ��ȡcreatedFromShipGroup���Ե�ֵ��
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
     * ����createdFromShipGroup���Ե�ֵ��
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
     * ��ȡpartner���Ե�ֵ��
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
     * ����partner���Ե�ֵ��
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
     * ��ȡshippingAddress���Ե�ֵ��
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
     * ����shippingAddress���Ե�ֵ��
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
     * ��ȡpickedDate���Ե�ֵ��
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
     * ����pickedDate���Ե�ֵ��
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
     * ��ȡpackedDate���Ե�ֵ��
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
     * ����packedDate���Ե�ֵ��
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
     * ��ȡshippedDate���Ե�ֵ��
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
     * ����shippedDate���Ե�ֵ��
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
     * ��ȡshipIsResidential���Ե�ֵ��
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
     * ����shipIsResidential���Ե�ֵ��
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
     * ��ȡshipAddressList���Ե�ֵ��
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
     * ����shipAddressList���Ե�ֵ��
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
     * ��ȡshipStatus���Ե�ֵ��
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
     * ����shipStatus���Ե�ֵ��
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
     * ��ȡsaturdayDeliveryUps���Ե�ֵ��
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
     * ����saturdayDeliveryUps���Ե�ֵ��
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
     * ��ȡsendShipNotifyEmailUps���Ե�ֵ��
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
     * ����sendShipNotifyEmailUps���Ե�ֵ��
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
     * ��ȡsendBackupEmailUps���Ե�ֵ��
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
     * ����sendBackupEmailUps���Ե�ֵ��
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
     * ��ȡshipNotifyEmailAddressUps���Ե�ֵ��
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
     * ����shipNotifyEmailAddressUps���Ե�ֵ��
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
     * ��ȡshipNotifyEmailAddress2Ups���Ե�ֵ��
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
     * ����shipNotifyEmailAddress2Ups���Ե�ֵ��
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
     * ��ȡbackupEmailAddressUps���Ե�ֵ��
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
     * ����backupEmailAddressUps���Ե�ֵ��
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
     * ��ȡshipNotifyEmailMessageUps���Ե�ֵ��
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
     * ����shipNotifyEmailMessageUps���Ե�ֵ��
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
     * ��ȡthirdPartyAcctUps���Ե�ֵ��
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
     * ����thirdPartyAcctUps���Ե�ֵ��
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
     * ��ȡthirdPartyZipcodeUps���Ե�ֵ��
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
     * ����thirdPartyZipcodeUps���Ե�ֵ��
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
     * ��ȡthirdPartyCountryUps���Ե�ֵ��
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
     * ����thirdPartyCountryUps���Ե�ֵ��
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
     * ��ȡthirdPartyTypeUps���Ե�ֵ��
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
     * ����thirdPartyTypeUps���Ե�ֵ��
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
     * ��ȡpartiesToTransactionUps���Ե�ֵ��
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
     * ����partiesToTransactionUps���Ե�ֵ��
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
     * ��ȡexportTypeUps���Ե�ֵ��
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
     * ����exportTypeUps���Ե�ֵ��
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
     * ��ȡmethodOfTransportUps���Ե�ֵ��
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
     * ����methodOfTransportUps���Ե�ֵ��
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
     * ��ȡcarrierIdUps���Ե�ֵ��
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
     * ����carrierIdUps���Ե�ֵ��
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
     * ��ȡentryNumberUps���Ե�ֵ��
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
     * ����entryNumberUps���Ե�ֵ��
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
     * ��ȡinbondCodeUps���Ե�ֵ��
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
     * ����inbondCodeUps���Ե�ֵ��
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
     * ��ȡisRoutedExportTransactionUps���Ե�ֵ��
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
     * ����isRoutedExportTransactionUps���Ե�ֵ��
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
     * ��ȡlicenseNumberUps���Ե�ֵ��
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
     * ����licenseNumberUps���Ե�ֵ��
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
     * ��ȡlicenseDateUps���Ե�ֵ��
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
     * ����licenseDateUps���Ե�ֵ��
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
     * ��ȡlicenseExceptionUps���Ե�ֵ��
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
     * ����licenseExceptionUps���Ե�ֵ��
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
     * ��ȡeccNumberUps���Ե�ֵ��
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
     * ����eccNumberUps���Ե�ֵ��
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
     * ��ȡrecipientTaxIdUps���Ե�ֵ��
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
     * ����recipientTaxIdUps���Ե�ֵ��
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
     * ��ȡblanketStartDateUps���Ե�ֵ��
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
     * ����blanketStartDateUps���Ե�ֵ��
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
     * ��ȡblanketEndDateUps���Ե�ֵ��
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
     * ����blanketEndDateUps���Ե�ֵ��
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
     * ��ȡshipmentWeightUps���Ե�ֵ��
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
     * ����shipmentWeightUps���Ե�ֵ��
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
     * ��ȡsaturdayDeliveryFedEx���Ե�ֵ��
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
     * ����saturdayDeliveryFedEx���Ե�ֵ��
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
     * ��ȡsaturdayPickupFedex���Ե�ֵ��
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
     * ����saturdayPickupFedex���Ե�ֵ��
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
     * ��ȡsendShipNotifyEmailFedEx���Ե�ֵ��
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
     * ����sendShipNotifyEmailFedEx���Ե�ֵ��
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
     * ��ȡsendBackupEmailFedEx���Ե�ֵ��
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
     * ����sendBackupEmailFedEx���Ե�ֵ��
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
     * ��ȡsignatureHomeDeliveryFedEx���Ե�ֵ��
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
     * ����signatureHomeDeliveryFedEx���Ե�ֵ��
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
     * ��ȡshipNotifyEmailAddressFedEx���Ե�ֵ��
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
     * ����shipNotifyEmailAddressFedEx���Ե�ֵ��
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
     * ��ȡbackupEmailAddressFedEx���Ե�ֵ��
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
     * ����backupEmailAddressFedEx���Ե�ֵ��
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
     * ��ȡshipDateFedEx���Ե�ֵ��
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
     * ����shipDateFedEx���Ե�ֵ��
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
     * ��ȡhomeDeliveryTypeFedEx���Ե�ֵ��
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
     * ����homeDeliveryTypeFedEx���Ե�ֵ��
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
     * ��ȡhomeDeliveryDateFedEx���Ե�ֵ��
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
     * ����homeDeliveryDateFedEx���Ե�ֵ��
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
     * ��ȡbookingConfirmationNumFedEx���Ե�ֵ��
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
     * ����bookingConfirmationNumFedEx���Ե�ֵ��
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
     * ��ȡintlExemptionNumFedEx���Ե�ֵ��
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
     * ����intlExemptionNumFedEx���Ե�ֵ��
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
     * ��ȡb13AFilingOptionFedEx���Ե�ֵ��
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
     * ����b13AFilingOptionFedEx���Ե�ֵ��
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
     * ��ȡb13AStatementDataFedEx���Ե�ֵ��
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
     * ����b13AStatementDataFedEx���Ե�ֵ��
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
     * ��ȡthirdPartyAcctFedEx���Ե�ֵ��
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
     * ����thirdPartyAcctFedEx���Ե�ֵ��
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
     * ��ȡthirdPartyCountryFedEx���Ե�ֵ��
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
     * ����thirdPartyCountryFedEx���Ե�ֵ��
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
     * ��ȡthirdPartyTypeFedEx���Ե�ֵ��
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
     * ����thirdPartyTypeFedEx���Ե�ֵ��
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
     * ��ȡshipmentWeightFedEx���Ե�ֵ��
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
     * ����shipmentWeightFedEx���Ե�ֵ��
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
     * ��ȡtermsOfSaleFedEx���Ե�ֵ��
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
     * ����termsOfSaleFedEx���Ե�ֵ��
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
     * ��ȡtermsFreightChargeFedEx���Ե�ֵ��
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
     * ����termsFreightChargeFedEx���Ե�ֵ��
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
     * ��ȡtermsInsuranceChargeFedEx���Ե�ֵ��
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
     * ����termsInsuranceChargeFedEx���Ե�ֵ��
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
     * ��ȡinsideDeliveryFedEx���Ե�ֵ��
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
     * ����insideDeliveryFedEx���Ե�ֵ��
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
     * ��ȡinsidePickupFedEx���Ե�ֵ��
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
     * ����insidePickupFedEx���Ե�ֵ��
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
     * ��ȡancillaryEndorsementFedEx���Ե�ֵ��
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
     * ����ancillaryEndorsementFedEx���Ե�ֵ��
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
     * ��ȡholdAtLocationFedEx���Ե�ֵ��
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
     * ����holdAtLocationFedEx���Ե�ֵ��
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
     * ��ȡhalPhoneFedEx���Ե�ֵ��
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
     * ����halPhoneFedEx���Ե�ֵ��
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
     * ��ȡhalAddr1FedEx���Ե�ֵ��
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
     * ����halAddr1FedEx���Ե�ֵ��
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
     * ��ȡhalAddr2FedEx���Ե�ֵ��
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
     * ����halAddr2FedEx���Ե�ֵ��
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
     * ��ȡhalAddr3FedEx���Ե�ֵ��
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
     * ����halAddr3FedEx���Ե�ֵ��
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
     * ��ȡhalCityFedEx���Ե�ֵ��
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
     * ����halCityFedEx���Ե�ֵ��
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
     * ��ȡhalZipFedEx���Ե�ֵ��
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
     * ����halZipFedEx���Ե�ֵ��
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
     * ��ȡhalStateFedEx���Ե�ֵ��
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
     * ����halStateFedEx���Ե�ֵ��
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
     * ��ȡhalCountryFedEx���Ե�ֵ��
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
     * ����halCountryFedEx���Ե�ֵ��
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
     * ��ȡhazmatTypeFedEx���Ե�ֵ��
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
     * ����hazmatTypeFedEx���Ե�ֵ��
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
     * ��ȡaccessibilityTypeFedEx���Ե�ֵ��
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
     * ����accessibilityTypeFedEx���Ե�ֵ��
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
     * ��ȡisCargoAircraftOnlyFedEx���Ե�ֵ��
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
     * ����isCargoAircraftOnlyFedEx���Ե�ֵ��
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
     * ��ȡtranDate���Ե�ֵ��
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
     * ����tranDate���Ե�ֵ��
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
     * ��ȡtranId���Ե�ֵ��
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
     * ����tranId���Ե�ֵ��
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
     * ��ȡshipMethod���Ե�ֵ��
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
     * ����shipMethod���Ե�ֵ��
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
     * ��ȡgenerateIntegratedShipperLabel���Ե�ֵ��
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
     * ����generateIntegratedShipperLabel���Ե�ֵ��
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
     * ��ȡshippingCost���Ե�ֵ��
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
     * ����shippingCost���Ե�ֵ��
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
     * ��ȡhandlingCost���Ե�ֵ��
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
     * ����handlingCost���Ե�ֵ��
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
     * ��ȡmemo���Ե�ֵ��
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
     * ����memo���Ե�ֵ��
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
     * ��ȡtransferLocation���Ե�ֵ��
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
     * ����transferLocation���Ե�ֵ��
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
     * ��ȡpackageList���Ե�ֵ��
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
     * ����packageList���Ե�ֵ��
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
     * ��ȡpackageUpsList���Ե�ֵ��
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
     * ����packageUpsList���Ե�ֵ��
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
     * ��ȡpackageUspsList���Ե�ֵ��
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
     * ����packageUspsList���Ե�ֵ��
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
     * ��ȡpackageFedExList���Ե�ֵ��
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
     * ����packageFedExList���Ե�ֵ��
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
     * ��ȡitemList���Ե�ֵ��
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
     * ����itemList���Ե�ֵ��
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
     * ��ȡaccountingBookDetailList���Ե�ֵ��
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
     * ����accountingBookDetailList���Ե�ֵ��
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
     * ��ȡcustomFieldList���Ե�ֵ��
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
     * ����customFieldList���Ե�ֵ��
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
     * ��ȡinternalId���Ե�ֵ��
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
     * ����internalId���Ե�ֵ��
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
     * ��ȡexternalId���Ե�ֵ��
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
     * ����externalId���Ե�ֵ��
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
