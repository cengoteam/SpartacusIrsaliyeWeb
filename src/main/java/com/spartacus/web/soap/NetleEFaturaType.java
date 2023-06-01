
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetleEFaturaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetleEFaturaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SATIS"/&gt;
 *     &lt;enumeration value="IADE"/&gt;
 *     &lt;enumeration value="TEVKIFAT"/&gt;
 *     &lt;enumeration value="ISTISNA"/&gt;
 *     &lt;enumeration value="OZELMATRAH"/&gt;
 *     &lt;enumeration value="IHRACKAYITLI"/&gt;
 *     &lt;enumeration value="SEVK"/&gt;
 *     &lt;enumeration value="SGK"/&gt;
 *     &lt;enumeration value="MATBUDAN"/&gt;
 *     &lt;enumeration value="KOMISYONCU"/&gt;
 *     &lt;enumeration value="HKSSATIS"/&gt;
 *     &lt;enumeration value="HKSKOMISYONCU"/&gt;
 *     &lt;enumeration value="TEVKIFATIADE"/&gt;
 *     &lt;enumeration value="ILAC_TIBBICIHAZ"/&gt;
 *     &lt;enumeration value="SATISIPTALIADE"/&gt;
 *     &lt;enumeration value="DOVIZALIMBELGESI"/&gt;
 *     &lt;enumeration value="DOVIZSATIMBELGESI"/&gt;
 *     &lt;enumeration value="ADISYON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetleEFaturaType")
@XmlEnum
public enum NetleEFaturaType {

    SATIS,
    IADE,
    TEVKIFAT,
    ISTISNA,
    OZELMATRAH,
    IHRACKAYITLI,
    SEVK,
    SGK,
    MATBUDAN,
    KOMISYONCU,
    HKSSATIS,
    HKSKOMISYONCU,
    TEVKIFATIADE,
    ILAC_TIBBICIHAZ,
    SATISIPTALIADE,
    DOVIZALIMBELGESI,
    DOVIZSATIMBELGESI,
    ADISYON;

    public String value() {
        return name();
    }

    public static NetleEFaturaType fromValue(String v) {
        return valueOf(v);
    }

}
