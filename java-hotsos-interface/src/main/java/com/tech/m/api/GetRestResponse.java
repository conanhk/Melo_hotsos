
package com.tech.m.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetRestResult" type="{urn:api.m-tech.com}apiObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getRestResult"
})
@XmlRootElement(name = "GetRestResponse")
public class GetRestResponse {

    @XmlElementRef(name = "GetRestResult", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ApiObject> getRestResult;

    /**
     * Gets the value of the getRestResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApiObject }{@code >}
     *     
     */
    public JAXBElement<ApiObject> getGetRestResult() {
        return getRestResult;
    }

    /**
     * Sets the value of the getRestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApiObject }{@code >}
     *     
     */
    public void setGetRestResult(JAXBElement<ApiObject> value) {
        this.getRestResult = value;
    }

}
