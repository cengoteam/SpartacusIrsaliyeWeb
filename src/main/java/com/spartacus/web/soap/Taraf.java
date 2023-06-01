
package com.spartacus.web.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Taraf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Taraf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirmaAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sokak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BinaAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KapiNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IlceSemt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Il" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ulke" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostaKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VergiDairesi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VergiNoTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WebAdresi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Eposta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HizmetNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MusteriNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TesisatNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistributorNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TicaretSicilNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAPDKNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BayiNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AboneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SayacNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UreticiNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CiftciNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImalatciNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DosyaNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HastaNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MersisNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MasaNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Kullanici" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ilce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BlokAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NACEKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KurumResmiUnvan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KurumKayitNumarasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VergiTipiKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TarafTuru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AraciKurumVergiNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AraciKurumEtiket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sahis" type="{http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/}Sahis" minOccurs="0"/&gt;
 *         &lt;element name="MusteriTuru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Taraf", propOrder = {
    "firmaAdi",
    "sokak",
    "binaAdi",
    "kapiNo",
    "ilceSemt",
    "il",
    "ulke",
    "postaKodu",
    "vergiDairesi",
    "vergiNoTCKimlikNo",
    "webAdresi",
    "eposta",
    "telefon",
    "fax",
    "hizmetNo",
    "musteriNo",
    "tesisatNo",
    "telefonNo",
    "distributorNo",
    "ticaretSicilNo",
    "tapdkNo",
    "bayiNo",
    "aboneNo",
    "sayacNo",
    "ureticiNo",
    "ciftciNo",
    "imalatciNo",
    "dosyaNo",
    "hastaNo",
    "subeNo",
    "mersisNo",
    "masaNo",
    "kullanici",
    "ilce",
    "blokAdi",
    "naceKodu",
    "kurumResmiUnvan",
    "kurumKayitNumarasi",
    "vergiTipiKodu",
    "tarafTuru",
    "araciKurumVergiNo",
    "araciKurumEtiket",
    "sahis",
    "musteriTuru"
})
@XmlSeeAlso({
    Tedarikci.class,
    AliciMusteri.class,
    SaticiTedarikcisi.class,
    VergiTemsilcisi.class,
    Musteri.class
})
public class Taraf {

