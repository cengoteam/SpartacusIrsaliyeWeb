
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckSystemResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckSystemResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormServiceIsOK" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MPIPServiceIsOK" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckSystemResult", propOrder = {
    "formServiceIsOK",
    "mpipServiceIsOK"
})
public class CheckSystemResult {

    @XmlElement(name = "FormServiceIsOK")
    protected boolean formServiceIsOK;
    @XmlElement(name = "MPIPServiceIsOK")
    protected boolean mpipServiceIsOK;

    /**
     * Gets the value of the formServiceIsOK property.
     * 
     */
    public boolean isFormServiceIsOK() {
        return formServiceIsOK;
    }

    /**
     * Sets the value of the formServiceIsOK property.
     * 
     */
    public void setFormServiceIsOK(boolean value) {
        this.formServiceIsOK = value;
    }

    /**
     * Gets the value of the mpipServiceIsOK property.
     * 
     */
    public boolean isMPIPServiceIsOK() {
        return mpipServiceIsOK;
    }

    /**
     * Sets the value of the mpipServiceIsOK property.
     * 
     */
    public void setMPIPServiceIsOK(boolean value) {
        this.mpipServiceIsOK = value;
    }

}
