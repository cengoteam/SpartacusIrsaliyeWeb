
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfEInvoiceEnabledCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEInvoiceEnabledCompany"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EInvoiceEnabledCompany" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}EInvoiceEnabledCompany" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEInvoiceEnabledCompany", propOrder = {
    "eInvoiceEnabledCompany"
})
public class ArrayOfEInvoiceEnabledCompany {

    @XmlElement(name = "EInvoiceEnabledCompany", nillable = true)
    protected List<EInvoiceEnabledCompany> eInvoiceEnabledCompany;

    /**
     * Gets the value of the eInvoiceEnabledCompany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eInvoiceEnabledCompany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEInvoiceEnabledCompany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EInvoiceEnabledCompany }
     * 
     * 
     */
    public List<EInvoiceEnabledCompany> getEInvoiceEnabledCompany() {
        if (eInvoiceEnabledCompany == null) {
            eInvoiceEnabledCompany = new ArrayList<EInvoiceEnabledCompany>();
        }
        return this.eInvoiceEnabledCompany;
    }

}
