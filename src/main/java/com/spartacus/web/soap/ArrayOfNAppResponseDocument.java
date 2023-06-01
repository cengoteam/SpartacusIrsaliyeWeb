
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfNAppResponseDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNAppResponseDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NAppResponseDocument" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}NAppResponseDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNAppResponseDocument", propOrder = {
    "nAppResponseDocument"
})
public class ArrayOfNAppResponseDocument {

    @XmlElement(name = "NAppResponseDocument", nillable = true)
    protected List<NAppResponseDocument> nAppResponseDocument;

    /**
     * Gets the value of the nAppResponseDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nAppResponseDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNAppResponseDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAppResponseDocument }
     * 
     * 
     */
    public List<NAppResponseDocument> getNAppResponseDocument() {
        if (nAppResponseDocument == null) {
            nAppResponseDocument = new ArrayList<NAppResponseDocument>();
        }
        return this.nAppResponseDocument;
    }

}
