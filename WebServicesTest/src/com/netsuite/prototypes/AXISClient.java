package com.netsuite.prototypes;

import com.netsuite.devtools.lists.employees.Employee;
import com.netsuite.devtools.platform.NetSuitePortType;
import com.netsuite.devtools.platform.NetSuiteServiceLocator;
import com.netsuite.devtools.platform.core.RecordRef;
import com.netsuite.devtools.platform.core.types.RecordType;

/***
 * Example showing how to get web services domain pointing to the account's data
 * center through RESTful WS call for endpoints older than 12.2. (The method
 * getDataCenterUrls() was introduced in the 12.2 endpoint).
 ***/
public class AXISClient {
	private static final String ENDPOINT_VERSION = "NetSuitePort_2017_1";
	private static final String ACCOUNT = "123456";
	private static final String PASSWORD = "123456@netsuite.com";
	private static final String EMAIL = "passwd";
	NetSuitePortType _port;

	public AXISClient(String acct, String email, String passwd) throws Exception {
		NetSuiteServiceLocator service = new NetSuiteServiceLocator();
		GetRESTDomain restHelper = new GetRESTDomain();
		String wsDomain = restHelper.getDataCenterUrls(acct, email, passwd).webservicesDomain;
		service.setNetSuitePortEndpointAddress(wsDomain + "/services/" + ENDPOINT_VERSION);
		_port = service.getNetSuitePort();
		// initialize _port - authentication// ...
	}

	public static void main(String[] args) throws Exception {
		AXISClient client = new AXISClient(ACCOUNT, EMAIL, PASSWORD);
		// _port points to the correct data center. Perform operations as
		// usual.// ...
		RecordRef rr = new RecordRef();
		rr.setInternalId("25");
		rr.setType(RecordType.employee);
		Employee e = (Employee) client._port.get(rr).getRecord();
		System.out.println(e.getFirstName() + " " + e.getLastName());
	}
}
