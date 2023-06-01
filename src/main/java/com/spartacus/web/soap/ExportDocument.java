
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExportDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GCBDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GCBId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GTBRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GTBGCBTescilNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GTBFiiliIhracatTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDocument", propOrder = {
    "gcbDate",
    "gcbId",
    "gtbRefNo",
    "gtbgcbTescilNo",
    "gtbFiiliIhracatTarihi"
})
public class ExportDocument {

    @XmlElement(name = "GCBDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gcbDate;
    @XmlElement(name = "GCBId")
    protected String gcbId;
    @XmlElement(name = "GTBRefNo")
    protected String gtbRefNo;
    @XmlElement(name = "GTBGCBTescilNo")
    protected String gtbgcbTescilNo;
    @XmlElement(name = "GTBFiiliIhracatTarihi")
    protected String gtbFiiliIhracatTarihi;

    /**
     * Gets the value of the gcbDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGCBDate() {
        return gcbDate;
    }

    /**
     * Sets the value of the gcbDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGCBDate(XMLGregorianCalendar value) {
        this.gcbDate = value;
    }

    /**
     * Gets the value of the gcbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGCBId() {
        return gcbId;
    }

    /**
     * Sets the value of the gcbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGCBId(String value) {
        this.gcbId = value;
    }

    /**
     * Gets the value of the gtbRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGTBRefNo() {
        return gtbRefNo;
    }

    /**
     * Sets the value of the gtbRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGTBRefNo(String value) {
        this.gtbRefNo = value;
    }

    /**
     * Gets the value of the gtbgcbTescilNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGTBGCBTescilNo() {
        return gtbgcbTescilNo;
    }

    /**
     * Sets the value of the gtbgcbTescilNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGTBGCBTescilNo(String value) {
        this.gtbgcbTescilNo = value;
    }

    /**
     * Gets the value of the gtbFiiliIhracatTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGTBFiiliIhracatTarihi() {
        return gtbFiiliIhracatTarihi;
    }

    /**
     * Sets the value of the gtbFiiliIhracatTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGTBFiiliIhracatTarihi(String value) {
        this.gtbFiiliIhracatTarihi = value;
    }

}
