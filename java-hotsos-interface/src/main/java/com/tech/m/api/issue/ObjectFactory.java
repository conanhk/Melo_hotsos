
package com.tech.m.api.issue;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tech.m.api.issue package. 
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

    private final static QName _GetIssueCollection_QNAME = new QName("urn:issue.api.m-tech.com", "GetIssueCollection");
    private final static QName _Issue_QNAME = new QName("urn:issue.api.m-tech.com", "Issue");
    private final static QName _IssueActive_QNAME = new QName("urn:issue.api.m-tech.com", "Active");
    private final static QName _IssueName_QNAME = new QName("urn:issue.api.m-tech.com", "Name");
    private final static QName _GetIssueCollectionNameLike_QNAME = new QName("urn:issue.api.m-tech.com", "nameLike");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tech.m.api.issue
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIssueCollection }
     * 
     */
    public GetIssueCollection createGetIssueCollection() {
        return new GetIssueCollection();
    }

    /**
     * Create an instance of {@link Issue }
     * 
     */
    public Issue createIssue() {
        return new Issue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIssueCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:issue.api.m-tech.com", name = "GetIssueCollection")
    public JAXBElement<GetIssueCollection> createGetIssueCollection(GetIssueCollection value) {
        return new JAXBElement<GetIssueCollection>(_GetIssueCollection_QNAME, GetIssueCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Issue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:issue.api.m-tech.com", name = "Issue")
    public JAXBElement<Issue> createIssue(Issue value) {
        return new JAXBElement<Issue>(_Issue_QNAME, Issue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:issue.api.m-tech.com", name = "Active", scope = Issue.class)
    public JAXBElement<Boolean> createIssueActive(Boolean value) {
        return new JAXBElement<Boolean>(_IssueActive_QNAME, Boolean.class, Issue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:issue.api.m-tech.com", name = "Name", scope = Issue.class)
    public JAXBElement<String> createIssueName(String value) {
        return new JAXBElement<String>(_IssueName_QNAME, String.class, Issue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:issue.api.m-tech.com", name = "nameLike", scope = GetIssueCollection.class)
    public JAXBElement<String> createGetIssueCollectionNameLike(String value) {
        return new JAXBElement<String>(_GetIssueCollectionNameLike_QNAME, String.class, GetIssueCollection.class, value);
    }

}
