package com.bansi.webservices.samples.v2018_2;

import com.bansi.webservices.samples.v2018_2.Properties;
import com.netsuite.webservices.platform.core_2018_2.GetDataCenterUrlsResult;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import static com.bansi.webservices.samples.Messages.GETTING_URL;
import static com.bansi.webservices.samples.utils.PrintUtils.printInfoWithEmptyLine;

/**
 * <p>Factory for creating fully initialized web services client.</p>
 * <p> 2017 Intretech Inc. All rights reserved. </p>
 */
public final class WsClientFactory_2018_2 {

	private WsClientFactory_2018_2() {
	}

	public static WsClient_2018_2 getWsClient(Properties properties, URL endpointUrl) throws MalformedURLException, RemoteException {
		WsClient_2018_2 client = new WsClient_2018_2(endpointUrl == null ? properties.getWebServicesUrl() : endpointUrl);
		if (properties.isTbaRequired()) {
			client.setTokenPassport(properties.getTokenPassport());
		} else {
			client.setRequestLevelCredentials(properties.getPassport());
			client.setApplicationId(properties.getApplicationId());
		}
		// If TCP Monitor is not used, get endpoint URL from getDataCenterUrls() operation
		if (endpointUrl == null && !properties.isTcpMonitor()) {
			String account = properties.isTbaRequired() ? properties.getTokenPassport().getAccount() : properties.getPassport().getAccount();
			printInfoWithEmptyLine(GETTING_URL);
			GetDataCenterUrlsResult urlsResult = client.callGetDataCenterUrls(account);
			/*
			Boolean isIsSuccess = true;
			for (StatusDetail sd : urlsResult.getStatus()) {
				isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
			}
			if (isIsSuccess) {
				*/
			/*if (urlsResult.getStatus()[0].getAfterSubmitFailed()) {
				throw new AxisFault(urlsResult.getStatus()[0].getMessage());
			}
			return getWsClient(properties, new URL(urlsResult.getDataCenterUrls().getWebservicesDomain()));
		*/
		}
		return client;
	}
}