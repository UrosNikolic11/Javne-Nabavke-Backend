package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartijaDto {
    private String statusPartije;
    private String naziv;
    private String valuta;
    private String kriterijumiZaDodeluUgovora;
    private String glavnoMestoIzvrsenja;
    @JsonProperty("NSTJIzvrsenja")
    private String NSTJIzvrsenja;
    private Integer trajanjeUgovoraUMesecima;
    private String dokumentiKojiSeZahtevaju;
    private Long javnaNabavkaId;

    public PartijaDto() {}

    public PartijaDto(String statusPartije, String naziv, String valuta, String kriterijumiZaDodeluUgovora,
                      String glavnoMestoIzvrsenja, String NSTJIzvrsenja, Integer trajanjeUgovoraUMesecima,
                      String dokumentiKojiSeZahtevaju, Long javnaNabavkaId) {
        this.statusPartije = statusPartije;
        this.naziv = naziv;
        this.valuta = valuta;
        this.kriterijumiZaDodeluUgovora = kriterijumiZaDodeluUgovora;
        this.glavnoMestoIzvrsenja = glavnoMestoIzvrsenja;
        this.NSTJIzvrsenja = NSTJIzvrsenja;
        this.trajanjeUgovoraUMesecima = trajanjeUgovoraUMesecima;
        this.dokumentiKojiSeZahtevaju = dokumentiKojiSeZahtevaju;
        this.javnaNabavkaId = javnaNabavkaId;
    }

    public String getStatusPartije() {
        return statusPartije;
    }

    public void setStatusPartije(String statusPartije) {
        this.statusPartije = statusPartije;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public String getKriterijumiZaDodeluUgovora() {
        return kriterijumiZaDodeluUgovora;
    }

    public void setKriterijumiZaDodeluUgovora(String kriterijumiZaDodeluUgovora) {
        this.kriterijumiZaDodeluUgovora = kriterijumiZaDodeluUgovora;
    }

    public String getGlavnoMestoIzvrsenja() {
        return glavnoMestoIzvrsenja;
    }

    public void setGlavnoMestoIzvrsenja(String glavnoMestoIzvrsenja) {
        this.glavnoMestoIzvrsenja = glavnoMestoIzvrsenja;
    }

    public String getNSTJIzvrsenja() {
        return NSTJIzvrsenja;
    }

    public void setNSTJIzvrsenja(String NSTJIzvrsenja) {
        this.NSTJIzvrsenja = NSTJIzvrsenja;
    }

    public Integer getTrajanjeUgovoraUMesecima() {
        return trajanjeUgovoraUMesecima;
    }

    public void setTrajanjeUgovoraUMesecima(Integer trajanjeUgovoraUMesecima) {
        this.trajanjeUgovoraUMesecima = trajanjeUgovoraUMesecima;
    }

    public String getDokumentiKojiSeZahtevaju() {
        return dokumentiKojiSeZahtevaju;
    }

    public void setDokumentiKojiSeZahtevaju(String dokumentiKojiSeZahtevaju) {
        this.dokumentiKojiSeZahtevaju = dokumentiKojiSeZahtevaju;
    }

    public Long getJavnaNabavkaId() {
        return javnaNabavkaId;
    }

    public void setJavnaNabavkaId(Long javnaNabavkaId) {
        this.javnaNabavkaId = javnaNabavkaId;
    }

    @Override
    public String toString() {
        return "PartijaDto{" +
                "statusPartije='" + statusPartije + '\'' +
                ", naziv='" + naziv + '\'' +
                ", valuta='" + valuta + '\'' +
                ", kriterijumiZaDodeluUgovora='" + kriterijumiZaDodeluUgovora + '\'' +
                ", glavnoMestoIzvrsenja='" + glavnoMestoIzvrsenja + '\'' +
                ", NSTJIzvrsenja='" + NSTJIzvrsenja + '\'' +
                ", trajanjeUgovoraUMesecima=" + trajanjeUgovoraUMesecima +
                ", dokumentiKojiSeZahtevaju='" + dokumentiKojiSeZahtevaju + '\'' +
                ", javnaNabavkaId=" + javnaNabavkaId +
                '}';
    }
}