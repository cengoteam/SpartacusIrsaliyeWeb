
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
 *         &lt;element name="GetInvoiceHtmlByUUIDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getInvoiceHtmlByUUIDResult"
})
@XmlRootElement(name = "GetInvoiceHtmlByUUIDResponse")
public class GetInvoiceHtmlByUUIDResponse {

    @XmlElement(name = "GetInvoiceHtmlByUUIDResult")
    protected String getInvoiceHtmlByUUIDResult;

    /**
     * Gets the value of the getInvoiceHtmlByUUIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetInvoiceHtmlByUUIDResult() {
        return getInvoiceHtmlByUUIDResult;
    }

    /**
     * Sets the value of the getInvoiceHtmlByUUIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetInvoiceHtmlByUUIDResult(String value) {
        this.getInvoiceHtmlByUUIDResult = value;
    }

}
