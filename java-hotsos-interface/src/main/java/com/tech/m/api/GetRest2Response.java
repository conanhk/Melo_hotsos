
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
 *         &lt;element name="GetRest2Result" type="{urn:api.m-tech.com}apiObject" minOccurs="0"/&gt;
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
    "getRest2Result"
})
@XmlRootElement(name = "GetRest2Response")
public class GetRest2Response {

    @XmlElementRef(name = "GetRest2Result", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ApiObject> getRest2Result;

    /**
     * Gets the value of the getRest2Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApiObject }{@code >}
     *     
     */
    public JAXBElement<ApiObject> getGetRest2Result() {
        return getRest2Result;
    }

    /**
     * Sets the value of the getRest2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApiObject }{@code >}
     *     
     */
    public void setGetRest2Result(JAXBElement<ApiObject> value) {
        this.getRest2Result = value;
    }

}
