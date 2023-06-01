
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DenizTasimaciligi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DenizTasimaciligi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IMONo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GemiAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DenizTasimaciligi", propOrder = {
    "imoNo",
    "gemiAdi"
})
public class DenizTasimaciligi {

    @XmlElement(name = "IMONo")
    protected String imoNo;
    @XmlElement(name = "GemiAdi")
    protected String gemiAdi;

    /**
     * Gets the value of the imoNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMONo() {
        return imoNo;
    }

    /**
     * Sets the value of the imoNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMONo(String value) {
        this.imoNo = value;
    }

    /**
     * Gets the value of the gemiAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemiAdi() {
        return gemiAdi;
    }

    /**
     * Sets the value of the gemiAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemiAdi(String value) {
        this.gemiAdi = value;
    }

}
