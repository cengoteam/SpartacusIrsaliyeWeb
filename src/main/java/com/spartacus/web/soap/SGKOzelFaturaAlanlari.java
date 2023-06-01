
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SGKOzelFaturaAlanlari complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SGKOzelFaturaAlanlari"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IlaveFaturaTipi" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}SGKIlaveFaturaTipi"/&gt;
 *         &lt;element name="MukellefKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MukellefAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DosyaNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaturaDonemi" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}FaturaDonemi" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SGKOzelFaturaAlanlari", propOrder = {
    "ilaveFaturaTipi",
    "mukellefKodu",
    "mukellefAdi",
    "dosyaNo",
    "faturaDonemi"
})
public class SGKOzelFaturaAlanlari {

    @XmlElement(name = "IlaveFaturaTipi", required = true)
    @XmlSchemaType(name = "string")
    protected SGKIlaveFaturaTipi ilaveFaturaTipi;
    @XmlElement(name = "MukellefKodu")
    protected String mukellefKodu;
    @XmlElement(name = "MukellefAdi")
    protected String mukellefAdi;
    @XmlElement(name = "DosyaNo")
    protected String dosyaNo;
    @XmlElement(name = "FaturaDonemi")
    protected FaturaDonemi faturaDonemi;

    /**
     * Gets the value of the ilaveFaturaTipi property.
     * 
     * @return
     *     possible object is
     *     {@link SGKIlaveFaturaTipi }
     *     
     */
    public SGKIlaveFaturaTipi getIlaveFaturaTipi() {
        return ilaveFaturaTipi;
    }

    /**
     * Sets the value of the ilaveFaturaTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link SGKIlaveFaturaTipi }
     *     
     */
    public void setIlaveFaturaTipi(SGKIlaveFaturaTipi value) {
        this.ilaveFaturaTipi = value;
    }

    /**
     * Gets the value of the mukellefKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMukellefKodu() {
        return mukellefKodu;
    }

    /**
     * Sets the value of the mukellefKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMukellefKodu(String value) {
        this.mukellefKodu = value;
    }

    /**
     * Gets the value of the mukellefAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMukellefAdi() {
        return mukellefAdi;
    }

    /**
     * Sets the value of the mukellefAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMukellefAdi(String value) {
        this.mukellefAdi = value;
    }

    /**
     * Gets the value of the dosyaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosyaNo() {
        return dosyaNo;
    }

    /**
     * Sets the value of the dosyaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosyaNo(String value) {
        this.dosyaNo = value;
    }

    /**
     * Gets the value of the faturaDonemi property.
     * 
     * @return
     *     possible object is
     *     {@link FaturaDonemi }
     *     
     */
    public FaturaDonemi getFaturaDonemi() {
        return faturaDonemi;
    }

    /**
     * Sets the value of the faturaDonemi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaturaDonemi }
     *     
     */
    public void setFaturaDonemi(FaturaDonemi value) {
        this.faturaDonemi = value;
    }

}
