
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
 *         &lt;element name="GetUserInfoByTaxIdResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfEInvoiceEnabledCompany" minOccurs="0"/&gt;
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
    "getUserInfoByTaxIdResult"
})
@XmlRootElement(name = "GetUserInfoByTaxIdResponse")
public class GetUserInfoByTaxIdResponse {

    @XmlElement(name = "GetUserInfoByTaxIdResult")
    protected ArrayOfEInvoiceEnabledCompany getUserInfoByTaxIdResult;

    /**
     * Gets the value of the getUserInfoByTaxIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEInvoiceEnabledCompany }
     *     
     */
    public ArrayOfEInvoiceEnabledCompany getGetUserInfoByTaxIdResult() {
        return getUserInfoByTaxIdResult;
    }

    /**
     * Sets the value of the getUserInfoByTaxIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEInvoiceEnabledCompany }
     *     
     */
    public void setGetUserInfoByTaxIdResult(ArrayOfEInvoiceEnabledCompany value) {
        this.getUserInfoByTaxIdResult = value;
    }

}
