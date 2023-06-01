
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApproveType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApproveType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Init"/&gt;
 *     &lt;enumeration value="Accept"/&gt;
 *     &lt;enumeration value="Reject"/&gt;
 *     &lt;enumeration value="TimedOut"/&gt;
 *     &lt;enumeration value="OnBehalfOf"/&gt;
 *     &lt;enumeration value="Terminated"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApproveType")
@XmlEnum
public enum ApproveType {

    @XmlEnumValue("Init")
    INIT("Init"),
    @XmlEnumValue("Accept")
    ACCEPT("Accept"),
    @XmlEnumValue("Reject")
    REJECT("Reject"),
    @XmlEnumValue("TimedOut")
    TIMED_OUT("TimedOut"),
    @XmlEnumValue("OnBehalfOf")
    ON_BEHALF_OF("OnBehalfOf"),
    @XmlEnumValue("Terminated")
    TERMINATED("Terminated"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ApproveType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApproveType fromValue(String v) {
        for (ApproveType c: ApproveType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
