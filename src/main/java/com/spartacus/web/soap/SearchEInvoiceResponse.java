
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchEInvoiceResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfDocumentKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchEInvoiceResult"
})
@XmlRootElement(name = "SearchEInvoiceResponse")
public class SearchEInvoiceResponse {

    @XmlElement(name = "SearchEInvoiceResult")
    protected ArrayOfDocumentKey searchEInvoiceResult;

    /**
     * Gets the value of the searchEInvoiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentKey }
     *     
     */
    public ArrayOfDocumentKey getSearchEInvoiceResult() {
        return searchEInvoiceResult;
    }

    /**
     * Sets the value of the searchEInvoiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentKey }
     *     
     */
    public void setSearchEInvoiceResult(ArrayOfDocumentKey value) {
        this.searchEInvoiceResult = value;
    }

}
