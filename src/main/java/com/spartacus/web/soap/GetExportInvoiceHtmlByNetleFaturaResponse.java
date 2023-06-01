
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
 *         &lt;element name="GetExportInvoiceHtmlByNetleFaturaResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getExportInvoiceHtmlByNetleFaturaResult"
})
@XmlRootElement(name = "GetExportInvoiceHtmlByNetleFaturaResponse")
public class GetExportInvoiceHtmlByNetleFaturaResponse {

    @XmlElement(name = "GetExportInvoiceHtmlByNetleFaturaResult")
    protected String getExportInvoiceHtmlByNetleFaturaResult;

    /**
     * Gets the value of the getExportInvoiceHtmlByNetleFaturaResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetExportInvoiceHtmlByNetleFaturaResult() {
        return getExportInvoiceHtmlByNetleFaturaResult;
    }

    /**
     * Sets the value of the getExportInvoiceHtmlByNetleFaturaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetExportInvoiceHtmlByNetleFaturaResult(String value) {
        this.getExportInvoiceHtmlByNetleFaturaResult = value;
    }

}
