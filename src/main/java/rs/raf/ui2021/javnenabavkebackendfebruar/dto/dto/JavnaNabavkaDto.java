package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import java.util.Date;

public class JavnaNabavkaDto {

    private Long id;
    private Long narucilac_id;
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
    private Long komisija_id;
    private Boolean komisijaOborila;
    private Long vrstaPostupka_id;
    private Long vrstaPredmeta_id;
    private Long statusJavneNabavke_id;

    public JavnaNabavkaDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNarucilac_id() {
        return narucilac_id;
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

    public void setNarucilac_id(Long narucilac_id) {
        this.narucilac_id = narucilac_id;
    }

    public Long getKomisija_id() {
        return komisija_id;
    }

    public void setKomisija_id(Long komisija_id) {
        this.komisija_id = komisija_id;
    }

    public Boolean getKomisijaOborila() {
        return komisijaOborila;
    }

    public void setKomisijaOborila(Boolean komisijaOborila) {
        this.komisijaOborila = komisijaOborila;
    }

    public Long getVrstaPostupka_id() {
        return vrstaPostupka_id;
    }

    public void setVrstaPostupka_id(Long vrstaPostupka_id) {
        this.vrstaPostupka_id = vrstaPostupka_id;
    }

    public Long getVrstaPredmeta_id() {
        return vrstaPredmeta_id;
    }

    public void setVrstaPredmeta_id(Long vrstaPredmeta_id) {
        this.vrstaPredmeta_id = vrstaPredmeta_id;
    }

    public Long getStatusJavneNabavke_id() {
        return statusJavneNabavke_id;
    }

    public void setStatusJavneNabavke_id(Long statusJavneNabavke_id) {
        this.statusJavneNabavke_id = statusJavneNabavke_id;
    }
}
