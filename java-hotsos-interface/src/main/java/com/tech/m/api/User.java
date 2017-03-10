
package com.tech.m.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.messaging.Device;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:api.m-tech.com}apiObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentRoom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceInfo" type="{http://schemas.datacontract.org/2004/07/messaging.api}Device" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{urn:api.m-tech.com}UserLocation" minOccurs="0"/&gt;
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SHA512" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{urn:api.m-tech.com}UserStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="Trade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "currentRoom",
    "department",
    "device",
    "deviceInfo",
    "location",
    "login",
    "md5",
    "name",
    "password",
    "sha512",
    "section",
    "status",
    "trade"
})
public class User
    extends ApiObject
{

    @XmlElementRef(name = "CurrentRoom", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentRoom;
    @XmlElementRef(name = "Department", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> department;
    @XmlElementRef(name = "Device", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> device;
    @XmlElementRef(name = "DeviceInfo", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Device> deviceInfo;
    @XmlElementRef(name = "Location", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<UserLocation> location;
    @XmlElementRef(name = "Login", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> login;
    @XmlElementRef(name = "MD5", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> md5;
    @XmlElementRef(name = "Name", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Password", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "SHA512", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sha512;
    @XmlElementRef(name = "Section", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> section;
    @XmlElementRef(name = "Status", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<UserStatusEnum> status;
    @XmlElementRef(name = "Trade", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trade;

    /**
     * Gets the value of the currentRoom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentRoom() {
        return currentRoom;
    }

    /**
     * Sets the value of the currentRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentRoom(JAXBElement<String> value) {
        this.currentRoom = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartment(JAXBElement<String> value) {
        this.department = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDevice(JAXBElement<String> value) {
        this.device = value;
    }

    /**
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Device }{@code >}
     *     
     */
    public JAXBElement<Device> getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Device }{@code >}
     *     
     */
    public void setDeviceInfo(JAXBElement<Device> value) {
        this.deviceInfo = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserLocation }{@code >}
     *     
     */
    public JAXBElement<UserLocation> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserLocation }{@code >}
     *     
     */
    public void setLocation(JAXBElement<UserLocation> value) {
        this.location = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogin(JAXBElement<String> value) {
        this.login = value;
    }

    /**
     * Gets the value of the md5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMD5() {
        return md5;
    }

    /**
     * Sets the value of the md5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMD5(JAXBElement<String> value) {
        this.md5 = value;
    }

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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Gets the value of the sha512 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSHA512() {
        return sha512;
    }

    /**
     * Sets the value of the sha512 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSHA512(JAXBElement<String> value) {
        this.sha512 = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSection(JAXBElement<String> value) {
        this.section = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserStatusEnum }{@code >}
     *     
     */
    public JAXBElement<UserStatusEnum> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserStatusEnum }{@code >}
     *     
     */
    public void setStatus(JAXBElement<UserStatusEnum> value) {
        this.status = value;
    }

    /**
     * Gets the value of the trade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrade() {
        return trade;
    }

    /**
     * Sets the value of the trade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrade(JAXBElement<String> value) {
        this.trade = value;
    }

}
