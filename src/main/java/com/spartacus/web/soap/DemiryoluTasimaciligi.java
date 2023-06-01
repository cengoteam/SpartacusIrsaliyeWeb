
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DemiryoluTasimaciligi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemiryoluTasimaciligi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrenNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VagonNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemiryoluTasimaciligi", propOrder = {
    "trenNo",
    "vagonNo"
})
public class DemiryoluTasimaciligi {

    @XmlElement(name = "TrenNo")
    protected String trenNo;
    @XmlElement(name = "VagonNo")
    protected String vagonNo;

    /**
     * Gets the value of the trenNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrenNo() {
        return trenNo;
    }

    /**
     * Sets the value of the trenNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrenNo(String value) {
        this.trenNo = value;
    }

    /**
     * Gets the value of the vagonNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVagonNo() {
        return vagonNo;
    }

    /**
     * Sets the value of the vagonNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVagonNo(String value) {
        this.vagonNo = value;
    }

}
