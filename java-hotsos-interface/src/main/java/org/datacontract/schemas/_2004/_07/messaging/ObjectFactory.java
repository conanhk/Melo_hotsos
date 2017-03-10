
package org.datacontract.schemas._2004._07.messaging;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.messaging package. 
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

    private final static QName _Device_QNAME = new QName("http://schemas.datacontract.org/2004/07/messaging.api", "Device");
    private final static QName _DeviceName_QNAME = new QName("http://schemas.datacontract.org/2004/07/messaging.api", "Name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.messaging
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Device }
     * 
     */
    public Device createDevice() {
        return new Device();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Device }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/messaging.api", name = "Device")
    public JAXBElement<Device> createDevice(Device value) {
        return new JAXBElement<Device>(_Device_QNAME, Device.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/messaging.api", name = "Name", scope = Device.class)
    public JAXBElement<String> createDeviceName(String value) {
        return new JAXBElement<String>(_DeviceName_QNAME, String.class, Device.class, value);
    }

}
