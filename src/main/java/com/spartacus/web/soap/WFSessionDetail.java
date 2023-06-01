
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for WFSessionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WFSessionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReRunnable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LastUserDetail" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}WFUserDetail" minOccurs="0"/&gt;
 *         &lt;element name="WFState" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkflowUniqueId" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="WorkflowRecordId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WFSessionDetail", propOrder = {
    "reRunnable",
    "lastUserDetail",
    "wfState",
    "errorDescription",
    "workflowUniqueId",
    "workflowRecordId"
})
@XmlSeeAlso({
    WFSessionHistories.class
})
public class WFSessionDetail {

    @XmlElement(name = "ReRunnable")
    protected boolean reRunnable;
    @XmlElement(name = "LastUserDetail")
    protected WFUserDetail lastUserDetail;
    @XmlElement(name = "WFState")
    protected int wfState;
    @XmlElement(name = "ErrorDescription")
    protected String errorDescription;
    @XmlElement(name = "WorkflowUniqueId", required = true)
    protected String workflowUniqueId;
    @XmlElement(name = "WorkflowRecordId")
    protected long workflowRecordId;

    /**
     * Gets the value of the reRunnable property.
     * 
     */
    public boolean isReRunnable() {
        return reRunnable;
    }

    /**
     * Sets the value of the reRunnable property.
     * 
     */
    public void setReRunnable(boolean value) {
        this.reRunnable = value;
    }

    /**
     * Gets the value of the lastUserDetail property.
     * 
     * @return
     *     possible object is
     *     {@link WFUserDetail }
     *     
     */
    public WFUserDetail getLastUserDetail() {
        return lastUserDetail;
    }

    /**
     * Sets the value of the lastUserDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link WFUserDetail }
     *     
     */
    public void setLastUserDetail(WFUserDetail value) {
        this.lastUserDetail = value;
    }

    /**
     * Gets the value of the wfState property.
     * 
     */
    public int getWFState() {
        return wfState;
    }

    /**
     * Sets the value of the wfState property.
     * 
     */
    public void setWFState(int value) {
        this.wfState = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the workflowUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowUniqueId() {
        return workflowUniqueId;
    }

    /**
     * Sets the value of the workflowUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowUniqueId(String value) {
        this.workflowUniqueId = value;
    }

    /**
     * Gets the value of the workflowRecordId property.
     * 
     */
    public long getWorkflowRecordId() {
        return workflowRecordId;
    }

    /**
     * Sets the value of the workflowRecordId property.
     * 
     */
    public void setWorkflowRecordId(long value) {
        this.workflowRecordId = value;
    }

}
