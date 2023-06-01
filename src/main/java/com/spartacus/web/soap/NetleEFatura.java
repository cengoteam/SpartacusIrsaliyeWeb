
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetleEFatura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetleEFatura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}NetleBelge"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetleEFatura")
@XmlSeeAlso({
    NetleEIrsaliye.class,
    NetleESerbestMeslekMakbuzu.class,
    NetleEGiderPusulasi.class,
    NetleEIhracat.class,
    NetleEArsiv.class,
    NetleEIrsaliyeYanit.class,
    NetleEMustahsil.class
})
public class NetleEFatura
    extends NetleBelge
{


}
