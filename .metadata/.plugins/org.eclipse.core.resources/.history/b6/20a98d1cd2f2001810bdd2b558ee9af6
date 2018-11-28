/**
 * SayHiServiceImpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.bansi.ws.example;

public class SayHiServiceImpServiceLocator extends org.apache.axis.client.Service implements com.bansi.ws.example.SayHiServiceImpService {

    public SayHiServiceImpServiceLocator() {
    }


    public SayHiServiceImpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SayHiServiceImpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SayHiServiceImpPort
    private java.lang.String SayHiServiceImpPort_address = "http://localhost:7775/wstest/service/sayhi";

    public java.lang.String getSayHiServiceImpPortAddress() {
        return SayHiServiceImpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SayHiServiceImpPortWSDDServiceName = "SayHiServiceImpPort";

    public java.lang.String getSayHiServiceImpPortWSDDServiceName() {
        return SayHiServiceImpPortWSDDServiceName;
    }

    public void setSayHiServiceImpPortWSDDServiceName(java.lang.String name) {
        SayHiServiceImpPortWSDDServiceName = name;
    }

    public com.bansi.ws.example.SayHiService getSayHiServiceImpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SayHiServiceImpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSayHiServiceImpPort(endpoint);
    }

    public com.bansi.ws.example.SayHiService getSayHiServiceImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bansi.ws.example.SayHiServiceImpPortBindingStub _stub = new com.bansi.ws.example.SayHiServiceImpPortBindingStub(portAddress, this);
            _stub.setPortName(getSayHiServiceImpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSayHiServiceImpPortEndpointAddress(java.lang.String address) {
        SayHiServiceImpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bansi.ws.example.SayHiService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bansi.ws.example.SayHiServiceImpPortBindingStub _stub = new com.bansi.ws.example.SayHiServiceImpPortBindingStub(new java.net.URL(SayHiServiceImpPort_address), this);
                _stub.setPortName(getSayHiServiceImpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SayHiServiceImpPort".equals(inputPortName)) {
            return getSayHiServiceImpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example.ws.bansi.com/", "SayHiServiceImpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example.ws.bansi.com/", "SayHiServiceImpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SayHiServiceImpPort".equals(portName)) {
            setSayHiServiceImpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
