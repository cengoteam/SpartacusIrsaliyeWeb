
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
 *         &lt;element name="docType" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}GetDocumentType"/&gt;
 *         &lt;element name="documentKeys" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfDocumentKey" minOccurs="0"/&gt;
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
    "docType",
    "documentKeys"
})
@XmlRootElement(name = "SEDP_GetDocument")
public class SEDPGetDocument {

    protected String taxId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ModuleType moduleType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GetDocumentType docType;
    protected ArrayOfDocumentKey documentKeys;

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

    /**
     * Gets the value of the documentKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentKey }
     *     
     */
    public ArrayOfDocumentKey getDocumentKeys() {
        return documentKeys;
    }

    /**
     * Sets the value of the documentKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentKey }
     *     
     */
    public void setDocumentKeys(ArrayOfDocumentKey value) {
        this.documentKeys = value;
    }

}
