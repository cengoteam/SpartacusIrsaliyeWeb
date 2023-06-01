
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
 *         &lt;element name="DownloadCommonDocumentResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}NetleEFatura" minOccurs="0"/&gt;
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
    "downloadCommonDocumentResult"
})
@XmlRootElement(name = "DownloadCommonDocumentResponse")
public class DownloadCommonDocumentResponse {

    @XmlElement(name = "DownloadCommonDocumentResult")
    protected NetleEFatura downloadCommonDocumentResult;

    /**
     * Gets the value of the downloadCommonDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link NetleEFatura }
     *     
     */
    public NetleEFatura getDownloadCommonDocumentResult() {
        return downloadCommonDocumentResult;
    }

    /**
     * Sets the value of the downloadCommonDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetleEFatura }
     *     
     */
    public void setDownloadCommonDocumentResult(NetleEFatura value) {
        this.downloadCommonDocumentResult = value;
    }

}
