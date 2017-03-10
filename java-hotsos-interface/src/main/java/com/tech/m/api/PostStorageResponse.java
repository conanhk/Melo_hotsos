
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
 *         &lt;element name="PostStorageResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
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
    "postStorageResult"
})
@XmlRootElement(name = "PostStorageResponse")
public class PostStorageResponse {

    @XmlElement(name = "PostStorageResult", required = true)
    protected byte[] postStorageResult;

    /**
     * Gets the value of the postStorageResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPostStorageResult() {
        return postStorageResult;
    }

    /**
     * Sets the value of the postStorageResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPostStorageResult(byte[] value) {
        this.postStorageResult = value;
    }

}
