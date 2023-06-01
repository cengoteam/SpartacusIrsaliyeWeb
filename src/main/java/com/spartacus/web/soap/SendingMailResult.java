
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendingMailResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendingMailResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobId" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="JobState" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OK" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendingMailResult", propOrder = {
    "jobId",
    "jobState",
    "ok",
    "description"
})
public class SendingMailResult {

    @XmlElement(name = "JobId", required = true)
    protected String jobId;
    @XmlElement(name = "JobState")
    protected int jobState;
    @XmlElement(name = "OK")
    protected boolean ok;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the jobState property.
     * 
     */
    public int getJobState() {
        return jobState;
    }

    /**
     * Sets the value of the jobState property.
     * 
     */
    public void setJobState(int value) {
        this.jobState = value;
    }

    /**
     * Gets the value of the ok property.
     * 
     */
    public boolean isOK() {
        return ok;
    }

    /**
     * Sets the value of the ok property.
     * 
     */
    public void setOK(boolean value) {
        this.ok = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
