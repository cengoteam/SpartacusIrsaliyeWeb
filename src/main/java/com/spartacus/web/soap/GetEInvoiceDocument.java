
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="documentKeys" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfDocumentKey" minOccurs="0"/&gt;
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
    "documentKeys"
})
@XmlRootElement(name = "GetEInvoiceDocument")
public class GetEInvoiceDocument {

    protected String userToken;
    protected ArrayOfDocumentKey documentKeys;

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
     * Gets the value of the documentKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentKey }
     *     
     */
    public ArrayOfDocumentKey getDocumentKeys() {
        return documentKeys;
    }

    /**
     * Sets the value of the documentKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentKey }
     *     
     */
    public void setDocumentKeys(ArrayOfDocumentKey value) {
        this.documentKeys = value;
    }

}
