
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TasimaSekli complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TasimaSekli"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HavaTasimaciligi" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}HavaTasimaciligi" minOccurs="0"/&gt;
 *         &lt;element name="KarayoluTasimaciligi" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}KarayoluTasimaciligi" minOccurs="0"/&gt;
 *         &lt;element name="DemiryoluTasimaciligi" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}DemiryoluTasimaciligi" minOccurs="0"/&gt;
 *         &lt;element name="DenizTasimaciligi" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}DenizTasimaciligi" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TasimaSekli", propOrder = {
    "havaTasimaciligi",
    "karayoluTasimaciligi",
    "demiryoluTasimaciligi",
    "denizTasimaciligi"
})
public class TasimaSekli {

    @XmlElement(name = "HavaTasimaciligi")
    protected HavaTasimaciligi havaTasimaciligi;
    @XmlElement(name = "KarayoluTasimaciligi")
    protected KarayoluTasimaciligi karayoluTasimaciligi;
    @XmlElement(name = "DemiryoluTasimaciligi")
    protected DemiryoluTasimaciligi demiryoluTasimaciligi;
    @XmlElement(name = "DenizTasimaciligi")
    protected DenizTasimaciligi denizTasimaciligi;

    /**
     * Gets the value of the havaTasimaciligi property.
     * 
     * @return
     *     possible object is
     *     {@link HavaTasimaciligi }
     *     
     */
    public HavaTasimaciligi getHavaTasimaciligi() {
        return havaTasimaciligi;
    }

    /**
     * Sets the value of the havaTasimaciligi property.
     * 
     * @param value
     *     allowed object is
     *     {@link HavaTasimaciligi }
     *     
     */
    public void setHavaTasimaciligi(HavaTasimaciligi value) {
        this.havaTasimaciligi = value;
    }

    /**
     * Gets the value of the karayoluTasimaciligi property.
     * 
     * @return
     *     possible object is
     *     {@link KarayoluTasimaciligi }
     *     
     */
    public KarayoluTasimaciligi getKarayoluTasimaciligi() {
        return karayoluTasimaciligi;
    }

    /**
     * Sets the value of the karayoluTasimaciligi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KarayoluTasimaciligi }
     *     
     */
    public void setKarayoluTasimaciligi(KarayoluTasimaciligi value) {
        this.karayoluTasimaciligi = value;
    }

    /**
     * Gets the value of the demiryoluTasimaciligi property.
     * 
     * @return
     *     possible object is
     *     {@link DemiryoluTasimaciligi }
     *     
     */
    public DemiryoluTasimaciligi getDemiryoluTasimaciligi() {
        return demiryoluTasimaciligi;
    }

    /**
     * Sets the value of the demiryoluTasimaciligi property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemiryoluTasimaciligi }
     *     
     */
    public void setDemiryoluTasimaciligi(DemiryoluTasimaciligi value) {
        this.demiryoluTasimaciligi = value;
    }

    /**
     * Gets the value of the denizTasimaciligi property.
     * 
     * @return
     *     possible object is
     *     {@link DenizTasimaciligi }
     *     
     */
    public DenizTasimaciligi getDenizTasimaciligi() {
        return denizTasimaciligi;
    }

    /**
     * Sets the value of the denizTasimaciligi property.
     * 
     * @param value
     *     allowed object is
     *     {@link DenizTasimaciligi }
     *     
     */
    public void setDenizTasimaciligi(DenizTasimaciligi value) {
        this.denizTasimaciligi = value;
    }

}
