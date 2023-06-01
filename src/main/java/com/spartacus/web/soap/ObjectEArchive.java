
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
 *         &lt;element name="userToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eArchiveUUID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="objectionDocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectionMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "userToken",
    "eArchiveUUID",
    "objectionDocNumber",
    "objectionMethod",
    "objectionReason"
})
@XmlRootElement(name = "ObjectEArchive")
public class ObjectEArchive {

    protected String userToken;
    @XmlElement(required = true)
    protected String eArchiveUUID;
    protected String objectionDocNumber;
    protected String objectionMethod;
    protected String objectionReason;

    /**
     * Gets the value of the userToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserToken() {
        return userToken;
    }

    /**
     * Sets the value of the userToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserToken(String value) {
        this.userToken = value;
    }

    /**
     * Gets the value of the eArchiveUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEArchiveUUID() {
        return eArchiveUUID;
    }

    /**
     * Sets the value of the eArchiveUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEArchiveUUID(String value) {
        this.eArchiveUUID = value;
    }

    /**
     * Gets the value of the objectionDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectionDocNumber() {
        return objectionDocNumber;
    }

    /**
     * Sets the value of the objectionDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectionDocNumber(String value) {
        this.objectionDocNumber = value;
    }

    /**
     * Gets the value of the objectionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectionMethod() {
        return objectionMethod;
    }

    /**
     * Sets the value of the objectionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectionMethod(String value) {
        this.objectionMethod = value;
    }

    /**
     * Gets the value of the objectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectionReason() {
        return objectionReason;
    }

    /**
     * Sets the value of the objectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectionReason(String value) {
        this.objectionReason = value;
    }

}
