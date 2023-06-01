
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
 *         &lt;element name="GetEArchiveStatusResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}EArchiveStatus" minOccurs="0"/&gt;
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
    "getEArchiveStatusResult"
})
@XmlRootElement(name = "GetEArchiveStatusResponse")
public class GetEArchiveStatusResponse {

    @XmlElement(name = "GetEArchiveStatusResult")
    protected EArchiveStatus getEArchiveStatusResult;

    /**
     * Gets the value of the getEArchiveStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link EArchiveStatus }
     *     
     */
    public EArchiveStatus getGetEArchiveStatusResult() {
        return getEArchiveStatusResult;
    }

    /**
     * Sets the value of the getEArchiveStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EArchiveStatus }
     *     
     */
    public void setGetEArchiveStatusResult(EArchiveStatus value) {
        this.getEArchiveStatusResult = value;
    }

}
