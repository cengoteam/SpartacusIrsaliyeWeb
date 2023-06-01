
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moduleType" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ModuleType"/&gt;
 *         &lt;element name="documentXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docType" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}GetDocumentType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "taxId",
    "moduleType",
    "documentXML",
    "docType"
})
@XmlRootElement(name = "SEDP_SignAndSend")
public class SEDPSignAndSend {

    protected String taxId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ModuleType moduleType;
    protected String documentXML;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GetDocumentType docType;

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the moduleType property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleType }
     *     
     */
    public ModuleType getModuleType() {
        return moduleType;
    }

    /**
     * Sets the value of the moduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleType }
     *     
     */
    public void setModuleType(ModuleType value) {
        this.moduleType = value;
    }

    /**
     * Gets the value of the documentXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentXML() {
        return documentXML;
    }

    /**
     * Sets the value of the documentXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentXML(String value) {
        this.documentXML = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link GetDocumentType }
     *     
     */
    public GetDocumentType getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDocumentType }
     *     
     */
    public void setDocType(GetDocumentType value) {
        this.docType = value;
    }

}
