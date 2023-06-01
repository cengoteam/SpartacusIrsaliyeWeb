
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EArchiveLegalReportData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EArchiveLegalReportData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}EArchiveLegalReport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XmlContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EArchiveLegalReportData", propOrder = {
    "xmlContent"
})
public class EArchiveLegalReportData
    extends EArchiveLegalReport
{

    @XmlElement(name = "XmlContent")
    protected String xmlContent;

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

}
