
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
 *         &lt;element name="GetInvoiceHtmlByNetleFaturaResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getInvoiceHtmlByNetleFaturaResult"
})
@XmlRootElement(name = "GetInvoiceHtmlByNetleFaturaResponse")
public class GetInvoiceHtmlByNetleFaturaResponse {

    @XmlElement(name = "GetInvoiceHtmlByNetleFaturaResult")
    protected String getInvoiceHtmlByNetleFaturaResult;

    /**
     * Gets the value of the getInvoiceHtmlByNetleFaturaResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetInvoiceHtmlByNetleFaturaResult() {
        return getInvoiceHtmlByNetleFaturaResult;
    }

    /**
     * Sets the value of the getInvoiceHtmlByNetleFaturaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetInvoiceHtmlByNetleFaturaResult(String value) {
        this.getInvoiceHtmlByNetleFaturaResult = value;
    }

}
