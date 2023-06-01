
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sahis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sahis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Soyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Unvan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Uyruk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankaHesap" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}BankaHesap" minOccurs="0"/&gt;
 *         &lt;element name="Pasaport" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}Pasaport" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sahis", propOrder = {
    "ad",
    "soyad",
    "unvan",
    "uyruk",
    "bankaHesap",
    "pasaport"
})
public class Sahis {

    @XmlElement(name = "Ad")
    protected String ad;
    @XmlElement(name = "Soyad")
    protected String soyad;
    @XmlElement(name = "Unvan")
    protected String unvan;
    @XmlElement(name = "Uyruk")
    protected String uyruk;
    @XmlElement(name = "BankaHesap")
    protected BankaHesap bankaHesap;
    @XmlElement(name = "Pasaport")
    protected Pasaport pasaport;

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAd(String value) {
        this.ad = value;
    }

    /**
     * Gets the value of the soyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * Sets the value of the soyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoyad(String value) {
        this.soyad = value;
    }

    /**
     * Gets the value of the unvan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnvan() {
        return unvan;
    }

    /**
     * Sets the value of the unvan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnvan(String value) {
        this.unvan = value;
    }

    /**
     * Gets the value of the uyruk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUyruk() {
        return uyruk;
    }

    /**
     * Sets the value of the uyruk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUyruk(String value) {
        this.uyruk = value;
    }

    /**
     * Gets the value of the bankaHesap property.
     * 
     * @return
     *     possible object is
     *     {@link BankaHesap }
     *     
     */
    public BankaHesap getBankaHesap() {
        return bankaHesap;
    }

    /**
     * Sets the value of the bankaHesap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankaHesap }
     *     
     */
    public void setBankaHesap(BankaHesap value) {
        this.bankaHesap = value;
    }

    /**
     * Gets the value of the pasaport property.
     * 
     * @return
     *     possible object is
     *     {@link Pasaport }
     *     
     */
    public Pasaport getPasaport() {
        return pasaport;
    }

    /**
     * Sets the value of the pasaport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pasaport }
     *     
     */
    public void setPasaport(Pasaport value) {
        this.pasaport = value;
    }

}
