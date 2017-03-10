
package com.tech.m.api.guest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tech.m.api.ApiObject;


/**
 * <p>Java class for Consumption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Consumption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:api.m-tech.com}apiObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amenity" type="{urn:guest.api.m-tech.com}Amenity" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consumption", propOrder = {
    "amenity",
    "quantity",
    "roomCode"
})
public class Consumption
    extends ApiObject
{

    @XmlElementRef(name = "Amenity", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Amenity> amenity;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "RoomCode")
    protected Integer roomCode;

    /**
     * Gets the value of the amenity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Amenity }{@code >}
     *     
     */
    public JAXBElement<Amenity> getAmenity() {
        return amenity;
    }

    /**
     * Sets the value of the amenity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Amenity }{@code >}
     *     
     */
    public void setAmenity(JAXBElement<Amenity> value) {
        this.amenity = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the roomCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoomCode() {
        return roomCode;
    }

    /**
     * Sets the value of the roomCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoomCode(Integer value) {
        this.roomCode = value;
    }

}
