
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
 *         &lt;element name="GetExportInvoiceHtmlByUUIDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getExportInvoiceHtmlByUUIDResult"
})
@XmlRootElement(name = "GetExportInvoiceHtmlByUUIDResponse")
public class GetExportInvoiceHtmlByUUIDResponse {

    @XmlElement(name = "GetExportInvoiceHtmlByUUIDResult")
    protected String getExportInvoiceHtmlByUUIDResult;

    /**
     * Gets the value of the getExportInvoiceHtmlByUUIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetExportInvoiceHtmlByUUIDResult() {
        return getExportInvoiceHtmlByUUIDResult;
    }

    /**
     * Sets the value of the getExportInvoiceHtmlByUUIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetExportInvoiceHtmlByUUIDResult(String value) {
        this.getExportInvoiceHtmlByUUIDResult = value;
    }

}
