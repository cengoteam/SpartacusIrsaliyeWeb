
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
 *         &lt;element name="AcceptInvoiceDocumentResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}SoapExceptionDetail" minOccurs="0"/&gt;
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
    "acceptInvoiceDocumentResult"
})
@XmlRootElement(name = "AcceptInvoiceDocumentResponse")
public class AcceptInvoiceDocumentResponse {

    @XmlElement(name = "AcceptInvoiceDocumentResult")
    protected SoapExceptionDetail acceptInvoiceDocumentResult;

    /**
     * Gets the value of the acceptInvoiceDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link SoapExceptionDetail }
     *     
     */
    public SoapExceptionDetail getAcceptInvoiceDocumentResult() {
        return acceptInvoiceDocumentResult;
    }

    /**
     * Sets the value of the acceptInvoiceDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapExceptionDetail }
     *     
     */
    public void setAcceptInvoiceDocumentResult(SoapExceptionDetail value) {
        this.acceptInvoiceDocumentResult = value;
    }

}
