
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchDocumentOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchDocumentOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DocumentType" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}GetDocumentType"/&gt;
 *         &lt;element name="SenderIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecieverIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDirection" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}SearchDocumentDirection"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchDocumentOption", propOrder = {
    "startDateTime",
    "endDateTime",
    "documentType",
    "senderIdentifier",
    "recieverIdentifier",
    "lastDocumentId",
    "documentDirection"
})
public class SearchDocumentOption {

    @XmlElement(name = "StartDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "EndDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "DocumentType", required = true)
    @XmlSchemaType(name = "string")
    protected GetDocumentType documentType;
    @XmlElement(name = "SenderIdentifier")
    protected String senderIdentifier;
    @XmlElement(name = "RecieverIdentifier")
    protected String recieverIdentifier;
    @XmlElement(name = "LastDocumentId")
    protected String lastDocumentId;
    @XmlElement(name = "DocumentDirection", required = true)
    @XmlSchemaType(name = "string")
    protected SearchDocumentDirection documentDirection;

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link GetDocumentType }
     *     
     */
    public GetDocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDocumentType }
     *     
     */
    public void setDocumentType(GetDocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the senderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderIdentifier() {
        return senderIdentifier;
    }

    /**
     * Sets the value of the senderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderIdentifier(String value) {
        this.senderIdentifier = value;
    }

    /**
     * Gets the value of the recieverIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieverIdentifier() {
        return recieverIdentifier;
    }

    /**
     * Sets the value of the recieverIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieverIdentifier(String value) {
        this.recieverIdentifier = value;
    }

    /**
     * Gets the value of the lastDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDocumentId() {
        return lastDocumentId;
    }

    /**
     * Sets the value of the lastDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDocumentId(String value) {
        this.lastDocumentId = value;
    }

    /**
     * Gets the value of the documentDirection property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDocumentDirection }
     *     
     */
    public SearchDocumentDirection getDocumentDirection() {
        return documentDirection;
    }

    /**
     * Sets the value of the documentDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDocumentDirection }
     *     
     */
    public void setDocumentDirection(SearchDocumentDirection value) {
        this.documentDirection = value;
    }

}
