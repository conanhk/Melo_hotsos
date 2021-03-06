
package com.tech.m.api;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-02-21T09:17:10.026+08:00
 * Generated source version: 3.1.10
 */

@WebFault(name = "apiFault", targetNamespace = "urn:api.m-tech.com")
public class MTechAPISendApiFaultFaultMessage extends Exception {
    
    private com.tech.m.api.fault.ApiFault apiFault;

    public MTechAPISendApiFaultFaultMessage() {
        super();
    }
    
    public MTechAPISendApiFaultFaultMessage(String message) {
        super(message);
    }
    
    public MTechAPISendApiFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public MTechAPISendApiFaultFaultMessage(String message, com.tech.m.api.fault.ApiFault apiFault) {
        super(message);
        this.apiFault = apiFault;
    }

    public MTechAPISendApiFaultFaultMessage(String message, com.tech.m.api.fault.ApiFault apiFault, Throwable cause) {
        super(message, cause);
        this.apiFault = apiFault;
    }

    public com.tech.m.api.fault.ApiFault getFaultInfo() {
        return this.apiFault;
    }
}
