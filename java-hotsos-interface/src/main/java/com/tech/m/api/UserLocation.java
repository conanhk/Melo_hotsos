
package com.tech.m.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:api.m-tech.com}apiObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BarometerInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeaconInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeoLocation" type="{urn:api.m-tech.com}GeoCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserLocation", propOrder = {
    "barometerInfo",
    "beaconInfo",
    "connectionInfo",
    "geoLocation",
    "lastUpdated",
    "locationName"
})
public class UserLocation
    extends ApiObject
{

    @XmlElementRef(name = "BarometerInfo", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> barometerInfo;
    @XmlElementRef(name = "BeaconInfo", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> beaconInfo;
    @XmlElementRef(name = "ConnectionInfo", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> connectionInfo;
    @XmlElementRef(name = "GeoLocation", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoCoordinate> geoLocation;
    @XmlElementRef(name = "LastUpdated", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastUpdated;
    @XmlElementRef(name = "LocationName", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationName;

    /**
     * Gets the value of the barometerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBarometerInfo() {
        return barometerInfo;
    }

    /**
     * Sets the value of the barometerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBarometerInfo(JAXBElement<String> value) {
        this.barometerInfo = value;
    }

    /**
     * Gets the value of the beaconInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBeaconInfo() {
        return beaconInfo;
    }

    /**
     * Sets the value of the beaconInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBeaconInfo(JAXBElement<String> value) {
        this.beaconInfo = value;
    }

    /**
     * Gets the value of the connectionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConnectionInfo() {
        return connectionInfo;
    }

    /**
     * Sets the value of the connectionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConnectionInfo(JAXBElement<String> value) {
        this.connectionInfo = value;
    }

    /**
     * Gets the value of the geoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public JAXBElement<GeoCoordinate> getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}
     *     
     */
    public void setGeoLocation(JAXBElement<GeoCoordinate> value) {
        this.geoLocation = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUpdated(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationName(JAXBElement<String> value) {
        this.locationName = value;
    }

}
