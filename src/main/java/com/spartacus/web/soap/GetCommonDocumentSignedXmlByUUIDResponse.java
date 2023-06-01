
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
 *         &lt;element name="GetCommonDocumentSignedXmlByUUIDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getCommonDocumentSignedXmlByUUIDResult"
})
@XmlRootElement(name = "GetCommonDocumentSignedXmlByUUIDResponse")
public class GetCommonDocumentSignedXmlByUUIDResponse {

    @XmlElement(name = "GetCommonDocumentSignedXmlByUUIDResult")
    protected String getCommonDocumentSignedXmlByUUIDResult;

    /**
     * Gets the value of the getCommonDocumentSignedXmlByUUIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCommonDocumentSignedXmlByUUIDResult() {
        return getCommonDocumentSignedXmlByUUIDResult;
    }

    /**
     * Sets the value of the getCommonDocumentSignedXmlByUUIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCommonDocumentSignedXmlByUUIDResult(String value) {
        this.getCommonDocumentSignedXmlByUUIDResult = value;
    }

}
