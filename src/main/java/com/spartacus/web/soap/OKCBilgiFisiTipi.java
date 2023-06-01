
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OKCBilgiFisiTipi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OKCBilgiFisiTipi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YOK"/&gt;
 *     &lt;enumeration value="AVANS"/&gt;
 *     &lt;enumeration value="YEMEK_FIS"/&gt;
 *     &lt;enumeration value="E-FATURA"/&gt;
 *     &lt;enumeration value="E-FATURA_IRSALIYE"/&gt;
 *     &lt;enumeration value="E-ARSIV"/&gt;
 *     &lt;enumeration value="E-ARSIV_IRSALIYE"/&gt;
 *     &lt;enumeration value="FATURA"/&gt;
 *     &lt;enumeration value="OTOPARK"/&gt;
 *     &lt;enumeration value="FATURA_TAHSILAT"/&gt;
 *     &lt;enumeration value="FATURA_TAHSILAT_KOMISYONLU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OKCBilgiFisiTipi")
@XmlEnum
public enum OKCBilgiFisiTipi {

    YOK("YOK"),
    AVANS("AVANS"),
    YEMEK_FIS("YEMEK_FIS"),
    @XmlEnumValue("E-FATURA")
    E_FATURA("E-FATURA"),
    @XmlEnumValue("E-FATURA_IRSALIYE")
    E_FATURA_IRSALIYE("E-FATURA_IRSALIYE"),
    @XmlEnumValue("E-ARSIV")
    E_ARSIV("E-ARSIV"),
    @XmlEnumValue("E-ARSIV_IRSALIYE")
    E_ARSIV_IRSALIYE("E-ARSIV_IRSALIYE"),
    FATURA("FATURA"),
    OTOPARK("OTOPARK"),
    FATURA_TAHSILAT("FATURA_TAHSILAT"),
    FATURA_TAHSILAT_KOMISYONLU("FATURA_TAHSILAT_KOMISYONLU");
    private final String value;

    OKCBilgiFisiTipi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OKCBilgiFisiTipi fromValue(String v) {
        for (OKCBilgiFisiTipi c: OKCBilgiFisiTipi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
