
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for DocumentKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="DocumentType" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}GetDocumentType"/&gt;
 *         &lt;element name="DocumentDirection" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}DocumentDirection"/&gt;
 *         &lt;element name="ExcludeXmlContent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentKey", propOrder = {
    "id",
    "documentType",
    "documentDirection",
    "excludeXmlContent"
})
public class DocumentKey {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "DocumentType", required = true)
    @XmlSchemaType(name = "string")
    protected GetDocumentType documentType;
    @XmlElement(name = "DocumentDirection", required = true)
    @XmlSchemaType(name = "string")
    protected DocumentDirection documentDirection;
    @XmlElement(name = "ExcludeXmlContent")
    protected boolean excludeXmlContent;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link GetDocumentType }
     *     
     */
    public GetDocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDocumentType }
     *     
     */
    public void setDocumentType(GetDocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentDirection property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDirection }
     *     
     */
    public DocumentDirection getDocumentDirection() {
        return documentDirection;
    }

    /**
     * Sets the value of the documentDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDirection }
     *     
     */
    public void setDocumentDirection(DocumentDirection value) {
        this.documentDirection = value;
    }

    /**
     * Gets the value of the excludeXmlContent property.
     * 
     */
    public boolean isExcludeXmlContent() {
        return excludeXmlContent;
    }

    /**
     * Sets the value of the excludeXmlContent property.
     * 
     */
    public void setExcludeXmlContent(boolean value) {
        this.excludeXmlContent = value;
    }

}
