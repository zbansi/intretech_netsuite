package com.bansi.ws.nscux;

import com.netsuite.webservices.*;
public class CuxClient {
	NetSuiteServiceLocator service = new NetSuiteServiceLocator();
	service.setMaintainSession( true );
	NetSuitePortType port = service.getNetSuitePort();
	passport.setEmail( "username@netsuite.com" );
	passport.setPassword( "mypassword" );
	role.setid( "3" );
	passport.setRole( role );
	passport.setAccount( "TSTDRV96" );
	Status status = port.login( passport ).getStatus();
	Customer cust = new Customer();
	cust.setEntityID( ¡°XYZ Inc¡± );
	WriteResponse response = port.add( cust );
	port.logout();
}
