
package com.spartacus.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaturaKalemi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaturaKalemi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TedarikciStokNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MusteriStokNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StokAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Aciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Miktar" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Birim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BirimFiyat" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DovizTipi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToplamTutar" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="IskontoOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="IskontoTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KDVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KDVOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KDVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KKDFKesintiMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KKDFKesintiOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KKDFKesintiTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PetrolDogalgazOTVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PetrolDogalgazOTVOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PetrolDogalgazOTVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DayanikliTuketimOTVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DayanikliTuketimOTVOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DayanikliTuketimOTVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="AlkolluIcecekOTVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlkolluIcecekOTVOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="AlkolluIcecekOTVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TutunMamulleriOTVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TutunMamulleriOTVOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TutunMamulleriOTVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KolaliGazozOTVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KolaliGazozOTVOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KolaliGazozOTVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DVKanun5035MuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVKanun5035Orani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DVKanun5035Tutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="OIVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OIVOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="OIVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="OIVKanun5035MuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OIVKanun5035Orani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="OIVKanun5035Tutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KDVTevkifatMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KDVTevkifatOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KDVTevkifatTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BSMVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BSMVOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BSMVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MotorluTasitlarOTVMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MotorluTasitlarOTVOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MotorluTasitlarOTVTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BorsaTescilUcretMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BorsaTescilUcretOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BorsaTescilUcretTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="EnerjiFonuMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnerjiFonuOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="EnerjiFonuTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BelediyeTuketimVergisiMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BelediyeTuketimVergisiOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BelediyeTuketimVergisiTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TRTPayiMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRTPayiOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TRTPayiTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ElektrikTuketimVergisiMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ElektrikTuketimVergisiOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ElektrikTuketimVergisiTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="StopajMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopajOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="StopajTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TelsizKullanimAylikTaksitMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelsizKullanimAylikTaksitOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TelsizKullanimAylikTaksitTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TelsizRuhsatUcretiMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelsizRuhsatUcretiOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TelsizRuhsatUcretiTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CevreTemizlikVergisiMuafiyetNedeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CevreTemizlikVergisiOrani" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CevreTemizlikVergisiTutari" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CevrimDovizTipi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CevrimDovizKuru" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Vergiler" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfVergi" minOccurs="0"/&gt;
 *         &lt;element name="EkSahalar" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfEkSaha" minOccurs="0"/&gt;
 *         &lt;element name="UreticiStokNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IskontoAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="GonderilenMalAdedi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="GonderilenMalAdediBirim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IlerikiTarihteGonderilecekMalAdedi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="IlerikiTarihteGonderilecekMalAdediBirim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IlerikiTarihteMalGondermeNedenleri" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="TeslimAlinanMalAdedi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TeslimAlinanMalAdediBirim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EksikMalAdedi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="EksikMalAdediBirim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FazlaMalAdedi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FazlaMalAdediBirim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KabulEdilmeyenMalAdedi" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="KabulEdilmeyenMalAdediBirim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaliReddetmeNedenleri" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="GecTeslimSikayetAciklamasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiparisSiraNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaturaKalemi", propOrder = {
    "tedarikciStokNo",
    "musteriStokNo",
    "stokAdi",
    "aciklama",
    "miktar",
    "birim",
    "birimFiyat",
    "dovizTipi",
    "toplamTutar",
    "iskontoOrani",
    "iskontoTutari",
    "kdvMuafiyetNedeni",
    "kdvOrani",
    "kdvTutari",
    "kkdfKesintiMuafiyetNedeni",
    "kkdfKesintiOrani",
    "kkdfKesintiTutari",
    "petrolDogalgazOTVMuafiyetNedeni",
    "petrolDogalgazOTVOrani",
    "petrolDogalgazOTVTutari",
    "dayanikliTuketimOTVMuafiyetNedeni",
    "dayanikliTuketimOTVOrani",
    "dayanikliTuketimOTVTutari",
    "alkolluIcecekOTVMuafiyetNedeni",
    "alkolluIcecekOTVOrani",
    "alkolluIcecekOTVTutari",
    "tutunMamulleriOTVMuafiyetNedeni",
    "tutunMamulleriOTVOrani",
    "tutunMamulleriOTVTutari",
    "kolaliGazozOTVMuafiyetNedeni",
    "kolaliGazozOTVOrani",
    "kolaliGazozOTVTutari",
    "dvMuafiyetNedeni",
    "dvOrani",
    "dvTutari",
    "dvKanun5035MuafiyetNedeni",
    "dvKanun5035Orani",
    "dvKanun5035Tutari",
    "oivMuafiyetNedeni",
    "oivOrani",
    "oivTutari",
    "oivKanun5035MuafiyetNedeni",
    "oivKanun5035Orani",
    "oivKanun5035Tutari",
    "kdvTevkifatMuafiyetNedeni",
    "kdvTevkifatOrani",
    "kdvTevkifatTutari",
    "bsmvMuafiyetNedeni",
    "bsmvOrani",
    "bsmvTutari",
    "motorluTasitlarOTVMuafiyetNedeni",
    "motorluTasitlarOTVOrani",
    "motorluTasitlarOTVTutari",
    "borsaTescilUcretMuafiyetNedeni",
    "borsaTescilUcretOrani",
    "borsaTescilUcretTutari",
    "enerjiFonuMuafiyetNedeni",
    "enerjiFonuOrani",
    "enerjiFonuTutari",
    "belediyeTuketimVergisiMuafiyetNedeni",
    "belediyeTuketimVergisiOrani",
    "belediyeTuketimVergisiTutari",
    "trtPayiMuafiyetNedeni",
    "trtPayiOrani",
    "trtPayiTutari",
    "elektrikTuketimVergisiMuafiyetNedeni",
    "elektrikTuketimVergisiOrani",
    "elektrikTuketimVergisiTutari",
    "stopajMuafiyetNedeni",
    "stopajOrani",
    "stopajTutari",
    "telsizKullanimAylikTaksitMuafiyetNedeni",
    "telsizKullanimAylikTaksitOrani",
    "telsizKullanimAylikTaksitTutari",
    "telsizRuhsatUcretiMuafiyetNedeni",
    "telsizRuhsatUcretiOrani",
    "telsizRuhsatUcretiTutari",
    "cevreTemizlikVergisiMuafiyetNedeni",
    "cevreTemizlikVergisiOrani",
    "cevreTemizlikVergisiTutari",
    "cevrimDovizTipi",
    "cevrimDovizKuru",
    "vergiler",
    "ekSahalar",
    "ureticiStokNo",
    "model",
    "iskontoAciklama",
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
    "gonderilenMalAdedi",
    "gonderilenMalAdediBirim",
    "ilerikiTarihteGonderilecekMalAdedi",
    "ilerikiTarihteGonderilecekMalAdediBirim",
    "ilerikiTarihteMalGondermeNedenleri",
    "teslimAlinanMalAdedi",
    "teslimAlinanMalAdediBirim",
    "eksikMalAdedi",
    "eksikMalAdediBirim",
    "fazlaMalAdedi",
    "fazlaMalAdediBirim",
    "kabulEdilmeyenMalAdedi",
    "kabulEdilmeyenMalAdediBirim",
    "maliReddetmeNedenleri",
    "gecTeslimSikayetAciklamasi",
    "siparisSiraNo"
})
public class FaturaKalemi {

