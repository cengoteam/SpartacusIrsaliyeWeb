
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
 *         &lt;element name="GetCommonUserListAsZIPResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "getCommonUserListAsZIPResult"
})
@XmlRootElement(name = "GetCommonUserListAsZIPResponse")
public class GetCommonUserListAsZIPResponse {

    @XmlElement(name = "GetCommonUserListAsZIPResult")
    protected byte[] getCommonUserListAsZIPResult;

    /**
     * Gets the value of the getCommonUserListAsZIPResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetCommonUserListAsZIPResult() {
        return getCommonUserListAsZIPResult;
    }

    /**
     * Sets the value of the getCommonUserListAsZIPResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetCommonUserListAsZIPResult(byte[] value) {
        this.getCommonUserListAsZIPResult = value;
    }

}
