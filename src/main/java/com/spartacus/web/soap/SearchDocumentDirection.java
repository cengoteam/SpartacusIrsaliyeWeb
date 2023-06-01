
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchDocumentDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchDocumentDirection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Outbound"/&gt;
 *     &lt;enumeration value="Inbound"/&gt;
 *     &lt;enumeration value="OutboundAndInbound"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchDocumentDirection")
@XmlEnum
public enum SearchDocumentDirection {

    @XmlEnumValue("Outbound")
    OUTBOUND("Outbound"),
    @XmlEnumValue("Inbound")
    INBOUND("Inbound"),
    @XmlEnumValue("OutboundAndInbound")
    OUTBOUND_AND_INBOUND("OutboundAndInbound");
    private final String value;

    SearchDocumentDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchDocumentDirection fromValue(String v) {
        for (SearchDocumentDirection c: SearchDocumentDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
