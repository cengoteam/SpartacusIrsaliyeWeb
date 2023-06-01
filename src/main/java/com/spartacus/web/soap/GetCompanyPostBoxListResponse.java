
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
 *         &lt;element name="GetCompanyPostBoxListResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfCompanyInformation" minOccurs="0"/&gt;
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
    "getCompanyPostBoxListResult"
})
@XmlRootElement(name = "GetCompanyPostBoxListResponse")
public class GetCompanyPostBoxListResponse {

    @XmlElement(name = "GetCompanyPostBoxListResult")
    protected ArrayOfCompanyInformation getCompanyPostBoxListResult;

    /**
     * Gets the value of the getCompanyPostBoxListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyInformation }
     *     
     */
    public ArrayOfCompanyInformation getGetCompanyPostBoxListResult() {
        return getCompanyPostBoxListResult;
    }

    /**
     * Sets the value of the getCompanyPostBoxListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyInformation }
     *     
     */
    public void setGetCompanyPostBoxListResult(ArrayOfCompanyInformation value) {
        this.getCompanyPostBoxListResult = value;
    }

}
