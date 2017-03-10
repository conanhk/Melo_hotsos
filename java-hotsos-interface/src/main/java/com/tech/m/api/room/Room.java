
package com.tech.m.api.room;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tech.m.api.ApiObject;
import com.tech.m.api.User;


/**
 * <p>Java class for Room complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Room"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:api.m-tech.com}apiObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attendant" type="{urn:api.m-tech.com}User" minOccurs="0"/&gt;
 *         &lt;element name="CleanTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DND" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EventType" type="{urn:room.api.m-tech.com}RoomEventEnum" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestInRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MakeUp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Occupied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceStatus" type="{urn:room.api.m-tech.com}ServiceStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="Shift" type="{urn:room.api.m-tech.com}HousekeepingShiftEnum" minOccurs="0"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{urn:room.api.m-tech.com}RoomStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="TaskCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Room", propOrder = {
    "attendant",
    "cleanTime",
    "dnd",
    "eventTime",
    "eventType",
    "extension",
    "guestInRoom",
    "makeUp",
    "name",
    "occupied",
    "roomNumber",
    "section",
    "serviceStatus",
    "shift",
    "specialInstructions",
    "status",
    "taskCode",
    "url"
})
public class Room
    extends ApiObject
{

    @XmlElementRef(name = "Attendant", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> attendant;
    @XmlElementRef(name = "CleanTime", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> cleanTime;
    @XmlElementRef(name = "DND", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dnd;
    @XmlElementRef(name = "EventTime", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> eventTime;
    @XmlElementRef(name = "EventType", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<RoomEventEnum> eventType;
    @XmlElementRef(name = "Extension", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extension;
    @XmlElementRef(name = "GuestInRoom", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> guestInRoom;
    @XmlElementRef(name = "MakeUp", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> makeUp;
    @XmlElementRef(name = "Name", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Occupied", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> occupied;
    @XmlElementRef(name = "RoomNumber", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomNumber;
    @XmlElementRef(name = "Section", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> section;
    @XmlElementRef(name = "ServiceStatus", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceStatusEnum> serviceStatus;
    @XmlElementRef(name = "Shift", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<HousekeepingShiftEnum> shift;
    @XmlElementRef(name = "SpecialInstructions", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialInstructions;
    @XmlElementRef(name = "Status", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<RoomStatusEnum> status;
    @XmlElementRef(name = "TaskCode", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taskCode;
    @XmlElementRef(name = "URL", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url;

    /**
     * Gets the value of the attendant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getAttendant() {
        return attendant;
    }

    /**
     * Sets the value of the attendant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setAttendant(JAXBElement<User> value) {
        this.attendant = value;
    }

    /**
     * Gets the value of the cleanTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCleanTime() {
        return cleanTime;
    }

    /**
     * Sets the value of the cleanTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCleanTime(JAXBElement<XMLGregorianCalendar> value) {
        this.cleanTime = value;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDND() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDND(JAXBElement<Boolean> value) {
        this.dnd = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEventTime(JAXBElement<XMLGregorianCalendar> value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoomEventEnum }{@code >}
     *     
     */
    public JAXBElement<RoomEventEnum> getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoomEventEnum }{@code >}
     *     
     */
    public void setEventType(JAXBElement<RoomEventEnum> value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtension(JAXBElement<String> value) {
        this.extension = value;
    }

    /**
     * Gets the value of the guestInRoom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGuestInRoom() {
        return guestInRoom;
    }

    /**
     * Sets the value of the guestInRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGuestInRoom(JAXBElement<Boolean> value) {
        this.guestInRoom = value;
    }

    /**
     * Gets the value of the makeUp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMakeUp() {
        return makeUp;
    }

    /**
     * Sets the value of the makeUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMakeUp(JAXBElement<Boolean> value) {
        this.makeUp = value;
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
     * Gets the value of the occupied property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOccupied() {
        return occupied;
    }

    /**
     * Sets the value of the occupied property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOccupied(JAXBElement<Boolean> value) {
        this.occupied = value;
    }

    /**
     * Gets the value of the roomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomNumber(JAXBElement<String> value) {
        this.roomNumber = value;
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
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceStatusEnum }{@code >}
     *     
     */
    public JAXBElement<ServiceStatusEnum> getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceStatusEnum }{@code >}
     *     
     */
    public void setServiceStatus(JAXBElement<ServiceStatusEnum> value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the shift property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HousekeepingShiftEnum }{@code >}
     *     
     */
    public JAXBElement<HousekeepingShiftEnum> getShift() {
        return shift;
    }

    /**
     * Sets the value of the shift property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HousekeepingShiftEnum }{@code >}
     *     
     */
    public void setShift(JAXBElement<HousekeepingShiftEnum> value) {
        this.shift = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Sets the value of the specialInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialInstructions(JAXBElement<String> value) {
        this.specialInstructions = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoomStatusEnum }{@code >}
     *     
     */
    public JAXBElement<RoomStatusEnum> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoomStatusEnum }{@code >}
     *     
     */
    public void setStatus(JAXBElement<RoomStatusEnum> value) {
        this.status = value;
    }

    /**
     * Gets the value of the taskCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaskCode() {
        return taskCode;
    }

    /**
     * Sets the value of the taskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaskCode(JAXBElement<String> value) {
        this.taskCode = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setURL(JAXBElement<String> value) {
        this.url = value;
    }

}
