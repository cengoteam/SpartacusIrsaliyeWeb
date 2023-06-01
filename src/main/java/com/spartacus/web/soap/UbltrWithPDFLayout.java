
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UbltrWithPDFLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UbltrWithPDFLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UbltrXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDFContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="PDFLargestEdgeLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UbltrWithPDFLayout", propOrder = {
    "ubltrXML",
    "pdfContent",
    "pdfLargestEdgeLength"
})
public class UbltrWithPDFLayout {

    @XmlElement(name = "UbltrXML")
    protected String ubltrXML;
    @XmlElement(name = "PDFContent")
    protected byte[] pdfContent;
    @XmlElement(name = "PDFLargestEdgeLength")
    protected int pdfLargestEdgeLength;

    /**
     * Gets the value of the ubltrXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbltrXML() {
        return ubltrXML;
    }

    /**
     * Sets the value of the ubltrXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbltrXML(String value) {
        this.ubltrXML = value;
    }

    /**
     * Gets the value of the pdfContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPDFContent() {
        return pdfContent;
    }

    /**
     * Sets the value of the pdfContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPDFContent(byte[] value) {
        this.pdfContent = value;
    }

    /**
     * Gets the value of the pdfLargestEdgeLength property.
     * 
     */
    public int getPDFLargestEdgeLength() {
        return pdfLargestEdgeLength;
    }

    /**
     * Sets the value of the pdfLargestEdgeLength property.
     * 
     */
    public void setPDFLargestEdgeLength(int value) {
        this.pdfLargestEdgeLength = value;
    }

}
