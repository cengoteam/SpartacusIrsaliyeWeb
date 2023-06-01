
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
 *         &lt;element name="GetCommonDocumentPDFByUUIDsResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfUbltrPDFOutput" minOccurs="0"/&gt;
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
    "getCommonDocumentPDFByUUIDsResult"
})
@XmlRootElement(name = "GetCommonDocumentPDFByUUIDsResponse")
public class GetCommonDocumentPDFByUUIDsResponse {

    @XmlElement(name = "GetCommonDocumentPDFByUUIDsResult")
    protected ArrayOfUbltrPDFOutput getCommonDocumentPDFByUUIDsResult;

    /**
     * Gets the value of the getCommonDocumentPDFByUUIDsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUbltrPDFOutput }
     *     
     */
    public ArrayOfUbltrPDFOutput getGetCommonDocumentPDFByUUIDsResult() {
        return getCommonDocumentPDFByUUIDsResult;
    }

    /**
     * Sets the value of the getCommonDocumentPDFByUUIDsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUbltrPDFOutput }
     *     
     */
    public void setGetCommonDocumentPDFByUUIDsResult(ArrayOfUbltrPDFOutput value) {
        this.getCommonDocumentPDFByUUIDsResult = value;
    }

}
