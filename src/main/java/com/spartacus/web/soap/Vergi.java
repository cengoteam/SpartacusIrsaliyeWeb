
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vergi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vergi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tur" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}TaxCodeContentType"/&gt;
 *         &lt;element name="Oran" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Tutar" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Matrah" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MuafiyetKodu" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}TaxExemptionReasonCodeContentType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vergi", propOrder = {
    "tur",
    "oran",
    "tutar",
    "matrah",
    "muafiyetNedeni",
    "muafiyetKodu"
})
public class Vergi {

    @XmlElement(name = "Tur", required = true)
    protected String tur;
    @XmlElement(name = "Oran")
    protected double oran;
    @XmlElement(name = "Tutar")
    protected double tutar;
    @XmlElement(name = "Matrah")
    protected double matrah;
    @XmlElement(name = "MuafiyetNedeni")
    protected String muafiyetNedeni;
    @XmlElement(name = "MuafiyetKodu", required = true)
    protected String muafiyetKodu;

    /**
     * Gets the value of the tur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTur() {
        return tur;
    }

    /**
     * Sets the value of the tur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTur(String value) {
        this.tur = value;
    }

    /**
     * Gets the value of the oran property.
     * 
     */
    public double getOran() {
        return oran;
    }

    /**
     * Sets the value of the oran property.
     * 
     */
    public void setOran(double value) {
        this.oran = value;
    }

    /**
     * Gets the value of the tutar property.
     * 
     */
    public double getTutar() {
        return tutar;
    }

    /**
     * Sets the value of the tutar property.
     * 
     */
    public void setTutar(double value) {
        this.tutar = value;
    }

    /**
     * Gets the value of the matrah property.
     * 
     */
    public double getMatrah() {
        return matrah;
    }

    /**
     * Sets the value of the matrah property.
     * 
     */
    public void setMatrah(double value) {
        this.matrah = value;
    }

    /**
     * Gets the value of the muafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuafiyetNedeni() {
        return muafiyetNedeni;
    }

    /**
     * Sets the value of the muafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuafiyetNedeni(String value) {
        this.muafiyetNedeni = value;
    }

    /**
     * Gets the value of the muafiyetKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuafiyetKodu() {
        return muafiyetKodu;
    }

    /**
     * Sets the value of the muafiyetKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuafiyetKodu(String value) {
        this.muafiyetKodu = value;
    }

}
