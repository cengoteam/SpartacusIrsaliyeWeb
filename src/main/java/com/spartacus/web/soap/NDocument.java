
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}NDocumentResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="XmlContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Direction" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}DocumentDirection"/&gt;
 *         &lt;element name="SenderTaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentType" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}GetDocumentType"/&gt;
 *         &lt;element name="SenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverTaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubDocumentType" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}SubDocumentType"/&gt;
 *         &lt;element name="InvoiceResponseEnvelopeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceEnvelopeGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceResponseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DigestValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExportDocument" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ExportDocument" minOccurs="0"/&gt;
 *         &lt;element name="WorkflowDocument" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}WFSessionDetail" minOccurs="0"/&gt;
 *         &lt;element name="FinalState" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InvoiceResponseExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NDocument", propOrder = {
    "createDate",
    "xmlContent",
    "direction",
    "senderTaxNumber",
    "documentType",
    "senderName",
    "receiverTaxNumber",
    "receiverName",
    "subDocumentType",
    "invoiceResponseEnvelopeId",
    "invoiceResponseDescription",
    "invoiceEnvelopeGUID",
    "invoiceResponseReason",
    "senderAlias",
    "receiverAlias",
    "invoiceState",
    "digestValue",
    "exportDocument",
    "workflowDocument",
    "finalState",
    "invoiceResponseExpired"
})
@XmlSeeAlso({
    NResponseDocument.class
})
public class NDocument
    extends NDocumentResponse
{

    @XmlElement(name = "CreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "XmlContent")
    protected String xmlContent;
    @XmlElement(name = "Direction", required = true)
    @XmlSchemaType(name = "string")
    protected DocumentDirection direction;
    @XmlElement(name = "SenderTaxNumber")
    protected String senderTaxNumber;
    @XmlElement(name = "DocumentType", required = true)
    @XmlSchemaType(name = "string")
    protected GetDocumentType documentType;
    @XmlElement(name = "SenderName")
    protected String senderName;
    @XmlElement(name = "ReceiverTaxNumber")
    protected String receiverTaxNumber;
    @XmlElement(name = "ReceiverName")
    protected String receiverName;
    @XmlElement(name = "SubDocumentType", required = true)
    @XmlSchemaType(name = "string")
    protected SubDocumentType subDocumentType;
    @XmlElement(name = "InvoiceResponseEnvelopeId")
    protected String invoiceResponseEnvelopeId;
    @XmlElement(name = "InvoiceResponseDescription")
    protected String invoiceResponseDescription;
    @XmlElement(name = "InvoiceEnvelopeGUID")
    protected String invoiceEnvelopeGUID;
    @XmlElement(name = "InvoiceResponseReason")
    protected String invoiceResponseReason;
    @XmlElement(name = "SenderAlias")
    protected String senderAlias;
    @XmlElement(name = "ReceiverAlias")
    protected String receiverAlias;
    @XmlElement(name = "InvoiceState")
    protected String invoiceState;
    @XmlElement(name = "DigestValue")
    protected String digestValue;
    @XmlElement(name = "ExportDocument")
    protected ExportDocument exportDocument;
    @XmlElement(name = "WorkflowDocument")
    protected WFSessionDetail workflowDocument;
    @XmlElement(name = "FinalState")
    protected boolean finalState;
    @XmlElement(name = "InvoiceResponseExpired")
    protected boolean invoiceResponseExpired;

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the xmlContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlContent() {
        return xmlContent;
    }

    /**
     * Sets the value of the xmlContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlContent(String value) {
        this.xmlContent = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDirection }
     *     
     */
    public DocumentDirection getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDirection }
     *     
     */
    public void setDirection(DocumentDirection value) {
        this.direction = value;
    }

    /**
     * Gets the value of the senderTaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderTaxNumber() {
        return senderTaxNumber;
    }

    /**
     * Sets the value of the senderTaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderTaxNumber(String value) {
        this.senderTaxNumber = value;
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
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the receiverTaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverTaxNumber() {
        return receiverTaxNumber;
    }

    /**
     * Sets the value of the receiverTaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverTaxNumber(String value) {
        this.receiverTaxNumber = value;
    }

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverName(String value) {
        this.receiverName = value;
    }

    /**
     * Gets the value of the subDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link SubDocumentType }
     *     
     */
    public SubDocumentType getSubDocumentType() {
        return subDocumentType;
    }

    /**
     * Sets the value of the subDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubDocumentType }
     *     
     */
    public void setSubDocumentType(SubDocumentType value) {
        this.subDocumentType = value;
    }

    /**
     * Gets the value of the invoiceResponseEnvelopeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceResponseEnvelopeId() {
        return invoiceResponseEnvelopeId;
    }

    /**
     * Sets the value of the invoiceResponseEnvelopeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceResponseEnvelopeId(String value) {
        this.invoiceResponseEnvelopeId = value;
    }

    /**
     * Gets the value of the invoiceResponseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceResponseDescription() {
        return invoiceResponseDescription;
    }

    /**
     * Sets the value of the invoiceResponseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceResponseDescription(String value) {
        this.invoiceResponseDescription = value;
    }

    /**
     * Gets the value of the invoiceEnvelopeGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceEnvelopeGUID() {
        return invoiceEnvelopeGUID;
    }

    /**
     * Sets the value of the invoiceEnvelopeGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceEnvelopeGUID(String value) {
        this.invoiceEnvelopeGUID = value;
    }

    /**
     * Gets the value of the invoiceResponseReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceResponseReason() {
        return invoiceResponseReason;
    }

    /**
     * Sets the value of the invoiceResponseReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceResponseReason(String value) {
        this.invoiceResponseReason = value;
    }

    /**
     * Gets the value of the senderAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAlias() {
        return senderAlias;
    }

    /**
     * Sets the value of the senderAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAlias(String value) {
        this.senderAlias = value;
    }

    /**
     * Gets the value of the receiverAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAlias() {
        return receiverAlias;
    }

    /**
     * Sets the value of the receiverAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAlias(String value) {
        this.receiverAlias = value;
    }

    /**
     * Gets the value of the invoiceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceState() {
        return invoiceState;
    }

    /**
     * Sets the value of the invoiceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceState(String value) {
        this.invoiceState = value;
    }

    /**
     * Gets the value of the digestValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestValue() {
        return digestValue;
    }

    /**
     * Sets the value of the digestValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestValue(String value) {
        this.digestValue = value;
    }

    /**
     * Gets the value of the exportDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ExportDocument }
     *     
     */
    public ExportDocument getExportDocument() {
        return exportDocument;
    }

    /**
     * Sets the value of the exportDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDocument }
     *     
     */
    public void setExportDocument(ExportDocument value) {
        this.exportDocument = value;
    }

    /**
     * Gets the value of the workflowDocument property.
     * 
     * @return
     *     possible object is
     *     {@link WFSessionDetail }
     *     
     */
    public WFSessionDetail getWorkflowDocument() {
        return workflowDocument;
    }

    /**
     * Sets the value of the workflowDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link WFSessionDetail }
     *     
     */
    public void setWorkflowDocument(WFSessionDetail value) {
        this.workflowDocument = value;
    }

    /**
     * Gets the value of the finalState property.
     * 
     */
    public boolean isFinalState() {
        return finalState;
    }

    /**
     * Sets the value of the finalState property.
     * 
     */
    public void setFinalState(boolean value) {
        this.finalState = value;
    }

    /**
     * Gets the value of the invoiceResponseExpired property.
     * 
     */
    public boolean isInvoiceResponseExpired() {
        return invoiceResponseExpired;
    }

    /**
     * Sets the value of the invoiceResponseExpired property.
     * 
     */
    public void setInvoiceResponseExpired(boolean value) {
        this.invoiceResponseExpired = value;
    }

}
