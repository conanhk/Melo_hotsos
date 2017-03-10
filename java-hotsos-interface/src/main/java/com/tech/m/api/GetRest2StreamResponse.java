
package com.tech.m.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetRest2StreamResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
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
    "getRest2StreamResult"
})
@XmlRootElement(name = "GetRest2StreamResponse")
public class GetRest2StreamResponse {

    @XmlElement(name = "GetRest2StreamResult", required = true)
    protected byte[] getRest2StreamResult;

    /**
     * Gets the value of the getRest2StreamResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetRest2StreamResult() {
        return getRest2StreamResult;
    }

    /**
     * Sets the value of the getRest2StreamResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetRest2StreamResult(byte[] value) {
        this.getRest2StreamResult = value;
    }

}
