
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
 *         &lt;element name="SearchEArchiveResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfGuid" minOccurs="0"/&gt;
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
    "searchEArchiveResult"
})
@XmlRootElement(name = "SearchEArchiveResponse")
public class SearchEArchiveResponse {

    @XmlElement(name = "SearchEArchiveResult")
    protected ArrayOfGuid searchEArchiveResult;

    /**
     * Gets the value of the searchEArchiveResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getSearchEArchiveResult() {
        return searchEArchiveResult;
    }

    /**
     * Sets the value of the searchEArchiveResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setSearchEArchiveResult(ArrayOfGuid value) {
        this.searchEArchiveResult = value;
    }

}
