
package com.tech.m.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.tech.m.api.fault.ApiFault;
import com.tech.m.api.guest.Amenity;
import com.tech.m.api.guest.Consumption;
import com.tech.m.api.guest.GetAmenityUpdatesCollection;
import com.tech.m.api.guest.GetProfileRequest;
import com.tech.m.api.guest.GetReservations;
import com.tech.m.api.guest.Group;
import com.tech.m.api.guest.Preference;
import com.tech.m.api.guest.Profile;
import com.tech.m.api.guest.Reservation;
import com.tech.m.api.inventory.GetPartsCollection;
import com.tech.m.api.inventory.InventorySettings;
import com.tech.m.api.inventory.Part;
import com.tech.m.api.inventory.StockRoom;
import com.tech.m.api.inventory.UsePartRequest;
import com.tech.m.api.issue.GetIssueCollection;
import com.tech.m.api.issue.Issue;
import com.tech.m.api.messaging.GetMessageInboxCollection;
import com.tech.m.api.messaging.GetUndeliveredMessagesCollection;
import com.tech.m.api.messaging.GetUndeliveredNotificationsCollection;
import com.tech.m.api.messaging.Message;
import com.tech.m.api.messaging.Notification;
import com.tech.m.api.room.GetRoomCollection;
import com.tech.m.api.room.GetRoomEqTypeCollection;
import com.tech.m.api.room.GetRoomUpdatesCollection;
import com.tech.m.api.room.Room;
import com.tech.m.api.room.RoomEqType;
import com.tech.m.api.room.RoomRush;
import com.tech.m.api.room.TaskSheet;
import com.tech.m.api.serviceorder.Cost;
import com.tech.m.api.serviceorder.GetServiceOrderUpdatesCollection;
import com.tech.m.api.serviceorder.Inspection;
import com.tech.m.api.serviceorder.ServiceOrder;
import org.datacontract.schemas._2004._07.messaging.Device;


/**
 * <p>Java class for apiObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Error" type="{urn:fault.api.m-tech.com}apiFault" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedAttributes" type="{urn:api.m-tech.com}ArrayOfExtendedAttribute" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Impersonate" type="{urn:api.m-tech.com}User" minOccurs="0"/&gt;
 *         &lt;element name="RecordID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldsToNull" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiObject", propOrder = {
    "error",
    "extendedAttributes",
    "id",
    "impersonate",
    "recordID",
    "unitID",
    "fieldsToNull"
})
@XmlSeeAlso({
    User.class,
    Settings.class,
    Unit.class,
    GetApiObjectCollection.class,
    Token.class,
    UserLocation.class,
    GeoCoordinate.class,
    QueryServiceOrder.class,
    ApiObjectCollection.class,
    RoomRush.class,
    GetRoomCollection.class,
    Room.class,
    GetRoomUpdatesCollection.class,
    RoomEqType.class,
    GetRoomEqTypeCollection.class,
    TaskSheet.class,
    Message.class,
    GetMessageInboxCollection.class,
    GetUndeliveredMessagesCollection.class,
    GetUndeliveredNotificationsCollection.class,
    Notification.class,
    GetIssueCollection.class,
    Issue.class,
    Device.class,
    Preference.class,
    Reservation.class,
    GetReservations.class,
    GetProfileRequest.class,
    Amenity.class,
    Consumption.class,
    Group.class,
    Profile.class,
    GetAmenityUpdatesCollection.class,
    Part.class,
    StockRoom.class,
    UsePartRequest.class,
    GetPartsCollection.class,
    InventorySettings.class,
    ServiceOrder.class,
    GetServiceOrderUpdatesCollection.class,
    Inspection.class,
    Cost.class
})
public class ApiObject {

    @XmlElementRef(name = "Error", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ApiFault> error;
    @XmlElementRef(name = "ExtendedAttributes", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExtendedAttribute> extendedAttributes;
    @XmlElementRef(name = "ID", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "Impersonate", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> impersonate;
    @XmlElementRef(name = "RecordID", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordID;
    @XmlElementRef(name = "UnitID", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitID;
    @XmlElementRef(name = "fieldsToNull", namespace = "urn:api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> fieldsToNull;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApiFault }{@code >}
     *     
     */
    public JAXBElement<ApiFault> getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApiFault }{@code >}
     *     
     */
    public void setError(JAXBElement<ApiFault> value) {
        this.error = value;
    }

    /**
     * Gets the value of the extendedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExtendedAttribute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfExtendedAttribute> getExtendedAttributes() {
        return extendedAttributes;
    }

    /**
     * Sets the value of the extendedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExtendedAttribute }{@code >}
     *     
     */
    public void setExtendedAttributes(JAXBElement<ArrayOfExtendedAttribute> value) {
        this.extendedAttributes = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setID(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the impersonate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getImpersonate() {
        return impersonate;
    }

    /**
     * Sets the value of the impersonate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setImpersonate(JAXBElement<User> value) {
        this.impersonate = value;
    }

    /**
     * Gets the value of the recordID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecordID() {
        return recordID;
    }

    /**
     * Sets the value of the recordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecordID(JAXBElement<String> value) {
        this.recordID = value;
    }

    /**
     * Gets the value of the unitID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitID() {
        return unitID;
    }

    /**
     * Sets the value of the unitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitID(JAXBElement<String> value) {
        this.unitID = value;
    }

    /**
     * Gets the value of the fieldsToNull property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getFieldsToNull() {
        return fieldsToNull;
    }

    /**
     * Sets the value of the fieldsToNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setFieldsToNull(JAXBElement<ArrayOfstring> value) {
        this.fieldsToNull = value;
    }

	@Override
	public String toString() {
		return "ApiObject [error=" + error + ", extendedAttributes=" + extendedAttributes + ", id=" + id
				+ ", impersonate=" + impersonate + ", recordID=" + recordID + ", unitID=" + unitID + ", fieldsToNull="
				+ fieldsToNull + "]";
	}

}
