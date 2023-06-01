
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetDocumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Invoice"/&gt;
 *     &lt;enumeration value="Envelope"/&gt;
 *     &lt;enumeration value="ApplicationResponse"/&gt;
 *     &lt;enumeration value="SystemResponse"/&gt;
 *     &lt;enumeration value="NetleFatura"/&gt;
 *     &lt;enumeration value="DespatchAdvice"/&gt;
 *     &lt;enumeration value="ReceiptAdvice"/&gt;
 *     &lt;enumeration value="NetleIrsaliye"/&gt;
 *     &lt;enumeration value="NetleIrsaliyeYanit"/&gt;
 *     &lt;enumeration value="CreditNote"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GetDocumentType")
@XmlEnum
public enum GetDocumentType {

    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Envelope")
    ENVELOPE("Envelope"),
    @XmlEnumValue("ApplicationResponse")
    APPLICATION_RESPONSE("ApplicationResponse"),
    @XmlEnumValue("SystemResponse")
    SYSTEM_RESPONSE("SystemResponse"),
    @XmlEnumValue("NetleFatura")
    NETLE_FATURA("NetleFatura"),
    @XmlEnumValue("DespatchAdvice")
    DESPATCH_ADVICE("DespatchAdvice"),
    @XmlEnumValue("ReceiptAdvice")
    RECEIPT_ADVICE("ReceiptAdvice"),
    @XmlEnumValue("NetleIrsaliye")
    NETLE_IRSALIYE("NetleIrsaliye"),
    @XmlEnumValue("NetleIrsaliyeYanit")
    NETLE_IRSALIYE_YANIT("NetleIrsaliyeYanit"),
    @XmlEnumValue("CreditNote")
    CREDIT_NOTE("CreditNote"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    GetDocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetDocumentType fromValue(String v) {
        for (GetDocumentType c: GetDocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
