
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModuleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModuleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="eArchive"/&gt;
 *     &lt;enumeration value="eInvoice"/&gt;
 *     &lt;enumeration value="eDispatch"/&gt;
 *     &lt;enumeration value="eTicket"/&gt;
 *     &lt;enumeration value="eSEVoucher"/&gt;
 *     &lt;enumeration value="EProducerReceipt"/&gt;
 *     &lt;enumeration value="eTab"/&gt;
 *     &lt;enumeration value="eCurrencyExchange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ModuleType")
@XmlEnum
public enum ModuleType {

    @XmlEnumValue("eArchive")
    E_ARCHIVE("eArchive"),
    @XmlEnumValue("eInvoice")
    E_INVOICE("eInvoice"),
    @XmlEnumValue("eDispatch")
    E_DISPATCH("eDispatch"),
    @XmlEnumValue("eTicket")
    E_TICKET("eTicket"),
    @XmlEnumValue("eSEVoucher")
    E_SE_VOUCHER("eSEVoucher"),
    @XmlEnumValue("EProducerReceipt")
    E_PRODUCER_RECEIPT("EProducerReceipt"),
    @XmlEnumValue("eTab")
    E_TAB("eTab"),
    @XmlEnumValue("eCurrencyExchange")
    E_CURRENCY_EXCHANGE("eCurrencyExchange");
    private final String value;

    ModuleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModuleType fromValue(String v) {
        for (ModuleType c: ModuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
