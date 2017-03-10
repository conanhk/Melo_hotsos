
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
 *         &lt;element name="PostRestStreamResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
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
    "postRestStreamResult"
})
@XmlRootElement(name = "PostRestStreamResponse")
public class PostRestStreamResponse {

    @XmlElement(name = "PostRestStreamResult", required = true)
    protected byte[] postRestStreamResult;

    /**
     * Gets the value of the postRestStreamResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPostRestStreamResult() {
        return postRestStreamResult;
    }

    /**
     * Sets the value of the postRestStreamResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPostRestStreamResult(byte[] value) {
        this.postRestStreamResult = value;
    }

}
