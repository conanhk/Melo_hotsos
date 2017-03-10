
package com.tech.m.api.guest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tech.m.api.ApiObject;
import com.tech.m.api.room.ArrayOfRoom;


/**
 * <p>Java class for Reservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:api.m-tech.com}apiObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Arrival" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BanquetRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ChildRooms" type="{urn:room.api.m-tech.com}ArrayOfRoom" minOccurs="0"/&gt;
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Company" type="{urn:guest.api.m-tech.com}Profile" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Departure" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FoodRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="GreenChoice" type="{urn:guest.api.m-tech.com}GreenChoiceEnum" minOccurs="0"/&gt;
 *         &lt;element name="Group" type="{urn:guest.api.m-tech.com}Group" minOccurs="0"/&gt;
 *         &lt;element name="IsCityGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Market" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleInitial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nights" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OtherRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Preferences" type="{urn:guest.api.m-tech.com}ArrayOfPreference" minOccurs="0"/&gt;
 *         &lt;element name="ProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialRequests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{urn:guest.api.m-tech.com}ReservationStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TravelAgent" type="{urn:guest.api.m-tech.com}Profile" minOccurs="0"/&gt;
 *         &lt;element name="VIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reservation", propOrder = {
    "adults",
    "arrival",
    "banquetRevenue",
    "birthday",
    "childRooms",
    "children",
    "city",
    "company",
    "country",
    "currencyCode",
    "departure",
    "email",
    "fax",
    "firstName",
    "foodRevenue",
    "greenChoice",
    "group",
    "isCityGuest",
    "language",
    "lastName",
    "loyaltyID",
    "market",
    "middleInitial",
    "nights",
    "otherRevenue",
    "phone",
    "postalCode",
    "preferences",
    "profileID",
    "rate",
    "rateCode",
    "roomNumber",
    "roomRevenue",
    "roomType",
    "salutation",
    "source",
    "specialInstructions",
    "specialRequests",
    "state",
    "status",
    "street",
    "travelAgent",
    "vip"
})
public class Reservation
    extends ApiObject
{

    @XmlElementRef(name = "Adults", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> adults;
    @XmlElementRef(name = "Arrival", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> arrival;
    @XmlElementRef(name = "BanquetRevenue", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> banquetRevenue;
    @XmlElementRef(name = "Birthday", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> birthday;
    @XmlElementRef(name = "ChildRooms", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoom> childRooms;
    @XmlElementRef(name = "Children", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> children;
    @XmlElementRef(name = "City", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "Company", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Profile> company;
    @XmlElementRef(name = "Country", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "CurrencyCode", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "Departure", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> departure;
    @XmlElementRef(name = "Email", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "Fax", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fax;
    @XmlElementRef(name = "FirstName", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "FoodRevenue", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> foodRevenue;
    @XmlElementRef(name = "GreenChoice", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<GreenChoiceEnum> greenChoice;
    @XmlElementRef(name = "Group", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Group> group;
    @XmlElementRef(name = "IsCityGuest", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCityGuest;
    @XmlElementRef(name = "Language", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> language;
    @XmlElementRef(name = "LastName", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "LoyaltyID", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loyaltyID;
    @XmlElementRef(name = "Market", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> market;
    @XmlElementRef(name = "MiddleInitial", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middleInitial;
    @XmlElementRef(name = "Nights", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nights;
    @XmlElementRef(name = "OtherRevenue", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> otherRevenue;
    @XmlElementRef(name = "Phone", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "PostalCode", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "Preferences", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPreference> preferences;
    @XmlElementRef(name = "ProfileID", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileID;
    @XmlElementRef(name = "Rate", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rate;
    @XmlElementRef(name = "RateCode", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rateCode;
    @XmlElementRef(name = "RoomNumber", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomNumber;
    @XmlElementRef(name = "RoomRevenue", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> roomRevenue;
    @XmlElementRef(name = "RoomType", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomType;
    @XmlElementRef(name = "Salutation", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salutation;
    @XmlElementRef(name = "Source", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> source;
    @XmlElementRef(name = "SpecialInstructions", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialInstructions;
    @XmlElementRef(name = "SpecialRequests", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialRequests;
    @XmlElementRef(name = "State", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "Status", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ReservationStatusEnum> status;
    @XmlElementRef(name = "Street", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> street;
    @XmlElementRef(name = "TravelAgent", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Profile> travelAgent;
    @XmlElementRef(name = "VIP", namespace = "urn:guest.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vip;

    /**
     * Gets the value of the adults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdults() {
        return adults;
    }

    /**
     * Sets the value of the adults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdults(JAXBElement<Integer> value) {
        this.adults = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setArrival(JAXBElement<XMLGregorianCalendar> value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the banquetRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBanquetRevenue() {
        return banquetRevenue;
    }

    /**
     * Sets the value of the banquetRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBanquetRevenue(JAXBElement<Double> value) {
        this.banquetRevenue = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBirthday(JAXBElement<XMLGregorianCalendar> value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the childRooms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoom }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoom> getChildRooms() {
        return childRooms;
    }

    /**
     * Sets the value of the childRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoom }{@code >}
     *     
     */
    public void setChildRooms(JAXBElement<ArrayOfRoom> value) {
        this.childRooms = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setChildren(JAXBElement<Integer> value) {
        this.children = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Profile }{@code >}
     *     
     */
    public JAXBElement<Profile> getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Profile }{@code >}
     *     
     */
    public void setCompany(JAXBElement<Profile> value) {
        this.company = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDeparture(JAXBElement<XMLGregorianCalendar> value) {
        this.departure = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFax(JAXBElement<String> value) {
        this.fax = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the foodRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getFoodRevenue() {
        return foodRevenue;
    }

    /**
     * Sets the value of the foodRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setFoodRevenue(JAXBElement<Double> value) {
        this.foodRevenue = value;
    }

    /**
     * Gets the value of the greenChoice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GreenChoiceEnum }{@code >}
     *     
     */
    public JAXBElement<GreenChoiceEnum> getGreenChoice() {
        return greenChoice;
    }

    /**
     * Sets the value of the greenChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GreenChoiceEnum }{@code >}
     *     
     */
    public void setGreenChoice(JAXBElement<GreenChoiceEnum> value) {
        this.greenChoice = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Group }{@code >}
     *     
     */
    public JAXBElement<Group> getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Group }{@code >}
     *     
     */
    public void setGroup(JAXBElement<Group> value) {
        this.group = value;
    }

    /**
     * Gets the value of the isCityGuest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCityGuest() {
        return isCityGuest;
    }

    /**
     * Sets the value of the isCityGuest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCityGuest(JAXBElement<Boolean> value) {
        this.isCityGuest = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<String> value) {
        this.language = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the loyaltyID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoyaltyID() {
        return loyaltyID;
    }

    /**
     * Sets the value of the loyaltyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoyaltyID(JAXBElement<String> value) {
        this.loyaltyID = value;
    }

    /**
     * Gets the value of the market property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarket(JAXBElement<String> value) {
        this.market = value;
    }

    /**
     * Gets the value of the middleInitial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleInitial() {
        return middleInitial;
    }

    /**
     * Sets the value of the middleInitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleInitial(JAXBElement<String> value) {
        this.middleInitial = value;
    }

    /**
     * Gets the value of the nights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNights() {
        return nights;
    }

    /**
     * Sets the value of the nights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNights(JAXBElement<Integer> value) {
        this.nights = value;
    }

    /**
     * Gets the value of the otherRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOtherRevenue() {
        return otherRevenue;
    }

    /**
     * Sets the value of the otherRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOtherRevenue(JAXBElement<Double> value) {
        this.otherRevenue = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPreference }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPreference> getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPreference }{@code >}
     *     
     */
    public void setPreferences(JAXBElement<ArrayOfPreference> value) {
        this.preferences = value;
    }

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileID(JAXBElement<String> value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRate(JAXBElement<Double> value) {
        this.rate = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRateCode(JAXBElement<String> value) {
        this.rateCode = value;
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
     * Gets the value of the roomRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRoomRevenue() {
        return roomRevenue;
    }

    /**
     * Sets the value of the roomRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRoomRevenue(JAXBElement<Double> value) {
        this.roomRevenue = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomType(JAXBElement<String> value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalutation(JAXBElement<String> value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSource(JAXBElement<String> value) {
        this.source = value;
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
     * Gets the value of the specialRequests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialRequests() {
        return specialRequests;
    }

    /**
     * Sets the value of the specialRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialRequests(JAXBElement<String> value) {
        this.specialRequests = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReservationStatusEnum }{@code >}
     *     
     */
    public JAXBElement<ReservationStatusEnum> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReservationStatusEnum }{@code >}
     *     
     */
    public void setStatus(JAXBElement<ReservationStatusEnum> value) {
        this.status = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStreet(JAXBElement<String> value) {
        this.street = value;
    }

    /**
     * Gets the value of the travelAgent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Profile }{@code >}
     *     
     */
    public JAXBElement<Profile> getTravelAgent() {
        return travelAgent;
    }

    /**
     * Sets the value of the travelAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Profile }{@code >}
     *     
     */
    public void setTravelAgent(JAXBElement<Profile> value) {
        this.travelAgent = value;
    }

    /**
     * Gets the value of the vip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVIP() {
        return vip;
    }

    /**
     * Sets the value of the vip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVIP(JAXBElement<String> value) {
        this.vip = value;
    }

}
