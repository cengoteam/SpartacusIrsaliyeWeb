
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
 *         &lt;element name="GetWorkflowInfoByUUIDResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}WFSessionHistories" minOccurs="0"/&gt;
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
    "getWorkflowInfoByUUIDResult"
})
@XmlRootElement(name = "GetWorkflowInfoByUUIDResponse")
public class GetWorkflowInfoByUUIDResponse {

    @XmlElement(name = "GetWorkflowInfoByUUIDResult")
    protected WFSessionHistories getWorkflowInfoByUUIDResult;

    /**
     * Gets the value of the getWorkflowInfoByUUIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link WFSessionHistories }
     *     
     */
    public WFSessionHistories getGetWorkflowInfoByUUIDResult() {
        return getWorkflowInfoByUUIDResult;
    }

    /**
     * Sets the value of the getWorkflowInfoByUUIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WFSessionHistories }
     *     
     */
    public void setGetWorkflowInfoByUUIDResult(WFSessionHistories value) {
        this.getWorkflowInfoByUUIDResult = value;
    }

}
