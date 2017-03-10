
package com.tech.m.api.room;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.tech.m.api.User;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tech.m.api.room package. 
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

    private final static QName _RoomRush_QNAME = new QName("urn:room.api.m-tech.com", "RoomRush");
    private final static QName _RoomRushStatusEnum_QNAME = new QName("urn:room.api.m-tech.com", "RoomRushStatusEnum");
    private final static QName _GetRoomCollection_QNAME = new QName("urn:room.api.m-tech.com", "GetRoomCollection");
    private final static QName _ArrayOfRoom_QNAME = new QName("urn:room.api.m-tech.com", "ArrayOfRoom");
    private final static QName _Room_QNAME = new QName("urn:room.api.m-tech.com", "Room");
    private final static QName _RoomEventEnum_QNAME = new QName("urn:room.api.m-tech.com", "RoomEventEnum");
    private final static QName _ServiceStatusEnum_QNAME = new QName("urn:room.api.m-tech.com", "ServiceStatusEnum");
    private final static QName _HousekeepingShiftEnum_QNAME = new QName("urn:room.api.m-tech.com", "HousekeepingShiftEnum");
    private final static QName _RoomStatusEnum_QNAME = new QName("urn:room.api.m-tech.com", "RoomStatusEnum");
    private final static QName _GetRoomUpdatesCollection_QNAME = new QName("urn:room.api.m-tech.com", "GetRoomUpdatesCollection");
    private final static QName _RoomEqType_QNAME = new QName("urn:room.api.m-tech.com", "RoomEqType");
    private final static QName _GetRoomEqTypeCollection_QNAME = new QName("urn:room.api.m-tech.com", "GetRoomEqTypeCollection");
    private final static QName _TaskSheet_QNAME = new QName("urn:room.api.m-tech.com", "TaskSheet");
    private final static QName _TaskSheetAttendantFirstName_QNAME = new QName("urn:room.api.m-tech.com", "AttendantFirstName");
    private final static QName _TaskSheetAttendantID_QNAME = new QName("urn:room.api.m-tech.com", "AttendantID");
    private final static QName _TaskSheetAttendantLastName_QNAME = new QName("urn:room.api.m-tech.com", "AttendantLastName");
    private final static QName _TaskSheetRoomNumber_QNAME = new QName("urn:room.api.m-tech.com", "RoomNumber");
    private final static QName _TaskSheetTaskCode_QNAME = new QName("urn:room.api.m-tech.com", "TaskCode");
    private final static QName _TaskSheetTaskInstruction_QNAME = new QName("urn:room.api.m-tech.com", "TaskInstruction");
    private final static QName _GetRoomEqTypeCollectionNameLike_QNAME = new QName("urn:room.api.m-tech.com", "nameLike");
    private final static QName _RoomEqTypeName_QNAME = new QName("urn:room.api.m-tech.com", "Name");
    private final static QName _RoomAttendant_QNAME = new QName("urn:room.api.m-tech.com", "Attendant");
    private final static QName _RoomCleanTime_QNAME = new QName("urn:room.api.m-tech.com", "CleanTime");
    private final static QName _RoomDND_QNAME = new QName("urn:room.api.m-tech.com", "DND");
    private final static QName _RoomEventTime_QNAME = new QName("urn:room.api.m-tech.com", "EventTime");
    private final static QName _RoomEventType_QNAME = new QName("urn:room.api.m-tech.com", "EventType");
    private final static QName _RoomExtension_QNAME = new QName("urn:room.api.m-tech.com", "Extension");
    private final static QName _RoomGuestInRoom_QNAME = new QName("urn:room.api.m-tech.com", "GuestInRoom");
    private final static QName _RoomMakeUp_QNAME = new QName("urn:room.api.m-tech.com", "MakeUp");
    private final static QName _RoomOccupied_QNAME = new QName("urn:room.api.m-tech.com", "Occupied");
    private final static QName _RoomSection_QNAME = new QName("urn:room.api.m-tech.com", "Section");
    private final static QName _RoomServiceStatus_QNAME = new QName("urn:room.api.m-tech.com", "ServiceStatus");
    private final static QName _RoomShift_QNAME = new QName("urn:room.api.m-tech.com", "Shift");
    private final static QName _RoomSpecialInstructions_QNAME = new QName("urn:room.api.m-tech.com", "SpecialInstructions");
    private final static QName _RoomStatus_QNAME = new QName("urn:room.api.m-tech.com", "Status");
    private final static QName _RoomURL_QNAME = new QName("urn:room.api.m-tech.com", "URL");
    private final static QName _RoomRushReservationID_QNAME = new QName("urn:room.api.m-tech.com", "ReservationID");
    private final static QName _RoomRushRoomType_QNAME = new QName("urn:room.api.m-tech.com", "RoomType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tech.m.api.room
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RoomRush }
     * 
     */
    public RoomRush createRoomRush() {
        return new RoomRush();
    }

    /**
     * Create an instance of {@link GetRoomCollection }
     * 
     */
    public GetRoomCollection createGetRoomCollection() {
        return new GetRoomCollection();
    }

    /**
     * Create an instance of {@link ArrayOfRoom }
     * 
     */
    public ArrayOfRoom createArrayOfRoom() {
        return new ArrayOfRoom();
    }

    /**
     * Create an instance of {@link Room }
     * 
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link GetRoomUpdatesCollection }
     * 
     */
    public GetRoomUpdatesCollection createGetRoomUpdatesCollection() {
        return new GetRoomUpdatesCollection();
    }

    /**
     * Create an instance of {@link RoomEqType }
     * 
     */
    public RoomEqType createRoomEqType() {
        return new RoomEqType();
    }

    /**
     * Create an instance of {@link GetRoomEqTypeCollection }
     * 
     */
    public GetRoomEqTypeCollection createGetRoomEqTypeCollection() {
        return new GetRoomEqTypeCollection();
    }

    /**
     * Create an instance of {@link TaskSheet }
     * 
     */
    public TaskSheet createTaskSheet() {
        return new TaskSheet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomRush }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "RoomRush")
    public JAXBElement<RoomRush> createRoomRush(RoomRush value) {
        return new JAXBElement<RoomRush>(_RoomRush_QNAME, RoomRush.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomRushStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "RoomRushStatusEnum")
    public JAXBElement<RoomRushStatusEnum> createRoomRushStatusEnum(RoomRushStatusEnum value) {
        return new JAXBElement<RoomRushStatusEnum>(_RoomRushStatusEnum_QNAME, RoomRushStatusEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "GetRoomCollection")
    public JAXBElement<GetRoomCollection> createGetRoomCollection(GetRoomCollection value) {
        return new JAXBElement<GetRoomCollection>(_GetRoomCollection_QNAME, GetRoomCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "ArrayOfRoom")
    public JAXBElement<ArrayOfRoom> createArrayOfRoom(ArrayOfRoom value) {
        return new JAXBElement<ArrayOfRoom>(_ArrayOfRoom_QNAME, ArrayOfRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Room }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "Room")
    public JAXBElement<Room> createRoom(Room value) {
        return new JAXBElement<Room>(_Room_QNAME, Room.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomEventEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "RoomEventEnum")
    public JAXBElement<RoomEventEnum> createRoomEventEnum(RoomEventEnum value) {
        return new JAXBElement<RoomEventEnum>(_RoomEventEnum_QNAME, RoomEventEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "ServiceStatusEnum")
    public JAXBElement<ServiceStatusEnum> createServiceStatusEnum(ServiceStatusEnum value) {
        return new JAXBElement<ServiceStatusEnum>(_ServiceStatusEnum_QNAME, ServiceStatusEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HousekeepingShiftEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "HousekeepingShiftEnum")
    public JAXBElement<HousekeepingShiftEnum> createHousekeepingShiftEnum(HousekeepingShiftEnum value) {
        return new JAXBElement<HousekeepingShiftEnum>(_HousekeepingShiftEnum_QNAME, HousekeepingShiftEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "RoomStatusEnum")
    public JAXBElement<RoomStatusEnum> createRoomStatusEnum(RoomStatusEnum value) {
        return new JAXBElement<RoomStatusEnum>(_RoomStatusEnum_QNAME, RoomStatusEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomUpdatesCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "GetRoomUpdatesCollection")
    public JAXBElement<GetRoomUpdatesCollection> createGetRoomUpdatesCollection(GetRoomUpdatesCollection value) {
        return new JAXBElement<GetRoomUpdatesCollection>(_GetRoomUpdatesCollection_QNAME, GetRoomUpdatesCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomEqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "RoomEqType")
    public JAXBElement<RoomEqType> createRoomEqType(RoomEqType value) {
        return new JAXBElement<RoomEqType>(_RoomEqType_QNAME, RoomEqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomEqTypeCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "GetRoomEqTypeCollection")
    public JAXBElement<GetRoomEqTypeCollection> createGetRoomEqTypeCollection(GetRoomEqTypeCollection value) {
        return new JAXBElement<GetRoomEqTypeCollection>(_GetRoomEqTypeCollection_QNAME, GetRoomEqTypeCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskSheet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "TaskSheet")
    public JAXBElement<TaskSheet> createTaskSheet(TaskSheet value) {
        return new JAXBElement<TaskSheet>(_TaskSheet_QNAME, TaskSheet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "AttendantFirstName", scope = TaskSheet.class)
    public JAXBElement<String> createTaskSheetAttendantFirstName(String value) {
        return new JAXBElement<String>(_TaskSheetAttendantFirstName_QNAME, String.class, TaskSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "AttendantID", scope = TaskSheet.class)
    public JAXBElement<String> createTaskSheetAttendantID(String value) {
        return new JAXBElement<String>(_TaskSheetAttendantID_QNAME, String.class, TaskSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "AttendantLastName", scope = TaskSheet.class)
    public JAXBElement<String> createTaskSheetAttendantLastName(String value) {
        return new JAXBElement<String>(_TaskSheetAttendantLastName_QNAME, String.class, TaskSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "RoomNumber", scope = TaskSheet.class)
    public JAXBElement<String> createTaskSheetRoomNumber(String value) {
        return new JAXBElement<String>(_TaskSheetRoomNumber_QNAME, String.class, TaskSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "TaskCode", scope = TaskSheet.class)
    public JAXBElement<String> createTaskSheetTaskCode(String value) {
        return new JAXBElement<String>(_TaskSheetTaskCode_QNAME, String.class, TaskSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "TaskInstruction", scope = TaskSheet.class)
    public JAXBElement<String> createTaskSheetTaskInstruction(String value) {
        return new JAXBElement<String>(_TaskSheetTaskInstruction_QNAME, String.class, TaskSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "nameLike", scope = GetRoomEqTypeCollection.class)
    public JAXBElement<String> createGetRoomEqTypeCollectionNameLike(String value) {
        return new JAXBElement<String>(_GetRoomEqTypeCollectionNameLike_QNAME, String.class, GetRoomEqTypeCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "Name", scope = RoomEqType.class)
    public JAXBElement<String> createRoomEqTypeName(String value) {
        return new JAXBElement<String>(_RoomEqTypeName_QNAME, String.class, RoomEqType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "Attendant", scope = Room.class)
    public JAXBElement<User> createRoomAttendant(User value) {
        return new JAXBElement<User>(_RoomAttendant_QNAME, User.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "CleanTime", scope = Room.class)
    public JAXBElement<XMLGregorianCalendar> createRoomCleanTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RoomCleanTime_QNAME, XMLGregorianCalendar.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "DND", scope = Room.class)
    public JAXBElement<Boolean> createRoomDND(Boolean value) {
        return new JAXBElement<Boolean>(_RoomDND_QNAME, Boolean.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "EventTime", scope = Room.class)
    public JAXBElement<XMLGregorianCalendar> createRoomEventTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RoomEventTime_QNAME, XMLGregorianCalendar.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomEventEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "EventType", scope = Room.class)
    public JAXBElement<RoomEventEnum> createRoomEventType(RoomEventEnum value) {
        return new JAXBElement<RoomEventEnum>(_RoomEventType_QNAME, RoomEventEnum.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "Extension", scope = Room.class)
    public JAXBElement<String> createRoomExtension(String value) {
        return new JAXBElement<String>(_RoomExtension_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "GuestInRoom", scope = Room.class)
    public JAXBElement<Boolean> createRoomGuestInRoom(Boolean value) {
        return new JAXBElement<Boolean>(_RoomGuestInRoom_QNAME, Boolean.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "MakeUp", scope = Room.class)
    public JAXBElement<Boolean> createRoomMakeUp(Boolean value) {
        return new JAXBElement<Boolean>(_RoomMakeUp_QNAME, Boolean.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "Name", scope = Room.class)
    public JAXBElement<String> createRoomName(String value) {
        return new JAXBElement<String>(_RoomEqTypeName_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "Occupied", scope = Room.class)
    public JAXBElement<Boolean> createRoomOccupied(Boolean value) {
        return new JAXBElement<Boolean>(_RoomOccupied_QNAME, Boolean.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "RoomNumber", scope = Room.class)
    public JAXBElement<String> createRoomRoomNumber(String value) {
        return new JAXBElement<String>(_TaskSheetRoomNumber_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "Section", scope = Room.class)
    public JAXBElement<String> createRoomSection(String value) {
        return new JAXBElement<String>(_RoomSection_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "ServiceStatus", scope = Room.class)
    public JAXBElement<ServiceStatusEnum> createRoomServiceStatus(ServiceStatusEnum value) {
        return new JAXBElement<ServiceStatusEnum>(_RoomServiceStatus_QNAME, ServiceStatusEnum.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HousekeepingShiftEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "Shift", scope = Room.class)
    public JAXBElement<HousekeepingShiftEnum> createRoomShift(HousekeepingShiftEnum value) {
        return new JAXBElement<HousekeepingShiftEnum>(_RoomShift_QNAME, HousekeepingShiftEnum.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "SpecialInstructions", scope = Room.class)
    public JAXBElement<String> createRoomSpecialInstructions(String value) {
        return new JAXBElement<String>(_RoomSpecialInstructions_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "Status", scope = Room.class)
    public JAXBElement<RoomStatusEnum> createRoomStatus(RoomStatusEnum value) {
        return new JAXBElement<RoomStatusEnum>(_RoomStatus_QNAME, RoomStatusEnum.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "TaskCode", scope = Room.class)
    public JAXBElement<String> createRoomTaskCode(String value) {
        return new JAXBElement<String>(_TaskSheetTaskCode_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "URL", scope = Room.class)
    public JAXBElement<String> createRoomURL(String value) {
        return new JAXBElement<String>(_RoomURL_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "nameLike", scope = GetRoomCollection.class)
    public JAXBElement<String> createGetRoomCollectionNameLike(String value) {
        return new JAXBElement<String>(_GetRoomEqTypeCollectionNameLike_QNAME, String.class, GetRoomCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "ReservationID", scope = RoomRush.class)
    public JAXBElement<String> createRoomRushReservationID(String value) {
        return new JAXBElement<String>(_RoomRushReservationID_QNAME, String.class, RoomRush.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "RoomNumber", scope = RoomRush.class)
    public JAXBElement<String> createRoomRushRoomNumber(String value) {
        return new JAXBElement<String>(_TaskSheetRoomNumber_QNAME, String.class, RoomRush.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "RoomType", scope = RoomRush.class)
    public JAXBElement<String> createRoomRushRoomType(String value) {
        return new JAXBElement<String>(_RoomRushRoomType_QNAME, String.class, RoomRush.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomRushStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:room.api.m-tech.com", name = "Status", scope = RoomRush.class)
    public JAXBElement<RoomRushStatusEnum> createRoomRushStatus(RoomRushStatusEnum value) {
        return new JAXBElement<RoomRushStatusEnum>(_RoomStatus_QNAME, RoomRushStatusEnum.class, RoomRush.class, value);
    }

}
