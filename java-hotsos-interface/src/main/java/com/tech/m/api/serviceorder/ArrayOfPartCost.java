
package com.tech.m.api.serviceorder;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPartCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPartCost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartCost" type="{urn:serviceorder.api.m-tech.com}PartCost" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPartCost", propOrder = {
    "partCost"
})
public class ArrayOfPartCost {

    @XmlElement(name = "PartCost", nillable = true)
    protected List<PartCost> partCost;

    /**
     * Gets the value of the partCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartCost }
     * 
     * 
     */
    public List<PartCost> getPartCost() {
        if (partCost == null) {
            partCost = new ArrayList<PartCost>();
        }
        return this.partCost;
    }

}
