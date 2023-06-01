
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NetleBelge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetleBelge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ERPFatNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarkodUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Aciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DuzenlenmeTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Tip" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}NetleEFaturaType"/&gt;
 *         &lt;element name="Senaryo" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}NetleEFaturaSenaryoType"/&gt;
 *         &lt;element name="SiparisNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiparisTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IrsaliyeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IrsaliyeTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ToplamTutar" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="OdenecekToplamTutar" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DovizTipi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IskontoTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="VergilendirilecekToplamTutar" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="YuvarlamaTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="VergiMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KDVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KDVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KKDFKesintiMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KKDFKesintiTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PetrolDogalgazOTVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PetrolDogalgazOTVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DayanikliTuketimOTVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DayanikliTuketimOTVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="AlkolluIcecekOTVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlkolluIcecekOTVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TutunMamulleriOTVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TutunMamulleriOTVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KolaliGazozOTVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KolaliGazozOTVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DVKanun5035MuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVKanun5035Tutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="OIVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OIVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="OIVKanun5035MuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OIVKanun5035Tutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KDVTevkifatMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KDVTevkifatTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BSMVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BSMVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MotorluTasitlarOTVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MotorluTasitlarOTVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BorsaTescilUcretMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BorsaTescilUcretTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="EnerjiFonuMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnerjiFonuTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BelediyeTuketimVergisiMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BelediyeTuketimVergisiTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TRTPayiMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRTPayiTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ElektrikTuketimVergisiMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ElektrikTuketimVergisiTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="StopajMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopajTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TelsizKullanimAylikTaksitMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelsizKullanimAylikTaksitTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TelsizRuhsatUcretiMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelsizRuhsatUcretiTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CevreTemizlikVergisiMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CevreTemizlikVergisiTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="XsltPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToplamTutarDovizTipi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToplamTutarDovizKuru" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="OdemeDovizTipi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OdemeDovizKuru" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Tedarikci" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}Tedarikci" minOccurs="0"/&gt;
 *         &lt;element name="Musteri" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}Musteri" minOccurs="0"/&gt;
 *         &lt;element name="FaturaKalemleri" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfFaturaKalemi" minOccurs="0"/&gt;
 *         &lt;element name="Vergiler" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfVergi" minOccurs="0"/&gt;
 *         &lt;element name="EkSahalar" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfEkSaha" minOccurs="0"/&gt;
 *         &lt;element name="EkAciklamalar" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="ArtirimTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="VergilerDahilTutar" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="VergilerHaricTutar" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Irsaliyeler" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfIrsaliye" minOccurs="0"/&gt;
 *         &lt;element name="KDVMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KKDFKesintiMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PetrolDogalgazOTVMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DayanikliTuketimOTVMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="AlkolluIcecekOTVMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TutunMamulleriOTVMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KolaliGazozOTVMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DVMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DVKanun5035Matrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="OIVMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="OIVKanun5035Matrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KDVTevkifatMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BSMVMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MotorluTasitlarOTVMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BorsaTescilUcretMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="EnerjiFonuMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BelediyeTuketimVergisiMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TRTPayiMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ElektrikTuketimVergisiMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="StopajMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TelsizKullanimAylikTaksitMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TelsizRuhsatUcretiMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CevreTemizlikVergisiMatrahi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="VergiTemsilcisi" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}VergiTemsilcisi" minOccurs="0"/&gt;
 *         &lt;element name="SaticiTedarikcisi" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}SaticiTedarikcisi" minOccurs="0"/&gt;
 *         &lt;element name="AliciMusteri" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}AliciMusteri" minOccurs="0"/&gt;
 *         &lt;element name="SaticiSiparisNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiparisTuruKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OKCBilgiFisleri" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfOKCBilgiFisi" minOccurs="0"/&gt;
 *         &lt;element name="KaynakDokumanTuru" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}KaynakDokumanTuru"/&gt;
 *         &lt;element name="Gonderi" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}Gonderi" minOccurs="0"/&gt;
 *         &lt;element name="SevkIrsaliye" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}SevkIrsaliye" minOccurs="0"/&gt;
 *         &lt;element name="SGKOzelFaturaAlanlari" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}SGKOzelFaturaAlanlari" minOccurs="0"/&gt;
 *         &lt;element name="GonderimTipi" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}GonderimTipi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetleBelge", propOrder = {
    "guid",
    "no",
    "erpFatNo",
    "barkodUrl",
    "aciklama",
    "duzenlenmeTarihi",
    "tip",
    "senaryo",
    "siparisNo",
    "siparisTarihi",
    "irsaliyeNo",
    "irsaliyeTarihi",
    "toplamTutar",
    "odenecekToplamTutar",
    "dovizTipi",
    "iskontoTutari",
    "vergilendirilecekToplamTutar",
    "yuvarlamaTutari",
    "vergiMuafiyetNedeni",
    "kdvMuafiyetNedeni",
    "kdvTutari",
    "kkdfKesintiMuafiyetNedeni",
    "kkdfKesintiTutari",
    "petrolDogalgazOTVMuafiyetNedeni",
    "petrolDogalgazOTVTutari",
    "dayanikliTuketimOTVMuafiyetNedeni",
    "dayanikliTuketimOTVTutari",
    "alkolluIcecekOTVMuafiyetNedeni",
    "alkolluIcecekOTVTutari",
    "tutunMamulleriOTVMuafiyetNedeni",
    "tutunMamulleriOTVTutari",
    "kolaliGazozOTVMuafiyetNedeni",
    "kolaliGazozOTVTutari",
    "dvMuafiyetNedeni",
    "dvTutari",
    "dvKanun5035MuafiyetNedeni",
    "dvKanun5035Tutari",
    "oivMuafiyetNedeni",
    "oivTutari",
    "oivKanun5035MuafiyetNedeni",
    "oivKanun5035Tutari",
    "kdvTevkifatMuafiyetNedeni",
    "kdvTevkifatTutari",
    "bsmvMuafiyetNedeni",
    "bsmvTutari",
    "motorluTasitlarOTVMuafiyetNedeni",
    "motorluTasitlarOTVTutari",
    "borsaTescilUcretMuafiyetNedeni",
    "borsaTescilUcretTutari",
    "enerjiFonuMuafiyetNedeni",
    "enerjiFonuTutari",
    "belediyeTuketimVergisiMuafiyetNedeni",
    "belediyeTuketimVergisiTutari",
    "trtPayiMuafiyetNedeni",
    "trtPayiTutari",
    "elektrikTuketimVergisiMuafiyetNedeni",
    "elektrikTuketimVergisiTutari",
    "stopajMuafiyetNedeni",
    "stopajTutari",
    "telsizKullanimAylikTaksitMuafiyetNedeni",
    "telsizKullanimAylikTaksitTutari",
    "telsizRuhsatUcretiMuafiyetNedeni",
    "telsizRuhsatUcretiTutari",
    "cevreTemizlikVergisiMuafiyetNedeni",
    "cevreTemizlikVergisiTutari",
    "xsltPath",
    "toplamTutarDovizTipi",
    "toplamTutarDovizKuru",
    "odemeDovizTipi",
    "odemeDovizKuru",
    "tedarikci",
    "musteri",
    "faturaKalemleri",
    "vergiler",
    "ekSahalar",
    "ekAciklamalar",
    "artirimTutari",
    "vergilerDahilTutar",
    "vergilerHaricTutar",
    "irsaliyeler",
    "kdvMatrahi",
    "kkdfKesintiMatrahi",
    "petrolDogalgazOTVMatrahi",
    "dayanikliTuketimOTVMatrahi",
    "alkolluIcecekOTVMatrahi",
    "tutunMamulleriOTVMatrahi",
    "kolaliGazozOTVMatrahi",
    "dvMatrahi",
    "dvKanun5035Matrahi",
    "oivMatrahi",
    "oivKanun5035Matrahi",
    "kdvTevkifatMatrahi",
    "bsmvMatrahi",
    "motorluTasitlarOTVMatrahi",
    "borsaTescilUcretMatrahi",
    "enerjiFonuMatrahi",
    "belediyeTuketimVergisiMatrahi",
    "trtPayiMatrahi",
    "elektrikTuketimVergisiMatrahi",
    "stopajMatrahi",
    "telsizKullanimAylikTaksitMatrahi",
    "telsizRuhsatUcretiMatrahi",
    "cevreTemizlikVergisiMatrahi",
    "vergiTemsilcisi",
    "saticiTedarikcisi",
    "aliciMusteri",
    "saticiSiparisNo",
    "siparisTuruKodu",
    "okcBilgiFisleri",
    "kaynakDokumanTuru",
    "gonderi",
    "sevkIrsaliye",
    "sgkOzelFaturaAlanlari",
    "gonderimTipi"
})
@XmlSeeAlso({
    NetleEFatura.class
})
public abstract class NetleBelge {

