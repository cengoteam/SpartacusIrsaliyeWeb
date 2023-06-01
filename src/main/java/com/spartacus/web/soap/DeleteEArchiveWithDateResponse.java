
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
 *         &lt;element name="DeleteEArchiveWithDateResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}DeleteResult" minOccurs="0"/&gt;
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
    "deleteEArchiveWithDateResult"
})
@XmlRootElement(name = "DeleteEArchiveWithDateResponse")
public class DeleteEArchiveWithDateResponse {

    @XmlElement(name = "DeleteEArchiveWithDateResult")
    protected DeleteResult deleteEArchiveWithDateResult;

    /**
     * Gets the value of the deleteEArchiveWithDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteResult }
     *     
     */
    public DeleteResult getDeleteEArchiveWithDateResult() {
        return deleteEArchiveWithDateResult;
    }

    /**
     * Sets the value of the deleteEArchiveWithDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteResult }
     *     
     */
    public void setDeleteEArchiveWithDateResult(DeleteResult value) {
        this.deleteEArchiveWithDateResult = value;
    }

}
