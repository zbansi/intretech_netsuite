/**
 * NetSuitePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform_2018_2;

public interface NetSuitePortType extends java.rmi.Remote {
    public com.netsuite.webservices.platform.messages_2018_2.SessionResponse login(com.netsuite.webservices.platform.core_2018_2.Passport passport) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.InvalidAccountFault, com.netsuite.webservices.platform.faults_2018_2.InvalidVersionFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.SessionResponse ssoLogin(com.netsuite.webservices.platform.core_2018_2.SsoPassport ssoPassport) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.InvalidAccountFault, com.netsuite.webservices.platform.faults_2018_2.InvalidVersionFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.SessionResponse mapSso(com.netsuite.webservices.platform.core_2018_2.SsoCredentials ssoCredentials) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.InvalidAccountFault, com.netsuite.webservices.platform.faults_2018_2.InvalidVersionFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.SessionResponse changePassword(com.netsuite.webservices.platform.core_2018_2.ChangePassword changePassword) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.InvalidAccountFault, com.netsuite.webservices.platform.faults_2018_2.InvalidVersionFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.SessionResponse changeEmail(com.netsuite.webservices.platform.core_2018_2.ChangeEmail changeEmail) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.InvalidAccountFault, com.netsuite.webservices.platform.faults_2018_2.InvalidVersionFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.SessionResponse logout() throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.WriteResponse add(com.netsuite.webservices.platform.core_2018_2.Record record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.WriteResponse delete(com.netsuite.webservices.platform.core_2018_2.BaseRef baseRef, com.netsuite.webservices.platform.core_2018_2.DeletionReason deletionReason) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.SearchResult search(com.netsuite.webservices.platform.core_2018_2.SearchRecord searchRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.SearchResult searchMore(int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.SearchResult searchMoreWithId(java.lang.String searchId, int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.SearchResult searchNext() throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.WriteResponse update(com.netsuite.webservices.platform.core_2018_2.Record record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.WriteResponse upsert(com.netsuite.webservices.platform.core_2018_2.Record record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.WriteResponseList addList(com.netsuite.webservices.platform.core_2018_2.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.WriteResponseList deleteList(com.netsuite.webservices.platform.core_2018_2.BaseRef[] baseRef, com.netsuite.webservices.platform.core_2018_2.DeletionReason deletionReason) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.WriteResponseList updateList(com.netsuite.webservices.platform.core_2018_2.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.WriteResponseList upsertList(com.netsuite.webservices.platform.core_2018_2.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.ReadResponse get(com.netsuite.webservices.platform.core_2018_2.BaseRef baseRef) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.ReadResponseList getList(com.netsuite.webservices.platform.core_2018_2.BaseRef[] baseRef) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.GetAllResult getAll(com.netsuite.webservices.platform.core_2018_2.GetAllRecord record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.GetSavedSearchResult getSavedSearch(com.netsuite.webservices.platform.core_2018_2.GetSavedSearchRecord record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.GetCustomizationIdResult getCustomizationId(com.netsuite.webservices.platform.core_2018_2.CustomizationType customizationType, boolean includeInactives) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.ReadResponse initialize(com.netsuite.webservices.platform.core_2018_2.InitializeRecord initializeRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.ReadResponseList initializeList(com.netsuite.webservices.platform.core_2018_2.InitializeRecord[] initializeRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.GetSelectValueResult getSelectValue(com.netsuite.webservices.platform.core_2018_2.GetSelectValueFieldDescription fieldDescription, int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.GetItemAvailabilityResult getItemAvailability(com.netsuite.webservices.platform.core_2018_2.ItemAvailabilityFilter itemAvailabilityFilter) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.GetBudgetExchangeRateResult getBudgetExchangeRate(com.netsuite.webservices.platform.core_2018_2.BudgetExchangeRateFilter budgetExchangeRateFilter) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.GetCurrencyRateResult getCurrencyRate(com.netsuite.webservices.platform.core_2018_2.CurrencyRateFilter currencyRateFilter) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.GetDataCenterUrlsResult getDataCenterUrls(java.lang.String account) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.GetPostingTransactionSummaryResult getPostingTransactionSummary(com.netsuite.webservices.platform.core_2018_2.PostingTransactionSummaryField fields, com.netsuite.webservices.platform.core_2018_2.PostingTransactionSummaryFilter filters, int pageIndex, java.lang.String operationId) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.GetServerTimeResult getServerTime() throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.WriteResponse attach(com.netsuite.webservices.platform.core_2018_2.AttachReference attachReference) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.WriteResponse detach(com.netsuite.webservices.platform.core_2018_2.DetachReference detachReference) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.WriteResponse updateInviteeStatus(com.netsuite.webservices.platform.core_2018_2.UpdateInviteeStatusReference updateInviteeStatusReference) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.WriteResponseList updateInviteeStatusList(com.netsuite.webservices.platform.core_2018_2.UpdateInviteeStatusReference[] updateInviteeStatusReference) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.AsyncStatusResult asyncAddList(com.netsuite.webservices.platform.core_2018_2.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.AsyncStatusResult asyncUpdateList(com.netsuite.webservices.platform.core_2018_2.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.AsyncStatusResult asyncUpsertList(com.netsuite.webservices.platform.core_2018_2.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.AsyncStatusResult asyncDeleteList(com.netsuite.webservices.platform.core_2018_2.BaseRef[] baseRef, com.netsuite.webservices.platform.core_2018_2.DeletionReason deletionReason) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.AsyncStatusResult asyncGetList(com.netsuite.webservices.platform.core_2018_2.BaseRef[] baseRef) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.AsyncStatusResult asyncInitializeList(com.netsuite.webservices.platform.core_2018_2.InitializeRecord[] initializeRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.AsyncStatusResult asyncSearch(com.netsuite.webservices.platform.core_2018_2.SearchRecord searchRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2018_2.AsyncResult getAsyncResult(java.lang.String jobId, int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.AsyncFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.AsyncStatusResult checkAsyncStatus(java.lang.String jobId) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.AsyncFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2018_2.GetDeletedResult getDeleted(com.netsuite.webservices.platform.core_2018_2.GetDeletedFilter getDeletedFilter, int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
}
