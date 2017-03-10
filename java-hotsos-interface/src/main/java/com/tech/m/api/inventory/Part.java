
package com.tech.m.api.inventory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tech.m.api.ApiObject;


/**
 * <p>Java class for Part complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Part"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:api.m-tech.com}apiObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StockRooms" type="{urn:inventory.api.m-tech.com}ArrayOfStockRoom" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Part", propOrder = {
    "name",
    "stockRooms"
})
public class Part
    extends ApiObject
{

    @XmlElementRef(name = "Name", namespace = "urn:inventory.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "StockRooms", namespace = "urn:inventory.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStockRoom> stockRooms;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the stockRooms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockRoom }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStockRoom> getStockRooms() {
        return stockRooms;
    }

    /**
     * Sets the value of the stockRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockRoom }{@code >}
     *     
     */
    public void setStockRooms(JAXBElement<ArrayOfStockRoom> value) {
        this.stockRooms = value;
    }

}
