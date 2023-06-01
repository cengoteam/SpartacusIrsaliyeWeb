
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HavaTasimaciligi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HavaTasimaciligi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HavaAraciNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HavaTasimaciligi", propOrder = {
    "havaAraciNo"
})
public class HavaTasimaciligi {

    @XmlElement(name = "HavaAraciNo")
    protected String havaAraciNo;

    /**
     * Gets the value of the havaAraciNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHavaAraciNo() {
        return havaAraciNo;
    }

    /**
     * Sets the value of the havaAraciNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHavaAraciNo(String value) {
        this.havaAraciNo = value;
    }

}
