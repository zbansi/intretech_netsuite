package com.bansi.webservices.samples.test;

import static com.bansi.webservices.samples.Messages.ERROR_OCCURRED;
import static com.bansi.webservices.samples.Messages.INVALID_WS_URL;
import static com.bansi.webservices.samples.Messages.WRONG_PROPERTIES_FILE;
import static com.bansi.webservices.samples.utils_2019_1.PrintUtils.printError;
import static com.bansi.webservices.samples.utils_2019_1.PrintUtils.print;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.axis.AxisFault;

import com.bansi.webservices.samples.dao.Dao;
import com.bansi.webservices.samples.v2019_1.Properties;
import com.bansi.webservices.samples.v2019_1.WsClientFactory_2019_1;
import com.bansi.webservices.samples.v2019_1.WsClient_2019_1;

public class TestDao {
	public static void main(String... args) {
		WsClient_2019_1 client = null;
		try {
			client = WsClientFactory_2019_1.getWsClient(new Properties(), null);
		} catch (MalformedURLException e) {
			printError(INVALID_WS_URL, e.getMessage());
			System.exit(2);
		} catch (AxisFault e) {
			printError(ERROR_OCCURRED, e.getFaultString());
			System.exit(3);
		} catch (IOException e) {
			printError(WRONG_PROPERTIES_FILE, e.getMessage());
			System.exit(1);
		}

		String internalId = null;
		Dao dao = new Dao(client);
		internalId = dao.getBomIdbyName("S00001");
		print("bom internalid is " + internalId);

		internalId = dao.getBomRevisionIdbyNameJoinBomId("v200", "1");
		print("bom revision internalid is " + internalId);

	}
}
