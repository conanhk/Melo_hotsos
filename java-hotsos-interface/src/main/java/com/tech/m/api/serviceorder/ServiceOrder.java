
package com.tech.m.api.serviceorder;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tech.m.api.ApiObject;
import com.tech.m.api.User;
import com.tech.m.api.guest.Reservation;
import com.tech.m.api.issue.Issue;
import com.tech.m.api.room.Room;


/**
 * <p>Java class for ServiceOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:api.m-tech.com}apiObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AssignedTo" type="{urn:api.m-tech.com}User" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{urn:api.m-tech.com}User" minOccurs="0"/&gt;
 *         &lt;element name="DirectedBy" type="{urn:api.m-tech.com}User" minOccurs="0"/&gt;
 *         &lt;element name="GuestRelated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Inspectee" type="{urn:api.m-tech.com}User" minOccurs="0"/&gt;
 *         &lt;element name="InspectionResults" type="{urn:serviceorder.api.m-tech.com}ArrayOfInspection" minOccurs="0"/&gt;
 *         &lt;element name="Issue" type="{urn:issue.api.m-tech.com}Issue" minOccurs="0"/&gt;
 *         &lt;element name="Labor" type="{urn:serviceorder.api.m-tech.com}ArrayOfLaborCost" minOccurs="0"/&gt;
 *         &lt;element name="LastAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastEvent" type="{urn:serviceorder.api.m-tech.com}ServiceOrderEventEnum" minOccurs="0"/&gt;
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{urn:room.api.m-tech.com}Room" minOccurs="0"/&gt;
 *         &lt;element name="LocationTo" type="{urn:room.api.m-tech.com}Room" minOccurs="0"/&gt;
 *         &lt;element name="NewRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parts" type="{urn:serviceorder.api.m-tech.com}ArrayOfPartCost" minOccurs="0"/&gt;
 *         &lt;element name="Posted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Recoveries" type="{urn:serviceorder.api.m-tech.com}ArrayOfRecovery" minOccurs="0"/&gt;
 *         &lt;element name="RequestTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestedBy" type="{urn:api.m-tech.com}User" minOccurs="0"/&gt;
 *         &lt;element name="Reservation" type="{urn:guest.api.m-tech.com}Reservation" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{urn:serviceorder.api.m-tech.com}ServiceOrderStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Trade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{urn:serviceorder.api.m-tech.com}ServiceOrderTypeEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOrder", propOrder = {
    "actionTime",
    "assignedTo",
    "createdBy",
    "directedBy",
    "guestRelated",
    "inspectee",
    "inspectionResults",
    "issue",
    "labor",
    "lastAction",
    "lastEvent",
    "lastModified",
    "location",
    "locationTo",
    "newRemark",
    "parts",
    "posted",
    "priority",
    "recoveries",
    "requestTime",
    "requestedBy",
    "reservation",
    "status",
    "text",
    "trade",
    "type"
})
public class ServiceOrder
    extends ApiObject
{

    @XmlElementRef(name = "ActionTime", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actionTime;
    @XmlElementRef(name = "AssignedTo", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> assignedTo;
    @XmlElementRef(name = "CreatedBy", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> createdBy;
    @XmlElementRef(name = "DirectedBy", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> directedBy;
    @XmlElementRef(name = "GuestRelated", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> guestRelated;
    @XmlElementRef(name = "Inspectee", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> inspectee;
    @XmlElementRef(name = "InspectionResults", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInspection> inspectionResults;
    @XmlElementRef(name = "Issue", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Issue> issue;
    @XmlElementRef(name = "Labor", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLaborCost> labor;
    @XmlElementRef(name = "LastAction", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastAction;
    @XmlElementRef(name = "LastEvent", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOrderEventEnum> lastEvent;
    @XmlElementRef(name = "LastModified", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModified;
    @XmlElementRef(name = "Location", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Room> location;
    @XmlElementRef(name = "LocationTo", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Room> locationTo;
    @XmlElementRef(name = "NewRemark", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newRemark;
    @XmlElementRef(name = "Parts", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPartCost> parts;
    @XmlElementRef(name = "Posted", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> posted;
    @XmlElementRef(name = "Priority", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> priority;
    @XmlElementRef(name = "Recoveries", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRecovery> recoveries;
    @XmlElementRef(name = "RequestTime", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> requestTime;
    @XmlElementRef(name = "RequestedBy", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> requestedBy;
    @XmlElementRef(name = "Reservation", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Reservation> reservation;
    @XmlElementRef(name = "Status", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOrderStatusEnum> status;
    @XmlElementRef(name = "Text", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;
    @XmlElementRef(name = "Trade", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trade;
    @XmlElementRef(name = "Type", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOrderTypeEnum> type;

    /**
     * Gets the value of the actionTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActionTime() {
        return actionTime;
    }

    /**
     * Sets the value of the actionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActionTime(JAXBElement<XMLGregorianCalendar> value) {
        this.actionTime = value;
    }

    /**
     * Gets the value of the assignedTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getAssignedTo() {
        return assignedTo;
    }

    /**
     * Sets the value of the assignedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setAssignedTo(JAXBElement<User> value) {
        this.assignedTo = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setCreatedBy(JAXBElement<User> value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the directedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getDirectedBy() {
        return directedBy;
    }

    /**
     * Sets the value of the directedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setDirectedBy(JAXBElement<User> value) {
        this.directedBy = value;
    }

    /**
     * Gets the value of the guestRelated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGuestRelated() {
        return guestRelated;
    }

    /**
     * Sets the value of the guestRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGuestRelated(JAXBElement<Boolean> value) {
        this.guestRelated = value;
    }

    /**
     * Gets the value of the inspectee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getInspectee() {
        return inspectee;
    }

    /**
     * Sets the value of the inspectee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setInspectee(JAXBElement<User> value) {
        this.inspectee = value;
    }

    /**
     * Gets the value of the inspectionResults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInspection }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInspection> getInspectionResults() {
        return inspectionResults;
    }

    /**
     * Sets the value of the inspectionResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInspection }{@code >}
     *     
     */
    public void setInspectionResults(JAXBElement<ArrayOfInspection> value) {
        this.inspectionResults = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Issue }{@code >}
     *     
     */
    public JAXBElement<Issue> getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Issue }{@code >}
     *     
     */
    public void setIssue(JAXBElement<Issue> value) {
        this.issue = value;
    }

    /**
     * Gets the value of the labor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLaborCost }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLaborCost> getLabor() {
        return labor;
    }

    /**
     * Sets the value of the labor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLaborCost }{@code >}
     *     
     */
    public void setLabor(JAXBElement<ArrayOfLaborCost> value) {
        this.labor = value;
    }

    /**
     * Gets the value of the lastAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastAction() {
        return lastAction;
    }

    /**
     * Sets the value of the lastAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastAction(JAXBElement<String> value) {
        this.lastAction = value;
    }

    /**
     * Gets the value of the lastEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOrderEventEnum }{@code >}
     *     
     */
    public JAXBElement<ServiceOrderEventEnum> getLastEvent() {
        return lastEvent;
    }

    /**
     * Sets the value of the lastEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOrderEventEnum }{@code >}
     *     
     */
    public void setLastEvent(JAXBElement<ServiceOrderEventEnum> value) {
        this.lastEvent = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastModified(JAXBElement<XMLGregorianCalendar> value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Room }{@code >}
     *     
     */
    public JAXBElement<Room> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Room }{@code >}
     *     
     */
    public void setLocation(JAXBElement<Room> value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Room }{@code >}
     *     
     */
    public JAXBElement<Room> getLocationTo() {
        return locationTo;
    }

    /**
     * Sets the value of the locationTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Room }{@code >}
     *     
     */
    public void setLocationTo(JAXBElement<Room> value) {
        this.locationTo = value;
    }

    /**
     * Gets the value of the newRemark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewRemark() {
        return newRemark;
    }

    /**
     * Sets the value of the newRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewRemark(JAXBElement<String> value) {
        this.newRemark = value;
    }

    /**
     * Gets the value of the parts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPartCost }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPartCost> getParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPartCost }{@code >}
     *     
     */
    public void setParts(JAXBElement<ArrayOfPartCost> value) {
        this.parts = value;
    }

    /**
     * Gets the value of the posted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPosted() {
        return posted;
    }

    /**
     * Sets the value of the posted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPosted(JAXBElement<Boolean> value) {
        this.posted = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPriority(JAXBElement<Integer> value) {
        this.priority = value;
    }

    /**
     * Gets the value of the recoveries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRecovery }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRecovery> getRecoveries() {
        return recoveries;
    }

    /**
     * Sets the value of the recoveries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRecovery }{@code >}
     *     
     */
    public void setRecoveries(JAXBElement<ArrayOfRecovery> value) {
        this.recoveries = value;
    }

    /**
     * Gets the value of the requestTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRequestTime() {
        return requestTime;
    }

    /**
     * Sets the value of the requestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRequestTime(JAXBElement<XMLGregorianCalendar> value) {
        this.requestTime = value;
    }

    /**
     * Gets the value of the requestedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getRequestedBy() {
        return requestedBy;
    }

    /**
     * Sets the value of the requestedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setRequestedBy(JAXBElement<User> value) {
        this.requestedBy = value;
    }

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Reservation }{@code >}
     *     
     */
    public JAXBElement<Reservation> getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Reservation }{@code >}
     *     
     */
    public void setReservation(JAXBElement<Reservation> value) {
        this.reservation = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOrderStatusEnum }{@code >}
     *     
     */
    public JAXBElement<ServiceOrderStatusEnum> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOrderStatusEnum }{@code >}
     *     
     */
    public void setStatus(JAXBElement<ServiceOrderStatusEnum> value) {
        this.status = value;
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

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOrderTypeEnum }{@code >}
     *     
     */
    public JAXBElement<ServiceOrderTypeEnum> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOrderTypeEnum }{@code >}
     *     
     */
    public void setType(JAXBElement<ServiceOrderTypeEnum> value) {
        this.type = value;
    }

}
