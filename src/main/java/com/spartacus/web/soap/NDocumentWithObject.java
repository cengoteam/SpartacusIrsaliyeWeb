
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NDocumentWithObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NDocumentWithObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetleFaturaObj" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}NetleEFatura" minOccurs="0"/&gt;
 *         &lt;element name="Document" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}NDocument" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NDocumentWithObject", propOrder = {
    "netleFaturaObj",
    "document"
})
public class NDocumentWithObject {

    @XmlElement(name = "NetleFaturaObj")
    protected NetleEFatura netleFaturaObj;
    @XmlElement(name = "Document")
    protected NDocument document;

    /**
     * Gets the value of the netleFaturaObj property.
     * 
     * @return
     *     possible object is
     *     {@link NetleEFatura }
     *     
     */
    public NetleEFatura getNetleFaturaObj() {
        return netleFaturaObj;
    }

    /**
     * Sets the value of the netleFaturaObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetleEFatura }
     *     
     */
    public void setNetleFaturaObj(NetleEFatura value) {
        this.netleFaturaObj = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link NDocument }
     *     
     */
    public NDocument getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link NDocument }
     *     
     */
    public void setDocument(NDocument value) {
        this.document = value;
    }

}
