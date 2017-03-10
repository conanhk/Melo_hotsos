
package com.tech.m.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryServiceOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryServiceOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:api.m-tech.com}apiObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryServiceOrder", propOrder = {
    "resID"
})
public class QueryServiceOrder
    extends ApiObject
{

    @XmlElementRef(name = "ResID", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resID;

    /**
     * Gets the value of the resID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResID() {
        return resID;
    }

    /**
     * Sets the value of the resID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResID(JAXBElement<String> value) {
        this.resID = value;
    }

}
