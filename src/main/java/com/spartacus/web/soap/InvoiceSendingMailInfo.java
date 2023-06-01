
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceSendingMailInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceSendingMailInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}SendingMailInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachmentByUUID" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfGuid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceSendingMailInfo", propOrder = {
    "attachmentByUUID"
})
public class InvoiceSendingMailInfo
    extends SendingMailInfo
{

    @XmlElement(name = "AttachmentByUUID")
    protected ArrayOfGuid attachmentByUUID;

    /**
     * Gets the value of the attachmentByUUID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getAttachmentByUUID() {
        return attachmentByUUID;
    }

    /**
     * Sets the value of the attachmentByUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setAttachmentByUUID(ArrayOfGuid value) {
        this.attachmentByUUID = value;
    }

}
