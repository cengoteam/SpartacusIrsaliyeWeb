
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FaturaDonemi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaturaDonemi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaslangicTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="BitisTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaturaDonemi", propOrder = {
    "baslangicTarihi",
    "bitisTarihi"
})
public class FaturaDonemi {

    @XmlElement(name = "BaslangicTarihi", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar baslangicTarihi;
    @XmlElement(name = "BitisTarihi", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bitisTarihi;

    /**
     * Gets the value of the baslangicTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBaslangicTarihi() {
        return baslangicTarihi;
    }

    /**
     * Sets the value of the baslangicTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBaslangicTarihi(XMLGregorianCalendar value) {
        this.baslangicTarihi = value;
    }

    /**
     * Gets the value of the bitisTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBitisTarihi() {
        return bitisTarihi;
    }

    /**
     * Sets the value of the bitisTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBitisTarihi(XMLGregorianCalendar value) {
        this.bitisTarihi = value;
    }

}
