
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for UbltrPDF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UbltrPDF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="NetleEFatura" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}NetleEFatura" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UbltrPDF", propOrder = {
    "uuid",
    "netleEFatura"
})
@XmlSeeAlso({
    UbltrPDFInput.class,
    UbltrPDFOutput.class
})
public class UbltrPDF {

    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "NetleEFatura")
    protected NetleEFatura netleEFatura;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the netleEFatura property.
     * 
     * @return
     *     possible object is
     *     {@link NetleEFatura }
     *     
     */
    public NetleEFatura getNetleEFatura() {
        return netleEFatura;
    }

    /**
     * Sets the value of the netleEFatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetleEFatura }
     *     
     */
    public void setNetleEFatura(NetleEFatura value) {
        this.netleEFatura = value;
    }

}
