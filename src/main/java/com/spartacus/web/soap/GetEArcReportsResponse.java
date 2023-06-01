
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
 *         &lt;element name="GetEArcReportsResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfEArchiveLegalReport" minOccurs="0"/&gt;
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
    "getEArcReportsResult"
})
@XmlRootElement(name = "GetEArcReportsResponse")
public class GetEArcReportsResponse {

    @XmlElement(name = "GetEArcReportsResult")
    protected ArrayOfEArchiveLegalReport getEArcReportsResult;

    /**
     * Gets the value of the getEArcReportsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEArchiveLegalReport }
     *     
     */
    public ArrayOfEArchiveLegalReport getGetEArcReportsResult() {
        return getEArcReportsResult;
    }

    /**
     * Sets the value of the getEArcReportsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEArchiveLegalReport }
     *     
     */
    public void setGetEArcReportsResult(ArrayOfEArchiveLegalReport value) {
        this.getEArcReportsResult = value;
    }

}
