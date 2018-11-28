package com.bansi.ws.nscux;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;


import com.netsuite.webservices.lists.relationships_2018_2.Customer;
import com.netsuite.webservices.platform.core_2018_2.Passport;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.StatusDetail;
import com.netsuite.webservices.platform.faults_2018_2.ExceededConcurrentRequestLimitFault;
import com.netsuite.webservices.platform.faults_2018_2.ExceededRecordCountFault;
import com.netsuite.webservices.platform.faults_2018_2.ExceededRequestLimitFault;
import com.netsuite.webservices.platform.faults_2018_2.ExceededRequestSizeFault;
import com.netsuite.webservices.platform.faults_2018_2.ExceededUsageLimitFault;
import com.netsuite.webservices.platform.faults_2018_2.InsufficientPermissionFault;
import com.netsuite.webservices.platform.faults_2018_2.InvalidAccountFault;
import com.netsuite.webservices.platform.faults_2018_2.InvalidCredentialsFault;
import com.netsuite.webservices.platform.faults_2018_2.InvalidSessionFault;
import com.netsuite.webservices.platform.faults_2018_2.InvalidVersionFault;
import com.netsuite.webservices.platform.faults_2018_2.UnexpectedErrorFault;
import com.netsuite.webservices.platform.messages_2018_2.WriteResponse;
import com.netsuite.webservices.platform_2018_2.NetSuiteServiceLocator;
import com.netsuite.webservices.platform_2018_2.NetSuitePortType;;

public class CuxClient {
	
	public  CuxClient(){
	NetSuiteServiceLocator nsservice = new NetSuiteServiceLocator();
	nsservice.setMaintainSession(true);
	
	NetSuitePortType port = null;
	try {
		port = nsservice.getNetSuitePort();
	} catch (ServiceException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	Passport passport = new Passport();
	
	
	passport.setEmail( "username@netsuite.com" );
	passport.setPassword( "mypassword" );
	
	RecordRef role = new RecordRef() ;

	role.setInternalId("3");
	
	passport.setRole( role );
	passport.setAccount( "TSTDRV96" );
	
//	Status status = port.login(passport).getStatus();
	try {
		StatusDetail[] sta = port.login(passport).getStatus();
	} catch (InsufficientPermissionFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidCredentialsFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidAccountFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidVersionFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExceededRequestLimitFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnexpectedErrorFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidSessionFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Customer cust = new Customer();
	cust.setEntityId( "XYZ Inc" );
	try {
		WriteResponse response = port.add( cust );
	} catch (InsufficientPermissionFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidCredentialsFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExceededConcurrentRequestLimitFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExceededRecordCountFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExceededRequestSizeFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExceededRequestLimitFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExceededUsageLimitFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnexpectedErrorFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidSessionFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		port.logout();
	} catch (InsufficientPermissionFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidCredentialsFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExceededRequestLimitFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnexpectedErrorFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidSessionFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
