
package com.tech.m.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.tech.m.api.fault.ApiFault;
import org.datacontract.schemas._2004._07.messaging.Device;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tech.m.api package. 
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

    private final static QName _ApiObject_QNAME = new QName("urn:api.m-tech.com", "apiObject");
    private final static QName _ArrayOfExtendedAttribute_QNAME = new QName("urn:api.m-tech.com", "ArrayOfExtendedAttribute");
    private final static QName _ExtendedAttribute_QNAME = new QName("urn:api.m-tech.com", "ExtendedAttribute");
    private final static QName _User_QNAME = new QName("urn:api.m-tech.com", "User");
    private final static QName _ArrayOfUser_QNAME = new QName("urn:api.m-tech.com", "ArrayOfUser");
    private final static QName _Settings_QNAME = new QName("urn:api.m-tech.com", "Settings");
    private final static QName _Unit_QNAME = new QName("urn:api.m-tech.com", "Unit");
    private final static QName _GetApiObjectCollection_QNAME = new QName("urn:api.m-tech.com", "GetApiObjectCollection");
    private final static QName _ObjectType_QNAME = new QName("urn:api.m-tech.com", "ObjectType");
    private final static QName _Token_QNAME = new QName("urn:api.m-tech.com", "Token");
    private final static QName _UserLocationElement_QNAME = new QName("urn:api.m-tech.com", "UserLocation");
    private final static QName _GeoCoordinate_QNAME = new QName("urn:api.m-tech.com", "GeoCoordinate");
    private final static QName _QueryServiceOrder_QNAME = new QName("urn:api.m-tech.com", "QueryServiceOrder");
    private final static QName _UserStatusEnum_QNAME = new QName("urn:api.m-tech.com", "UserStatusEnum");
    private final static QName _ApiObjectCollection_QNAME = new QName("urn:api.m-tech.com", "ApiObjectCollection");
    private final static QName _ArrayOfapiObject_QNAME = new QName("urn:api.m-tech.com", "ArrayOfapiObject");
    private final static QName _ApiFault_QNAME = new QName("urn:api.m-tech.com", "apiFault");
    private final static QName _GetResponseGetResult_QNAME = new QName("urn:api.m-tech.com", "getResult");
    private final static QName _SendResponseSendResult_QNAME = new QName("urn:api.m-tech.com", "sendResult");
    private final static QName _DeleteResponseDeleteResult_QNAME = new QName("urn:api.m-tech.com", "deleteResult");
    private final static QName _GetRestType_QNAME = new QName("urn:api.m-tech.com", "type");
    private final static QName _GetRestResponseGetRestResult_QNAME = new QName("urn:api.m-tech.com", "GetRestResult");
    private final static QName _GetRest2Operation_QNAME = new QName("urn:api.m-tech.com", "operation");
    private final static QName _GetRest2ResponseGetRest2Result_QNAME = new QName("urn:api.m-tech.com", "GetRest2Result");
    private final static QName _PostRestResponsePostRestResult_QNAME = new QName("urn:api.m-tech.com", "PostRestResult");
    private final static QName _DeleteRestResponseDeleteRestResult_QNAME = new QName("urn:api.m-tech.com", "DeleteRestResult");
    private final static QName _QueryName_QNAME = new QName("urn:api.m-tech.com", "name");
    private final static QName _GetStorageCollectionWithLocatorLocator_QNAME = new QName("urn:api.m-tech.com", "locator");
    private final static QName _GetStorageByKeyKey_QNAME = new QName("urn:api.m-tech.com", "key");
    private final static QName _DeleteStorageCollectionID_QNAME = new QName("urn:api.m-tech.com", "collectionID");
    private final static QName _QueryTextText_QNAME = new QName("urn:api.m-tech.com", "text");
    private final static QName _ApiObjectError_QNAME = new QName("urn:api.m-tech.com", "Error");
    private final static QName _ApiObjectExtendedAttributes_QNAME = new QName("urn:api.m-tech.com", "ExtendedAttributes");
    private final static QName _ApiObjectID_QNAME = new QName("urn:api.m-tech.com", "ID");
    private final static QName _ApiObjectImpersonate_QNAME = new QName("urn:api.m-tech.com", "Impersonate");
    private final static QName _ApiObjectRecordID_QNAME = new QName("urn:api.m-tech.com", "RecordID");
    private final static QName _ApiObjectUnitID_QNAME = new QName("urn:api.m-tech.com", "UnitID");
    private final static QName _ApiObjectFieldsToNull_QNAME = new QName("urn:api.m-tech.com", "fieldsToNull");
    private final static QName _ApiObjectCollectionItems_QNAME = new QName("urn:api.m-tech.com", "Items");
    private final static QName _QueryServiceOrderResID_QNAME = new QName("urn:api.m-tech.com", "ResID");
    private final static QName _UserLocationBarometerInfo_QNAME = new QName("urn:api.m-tech.com", "BarometerInfo");
    private final static QName _UserLocationBeaconInfo_QNAME = new QName("urn:api.m-tech.com", "BeaconInfo");
    private final static QName _UserLocationConnectionInfo_QNAME = new QName("urn:api.m-tech.com", "ConnectionInfo");
    private final static QName _UserLocationGeoLocation_QNAME = new QName("urn:api.m-tech.com", "GeoLocation");
    private final static QName _UserLocationLastUpdated_QNAME = new QName("urn:api.m-tech.com", "LastUpdated");
    private final static QName _UserLocationLocationName_QNAME = new QName("urn:api.m-tech.com", "LocationName");
    private final static QName _TokenUnitName_QNAME = new QName("urn:api.m-tech.com", "UnitName");
    private final static QName _TokenValue_QNAME = new QName("urn:api.m-tech.com", "Value");
    private final static QName _GetApiObjectCollectionFilter_QNAME = new QName("urn:api.m-tech.com", "Filter");
    private final static QName _GetApiObjectCollectionType_QNAME = new QName("urn:api.m-tech.com", "Type");
    private final static QName _UnitCorporation_QNAME = new QName("urn:api.m-tech.com", "Corporation");
    private final static QName _UnitName_QNAME = new QName("urn:api.m-tech.com", "Name");
    private final static QName _SettingsAskCheckout_QNAME = new QName("urn:api.m-tech.com", "AskCheckout");
    private final static QName _SettingsAskGreenOption_QNAME = new QName("urn:api.m-tech.com", "AskGreenOption");
    private final static QName _SettingsDayStartTime_QNAME = new QName("urn:api.m-tech.com", "DayStartTime");
    private final static QName _UserCurrentRoom_QNAME = new QName("urn:api.m-tech.com", "CurrentRoom");
    private final static QName _UserDepartment_QNAME = new QName("urn:api.m-tech.com", "Department");
    private final static QName _UserDevice_QNAME = new QName("urn:api.m-tech.com", "Device");
    private final static QName _UserDeviceInfo_QNAME = new QName("urn:api.m-tech.com", "DeviceInfo");
    private final static QName _UserLocation_QNAME = new QName("urn:api.m-tech.com", "Location");
    private final static QName _UserLogin_QNAME = new QName("urn:api.m-tech.com", "Login");
    private final static QName _UserMD5_QNAME = new QName("urn:api.m-tech.com", "MD5");
    private final static QName _UserPassword_QNAME = new QName("urn:api.m-tech.com", "Password");
    private final static QName _UserSHA512_QNAME = new QName("urn:api.m-tech.com", "SHA512");
    private final static QName _UserSection_QNAME = new QName("urn:api.m-tech.com", "Section");
    private final static QName _UserStatus_QNAME = new QName("urn:api.m-tech.com", "Status");
    private final static QName _UserTrade_QNAME = new QName("urn:api.m-tech.com", "Trade");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tech.m.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApiObject }
     * 
     */
    public ApiObject createApiObject() {
        return new ApiObject();
    }

    /**
     * Create an instance of {@link ArrayOfExtendedAttribute }
     * 
     */
    public ArrayOfExtendedAttribute createArrayOfExtendedAttribute() {
        return new ArrayOfExtendedAttribute();
    }

    /**
     * Create an instance of {@link ExtendedAttribute }
     * 
     */
    public ExtendedAttribute createExtendedAttribute() {
        return new ExtendedAttribute();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link ArrayOfUser }
     * 
     */
    public ArrayOfUser createArrayOfUser() {
        return new ArrayOfUser();
    }

    /**
     * Create an instance of {@link Settings }
     * 
     */
    public Settings createSettings() {
        return new Settings();
    }

    /**
     * Create an instance of {@link Unit }
     * 
     */
    public Unit createUnit() {
        return new Unit();
    }

    /**
     * Create an instance of {@link GetApiObjectCollection }
     * 
     */
    public GetApiObjectCollection createGetApiObjectCollection() {
        return new GetApiObjectCollection();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link UserLocation }
     * 
     */
    public UserLocation createUserLocation() {
        return new UserLocation();
    }

    /**
     * Create an instance of {@link GeoCoordinate }
     * 
     */
    public GeoCoordinate createGeoCoordinate() {
        return new GeoCoordinate();
    }

    /**
     * Create an instance of {@link QueryServiceOrder }
     * 
     */
    public QueryServiceOrder createQueryServiceOrder() {
        return new QueryServiceOrder();
    }

    /**
     * Create an instance of {@link ApiObjectCollection }
     * 
     */
    public ApiObjectCollection createApiObjectCollection() {
        return new ApiObjectCollection();
    }

    /**
     * Create an instance of {@link ArrayOfapiObject }
     * 
     */
    public ArrayOfapiObject createArrayOfapiObject() {
        return new ArrayOfapiObject();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link Send }
     * 
     */
    public Send createSend() {
        return new Send();
    }

    /**
     * Create an instance of {@link SendResponse }
     * 
     */
    public SendResponse createSendResponse() {
        return new SendResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetRest }
     * 
     */
    public GetRest createGetRest() {
        return new GetRest();
    }

    /**
     * Create an instance of {@link GetRestResponse }
     * 
     */
    public GetRestResponse createGetRestResponse() {
        return new GetRestResponse();
    }

    /**
     * Create an instance of {@link GetRestStream }
     * 
     */
    public GetRestStream createGetRestStream() {
        return new GetRestStream();
    }

    /**
     * Create an instance of {@link GetRestStreamResponse }
     * 
     */
    public GetRestStreamResponse createGetRestStreamResponse() {
        return new GetRestStreamResponse();
    }

    /**
     * Create an instance of {@link GetRest2 }
     * 
     */
    public GetRest2 createGetRest2() {
        return new GetRest2();
    }

    /**
     * Create an instance of {@link GetRest2Response }
     * 
     */
    public GetRest2Response createGetRest2Response() {
        return new GetRest2Response();
    }

    /**
     * Create an instance of {@link GetRest2Stream }
     * 
     */
    public GetRest2Stream createGetRest2Stream() {
        return new GetRest2Stream();
    }

    /**
     * Create an instance of {@link GetRest2StreamResponse }
     * 
     */
    public GetRest2StreamResponse createGetRest2StreamResponse() {
        return new GetRest2StreamResponse();
    }

    /**
     * Create an instance of {@link PostRest }
     * 
     */
    public PostRest createPostRest() {
        return new PostRest();
    }

    /**
     * Create an instance of {@link PostRestResponse }
     * 
     */
    public PostRestResponse createPostRestResponse() {
        return new PostRestResponse();
    }

    /**
     * Create an instance of {@link PostRestStream }
     * 
     */
    public PostRestStream createPostRestStream() {
        return new PostRestStream();
    }

    /**
     * Create an instance of {@link PostRestStreamResponse }
     * 
     */
    public PostRestStreamResponse createPostRestStreamResponse() {
        return new PostRestStreamResponse();
    }

    /**
     * Create an instance of {@link PostRest2Stream }
     * 
     */
    public PostRest2Stream createPostRest2Stream() {
        return new PostRest2Stream();
    }

    /**
     * Create an instance of {@link PostRest2StreamResponse }
     * 
     */
    public PostRest2StreamResponse createPostRest2StreamResponse() {
        return new PostRest2StreamResponse();
    }

    /**
     * Create an instance of {@link DeleteRest }
     * 
     */
    public DeleteRest createDeleteRest() {
        return new DeleteRest();
    }

    /**
     * Create an instance of {@link DeleteRestResponse }
     * 
     */
    public DeleteRestResponse createDeleteRestResponse() {
        return new DeleteRestResponse();
    }

    /**
     * Create an instance of {@link DeleteRestStream }
     * 
     */
    public DeleteRestStream createDeleteRestStream() {
        return new DeleteRestStream();
    }

    /**
     * Create an instance of {@link DeleteRestStreamResponse }
     * 
     */
    public DeleteRestStreamResponse createDeleteRestStreamResponse() {
        return new DeleteRestStreamResponse();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link GetStorage }
     * 
     */
    public GetStorage createGetStorage() {
        return new GetStorage();
    }

    /**
     * Create an instance of {@link GetStorageResponse }
     * 
     */
    public GetStorageResponse createGetStorageResponse() {
        return new GetStorageResponse();
    }

    /**
     * Create an instance of {@link GetStorageCollectionWithLocator }
     * 
     */
    public GetStorageCollectionWithLocator createGetStorageCollectionWithLocator() {
        return new GetStorageCollectionWithLocator();
    }

    /**
     * Create an instance of {@link GetStorageCollectionWithLocatorResponse }
     * 
     */
    public GetStorageCollectionWithLocatorResponse createGetStorageCollectionWithLocatorResponse() {
        return new GetStorageCollectionWithLocatorResponse();
    }

    /**
     * Create an instance of {@link GetStorageByKey }
     * 
     */
    public GetStorageByKey createGetStorageByKey() {
        return new GetStorageByKey();
    }

    /**
     * Create an instance of {@link GetStorageByKeyResponse }
     * 
     */
    public GetStorageByKeyResponse createGetStorageByKeyResponse() {
        return new GetStorageByKeyResponse();
    }

    /**
     * Create an instance of {@link GetStorageRelatedByKey }
     * 
     */
    public GetStorageRelatedByKey createGetStorageRelatedByKey() {
        return new GetStorageRelatedByKey();
    }

    /**
     * Create an instance of {@link GetStorageRelatedByKeyResponse }
     * 
     */
    public GetStorageRelatedByKeyResponse createGetStorageRelatedByKeyResponse() {
        return new GetStorageRelatedByKeyResponse();
    }

    /**
     * Create an instance of {@link DeleteStorage }
     * 
     */
    public DeleteStorage createDeleteStorage() {
        return new DeleteStorage();
    }

    /**
     * Create an instance of {@link DeleteStorageResponse }
     * 
     */
    public DeleteStorageResponse createDeleteStorageResponse() {
        return new DeleteStorageResponse();
    }

    /**
     * Create an instance of {@link DeleteStorageByKey }
     * 
     */
    public DeleteStorageByKey createDeleteStorageByKey() {
        return new DeleteStorageByKey();
    }

    /**
     * Create an instance of {@link DeleteStorageByKeyResponse }
     * 
     */
    public DeleteStorageByKeyResponse createDeleteStorageByKeyResponse() {
        return new DeleteStorageByKeyResponse();
    }

    /**
     * Create an instance of {@link PostStorage }
     * 
     */
    public PostStorage createPostStorage() {
        return new PostStorage();
    }

    /**
     * Create an instance of {@link PostStorageResponse }
     * 
     */
    public PostStorageResponse createPostStorageResponse() {
        return new PostStorageResponse();
    }

    /**
     * Create an instance of {@link PostStorageCollection }
     * 
     */
    public PostStorageCollection createPostStorageCollection() {
        return new PostStorageCollection();
    }

    /**
     * Create an instance of {@link PostStorageCollectionResponse }
     * 
     */
    public PostStorageCollectionResponse createPostStorageCollectionResponse() {
        return new PostStorageCollectionResponse();
    }

    /**
     * Create an instance of {@link QueryText }
     * 
     */
    public QueryText createQueryText() {
        return new QueryText();
    }

    /**
     * Create an instance of {@link QueryTextResponse }
     * 
     */
    public QueryTextResponse createQueryTextResponse() {
        return new QueryTextResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "apiObject")
    public JAXBElement<ApiObject> createApiObject(ApiObject value) {
        return new JAXBElement<ApiObject>(_ApiObject_QNAME, ApiObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtendedAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "ArrayOfExtendedAttribute")
    public JAXBElement<ArrayOfExtendedAttribute> createArrayOfExtendedAttribute(ArrayOfExtendedAttribute value) {
        return new JAXBElement<ArrayOfExtendedAttribute>(_ArrayOfExtendedAttribute_QNAME, ArrayOfExtendedAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "ExtendedAttribute")
    public JAXBElement<ExtendedAttribute> createExtendedAttribute(ExtendedAttribute value) {
        return new JAXBElement<ExtendedAttribute>(_ExtendedAttribute_QNAME, ExtendedAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "ArrayOfUser")
    public JAXBElement<ArrayOfUser> createArrayOfUser(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_ArrayOfUser_QNAME, ArrayOfUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Settings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Settings")
    public JAXBElement<Settings> createSettings(Settings value) {
        return new JAXBElement<Settings>(_Settings_QNAME, Settings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Unit")
    public JAXBElement<Unit> createUnit(Unit value) {
        return new JAXBElement<Unit>(_Unit_QNAME, Unit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApiObjectCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "GetApiObjectCollection")
    public JAXBElement<GetApiObjectCollection> createGetApiObjectCollection(GetApiObjectCollection value) {
        return new JAXBElement<GetApiObjectCollection>(_GetApiObjectCollection_QNAME, GetApiObjectCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "ObjectType")
    public JAXBElement<ObjectType> createObjectType(ObjectType value) {
        return new JAXBElement<ObjectType>(_ObjectType_QNAME, ObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Token }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Token")
    public JAXBElement<Token> createToken(Token value) {
        return new JAXBElement<Token>(_Token_QNAME, Token.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "UserLocation")
    public JAXBElement<UserLocation> createUserLocationElement(UserLocation value) {
        return new JAXBElement<UserLocation>(_UserLocationElement_QNAME, UserLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "GeoCoordinate")
    public JAXBElement<GeoCoordinate> createGeoCoordinate(GeoCoordinate value) {
        return new JAXBElement<GeoCoordinate>(_GeoCoordinate_QNAME, GeoCoordinate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "QueryServiceOrder")
    public JAXBElement<QueryServiceOrder> createQueryServiceOrder(QueryServiceOrder value) {
        return new JAXBElement<QueryServiceOrder>(_QueryServiceOrder_QNAME, QueryServiceOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "UserStatusEnum")
    public JAXBElement<UserStatusEnum> createUserStatusEnum(UserStatusEnum value) {
        return new JAXBElement<UserStatusEnum>(_UserStatusEnum_QNAME, UserStatusEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiObjectCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "ApiObjectCollection")
    public JAXBElement<ApiObjectCollection> createApiObjectCollection(ApiObjectCollection value) {
        return new JAXBElement<ApiObjectCollection>(_ApiObjectCollection_QNAME, ApiObjectCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfapiObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "ArrayOfapiObject")
    public JAXBElement<ArrayOfapiObject> createArrayOfapiObject(ArrayOfapiObject value) {
        return new JAXBElement<ArrayOfapiObject>(_ArrayOfapiObject_QNAME, ArrayOfapiObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "apiFault")
    public JAXBElement<ApiFault> createApiFault(ApiFault value) {
        return new JAXBElement<ApiFault>(_ApiFault_QNAME, ApiFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "getResult", scope = GetResponse.class)
    public JAXBElement<ApiObject> createGetResponseGetResult(ApiObject value) {
        return new JAXBElement<ApiObject>(_GetResponseGetResult_QNAME, ApiObject.class, GetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "sendResult", scope = SendResponse.class)
    public JAXBElement<ApiObject> createSendResponseSendResult(ApiObject value) {
        return new JAXBElement<ApiObject>(_SendResponseSendResult_QNAME, ApiObject.class, SendResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "deleteResult", scope = DeleteResponse.class)
    public JAXBElement<ApiObject> createDeleteResponseDeleteResult(ApiObject value) {
        return new JAXBElement<ApiObject>(_DeleteResponseDeleteResult_QNAME, ApiObject.class, DeleteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = GetRest.class)
    public JAXBElement<String> createGetRestType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, GetRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "GetRestResult", scope = GetRestResponse.class)
    public JAXBElement<ApiObject> createGetRestResponseGetRestResult(ApiObject value) {
        return new JAXBElement<ApiObject>(_GetRestResponseGetRestResult_QNAME, ApiObject.class, GetRestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = GetRestStream.class)
    public JAXBElement<String> createGetRestStreamType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, GetRestStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = GetRest2 .class)
    public JAXBElement<String> createGetRest2Type(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, GetRest2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "operation", scope = GetRest2 .class)
    public JAXBElement<String> createGetRest2Operation(String value) {
        return new JAXBElement<String>(_GetRest2Operation_QNAME, String.class, GetRest2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "GetRest2Result", scope = GetRest2Response.class)
    public JAXBElement<ApiObject> createGetRest2ResponseGetRest2Result(ApiObject value) {
        return new JAXBElement<ApiObject>(_GetRest2ResponseGetRest2Result_QNAME, ApiObject.class, GetRest2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = GetRest2Stream.class)
    public JAXBElement<String> createGetRest2StreamType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, GetRest2Stream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "operation", scope = GetRest2Stream.class)
    public JAXBElement<String> createGetRest2StreamOperation(String value) {
        return new JAXBElement<String>(_GetRest2Operation_QNAME, String.class, GetRest2Stream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = PostRest.class)
    public JAXBElement<String> createPostRestType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, PostRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "PostRestResult", scope = PostRestResponse.class)
    public JAXBElement<ApiObject> createPostRestResponsePostRestResult(ApiObject value) {
        return new JAXBElement<ApiObject>(_PostRestResponsePostRestResult_QNAME, ApiObject.class, PostRestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = PostRestStream.class)
    public JAXBElement<String> createPostRestStreamType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, PostRestStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = PostRest2Stream.class)
    public JAXBElement<String> createPostRest2StreamType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, PostRest2Stream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "operation", scope = PostRest2Stream.class)
    public JAXBElement<String> createPostRest2StreamOperation(String value) {
        return new JAXBElement<String>(_GetRest2Operation_QNAME, String.class, PostRest2Stream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = DeleteRest.class)
    public JAXBElement<String> createDeleteRestType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, DeleteRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "operation", scope = DeleteRest.class)
    public JAXBElement<String> createDeleteRestOperation(String value) {
        return new JAXBElement<String>(_GetRest2Operation_QNAME, String.class, DeleteRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "DeleteRestResult", scope = DeleteRestResponse.class)
    public JAXBElement<ApiObject> createDeleteRestResponseDeleteRestResult(ApiObject value) {
        return new JAXBElement<ApiObject>(_DeleteRestResponseDeleteRestResult_QNAME, ApiObject.class, DeleteRestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = DeleteRestStream.class)
    public JAXBElement<String> createDeleteRestStreamType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, DeleteRestStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "operation", scope = DeleteRestStream.class)
    public JAXBElement<String> createDeleteRestStreamOperation(String value) {
        return new JAXBElement<String>(_GetRest2Operation_QNAME, String.class, DeleteRestStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "name", scope = Query.class)
    public JAXBElement<String> createQueryName(String value) {
        return new JAXBElement<String>(_QueryName_QNAME, String.class, Query.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = GetStorage.class)
    public JAXBElement<String> createGetStorageType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, GetStorage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = GetStorageCollectionWithLocator.class)
    public JAXBElement<String> createGetStorageCollectionWithLocatorType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, GetStorageCollectionWithLocator.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "locator", scope = GetStorageCollectionWithLocator.class)
    public JAXBElement<String> createGetStorageCollectionWithLocatorLocator(String value) {
        return new JAXBElement<String>(_GetStorageCollectionWithLocatorLocator_QNAME, String.class, GetStorageCollectionWithLocator.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = GetStorageByKey.class)
    public JAXBElement<String> createGetStorageByKeyType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, GetStorageByKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "key", scope = GetStorageByKey.class)
    public JAXBElement<String> createGetStorageByKeyKey(String value) {
        return new JAXBElement<String>(_GetStorageByKeyKey_QNAME, String.class, GetStorageByKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = GetStorageRelatedByKey.class)
    public JAXBElement<String> createGetStorageRelatedByKeyType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, GetStorageRelatedByKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "key", scope = GetStorageRelatedByKey.class)
    public JAXBElement<String> createGetStorageRelatedByKeyKey(String value) {
        return new JAXBElement<String>(_GetStorageByKeyKey_QNAME, String.class, GetStorageRelatedByKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = DeleteStorage.class)
    public JAXBElement<String> createDeleteStorageType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, DeleteStorage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "collectionID", scope = DeleteStorage.class)
    public JAXBElement<String> createDeleteStorageCollectionID(String value) {
        return new JAXBElement<String>(_DeleteStorageCollectionID_QNAME, String.class, DeleteStorage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = DeleteStorageByKey.class)
    public JAXBElement<String> createDeleteStorageByKeyType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, DeleteStorageByKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "key", scope = DeleteStorageByKey.class)
    public JAXBElement<String> createDeleteStorageByKeyKey(String value) {
        return new JAXBElement<String>(_GetStorageByKeyKey_QNAME, String.class, DeleteStorageByKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = PostStorage.class)
    public JAXBElement<String> createPostStorageType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, PostStorage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "key", scope = PostStorage.class)
    public JAXBElement<String> createPostStorageKey(String value) {
        return new JAXBElement<String>(_GetStorageByKeyKey_QNAME, String.class, PostStorage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "type", scope = PostStorageCollection.class)
    public JAXBElement<String> createPostStorageCollectionType(String value) {
        return new JAXBElement<String>(_GetRestType_QNAME, String.class, PostStorageCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "text", scope = QueryText.class)
    public JAXBElement<String> createQueryTextText(String value) {
        return new JAXBElement<String>(_QueryTextText_QNAME, String.class, QueryText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Error", scope = ApiObject.class)
    public JAXBElement<ApiFault> createApiObjectError(ApiFault value) {
        return new JAXBElement<ApiFault>(_ApiObjectError_QNAME, ApiFault.class, ApiObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtendedAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "ExtendedAttributes", scope = ApiObject.class)
    public JAXBElement<ArrayOfExtendedAttribute> createApiObjectExtendedAttributes(ArrayOfExtendedAttribute value) {
        return new JAXBElement<ArrayOfExtendedAttribute>(_ApiObjectExtendedAttributes_QNAME, ArrayOfExtendedAttribute.class, ApiObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "ID", scope = ApiObject.class)
    public JAXBElement<String> createApiObjectID(String value) {
        return new JAXBElement<String>(_ApiObjectID_QNAME, String.class, ApiObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Impersonate", scope = ApiObject.class)
    public JAXBElement<User> createApiObjectImpersonate(User value) {
        return new JAXBElement<User>(_ApiObjectImpersonate_QNAME, User.class, ApiObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "RecordID", scope = ApiObject.class)
    public JAXBElement<String> createApiObjectRecordID(String value) {
        return new JAXBElement<String>(_ApiObjectRecordID_QNAME, String.class, ApiObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "UnitID", scope = ApiObject.class)
    public JAXBElement<String> createApiObjectUnitID(String value) {
        return new JAXBElement<String>(_ApiObjectUnitID_QNAME, String.class, ApiObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "fieldsToNull", scope = ApiObject.class)
    public JAXBElement<ArrayOfstring> createApiObjectFieldsToNull(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ApiObjectFieldsToNull_QNAME, ArrayOfstring.class, ApiObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfapiObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Items", scope = ApiObjectCollection.class)
    public JAXBElement<ArrayOfapiObject> createApiObjectCollectionItems(ArrayOfapiObject value) {
        return new JAXBElement<ArrayOfapiObject>(_ApiObjectCollectionItems_QNAME, ArrayOfapiObject.class, ApiObjectCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "ResID", scope = QueryServiceOrder.class)
    public JAXBElement<String> createQueryServiceOrderResID(String value) {
        return new JAXBElement<String>(_QueryServiceOrderResID_QNAME, String.class, QueryServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "BarometerInfo", scope = UserLocation.class)
    public JAXBElement<String> createUserLocationBarometerInfo(String value) {
        return new JAXBElement<String>(_UserLocationBarometerInfo_QNAME, String.class, UserLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "BeaconInfo", scope = UserLocation.class)
    public JAXBElement<String> createUserLocationBeaconInfo(String value) {
        return new JAXBElement<String>(_UserLocationBeaconInfo_QNAME, String.class, UserLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "ConnectionInfo", scope = UserLocation.class)
    public JAXBElement<String> createUserLocationConnectionInfo(String value) {
        return new JAXBElement<String>(_UserLocationConnectionInfo_QNAME, String.class, UserLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoCoordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "GeoLocation", scope = UserLocation.class)
    public JAXBElement<GeoCoordinate> createUserLocationGeoLocation(GeoCoordinate value) {
        return new JAXBElement<GeoCoordinate>(_UserLocationGeoLocation_QNAME, GeoCoordinate.class, UserLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "LastUpdated", scope = UserLocation.class)
    public JAXBElement<XMLGregorianCalendar> createUserLocationLastUpdated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UserLocationLastUpdated_QNAME, XMLGregorianCalendar.class, UserLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "LocationName", scope = UserLocation.class)
    public JAXBElement<String> createUserLocationLocationName(String value) {
        return new JAXBElement<String>(_UserLocationLocationName_QNAME, String.class, UserLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "UnitName", scope = Token.class)
    public JAXBElement<String> createTokenUnitName(String value) {
        return new JAXBElement<String>(_TokenUnitName_QNAME, String.class, Token.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Value", scope = Token.class)
    public JAXBElement<String> createTokenValue(String value) {
        return new JAXBElement<String>(_TokenValue_QNAME, String.class, Token.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Filter", scope = GetApiObjectCollection.class)
    public JAXBElement<String> createGetApiObjectCollectionFilter(String value) {
        return new JAXBElement<String>(_GetApiObjectCollectionFilter_QNAME, String.class, GetApiObjectCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Type", scope = GetApiObjectCollection.class)
    public JAXBElement<ObjectType> createGetApiObjectCollectionType(ObjectType value) {
        return new JAXBElement<ObjectType>(_GetApiObjectCollectionType_QNAME, ObjectType.class, GetApiObjectCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Corporation", scope = Unit.class)
    public JAXBElement<String> createUnitCorporation(String value) {
        return new JAXBElement<String>(_UnitCorporation_QNAME, String.class, Unit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Name", scope = Unit.class)
    public JAXBElement<String> createUnitName(String value) {
        return new JAXBElement<String>(_UnitName_QNAME, String.class, Unit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "AskCheckout", scope = Settings.class)
    public JAXBElement<Boolean> createSettingsAskCheckout(Boolean value) {
        return new JAXBElement<Boolean>(_SettingsAskCheckout_QNAME, Boolean.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "AskGreenOption", scope = Settings.class)
    public JAXBElement<Boolean> createSettingsAskGreenOption(Boolean value) {
        return new JAXBElement<Boolean>(_SettingsAskGreenOption_QNAME, Boolean.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "DayStartTime", scope = Settings.class)
    public JAXBElement<XMLGregorianCalendar> createSettingsDayStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SettingsDayStartTime_QNAME, XMLGregorianCalendar.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "CurrentRoom", scope = User.class)
    public JAXBElement<String> createUserCurrentRoom(String value) {
        return new JAXBElement<String>(_UserCurrentRoom_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Department", scope = User.class)
    public JAXBElement<String> createUserDepartment(String value) {
        return new JAXBElement<String>(_UserDepartment_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Device", scope = User.class)
    public JAXBElement<String> createUserDevice(String value) {
        return new JAXBElement<String>(_UserDevice_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Device }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "DeviceInfo", scope = User.class)
    public JAXBElement<Device> createUserDeviceInfo(Device value) {
        return new JAXBElement<Device>(_UserDeviceInfo_QNAME, Device.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Location", scope = User.class)
    public JAXBElement<UserLocation> createUserLocation(UserLocation value) {
        return new JAXBElement<UserLocation>(_UserLocation_QNAME, UserLocation.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Login", scope = User.class)
    public JAXBElement<String> createUserLogin(String value) {
        return new JAXBElement<String>(_UserLogin_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "MD5", scope = User.class)
    public JAXBElement<String> createUserMD5(String value) {
        return new JAXBElement<String>(_UserMD5_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Name", scope = User.class)
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UnitName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Password", scope = User.class)
    public JAXBElement<String> createUserPassword(String value) {
        return new JAXBElement<String>(_UserPassword_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "SHA512", scope = User.class)
    public JAXBElement<String> createUserSHA512(String value) {
        return new JAXBElement<String>(_UserSHA512_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Section", scope = User.class)
    public JAXBElement<String> createUserSection(String value) {
        return new JAXBElement<String>(_UserSection_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Status", scope = User.class)
    public JAXBElement<UserStatusEnum> createUserStatus(UserStatusEnum value) {
        return new JAXBElement<UserStatusEnum>(_UserStatus_QNAME, UserStatusEnum.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Trade", scope = User.class)
    public JAXBElement<String> createUserTrade(String value) {
        return new JAXBElement<String>(_UserTrade_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Name", scope = ExtendedAttribute.class)
    public JAXBElement<String> createExtendedAttributeName(String value) {
        return new JAXBElement<String>(_UnitName_QNAME, String.class, ExtendedAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.m-tech.com", name = "Value", scope = ExtendedAttribute.class)
    public JAXBElement<Object> createExtendedAttributeValue(Object value) {
        return new JAXBElement<Object>(_TokenValue_QNAME, Object.class, ExtendedAttribute.class, value);
    }

}
