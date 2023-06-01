
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EArchiveLegalReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EArchiveLegalReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxPayerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportId" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="TermBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TermEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SubTermBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SubTermEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SubReportCounter" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EArchiveLegalReport", propOrder = {
    "taxPayerId",
    "reportedBy",
    "reportId",
    "termBeginDate",
    "termEndDate",
    "subTermBeginDate",
    "subTermEndDate",
    "subReportCounter"
})
@XmlSeeAlso({
    EArchiveLegalReportData.class
})
public class EArchiveLegalReport {

    @XmlElement(name = "TaxPayerId")
    protected String taxPayerId;
    @XmlElement(name = "ReportedBy")
    protected String reportedBy;
    @XmlElement(name = "ReportId", required = true)
    protected String reportId;
    @XmlElement(name = "TermBeginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar termBeginDate;
    @XmlElement(name = "TermEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar termEndDate;
    @XmlElement(name = "SubTermBeginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subTermBeginDate;
    @XmlElement(name = "SubTermEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subTermEndDate;
    @XmlElement(name = "SubReportCounter", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subReportCounter;

    /**
     * Gets the value of the taxPayerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPayerId() {
        return taxPayerId;
    }

    /**
     * Sets the value of the taxPayerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPayerId(String value) {
        this.taxPayerId = value;
    }

    /**
     * Gets the value of the reportedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportedBy() {
        return reportedBy;
    }

    /**
     * Sets the value of the reportedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportedBy(String value) {
        this.reportedBy = value;
    }

    /**
     * Gets the value of the reportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportId(String value) {
        this.reportId = value;
    }

    /**
     * Gets the value of the termBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermBeginDate() {
        return termBeginDate;
    }

    /**
     * Sets the value of the termBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermBeginDate(XMLGregorianCalendar value) {
        this.termBeginDate = value;
    }

    /**
     * Gets the value of the termEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermEndDate() {
        return termEndDate;
    }

    /**
     * Sets the value of the termEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermEndDate(XMLGregorianCalendar value) {
        this.termEndDate = value;
    }

    /**
     * Gets the value of the subTermBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubTermBeginDate() {
        return subTermBeginDate;
    }

    /**
     * Sets the value of the subTermBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubTermBeginDate(XMLGregorianCalendar value) {
        this.subTermBeginDate = value;
    }

    /**
     * Gets the value of the subTermEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubTermEndDate() {
        return subTermEndDate;
    }

    /**
     * Sets the value of the subTermEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubTermEndDate(XMLGregorianCalendar value) {
        this.subTermEndDate = value;
    }

    /**
     * Gets the value of the subReportCounter property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubReportCounter() {
        return subReportCounter;
    }

    /**
     * Sets the value of the subReportCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubReportCounter(XMLGregorianCalendar value) {
        this.subReportCounter = value;
    }

}
