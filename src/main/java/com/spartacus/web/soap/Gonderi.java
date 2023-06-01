
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gonderi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Gonderi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KargoNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UrunToplamTutar" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="GonderiFazlari" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfGonderiFazi" minOccurs="0"/&gt;
 *         &lt;element name="Teslimat" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}Teslimat" minOccurs="0"/&gt;
 *         &lt;element name="TasimaUniteleri" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfTasimaUnitesi" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gonderi", propOrder = {
    "kargoNo",
    "urunToplamTutar",
    "gonderiFazlari",
    "teslimat",
    "tasimaUniteleri"
})
public class Gonderi {

    @XmlElement(name = "KargoNo")
    protected String kargoNo;
    @XmlElement(name = "UrunToplamTutar")
    protected double urunToplamTutar;
    @XmlElement(name = "GonderiFazlari")
    protected ArrayOfGonderiFazi gonderiFazlari;
    @XmlElement(name = "Teslimat")
    protected Teslimat teslimat;
    @XmlElement(name = "TasimaUniteleri")
    protected ArrayOfTasimaUnitesi tasimaUniteleri;

    /**
     * Gets the value of the kargoNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKargoNo() {
        return kargoNo;
    }

    /**
     * Sets the value of the kargoNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKargoNo(String value) {
        this.kargoNo = value;
    }

    /**
     * Gets the value of the urunToplamTutar property.
     * 
     */
    public double getUrunToplamTutar() {
        return urunToplamTutar;
    }

    /**
     * Sets the value of the urunToplamTutar property.
     * 
     */
    public void setUrunToplamTutar(double value) {
        this.urunToplamTutar = value;
    }

    /**
     * Gets the value of the gonderiFazlari property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGonderiFazi }
     *     
     */
    public ArrayOfGonderiFazi getGonderiFazlari() {
        return gonderiFazlari;
    }

    /**
     * Sets the value of the gonderiFazlari property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGonderiFazi }
     *     
     */
    public void setGonderiFazlari(ArrayOfGonderiFazi value) {
        this.gonderiFazlari = value;
    }

    /**
     * Gets the value of the teslimat property.
     * 
     * @return
     *     possible object is
     *     {@link Teslimat }
     *     
     */
    public Teslimat getTeslimat() {
        return teslimat;
    }

    /**
     * Sets the value of the teslimat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Teslimat }
     *     
     */
    public void setTeslimat(Teslimat value) {
        this.teslimat = value;
    }

    /**
     * Gets the value of the tasimaUniteleri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTasimaUnitesi }
     *     
     */
    public ArrayOfTasimaUnitesi getTasimaUniteleri() {
        return tasimaUniteleri;
    }

    /**
     * Sets the value of the tasimaUniteleri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTasimaUnitesi }
     *     
     */
    public void setTasimaUniteleri(ArrayOfTasimaUnitesi value) {
        this.tasimaUniteleri = value;
    }

}
