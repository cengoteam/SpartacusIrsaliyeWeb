
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KarayoluTasimaciligi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KarayoluTasimaciligi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlakaNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KarayoluTasimaciligi", propOrder = {
    "plakaNo"
})
public class KarayoluTasimaciligi {

    @XmlElement(name = "PlakaNo")
    protected String plakaNo;

    /**
     * Gets the value of the plakaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlakaNo() {
        return plakaNo;
    }

    /**
     * Sets the value of the plakaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlakaNo(String value) {
        this.plakaNo = value;
    }

}
