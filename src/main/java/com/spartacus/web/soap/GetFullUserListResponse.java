
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
 *         &lt;element name="GetFullUserListResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfEInvoiceEnabledCompany" minOccurs="0"/&gt;
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
    "getFullUserListResult"
})
@XmlRootElement(name = "GetFullUserListResponse")
public class GetFullUserListResponse {

    @XmlElement(name = "GetFullUserListResult")
    protected ArrayOfEInvoiceEnabledCompany getFullUserListResult;

    /**
     * Gets the value of the getFullUserListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEInvoiceEnabledCompany }
     *     
     */
    public ArrayOfEInvoiceEnabledCompany getGetFullUserListResult() {
        return getFullUserListResult;
    }

    /**
     * Sets the value of the getFullUserListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEInvoiceEnabledCompany }
     *     
     */
    public void setGetFullUserListResult(ArrayOfEInvoiceEnabledCompany value) {
        this.getFullUserListResult = value;
    }

}
