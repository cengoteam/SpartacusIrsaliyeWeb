
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
 *         &lt;element name="SendEmailByUUIDResult" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
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
    "sendEmailByUUIDResult"
})
@XmlRootElement(name = "SendEmailByUUIDResponse")
public class SendEmailByUUIDResponse {

    @XmlElement(name = "SendEmailByUUIDResult", required = true)
    protected String sendEmailByUUIDResult;

    /**
     * Gets the value of the sendEmailByUUIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendEmailByUUIDResult() {
        return sendEmailByUUIDResult;
    }

    /**
     * Sets the value of the sendEmailByUUIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendEmailByUUIDResult(String value) {
        this.sendEmailByUUIDResult = value;
    }

}