    @XmlElement(name = "GUID")
    protected String guid;
    @XmlElement(name = "No")
    protected String no;
    @XmlElement(name = "ERPFatNo")
    protected String erpFatNo;
    @XmlElement(name = "BarkodUrl")
    protected String barkodUrl;
    @XmlElement(name = "Aciklama")
    protected String aciklama;
    @XmlElement(name = "DuzenlenmeTarihi", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar duzenlenmeTarihi;
    @XmlElement(name = "Tip", required = true)
    @XmlSchemaType(name = "string")
    protected NetleEFaturaType tip;
    @XmlElement(name = "Senaryo", required = true)
    @XmlSchemaType(name = "string")
    protected NetleEFaturaSenaryoType senaryo;
    @XmlElement(name = "SiparisNo")
    protected String siparisNo;
    @XmlElement(name = "SiparisTarihi")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar siparisTarihi;
    @XmlElement(name = "IrsaliyeNo")
    protected String irsaliyeNo;
    @XmlElement(name = "IrsaliyeTarihi")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar irsaliyeTarihi;
    @XmlElement(name = "ToplamTutar")
    protected double toplamTutar;
    @XmlElement(name = "OdenecekToplamTutar")
    protected double odenecekToplamTutar;
    @XmlElement(name = "DovizTipi")
    protected String dovizTipi;
    @XmlElement(name = "IskontoTutari")
    protected double iskontoTutari;
    @XmlElement(name = "VergilendirilecekToplamTutar")
    protected double vergilendirilecekToplamTutar;
    @XmlElement(name = "YuvarlamaTutari")
    protected double yuvarlamaTutari;
    @XmlElement(name = "VergiMuafiyetNedeni")
    protected String vergiMuafiyetNedeni;
    @XmlElement(name = "KDVMuafiyetNedeni")
    protected String kdvMuafiyetNedeni;
    @XmlElement(name = "KDVTutari")
    protected double kdvTutari;
    @XmlElement(name = "KKDFKesintiMuafiyetNedeni")
    protected String kkdfKesintiMuafiyetNedeni;
    @XmlElement(name = "KKDFKesintiTutari")
    protected double kkdfKesintiTutari;
    @XmlElement(name = "PetrolDogalgazOTVMuafiyetNedeni")
    protected String petrolDogalgazOTVMuafiyetNedeni;
    @XmlElement(name = "PetrolDogalgazOTVTutari")
    protected double petrolDogalgazOTVTutari;
    @XmlElement(name = "DayanikliTuketimOTVMuafiyetNedeni")
    protected String dayanikliTuketimOTVMuafiyetNedeni;
    @XmlElement(name = "DayanikliTuketimOTVTutari")
    protected double dayanikliTuketimOTVTutari;
    @XmlElement(name = "AlkolluIcecekOTVMuafiyetNedeni")
    protected String alkolluIcecekOTVMuafiyetNedeni;
    @XmlElement(name = "AlkolluIcecekOTVTutari")
    protected double alkolluIcecekOTVTutari;
    @XmlElement(name = "TutunMamulleriOTVMuafiyetNedeni")
    protected String tutunMamulleriOTVMuafiyetNedeni;
    @XmlElement(name = "TutunMamulleriOTVTutari")
    protected double tutunMamulleriOTVTutari;
    @XmlElement(name = "KolaliGazozOTVMuafiyetNedeni")
    protected String kolaliGazozOTVMuafiyetNedeni;
    @XmlElement(name = "KolaliGazozOTVTutari")
    protected double kolaliGazozOTVTutari;
    @XmlElement(name = "DVMuafiyetNedeni")
    protected String dvMuafiyetNedeni;
    @XmlElement(name = "DVTutari")
    protected double dvTutari;
    @XmlElement(name = "DVKanun5035MuafiyetNedeni")
    protected String dvKanun5035MuafiyetNedeni;
    @XmlElement(name = "DVKanun5035Tutari")
    protected double dvKanun5035Tutari;
    @XmlElement(name = "OIVMuafiyetNedeni")
    protected String oivMuafiyetNedeni;
    @XmlElement(name = "OIVTutari")
    protected double oivTutari;
    @XmlElement(name = "OIVKanun5035MuafiyetNedeni")
    protected String oivKanun5035MuafiyetNedeni;
    @XmlElement(name = "OIVKanun5035Tutari")
    protected double oivKanun5035Tutari;
    @XmlElement(name = "KDVTevkifatMuafiyetNedeni")
    protected String kdvTevkifatMuafiyetNedeni;
    @XmlElement(name = "KDVTevkifatTutari")
    protected double kdvTevkifatTutari;
    @XmlElement(name = "BSMVMuafiyetNedeni")
    protected String bsmvMuafiyetNedeni;
    @XmlElement(name = "BSMVTutari")
    protected double bsmvTutari;
    @XmlElement(name = "MotorluTasitlarOTVMuafiyetNedeni")
    protected String motorluTasitlarOTVMuafiyetNedeni;
    @XmlElement(name = "MotorluTasitlarOTVTutari")
    protected double motorluTasitlarOTVTutari;
    @XmlElement(name = "BorsaTescilUcretMuafiyetNedeni")
    protected String borsaTescilUcretMuafiyetNedeni;
    @XmlElement(name = "BorsaTescilUcretTutari")
    protected double borsaTescilUcretTutari;
    @XmlElement(name = "EnerjiFonuMuafiyetNedeni")
    protected String enerjiFonuMuafiyetNedeni;
    @XmlElement(name = "EnerjiFonuTutari")
    protected double enerjiFonuTutari;
    @XmlElement(name = "BelediyeTuketimVergisiMuafiyetNedeni")
    protected String belediyeTuketimVergisiMuafiyetNedeni;
    @XmlElement(name = "BelediyeTuketimVergisiTutari")
    protected double belediyeTuketimVergisiTutari;
    @XmlElement(name = "TRTPayiMuafiyetNedeni")
    protected String trtPayiMuafiyetNedeni;
    @XmlElement(name = "TRTPayiTutari")
    protected double trtPayiTutari;
    @XmlElement(name = "ElektrikTuketimVergisiMuafiyetNedeni")
    protected String elektrikTuketimVergisiMuafiyetNedeni;
    @XmlElement(name = "ElektrikTuketimVergisiTutari")
    protected double elektrikTuketimVergisiTutari;
    @XmlElement(name = "StopajMuafiyetNedeni")
    protected String stopajMuafiyetNedeni;
    @XmlElement(name = "StopajTutari")
    protected double stopajTutari;
    @XmlElement(name = "TelsizKullanimAylikTaksitMuafiyetNedeni")
    protected String telsizKullanimAylikTaksitMuafiyetNedeni;
    @XmlElement(name = "TelsizKullanimAylikTaksitTutari")
    protected double telsizKullanimAylikTaksitTutari;
    @XmlElement(name = "TelsizRuhsatUcretiMuafiyetNedeni")
    protected String telsizRuhsatUcretiMuafiyetNedeni;
    @XmlElement(name = "TelsizRuhsatUcretiTutari")
    protected double telsizRuhsatUcretiTutari;
    @XmlElement(name = "CevreTemizlikVergisiMuafiyetNedeni")
    protected String cevreTemizlikVergisiMuafiyetNedeni;
    @XmlElement(name = "CevreTemizlikVergisiTutari")
    protected double cevreTemizlikVergisiTutari;
    @XmlElement(name = "XsltPath")
    protected String xsltPath;
    @XmlElement(name = "ToplamTutarDovizTipi")
    protected String toplamTutarDovizTipi;
    @XmlElement(name = "ToplamTutarDovizKuru")
    protected double toplamTutarDovizKuru;
    @XmlElement(name = "OdemeDovizTipi")
    protected String odemeDovizTipi;
    @XmlElement(name = "OdemeDovizKuru")
    protected double odemeDovizKuru;
    @XmlElement(name = "Tedarikci")
    protected Tedarikci tedarikci;
    @XmlElement(name = "Musteri")
    protected Musteri musteri;
    @XmlElement(name = "FaturaKalemleri")
    protected ArrayOfFaturaKalemi faturaKalemleri;
    @XmlElement(name = "Vergiler")
    protected ArrayOfVergi vergiler;
    @XmlElement(name = "EkSahalar")
    protected ArrayOfEkSaha ekSahalar;
    @XmlElement(name = "EkAciklamalar")
    protected ArrayOfString ekAciklamalar;
    @XmlElement(name = "ArtirimTutari")
    protected double artirimTutari;
    @XmlElement(name = "VergilerDahilTutar")
    protected double vergilerDahilTutar;
    @XmlElement(name = "VergilerHaricTutar")
    protected double vergilerHaricTutar;
    @XmlElement(name = "Irsaliyeler")
    protected ArrayOfIrsaliye irsaliyeler;
    @XmlElement(name = "KDVMatrahi")
    protected double kdvMatrahi;
    @XmlElement(name = "KKDFKesintiMatrahi")
    protected double kkdfKesintiMatrahi;
    @XmlElement(name = "PetrolDogalgazOTVMatrahi")
    protected double petrolDogalgazOTVMatrahi;
    @XmlElement(name = "DayanikliTuketimOTVMatrahi")
    protected double dayanikliTuketimOTVMatrahi;
    @XmlElement(name = "AlkolluIcecekOTVMatrahi")
    protected double alkolluIcecekOTVMatrahi;
    @XmlElement(name = "TutunMamulleriOTVMatrahi")
    protected double tutunMamulleriOTVMatrahi;
    @XmlElement(name = "KolaliGazozOTVMatrahi")
    protected double kolaliGazozOTVMatrahi;
    @XmlElement(name = "DVMatrahi")
    protected double dvMatrahi;
    @XmlElement(name = "DVKanun5035Matrahi")
    protected double dvKanun5035Matrahi;
    @XmlElement(name = "OIVMatrahi")
    protected double oivMatrahi;
    @XmlElement(name = "OIVKanun5035Matrahi")
    protected double oivKanun5035Matrahi;
    @XmlElement(name = "KDVTevkifatMatrahi")
    protected double kdvTevkifatMatrahi;
    @XmlElement(name = "BSMVMatrahi")
    protected double bsmvMatrahi;
    @XmlElement(name = "MotorluTasitlarOTVMatrahi")
    protected double motorluTasitlarOTVMatrahi;
    @XmlElement(name = "BorsaTescilUcretMatrahi")
    protected double borsaTescilUcretMatrahi;
    @XmlElement(name = "EnerjiFonuMatrahi")
    protected double enerjiFonuMatrahi;
    @XmlElement(name = "BelediyeTuketimVergisiMatrahi")
    protected double belediyeTuketimVergisiMatrahi;
    @XmlElement(name = "TRTPayiMatrahi")
    protected double trtPayiMatrahi;
    @XmlElement(name = "ElektrikTuketimVergisiMatrahi")
    protected double elektrikTuketimVergisiMatrahi;
    @XmlElement(name = "StopajMatrahi")
    protected double stopajMatrahi;
    @XmlElement(name = "TelsizKullanimAylikTaksitMatrahi")
    protected double telsizKullanimAylikTaksitMatrahi;
    @XmlElement(name = "TelsizRuhsatUcretiMatrahi")
    protected double telsizRuhsatUcretiMatrahi;
    @XmlElement(name = "CevreTemizlikVergisiMatrahi")
    protected double cevreTemizlikVergisiMatrahi;
    @XmlElement(name = "VergiTemsilcisi")
    protected VergiTemsilcisi vergiTemsilcisi;
    @XmlElement(name = "SaticiTedarikcisi")
    protected SaticiTedarikcisi saticiTedarikcisi;
    @XmlElement(name = "AliciMusteri")
    protected AliciMusteri aliciMusteri;
    @XmlElement(name = "SaticiSiparisNo")
    protected String saticiSiparisNo;
    @XmlElement(name = "SiparisTuruKodu")
    protected String siparisTuruKodu;
    @XmlElement(name = "OKCBilgiFisleri")
    protected ArrayOfOKCBilgiFisi okcBilgiFisleri;
    @XmlElement(name = "KaynakDokumanTuru", required = true)
    @XmlSchemaType(name = "string")
    protected KaynakDokumanTuru kaynakDokumanTuru;
    @XmlElement(name = "Gonderi")
    protected Gonderi gonderi;
    @XmlElement(name = "SevkIrsaliye")
    protected SevkIrsaliye sevkIrsaliye;
    @XmlElement(name = "SGKOzelFaturaAlanlari")
    protected SGKOzelFaturaAlanlari sgkOzelFaturaAlanlari;
    @XmlElement(name = "GonderimTipi", required = true)
    @XmlSchemaType(name = "string")
    protected GonderimTipi gonderimTipi;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo(String value) {
        this.no = value;
    }

    /**
     * Gets the value of the erpFatNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERPFatNo() {
        return erpFatNo;
    }

    /**
     * Sets the value of the erpFatNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERPFatNo(String value) {
        this.erpFatNo = value;
    }

    /**
     * Gets the value of the barkodUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarkodUrl() {
        return barkodUrl;
    }

    /**
     * Sets the value of the barkodUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarkodUrl(String value) {
        this.barkodUrl = value;
    }

    /**
     * Gets the value of the aciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAciklama() {
        return aciklama;
    }

    /**
     * Sets the value of the aciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAciklama(String value) {
        this.aciklama = value;
    }

    /**
     * Gets the value of the duzenlenmeTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDuzenlenmeTarihi() {
        return duzenlenmeTarihi;
    }

    /**
     * Sets the value of the duzenlenmeTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDuzenlenmeTarihi(XMLGregorianCalendar value) {
        this.duzenlenmeTarihi = value;
    }

    /**
     * Gets the value of the tip property.
     * 
     * @return
     *     possible object is
     *     {@link NetleEFaturaType }
     *     
     */
    public NetleEFaturaType getTip() {
        return tip;
    }

    /**
     * Sets the value of the tip property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetleEFaturaType }
     *     
     */
    public void setTip(NetleEFaturaType value) {
        this.tip = value;
    }

    /**
     * Gets the value of the senaryo property.
     * 
     * @return
     *     possible object is
     *     {@link NetleEFaturaSenaryoType }
     *     
     */
    public NetleEFaturaSenaryoType getSenaryo() {
        return senaryo;
    }

    /**
     * Sets the value of the senaryo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetleEFaturaSenaryoType }
     *     
     */
    public void setSenaryo(NetleEFaturaSenaryoType value) {
        this.senaryo = value;
    }

    /**
     * Gets the value of the siparisNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiparisNo() {
        return siparisNo;
    }

    /**
     * Sets the value of the siparisNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiparisNo(String value) {
        this.siparisNo = value;
    }

    /**
     * Gets the value of the siparisTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSiparisTarihi() {
        return siparisTarihi;
    }

    /**
     * Sets the value of the siparisTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSiparisTarihi(XMLGregorianCalendar value) {
        this.siparisTarihi = value;
    }

    /**
     * Gets the value of the irsaliyeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIrsaliyeNo() {
        return irsaliyeNo;
    }

    /**
     * Sets the value of the irsaliyeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIrsaliyeNo(String value) {
        this.irsaliyeNo = value;
    }

    /**
     * Gets the value of the irsaliyeTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIrsaliyeTarihi() {
        return irsaliyeTarihi;
    }

    /**
     * Sets the value of the irsaliyeTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIrsaliyeTarihi(XMLGregorianCalendar value) {
        this.irsaliyeTarihi = value;
    }

    /**
     * Gets the value of the toplamTutar property.
     * 
     */
    public double getToplamTutar() {
        return toplamTutar;
    }

    /**
     * Sets the value of the toplamTutar property.
     * 
     */
    public void setToplamTutar(double value) {
        this.toplamTutar = value;
    }

    /**
     * Gets the value of the odenecekToplamTutar property.
     * 
     */
    public double getOdenecekToplamTutar() {
        return odenecekToplamTutar;
    }

    /**
     * Sets the value of the odenecekToplamTutar property.
     * 
     */
    public void setOdenecekToplamTutar(double value) {
        this.odenecekToplamTutar = value;
    }

    /**
     * Gets the value of the dovizTipi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDovizTipi() {
        return dovizTipi;
    }

    /**
     * Sets the value of the dovizTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDovizTipi(String value) {
        this.dovizTipi = value;
    }

    /**
     * Gets the value of the iskontoTutari property.
     * 
     */
    public double getIskontoTutari() {
        return iskontoTutari;
    }

    /**
     * Sets the value of the iskontoTutari property.
     * 
     */
    public void setIskontoTutari(double value) {
        this.iskontoTutari = value;
    }

    /**
     * Gets the value of the vergilendirilecekToplamTutar property.
     * 
     */
    public double getVergilendirilecekToplamTutar() {
        return vergilendirilecekToplamTutar;
    }

    /**
     * Sets the value of the vergilendirilecekToplamTutar property.
     * 
     */
    public void setVergilendirilecekToplamTutar(double value) {
        this.vergilendirilecekToplamTutar = value;
    }

    /**
     * Gets the value of the yuvarlamaTutari property.
     * 
     */
    public double getYuvarlamaTutari() {
        return yuvarlamaTutari;
    }

    /**
     * Sets the value of the yuvarlamaTutari property.
     * 
     */
    public void setYuvarlamaTutari(double value) {
        this.yuvarlamaTutari = value;
    }

    /**
     * Gets the value of the vergiMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVergiMuafiyetNedeni() {
        return vergiMuafiyetNedeni;
    }

    /**
     * Sets the value of the vergiMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVergiMuafiyetNedeni(String value) {
        this.vergiMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the kdvMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDVMuafiyetNedeni() {
        return kdvMuafiyetNedeni;
    }

    /**
     * Sets the value of the kdvMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDVMuafiyetNedeni(String value) {
        this.kdvMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the kdvTutari property.
     * 
     */
    public double getKDVTutari() {
        return kdvTutari;
    }

    /**
     * Sets the value of the kdvTutari property.
     * 
     */
    public void setKDVTutari(double value) {
        this.kdvTutari = value;
    }

    /**
     * Gets the value of the kkdfKesintiMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKKDFKesintiMuafiyetNedeni() {
        return kkdfKesintiMuafiyetNedeni;
    }

    /**
     * Sets the value of the kkdfKesintiMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKKDFKesintiMuafiyetNedeni(String value) {
        this.kkdfKesintiMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the kkdfKesintiTutari property.
     * 
     */
    public double getKKDFKesintiTutari() {
        return kkdfKesintiTutari;
    }

    /**
     * Sets the value of the kkdfKesintiTutari property.
     * 
     */
    public void setKKDFKesintiTutari(double value) {
        this.kkdfKesintiTutari = value;
    }

    /**
     * Gets the value of the petrolDogalgazOTVMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPetrolDogalgazOTVMuafiyetNedeni() {
        return petrolDogalgazOTVMuafiyetNedeni;
    }

    /**
     * Sets the value of the petrolDogalgazOTVMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPetrolDogalgazOTVMuafiyetNedeni(String value) {
        this.petrolDogalgazOTVMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the petrolDogalgazOTVTutari property.
     * 
     */
    public double getPetrolDogalgazOTVTutari() {
        return petrolDogalgazOTVTutari;
    }

    /**
     * Sets the value of the petrolDogalgazOTVTutari property.
     * 
     */
    public void setPetrolDogalgazOTVTutari(double value) {
        this.petrolDogalgazOTVTutari = value;
    }

    /**
     * Gets the value of the dayanikliTuketimOTVMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayanikliTuketimOTVMuafiyetNedeni() {
        return dayanikliTuketimOTVMuafiyetNedeni;
    }

    /**
     * Sets the value of the dayanikliTuketimOTVMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayanikliTuketimOTVMuafiyetNedeni(String value) {
        this.dayanikliTuketimOTVMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the dayanikliTuketimOTVTutari property.
     * 
     */
    public double getDayanikliTuketimOTVTutari() {
        return dayanikliTuketimOTVTutari;
    }

    /**
     * Sets the value of the dayanikliTuketimOTVTutari property.
     * 
     */
    public void setDayanikliTuketimOTVTutari(double value) {
        this.dayanikliTuketimOTVTutari = value;
    }

    /**
     * Gets the value of the alkolluIcecekOTVMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlkolluIcecekOTVMuafiyetNedeni() {
        return alkolluIcecekOTVMuafiyetNedeni;
    }

    /**
     * Sets the value of the alkolluIcecekOTVMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlkolluIcecekOTVMuafiyetNedeni(String value) {
        this.alkolluIcecekOTVMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the alkolluIcecekOTVTutari property.
     * 
     */
    public double getAlkolluIcecekOTVTutari() {
        return alkolluIcecekOTVTutari;
    }

    /**
     * Sets the value of the alkolluIcecekOTVTutari property.
     * 
     */
    public void setAlkolluIcecekOTVTutari(double value) {
        this.alkolluIcecekOTVTutari = value;
    }

    /**
     * Gets the value of the tutunMamulleriOTVMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTutunMamulleriOTVMuafiyetNedeni() {
        return tutunMamulleriOTVMuafiyetNedeni;
    }

    /**
     * Sets the value of the tutunMamulleriOTVMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTutunMamulleriOTVMuafiyetNedeni(String value) {
        this.tutunMamulleriOTVMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the tutunMamulleriOTVTutari property.
     * 
     */
    public double getTutunMamulleriOTVTutari() {
        return tutunMamulleriOTVTutari;
    }

    /**
     * Sets the value of the tutunMamulleriOTVTutari property.
     * 
     */
    public void setTutunMamulleriOTVTutari(double value) {
        this.tutunMamulleriOTVTutari = value;
    }

    /**
     * Gets the value of the kolaliGazozOTVMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKolaliGazozOTVMuafiyetNedeni() {
        return kolaliGazozOTVMuafiyetNedeni;
    }

    /**
     * Sets the value of the kolaliGazozOTVMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKolaliGazozOTVMuafiyetNedeni(String value) {
        this.kolaliGazozOTVMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the kolaliGazozOTVTutari property.
     * 
     */
    public double getKolaliGazozOTVTutari() {
        return kolaliGazozOTVTutari;
    }

    /**
     * Sets the value of the kolaliGazozOTVTutari property.
     * 
     */
    public void setKolaliGazozOTVTutari(double value) {
        this.kolaliGazozOTVTutari = value;
    }

    /**
     * Gets the value of the dvMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVMuafiyetNedeni() {
        return dvMuafiyetNedeni;
    }

    /**
     * Sets the value of the dvMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVMuafiyetNedeni(String value) {
        this.dvMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the dvTutari property.
     * 
     */
    public double getDVTutari() {
        return dvTutari;
    }

    /**
     * Sets the value of the dvTutari property.
     * 
     */
    public void setDVTutari(double value) {
        this.dvTutari = value;
    }

    /**
     * Gets the value of the dvKanun5035MuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVKanun5035MuafiyetNedeni() {
        return dvKanun5035MuafiyetNedeni;
    }

    /**
     * Sets the value of the dvKanun5035MuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVKanun5035MuafiyetNedeni(String value) {
        this.dvKanun5035MuafiyetNedeni = value;
    }

    /**
     * Gets the value of the dvKanun5035Tutari property.
     * 
     */
    public double getDVKanun5035Tutari() {
        return dvKanun5035Tutari;
    }

    /**
     * Sets the value of the dvKanun5035Tutari property.
     * 
     */
    public void setDVKanun5035Tutari(double value) {
        this.dvKanun5035Tutari = value;
    }

    /**
     * Gets the value of the oivMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOIVMuafiyetNedeni() {
        return oivMuafiyetNedeni;
    }

    /**
     * Sets the value of the oivMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOIVMuafiyetNedeni(String value) {
        this.oivMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the oivTutari property.
     * 
     */
    public double getOIVTutari() {
        return oivTutari;
    }

    /**
     * Sets the value of the oivTutari property.
     * 
     */
    public void setOIVTutari(double value) {
        this.oivTutari = value;
    }

    /**
     * Gets the value of the oivKanun5035MuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOIVKanun5035MuafiyetNedeni() {
        return oivKanun5035MuafiyetNedeni;
    }

    /**
     * Sets the value of the oivKanun5035MuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOIVKanun5035MuafiyetNedeni(String value) {
        this.oivKanun5035MuafiyetNedeni = value;
    }

    /**
     * Gets the value of the oivKanun5035Tutari property.
     * 
     */
    public double getOIVKanun5035Tutari() {
        return oivKanun5035Tutari;
    }

    /**
     * Sets the value of the oivKanun5035Tutari property.
     * 
     */
    public void setOIVKanun5035Tutari(double value) {
        this.oivKanun5035Tutari = value;
    }

    /**
     * Gets the value of the kdvTevkifatMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDVTevkifatMuafiyetNedeni() {
        return kdvTevkifatMuafiyetNedeni;
    }

    /**
     * Sets the value of the kdvTevkifatMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDVTevkifatMuafiyetNedeni(String value) {
        this.kdvTevkifatMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the kdvTevkifatTutari property.
     * 
     */
    public double getKDVTevkifatTutari() {
        return kdvTevkifatTutari;
    }

    /**
     * Sets the value of the kdvTevkifatTutari property.
     * 
     */
    public void setKDVTevkifatTutari(double value) {
        this.kdvTevkifatTutari = value;
    }

    /**
     * Gets the value of the bsmvMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSMVMuafiyetNedeni() {
        return bsmvMuafiyetNedeni;
    }

    /**
     * Sets the value of the bsmvMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSMVMuafiyetNedeni(String value) {
        this.bsmvMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the bsmvTutari property.
     * 
     */
    public double getBSMVTutari() {
        return bsmvTutari;
    }

    /**
     * Sets the value of the bsmvTutari property.
     * 
     */
    public void setBSMVTutari(double value) {
        this.bsmvTutari = value;
    }

    /**
     * Gets the value of the motorluTasitlarOTVMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotorluTasitlarOTVMuafiyetNedeni() {
        return motorluTasitlarOTVMuafiyetNedeni;
    }

    /**
     * Sets the value of the motorluTasitlarOTVMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotorluTasitlarOTVMuafiyetNedeni(String value) {
        this.motorluTasitlarOTVMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the motorluTasitlarOTVTutari property.
     * 
     */
    public double getMotorluTasitlarOTVTutari() {
        return motorluTasitlarOTVTutari;
    }

    /**
     * Sets the value of the motorluTasitlarOTVTutari property.
     * 
     */
    public void setMotorluTasitlarOTVTutari(double value) {
        this.motorluTasitlarOTVTutari = value;
    }

    /**
     * Gets the value of the borsaTescilUcretMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorsaTescilUcretMuafiyetNedeni() {
        return borsaTescilUcretMuafiyetNedeni;
    }

    /**
     * Sets the value of the borsaTescilUcretMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorsaTescilUcretMuafiyetNedeni(String value) {
        this.borsaTescilUcretMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the borsaTescilUcretTutari property.
     * 
     */
    public double getBorsaTescilUcretTutari() {
        return borsaTescilUcretTutari;
    }

    /**
     * Sets the value of the borsaTescilUcretTutari property.
     * 
     */
    public void setBorsaTescilUcretTutari(double value) {
        this.borsaTescilUcretTutari = value;
    }

    /**
     * Gets the value of the enerjiFonuMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnerjiFonuMuafiyetNedeni() {
        return enerjiFonuMuafiyetNedeni;
    }

    /**
     * Sets the value of the enerjiFonuMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnerjiFonuMuafiyetNedeni(String value) {
        this.enerjiFonuMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the enerjiFonuTutari property.
     * 
     */
    public double getEnerjiFonuTutari() {
        return enerjiFonuTutari;
    }

    /**
     * Sets the value of the enerjiFonuTutari property.
     * 
     */
    public void setEnerjiFonuTutari(double value) {
        this.enerjiFonuTutari = value;
    }

    /**
     * Gets the value of the belediyeTuketimVergisiMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelediyeTuketimVergisiMuafiyetNedeni() {
        return belediyeTuketimVergisiMuafiyetNedeni;
    }

    /**
     * Sets the value of the belediyeTuketimVergisiMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelediyeTuketimVergisiMuafiyetNedeni(String value) {
        this.belediyeTuketimVergisiMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the belediyeTuketimVergisiTutari property.
     * 
     */
    public double getBelediyeTuketimVergisiTutari() {
        return belediyeTuketimVergisiTutari;
    }

    /**
     * Sets the value of the belediyeTuketimVergisiTutari property.
     * 
     */
    public void setBelediyeTuketimVergisiTutari(double value) {
        this.belediyeTuketimVergisiTutari = value;
    }

    /**
     * Gets the value of the trtPayiMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRTPayiMuafiyetNedeni() {
        return trtPayiMuafiyetNedeni;
    }

    /**
     * Sets the value of the trtPayiMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRTPayiMuafiyetNedeni(String value) {
        this.trtPayiMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the trtPayiTutari property.
     * 
     */
    public double getTRTPayiTutari() {
        return trtPayiTutari;
    }

    /**
     * Sets the value of the trtPayiTutari property.
     * 
     */
    public void setTRTPayiTutari(double value) {
        this.trtPayiTutari = value;
    }

    /**
     * Gets the value of the elektrikTuketimVergisiMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElektrikTuketimVergisiMuafiyetNedeni() {
        return elektrikTuketimVergisiMuafiyetNedeni;
    }

    /**
     * Sets the value of the elektrikTuketimVergisiMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElektrikTuketimVergisiMuafiyetNedeni(String value) {
        this.elektrikTuketimVergisiMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the elektrikTuketimVergisiTutari property.
     * 
     */
    public double getElektrikTuketimVergisiTutari() {
        return elektrikTuketimVergisiTutari;
    }

    /**
     * Sets the value of the elektrikTuketimVergisiTutari property.
     * 
     */
    public void setElektrikTuketimVergisiTutari(double value) {
        this.elektrikTuketimVergisiTutari = value;
    }

    /**
     * Gets the value of the stopajMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopajMuafiyetNedeni() {
        return stopajMuafiyetNedeni;
    }

    /**
     * Sets the value of the stopajMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopajMuafiyetNedeni(String value) {
        this.stopajMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the stopajTutari property.
     * 
     */
    public double getStopajTutari() {
        return stopajTutari;
    }

    /**
     * Sets the value of the stopajTutari property.
     * 
     */
    public void setStopajTutari(double value) {
        this.stopajTutari = value;
    }

    /**
     * Gets the value of the telsizKullanimAylikTaksitMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelsizKullanimAylikTaksitMuafiyetNedeni() {
        return telsizKullanimAylikTaksitMuafiyetNedeni;
    }

    /**
     * Sets the value of the telsizKullanimAylikTaksitMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelsizKullanimAylikTaksitMuafiyetNedeni(String value) {
        this.telsizKullanimAylikTaksitMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the telsizKullanimAylikTaksitTutari property.
     * 
     */
    public double getTelsizKullanimAylikTaksitTutari() {
        return telsizKullanimAylikTaksitTutari;
    }

    /**
     * Sets the value of the telsizKullanimAylikTaksitTutari property.
     * 
     */
    public void setTelsizKullanimAylikTaksitTutari(double value) {
        this.telsizKullanimAylikTaksitTutari = value;
    }

    /**
     * Gets the value of the telsizRuhsatUcretiMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelsizRuhsatUcretiMuafiyetNedeni() {
        return telsizRuhsatUcretiMuafiyetNedeni;
    }

    /**
     * Sets the value of the telsizRuhsatUcretiMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelsizRuhsatUcretiMuafiyetNedeni(String value) {
        this.telsizRuhsatUcretiMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the telsizRuhsatUcretiTutari property.
     * 
     */
    public double getTelsizRuhsatUcretiTutari() {
        return telsizRuhsatUcretiTutari;
    }

    /**
     * Sets the value of the telsizRuhsatUcretiTutari property.
     * 
     */
    public void setTelsizRuhsatUcretiTutari(double value) {
        this.telsizRuhsatUcretiTutari = value;
    }

    /**
     * Gets the value of the cevreTemizlikVergisiMuafiyetNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCevreTemizlikVergisiMuafiyetNedeni() {
        return cevreTemizlikVergisiMuafiyetNedeni;
    }

    /**
     * Sets the value of the cevreTemizlikVergisiMuafiyetNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCevreTemizlikVergisiMuafiyetNedeni(String value) {
        this.cevreTemizlikVergisiMuafiyetNedeni = value;
    }

    /**
     * Gets the value of the cevreTemizlikVergisiTutari property.
     * 
     */
    public double getCevreTemizlikVergisiTutari() {
        return cevreTemizlikVergisiTutari;
    }

    /**
     * Sets the value of the cevreTemizlikVergisiTutari property.
     * 
     */
    public void setCevreTemizlikVergisiTutari(double value) {
        this.cevreTemizlikVergisiTutari = value;
    }

    /**
     * Gets the value of the xsltPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXsltPath() {
        return xsltPath;
    }

    /**
     * Sets the value of the xsltPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXsltPath(String value) {
        this.xsltPath = value;
    }

    /**
     * Gets the value of the toplamTutarDovizTipi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToplamTutarDovizTipi() {
        return toplamTutarDovizTipi;
    }

    /**
     * Sets the value of the toplamTutarDovizTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToplamTutarDovizTipi(String value) {
        this.toplamTutarDovizTipi = value;
    }

    /**
     * Gets the value of the toplamTutarDovizKuru property.
     * 
     */
    public double getToplamTutarDovizKuru() {
        return toplamTutarDovizKuru;
    }

    /**
     * Sets the value of the toplamTutarDovizKuru property.
     * 
     */
    public void setToplamTutarDovizKuru(double value) {
        this.toplamTutarDovizKuru = value;
    }

    /**
     * Gets the value of the odemeDovizTipi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdemeDovizTipi() {
        return odemeDovizTipi;
    }

    /**
     * Sets the value of the odemeDovizTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdemeDovizTipi(String value) {
        this.odemeDovizTipi = value;
    }

    /**
     * Gets the value of the odemeDovizKuru property.
     * 
     */
    public double getOdemeDovizKuru() {
        return odemeDovizKuru;
    }

    /**
     * Sets the value of the odemeDovizKuru property.
     * 
     */
    public void setOdemeDovizKuru(double value) {
        this.odemeDovizKuru = value;
    }

    /**
     * Gets the value of the tedarikci property.
     * 
     * @return
     *     possible object is
     *     {@link Tedarikci }
     *     
     */
    public Tedarikci getTedarikci() {
        return tedarikci;
    }

    /**
     * Sets the value of the tedarikci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tedarikci }
     *     
     */
    public void setTedarikci(Tedarikci value) {
        this.tedarikci = value;
    }

    /**
     * Gets the value of the musteri property.
     * 
     * @return
     *     possible object is
     *     {@link Musteri }
     *     
     */
    public Musteri getMusteri() {
        return musteri;
    }

    /**
     * Sets the value of the musteri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Musteri }
     *     
     */
    public void setMusteri(Musteri value) {
        this.musteri = value;
    }

    /**
     * Gets the value of the faturaKalemleri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFaturaKalemi }
     *     
     */
    public ArrayOfFaturaKalemi getFaturaKalemleri() {
        return faturaKalemleri;
    }

    /**
     * Sets the value of the faturaKalemleri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFaturaKalemi }
     *     
     */
    public void setFaturaKalemleri(ArrayOfFaturaKalemi value) {
        this.faturaKalemleri = value;
    }

    /**
     * Gets the value of the vergiler property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVergi }
     *     
     */
    public ArrayOfVergi getVergiler() {
        return vergiler;
    }

    /**
     * Sets the value of the vergiler property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVergi }
     *     
     */
    public void setVergiler(ArrayOfVergi value) {
        this.vergiler = value;
    }

    /**
     * Gets the value of the ekSahalar property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEkSaha }
     *     
     */
    public ArrayOfEkSaha getEkSahalar() {
        return ekSahalar;
    }

    /**
     * Sets the value of the ekSahalar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEkSaha }
     *     
     */
    public void setEkSahalar(ArrayOfEkSaha value) {
        this.ekSahalar = value;
    }

    /**
     * Gets the value of the ekAciklamalar property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getEkAciklamalar() {
        return ekAciklamalar;
    }

    /**
     * Sets the value of the ekAciklamalar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setEkAciklamalar(ArrayOfString value) {
        this.ekAciklamalar = value;
    }

    /**
     * Gets the value of the artirimTutari property.
     * 
     */
    public double getArtirimTutari() {
        return artirimTutari;
    }

    /**
     * Sets the value of the artirimTutari property.
     * 
     */
    public void setArtirimTutari(double value) {
        this.artirimTutari = value;
    }

    /**
     * Gets the value of the vergilerDahilTutar property.
     * 
     */
    public double getVergilerDahilTutar() {
        return vergilerDahilTutar;
    }

    /**
     * Sets the value of the vergilerDahilTutar property.
     * 
     */
    public void setVergilerDahilTutar(double value) {
        this.vergilerDahilTutar = value;
    }

    /**
     * Gets the value of the vergilerHaricTutar property.
     * 
     */
    public double getVergilerHaricTutar() {
        return vergilerHaricTutar;
    }

    /**
     * Sets the value of the vergilerHaricTutar property.
     * 
     */
    public void setVergilerHaricTutar(double value) {
        this.vergilerHaricTutar = value;
    }

    /**
     * Gets the value of the irsaliyeler property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIrsaliye }
     *     
     */
    public ArrayOfIrsaliye getIrsaliyeler() {
        return irsaliyeler;
    }

    /**
     * Sets the value of the irsaliyeler property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIrsaliye }
     *     
     */
    public void setIrsaliyeler(ArrayOfIrsaliye value) {
        this.irsaliyeler = value;
    }

    /**
     * Gets the value of the kdvMatrahi property.
     * 
     */
    public double getKDVMatrahi() {
        return kdvMatrahi;
    }

    /**
     * Sets the value of the kdvMatrahi property.
     * 
     */
    public void setKDVMatrahi(double value) {
        this.kdvMatrahi = value;
    }

    /**
     * Gets the value of the kkdfKesintiMatrahi property.
     * 
     */
    public double getKKDFKesintiMatrahi() {
        return kkdfKesintiMatrahi;
    }

    /**
     * Sets the value of the kkdfKesintiMatrahi property.
     * 
     */
    public void setKKDFKesintiMatrahi(double value) {
        this.kkdfKesintiMatrahi = value;
    }

    /**
     * Gets the value of the petrolDogalgazOTVMatrahi property.
     * 
     */
    public double getPetrolDogalgazOTVMatrahi() {
        return petrolDogalgazOTVMatrahi;
    }

    /**
     * Sets the value of the petrolDogalgazOTVMatrahi property.
     * 
     */
    public void setPetrolDogalgazOTVMatrahi(double value) {
        this.petrolDogalgazOTVMatrahi = value;
    }

    /**
     * Gets the value of the dayanikliTuketimOTVMatrahi property.
     * 
     */
    public double getDayanikliTuketimOTVMatrahi() {
        return dayanikliTuketimOTVMatrahi;
    }

    /**
     * Sets the value of the dayanikliTuketimOTVMatrahi property.
     * 
     */
    public void setDayanikliTuketimOTVMatrahi(double value) {
        this.dayanikliTuketimOTVMatrahi = value;
    }

    /**
     * Gets the value of the alkolluIcecekOTVMatrahi property.
     * 
     */
    public double getAlkolluIcecekOTVMatrahi() {
        return alkolluIcecekOTVMatrahi;
    }

    /**
     * Sets the value of the alkolluIcecekOTVMatrahi property.
     * 
     */
    public void setAlkolluIcecekOTVMatrahi(double value) {
        this.alkolluIcecekOTVMatrahi = value;
    }

    /**
     * Gets the value of the tutunMamulleriOTVMatrahi property.
     * 
     */
    public double getTutunMamulleriOTVMatrahi() {
        return tutunMamulleriOTVMatrahi;
    }

    /**
     * Sets the value of the tutunMamulleriOTVMatrahi property.
     * 
     */
    public void setTutunMamulleriOTVMatrahi(double value) {
        this.tutunMamulleriOTVMatrahi = value;
    }

    /**
     * Gets the value of the kolaliGazozOTVMatrahi property.
     * 
     */
    public double getKolaliGazozOTVMatrahi() {
        return kolaliGazozOTVMatrahi;
    }

    /**
     * Sets the value of the kolaliGazozOTVMatrahi property.
     * 
     */
    public void setKolaliGazozOTVMatrahi(double value) {
        this.kolaliGazozOTVMatrahi = value;
    }

    /**
     * Gets the value of the dvMatrahi property.
     * 
     */
    public double getDVMatrahi() {
        return dvMatrahi;
    }

    /**
     * Sets the value of the dvMatrahi property.
     * 
     */
    public void setDVMatrahi(double value) {
        this.dvMatrahi = value;
    }

    /**
     * Gets the value of the dvKanun5035Matrahi property.
     * 
     */
    public double getDVKanun5035Matrahi() {
        return dvKanun5035Matrahi;
    }

    /**
     * Sets the value of the dvKanun5035Matrahi property.
     * 
     */
    public void setDVKanun5035Matrahi(double value) {
        this.dvKanun5035Matrahi = value;
    }

    /**
     * Gets the value of the oivMatrahi property.
     * 
     */
    public double getOIVMatrahi() {
        return oivMatrahi;
    }

    /**
     * Sets the value of the oivMatrahi property.
     * 
     */
    public void setOIVMatrahi(double value) {
        this.oivMatrahi = value;
    }

    /**
     * Gets the value of the oivKanun5035Matrahi property.
     * 
     */
    public double getOIVKanun5035Matrahi() {
        return oivKanun5035Matrahi;
    }

    /**
     * Sets the value of the oivKanun5035Matrahi property.
     * 
     */
    public void setOIVKanun5035Matrahi(double value) {
        this.oivKanun5035Matrahi = value;
    }

    /**
     * Gets the value of the kdvTevkifatMatrahi property.
     * 
     */
    public double getKDVTevkifatMatrahi() {
        return kdvTevkifatMatrahi;
    }

    /**
     * Sets the value of the kdvTevkifatMatrahi property.
     * 
     */
    public void setKDVTevkifatMatrahi(double value) {
        this.kdvTevkifatMatrahi = value;
    }

    /**
     * Gets the value of the bsmvMatrahi property.
     * 
     */
    public double getBSMVMatrahi() {
        return bsmvMatrahi;
    }

    /**
     * Sets the value of the bsmvMatrahi property.
     * 
     */
    public void setBSMVMatrahi(double value) {
        this.bsmvMatrahi = value;
    }

    /**
     * Gets the value of the motorluTasitlarOTVMatrahi property.
     * 
     */
    public double getMotorluTasitlarOTVMatrahi() {
        return motorluTasitlarOTVMatrahi;
    }

    /**
     * Sets the value of the motorluTasitlarOTVMatrahi property.
     * 
     */
    public void setMotorluTasitlarOTVMatrahi(double value) {
        this.motorluTasitlarOTVMatrahi = value;
    }

    /**
     * Gets the value of the borsaTescilUcretMatrahi property.
     * 
     */
    public double getBorsaTescilUcretMatrahi() {
        return borsaTescilUcretMatrahi;
    }

    /**
     * Sets the value of the borsaTescilUcretMatrahi property.
     * 
     */
    public void setBorsaTescilUcretMatrahi(double value) {
        this.borsaTescilUcretMatrahi = value;
    }

    /**
     * Gets the value of the enerjiFonuMatrahi property.
     * 
     */
    public double getEnerjiFonuMatrahi() {
        return enerjiFonuMatrahi;
    }

    /**
     * Sets the value of the enerjiFonuMatrahi property.
     * 
     */
    public void setEnerjiFonuMatrahi(double value) {
        this.enerjiFonuMatrahi = value;
    }

    /**
     * Gets the value of the belediyeTuketimVergisiMatrahi property.
     * 
     */
    public double getBelediyeTuketimVergisiMatrahi() {
        return belediyeTuketimVergisiMatrahi;
    }

    /**
     * Sets the value of the belediyeTuketimVergisiMatrahi property.
     * 
     */
    public void setBelediyeTuketimVergisiMatrahi(double value) {
        this.belediyeTuketimVergisiMatrahi = value;
    }

    /**
     * Gets the value of the trtPayiMatrahi property.
     * 
     */
    public double getTRTPayiMatrahi() {
        return trtPayiMatrahi;
    }

    /**
     * Sets the value of the trtPayiMatrahi property.
     * 
     */
    public void setTRTPayiMatrahi(double value) {
        this.trtPayiMatrahi = value;
    }

    /**
     * Gets the value of the elektrikTuketimVergisiMatrahi property.
     * 
     */
    public double getElektrikTuketimVergisiMatrahi() {
        return elektrikTuketimVergisiMatrahi;
    }

    /**
     * Sets the value of the elektrikTuketimVergisiMatrahi property.
     * 
     */
    public void setElektrikTuketimVergisiMatrahi(double value) {
        this.elektrikTuketimVergisiMatrahi = value;
    }

    /**
     * Gets the value of the stopajMatrahi property.
     * 
     */
    public double getStopajMatrahi() {
        return stopajMatrahi;
    }

    /**
     * Sets the value of the stopajMatrahi property.
     * 
     */
    public void setStopajMatrahi(double value) {
        this.stopajMatrahi = value;
    }

    /**
     * Gets the value of the telsizKullanimAylikTaksitMatrahi property.
     * 
     */
    public double getTelsizKullanimAylikTaksitMatrahi() {
        return telsizKullanimAylikTaksitMatrahi;
    }

    /**
     * Sets the value of the telsizKullanimAylikTaksitMatrahi property.
     * 
     */
    public void setTelsizKullanimAylikTaksitMatrahi(double value) {
        this.telsizKullanimAylikTaksitMatrahi = value;
    }

    /**
     * Gets the value of the telsizRuhsatUcretiMatrahi property.
     * 
     */
    public double getTelsizRuhsatUcretiMatrahi() {
        return telsizRuhsatUcretiMatrahi;
    }

    /**
     * Sets the value of the telsizRuhsatUcretiMatrahi property.
     * 
     */
    public void setTelsizRuhsatUcretiMatrahi(double value) {
        this.telsizRuhsatUcretiMatrahi = value;
    }

    /**
     * Gets the value of the cevreTemizlikVergisiMatrahi property.
     * 
     */
    public double getCevreTemizlikVergisiMatrahi() {
        return cevreTemizlikVergisiMatrahi;
    }

    /**
     * Sets the value of the cevreTemizlikVergisiMatrahi property.
     * 
     */
    public void setCevreTemizlikVergisiMatrahi(double value) {
        this.cevreTemizlikVergisiMatrahi = value;
    }

    /**
     * Gets the value of the vergiTemsilcisi property.
     * 
     * @return
     *     possible object is
     *     {@link VergiTemsilcisi }
     *     
     */
    public VergiTemsilcisi getVergiTemsilcisi() {
        return vergiTemsilcisi;
    }

    /**
     * Sets the value of the vergiTemsilcisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link VergiTemsilcisi }
     *     
     */
    public void setVergiTemsilcisi(VergiTemsilcisi value) {
        this.vergiTemsilcisi = value;
    }

    /**
     * Gets the value of the saticiTedarikcisi property.
     * 
     * @return
     *     possible object is
     *     {@link SaticiTedarikcisi }
     *     
     */
    public SaticiTedarikcisi getSaticiTedarikcisi() {
        return saticiTedarikcisi;
    }

    /**
     * Sets the value of the saticiTedarikcisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaticiTedarikcisi }
     *     
     */
    public void setSaticiTedarikcisi(SaticiTedarikcisi value) {
        this.saticiTedarikcisi = value;
    }

    /**
     * Gets the value of the aliciMusteri property.
     * 
     * @return
     *     possible object is
     *     {@link AliciMusteri }
     *     
     */
    public AliciMusteri getAliciMusteri() {
        return aliciMusteri;
    }

    /**
     * Sets the value of the aliciMusteri property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliciMusteri }
     *     
     */
    public void setAliciMusteri(AliciMusteri value) {
        this.aliciMusteri = value;
    }

    /**
     * Gets the value of the saticiSiparisNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaticiSiparisNo() {
        return saticiSiparisNo;
    }

    /**
     * Sets the value of the saticiSiparisNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaticiSiparisNo(String value) {
        this.saticiSiparisNo = value;
    }

    /**
     * Gets the value of the siparisTuruKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiparisTuruKodu() {
        return siparisTuruKodu;
    }

    /**
     * Sets the value of the siparisTuruKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiparisTuruKodu(String value) {
        this.siparisTuruKodu = value;
    }

    /**
     * Gets the value of the okcBilgiFisleri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOKCBilgiFisi }
     *     
     */
    public ArrayOfOKCBilgiFisi getOKCBilgiFisleri() {
        return okcBilgiFisleri;
    }

    /**
     * Sets the value of the okcBilgiFisleri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOKCBilgiFisi }
     *     
     */
    public void setOKCBilgiFisleri(ArrayOfOKCBilgiFisi value) {
        this.okcBilgiFisleri = value;
    }

    /**
     * Gets the value of the kaynakDokumanTuru property.
     * 
     * @return
     *     possible object is
     *     {@link KaynakDokumanTuru }
     *     
     */
    public KaynakDokumanTuru getKaynakDokumanTuru() {
        return kaynakDokumanTuru;
    }

    /**
     * Sets the value of the kaynakDokumanTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link KaynakDokumanTuru }
     *     
     */
    public void setKaynakDokumanTuru(KaynakDokumanTuru value) {
        this.kaynakDokumanTuru = value;
    }

    /**
     * Gets the value of the gonderi property.
     * 
     * @return
     *     possible object is
     *     {@link Gonderi }
     *     
     */
    public Gonderi getGonderi() {
        return gonderi;
    }

    /**
     * Sets the value of the gonderi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gonderi }
     *     
     */
    public void setGonderi(Gonderi value) {
        this.gonderi = value;
    }

    /**
     * Gets the value of the sevkIrsaliye property.
     * 
     * @return
     *     possible object is
     *     {@link SevkIrsaliye }
     *     
     */
    public SevkIrsaliye getSevkIrsaliye() {
        return sevkIrsaliye;
    }

    /**
     * Sets the value of the sevkIrsaliye property.
     * 
     * @param value
     *     allowed object is
     *     {@link SevkIrsaliye }
     *     
     */
    public void setSevkIrsaliye(SevkIrsaliye value) {
        this.sevkIrsaliye = value;
    }

    /**
     * Gets the value of the sgkOzelFaturaAlanlari property.
     * 
     * @return
     *     possible object is
     *     {@link SGKOzelFaturaAlanlari }
     *     
     */
    public SGKOzelFaturaAlanlari getSGKOzelFaturaAlanlari() {
        return sgkOzelFaturaAlanlari;
    }

    /**
     * Sets the value of the sgkOzelFaturaAlanlari property.
     * 
     * @param value
     *     allowed object is
     *     {@link SGKOzelFaturaAlanlari }
     *     
     */
    public void setSGKOzelFaturaAlanlari(SGKOzelFaturaAlanlari value) {
        this.sgkOzelFaturaAlanlari = value;
    }

    /**
     * Gets the value of the gonderimTipi property.
     * 
     * @return
     *     possible object is
     *     {@link GonderimTipi }
     *     
     */
    public GonderimTipi getGonderimTipi() {
        return gonderimTipi;
    }

    /**
     * Sets the value of the gonderimTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link GonderimTipi }
     *     
     */
    public void setGonderimTipi(GonderimTipi value) {
        this.gonderimTipi = value;
    }

}
