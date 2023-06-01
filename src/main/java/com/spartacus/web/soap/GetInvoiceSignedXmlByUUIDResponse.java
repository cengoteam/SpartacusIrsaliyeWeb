
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
 *         &lt;element name="GetInvoiceSignedXmlByUUIDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getInvoiceSignedXmlByUUIDResult"
})
@XmlRootElement(name = "GetInvoiceSignedXmlByUUIDResponse")
public class GetInvoiceSignedXmlByUUIDResponse {

    @XmlElement(name = "GetInvoiceSignedXmlByUUIDResult")
    protected String getInvoiceSignedXmlByUUIDResult;

    /**
     * Gets the value of the getInvoiceSignedXmlByUUIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetInvoiceSignedXmlByUUIDResult() {
        return getInvoiceSignedXmlByUUIDResult;
    }

    /**
     * Sets the value of the getInvoiceSignedXmlByUUIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetInvoiceSignedXmlByUUIDResult(String value) {
        this.getInvoiceSignedXmlByUUIDResult = value;
    }

}
