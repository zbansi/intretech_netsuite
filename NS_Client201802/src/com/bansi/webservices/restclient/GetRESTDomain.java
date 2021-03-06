//:prototypes/GetRESTDomain.java
package com.bansi.webservices.restclient;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

//Sample Java Call to the REST roles Service
public class GetRESTDomain {
	private BufferedReader _br = null;

	public GetRESTDomain() {
		_br = new BufferedReader(new InputStreamReader(System.in));
	}

	static class URLTriplet {
		String restDomain;
		String systemDomain;
		String webservicesDomain;
	}

	/** * Retrieve domains of a NetSuite account through RESTful WS call. ***/

	public URLTriplet getDataCenterUrls(String nsAccount, String nsEmail, String nsPassword) throws IOException, ParseException {
		//String sysURL = "https://rest.na1.netsuite.com/rest/roles";
		String sysURL = "https://rest.netsuite.com/rest/roles";
		//String sysURL = "https://webservices.netsuite.com/rest/roles";
		//String sysURL = "https://webservices.na1.netsuite.com/rest/roles";

		URLTriplet urls = new URLTriplet();
		// 'nlauth_account' should NOT be specified for this type of request
		// otherwise an error is returned.//
		String nlAuth = "NLAuth nlauth_email=" + nsEmail + ", nlauth_signature=" + nsPassword;
		URL u = new URL(sysURL);
		HttpsURLConnection uc = (HttpsURLConnection) u.openConnection();
		uc.setAllowUserInteraction(Boolean.FALSE);
		uc.setInstanceFollowRedirects(Boolean.FALSE);
		uc.setRequestMethod("GET");
		uc.setRequestProperty("Authorization", nlAuth);
		BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
		String inputLine = in.readLine();
		in.close();
		if (inputLine.length() > 0) {
			JSONArray jsonArr = (JSONArray) new JSONParser().parse(inputLine);

			for (int i = 0; i < jsonArr.size(); i++) {
				JSONObject json = (JSONObject) jsonArr.get(i);
				// Validate JSON object if (json.containsKey("account") &&
				// json.containsKey("dataCenterURLs"))
				{
					JSONObject jsonAccount = (JSONObject) json.get("account");
					JSONObject jsonDataCenters = (JSONObject) json.get("dataCenterURLs");
					// Validate account and retrieve domains if
					// (jsonAccount.get("internalId").toString().equalsIgnoreCase(nsAccount))
					{
						urls.restDomain = jsonDataCenters.get("restDomain").toString();
						urls.webservicesDomain = jsonDataCenters.get("webservicesDomain").toString();
						urls.systemDomain = jsonDataCenters.get("systemDomain").toString();
						break;
					}
				}
			}
		}

		return urls;
	}
	/*
	public static void main(String args[]) throws IOException {
		GetRESTDomain ns = new GetRESTDomain();
		while (true) {
			System.out.println("GET REST DOMAIN URL");
			System.out.print("Account      : ");
			String account = ns._br.readLine().trim();
	
			if (account.isEmpty()) {
				break;
			}
	
			System.out.print("Email address: ");
			String email = ns._br.readLine().trim();
			System.out.print("Password     : ");
			String password = ns._br.readLine().trim();
			try {
				//方法getDataCenterUrls()是在12.2端点中引入的，自12.2开始，应使用getDataCenterUrls()
				URLTriplet urls = ns.getDataCenterUrls(account, email, password);
				System.out.println("\nREST domain URL        : " + urls.restDomain + "\n");
				System.out.println("\nWeb services domain URL: " + urls.webservicesDomain + "\n");
				System.out.println("\nSystem domain URL      : " + urls.systemDomain + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		System.out.print("\nPress any key to exit...");
		ns._br.readLine().trim();
	}
	*/
}