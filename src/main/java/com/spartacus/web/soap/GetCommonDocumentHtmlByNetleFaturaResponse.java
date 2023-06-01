
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
 *         &lt;element name="GetCommonDocumentHtmlByNetleFaturaResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getCommonDocumentHtmlByNetleFaturaResult"
})
@XmlRootElement(name = "GetCommonDocumentHtmlByNetleFaturaResponse")
public class GetCommonDocumentHtmlByNetleFaturaResponse {

    @XmlElement(name = "GetCommonDocumentHtmlByNetleFaturaResult")
    protected String getCommonDocumentHtmlByNetleFaturaResult;

    /**
     * Gets the value of the getCommonDocumentHtmlByNetleFaturaResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCommonDocumentHtmlByNetleFaturaResult() {
        return getCommonDocumentHtmlByNetleFaturaResult;
    }

    /**
     * Sets the value of the getCommonDocumentHtmlByNetleFaturaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCommonDocumentHtmlByNetleFaturaResult(String value) {
        this.getCommonDocumentHtmlByNetleFaturaResult = value;
    }

}
