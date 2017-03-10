
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
 *         &lt;element name="GetStorageCollectionWithLocatorResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
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
    "getStorageCollectionWithLocatorResult"
})
@XmlRootElement(name = "GetStorageCollectionWithLocatorResponse")
public class GetStorageCollectionWithLocatorResponse {

    @XmlElement(name = "GetStorageCollectionWithLocatorResult", required = true)
    protected byte[] getStorageCollectionWithLocatorResult;

    /**
     * Gets the value of the getStorageCollectionWithLocatorResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetStorageCollectionWithLocatorResult() {
        return getStorageCollectionWithLocatorResult;
    }

    /**
     * Sets the value of the getStorageCollectionWithLocatorResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetStorageCollectionWithLocatorResult(byte[] value) {
        this.getStorageCollectionWithLocatorResult = value;
    }

}
