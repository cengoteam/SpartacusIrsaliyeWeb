
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EArchiveStatusWithObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EArchiveStatusWithObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetleFaturaObj" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}NetleEFatura" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}EArchiveStatus" minOccurs="0"/&gt;
 *         &lt;element name="SignedXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EArchiveStatusWithObject", propOrder = {
    "netleFaturaObj",
    "status",
    "signedXml"
})
public class EArchiveStatusWithObject {

    @XmlElement(name = "NetleFaturaObj")
    protected NetleEFatura netleFaturaObj;
    @XmlElement(name = "Status")
    protected EArchiveStatus status;
    @XmlElement(name = "SignedXml")
    protected String signedXml;

    /**
     * Gets the value of the netleFaturaObj property.
     * 
     * @return
     *     possible object is
     *     {@link NetleEFatura }
     *     
     */
    public NetleEFatura getNetleFaturaObj() {
        return netleFaturaObj;
    }

    /**
     * Sets the value of the netleFaturaObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetleEFatura }
     *     
     */
    public void setNetleFaturaObj(NetleEFatura value) {
        this.netleFaturaObj = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EArchiveStatus }
     *     
     */
    public EArchiveStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EArchiveStatus }
     *     
     */
    public void setStatus(EArchiveStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the signedXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedXml() {
        return signedXml;
    }

    /**
     * Sets the value of the signedXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedXml(String value) {
        this.signedXml = value;
    }

}
