
package com.tech.m.api.messaging;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.tech.m.api.ArrayOfUser;
import com.tech.m.api.User;
import com.tech.m.api.serviceorder.ServiceOrder;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tech.m.api.messaging package. 
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

    private final static QName _Message_QNAME = new QName("urn:messaging.api.m-tech.com", "Message");
    private final static QName _MessageTypeEnum_QNAME = new QName("urn:messaging.api.m-tech.com", "MessageTypeEnum");
    private final static QName _ServiceOrderMessage_QNAME = new QName("urn:messaging.api.m-tech.com", "ServiceOrderMessage");
    private final static QName _GetMessageInboxCollection_QNAME = new QName("urn:messaging.api.m-tech.com", "GetMessageInboxCollection");
    private final static QName _GetUndeliveredMessagesCollection_QNAME = new QName("urn:messaging.api.m-tech.com", "GetUndeliveredMessagesCollection");
    private final static QName _GetUndeliveredNotificationsCollection_QNAME = new QName("urn:messaging.api.m-tech.com", "GetUndeliveredNotificationsCollection");
    private final static QName _Notification_QNAME = new QName("urn:messaging.api.m-tech.com", "Notification");
    private final static QName _NotificationTypeEnum_QNAME = new QName("urn:messaging.api.m-tech.com", "NotificationTypeEnum");
    private final static QName _NotificationAuthor_QNAME = new QName("urn:messaging.api.m-tech.com", "Author");
    private final static QName _NotificationNotificationToken_QNAME = new QName("urn:messaging.api.m-tech.com", "NotificationToken");
    private final static QName _NotificationText_QNAME = new QName("urn:messaging.api.m-tech.com", "Text");
    private final static QName _NotificationType_QNAME = new QName("urn:messaging.api.m-tech.com", "Type");
    private final static QName _GetUndeliveredNotificationsCollectionProvider_QNAME = new QName("urn:messaging.api.m-tech.com", "Provider");
    private final static QName _GetUndeliveredMessagesCollectionUsers_QNAME = new QName("urn:messaging.api.m-tech.com", "Users");
    private final static QName _GetMessageInboxCollectionUser_QNAME = new QName("urn:messaging.api.m-tech.com", "User");
    private final static QName _MessageDirectedToTeam_QNAME = new QName("urn:messaging.api.m-tech.com", "DirectedToTeam");
    private final static QName _MessageRecipient_QNAME = new QName("urn:messaging.api.m-tech.com", "Recipient");
    private final static QName _MessageResponse_QNAME = new QName("urn:messaging.api.m-tech.com", "Response");
    private final static QName _MessageSubject_QNAME = new QName("urn:messaging.api.m-tech.com", "Subject");
    private final static QName _MessageValidResponses_QNAME = new QName("urn:messaging.api.m-tech.com", "ValidResponses");
    private final static QName _ServiceOrderMessageServiceOrder_QNAME = new QName("urn:messaging.api.m-tech.com", "ServiceOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tech.m.api.messaging
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link ServiceOrderMessage }
     * 
     */
    public ServiceOrderMessage createServiceOrderMessage() {
        return new ServiceOrderMessage();
    }

    /**
     * Create an instance of {@link GetMessageInboxCollection }
     * 
     */
    public GetMessageInboxCollection createGetMessageInboxCollection() {
        return new GetMessageInboxCollection();
    }

    /**
     * Create an instance of {@link GetUndeliveredMessagesCollection }
     * 
     */
    public GetUndeliveredMessagesCollection createGetUndeliveredMessagesCollection() {
        return new GetUndeliveredMessagesCollection();
    }

    /**
     * Create an instance of {@link GetUndeliveredNotificationsCollection }
     * 
     */
    public GetUndeliveredNotificationsCollection createGetUndeliveredNotificationsCollection() {
        return new GetUndeliveredNotificationsCollection();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "Message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "MessageTypeEnum")
    public JAXBElement<MessageTypeEnum> createMessageTypeEnum(MessageTypeEnum value) {
        return new JAXBElement<MessageTypeEnum>(_MessageTypeEnum_QNAME, MessageTypeEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrderMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "ServiceOrderMessage")
    public JAXBElement<ServiceOrderMessage> createServiceOrderMessage(ServiceOrderMessage value) {
        return new JAXBElement<ServiceOrderMessage>(_ServiceOrderMessage_QNAME, ServiceOrderMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageInboxCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "GetMessageInboxCollection")
    public JAXBElement<GetMessageInboxCollection> createGetMessageInboxCollection(GetMessageInboxCollection value) {
        return new JAXBElement<GetMessageInboxCollection>(_GetMessageInboxCollection_QNAME, GetMessageInboxCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUndeliveredMessagesCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "GetUndeliveredMessagesCollection")
    public JAXBElement<GetUndeliveredMessagesCollection> createGetUndeliveredMessagesCollection(GetUndeliveredMessagesCollection value) {
        return new JAXBElement<GetUndeliveredMessagesCollection>(_GetUndeliveredMessagesCollection_QNAME, GetUndeliveredMessagesCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUndeliveredNotificationsCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "GetUndeliveredNotificationsCollection")
    public JAXBElement<GetUndeliveredNotificationsCollection> createGetUndeliveredNotificationsCollection(GetUndeliveredNotificationsCollection value) {
        return new JAXBElement<GetUndeliveredNotificationsCollection>(_GetUndeliveredNotificationsCollection_QNAME, GetUndeliveredNotificationsCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Notification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "Notification")
    public JAXBElement<Notification> createNotification(Notification value) {
        return new JAXBElement<Notification>(_Notification_QNAME, Notification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "NotificationTypeEnum")
    public JAXBElement<NotificationTypeEnum> createNotificationTypeEnum(NotificationTypeEnum value) {
        return new JAXBElement<NotificationTypeEnum>(_NotificationTypeEnum_QNAME, NotificationTypeEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "Author", scope = Notification.class)
    public JAXBElement<String> createNotificationAuthor(String value) {
        return new JAXBElement<String>(_NotificationAuthor_QNAME, String.class, Notification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "NotificationToken", scope = Notification.class)
    public JAXBElement<String> createNotificationNotificationToken(String value) {
        return new JAXBElement<String>(_NotificationNotificationToken_QNAME, String.class, Notification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "Text", scope = Notification.class)
    public JAXBElement<String> createNotificationText(String value) {
        return new JAXBElement<String>(_NotificationText_QNAME, String.class, Notification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "Type", scope = Notification.class)
    public JAXBElement<NotificationTypeEnum> createNotificationType(NotificationTypeEnum value) {
        return new JAXBElement<NotificationTypeEnum>(_NotificationType_QNAME, NotificationTypeEnum.class, Notification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "Provider", scope = GetUndeliveredNotificationsCollection.class)
    public JAXBElement<String> createGetUndeliveredNotificationsCollectionProvider(String value) {
        return new JAXBElement<String>(_GetUndeliveredNotificationsCollectionProvider_QNAME, String.class, GetUndeliveredNotificationsCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "Provider", scope = GetUndeliveredMessagesCollection.class)
    public JAXBElement<String> createGetUndeliveredMessagesCollectionProvider(String value) {
        return new JAXBElement<String>(_GetUndeliveredNotificationsCollectionProvider_QNAME, String.class, GetUndeliveredMessagesCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "Users", scope = GetUndeliveredMessagesCollection.class)
    public JAXBElement<ArrayOfUser> createGetUndeliveredMessagesCollectionUsers(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_GetUndeliveredMessagesCollectionUsers_QNAME, ArrayOfUser.class, GetUndeliveredMessagesCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "User", scope = GetMessageInboxCollection.class)
    public JAXBElement<User> createGetMessageInboxCollectionUser(User value) {
        return new JAXBElement<User>(_GetMessageInboxCollectionUser_QNAME, User.class, GetMessageInboxCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "DirectedToTeam", scope = Message.class)
    public JAXBElement<Boolean> createMessageDirectedToTeam(Boolean value) {
        return new JAXBElement<Boolean>(_MessageDirectedToTeam_QNAME, Boolean.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "Recipient", scope = Message.class)
    public JAXBElement<User> createMessageRecipient(User value) {
        return new JAXBElement<User>(_MessageRecipient_QNAME, User.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "Response", scope = Message.class)
    public JAXBElement<String> createMessageResponse(String value) {
        return new JAXBElement<String>(_MessageResponse_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "Subject", scope = Message.class)
    public JAXBElement<String> createMessageSubject(String value) {
        return new JAXBElement<String>(_MessageSubject_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "Text", scope = Message.class)
    public JAXBElement<String> createMessageText(String value) {
        return new JAXBElement<String>(_NotificationText_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "Type", scope = Message.class)
    public JAXBElement<MessageTypeEnum> createMessageType(MessageTypeEnum value) {
        return new JAXBElement<MessageTypeEnum>(_NotificationType_QNAME, MessageTypeEnum.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "ValidResponses", scope = Message.class)
    public JAXBElement<ArrayOfstring> createMessageValidResponses(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_MessageValidResponses_QNAME, ArrayOfstring.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messaging.api.m-tech.com", name = "ServiceOrder", scope = ServiceOrderMessage.class)
    public JAXBElement<ServiceOrder> createServiceOrderMessageServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_ServiceOrderMessageServiceOrder_QNAME, ServiceOrder.class, ServiceOrderMessage.class, value);
    }

}
