
package com.tech.m.api.inventory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStockRoom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStockRoom"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StockRoom" type="{urn:inventory.api.m-tech.com}StockRoom" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStockRoom", propOrder = {
    "stockRoom"
})
public class ArrayOfStockRoom {

    @XmlElement(name = "StockRoom", nillable = true)
    protected List<StockRoom> stockRoom;

    /**
     * Gets the value of the stockRoom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockRoom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockRoom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockRoom }
     * 
     * 
     */
    public List<StockRoom> getStockRoom() {
        if (stockRoom == null) {
            stockRoom = new ArrayList<StockRoom>();
        }
        return this.stockRoom;
    }

}
