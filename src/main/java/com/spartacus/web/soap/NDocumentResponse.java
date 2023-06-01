
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for NDocumentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NDocumentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}SoapExceptionDetail"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentId" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="DbPkValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NDocumentResponse", propOrder = {
    "documentId",
    "dbPkValue"
})
@XmlSeeAlso({
    NDocument.class
})
public class NDocumentResponse
    extends SoapExceptionDetail
{

    @XmlElement(name = "DocumentId", required = true)
    protected String documentId;
    @XmlElement(name = "DbPkValue")
    protected long dbPkValue;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the dbPkValue property.
     * 
     */
    public long getDbPkValue() {
        return dbPkValue;
    }

    /**
     * Sets the value of the dbPkValue property.
     * 
     */
    public void setDbPkValue(long value) {
        this.dbPkValue = value;
    }

}
