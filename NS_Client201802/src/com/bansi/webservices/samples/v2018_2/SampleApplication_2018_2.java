package com.bansi.webservices.samples.v2018_2;


//import com.netsuite.suitetalk.client.v2017_2.WsClient;

import org.apache.axis.AxisFault;

import com.bansi.webservices.samples.v2018_2.Properties;

import java.io.IOException;
import java.net.MalformedURLException;

import static com.bansi.webservices.samples.Messages.ERROR_OCCURRED;
import static com.bansi.webservices.samples.Messages.INVALID_WS_URL;
import static com.bansi.webservices.samples.Messages.WRONG_PROPERTIES_FILE;
import static com.bansi.webservices.samples.utils.PrintUtils.printError;

/**
 * <p>Fully functional, command-line driven application that illustrates how to connect to the NetSuite web services
 * and invoke operations.</p>
 * <p>Please see the README on how to compile and run. Note that the {@code nsclient.properties} file must exist
 * in the installed root directory for this application to run.</p>
 * <p>2017 Intretech Inc. All rights reserved.</p>
 */
public class SampleApplication_2018_2 {

    public static void main(String[] args) {
        WsClient_2018_2 client = null;
        try {
            client = WsClientFactory_2018_2.getWsClient(new Properties(), null);
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
        new SampleOperations_2018_2(client).run();
    }
}
