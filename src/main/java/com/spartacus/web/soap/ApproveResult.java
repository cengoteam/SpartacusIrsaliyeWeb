
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ApproveResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApproveResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserApproveType" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ApproveType"/&gt;
 *         &lt;element name="ProcessTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproveResult", propOrder = {
    "userApproveType",
    "processTime",
    "reasonDescription"
})
public class ApproveResult {

    @XmlElement(name = "UserApproveType", required = true)
    @XmlSchemaType(name = "string")
    protected ApproveType userApproveType;
    @XmlElement(name = "ProcessTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processTime;
    @XmlElement(name = "ReasonDescription")
    protected String reasonDescription;

    /**
     * Gets the value of the userApproveType property.
     * 
     * @return
     *     possible object is
     *     {@link ApproveType }
     *     
     */
    public ApproveType getUserApproveType() {
        return userApproveType;
    }

    /**
     * Sets the value of the userApproveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproveType }
     *     
     */
    public void setUserApproveType(ApproveType value) {
        this.userApproveType = value;
    }

    /**
     * Gets the value of the processTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessTime() {
        return processTime;
    }

    /**
     * Sets the value of the processTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessTime(XMLGregorianCalendar value) {
        this.processTime = value;
    }

    /**
     * Gets the value of the reasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDescription() {
        return reasonDescription;
    }

    /**
     * Sets the value of the reasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDescription(String value) {
        this.reasonDescription = value;
    }

}
