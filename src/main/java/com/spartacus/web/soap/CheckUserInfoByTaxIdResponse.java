
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
 *         &lt;element name="CheckUserInfoByTaxIdResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "checkUserInfoByTaxIdResult"
})
@XmlRootElement(name = "CheckUserInfoByTaxIdResponse")
public class CheckUserInfoByTaxIdResponse {

    @XmlElement(name = "CheckUserInfoByTaxIdResult")
    protected boolean checkUserInfoByTaxIdResult;

    /**
     * Gets the value of the checkUserInfoByTaxIdResult property.
     * 
     */
    public boolean isCheckUserInfoByTaxIdResult() {
        return checkUserInfoByTaxIdResult;
    }

    /**
     * Sets the value of the checkUserInfoByTaxIdResult property.
     * 
     */
    public void setCheckUserInfoByTaxIdResult(boolean value) {
        this.checkUserInfoByTaxIdResult = value;
    }

}
