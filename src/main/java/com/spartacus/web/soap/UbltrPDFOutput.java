
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UbltrPDFOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UbltrPDFOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}UbltrPDF"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HasError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ErrorDetail" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}SoapExceptionDetail" minOccurs="0"/&gt;
 *         &lt;element name="PDFContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UbltrPDFOutput", propOrder = {
    "hasError",
    "errorDetail",
    "pdfContent"
})
public class UbltrPDFOutput
    extends UbltrPDF
{

    @XmlElement(name = "HasError")
    protected boolean hasError;
    @XmlElement(name = "ErrorDetail")
    protected SoapExceptionDetail errorDetail;
    @XmlElement(name = "PDFContent")
    protected byte[] pdfContent;

    /**
     * Gets the value of the hasError property.
     * 
     */
    public boolean isHasError() {
        return hasError;
    }

    /**
     * Sets the value of the hasError property.
     * 
     */
    public void setHasError(boolean value) {
        this.hasError = value;
    }

    /**
     * Gets the value of the errorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SoapExceptionDetail }
     *     
     */
    public SoapExceptionDetail getErrorDetail() {
        return errorDetail;
    }

    /**
     * Sets the value of the errorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapExceptionDetail }
     *     
     */
    public void setErrorDetail(SoapExceptionDetail value) {
        this.errorDetail = value;
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

}
