
package com.tech.m.api.guest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.tech.m.api.room.ArrayOfRoom;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tech.m.api.guest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Preference_QNAME = new QName("urn:guest.api.m-tech.com", "Preference");
    private final static QName _Reservation_QNAME = new QName("urn:guest.api.m-tech.com", "Reservation");
    private final static QName _GetReservations_QNAME = new QName("urn:guest.api.m-tech.com", "GetReservations");
    private final static QName _GetProfileRequest_QNAME = new QName("urn:guest.api.m-tech.com", "GetProfileRequest");
    private final static QName _Amenity_QNAME = new QName("urn:guest.api.m-tech.com", "Amenity");
    private final static QName _Consumption_QNAME = new QName("urn:guest.api.m-tech.com", "Consumption");
    private final static QName _Group_QNAME = new QName("urn:guest.api.m-tech.com", "Group");
    private final static QName _ReservationStatusEnum_QNAME = new QName("urn:guest.api.m-tech.com", "ReservationStatusEnum");
    private final static QName _Profile_QNAME = new QName("urn:guest.api.m-tech.com", "Profile");
    private final static QName _ArrayOfPreference_QNAME = new QName("urn:guest.api.m-tech.com", "ArrayOfPreference");
    private final static QName _ProfileTypeEnum_QNAME = new QName("urn:guest.api.m-tech.com", "ProfileTypeEnum");
    private final static QName _GetAmenityUpdatesCollection_QNAME = new QName("urn:guest.api.m-tech.com", "GetAmenityUpdatesCollection");
    private final static QName _GreenChoiceEnum_QNAME = new QName("urn:guest.api.m-tech.com", "GreenChoiceEnum");
    private final static QName _ProfileBirthday_QNAME = new QName("urn:guest.api.m-tech.com", "Birthday");
    private final static QName _ProfileCity_QNAME = new QName("urn:guest.api.m-tech.com", "City");
    private final static QName _ProfileCountry_QNAME = new QName("urn:guest.api.m-tech.com", "Country");
    private final static QName _ProfileEmail_QNAME = new QName("urn:guest.api.m-tech.com", "Email");
    private final static QName _ProfileFax_QNAME = new QName("urn:guest.api.m-tech.com", "Fax");
    private final static QName _ProfileFirstName_QNAME = new QName("urn:guest.api.m-tech.com", "FirstName");
    private final static QName _ProfileHasServiceOrders_QNAME = new QName("urn:guest.api.m-tech.com", "HasServiceOrders");
    private final static QName _ProfileLastName_QNAME = new QName("urn:guest.api.m-tech.com", "LastName");
    private final static QName _ProfileLoyaltyID_QNAME = new QName("urn:guest.api.m-tech.com", "LoyaltyID");
    private final static QName _ProfileMiddleInitial_QNAME = new QName("urn:guest.api.m-tech.com", "MiddleInitial");
    private final static QName _ProfilePhone_QNAME = new QName("urn:guest.api.m-tech.com", "Phone");
    private final static QName _ProfilePostalCode_QNAME = new QName("urn:guest.api.m-tech.com", "PostalCode");
    private final static QName _ProfilePreferences_QNAME = new QName("urn:guest.api.m-tech.com", "Preferences");
    private final static QName _ProfileSalutation_QNAME = new QName("urn:guest.api.m-tech.com", "Salutation");
    private final static QName _ProfileState_QNAME = new QName("urn:guest.api.m-tech.com", "State");
    private final static QName _ProfileStreet_QNAME = new QName("urn:guest.api.m-tech.com", "Street");
    private final static QName _ProfileURL_QNAME = new QName("urn:guest.api.m-tech.com", "URL");
    private final static QName _ProfileVIP_QNAME = new QName("urn:guest.api.m-tech.com", "VIP");
    private final static QName _GroupArrival_QNAME = new QName("urn:guest.api.m-tech.com", "Arrival");
    private final static QName _GroupDeparture_QNAME = new QName("urn:guest.api.m-tech.com", "Departure");
    private final static QName _GroupName_QNAME = new QName("urn:guest.api.m-tech.com", "Name");
    private final static QName _GroupStatus_QNAME = new QName("urn:guest.api.m-tech.com", "Status");
    private final static QName _AmenityPrice_QNAME = new QName("urn:guest.api.m-tech.com", "Price");
    private final static QName _AmenityResID_QNAME = new QName("urn:guest.api.m-tech.com", "ResID");
    private final static QName _AmenityRoomNumber_QNAME = new QName("urn:guest.api.m-tech.com", "RoomNumber");
    private final static QName _AmenityTimeStamp_QNAME = new QName("urn:guest.api.m-tech.com", "TimeStamp");
    private final static QName _AmenityTransactionCode_QNAME = new QName("urn:guest.api.m-tech.com", "TransactionCode");
    private final static QName _GetProfileRequestProfileID_QNAME = new QName("urn:guest.api.m-tech.com", "ProfileID");
    private final static QName _GetProfileRequestReservationID_QNAME = new QName("urn:guest.api.m-tech.com", "ReservationID");
    private final static QName _ReservationAdults_QNAME = new QName("urn:guest.api.m-tech.com", "Adults");
    private final static QName _ReservationBanquetRevenue_QNAME = new QName("urn:guest.api.m-tech.com", "BanquetRevenue");
    private final static QName _ReservationChildRooms_QNAME = new QName("urn:guest.api.m-tech.com", "ChildRooms");
    private final static QName _ReservationChildren_QNAME = new QName("urn:guest.api.m-tech.com", "Children");
    private final static QName _ReservationCompany_QNAME = new QName("urn:guest.api.m-tech.com", "Company");
    private final static QName _ReservationCurrencyCode_QNAME = new QName("urn:guest.api.m-tech.com", "CurrencyCode");
    private final static QName _ReservationFoodRevenue_QNAME = new QName("urn:guest.api.m-tech.com", "FoodRevenue");
    private final static QName _ReservationGreenChoice_QNAME = new QName("urn:guest.api.m-tech.com", "GreenChoice");
    private final static QName _ReservationIsCityGuest_QNAME = new QName("urn:guest.api.m-tech.com", "IsCityGuest");
    private final static QName _ReservationLanguage_QNAME = new QName("urn:guest.api.m-tech.com", "Language");
    private final static QName _ReservationMarket_QNAME = new QName("urn:guest.api.m-tech.com", "Market");
    private final static QName _ReservationNights_QNAME = new QName("urn:guest.api.m-tech.com", "Nights");
    private final static QName _ReservationOtherRevenue_QNAME = new QName("urn:guest.api.m-tech.com", "OtherRevenue");
    private final static QName _ReservationRate_QNAME = new QName("urn:guest.api.m-tech.com", "Rate");
    private final static QName _ReservationRateCode_QNAME = new QName("urn:guest.api.m-tech.com", "RateCode");
    private final static QName _ReservationRoomRevenue_QNAME = new QName("urn:guest.api.m-tech.com", "RoomRevenue");
    private final static QName _ReservationRoomType_QNAME = new QName("urn:guest.api.m-tech.com", "RoomType");
    private final static QName _ReservationSource_QNAME = new QName("urn:guest.api.m-tech.com", "Source");
    private final static QName _ReservationSpecialInstructions_QNAME = new QName("urn:guest.api.m-tech.com", "SpecialInstructions");
    private final static QName _ReservationSpecialRequests_QNAME = new QName("urn:guest.api.m-tech.com", "SpecialRequests");
    private final static QName _ReservationTravelAgent_QNAME = new QName("urn:guest.api.m-tech.com", "TravelAgent");
    private final static QName _PreferenceValue_QNAME = new QName("urn:guest.api.m-tech.com", "Value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tech.m.api.guest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Preference }
     * 
     */
    public Preference createPreference() {
        return new Preference();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link GetReservations }
     * 
     */
    public GetReservations createGetReservations() {
        return new GetReservations();
    }

    /**
     * Create an instance of {@link GetProfileRequest }
     * 
     */
    public GetProfileRequest createGetProfileRequest() {
        return new GetProfileRequest();
    }

    /**
     * Create an instance of {@link Amenity }
     * 
     */
    public Amenity createAmenity() {
        return new Amenity();
    }

    /**
     * Create an instance of {@link Consumption }
     * 
     */
    public Consumption createConsumption() {
        return new Consumption();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link Profile }
     * 
     */
    public Profile createProfile() {
        return new Profile();
    }

    /**
     * Create an instance of {@link ArrayOfPreference }
     * 
     */
    public ArrayOfPreference createArrayOfPreference() {
        return new ArrayOfPreference();
    }

    /**
     * Create an instance of {@link GetAmenityUpdatesCollection }
     * 
     */
    public GetAmenityUpdatesCollection createGetAmenityUpdatesCollection() {
        return new GetAmenityUpdatesCollection();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Preference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Preference")
    public JAXBElement<Preference> createPreference(Preference value) {
        return new JAXBElement<Preference>(_Preference_QNAME, Preference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Reservation")
    public JAXBElement<Reservation> createReservation(Reservation value) {
        return new JAXBElement<Reservation>(_Reservation_QNAME, Reservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "GetReservations")
    public JAXBElement<GetReservations> createGetReservations(GetReservations value) {
        return new JAXBElement<GetReservations>(_GetReservations_QNAME, GetReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "GetProfileRequest")
    public JAXBElement<GetProfileRequest> createGetProfileRequest(GetProfileRequest value) {
        return new JAXBElement<GetProfileRequest>(_GetProfileRequest_QNAME, GetProfileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Amenity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Amenity")
    public JAXBElement<Amenity> createAmenity(Amenity value) {
        return new JAXBElement<Amenity>(_Amenity_QNAME, Amenity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consumption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Consumption")
    public JAXBElement<Consumption> createConsumption(Consumption value) {
        return new JAXBElement<Consumption>(_Consumption_QNAME, Consumption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Group")
    public JAXBElement<Group> createGroup(Group value) {
        return new JAXBElement<Group>(_Group_QNAME, Group.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "ReservationStatusEnum")
    public JAXBElement<ReservationStatusEnum> createReservationStatusEnum(ReservationStatusEnum value) {
        return new JAXBElement<ReservationStatusEnum>(_ReservationStatusEnum_QNAME, ReservationStatusEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Profile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Profile")
    public JAXBElement<Profile> createProfile(Profile value) {
        return new JAXBElement<Profile>(_Profile_QNAME, Profile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "ArrayOfPreference")
    public JAXBElement<ArrayOfPreference> createArrayOfPreference(ArrayOfPreference value) {
        return new JAXBElement<ArrayOfPreference>(_ArrayOfPreference_QNAME, ArrayOfPreference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "ProfileTypeEnum")
    public JAXBElement<ProfileTypeEnum> createProfileTypeEnum(ProfileTypeEnum value) {
        return new JAXBElement<ProfileTypeEnum>(_ProfileTypeEnum_QNAME, ProfileTypeEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAmenityUpdatesCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "GetAmenityUpdatesCollection")
    public JAXBElement<GetAmenityUpdatesCollection> createGetAmenityUpdatesCollection(GetAmenityUpdatesCollection value) {
        return new JAXBElement<GetAmenityUpdatesCollection>(_GetAmenityUpdatesCollection_QNAME, GetAmenityUpdatesCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreenChoiceEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "GreenChoiceEnum")
    public JAXBElement<GreenChoiceEnum> createGreenChoiceEnum(GreenChoiceEnum value) {
        return new JAXBElement<GreenChoiceEnum>(_GreenChoiceEnum_QNAME, GreenChoiceEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Birthday", scope = Profile.class)
    public JAXBElement<XMLGregorianCalendar> createProfileBirthday(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProfileBirthday_QNAME, XMLGregorianCalendar.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "City", scope = Profile.class)
    public JAXBElement<String> createProfileCity(String value) {
        return new JAXBElement<String>(_ProfileCity_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Country", scope = Profile.class)
    public JAXBElement<String> createProfileCountry(String value) {
        return new JAXBElement<String>(_ProfileCountry_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Email", scope = Profile.class)
    public JAXBElement<String> createProfileEmail(String value) {
        return new JAXBElement<String>(_ProfileEmail_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Fax", scope = Profile.class)
    public JAXBElement<String> createProfileFax(String value) {
        return new JAXBElement<String>(_ProfileFax_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "FirstName", scope = Profile.class)
    public JAXBElement<String> createProfileFirstName(String value) {
        return new JAXBElement<String>(_ProfileFirstName_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "HasServiceOrders", scope = Profile.class)
    public JAXBElement<Boolean> createProfileHasServiceOrders(Boolean value) {
        return new JAXBElement<Boolean>(_ProfileHasServiceOrders_QNAME, Boolean.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "LastName", scope = Profile.class)
    public JAXBElement<String> createProfileLastName(String value) {
        return new JAXBElement<String>(_ProfileLastName_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "LoyaltyID", scope = Profile.class)
    public JAXBElement<String> createProfileLoyaltyID(String value) {
        return new JAXBElement<String>(_ProfileLoyaltyID_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "MiddleInitial", scope = Profile.class)
    public JAXBElement<String> createProfileMiddleInitial(String value) {
        return new JAXBElement<String>(_ProfileMiddleInitial_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Phone", scope = Profile.class)
    public JAXBElement<String> createProfilePhone(String value) {
        return new JAXBElement<String>(_ProfilePhone_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "PostalCode", scope = Profile.class)
    public JAXBElement<String> createProfilePostalCode(String value) {
        return new JAXBElement<String>(_ProfilePostalCode_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Preferences", scope = Profile.class)
    public JAXBElement<ArrayOfPreference> createProfilePreferences(ArrayOfPreference value) {
        return new JAXBElement<ArrayOfPreference>(_ProfilePreferences_QNAME, ArrayOfPreference.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Salutation", scope = Profile.class)
    public JAXBElement<String> createProfileSalutation(String value) {
        return new JAXBElement<String>(_ProfileSalutation_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "State", scope = Profile.class)
    public JAXBElement<String> createProfileState(String value) {
        return new JAXBElement<String>(_ProfileState_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Street", scope = Profile.class)
    public JAXBElement<String> createProfileStreet(String value) {
        return new JAXBElement<String>(_ProfileStreet_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "URL", scope = Profile.class)
    public JAXBElement<String> createProfileURL(String value) {
        return new JAXBElement<String>(_ProfileURL_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "VIP", scope = Profile.class)
    public JAXBElement<String> createProfileVIP(String value) {
        return new JAXBElement<String>(_ProfileVIP_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Arrival", scope = Group.class)
    public JAXBElement<XMLGregorianCalendar> createGroupArrival(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GroupArrival_QNAME, XMLGregorianCalendar.class, Group.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Departure", scope = Group.class)
    public JAXBElement<XMLGregorianCalendar> createGroupDeparture(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GroupDeparture_QNAME, XMLGregorianCalendar.class, Group.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Name", scope = Group.class)
    public JAXBElement<String> createGroupName(String value) {
        return new JAXBElement<String>(_GroupName_QNAME, String.class, Group.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Status", scope = Group.class)
    public JAXBElement<ReservationStatusEnum> createGroupStatus(ReservationStatusEnum value) {
        return new JAXBElement<ReservationStatusEnum>(_GroupStatus_QNAME, ReservationStatusEnum.class, Group.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Amenity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Amenity", scope = Consumption.class)
    public JAXBElement<Amenity> createConsumptionAmenity(Amenity value) {
        return new JAXBElement<Amenity>(_Amenity_QNAME, Amenity.class, Consumption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Name", scope = Amenity.class)
    public JAXBElement<String> createAmenityName(String value) {
        return new JAXBElement<String>(_GroupName_QNAME, String.class, Amenity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Price", scope = Amenity.class)
    public JAXBElement<Double> createAmenityPrice(Double value) {
        return new JAXBElement<Double>(_AmenityPrice_QNAME, Double.class, Amenity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "ResID", scope = Amenity.class)
    public JAXBElement<String> createAmenityResID(String value) {
        return new JAXBElement<String>(_AmenityResID_QNAME, String.class, Amenity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "RoomNumber", scope = Amenity.class)
    public JAXBElement<String> createAmenityRoomNumber(String value) {
        return new JAXBElement<String>(_AmenityRoomNumber_QNAME, String.class, Amenity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "TimeStamp", scope = Amenity.class)
    public JAXBElement<XMLGregorianCalendar> createAmenityTimeStamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AmenityTimeStamp_QNAME, XMLGregorianCalendar.class, Amenity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "TransactionCode", scope = Amenity.class)
    public JAXBElement<String> createAmenityTransactionCode(String value) {
        return new JAXBElement<String>(_AmenityTransactionCode_QNAME, String.class, Amenity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "ProfileID", scope = GetProfileRequest.class)
    public JAXBElement<String> createGetProfileRequestProfileID(String value) {
        return new JAXBElement<String>(_GetProfileRequestProfileID_QNAME, String.class, GetProfileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "ReservationID", scope = GetProfileRequest.class)
    public JAXBElement<String> createGetProfileRequestReservationID(String value) {
        return new JAXBElement<String>(_GetProfileRequestReservationID_QNAME, String.class, GetProfileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "RoomNumber", scope = GetReservations.class)
    public JAXBElement<String> createGetReservationsRoomNumber(String value) {
        return new JAXBElement<String>(_AmenityRoomNumber_QNAME, String.class, GetReservations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Adults", scope = Reservation.class)
    public JAXBElement<Integer> createReservationAdults(Integer value) {
        return new JAXBElement<Integer>(_ReservationAdults_QNAME, Integer.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Arrival", scope = Reservation.class)
    public JAXBElement<XMLGregorianCalendar> createReservationArrival(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GroupArrival_QNAME, XMLGregorianCalendar.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "BanquetRevenue", scope = Reservation.class)
    public JAXBElement<Double> createReservationBanquetRevenue(Double value) {
        return new JAXBElement<Double>(_ReservationBanquetRevenue_QNAME, Double.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Birthday", scope = Reservation.class)
    public JAXBElement<XMLGregorianCalendar> createReservationBirthday(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProfileBirthday_QNAME, XMLGregorianCalendar.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "ChildRooms", scope = Reservation.class)
    public JAXBElement<ArrayOfRoom> createReservationChildRooms(ArrayOfRoom value) {
        return new JAXBElement<ArrayOfRoom>(_ReservationChildRooms_QNAME, ArrayOfRoom.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Children", scope = Reservation.class)
    public JAXBElement<Integer> createReservationChildren(Integer value) {
        return new JAXBElement<Integer>(_ReservationChildren_QNAME, Integer.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "City", scope = Reservation.class)
    public JAXBElement<String> createReservationCity(String value) {
        return new JAXBElement<String>(_ProfileCity_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Profile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Company", scope = Reservation.class)
    public JAXBElement<Profile> createReservationCompany(Profile value) {
        return new JAXBElement<Profile>(_ReservationCompany_QNAME, Profile.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Country", scope = Reservation.class)
    public JAXBElement<String> createReservationCountry(String value) {
        return new JAXBElement<String>(_ProfileCountry_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "CurrencyCode", scope = Reservation.class)
    public JAXBElement<String> createReservationCurrencyCode(String value) {
        return new JAXBElement<String>(_ReservationCurrencyCode_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Departure", scope = Reservation.class)
    public JAXBElement<XMLGregorianCalendar> createReservationDeparture(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GroupDeparture_QNAME, XMLGregorianCalendar.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Email", scope = Reservation.class)
    public JAXBElement<String> createReservationEmail(String value) {
        return new JAXBElement<String>(_ProfileEmail_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Fax", scope = Reservation.class)
    public JAXBElement<String> createReservationFax(String value) {
        return new JAXBElement<String>(_ProfileFax_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "FirstName", scope = Reservation.class)
    public JAXBElement<String> createReservationFirstName(String value) {
        return new JAXBElement<String>(_ProfileFirstName_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "FoodRevenue", scope = Reservation.class)
    public JAXBElement<Double> createReservationFoodRevenue(Double value) {
        return new JAXBElement<Double>(_ReservationFoodRevenue_QNAME, Double.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreenChoiceEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "GreenChoice", scope = Reservation.class)
    public JAXBElement<GreenChoiceEnum> createReservationGreenChoice(GreenChoiceEnum value) {
        return new JAXBElement<GreenChoiceEnum>(_ReservationGreenChoice_QNAME, GreenChoiceEnum.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Group", scope = Reservation.class)
    public JAXBElement<Group> createReservationGroup(Group value) {
        return new JAXBElement<Group>(_Group_QNAME, Group.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "IsCityGuest", scope = Reservation.class)
    public JAXBElement<Boolean> createReservationIsCityGuest(Boolean value) {
        return new JAXBElement<Boolean>(_ReservationIsCityGuest_QNAME, Boolean.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Language", scope = Reservation.class)
    public JAXBElement<String> createReservationLanguage(String value) {
        return new JAXBElement<String>(_ReservationLanguage_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "LastName", scope = Reservation.class)
    public JAXBElement<String> createReservationLastName(String value) {
        return new JAXBElement<String>(_ProfileLastName_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "LoyaltyID", scope = Reservation.class)
    public JAXBElement<String> createReservationLoyaltyID(String value) {
        return new JAXBElement<String>(_ProfileLoyaltyID_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Market", scope = Reservation.class)
    public JAXBElement<String> createReservationMarket(String value) {
        return new JAXBElement<String>(_ReservationMarket_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "MiddleInitial", scope = Reservation.class)
    public JAXBElement<String> createReservationMiddleInitial(String value) {
        return new JAXBElement<String>(_ProfileMiddleInitial_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Nights", scope = Reservation.class)
    public JAXBElement<Integer> createReservationNights(Integer value) {
        return new JAXBElement<Integer>(_ReservationNights_QNAME, Integer.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "OtherRevenue", scope = Reservation.class)
    public JAXBElement<Double> createReservationOtherRevenue(Double value) {
        return new JAXBElement<Double>(_ReservationOtherRevenue_QNAME, Double.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Phone", scope = Reservation.class)
    public JAXBElement<String> createReservationPhone(String value) {
        return new JAXBElement<String>(_ProfilePhone_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "PostalCode", scope = Reservation.class)
    public JAXBElement<String> createReservationPostalCode(String value) {
        return new JAXBElement<String>(_ProfilePostalCode_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Preferences", scope = Reservation.class)
    public JAXBElement<ArrayOfPreference> createReservationPreferences(ArrayOfPreference value) {
        return new JAXBElement<ArrayOfPreference>(_ProfilePreferences_QNAME, ArrayOfPreference.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "ProfileID", scope = Reservation.class)
    public JAXBElement<String> createReservationProfileID(String value) {
        return new JAXBElement<String>(_GetProfileRequestProfileID_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Rate", scope = Reservation.class)
    public JAXBElement<Double> createReservationRate(Double value) {
        return new JAXBElement<Double>(_ReservationRate_QNAME, Double.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "RateCode", scope = Reservation.class)
    public JAXBElement<String> createReservationRateCode(String value) {
        return new JAXBElement<String>(_ReservationRateCode_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "RoomNumber", scope = Reservation.class)
    public JAXBElement<String> createReservationRoomNumber(String value) {
        return new JAXBElement<String>(_AmenityRoomNumber_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "RoomRevenue", scope = Reservation.class)
    public JAXBElement<Double> createReservationRoomRevenue(Double value) {
        return new JAXBElement<Double>(_ReservationRoomRevenue_QNAME, Double.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "RoomType", scope = Reservation.class)
    public JAXBElement<String> createReservationRoomType(String value) {
        return new JAXBElement<String>(_ReservationRoomType_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Salutation", scope = Reservation.class)
    public JAXBElement<String> createReservationSalutation(String value) {
        return new JAXBElement<String>(_ProfileSalutation_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Source", scope = Reservation.class)
    public JAXBElement<String> createReservationSource(String value) {
        return new JAXBElement<String>(_ReservationSource_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "SpecialInstructions", scope = Reservation.class)
    public JAXBElement<String> createReservationSpecialInstructions(String value) {
        return new JAXBElement<String>(_ReservationSpecialInstructions_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "SpecialRequests", scope = Reservation.class)
    public JAXBElement<String> createReservationSpecialRequests(String value) {
        return new JAXBElement<String>(_ReservationSpecialRequests_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "State", scope = Reservation.class)
    public JAXBElement<String> createReservationState(String value) {
        return new JAXBElement<String>(_ProfileState_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Status", scope = Reservation.class)
    public JAXBElement<ReservationStatusEnum> createReservationStatus(ReservationStatusEnum value) {
        return new JAXBElement<ReservationStatusEnum>(_GroupStatus_QNAME, ReservationStatusEnum.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Street", scope = Reservation.class)
    public JAXBElement<String> createReservationStreet(String value) {
        return new JAXBElement<String>(_ProfileStreet_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Profile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "TravelAgent", scope = Reservation.class)
    public JAXBElement<Profile> createReservationTravelAgent(Profile value) {
        return new JAXBElement<Profile>(_ReservationTravelAgent_QNAME, Profile.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "VIP", scope = Reservation.class)
    public JAXBElement<String> createReservationVIP(String value) {
        return new JAXBElement<String>(_ProfileVIP_QNAME, String.class, Reservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Name", scope = Preference.class)
    public JAXBElement<String> createPreferenceName(String value) {
        return new JAXBElement<String>(_GroupName_QNAME, String.class, Preference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:guest.api.m-tech.com", name = "Value", scope = Preference.class)
    public JAXBElement<String> createPreferenceValue(String value) {
        return new JAXBElement<String>(_PreferenceValue_QNAME, String.class, Preference.class, value);
    }

}