    @XmlElement(name = "FirmaAdi")
    protected String firmaAdi;
    @XmlElement(name = "Sokak")
    protected String sokak;
    @XmlElement(name = "BinaAdi")
    protected String binaAdi;
    @XmlElement(name = "KapiNo")
    protected String kapiNo;
    @XmlElement(name = "IlceSemt")
    protected String ilceSemt;
    @XmlElement(name = "Il")
    protected String il;
    @XmlElement(name = "Ulke")
    protected String ulke;
    @XmlElement(name = "PostaKodu")
    protected String postaKodu;
    @XmlElement(name = "VergiDairesi")
    protected String vergiDairesi;
    @XmlElement(name = "VergiNoTCKimlikNo")
    protected String vergiNoTCKimlikNo;
    @XmlElement(name = "WebAdresi")
    protected String webAdresi;
    @XmlElement(name = "Eposta")
    protected String eposta;
    @XmlElement(name = "Telefon")
    protected String telefon;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "HizmetNo")
    protected String hizmetNo;
    @XmlElement(name = "MusteriNo")
    protected String musteriNo;
    @XmlElement(name = "TesisatNo")
    protected String tesisatNo;
    @XmlElement(name = "TelefonNo")
    protected String telefonNo;
    @XmlElement(name = "DistributorNo")
    protected String distributorNo;
    @XmlElement(name = "TicaretSicilNo")
    protected String ticaretSicilNo;
    @XmlElement(name = "TAPDKNo")
    protected String tapdkNo;
    @XmlElement(name = "BayiNo")
    protected String bayiNo;
    @XmlElement(name = "AboneNo")
    protected String aboneNo;
    @XmlElement(name = "SayacNo")
    protected String sayacNo;
    @XmlElement(name = "UreticiNo")
    protected String ureticiNo;
    @XmlElement(name = "CiftciNo")
    protected String ciftciNo;
    @XmlElement(name = "ImalatciNo")
    protected String imalatciNo;
    @XmlElement(name = "DosyaNo")
    protected String dosyaNo;
    @XmlElement(name = "HastaNo")
    protected String hastaNo;
    @XmlElement(name = "SubeNo")
    protected String subeNo;
    @XmlElement(name = "MersisNo")
    protected String mersisNo;
    @XmlElement(name = "MasaNo")
    protected String masaNo;
    @XmlElement(name = "Kullanici")
    protected String kullanici;
    @XmlElement(name = "Ilce")
    protected String ilce;
    @XmlElement(name = "BlokAdi")
    protected String blokAdi;
    @XmlElement(name = "NACEKodu")
    protected String naceKodu;
    @XmlElement(name = "KurumResmiUnvan")
    protected String kurumResmiUnvan;
    @XmlElement(name = "KurumKayitNumarasi")
    protected String kurumKayitNumarasi;
    @XmlElement(name = "VergiTipiKodu")
    protected String vergiTipiKodu;
    @XmlElement(name = "TarafTuru")
    protected String tarafTuru;
    @XmlElement(name = "AraciKurumVergiNo")
    protected String araciKurumVergiNo;
    @XmlElement(name = "AraciKurumEtiket")
    protected String araciKurumEtiket;
    @XmlElement(name = "Sahis")
    protected Sahis sahis;
    @XmlElement(name = "MusteriTuru")
    protected String musteriTuru;

    /**
     * Gets the value of the firmaAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmaAdi() {
        return firmaAdi;
    }

    /**
     * Sets the value of the firmaAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmaAdi(String value) {
        this.firmaAdi = value;
    }

    /**
     * Gets the value of the sokak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSokak() {
        return sokak;
    }

    /**
     * Sets the value of the sokak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSokak(String value) {
        this.sokak = value;
    }

    /**
     * Gets the value of the binaAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaAdi() {
        return binaAdi;
    }

    /**
     * Sets the value of the binaAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaAdi(String value) {
        this.binaAdi = value;
    }

    /**
     * Gets the value of the kapiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKapiNo() {
        return kapiNo;
    }

    /**
     * Sets the value of the kapiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKapiNo(String value) {
        this.kapiNo = value;
    }

    /**
     * Gets the value of the ilceSemt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlceSemt() {
        return ilceSemt;
    }

    /**
     * Sets the value of the ilceSemt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlceSemt(String value) {
        this.ilceSemt = value;
    }

    /**
     * Gets the value of the il property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIl() {
        return il;
    }

    /**
     * Sets the value of the il property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIl(String value) {
        this.il = value;
    }

    /**
     * Gets the value of the ulke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlke() {
        return ulke;
    }

    /**
     * Sets the value of the ulke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlke(String value) {
        this.ulke = value;
    }

    /**
     * Gets the value of the postaKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostaKodu() {
        return postaKodu;
    }

    /**
     * Sets the value of the postaKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostaKodu(String value) {
        this.postaKodu = value;
    }

    /**
     * Gets the value of the vergiDairesi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVergiDairesi() {
        return vergiDairesi;
    }

    /**
     * Sets the value of the vergiDairesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVergiDairesi(String value) {
        this.vergiDairesi = value;
    }

    /**
     * Gets the value of the vergiNoTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVergiNoTCKimlikNo() {
        return vergiNoTCKimlikNo;
    }

    /**
     * Sets the value of the vergiNoTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVergiNoTCKimlikNo(String value) {
        this.vergiNoTCKimlikNo = value;
    }

    /**
     * Gets the value of the webAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAdresi() {
        return webAdresi;
    }

    /**
     * Sets the value of the webAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAdresi(String value) {
        this.webAdresi = value;
    }

    /**
     * Gets the value of the eposta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEposta() {
        return eposta;
    }

    /**
     * Sets the value of the eposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEposta(String value) {
        this.eposta = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the hizmetNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHizmetNo() {
        return hizmetNo;
    }

    /**
     * Sets the value of the hizmetNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHizmetNo(String value) {
        this.hizmetNo = value;
    }

    /**
     * Gets the value of the musteriNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusteriNo() {
        return musteriNo;
    }

    /**
     * Sets the value of the musteriNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusteriNo(String value) {
        this.musteriNo = value;
    }

    /**
     * Gets the value of the tesisatNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTesisatNo() {
        return tesisatNo;
    }

    /**
     * Sets the value of the tesisatNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTesisatNo(String value) {
        this.tesisatNo = value;
    }

    /**
     * Gets the value of the telefonNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * Sets the value of the telefonNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonNo(String value) {
        this.telefonNo = value;
    }

    /**
     * Gets the value of the distributorNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributorNo() {
        return distributorNo;
    }

    /**
     * Sets the value of the distributorNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributorNo(String value) {
        this.distributorNo = value;
    }

    /**
     * Gets the value of the ticaretSicilNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicaretSicilNo() {
        return ticaretSicilNo;
    }

    /**
     * Sets the value of the ticaretSicilNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicaretSicilNo(String value) {
        this.ticaretSicilNo = value;
    }

    /**
     * Gets the value of the tapdkNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAPDKNo() {
        return tapdkNo;
    }

    /**
     * Sets the value of the tapdkNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAPDKNo(String value) {
        this.tapdkNo = value;
    }

    /**
     * Gets the value of the bayiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBayiNo() {
        return bayiNo;
    }

    /**
     * Sets the value of the bayiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBayiNo(String value) {
        this.bayiNo = value;
    }

    /**
     * Gets the value of the aboneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAboneNo() {
        return aboneNo;
    }

    /**
     * Sets the value of the aboneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAboneNo(String value) {
        this.aboneNo = value;
    }

    /**
     * Gets the value of the sayacNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSayacNo() {
        return sayacNo;
    }

    /**
     * Sets the value of the sayacNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSayacNo(String value) {
        this.sayacNo = value;
    }

    /**
     * Gets the value of the ureticiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUreticiNo() {
        return ureticiNo;
    }

    /**
     * Sets the value of the ureticiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUreticiNo(String value) {
        this.ureticiNo = value;
    }

    /**
     * Gets the value of the ciftciNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiftciNo() {
        return ciftciNo;
    }

    /**
     * Sets the value of the ciftciNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiftciNo(String value) {
        this.ciftciNo = value;
    }

    /**
     * Gets the value of the imalatciNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImalatciNo() {
        return imalatciNo;
    }

    /**
     * Sets the value of the imalatciNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImalatciNo(String value) {
        this.imalatciNo = value;
    }

    /**
     * Gets the value of the dosyaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosyaNo() {
        return dosyaNo;
    }

    /**
     * Sets the value of the dosyaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosyaNo(String value) {
        this.dosyaNo = value;
    }

    /**
     * Gets the value of the hastaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHastaNo() {
        return hastaNo;
    }

    /**
     * Sets the value of the hastaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHastaNo(String value) {
        this.hastaNo = value;
    }

    /**
     * Gets the value of the subeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubeNo() {
        return subeNo;
    }

    /**
     * Sets the value of the subeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubeNo(String value) {
        this.subeNo = value;
    }

    /**
     * Gets the value of the mersisNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMersisNo() {
        return mersisNo;
    }

    /**
     * Sets the value of the mersisNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMersisNo(String value) {
        this.mersisNo = value;
    }

    /**
     * Gets the value of the masaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasaNo() {
        return masaNo;
    }

    /**
     * Sets the value of the masaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasaNo(String value) {
        this.masaNo = value;
    }

    /**
     * Gets the value of the kullanici property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKullanici() {
        return kullanici;
    }

    /**
     * Sets the value of the kullanici property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKullanici(String value) {
        this.kullanici = value;
    }

    /**
     * Gets the value of the ilce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlce() {
        return ilce;
    }

    /**
     * Sets the value of the ilce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlce(String value) {
        this.ilce = value;
    }

    /**
     * Gets the value of the blokAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlokAdi() {
        return blokAdi;
    }

    /**
     * Sets the value of the blokAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlokAdi(String value) {
        this.blokAdi = value;
    }

    /**
     * Gets the value of the naceKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNACEKodu() {
        return naceKodu;
    }

    /**
     * Sets the value of the naceKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNACEKodu(String value) {
        this.naceKodu = value;
    }

    /**
     * Gets the value of the kurumResmiUnvan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurumResmiUnvan() {
        return kurumResmiUnvan;
    }

    /**
     * Sets the value of the kurumResmiUnvan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurumResmiUnvan(String value) {
        this.kurumResmiUnvan = value;
    }

    /**
     * Gets the value of the kurumKayitNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurumKayitNumarasi() {
        return kurumKayitNumarasi;
    }

    /**
     * Sets the value of the kurumKayitNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurumKayitNumarasi(String value) {
        this.kurumKayitNumarasi = value;
    }

    /**
     * Gets the value of the vergiTipiKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVergiTipiKodu() {
        return vergiTipiKodu;
    }

    /**
     * Sets the value of the vergiTipiKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVergiTipiKodu(String value) {
        this.vergiTipiKodu = value;
    }

    /**
     * Gets the value of the tarafTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarafTuru() {
        return tarafTuru;
    }

    /**
     * Sets the value of the tarafTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarafTuru(String value) {
        this.tarafTuru = value;
    }

    /**
     * Gets the value of the araciKurumVergiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAraciKurumVergiNo() {
        return araciKurumVergiNo;
    }

    /**
     * Sets the value of the araciKurumVergiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAraciKurumVergiNo(String value) {
        this.araciKurumVergiNo = value;
    }

    /**
     * Gets the value of the araciKurumEtiket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAraciKurumEtiket() {
        return araciKurumEtiket;
    }

    /**
     * Sets the value of the araciKurumEtiket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAraciKurumEtiket(String value) {
        this.araciKurumEtiket = value;
    }

    /**
     * Gets the value of the sahis property.
     * 
     * @return
     *     possible object is
     *     {@link Sahis }
     *     
     */
    public Sahis getSahis() {
        return sahis;
    }

    /**
     * Sets the value of the sahis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sahis }
     *     
     */
    public void setSahis(Sahis value) {
        this.sahis = value;
    }

    /**
     * Gets the value of the musteriTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusteriTuru() {
        return musteriTuru;
    }

    /**
     * Sets the value of the musteriTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusteriTuru(String value) {
        this.musteriTuru = value;
    }

}
