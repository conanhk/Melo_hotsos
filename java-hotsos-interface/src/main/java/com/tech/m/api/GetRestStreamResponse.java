
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
 *         &lt;element name="GetRestStreamResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
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
    "getRestStreamResult"
})
@XmlRootElement(name = "GetRestStreamResponse")
public class GetRestStreamResponse {

    @XmlElement(name = "GetRestStreamResult", required = true)
    protected byte[] getRestStreamResult;

    /**
     * Gets the value of the getRestStreamResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetRestStreamResult() {
        return getRestStreamResult;
    }

    /**
     * Sets the value of the getRestStreamResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetRestStreamResult(byte[] value) {
        this.getRestStreamResult = value;
    }

}
