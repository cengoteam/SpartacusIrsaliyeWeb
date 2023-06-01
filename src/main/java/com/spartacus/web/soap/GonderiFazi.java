
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GonderiFazi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GonderiFazi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TasimaSekli" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}TasimaSekli" minOccurs="0"/&gt;
 *         &lt;element name="Suruculer" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfSahis" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GonderiFazi", propOrder = {
    "tasimaSekli",
    "suruculer"
})
public class GonderiFazi {

    @XmlElement(name = "TasimaSekli")
    protected TasimaSekli tasimaSekli;
    @XmlElement(name = "Suruculer")
    protected ArrayOfSahis suruculer;

    /**
     * Gets the value of the tasimaSekli property.
     * 
     * @return
     *     possible object is
     *     {@link TasimaSekli }
     *     
     */
    public TasimaSekli getTasimaSekli() {
        return tasimaSekli;
    }

    /**
     * Sets the value of the tasimaSekli property.
     * 
     * @param value
     *     allowed object is
     *     {@link TasimaSekli }
     *     
     */
    public void setTasimaSekli(TasimaSekli value) {
        this.tasimaSekli = value;
    }

    /**
     * Gets the value of the suruculer property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSahis }
     *     
     */
    public ArrayOfSahis getSuruculer() {
        return suruculer;
    }

    /**
     * Sets the value of the suruculer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSahis }
     *     
     */
    public void setSuruculer(ArrayOfSahis value) {
        this.suruculer = value;
    }

}
