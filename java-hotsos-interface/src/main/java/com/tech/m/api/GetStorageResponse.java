
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
 *         &lt;element name="GetStorageResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
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
    "getStorageResult"
})
@XmlRootElement(name = "GetStorageResponse")
public class GetStorageResponse {

    @XmlElement(name = "GetStorageResult", required = true)
    protected byte[] getStorageResult;

    /**
     * Gets the value of the getStorageResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetStorageResult() {
        return getStorageResult;
    }

    /**
     * Sets the value of the getStorageResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetStorageResult(byte[] value) {
        this.getStorageResult = value;
    }

}
