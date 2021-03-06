package com.bansi.webservices.samples;

import java.rmi.RemoteException;

/**
 * <p>Functional interface for storing sample operation into option included in {@code OptionList}.</p>
 * <p>2017 Intretech Inc. All rights reserved.</p>
 */
@FunctionalInterface
public interface Operation {
    void performOperation() throws RemoteException;
}
