
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubDocumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DefaultXml"/&gt;
 *     &lt;enumeration value="NetleXml"/&gt;
 *     &lt;enumeration value="NetleXls"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubDocumentType")
@XmlEnum
public enum SubDocumentType {

    @XmlEnumValue("DefaultXml")
    DEFAULT_XML("DefaultXml"),
    @XmlEnumValue("NetleXml")
    NETLE_XML("NetleXml"),
    @XmlEnumValue("NetleXls")
    NETLE_XLS("NetleXls"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    SubDocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubDocumentType fromValue(String v) {
        for (SubDocumentType c: SubDocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
