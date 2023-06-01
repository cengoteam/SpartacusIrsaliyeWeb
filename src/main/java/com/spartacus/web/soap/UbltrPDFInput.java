
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UbltrPDFInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UbltrPDFInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}UbltrPDF"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UseEmbeddedXSLT" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExternalLayoutFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UbltrPDFInput", propOrder = {
    "useEmbeddedXSLT",
    "externalLayoutFileName"
})
public class UbltrPDFInput
    extends UbltrPDF
{

    @XmlElement(name = "UseEmbeddedXSLT")
    protected boolean useEmbeddedXSLT;
    @XmlElement(name = "ExternalLayoutFileName")
    protected String externalLayoutFileName;

    /**
     * Gets the value of the useEmbeddedXSLT property.
     * 
     */
    public boolean isUseEmbeddedXSLT() {
        return useEmbeddedXSLT;
    }

    /**
     * Sets the value of the useEmbeddedXSLT property.
     * 
     */
    public void setUseEmbeddedXSLT(boolean value) {
        this.useEmbeddedXSLT = value;
    }

    /**
     * Gets the value of the externalLayoutFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLayoutFileName() {
        return externalLayoutFileName;
    }

    /**
     * Sets the value of the externalLayoutFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLayoutFileName(String value) {
        this.externalLayoutFileName = value;
    }

}
