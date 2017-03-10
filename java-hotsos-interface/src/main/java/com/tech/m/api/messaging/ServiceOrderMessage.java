
package com.tech.m.api.messaging;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tech.m.api.serviceorder.ServiceOrder;


/**
 * <p>Java class for ServiceOrderMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceOrderMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:messaging.api.m-tech.com}Message"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceOrder" type="{urn:serviceorder.api.m-tech.com}ServiceOrder" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOrderMessage", propOrder = {
    "serviceOrder"
})
public class ServiceOrderMessage
    extends Message
{

    @XmlElementRef(name = "ServiceOrder", namespace = "urn:messaging.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOrder> serviceOrder;

    /**
     * Gets the value of the serviceOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}
     *     
     */
    public JAXBElement<ServiceOrder> getServiceOrder() {
        return serviceOrder;
    }

    /**
     * Sets the value of the serviceOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}
     *     
     */
    public void setServiceOrder(JAXBElement<ServiceOrder> value) {
        this.serviceOrder = value;
    }

}
