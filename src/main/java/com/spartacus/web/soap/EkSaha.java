
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EkSaha complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EkSaha"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Anahtar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Deger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EkSaha", propOrder = {
    "anahtar",
    "deger"
})
public class EkSaha {

    @XmlElement(name = "Anahtar")
    protected String anahtar;
    @XmlElement(name = "Deger")
    protected String deger;

    /**
     * Gets the value of the anahtar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnahtar() {
        return anahtar;
    }

    /**
     * Sets the value of the anahtar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnahtar(String value) {
        this.anahtar = value;
    }

    /**
     * Gets the value of the deger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeger() {
        return deger;
    }

    /**
     * Sets the value of the deger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeger(String value) {
        this.deger = value;
    }

}
