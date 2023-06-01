
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KaynakDokumanTuru.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KaynakDokumanTuru"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EFATURA"/&gt;
 *     &lt;enumeration value="EARSIV"/&gt;
 *     &lt;enumeration value="EIRSALIYE"/&gt;
 *     &lt;enumeration value="EIRSALIYEYANIT"/&gt;
 *     &lt;enumeration value="EIHRACAT"/&gt;
 *     &lt;enumeration value="EMUSTAHSIL"/&gt;
 *     &lt;enumeration value="ESERBESTMESLEKMAKBUZU"/&gt;
 *     &lt;enumeration value="EGIDERPUSULASI"/&gt;
 *     &lt;enumeration value="EDOVIZALIMBELGESI"/&gt;
 *     &lt;enumeration value="EDOVIZSATIMBELGESI"/&gt;
 *     &lt;enumeration value="EADISYON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KaynakDokumanTuru")
@XmlEnum
public enum KaynakDokumanTuru {

    EFATURA,
    EARSIV,
    EIRSALIYE,
    EIRSALIYEYANIT,
    EIHRACAT,
    EMUSTAHSIL,
    ESERBESTMESLEKMAKBUZU,
    EGIDERPUSULASI,
    EDOVIZALIMBELGESI,
    EDOVIZSATIMBELGESI,
    EADISYON;

    public String value() {
        return name();
    }

    public static KaynakDokumanTuru fromValue(String v) {
        return valueOf(v);
    }

}
