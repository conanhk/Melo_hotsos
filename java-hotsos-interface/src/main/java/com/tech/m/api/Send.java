
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
 *         &lt;element name="apiObject" type="{urn:api.m-tech.com}apiObject"/&gt;
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
    "apiObject"
})
@XmlRootElement(name = "send")
public class Send {

    @XmlElement(required = true)
    protected ApiObject apiObject;

    /**
     * Gets the value of the apiObject property.
     * 
     * @return
     *     possible object is
     *     {@link ApiObject }
     *     
     */
    public ApiObject getApiObject() {
        return apiObject;
    }

    /**
     * Sets the value of the apiObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiObject }
     *     
     */
    public void setApiObject(ApiObject value) {
        this.apiObject = value;
    }

}
