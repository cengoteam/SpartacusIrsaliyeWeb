
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
 *         &lt;element name="UploadUbltrWithPDFLayoutResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}UploadResult" minOccurs="0"/&gt;
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
    "uploadUbltrWithPDFLayoutResult"
})
@XmlRootElement(name = "UploadUbltrWithPDFLayoutResponse")
public class UploadUbltrWithPDFLayoutResponse {

    @XmlElement(name = "UploadUbltrWithPDFLayoutResult")
    protected UploadResult uploadUbltrWithPDFLayoutResult;

    /**
     * Gets the value of the uploadUbltrWithPDFLayoutResult property.
     * 
     * @return
     *     possible object is
     *     {@link UploadResult }
     *     
     */
    public UploadResult getUploadUbltrWithPDFLayoutResult() {
        return uploadUbltrWithPDFLayoutResult;
    }

    /**
     * Sets the value of the uploadUbltrWithPDFLayoutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadResult }
     *     
     */
    public void setUploadUbltrWithPDFLayoutResult(UploadResult value) {
        this.uploadUbltrWithPDFLayoutResult = value;
    }

}
