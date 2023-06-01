
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfNDocumentWithObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNDocumentWithObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NDocumentWithObject" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}NDocumentWithObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNDocumentWithObject", propOrder = {
    "nDocumentWithObject"
})
public class ArrayOfNDocumentWithObject {

    @XmlElement(name = "NDocumentWithObject", nillable = true)
    protected List<NDocumentWithObject> nDocumentWithObject;

    /**
     * Gets the value of the nDocumentWithObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nDocumentWithObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNDocumentWithObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NDocumentWithObject }
     * 
     * 
     */
    public List<NDocumentWithObject> getNDocumentWithObject() {
        if (nDocumentWithObject == null) {
            nDocumentWithObject = new ArrayList<NDocumentWithObject>();
        }
        return this.nDocumentWithObject;
    }

}
