
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
 *         &lt;element name="GetWorkflowInfoByGUIDResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}WFSessionHistories" minOccurs="0"/&gt;
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
    "getWorkflowInfoByGUIDResult"
})
@XmlRootElement(name = "GetWorkflowInfoByGUIDResponse")
public class GetWorkflowInfoByGUIDResponse {

    @XmlElement(name = "GetWorkflowInfoByGUIDResult")
    protected WFSessionHistories getWorkflowInfoByGUIDResult;

    /**
     * Gets the value of the getWorkflowInfoByGUIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link WFSessionHistories }
     *     
     */
    public WFSessionHistories getGetWorkflowInfoByGUIDResult() {
        return getWorkflowInfoByGUIDResult;
    }

    /**
     * Sets the value of the getWorkflowInfoByGUIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WFSessionHistories }
     *     
     */
    public void setGetWorkflowInfoByGUIDResult(WFSessionHistories value) {
        this.getWorkflowInfoByGUIDResult = value;
    }

}
