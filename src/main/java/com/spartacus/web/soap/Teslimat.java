
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Teslimat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Teslimat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tasiyici" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}Taraf" minOccurs="0"/&gt;
 *         &lt;element name="FiiliSevkTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GerceklesenTeslimTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TeslimatYapilacak" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}Taraf" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Teslimat", propOrder = {
    "tasiyici",
    "fiiliSevkTarihi",
    "gerceklesenTeslimTarihi",
    "teslimatYapilacak"
})
public class Teslimat {

    @XmlElement(name = "Tasiyici")
    protected Taraf tasiyici;
    @XmlElement(name = "FiiliSevkTarihi", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fiiliSevkTarihi;
    @XmlElement(name = "GerceklesenTeslimTarihi", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gerceklesenTeslimTarihi;
    @XmlElement(name = "TeslimatYapilacak")
    protected Taraf teslimatYapilacak;

    /**
     * Gets the value of the tasiyici property.
     * 
     * @return
     *     possible object is
     *     {@link Taraf }
     *     
     */
    public Taraf getTasiyici() {
        return tasiyici;
    }

    /**
     * Sets the value of the tasiyici property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taraf }
     *     
     */
    public void setTasiyici(Taraf value) {
        this.tasiyici = value;
    }

    /**
     * Gets the value of the fiiliSevkTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFiiliSevkTarihi() {
        return fiiliSevkTarihi;
    }

    /**
     * Sets the value of the fiiliSevkTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFiiliSevkTarihi(XMLGregorianCalendar value) {
        this.fiiliSevkTarihi = value;
    }

    /**
     * Gets the value of the gerceklesenTeslimTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGerceklesenTeslimTarihi() {
        return gerceklesenTeslimTarihi;
    }

    /**
     * Sets the value of the gerceklesenTeslimTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGerceklesenTeslimTarihi(XMLGregorianCalendar value) {
        this.gerceklesenTeslimTarihi = value;
    }

    /**
     * Gets the value of the teslimatYapilacak property.
     * 
     * @return
     *     possible object is
     *     {@link Taraf }
     *     
     */
    public Taraf getTeslimatYapilacak() {
        return teslimatYapilacak;
    }

    /**
     * Sets the value of the teslimatYapilacak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taraf }
     *     
     */
    public void setTeslimatYapilacak(Taraf value) {
        this.teslimatYapilacak = value;
    }

}
