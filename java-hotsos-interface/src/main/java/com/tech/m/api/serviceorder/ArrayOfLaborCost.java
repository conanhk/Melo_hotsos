
package com.tech.m.api.serviceorder;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLaborCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLaborCost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LaborCost" type="{urn:serviceorder.api.m-tech.com}LaborCost" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLaborCost", propOrder = {
    "laborCost"
})
public class ArrayOfLaborCost {

    @XmlElement(name = "LaborCost", nillable = true)
    protected List<LaborCost> laborCost;

    /**
     * Gets the value of the laborCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the laborCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaborCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaborCost }
     * 
     * 
     */
    public List<LaborCost> getLaborCost() {
        if (laborCost == null) {
            laborCost = new ArrayList<LaborCost>();
        }
        return this.laborCost;
    }

}
