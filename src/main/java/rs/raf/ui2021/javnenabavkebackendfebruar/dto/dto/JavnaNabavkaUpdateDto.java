package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import java.util.Date;

public class JavnaNabavkaUpdateDto {

    private Boolean nijePredvidjenaUPlanu;
    private String naziv;
    private String interniBroj;
    private Double procenjenaVrednost;
    private Boolean objavaProcenjeneVrednosti;
    private Boolean zahtevZaElekKomunikaciju;
    private String kratakOpis;
    private Date rokZaPodnosenjePonuda;
    private Integer rokVazenjaPonudeUDanima;
    private Date datumOtvaranjaPonuda;
    private String opis;
    private Boolean jelMala;
    private Boolean komisijaOborila;

    public JavnaNabavkaUpdateDto(Boolean nijePredvidjenaUPlanu, String naziv, String interniBroj, Double procenjenaVrednost, Boolean objavaProcenjeneVrednosti,
                                 Boolean zahtevZaElekKomunikaciju, String kratakOpis, Date rokZaPodnosenjePonuda, Integer rokVazenjaPonudeUDanima, Date datumOtvaranjaPonuda,
                                 String opis, Boolean jelMala, Boolean komisijaOborila) {
        this.nijePredvidjenaUPlanu = nijePredvidjenaUPlanu;
        this.naziv = naziv;
        this.interniBroj = interniBroj;
        this.procenjenaVrednost = procenjenaVrednost;
        this.objavaProcenjeneVrednosti = objavaProcenjeneVrednosti;
        this.zahtevZaElekKomunikaciju = zahtevZaElekKomunikaciju;
        this.kratakOpis = kratakOpis;
        this.rokZaPodnosenjePonuda = rokZaPodnosenjePonuda;
        this.rokVazenjaPonudeUDanima = rokVazenjaPonudeUDanima;
        this.datumOtvaranjaPonuda = datumOtvaranjaPonuda;
        this.opis = opis;
        this.jelMala = jelMala;
        this.komisijaOborila = komisijaOborila;
    }

    public Boolean getNijePredvidjenaUPlanu() {
        return nijePredvidjenaUPlanu;
    }

    public void setNijePredvidjenaUPlanu(Boolean nijePredvidjenaUPlanu) {
        this.nijePredvidjenaUPlanu = nijePredvidjenaUPlanu;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getInterniBroj() {
        return interniBroj;
    }

    public void setInterniBroj(String interniBroj) {
        this.interniBroj = interniBroj;
    }

    public Double getProcenjenaVrednost() {
        return procenjenaVrednost;
    }

    public void setProcenjenaVrednost(Double procenjenaVrednost) {
        this.procenjenaVrednost = procenjenaVrednost;
    }

    public Boolean getObjavaProcenjeneVrednosti() {
        return objavaProcenjeneVrednosti;
    }

    public void setObjavaProcenjeneVrednosti(Boolean objavaProcenjeneVrednosti) {
        this.objavaProcenjeneVrednosti = objavaProcenjeneVrednosti;
    }

    public Boolean getZahtevZaElekKomunikaciju() {
        return zahtevZaElekKomunikaciju;
    }

    public void setZahtevZaElekKomunikaciju(Boolean zahtevZaElekKomunikaciju) {
        this.zahtevZaElekKomunikaciju = zahtevZaElekKomunikaciju;
    }

    public String getKratakOpis() {
        return kratakOpis;
    }

    public void setKratakOpis(String kratakOpis) {
        this.kratakOpis = kratakOpis;
    }

    public Date getRokZaPodnosenjePonuda() {
        return rokZaPodnosenjePonuda;
    }

    public void setRokZaPodnosenjePonuda(Date rokZaPodnosenjePonuda) {
        this.rokZaPodnosenjePonuda = rokZaPodnosenjePonuda;
    }

    public Integer getRokVazenjaPonudeUDanima() {
        return rokVazenjaPonudeUDanima;
    }

    public void setRokVazenjaPonudeUDanima(Integer rokVazenjaPonudeUDanima) {
        this.rokVazenjaPonudeUDanima = rokVazenjaPonudeUDanima;
    }

    public Date getDatumOtvaranjaPonuda() {
        return datumOtvaranjaPonuda;
    }

    public void setDatumOtvaranjaPonuda(Date datumOtvaranjaPonuda) {
        this.datumOtvaranjaPonuda = datumOtvaranjaPonuda;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Boolean getJelMala() {
        return jelMala;
    }

    public void setJelMala(Boolean jelMala) {
        this.jelMala = jelMala;
    }

    public Boolean getKomisijaOborila() {
        return komisijaOborila;
    }

    public void setKomisijaOborila(Boolean komisijaOborila) {
        this.komisijaOborila = komisijaOborila;
    }
}
