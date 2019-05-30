package com.bansi.webservices.samples.v2019_1;

import com.netsuite.webservices.platform.core_2019_1.BaseRef;
import com.netsuite.webservices.platform.core_2019_1.Passport;
import com.netsuite.webservices.platform.core_2019_1.Record;
import com.netsuite.webservices.platform.core_2019_1.RecordList;
//import com.netsuite.webservices.platform.core_2019_1.RecordList;
import com.netsuite.webservices.platform.core_2019_1.RecordRef;
import com.netsuite.webservices.platform.core_2019_1.SearchResult;
import com.netsuite.webservices.platform.core_2019_1.SearchRow;
import com.netsuite.webservices.platform.core_2019_1.SearchRowList;
//import com.netsuite.webservices.platform.core_2019_1.SearchRowList;
import com.netsuite.webservices.platform.core_2019_1.SsoPassport;
import com.netsuite.webservices.platform.core_2019_1.StatusDetail;
import com.netsuite.webservices.platform.core_2019_1.TokenPassport;
import com.netsuite.webservices.platform.core_2019_1.TokenPassportSignature;
import com.netsuite.webservices.platform.core_2019_1.types.RecordType;
import com.netsuite.webservices.platform.messages_2019_1.ReadResponseList;
import com.netsuite.webservices.platform.messages_2019_1.WriteResponseList;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>This utils class provides endpoint specific util methods.</p>
 * <p>&copy; 2017 NetSuite Inc.</p>
 *
 * @version 2017.2
 */
public final class Utils {

	/**
	 * Private constructor.
	 */
	private Utils() {
	}

	/**
	 * Converts general {@code Passport} to endpoint specific {@code Passport}.
	 *
	 * @param passport General passport to be converted to the endpoint specific passport
	 * @return Endpoint specific passport which is accepted by endpoint schema
	 */
	public static Passport convertPassport(com.netsuite.suitetalk.client.common.authentication.Passport passport) {
		Passport endpointPassport = new Passport();
		endpointPassport.setEmail(passport.getEmail());
		endpointPassport.setPassword(passport.getPassword());
		endpointPassport.setAccount(passport.getAccount());
		endpointPassport.setRole(createRecordRef(passport.getRole()));
		return endpointPassport;
	}

	/**
	 * Converts general {@code SsoPassport} to endpoint specific {@code SsoPassport}.
	 *
	 * @param ssoPassport General SSO passport to be converted to the endpoint specific SSO passport
	 * @return Endpoint specific SSO passport which is accepted by endpoint schema
	 */
	public static SsoPassport convertSsoPassport(com.netsuite.suitetalk.client.common.authentication.SsoPassport ssoPassport) {
		SsoPassport endpointSsoPassport = new SsoPassport();
		endpointSsoPassport.setAuthenticationToken(ssoPassport.getAuthenticationToken());
		endpointSsoPassport.setPartnerId(ssoPassport.getPartnerId());
		endpointSsoPassport.setPartnerAccount(ssoPassport.getPartnerAccount());
		endpointSsoPassport.setPartnerUserId(ssoPassport.getPartnerUserId());
		return endpointSsoPassport;
	}

	/**
	 * Converts general {@code TokenPassport} to endpoint specific {@code TokenPassport}.
	 *
	 * @param tokenPassport General token passport to be converted to the endpoint specific token passport
	 * @return Endpoint specific token passport which is accepted by endpoint schema
	 */
	public static TokenPassport convertTokenPassport(com.netsuite.suitetalk.client.common.authentication.TokenPassport tokenPassport) {
		TokenPassport endpointTokenPassport = new TokenPassport();
		endpointTokenPassport.setAccount(tokenPassport.getAccount());
		endpointTokenPassport.setConsumerKey(tokenPassport.getConsumerKey());
		endpointTokenPassport.setToken(tokenPassport.getToken());
		endpointTokenPassport.setNonce(tokenPassport.getNonce());
		endpointTokenPassport.setTimestamp(tokenPassport.getTimestamp());

		TokenPassportSignature signature = new TokenPassportSignature();
		signature.setAlgorithm(tokenPassport.getSignatureAlgorithm().getNetSuiteFormat());
		signature.set_value(tokenPassport.getSignature());
		endpointTokenPassport.setSignature(signature);

		return endpointTokenPassport;
	}

	/**
	 * Creates reference to record ({@code RecordRef}) with provided {@code internalId}.
	 *
	 * @param internalId Internal ID of the record to be set to {@code RecordRef}
	 * @return Reference to record with provided {@code internalId}
	 */
	public static RecordRef createRecordRef(String internalId) {
		RecordRef recordRef = new RecordRef();
		recordRef.setInternalId(internalId);
		return recordRef;
	}

