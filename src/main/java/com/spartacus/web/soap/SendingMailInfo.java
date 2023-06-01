
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SendingMailInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendingMailInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="To" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfToMailAddress" minOccurs="0"/&gt;
 *         &lt;element name="CC" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfCCMailAddress" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BodyAsHtml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendingMailInfo", propOrder = {
    "to",
    "cc",
    "subject",
    "bodyAsHtml"
})
@XmlSeeAlso({
    InvoiceSendingMailInfo.class
})
public class SendingMailInfo {

    @XmlElement(name = "To")
    protected ArrayOfToMailAddress to;
    @XmlElement(name = "CC")
    protected ArrayOfCCMailAddress cc;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "BodyAsHtml")
    protected String bodyAsHtml;

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfToMailAddress }
     *     
     */
    public ArrayOfToMailAddress getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfToMailAddress }
     *     
     */
    public void setTo(ArrayOfToMailAddress value) {
        this.to = value;
    }

    /**
     * Gets the value of the cc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCCMailAddress }
     *     
     */
    public ArrayOfCCMailAddress getCC() {
        return cc;
    }

    /**
     * Sets the value of the cc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCCMailAddress }
     *     
     */
    public void setCC(ArrayOfCCMailAddress value) {
        this.cc = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the bodyAsHtml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyAsHtml() {
        return bodyAsHtml;
    }

    /**
     * Sets the value of the bodyAsHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyAsHtml(String value) {
        this.bodyAsHtml = value;
    }

}
