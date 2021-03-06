package com.bansi.webservices.restclient;

import com.bansi.webservices.samples.io.Logger;
import com.netsuite.webservices.lists.relationships_2019_1.Customer;
import com.netsuite.webservices.platform.core_2019_1.RecordRef;
import com.netsuite.webservices.platform.core_2019_1.types.RecordType;
import com.netsuite.webservices.platform_2019_1.NetSuitePortType;
import com.netsuite.webservices.platform_2019_1.NetSuiteServiceLocator;

/***
 * Example showing how to get web services domain pointing to the account's data
 * center through RESTful WS call for endpoints older than 12.2. (The method
 * getDataCenterUrls() was introduced in the 12.2 endpoint).
 ***/
public class AXISClient {
	private static final String ENDPOINT_VERSION = "NetSuitePort_2019_1";
	private static final String ACCOUNT = "5399033_SB1";//"5144758_SB1";
	private static final String PASSWORD = "Welcome123";//"ZYLOIZO715710iie";
	private static final String EMAIL = "377132229@qq.com";//"xmzyl@intretech.com";
	private NetSuitePortType _port;
	private static final Logger LOG = Logger.getInstance();

	public AXISClient(String acct, String email, String passwd) throws Exception {

		//1. Locate the NetSuite service.
		NetSuiteServiceLocator service = new NetSuiteServiceLocator();
		//NetSuiteServiceLocator service = new DataCenterAwareNetSuiteServiceLocator(_properties.getProperty("login.acct"));
		//2. Enable support for multiple cookie management.
		service.setMaintainSession(true);

		GetRESTDomain restHelper = new GetRESTDomain();
		//go to 设置 > 公司 > 公司信息 in the NETSUITE UI
		//https://5144758-sb1.app.netsuite.com

		String wsDomain = restHelper.getDataCenterUrls(acct, email, passwd).webservicesDomain;
		//wsDomain = "https://5399033-sb1.app.netsuite.com";
		service.setNetSuitePortEndpointAddress(wsDomain + "/services/" + ENDPOINT_VERSION);
		LOG.info(wsDomain + "/services/" + ENDPOINT_VERSION);

		//3. Get the NetSuite port.
		_port = service.getNetSuitePort();
		// initialize _port - authentication// ...

	}

	public static void main(String[] args) throws Exception {
		AXISClient client = new AXISClient(ACCOUNT, EMAIL, PASSWORD);
		// _port points to the correct data center. Perform operations as
		// usual.// ...
		//client.initPort();
		RecordRef rr = new RecordRef();
		//		rr.setInternalId("671");
		//		rr.setType(RecordType.employee);
		//		Employee e = (Employee) client._port.get(rr).getRecord();
		//		System.out.println(e.getFirstName() + " " + e.getLastName());
		rr.setInternalId("1");
		rr.setType(RecordType.customer);
		Customer b = (Customer) client._port.get(rr).getRecord();
		System.out.println(b.getCompanyName());

	}
}