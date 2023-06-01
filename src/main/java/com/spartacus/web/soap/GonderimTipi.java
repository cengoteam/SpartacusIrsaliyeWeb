
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GonderimTipi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GonderimTipi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KAGIT"/&gt;
 *     &lt;enumeration value="ELEKTRONIK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GonderimTipi")
@XmlEnum
public enum GonderimTipi {

    KAGIT,
    ELEKTRONIK;

    public String value() {
        return name();
    }

    public static GonderimTipi fromValue(String v) {
        return valueOf(v);
    }

}
