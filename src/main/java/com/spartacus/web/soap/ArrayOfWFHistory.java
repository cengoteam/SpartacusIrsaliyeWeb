
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfWFHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWFHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WFHistory" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}WFHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWFHistory", propOrder = {
    "wfHistory"
})
public class ArrayOfWFHistory {

    @XmlElement(name = "WFHistory", nillable = true)
    protected List<WFHistory> wfHistory;

    /**
     * Gets the value of the wfHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wfHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWFHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WFHistory }
     * 
     * 
     */
    public List<WFHistory> getWFHistory() {
        if (wfHistory == null) {
            wfHistory = new ArrayList<WFHistory>();
        }
        return this.wfHistory;
    }

}
