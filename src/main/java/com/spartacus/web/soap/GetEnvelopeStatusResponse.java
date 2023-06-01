
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
 *         &lt;element name="GetEnvelopeStatusResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfEDocStatus" minOccurs="0"/&gt;
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
    "getEnvelopeStatusResult"
})
@XmlRootElement(name = "GetEnvelopeStatusResponse")
public class GetEnvelopeStatusResponse {

    @XmlElement(name = "GetEnvelopeStatusResult")
    protected ArrayOfEDocStatus getEnvelopeStatusResult;

    /**
     * Gets the value of the getEnvelopeStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEDocStatus }
     *     
     */
    public ArrayOfEDocStatus getGetEnvelopeStatusResult() {
        return getEnvelopeStatusResult;
    }

    /**
     * Sets the value of the getEnvelopeStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEDocStatus }
     *     
     */
    public void setGetEnvelopeStatusResult(ArrayOfEDocStatus value) {
        this.getEnvelopeStatusResult = value;
    }

}
