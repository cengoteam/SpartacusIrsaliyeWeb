
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
 *         &lt;element name="CheckSystemResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}CheckSystemResult" minOccurs="0"/&gt;
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
    "checkSystemResult"
})
@XmlRootElement(name = "CheckSystemResponse")
public class CheckSystemResponse {

    @XmlElement(name = "CheckSystemResult")
    protected CheckSystemResult checkSystemResult;

    /**
     * Gets the value of the checkSystemResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckSystemResult }
     *     
     */
    public CheckSystemResult getCheckSystemResult() {
        return checkSystemResult;
    }

    /**
     * Sets the value of the checkSystemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckSystemResult }
     *     
     */
    public void setCheckSystemResult(CheckSystemResult value) {
        this.checkSystemResult = value;
    }

}
