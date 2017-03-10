
package com.tech.m.api.fault;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tech.m.api.fault package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ApiFault_QNAME = new QName("urn:fault.api.m-tech.com", "apiFault");
    private final static QName _ApiFaultCode_QNAME = new QName("urn:fault.api.m-tech.com", "apiFaultCode");
    private final static QName _ApiFaultMessage_QNAME = new QName("urn:fault.api.m-tech.com", "message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tech.m.api.fault
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApiFault }
     * 
     */
    public ApiFault createApiFault() {
        return new ApiFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.api.m-tech.com", name = "apiFault")
    public JAXBElement<ApiFault> createApiFault(ApiFault value) {
        return new JAXBElement<ApiFault>(_ApiFault_QNAME, ApiFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.api.m-tech.com", name = "apiFaultCode")
    public JAXBElement<ApiFaultCode> createApiFaultCode(ApiFaultCode value) {
        return new JAXBElement<ApiFaultCode>(_ApiFaultCode_QNAME, ApiFaultCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.api.m-tech.com", name = "message", scope = ApiFault.class)
    public JAXBElement<String> createApiFaultMessage(String value) {
        return new JAXBElement<String>(_ApiFaultMessage_QNAME, String.class, ApiFault.class, value);
    }

}
