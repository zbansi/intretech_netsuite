package com.bansi.webservices.samples.utils_2019_1;



import com.netsuite.webservices.platform.core_2019_1.RecordRef;
import com.netsuite.webservices.platform.core_2019_1.SearchResult;
import com.netsuite.webservices.platform.core_2019_1.StatusDetail;
import com.netsuite.webservices.platform.messages_2019_1.ReadResponse;
import com.netsuite.webservices.platform.messages_2019_1.WriteResponse;

import static com.bansi.webservices.samples.Messages.NOT_AVAILABLE;

/**
 * <p>Utils class containing some convenient methods for parsing information from SOAP responses.</p>
 * <p>© 2017 NetSuite Inc. All rights reserved.</p>
 */
public final class ParsingUtils {

    private ParsingUtils() {
    }

    public static String getInternalId(WriteResponse response) {
        if (response == null || response.getBaseRef() == null) {
            return NOT_AVAILABLE;
        }
        return ((RecordRef) response.getBaseRef()).getInternalId();
    }

    public static String getErrorMessage(ReadResponse response) {
        if (response == null || response.getStatus() == null) {
            return NOT_AVAILABLE;
        }
        return getErrorMessage(response.getStatus());
    }

    public static String getErrorMessage(WriteResponse response) {
        if (response == null || response.getStatus() == null) {
            return NOT_AVAILABLE;
        }
        return getErrorMessage(response.getStatus());
    }

    public static String getErrorMessage(SearchResult searchResult) {
        if (searchResult == null || searchResult.getStatus() == null) {
            return NOT_AVAILABLE;
        }
        return getErrorMessage(searchResult.getStatus());
    }

    public static String getErrorMessage(StatusDetail[] statusDetails) {
        if (statusDetails == null || statusDetails.length == 0) {
            return NOT_AVAILABLE;
        }
        String errorMessage = statusDetails[0].getMessage();
        return errorMessage == null ? NOT_AVAILABLE : errorMessage;
    }
}
