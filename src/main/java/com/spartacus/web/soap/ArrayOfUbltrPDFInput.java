
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfUbltrPDFInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUbltrPDFInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UbltrPDFInput" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}UbltrPDFInput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUbltrPDFInput", propOrder = {
    "ubltrPDFInput"
})
public class ArrayOfUbltrPDFInput {

    @XmlElement(name = "UbltrPDFInput", nillable = true)
    protected List<UbltrPDFInput> ubltrPDFInput;

    /**
     * Gets the value of the ubltrPDFInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ubltrPDFInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUbltrPDFInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UbltrPDFInput }
     * 
     * 
     */
    public List<UbltrPDFInput> getUbltrPDFInput() {
        if (ubltrPDFInput == null) {
            ubltrPDFInput = new ArrayList<UbltrPDFInput>();
        }
        return this.ubltrPDFInput;
    }

}
