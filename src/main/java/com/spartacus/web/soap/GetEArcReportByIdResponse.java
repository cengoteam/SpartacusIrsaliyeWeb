
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
 *         &lt;element name="GetEArcReportByIdResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}EArchiveLegalReportData" minOccurs="0"/&gt;
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
    "getEArcReportByIdResult"
})
@XmlRootElement(name = "GetEArcReportByIdResponse")
public class GetEArcReportByIdResponse {

    @XmlElement(name = "GetEArcReportByIdResult")
    protected EArchiveLegalReportData getEArcReportByIdResult;

    /**
     * Gets the value of the getEArcReportByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link EArchiveLegalReportData }
     *     
     */
    public EArchiveLegalReportData getGetEArcReportByIdResult() {
        return getEArcReportByIdResult;
    }

    /**
     * Sets the value of the getEArcReportByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EArchiveLegalReportData }
     *     
     */
    public void setGetEArcReportByIdResult(EArchiveLegalReportData value) {
        this.getEArcReportByIdResult = value;
    }

}
