
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SGKIlaveFaturaTipi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SGKIlaveFaturaTipi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YOK"/&gt;
 *     &lt;enumeration value="SAGLIK_ECZ"/&gt;
 *     &lt;enumeration value="SAGLIK_HAS"/&gt;
 *     &lt;enumeration value="SAGLIK_OPT"/&gt;
 *     &lt;enumeration value="SAGLIK_MED"/&gt;
 *     &lt;enumeration value="ABONELIK"/&gt;
 *     &lt;enumeration value="MAL_HIZMET"/&gt;
 *     &lt;enumeration value="DIGER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SGKIlaveFaturaTipi")
@XmlEnum
public enum SGKIlaveFaturaTipi {

    YOK,
    SAGLIK_ECZ,
    SAGLIK_HAS,
    SAGLIK_OPT,
    SAGLIK_MED,
    ABONELIK,
    MAL_HIZMET,
    DIGER;

    public String value() {
        return name();
    }

    public static SGKIlaveFaturaTipi fromValue(String v) {
        return valueOf(v);
    }

}
