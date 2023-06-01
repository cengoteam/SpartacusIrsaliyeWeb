
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
 *         &lt;element name="SEDP_GetDocumentResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfNDocument" minOccurs="0"/&gt;
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
    "sedpGetDocumentResult"
})
@XmlRootElement(name = "SEDP_GetDocumentResponse")
public class SEDPGetDocumentResponse {

    @XmlElement(name = "SEDP_GetDocumentResult")
    protected ArrayOfNDocument sedpGetDocumentResult;

    /**
     * Gets the value of the sedpGetDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNDocument }
     *     
     */
    public ArrayOfNDocument getSEDPGetDocumentResult() {
        return sedpGetDocumentResult;
    }

    /**
     * Sets the value of the sedpGetDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNDocument }
     *     
     */
    public void setSEDPGetDocumentResult(ArrayOfNDocument value) {
        this.sedpGetDocumentResult = value;
    }

}
