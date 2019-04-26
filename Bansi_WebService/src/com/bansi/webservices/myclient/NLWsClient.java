package com.bansi.webservices.myclient;

import java.net.URL;

import com.bansi.webservices.samples.io.Logger;
import com.netsuite.webservices.lists.relationships_2019_1.Customer;
import com.netsuite.webservices.platform.core_2019_1.DataCenterUrls;
import com.netsuite.webservices.platform.core_2019_1.RecordRef;
import com.netsuite.webservices.platform.core_2019_1.types.RecordType;
import com.netsuite.webservices.platform_2019_1.NetSuitePortType;
import com.netsuite.webservices.platform_2019_1.NetSuiteServiceLocator;

public class NLWsClient {
	private static final String ACCOUNT = "5399033_SB1";
	private NetSuitePortType _port;
	private static final Logger LOG = Logger.getInstance();

	public NLWsClient() throws Exception {
		//1. Locate the NetSuite service.
		DataCenterAwareNetSuiteServiceLocator service = new DataCenterAwareNetSuiteServiceLocator(ACCOUNT);
		//2. Enable support for multiple cookie management.
		service.setMaintainSession(true);
		_port = service.getNetSuitePort();
	}

	// initialize _port - authentication// ...
	public void initPort() {

	}

	public NetSuitePortType getPort() {
		return _port;
	}

	//testDataCenterUrlsPublic
	public static void main(String[] args) throws Exception {
		NLWsClient c = new NLWsClient();
		c.initPort();
		String account = "5399033_SB1";
		System.out.println("Account: " + account);
		DataCenterUrls urls = c.getPort().getDataCenterUrls(account).getDataCenterUrls();
		System.out.println("\tREST domain: " + urls.getRestDomain());
		System.out.println("\tWeb services domain: " + urls.getWebservicesDomain());
		System.out.println("\tSystem domain: " + urls.getSystemDomain());
		System.out.println();

		//±¨´í SESSION_TIMED_OUT
		RecordRef rr = new RecordRef();
		rr.setInternalId("1");
		rr.setType(RecordType.customer);
		Customer b = (Customer) c._port.get(rr).getRecord();
		System.out.println(b.getCompanyName());
	}

	/**
	 * Since 12.2 endpoint accounts are located in multiple data centers with different domain names.
	 * To use the correct one, wrap the Locator and get the correct domain first.
	 *
	 * See getDataCenterUrls WSDL method documentation in the Help Center.
	 */
	private static class DataCenterAwareNetSuiteServiceLocator extends NetSuiteServiceLocator {
		private String account;

		public DataCenterAwareNetSuiteServiceLocator(String account) {
			this.account = account;
		}

		@Override
		public NetSuitePortType getNetSuitePort(URL defaultWsDomainURL) {
			try {
				NetSuitePortType _port = super.getNetSuitePort(defaultWsDomainURL);
				// Get the webservices domain for your account
				DataCenterUrls urls = _port.getDataCenterUrls(account).getDataCenterUrls();
				String wsDomain = urls.getWebservicesDomain();

				// Return URL appropriate for the specific account
				return super.getNetSuitePort(new URL(wsDomain.concat(defaultWsDomainURL.getPath())));
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

	}
}
