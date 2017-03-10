
package com.tech.m.api.inventory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tech.m.api.ApiObject;


/**
 * <p>Java class for UsePartRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsePartRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:api.m-tech.com}apiObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StockRoomID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsePartRequest", propOrder = {
    "lineID",
    "partID",
    "price",
    "quantity",
    "serviceOrderID",
    "stockRoomID"
})
public class UsePartRequest
    extends ApiObject
{

    @XmlElementRef(name = "LineID", namespace = "urn:inventory.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineID;
    @XmlElementRef(name = "PartID", namespace = "urn:inventory.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partID;
    @XmlElementRef(name = "Price", namespace = "urn:inventory.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> price;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElementRef(name = "ServiceOrderID", namespace = "urn:inventory.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceOrderID;
    @XmlElementRef(name = "StockRoomID", namespace = "urn:inventory.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stockRoomID;

    /**
     * Gets the value of the lineID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineID() {
        return lineID;
    }

    /**
     * Sets the value of the lineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineID(JAXBElement<String> value) {
        this.lineID = value;
    }

    /**
     * Gets the value of the partID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartID() {
        return partID;
    }

    /**
     * Sets the value of the partID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartID(JAXBElement<String> value) {
        this.partID = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPrice(JAXBElement<Double> value) {
        this.price = value;
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
     * Gets the value of the serviceOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceOrderID() {
        return serviceOrderID;
    }

    /**
     * Sets the value of the serviceOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceOrderID(JAXBElement<String> value) {
        this.serviceOrderID = value;
    }

    /**
     * Gets the value of the stockRoomID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStockRoomID() {
        return stockRoomID;
    }

    /**
     * Sets the value of the stockRoomID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStockRoomID(JAXBElement<String> value) {
        this.stockRoomID = value;
    }

}
