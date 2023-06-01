
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WFSessionHistories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WFSessionHistories"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}WFSessionDetail"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Histories" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfWFHistory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WFSessionHistories", propOrder = {
    "histories"
})
public class WFSessionHistories
    extends WFSessionDetail
{

    @XmlElement(name = "Histories")
    protected ArrayOfWFHistory histories;

    /**
     * Gets the value of the histories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWFHistory }
     *     
     */
    public ArrayOfWFHistory getHistories() {
        return histories;
    }

    /**
     * Sets the value of the histories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWFHistory }
     *     
     */
    public void setHistories(ArrayOfWFHistory value) {
        this.histories = value;
    }

}
