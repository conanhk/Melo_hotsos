
package com.tech.m.api.messaging;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.tech.m.api.ApiObject;
import com.tech.m.api.User;


/**
 * <p>Java class for Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Message"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:api.m-tech.com}apiObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DirectedToTeam" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Recipient" type="{urn:api.m-tech.com}User" minOccurs="0"/&gt;
 *         &lt;element name="Response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{urn:messaging.api.m-tech.com}MessageTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="ValidResponses" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", propOrder = {
    "directedToTeam",
    "recipient",
    "response",
    "subject",
    "text",
    "type",
    "validResponses"
})
@XmlSeeAlso({
    ServiceOrderMessage.class
})
public class Message
    extends ApiObject
{

    @XmlElementRef(name = "DirectedToTeam", namespace = "urn:messaging.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> directedToTeam;
    @XmlElementRef(name = "Recipient", namespace = "urn:messaging.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> recipient;
    @XmlElementRef(name = "Response", namespace = "urn:messaging.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> response;
    @XmlElementRef(name = "Subject", namespace = "urn:messaging.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subject;
    @XmlElementRef(name = "Text", namespace = "urn:messaging.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;
    @XmlElementRef(name = "Type", namespace = "urn:messaging.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<MessageTypeEnum> type;
    @XmlElementRef(name = "ValidResponses", namespace = "urn:messaging.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> validResponses;

    /**
     * Gets the value of the directedToTeam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDirectedToTeam() {
        return directedToTeam;
    }

    /**
     * Sets the value of the directedToTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDirectedToTeam(JAXBElement<Boolean> value) {
        this.directedToTeam = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setRecipient(JAXBElement<User> value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponse(JAXBElement<String> value) {
        this.response = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject(JAXBElement<String> value) {
        this.subject = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setText(JAXBElement<String> value) {
        this.text = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MessageTypeEnum }{@code >}
     *     
     */
    public JAXBElement<MessageTypeEnum> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MessageTypeEnum }{@code >}
     *     
     */
    public void setType(JAXBElement<MessageTypeEnum> value) {
        this.type = value;
    }

    /**
     * Gets the value of the validResponses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getValidResponses() {
        return validResponses;
    }

    /**
     * Sets the value of the validResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setValidResponses(JAXBElement<ArrayOfstring> value) {
        this.validResponses = value;
    }

}
