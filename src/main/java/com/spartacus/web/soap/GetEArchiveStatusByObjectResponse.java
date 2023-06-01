
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
 *         &lt;element name="GetEArchiveStatusByObjectResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}EArchiveStatusWithObject" minOccurs="0"/&gt;
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
    "getEArchiveStatusByObjectResult"
})
@XmlRootElement(name = "GetEArchiveStatusByObjectResponse")
public class GetEArchiveStatusByObjectResponse {

    @XmlElement(name = "GetEArchiveStatusByObjectResult")
    protected EArchiveStatusWithObject getEArchiveStatusByObjectResult;

    /**
     * Gets the value of the getEArchiveStatusByObjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link EArchiveStatusWithObject }
     *     
     */
    public EArchiveStatusWithObject getGetEArchiveStatusByObjectResult() {
        return getEArchiveStatusByObjectResult;
    }

    /**
     * Sets the value of the getEArchiveStatusByObjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EArchiveStatusWithObject }
     *     
     */
    public void setGetEArchiveStatusByObjectResult(EArchiveStatusWithObject value) {
        this.getEArchiveStatusByObjectResult = value;
    }

}
