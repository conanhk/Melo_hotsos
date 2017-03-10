
package com.tech.m.api.serviceorder;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.tech.m.api.User;
import com.tech.m.api.guest.Reservation;
import com.tech.m.api.issue.Issue;
import com.tech.m.api.room.Room;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tech.m.api.serviceorder package. 
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

    private final static QName _ServiceOrder_QNAME = new QName("urn:serviceorder.api.m-tech.com", "ServiceOrder");
    private final static QName _GetServiceOrderUpdatesCollection_QNAME = new QName("urn:serviceorder.api.m-tech.com", "GetServiceOrderUpdatesCollection");
    private final static QName _ArrayOfInspection_QNAME = new QName("urn:serviceorder.api.m-tech.com", "ArrayOfInspection");
    private final static QName _Inspection_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Inspection");
    private final static QName _ArrayOfLaborCost_QNAME = new QName("urn:serviceorder.api.m-tech.com", "ArrayOfLaborCost");
    private final static QName _LaborCost_QNAME = new QName("urn:serviceorder.api.m-tech.com", "LaborCost");
    private final static QName _Cost_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Cost");
    private final static QName _ServiceOrderEventEnum_QNAME = new QName("urn:serviceorder.api.m-tech.com", "ServiceOrderEventEnum");
    private final static QName _ArrayOfPartCost_QNAME = new QName("urn:serviceorder.api.m-tech.com", "ArrayOfPartCost");
    private final static QName _PartCost_QNAME = new QName("urn:serviceorder.api.m-tech.com", "PartCost");
    private final static QName _ArrayOfRecovery_QNAME = new QName("urn:serviceorder.api.m-tech.com", "ArrayOfRecovery");
    private final static QName _Recovery_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Recovery");
    private final static QName _ServiceOrderStatusEnum_QNAME = new QName("urn:serviceorder.api.m-tech.com", "ServiceOrderStatusEnum");
    private final static QName _ServiceOrderTypeEnum_QNAME = new QName("urn:serviceorder.api.m-tech.com", "ServiceOrderTypeEnum");
    private final static QName _CostCode_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Code");
    private final static QName _CostCostCode_QNAME = new QName("urn:serviceorder.api.m-tech.com", "CostCode");
    private final static QName _CostCreatedBy_QNAME = new QName("urn:serviceorder.api.m-tech.com", "CreatedBy");
    private final static QName _CostDescription_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Description");
    private final static QName _CostPrice_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Price");
    private final static QName _CostQuantity_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Quantity");
    private final static QName _LaborCostHours_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Hours");
    private final static QName _LaborCostPricePerHour_QNAME = new QName("urn:serviceorder.api.m-tech.com", "PricePerHour");
    private final static QName _LaborCostWorkedBy_QNAME = new QName("urn:serviceorder.api.m-tech.com", "WorkedBy");
    private final static QName _InspectionResult_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Result");
    private final static QName _InspectionResultType_QNAME = new QName("urn:serviceorder.api.m-tech.com", "ResultType");
    private final static QName _ServiceOrderActionTime_QNAME = new QName("urn:serviceorder.api.m-tech.com", "ActionTime");
    private final static QName _ServiceOrderAssignedTo_QNAME = new QName("urn:serviceorder.api.m-tech.com", "AssignedTo");
    private final static QName _ServiceOrderDirectedBy_QNAME = new QName("urn:serviceorder.api.m-tech.com", "DirectedBy");
    private final static QName _ServiceOrderGuestRelated_QNAME = new QName("urn:serviceorder.api.m-tech.com", "GuestRelated");
    private final static QName _ServiceOrderInspectee_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Inspectee");
    private final static QName _ServiceOrderInspectionResults_QNAME = new QName("urn:serviceorder.api.m-tech.com", "InspectionResults");
    private final static QName _ServiceOrderIssue_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Issue");
    private final static QName _ServiceOrderLabor_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Labor");
    private final static QName _ServiceOrderLastAction_QNAME = new QName("urn:serviceorder.api.m-tech.com", "LastAction");
    private final static QName _ServiceOrderLastEvent_QNAME = new QName("urn:serviceorder.api.m-tech.com", "LastEvent");
    private final static QName _ServiceOrderLastModified_QNAME = new QName("urn:serviceorder.api.m-tech.com", "LastModified");
    private final static QName _ServiceOrderLocation_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Location");
    private final static QName _ServiceOrderLocationTo_QNAME = new QName("urn:serviceorder.api.m-tech.com", "LocationTo");
    private final static QName _ServiceOrderNewRemark_QNAME = new QName("urn:serviceorder.api.m-tech.com", "NewRemark");
    private final static QName _ServiceOrderParts_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Parts");
    private final static QName _ServiceOrderPosted_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Posted");
    private final static QName _ServiceOrderPriority_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Priority");
    private final static QName _ServiceOrderRecoveries_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Recoveries");
    private final static QName _ServiceOrderRequestTime_QNAME = new QName("urn:serviceorder.api.m-tech.com", "RequestTime");
    private final static QName _ServiceOrderRequestedBy_QNAME = new QName("urn:serviceorder.api.m-tech.com", "RequestedBy");
    private final static QName _ServiceOrderReservation_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Reservation");
    private final static QName _ServiceOrderStatus_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Status");
    private final static QName _ServiceOrderText_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Text");
    private final static QName _ServiceOrderTrade_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Trade");
    private final static QName _ServiceOrderType_QNAME = new QName("urn:serviceorder.api.m-tech.com", "Type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tech.m.api.serviceorder
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceOrder }
     * 
     */
    public ServiceOrder createServiceOrder() {
        return new ServiceOrder();
    }

    /**
     * Create an instance of {@link GetServiceOrderUpdatesCollection }
     * 
     */
    public GetServiceOrderUpdatesCollection createGetServiceOrderUpdatesCollection() {
        return new GetServiceOrderUpdatesCollection();
    }

    /**
     * Create an instance of {@link ArrayOfInspection }
     * 
     */
    public ArrayOfInspection createArrayOfInspection() {
        return new ArrayOfInspection();
    }

    /**
     * Create an instance of {@link Inspection }
     * 
     */
    public Inspection createInspection() {
        return new Inspection();
    }

    /**
     * Create an instance of {@link ArrayOfLaborCost }
     * 
     */
    public ArrayOfLaborCost createArrayOfLaborCost() {
        return new ArrayOfLaborCost();
    }

    /**
     * Create an instance of {@link LaborCost }
     * 
     */
    public LaborCost createLaborCost() {
        return new LaborCost();
    }

    /**
     * Create an instance of {@link Cost }
     * 
     */
    public Cost createCost() {
        return new Cost();
    }

    /**
     * Create an instance of {@link ArrayOfPartCost }
     * 
     */
    public ArrayOfPartCost createArrayOfPartCost() {
        return new ArrayOfPartCost();
    }

    /**
     * Create an instance of {@link PartCost }
     * 
     */
    public PartCost createPartCost() {
        return new PartCost();
    }

    /**
     * Create an instance of {@link ArrayOfRecovery }
     * 
     */
    public ArrayOfRecovery createArrayOfRecovery() {
        return new ArrayOfRecovery();
    }

    /**
     * Create an instance of {@link Recovery }
     * 
     */
    public Recovery createRecovery() {
        return new Recovery();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "ServiceOrder")
    public JAXBElement<ServiceOrder> createServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_ServiceOrder_QNAME, ServiceOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceOrderUpdatesCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "GetServiceOrderUpdatesCollection")
    public JAXBElement<GetServiceOrderUpdatesCollection> createGetServiceOrderUpdatesCollection(GetServiceOrderUpdatesCollection value) {
        return new JAXBElement<GetServiceOrderUpdatesCollection>(_GetServiceOrderUpdatesCollection_QNAME, GetServiceOrderUpdatesCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInspection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "ArrayOfInspection")
    public JAXBElement<ArrayOfInspection> createArrayOfInspection(ArrayOfInspection value) {
        return new JAXBElement<ArrayOfInspection>(_ArrayOfInspection_QNAME, ArrayOfInspection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inspection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Inspection")
    public JAXBElement<Inspection> createInspection(Inspection value) {
        return new JAXBElement<Inspection>(_Inspection_QNAME, Inspection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLaborCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "ArrayOfLaborCost")
    public JAXBElement<ArrayOfLaborCost> createArrayOfLaborCost(ArrayOfLaborCost value) {
        return new JAXBElement<ArrayOfLaborCost>(_ArrayOfLaborCost_QNAME, ArrayOfLaborCost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaborCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "LaborCost")
    public JAXBElement<LaborCost> createLaborCost(LaborCost value) {
        return new JAXBElement<LaborCost>(_LaborCost_QNAME, LaborCost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Cost")
    public JAXBElement<Cost> createCost(Cost value) {
        return new JAXBElement<Cost>(_Cost_QNAME, Cost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrderEventEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "ServiceOrderEventEnum")
    public JAXBElement<ServiceOrderEventEnum> createServiceOrderEventEnum(ServiceOrderEventEnum value) {
        return new JAXBElement<ServiceOrderEventEnum>(_ServiceOrderEventEnum_QNAME, ServiceOrderEventEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "ArrayOfPartCost")
    public JAXBElement<ArrayOfPartCost> createArrayOfPartCost(ArrayOfPartCost value) {
        return new JAXBElement<ArrayOfPartCost>(_ArrayOfPartCost_QNAME, ArrayOfPartCost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "PartCost")
    public JAXBElement<PartCost> createPartCost(PartCost value) {
        return new JAXBElement<PartCost>(_PartCost_QNAME, PartCost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecovery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "ArrayOfRecovery")
    public JAXBElement<ArrayOfRecovery> createArrayOfRecovery(ArrayOfRecovery value) {
        return new JAXBElement<ArrayOfRecovery>(_ArrayOfRecovery_QNAME, ArrayOfRecovery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recovery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Recovery")
    public JAXBElement<Recovery> createRecovery(Recovery value) {
        return new JAXBElement<Recovery>(_Recovery_QNAME, Recovery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrderStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "ServiceOrderStatusEnum")
    public JAXBElement<ServiceOrderStatusEnum> createServiceOrderStatusEnum(ServiceOrderStatusEnum value) {
        return new JAXBElement<ServiceOrderStatusEnum>(_ServiceOrderStatusEnum_QNAME, ServiceOrderStatusEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrderTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "ServiceOrderTypeEnum")
    public JAXBElement<ServiceOrderTypeEnum> createServiceOrderTypeEnum(ServiceOrderTypeEnum value) {
        return new JAXBElement<ServiceOrderTypeEnum>(_ServiceOrderTypeEnum_QNAME, ServiceOrderTypeEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Code", scope = Cost.class)
    public JAXBElement<String> createCostCode(String value) {
        return new JAXBElement<String>(_CostCode_QNAME, String.class, Cost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "CostCode", scope = Cost.class)
    public JAXBElement<String> createCostCostCode(String value) {
        return new JAXBElement<String>(_CostCostCode_QNAME, String.class, Cost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "CreatedBy", scope = Cost.class)
    public JAXBElement<User> createCostCreatedBy(User value) {
        return new JAXBElement<User>(_CostCreatedBy_QNAME, User.class, Cost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Description", scope = Cost.class)
    public JAXBElement<String> createCostDescription(String value) {
        return new JAXBElement<String>(_CostDescription_QNAME, String.class, Cost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Price", scope = Cost.class)
    public JAXBElement<Double> createCostPrice(Double value) {
        return new JAXBElement<Double>(_CostPrice_QNAME, Double.class, Cost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Quantity", scope = Cost.class)
    public JAXBElement<Integer> createCostQuantity(Integer value) {
        return new JAXBElement<Integer>(_CostQuantity_QNAME, Integer.class, Cost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Hours", scope = LaborCost.class)
    public JAXBElement<Double> createLaborCostHours(Double value) {
        return new JAXBElement<Double>(_LaborCostHours_QNAME, Double.class, LaborCost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "PricePerHour", scope = LaborCost.class)
    public JAXBElement<Double> createLaborCostPricePerHour(Double value) {
        return new JAXBElement<Double>(_LaborCostPricePerHour_QNAME, Double.class, LaborCost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "WorkedBy", scope = LaborCost.class)
    public JAXBElement<User> createLaborCostWorkedBy(User value) {
        return new JAXBElement<User>(_LaborCostWorkedBy_QNAME, User.class, LaborCost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Description", scope = Inspection.class)
    public JAXBElement<String> createInspectionDescription(String value) {
        return new JAXBElement<String>(_CostDescription_QNAME, String.class, Inspection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Result", scope = Inspection.class)
    public JAXBElement<Integer> createInspectionResult(Integer value) {
        return new JAXBElement<Integer>(_InspectionResult_QNAME, Integer.class, Inspection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "ResultType", scope = Inspection.class)
    public JAXBElement<String> createInspectionResultType(String value) {
        return new JAXBElement<String>(_InspectionResultType_QNAME, String.class, Inspection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "ActionTime", scope = ServiceOrder.class)
    public JAXBElement<XMLGregorianCalendar> createServiceOrderActionTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ServiceOrderActionTime_QNAME, XMLGregorianCalendar.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "AssignedTo", scope = ServiceOrder.class)
    public JAXBElement<User> createServiceOrderAssignedTo(User value) {
        return new JAXBElement<User>(_ServiceOrderAssignedTo_QNAME, User.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "CreatedBy", scope = ServiceOrder.class)
    public JAXBElement<User> createServiceOrderCreatedBy(User value) {
        return new JAXBElement<User>(_CostCreatedBy_QNAME, User.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "DirectedBy", scope = ServiceOrder.class)
    public JAXBElement<User> createServiceOrderDirectedBy(User value) {
        return new JAXBElement<User>(_ServiceOrderDirectedBy_QNAME, User.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "GuestRelated", scope = ServiceOrder.class)
    public JAXBElement<Boolean> createServiceOrderGuestRelated(Boolean value) {
        return new JAXBElement<Boolean>(_ServiceOrderGuestRelated_QNAME, Boolean.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Inspectee", scope = ServiceOrder.class)
    public JAXBElement<User> createServiceOrderInspectee(User value) {
        return new JAXBElement<User>(_ServiceOrderInspectee_QNAME, User.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInspection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "InspectionResults", scope = ServiceOrder.class)
    public JAXBElement<ArrayOfInspection> createServiceOrderInspectionResults(ArrayOfInspection value) {
        return new JAXBElement<ArrayOfInspection>(_ServiceOrderInspectionResults_QNAME, ArrayOfInspection.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Issue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Issue", scope = ServiceOrder.class)
    public JAXBElement<Issue> createServiceOrderIssue(Issue value) {
        return new JAXBElement<Issue>(_ServiceOrderIssue_QNAME, Issue.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLaborCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Labor", scope = ServiceOrder.class)
    public JAXBElement<ArrayOfLaborCost> createServiceOrderLabor(ArrayOfLaborCost value) {
        return new JAXBElement<ArrayOfLaborCost>(_ServiceOrderLabor_QNAME, ArrayOfLaborCost.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "LastAction", scope = ServiceOrder.class)
    public JAXBElement<String> createServiceOrderLastAction(String value) {
        return new JAXBElement<String>(_ServiceOrderLastAction_QNAME, String.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrderEventEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "LastEvent", scope = ServiceOrder.class)
    public JAXBElement<ServiceOrderEventEnum> createServiceOrderLastEvent(ServiceOrderEventEnum value) {
        return new JAXBElement<ServiceOrderEventEnum>(_ServiceOrderLastEvent_QNAME, ServiceOrderEventEnum.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "LastModified", scope = ServiceOrder.class)
    public JAXBElement<XMLGregorianCalendar> createServiceOrderLastModified(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ServiceOrderLastModified_QNAME, XMLGregorianCalendar.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Room }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Location", scope = ServiceOrder.class)
    public JAXBElement<Room> createServiceOrderLocation(Room value) {
        return new JAXBElement<Room>(_ServiceOrderLocation_QNAME, Room.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Room }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "LocationTo", scope = ServiceOrder.class)
    public JAXBElement<Room> createServiceOrderLocationTo(Room value) {
        return new JAXBElement<Room>(_ServiceOrderLocationTo_QNAME, Room.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "NewRemark", scope = ServiceOrder.class)
    public JAXBElement<String> createServiceOrderNewRemark(String value) {
        return new JAXBElement<String>(_ServiceOrderNewRemark_QNAME, String.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPartCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Parts", scope = ServiceOrder.class)
    public JAXBElement<ArrayOfPartCost> createServiceOrderParts(ArrayOfPartCost value) {
        return new JAXBElement<ArrayOfPartCost>(_ServiceOrderParts_QNAME, ArrayOfPartCost.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Posted", scope = ServiceOrder.class)
    public JAXBElement<Boolean> createServiceOrderPosted(Boolean value) {
        return new JAXBElement<Boolean>(_ServiceOrderPosted_QNAME, Boolean.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Priority", scope = ServiceOrder.class)
    public JAXBElement<Integer> createServiceOrderPriority(Integer value) {
        return new JAXBElement<Integer>(_ServiceOrderPriority_QNAME, Integer.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecovery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Recoveries", scope = ServiceOrder.class)
    public JAXBElement<ArrayOfRecovery> createServiceOrderRecoveries(ArrayOfRecovery value) {
        return new JAXBElement<ArrayOfRecovery>(_ServiceOrderRecoveries_QNAME, ArrayOfRecovery.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "RequestTime", scope = ServiceOrder.class)
    public JAXBElement<XMLGregorianCalendar> createServiceOrderRequestTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ServiceOrderRequestTime_QNAME, XMLGregorianCalendar.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "RequestedBy", scope = ServiceOrder.class)
    public JAXBElement<User> createServiceOrderRequestedBy(User value) {
        return new JAXBElement<User>(_ServiceOrderRequestedBy_QNAME, User.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Reservation", scope = ServiceOrder.class)
    public JAXBElement<Reservation> createServiceOrderReservation(Reservation value) {
        return new JAXBElement<Reservation>(_ServiceOrderReservation_QNAME, Reservation.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrderStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Status", scope = ServiceOrder.class)
    public JAXBElement<ServiceOrderStatusEnum> createServiceOrderStatus(ServiceOrderStatusEnum value) {
        return new JAXBElement<ServiceOrderStatusEnum>(_ServiceOrderStatus_QNAME, ServiceOrderStatusEnum.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Text", scope = ServiceOrder.class)
    public JAXBElement<String> createServiceOrderText(String value) {
        return new JAXBElement<String>(_ServiceOrderText_QNAME, String.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Trade", scope = ServiceOrder.class)
    public JAXBElement<String> createServiceOrderTrade(String value) {
        return new JAXBElement<String>(_ServiceOrderTrade_QNAME, String.class, ServiceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrderTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:serviceorder.api.m-tech.com", name = "Type", scope = ServiceOrder.class)
    public JAXBElement<ServiceOrderTypeEnum> createServiceOrderType(ServiceOrderTypeEnum value) {
        return new JAXBElement<ServiceOrderTypeEnum>(_ServiceOrderType_QNAME, ServiceOrderTypeEnum.class, ServiceOrder.class, value);
    }

}
