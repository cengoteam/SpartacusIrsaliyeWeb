
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OKCBilgiFisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OKCBilgiFisi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tarih" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Tip" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}OKCBilgiFisiTipi"/&gt;
 *         &lt;element name="ZRaporuNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OKCSeriNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OKCBilgiFisi", propOrder = {
    "no",
    "tarih",
    "tip",
    "zRaporuNo",
    "okcSeriNo"
})
public class OKCBilgiFisi {

    @XmlElement(name = "No")
    protected String no;
    @XmlElement(name = "Tarih", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tarih;
    @XmlElement(name = "Tip", required = true)
    @XmlSchemaType(name = "string")
    protected OKCBilgiFisiTipi tip;
    @XmlElement(name = "ZRaporuNo")
    protected String zRaporuNo;
    @XmlElement(name = "OKCSeriNo")
    protected String okcSeriNo;

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo(String value) {
        this.no = value;
    }

    /**
     * Gets the value of the tarih property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTarih() {
        return tarih;
    }

    /**
     * Sets the value of the tarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTarih(XMLGregorianCalendar value) {
        this.tarih = value;
    }

    /**
     * Gets the value of the tip property.
     * 
     * @return
     *     possible object is
     *     {@link OKCBilgiFisiTipi }
     *     
     */
    public OKCBilgiFisiTipi getTip() {
        return tip;
    }

    /**
     * Sets the value of the tip property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKCBilgiFisiTipi }
     *     
     */
    public void setTip(OKCBilgiFisiTipi value) {
        this.tip = value;
    }

    /**
     * Gets the value of the zRaporuNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRaporuNo() {
        return zRaporuNo;
    }

    /**
     * Sets the value of the zRaporuNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRaporuNo(String value) {
        this.zRaporuNo = value;
    }

    /**
     * Gets the value of the okcSeriNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKCSeriNo() {
        return okcSeriNo;
    }

    /**
     * Sets the value of the okcSeriNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKCSeriNo(String value) {
        this.okcSeriNo = value;
    }

}
