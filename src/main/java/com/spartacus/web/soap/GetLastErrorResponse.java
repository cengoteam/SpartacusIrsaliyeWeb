
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
 *         &lt;element name="GetLastErrorResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}SoapExceptionDetail" minOccurs="0"/&gt;
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
    "getLastErrorResult"
})
@XmlRootElement(name = "GetLastErrorResponse")
public class GetLastErrorResponse {

    @XmlElement(name = "GetLastErrorResult")
    protected SoapExceptionDetail getLastErrorResult;

    /**
     * Gets the value of the getLastErrorResult property.
     * 
     * @return
     *     possible object is
     *     {@link SoapExceptionDetail }
     *     
     */
    public SoapExceptionDetail getGetLastErrorResult() {
        return getLastErrorResult;
    }

    /**
     * Sets the value of the getLastErrorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapExceptionDetail }
     *     
     */
    public void setGetLastErrorResult(SoapExceptionDetail value) {
        this.getLastErrorResult = value;
    }

}
