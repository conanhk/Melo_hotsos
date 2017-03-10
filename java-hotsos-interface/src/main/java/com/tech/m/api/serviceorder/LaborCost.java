
package com.tech.m.api.serviceorder;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tech.m.api.User;


/**
 * <p>Java class for LaborCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaborCost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:serviceorder.api.m-tech.com}Cost"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Hours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PricePerHour" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="WorkedBy" type="{urn:api.m-tech.com}User" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaborCost", propOrder = {
    "beginTime",
    "endTime",
    "hours",
    "pricePerHour",
    "workedBy"
})
public class LaborCost
    extends Cost
{

    @XmlElement(name = "BeginTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginTime;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElementRef(name = "Hours", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> hours;
    @XmlElementRef(name = "PricePerHour", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> pricePerHour;
    @XmlElementRef(name = "WorkedBy", namespace = "urn:serviceorder.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> workedBy;

    /**
     * Gets the value of the beginTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginTime() {
        return beginTime;
    }

    /**
     * Sets the value of the beginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginTime(XMLGregorianCalendar value) {
        this.beginTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the hours property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHours() {
        return hours;
    }

    /**
     * Sets the value of the hours property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHours(JAXBElement<Double> value) {
        this.hours = value;
    }

    /**
     * Gets the value of the pricePerHour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPricePerHour() {
        return pricePerHour;
    }

    /**
     * Sets the value of the pricePerHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPricePerHour(JAXBElement<Double> value) {
        this.pricePerHour = value;
    }

    /**
     * Gets the value of the workedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getWorkedBy() {
        return workedBy;
    }

    /**
     * Sets the value of the workedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setWorkedBy(JAXBElement<User> value) {
        this.workedBy = value;
    }

}
