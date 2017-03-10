
package com.tech.m.api.room;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tech.m.api.ApiObject;


/**
 * <p>Java class for TaskSheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskSheet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:api.m-tech.com}apiObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttendantFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttendantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttendantLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaskCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaskInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskSheet", propOrder = {
    "attendantFirstName",
    "attendantID",
    "attendantLastName",
    "roomNumber",
    "taskCode",
    "taskInstruction"
})
public class TaskSheet
    extends ApiObject
{

    @XmlElementRef(name = "AttendantFirstName", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attendantFirstName;
    @XmlElementRef(name = "AttendantID", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attendantID;
    @XmlElementRef(name = "AttendantLastName", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attendantLastName;
    @XmlElementRef(name = "RoomNumber", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomNumber;
    @XmlElementRef(name = "TaskCode", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taskCode;
    @XmlElementRef(name = "TaskInstruction", namespace = "urn:room.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taskInstruction;

    /**
     * Gets the value of the attendantFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttendantFirstName() {
        return attendantFirstName;
    }

    /**
     * Sets the value of the attendantFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttendantFirstName(JAXBElement<String> value) {
        this.attendantFirstName = value;
    }

    /**
     * Gets the value of the attendantID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttendantID() {
        return attendantID;
    }

    /**
     * Sets the value of the attendantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttendantID(JAXBElement<String> value) {
        this.attendantID = value;
    }

    /**
     * Gets the value of the attendantLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttendantLastName() {
        return attendantLastName;
    }

    /**
     * Sets the value of the attendantLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttendantLastName(JAXBElement<String> value) {
        this.attendantLastName = value;
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
     * Gets the value of the taskInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaskInstruction() {
        return taskInstruction;
    }

    /**
     * Sets the value of the taskInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaskInstruction(JAXBElement<String> value) {
        this.taskInstruction = value;
    }

}
