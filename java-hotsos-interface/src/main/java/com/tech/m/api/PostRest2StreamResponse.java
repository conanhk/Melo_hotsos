
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
 *         &lt;element name="PostRest2StreamResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
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
    "postRest2StreamResult"
})
@XmlRootElement(name = "PostRest2StreamResponse")
public class PostRest2StreamResponse {

    @XmlElement(name = "PostRest2StreamResult", required = true)
    protected byte[] postRest2StreamResult;

    /**
     * Gets the value of the postRest2StreamResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPostRest2StreamResult() {
        return postRest2StreamResult;
    }

    /**
     * Sets the value of the postRest2StreamResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPostRest2StreamResult(byte[] value) {
        this.postRest2StreamResult = value;
    }

}