    @XmlElement(name = "TedarikciStokNo")
    protected String tedarikciStokNo;
    @XmlElement(name = "MusteriStokNo")
    protected String musteriStokNo;
    @XmlElement(name = "StokAdi")
    protected String stokAdi;
    @XmlElement(name = "Aciklama")
    protected String aciklama;
    @XmlElement(name = "Miktar")
    protected double miktar;
    @XmlElement(name = "Birim")
    protected String birim;
    @XmlElement(name = "BirimFiyat")
    protected double birimFiyat;
    @XmlElement(name = "DovizTipi")
    protected String dovizTipi;
    @XmlElement(name = "ToplamTutar")
    protected double toplamTutar;
    @XmlElement(name = "IskontoOrani")
    protected double iskontoOrani;
    @XmlElement(name = "IskontoTutari")
    protected double iskontoTutari;
    @XmlElement(name = "KDVMuafiyetNedeni")
    protected String kdvMuafiyetNedeni;
    @XmlElement(name = "KDVOrani")
    protected double kdvOrani;
    @XmlElement(name = "KDVTutari")
    protected double kdvTutari;
    @XmlElement(name = "KKDFKesintiMuafiyetNedeni")
    protected String kkdfKesintiMuafiyetNedeni;
    @XmlElement(name = "KKDFKesintiOrani")
    protected double kkdfKesintiOrani;
    @XmlElement(name = "KKDFKesintiTutari")
    protected double kkdfKesintiTutari;
    @XmlElement(name = "PetrolDogalgazOTVMuafiyetNedeni")
    protected String petrolDogalgazOTVMuafiyetNedeni;
    @XmlElement(name = "PetrolDogalgazOTVOrani")
    protected double petrolDogalgazOTVOrani;
    @XmlElement(name = "PetrolDogalgazOTVTutari")
    protected double petrolDogalgazOTVTutari;
    @XmlElement(name = "DayanikliTuketimOTVMuafiyetNedeni")
    protected String dayanikliTuketimOTVMuafiyetNedeni;
    @XmlElement(name = "DayanikliTuketimOTVOrani")
    protected double dayanikliTuketimOTVOrani;
    @XmlElement(name = "DayanikliTuketimOTVTutari")
    protected double dayanikliTuketimOTVTutari;
    @XmlElement(name = "AlkolluIcecekOTVMuafiyetNedeni")
    protected String alkolluIcecekOTVMuafiyetNedeni;
    @XmlElement(name = "AlkolluIcecekOTVOrani")
    protected double alkolluIcecekOTVOrani;
    @XmlElement(name = "AlkolluIcecekOTVTutari")
    protected double alkolluIcecekOTVTutari;
    @XmlElement(name = "TutunMamulleriOTVMuafiyetNedeni")
    protected String tutunMamulleriOTVMuafiyetNedeni;
    @XmlElement(name = "TutunMamulleriOTVOrani")
    protected double tutunMamulleriOTVOrani;
    @XmlElement(name = "TutunMamulleriOTVTutari")
    protected double tutunMamulleriOTVTutari;
    @XmlElement(name = "KolaliGazozOTVMuafiyetNedeni")
    protected String kolaliGazozOTVMuafiyetNedeni;
    @XmlElement(name = "KolaliGazozOTVOrani")
    protected double kolaliGazozOTVOrani;
    @XmlElement(name = "KolaliGazozOTVTutari")
    protected double kolaliGazozOTVTutari;
    @XmlElement(name = "DVMuafiyetNedeni")
    protected String dvMuafiyetNedeni;
    @XmlElement(name = "DVOrani")
    protected double dvOrani;
    @XmlElement(name = "DVTutari")
    protected double dvTutari;
    @XmlElement(name = "DVKanun5035MuafiyetNedeni")
    protected String dvKanun5035MuafiyetNedeni;
    @XmlElement(name = "DVKanun5035Orani")
    protected double dvKanun5035Orani;
    @XmlElement(name = "DVKanun5035Tutari")
    protected double dvKanun5035Tutari;
    @XmlElement(name = "OIVMuafiyetNedeni")
    protected String oivMuafiyetNedeni;
    @XmlElement(name = "OIVOrani")
    protected double oivOrani;
    @XmlElement(name = "OIVTutari")
    protected double oivTutari;
    @XmlElement(name = "OIVKanun5035MuafiyetNedeni")
    protected String oivKanun5035MuafiyetNedeni;
    @XmlElement(name = "OIVKanun5035Orani")
    protected double oivKanun5035Orani;
    @XmlElement(name = "OIVKanun5035Tutari")
    protected double oivKanun5035Tutari;
    @XmlElement(name = "KDVTevkifatMuafiyetNedeni")
    protected String kdvTevkifatMuafiyetNedeni;
    @XmlElement(name = "KDVTevkifatOrani")
    protected double kdvTevkifatOrani;
    @XmlElement(name = "KDVTevkifatTutari")
    protected double kdvTevkifatTutari;
    @XmlElement(name = "BSMVMuafiyetNedeni")
    protected String bsmvMuafiyetNedeni;
    @XmlElement(name = "BSMVOrani")
    protected double bsmvOrani;
    @XmlElement(name = "BSMVTutari")
    protected double bsmvTutari;
    @XmlElement(name = "MotorluTasitlarOTVMuafiyetNedeni")
    protected String motorluTasitlarOTVMuafiyetNedeni;
    @XmlElement(name = "MotorluTasitlarOTVOrani")
    protected double motorluTasitlarOTVOrani;
    @XmlElement(name = "MotorluTasitlarOTVTutari")
    protected double motorluTasitlarOTVTutari;
    @XmlElement(name = "BorsaTescilUcretMuafiyetNedeni")
    protected String borsaTescilUcretMuafiyetNedeni;
    @XmlElement(name = "BorsaTescilUcretOrani")
    protected double borsaTescilUcretOrani;
    @XmlElement(name = "BorsaTescilUcretTutari")
    protected double borsaTescilUcretTutari;
    @XmlElement(name = "EnerjiFonuMuafiyetNedeni")
    protected String enerjiFonuMuafiyetNedeni;
    @XmlElement(name = "EnerjiFonuOrani")
    protected double enerjiFonuOrani;
    @XmlElement(name = "EnerjiFonuTutari")
    protected double enerjiFonuTutari;
    @XmlElement(name = "BelediyeTuketimVergisiMuafiyetNedeni")
    protected String belediyeTuketimVergisiMuafiyetNedeni;
    @XmlElement(name = "BelediyeTuketimVergisiOrani")
    protected double belediyeTuketimVergisiOrani;
    @XmlElement(name = "BelediyeTuketimVergisiTutari")
    protected double belediyeTuketimVergisiTutari;
    @XmlElement(name = "TRTPayiMuafiyetNedeni")
    protected String trtPayiMuafiyetNedeni;
    @XmlElement(name = "TRTPayiOrani")
    protected double trtPayiOrani;
    @XmlElement(name = "TRTPayiTutari")
    protected double trtPayiTutari;
    @XmlElement(name = "ElektrikTuketimVergisiMuafiyetNedeni")
    protected String elektrikTuketimVergisiMuafiyetNedeni;
    @XmlElement(name = "ElektrikTuketimVergisiOrani")
    protected double elektrikTuketimVergisiOrani;
    @XmlElement(name = "ElektrikTuketimVergisiTutari")
    protected double elektrikTuketimVergisiTutari;
    @XmlElement(name = "StopajMuafiyetNedeni")
    protected String stopajMuafiyetNedeni;
    @XmlElement(name = "StopajOrani")
    protected double stopajOrani;
    @XmlElement(name = "StopajTutari")
    protected double stopajTutari;
    @XmlElement(name = "TelsizKullanimAylikTaksitMuafiyetNedeni")
    protected String telsizKullanimAylikTaksitMuafiyetNedeni;
    @XmlElement(name = "TelsizKullanimAylikTaksitOrani")
    protected double telsizKullanimAylikTaksitOrani;
    @XmlElement(name = "TelsizKullanimAylikTaksitTutari")
    protected double telsizKullanimAylikTaksitTutari;
    @XmlElement(name = "TelsizRuhsatUcretiMuafiyetNedeni")
    protected String telsizRuhsatUcretiMuafiyetNedeni;
    @XmlElement(name = "TelsizRuhsatUcretiOrani")
    protected double telsizRuhsatUcretiOrani;
    @XmlElement(name = "TelsizRuhsatUcretiTutari")
    protected double telsizRuhsatUcretiTutari;
    @XmlElement(name = "CevreTemizlikVergisiMuafiyetNedeni")
    protected String cevreTemizlikVergisiMuafiyetNedeni;
    @XmlElement(name = "CevreTemizlikVergisiOrani")
    protected double cevreTemizlikVergisiOrani;
    @XmlElement(name = "CevreTemizlikVergisiTutari")
    protected double cevreTemizlikVergisiTutari;
    @XmlElement(name = "CevrimDovizTipi")
    protected String cevrimDovizTipi;
    @XmlElement(name = "CevrimDovizKuru")
    protected double cevrimDovizKuru;
    @XmlElement(name = "Vergiler")
    protected ArrayOfVergi vergiler;
    @XmlElement(name = "EkSahalar")
    protected ArrayOfEkSaha ekSahalar;
    @XmlElement(name = "UreticiStokNo")
    protected String ureticiStokNo;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "IskontoAciklama")
    protected String iskontoAciklama;
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
    @XmlElement(name = "GonderilenMalAdedi")
    protected double gonderilenMalAdedi;
    @XmlElement(name = "GonderilenMalAdediBirim")
    protected String gonderilenMalAdediBirim;
    @XmlElement(name = "IlerikiTarihteGonderilecekMalAdedi")
    protected double ilerikiTarihteGonderilecekMalAdedi;
    @XmlElement(name = "IlerikiTarihteGonderilecekMalAdediBirim")
    protected String ilerikiTarihteGonderilecekMalAdediBirim;
    @XmlElement(name = "IlerikiTarihteMalGondermeNedenleri")
    protected ArrayOfString ilerikiTarihteMalGondermeNedenleri;
    @XmlElement(name = "TeslimAlinanMalAdedi")
    protected double teslimAlinanMalAdedi;
    @XmlElement(name = "TeslimAlinanMalAdediBirim")
    protected String teslimAlinanMalAdediBirim;
    @XmlElement(name = "EksikMalAdedi")
    protected double eksikMalAdedi;
    @XmlElement(name = "EksikMalAdediBirim")
    protected String eksikMalAdediBirim;
    @XmlElement(name = "FazlaMalAdedi")
    protected double fazlaMalAdedi;
    @XmlElement(name = "FazlaMalAdediBirim")
    protected String fazlaMalAdediBirim;
    @XmlElement(name = "KabulEdilmeyenMalAdedi")
    protected double kabulEdilmeyenMalAdedi;
    @XmlElement(name = "KabulEdilmeyenMalAdediBirim")
    protected String kabulEdilmeyenMalAdediBirim;
    @XmlElement(name = "MaliReddetmeNedenleri")
    protected ArrayOfString maliReddetmeNedenleri;
    @XmlElement(name = "GecTeslimSikayetAciklamasi")
    protected String gecTeslimSikayetAciklamasi;
    @XmlElement(name = "SiparisSiraNo")
    protected String siparisSiraNo;

    /**
     * Gets the value of the tedarikciStokNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTedarikciStokNo() {
        return tedarikciStokNo;
    }

    /**
     * Sets the value of the tedarikciStokNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTedarikciStokNo(String value) {
        this.tedarikciStokNo = value;
    }

    /**
     * Gets the value of the musteriStokNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusteriStokNo() {
        return musteriStokNo;
    }

    /**
     * Sets the value of the musteriStokNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusteriStokNo(String value) {
        this.musteriStokNo = value;
    }

    /**
     * Gets the value of the stokAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStokAdi() {
        return stokAdi;
    }

    /**
     * Sets the value of the stokAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStokAdi(String value) {
        this.stokAdi = value;
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
     * Gets the value of the miktar property.
     * 
     */
    public double getMiktar() {
        return miktar;
    }

    /**
     * Sets the value of the miktar property.
     * 
     */
    public void setMiktar(double value) {
        this.miktar = value;
    }

    /**
     * Gets the value of the birim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirim() {
        return birim;
    }

    /**
     * Sets the value of the birim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirim(String value) {
        this.birim = value;
    }

    /**
     * Gets the value of the birimFiyat property.
     * 
     */
    public double getBirimFiyat() {
        return birimFiyat;
    }

    /**
     * Sets the value of the birimFiyat property.
     * 
     */
    public void setBirimFiyat(double value) {
        this.birimFiyat = value;
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
     * Gets the value of the iskontoOrani property.
     * 
     */
    public double getIskontoOrani() {
        return iskontoOrani;
    }

    /**
     * Sets the value of the iskontoOrani property.
     * 
     */
    public void setIskontoOrani(double value) {
        this.iskontoOrani = value;
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
     * Gets the value of the kdvOrani property.
     * 
     */
    public double getKDVOrani() {
        return kdvOrani;
    }

    /**
     * Sets the value of the kdvOrani property.
     * 
     */
    public void setKDVOrani(double value) {
        this.kdvOrani = value;
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
     * Gets the value of the kkdfKesintiOrani property.
     * 
     */
    public double getKKDFKesintiOrani() {
        return kkdfKesintiOrani;
    }

    /**
     * Sets the value of the kkdfKesintiOrani property.
     * 
     */
    public void setKKDFKesintiOrani(double value) {
        this.kkdfKesintiOrani = value;
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
     * Gets the value of the petrolDogalgazOTVOrani property.
     * 
     */
    public double getPetrolDogalgazOTVOrani() {
        return petrolDogalgazOTVOrani;
    }

    /**
     * Sets the value of the petrolDogalgazOTVOrani property.
     * 
     */
    public void setPetrolDogalgazOTVOrani(double value) {
        this.petrolDogalgazOTVOrani = value;
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
     * Gets the value of the dayanikliTuketimOTVOrani property.
     * 
     */
    public double getDayanikliTuketimOTVOrani() {
        return dayanikliTuketimOTVOrani;
    }

    /**
     * Sets the value of the dayanikliTuketimOTVOrani property.
     * 
     */
    public void setDayanikliTuketimOTVOrani(double value) {
        this.dayanikliTuketimOTVOrani = value;
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
     * Gets the value of the alkolluIcecekOTVOrani property.
     * 
     */
    public double getAlkolluIcecekOTVOrani() {
        return alkolluIcecekOTVOrani;
    }

    /**
     * Sets the value of the alkolluIcecekOTVOrani property.
     * 
     */
    public void setAlkolluIcecekOTVOrani(double value) {
        this.alkolluIcecekOTVOrani = value;
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
     * Gets the value of the tutunMamulleriOTVOrani property.
     * 
     */
    public double getTutunMamulleriOTVOrani() {
        return tutunMamulleriOTVOrani;
    }

    /**
     * Sets the value of the tutunMamulleriOTVOrani property.
     * 
     */
    public void setTutunMamulleriOTVOrani(double value) {
        this.tutunMamulleriOTVOrani = value;
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
     * Gets the value of the kolaliGazozOTVOrani property.
     * 
     */
    public double getKolaliGazozOTVOrani() {
        return kolaliGazozOTVOrani;
    }

    /**
     * Sets the value of the kolaliGazozOTVOrani property.
     * 
     */
    public void setKolaliGazozOTVOrani(double value) {
        this.kolaliGazozOTVOrani = value;
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
     * Gets the value of the dvOrani property.
     * 
     */
    public double getDVOrani() {
        return dvOrani;
    }

    /**
     * Sets the value of the dvOrani property.
     * 
     */
    public void setDVOrani(double value) {
        this.dvOrani = value;
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
     * Gets the value of the dvKanun5035Orani property.
     * 
     */
    public double getDVKanun5035Orani() {
        return dvKanun5035Orani;
    }

    /**
     * Sets the value of the dvKanun5035Orani property.
     * 
     */
    public void setDVKanun5035Orani(double value) {
        this.dvKanun5035Orani = value;
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
     * Gets the value of the oivOrani property.
     * 
     */
    public double getOIVOrani() {
        return oivOrani;
    }

    /**
     * Sets the value of the oivOrani property.
     * 
     */
    public void setOIVOrani(double value) {
        this.oivOrani = value;
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
     * Gets the value of the oivKanun5035Orani property.
     * 
     */
    public double getOIVKanun5035Orani() {
        return oivKanun5035Orani;
    }

    /**
     * Sets the value of the oivKanun5035Orani property.
     * 
     */
    public void setOIVKanun5035Orani(double value) {
        this.oivKanun5035Orani = value;
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
     * Gets the value of the kdvTevkifatOrani property.
     * 
     */
    public double getKDVTevkifatOrani() {
        return kdvTevkifatOrani;
    }

    /**
     * Sets the value of the kdvTevkifatOrani property.
     * 
     */
    public void setKDVTevkifatOrani(double value) {
        this.kdvTevkifatOrani = value;
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
     * Gets the value of the bsmvOrani property.
     * 
     */
    public double getBSMVOrani() {
        return bsmvOrani;
    }

    /**
     * Sets the value of the bsmvOrani property.
     * 
     */
    public void setBSMVOrani(double value) {
        this.bsmvOrani = value;
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
     * Gets the value of the motorluTasitlarOTVOrani property.
     * 
     */
    public double getMotorluTasitlarOTVOrani() {
        return motorluTasitlarOTVOrani;
    }

    /**
     * Sets the value of the motorluTasitlarOTVOrani property.
     * 
     */
    public void setMotorluTasitlarOTVOrani(double value) {
        this.motorluTasitlarOTVOrani = value;
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
     * Gets the value of the borsaTescilUcretOrani property.
     * 
     */
    public double getBorsaTescilUcretOrani() {
        return borsaTescilUcretOrani;
    }

    /**
     * Sets the value of the borsaTescilUcretOrani property.
     * 
     */
    public void setBorsaTescilUcretOrani(double value) {
        this.borsaTescilUcretOrani = value;
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
     * Gets the value of the enerjiFonuOrani property.
     * 
     */
    public double getEnerjiFonuOrani() {
        return enerjiFonuOrani;
    }

    /**
     * Sets the value of the enerjiFonuOrani property.
     * 
     */
    public void setEnerjiFonuOrani(double value) {
        this.enerjiFonuOrani = value;
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
     * Gets the value of the belediyeTuketimVergisiOrani property.
     * 
     */
    public double getBelediyeTuketimVergisiOrani() {
        return belediyeTuketimVergisiOrani;
    }

    /**
     * Sets the value of the belediyeTuketimVergisiOrani property.
     * 
     */
    public void setBelediyeTuketimVergisiOrani(double value) {
        this.belediyeTuketimVergisiOrani = value;
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
     * Gets the value of the trtPayiOrani property.
     * 
     */
    public double getTRTPayiOrani() {
        return trtPayiOrani;
    }

    /**
     * Sets the value of the trtPayiOrani property.
     * 
     */
    public void setTRTPayiOrani(double value) {
        this.trtPayiOrani = value;
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
     * Gets the value of the elektrikTuketimVergisiOrani property.
     * 
     */
    public double getElektrikTuketimVergisiOrani() {
        return elektrikTuketimVergisiOrani;
    }

    /**
     * Sets the value of the elektrikTuketimVergisiOrani property.
     * 
     */
    public void setElektrikTuketimVergisiOrani(double value) {
        this.elektrikTuketimVergisiOrani = value;
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
     * Gets the value of the stopajOrani property.
     * 
     */
    public double getStopajOrani() {
        return stopajOrani;
    }

    /**
     * Sets the value of the stopajOrani property.
     * 
     */
    public void setStopajOrani(double value) {
        this.stopajOrani = value;
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
     * Gets the value of the telsizKullanimAylikTaksitOrani property.
     * 
     */
    public double getTelsizKullanimAylikTaksitOrani() {
        return telsizKullanimAylikTaksitOrani;
    }

    /**
     * Sets the value of the telsizKullanimAylikTaksitOrani property.
     * 
     */
    public void setTelsizKullanimAylikTaksitOrani(double value) {
        this.telsizKullanimAylikTaksitOrani = value;
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
     * Gets the value of the telsizRuhsatUcretiOrani property.
     * 
     */
    public double getTelsizRuhsatUcretiOrani() {
        return telsizRuhsatUcretiOrani;
    }

    /**
     * Sets the value of the telsizRuhsatUcretiOrani property.
     * 
     */
    public void setTelsizRuhsatUcretiOrani(double value) {
        this.telsizRuhsatUcretiOrani = value;
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
     * Gets the value of the cevreTemizlikVergisiOrani property.
     * 
     */
    public double getCevreTemizlikVergisiOrani() {
        return cevreTemizlikVergisiOrani;
    }

    /**
     * Sets the value of the cevreTemizlikVergisiOrani property.
     * 
     */
    public void setCevreTemizlikVergisiOrani(double value) {
        this.cevreTemizlikVergisiOrani = value;
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
     * Gets the value of the cevrimDovizTipi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCevrimDovizTipi() {
        return cevrimDovizTipi;
    }

    /**
     * Sets the value of the cevrimDovizTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCevrimDovizTipi(String value) {
        this.cevrimDovizTipi = value;
    }

    /**
     * Gets the value of the cevrimDovizKuru property.
     * 
     */
    public double getCevrimDovizKuru() {
        return cevrimDovizKuru;
    }

    /**
     * Sets the value of the cevrimDovizKuru property.
     * 
     */
    public void setCevrimDovizKuru(double value) {
        this.cevrimDovizKuru = value;
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
     * Gets the value of the ureticiStokNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUreticiStokNo() {
        return ureticiStokNo;
    }

    /**
     * Sets the value of the ureticiStokNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUreticiStokNo(String value) {
        this.ureticiStokNo = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the iskontoAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIskontoAciklama() {
        return iskontoAciklama;
    }

    /**
     * Sets the value of the iskontoAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIskontoAciklama(String value) {
        this.iskontoAciklama = value;
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
     * Gets the value of the gonderilenMalAdedi property.
     * 
     */
    public double getGonderilenMalAdedi() {
        return gonderilenMalAdedi;
    }

    /**
     * Sets the value of the gonderilenMalAdedi property.
     * 
     */
    public void setGonderilenMalAdedi(double value) {
        this.gonderilenMalAdedi = value;
    }

    /**
     * Gets the value of the gonderilenMalAdediBirim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGonderilenMalAdediBirim() {
        return gonderilenMalAdediBirim;
    }

    /**
     * Sets the value of the gonderilenMalAdediBirim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGonderilenMalAdediBirim(String value) {
        this.gonderilenMalAdediBirim = value;
    }

    /**
     * Gets the value of the ilerikiTarihteGonderilecekMalAdedi property.
     * 
     */
    public double getIlerikiTarihteGonderilecekMalAdedi() {
        return ilerikiTarihteGonderilecekMalAdedi;
    }

    /**
     * Sets the value of the ilerikiTarihteGonderilecekMalAdedi property.
     * 
     */
    public void setIlerikiTarihteGonderilecekMalAdedi(double value) {
        this.ilerikiTarihteGonderilecekMalAdedi = value;
    }

    /**
     * Gets the value of the ilerikiTarihteGonderilecekMalAdediBirim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlerikiTarihteGonderilecekMalAdediBirim() {
        return ilerikiTarihteGonderilecekMalAdediBirim;
    }

    /**
     * Sets the value of the ilerikiTarihteGonderilecekMalAdediBirim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlerikiTarihteGonderilecekMalAdediBirim(String value) {
        this.ilerikiTarihteGonderilecekMalAdediBirim = value;
    }

    /**
     * Gets the value of the ilerikiTarihteMalGondermeNedenleri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getIlerikiTarihteMalGondermeNedenleri() {
        return ilerikiTarihteMalGondermeNedenleri;
    }

    /**
     * Sets the value of the ilerikiTarihteMalGondermeNedenleri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setIlerikiTarihteMalGondermeNedenleri(ArrayOfString value) {
        this.ilerikiTarihteMalGondermeNedenleri = value;
    }

    /**
     * Gets the value of the teslimAlinanMalAdedi property.
     * 
     */
    public double getTeslimAlinanMalAdedi() {
        return teslimAlinanMalAdedi;
    }

    /**
     * Sets the value of the teslimAlinanMalAdedi property.
     * 
     */
    public void setTeslimAlinanMalAdedi(double value) {
        this.teslimAlinanMalAdedi = value;
    }

    /**
     * Gets the value of the teslimAlinanMalAdediBirim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeslimAlinanMalAdediBirim() {
        return teslimAlinanMalAdediBirim;
    }

    /**
     * Sets the value of the teslimAlinanMalAdediBirim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeslimAlinanMalAdediBirim(String value) {
        this.teslimAlinanMalAdediBirim = value;
    }

    /**
     * Gets the value of the eksikMalAdedi property.
     * 
     */
    public double getEksikMalAdedi() {
        return eksikMalAdedi;
    }

    /**
     * Sets the value of the eksikMalAdedi property.
     * 
     */
    public void setEksikMalAdedi(double value) {
        this.eksikMalAdedi = value;
    }

    /**
     * Gets the value of the eksikMalAdediBirim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEksikMalAdediBirim() {
        return eksikMalAdediBirim;
    }

    /**
     * Sets the value of the eksikMalAdediBirim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEksikMalAdediBirim(String value) {
        this.eksikMalAdediBirim = value;
    }

    /**
     * Gets the value of the fazlaMalAdedi property.
     * 
     */
    public double getFazlaMalAdedi() {
        return fazlaMalAdedi;
    }

    /**
     * Sets the value of the fazlaMalAdedi property.
     * 
     */
    public void setFazlaMalAdedi(double value) {
        this.fazlaMalAdedi = value;
    }

    /**
     * Gets the value of the fazlaMalAdediBirim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFazlaMalAdediBirim() {
        return fazlaMalAdediBirim;
    }

    /**
     * Sets the value of the fazlaMalAdediBirim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFazlaMalAdediBirim(String value) {
        this.fazlaMalAdediBirim = value;
    }

    /**
     * Gets the value of the kabulEdilmeyenMalAdedi property.
     * 
     */
    public double getKabulEdilmeyenMalAdedi() {
        return kabulEdilmeyenMalAdedi;
    }

    /**
     * Sets the value of the kabulEdilmeyenMalAdedi property.
     * 
     */
    public void setKabulEdilmeyenMalAdedi(double value) {
        this.kabulEdilmeyenMalAdedi = value;
    }

    /**
     * Gets the value of the kabulEdilmeyenMalAdediBirim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKabulEdilmeyenMalAdediBirim() {
        return kabulEdilmeyenMalAdediBirim;
    }

    /**
     * Sets the value of the kabulEdilmeyenMalAdediBirim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKabulEdilmeyenMalAdediBirim(String value) {
        this.kabulEdilmeyenMalAdediBirim = value;
    }

    /**
     * Gets the value of the maliReddetmeNedenleri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getMaliReddetmeNedenleri() {
        return maliReddetmeNedenleri;
    }

    /**
     * Sets the value of the maliReddetmeNedenleri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setMaliReddetmeNedenleri(ArrayOfString value) {
        this.maliReddetmeNedenleri = value;
    }

    /**
     * Gets the value of the gecTeslimSikayetAciklamasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGecTeslimSikayetAciklamasi() {
        return gecTeslimSikayetAciklamasi;
    }

    /**
     * Sets the value of the gecTeslimSikayetAciklamasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGecTeslimSikayetAciklamasi(String value) {
        this.gecTeslimSikayetAciklamasi = value;
    }

    /**
     * Gets the value of the siparisSiraNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiparisSiraNo() {
        return siparisSiraNo;
    }

    /**
     * Sets the value of the siparisSiraNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiparisSiraNo(String value) {
        this.siparisSiraNo = value;
    }

}
