
package com.tech.m.api.inventory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tech.m.api.inventory package. 
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

    private final static QName _Part_QNAME = new QName("urn:inventory.api.m-tech.com", "Part");
    private final static QName _ArrayOfStockRoom_QNAME = new QName("urn:inventory.api.m-tech.com", "ArrayOfStockRoom");
    private final static QName _StockRoom_QNAME = new QName("urn:inventory.api.m-tech.com", "StockRoom");
    private final static QName _UsePartRequest_QNAME = new QName("urn:inventory.api.m-tech.com", "UsePartRequest");
    private final static QName _GetPartsCollection_QNAME = new QName("urn:inventory.api.m-tech.com", "GetPartsCollection");
    private final static QName _InventorySettings_QNAME = new QName("urn:inventory.api.m-tech.com", "InventorySettings");
    private final static QName _InventorySettingsEnabled_QNAME = new QName("urn:inventory.api.m-tech.com", "Enabled");
    private final static QName _GetPartsCollectionBarCode_QNAME = new QName("urn:inventory.api.m-tech.com", "BarCode");
    private final static QName _GetPartsCollectionName_QNAME = new QName("urn:inventory.api.m-tech.com", "Name");
    private final static QName _UsePartRequestLineID_QNAME = new QName("urn:inventory.api.m-tech.com", "LineID");
    private final static QName _UsePartRequestPartID_QNAME = new QName("urn:inventory.api.m-tech.com", "PartID");
    private final static QName _UsePartRequestPrice_QNAME = new QName("urn:inventory.api.m-tech.com", "Price");
    private final static QName _UsePartRequestServiceOrderID_QNAME = new QName("urn:inventory.api.m-tech.com", "ServiceOrderID");
    private final static QName _UsePartRequestStockRoomID_QNAME = new QName("urn:inventory.api.m-tech.com", "StockRoomID");
    private final static QName _PartStockRooms_QNAME = new QName("urn:inventory.api.m-tech.com", "StockRooms");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tech.m.api.inventory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Part }
     * 
     */
    public Part createPart() {
        return new Part();
    }

    /**
     * Create an instance of {@link ArrayOfStockRoom }
     * 
     */
    public ArrayOfStockRoom createArrayOfStockRoom() {
        return new ArrayOfStockRoom();
    }

    /**
     * Create an instance of {@link StockRoom }
     * 
     */
    public StockRoom createStockRoom() {
        return new StockRoom();
    }

    /**
     * Create an instance of {@link UsePartRequest }
     * 
     */
    public UsePartRequest createUsePartRequest() {
        return new UsePartRequest();
    }

    /**
     * Create an instance of {@link GetPartsCollection }
     * 
     */
    public GetPartsCollection createGetPartsCollection() {
        return new GetPartsCollection();
    }

    /**
     * Create an instance of {@link InventorySettings }
     * 
     */
    public InventorySettings createInventorySettings() {
        return new InventorySettings();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Part }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "Part")
    public JAXBElement<Part> createPart(Part value) {
        return new JAXBElement<Part>(_Part_QNAME, Part.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "ArrayOfStockRoom")
    public JAXBElement<ArrayOfStockRoom> createArrayOfStockRoom(ArrayOfStockRoom value) {
        return new JAXBElement<ArrayOfStockRoom>(_ArrayOfStockRoom_QNAME, ArrayOfStockRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "StockRoom")
    public JAXBElement<StockRoom> createStockRoom(StockRoom value) {
        return new JAXBElement<StockRoom>(_StockRoom_QNAME, StockRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsePartRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "UsePartRequest")
    public JAXBElement<UsePartRequest> createUsePartRequest(UsePartRequest value) {
        return new JAXBElement<UsePartRequest>(_UsePartRequest_QNAME, UsePartRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartsCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "GetPartsCollection")
    public JAXBElement<GetPartsCollection> createGetPartsCollection(GetPartsCollection value) {
        return new JAXBElement<GetPartsCollection>(_GetPartsCollection_QNAME, GetPartsCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventorySettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "InventorySettings")
    public JAXBElement<InventorySettings> createInventorySettings(InventorySettings value) {
        return new JAXBElement<InventorySettings>(_InventorySettings_QNAME, InventorySettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "Enabled", scope = InventorySettings.class)
    public JAXBElement<Boolean> createInventorySettingsEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_InventorySettingsEnabled_QNAME, Boolean.class, InventorySettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "BarCode", scope = GetPartsCollection.class)
    public JAXBElement<String> createGetPartsCollectionBarCode(String value) {
        return new JAXBElement<String>(_GetPartsCollectionBarCode_QNAME, String.class, GetPartsCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "Name", scope = GetPartsCollection.class)
    public JAXBElement<String> createGetPartsCollectionName(String value) {
        return new JAXBElement<String>(_GetPartsCollectionName_QNAME, String.class, GetPartsCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "LineID", scope = UsePartRequest.class)
    public JAXBElement<String> createUsePartRequestLineID(String value) {
        return new JAXBElement<String>(_UsePartRequestLineID_QNAME, String.class, UsePartRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "PartID", scope = UsePartRequest.class)
    public JAXBElement<String> createUsePartRequestPartID(String value) {
        return new JAXBElement<String>(_UsePartRequestPartID_QNAME, String.class, UsePartRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "Price", scope = UsePartRequest.class)
    public JAXBElement<Double> createUsePartRequestPrice(Double value) {
        return new JAXBElement<Double>(_UsePartRequestPrice_QNAME, Double.class, UsePartRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "ServiceOrderID", scope = UsePartRequest.class)
    public JAXBElement<String> createUsePartRequestServiceOrderID(String value) {
        return new JAXBElement<String>(_UsePartRequestServiceOrderID_QNAME, String.class, UsePartRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "StockRoomID", scope = UsePartRequest.class)
    public JAXBElement<String> createUsePartRequestStockRoomID(String value) {
        return new JAXBElement<String>(_UsePartRequestStockRoomID_QNAME, String.class, UsePartRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "Name", scope = StockRoom.class)
    public JAXBElement<String> createStockRoomName(String value) {
        return new JAXBElement<String>(_GetPartsCollectionName_QNAME, String.class, StockRoom.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "Price", scope = StockRoom.class)
    public JAXBElement<Double> createStockRoomPrice(Double value) {
        return new JAXBElement<Double>(_UsePartRequestPrice_QNAME, Double.class, StockRoom.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "Name", scope = Part.class)
    public JAXBElement<String> createPartName(String value) {
        return new JAXBElement<String>(_GetPartsCollectionName_QNAME, String.class, Part.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:inventory.api.m-tech.com", name = "StockRooms", scope = Part.class)
    public JAXBElement<ArrayOfStockRoom> createPartStockRooms(ArrayOfStockRoom value) {
        return new JAXBElement<ArrayOfStockRoom>(_PartStockRooms_QNAME, ArrayOfStockRoom.class, Part.class, value);
    }

}
