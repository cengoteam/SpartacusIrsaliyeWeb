
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EArchiveStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EArchiveStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecordStatusText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GIBOKDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GIBDeleteDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DeleteDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OK" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CreateDatetTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GIBReportId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GIBDeleteReportId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UUID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="CheckSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviewUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GIBObjectDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ObjectDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EArchiveStatus", propOrder = {
    "recordStatus",
    "recordStatusText",
    "gibokDateTime",
    "gibDeleteDateTime",
    "deleteDateTime",
    "ok",
    "createDatetTime",
    "gibReportId",
    "gibDeleteReportId",
    "invoiceNumber",
    "invoiceDate",
    "uuid",
    "checkSum",
    "errorDescription",
    "uniqueId",
    "previewUrl",
    "gibObjectDateTime",
    "objectDateTime"
})
public class EArchiveStatus {

    @XmlElement(name = "RecordStatus")
    protected int recordStatus;
    @XmlElement(name = "RecordStatusText")
    protected String recordStatusText;
    @XmlElement(name = "GIBOKDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gibokDateTime;
    @XmlElement(name = "GIBDeleteDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gibDeleteDateTime;
    @XmlElement(name = "DeleteDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deleteDateTime;
    @XmlElement(name = "OK")
    protected boolean ok;
    @XmlElement(name = "CreateDatetTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDatetTime;
    @XmlElement(name = "GIBReportId")
    protected String gibReportId;
    @XmlElement(name = "GIBDeleteReportId")
    protected String gibDeleteReportId;
    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElement(name = "InvoiceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "CheckSum")
    protected String checkSum;
    @XmlElement(name = "ErrorDescription")
    protected String errorDescription;
    @XmlElement(name = "UniqueId")
    protected String uniqueId;
    @XmlElement(name = "PreviewUrl")
    protected String previewUrl;
    @XmlElement(name = "GIBObjectDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gibObjectDateTime;
    @XmlElement(name = "ObjectDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar objectDateTime;

    /**
     * Gets the value of the recordStatus property.
     * 
     */
    public int getRecordStatus() {
        return recordStatus;
    }

    /**
     * Sets the value of the recordStatus property.
     * 
     */
    public void setRecordStatus(int value) {
        this.recordStatus = value;
    }

    /**
     * Gets the value of the recordStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordStatusText() {
        return recordStatusText;
    }

    /**
     * Sets the value of the recordStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordStatusText(String value) {
        this.recordStatusText = value;
    }

    /**
     * Gets the value of the gibokDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGIBOKDateTime() {
        return gibokDateTime;
    }

    /**
     * Sets the value of the gibokDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGIBOKDateTime(XMLGregorianCalendar value) {
        this.gibokDateTime = value;
    }

    /**
     * Gets the value of the gibDeleteDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGIBDeleteDateTime() {
        return gibDeleteDateTime;
    }

    /**
     * Sets the value of the gibDeleteDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGIBDeleteDateTime(XMLGregorianCalendar value) {
        this.gibDeleteDateTime = value;
    }

    /**
     * Gets the value of the deleteDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeleteDateTime() {
        return deleteDateTime;
    }

    /**
     * Sets the value of the deleteDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeleteDateTime(XMLGregorianCalendar value) {
        this.deleteDateTime = value;
    }

    /**
     * Gets the value of the ok property.
     * 
     */
    public boolean isOK() {
        return ok;
    }

    /**
     * Sets the value of the ok property.
     * 
     */
    public void setOK(boolean value) {
        this.ok = value;
    }

    /**
     * Gets the value of the createDatetTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDatetTime() {
        return createDatetTime;
    }

    /**
     * Sets the value of the createDatetTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDatetTime(XMLGregorianCalendar value) {
        this.createDatetTime = value;
    }

    /**
     * Gets the value of the gibReportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIBReportId() {
        return gibReportId;
    }

    /**
     * Sets the value of the gibReportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIBReportId(String value) {
        this.gibReportId = value;
    }

    /**
     * Gets the value of the gibDeleteReportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIBDeleteReportId() {
        return gibDeleteReportId;
    }

    /**
     * Sets the value of the gibDeleteReportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIBDeleteReportId(String value) {
        this.gibDeleteReportId = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the checkSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckSum() {
        return checkSum;
    }

    /**
     * Sets the value of the checkSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckSum(String value) {
        this.checkSum = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the previewUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewUrl() {
        return previewUrl;
    }

    /**
     * Sets the value of the previewUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewUrl(String value) {
        this.previewUrl = value;
    }

    /**
     * Gets the value of the gibObjectDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGIBObjectDateTime() {
        return gibObjectDateTime;
    }

    /**
     * Sets the value of the gibObjectDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGIBObjectDateTime(XMLGregorianCalendar value) {
        this.gibObjectDateTime = value;
    }

    /**
     * Gets the value of the objectDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObjectDateTime() {
        return objectDateTime;
    }

    /**
     * Sets the value of the objectDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObjectDateTime(XMLGregorianCalendar value) {
        this.objectDateTime = value;
    }

}