	/**
	 * Creates reference to record ({@code RecordRef}) with provided {@code internalId} and {@code recordType}.
	 *
	 * @param internalId Internal ID of the record to be set to {@code RecordRef}
	 * @param recordType Type of the record to be set to {@code RecordRef}
	 * @return Reference to record with provided {@code internalId} and {@code recordType}
	 */
	public static RecordRef createRecordRef(String internalId, RecordType recordType) {
		RecordRef recordRef = createRecordRef(internalId);
		recordRef.setType(recordType);
		return recordRef;
	}

	/**
	 * Creates reference to record ({@code RecordRef}) with provided {@code externalId} and {@code recordType}.
	 *
	 * @param externalId External ID of the record to be set to {@code RecordRef}
	 * @param recordType Type of the record to be set to {@code RecordRef}
	 * @return Reference to record with provided {@code externalId} and {@code recordType}
	 */
	public static RecordRef createRecordRefWithExternalId(String externalId, RecordType recordType) {
		RecordRef recordRef = new RecordRef();
		recordRef.setExternalId(externalId);
		recordRef.setType(recordType);
		return recordRef;
	}

	/**
	 * Gets internal ID from the {@code BaseRef} or its descendants.
	 *
	 * @param baseRef Reference to the record which internal ID should be returned
	 * @return Internal ID stored in the provided record reference
	 */
	public static String getInternalId(BaseRef baseRef) {
		try {
			Method getInternalIdMethod = baseRef.getClass().getMethod("getInternalId");
			return (String) getInternalIdMethod.invoke(baseRef);
		} catch (NoSuchMethodException e) {
			throw new UnsupportedOperationException("Cannot call getInternalId() on " + baseRef.getClass().getName());
		} catch (InvocationTargetException | IllegalAccessException e) {
			throw new IllegalStateException(e);
		}
	}

	/**
	 * Parses all internal IDs returned in provided {@code writeResponseList}.
	 *
	 * @param writeResponseList List of write responses from which you want to parse all internal IDs
	 * @return List of internal IDs included in provided write response list
	 */
	public static List<String> getInternalIds(WriteResponseList writeResponseList) {
		
		return Arrays.stream(writeResponseList.getWriteResponse()).map(writeResponse -> {
			
			Boolean isIsSuccess = true;
			for (StatusDetail sd : writeResponse.getStatus().getStatusDetail()) {
				isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
			}
			
			if (writeResponse == null || !isIsSuccess) {
				return null;
			}
			return getInternalId(writeResponse.getBaseRef());
		}).collect(Collectors.toList());
	}

	/**
	 * Gets success statuses from provided {@code writeResponseList}.
	 *
	 * @param writeResponseList List of write responses from which you want to parse all statuses
	 * @return List of {@code boolean}s. {@code true} represents successful response, {@code false} failed response
	 */
	public static List<Boolean> getSuccess(WriteResponseList writeResponseList) {
		
		return Arrays.stream(writeResponseList.getWriteResponse()).map(writeResponse -> writeResponse != null && writeResponse.getStatus().getStatusDetail().length > 0)
				.collect(Collectors.toList());
	}

	/**
	 * Gets list of returned records from provided {@code readResponseList}.
	 *
	 * @param readResponseList Read response list containing records which should be get as a list
	 * @return List of the records included in the provided {@code readResponseList}
	 */
	public static List<Record> getRecords(ReadResponseList readResponseList) {
		return Arrays.stream(readResponseList.getReadResponse()).map(readResponse -> readResponse == null ? null : readResponse.getRecord())
				.collect(Collectors.toList());
	}

	/**
	 * Creates list of objects ({@code SearchRow}s or {@code Record}s) from given {@code searchResult}.
	 *
	 * @param searchResult Search result to be converted to list
	 * @return List of {@code SearchRow}s in case of result from advanced search or list of {@code Record}s otherwise
	 */
	public static List<?> getSearchResults(SearchResult searchResult) {
		if (searchResult == null || searchResult.getStatus() == null || searchResult.getStatus().getStatusDetail().length <= 0) {
			return null;
		}
		if (searchResult.getTotalRecords() == 0) {
			return Collections.emptyList();
		}
		RecordList recordList = searchResult.getRecordList();
		SearchRowList searchRowList = searchResult.getSearchRowList();
		if (recordList == null && searchRowList == null) {
			return null;
		}
		return Arrays.asList(searchRowList != null ? searchRowList : recordList);
	}
}
