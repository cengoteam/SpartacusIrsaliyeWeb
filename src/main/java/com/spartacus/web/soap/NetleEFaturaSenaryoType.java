
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetleEFaturaSenaryoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetleEFaturaSenaryoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TEMELFATURA"/&gt;
 *     &lt;enumeration value="TICARIFATURA"/&gt;
 *     &lt;enumeration value="YOLCUBERABERFATURA"/&gt;
 *     &lt;enumeration value="IHRACAT"/&gt;
 *     &lt;enumeration value="TEMELIRSALIYE"/&gt;
 *     &lt;enumeration value="EARSIVFATURA"/&gt;
 *     &lt;enumeration value="EARSIVBELGE"/&gt;
 *     &lt;enumeration value="OZELFATURA"/&gt;
 *     &lt;enumeration value="KAMU"/&gt;
 *     &lt;enumeration value="HKS"/&gt;
 *     &lt;enumeration value="STDKODFATURA"/&gt;
 *     &lt;enumeration value="EDOVIZBELGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetleEFaturaSenaryoType")
@XmlEnum
public enum NetleEFaturaSenaryoType {

    TEMELFATURA,
    TICARIFATURA,
    YOLCUBERABERFATURA,
    IHRACAT,
    TEMELIRSALIYE,
    EARSIVFATURA,
    EARSIVBELGE,
    OZELFATURA,
    KAMU,
    HKS,
    STDKODFATURA,
    EDOVIZBELGE;

    public String value() {
        return name();
    }

    public static NetleEFaturaSenaryoType fromValue(String v) {
        return valueOf(v);
    }

}
