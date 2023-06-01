
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WFHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WFHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UserDetail" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}WFUserDetail" minOccurs="0"/&gt;
 *         &lt;element name="IsApproved" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ApproveResult" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ApproveResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WFHistory", propOrder = {
    "createDate",
    "userDetail",
    "isApproved",
    "approveResult"
})
public class WFHistory {

    @XmlElement(name = "CreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "UserDetail")
    protected WFUserDetail userDetail;
    @XmlElement(name = "IsApproved")
    protected boolean isApproved;
    @XmlElement(name = "ApproveResult")
    protected ApproveResult approveResult;

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the userDetail property.
     * 
     * @return
     *     possible object is
     *     {@link WFUserDetail }
     *     
     */
    public WFUserDetail getUserDetail() {
        return userDetail;
    }

    /**
     * Sets the value of the userDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link WFUserDetail }
     *     
     */
    public void setUserDetail(WFUserDetail value) {
        this.userDetail = value;
    }

    /**
     * Gets the value of the isApproved property.
     * 
     */
    public boolean isIsApproved() {
        return isApproved;
    }

    /**
     * Sets the value of the isApproved property.
     * 
     */
    public void setIsApproved(boolean value) {
        this.isApproved = value;
    }

    /**
     * Gets the value of the approveResult property.
     * 
     * @return
     *     possible object is
     *     {@link ApproveResult }
     *     
     */
    public ApproveResult getApproveResult() {
        return approveResult;
    }

    /**
     * Sets the value of the approveResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproveResult }
     *     
     */
    public void setApproveResult(ApproveResult value) {
        this.approveResult = value;
    }

}
