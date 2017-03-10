
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
 *         &lt;element name="GetStorageRelatedByKeyResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
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
    "getStorageRelatedByKeyResult"
})
@XmlRootElement(name = "GetStorageRelatedByKeyResponse")
public class GetStorageRelatedByKeyResponse {

    @XmlElement(name = "GetStorageRelatedByKeyResult", required = true)
    protected byte[] getStorageRelatedByKeyResult;

    /**
     * Gets the value of the getStorageRelatedByKeyResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetStorageRelatedByKeyResult() {
        return getStorageRelatedByKeyResult;
    }

    /**
     * Sets the value of the getStorageRelatedByKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetStorageRelatedByKeyResult(byte[] value) {
        this.getStorageRelatedByKeyResult = value;
    }

}
