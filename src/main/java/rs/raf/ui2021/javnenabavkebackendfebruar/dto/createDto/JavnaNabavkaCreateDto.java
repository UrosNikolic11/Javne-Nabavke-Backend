package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class JavnaNabavkaCreateDto {

    @NotEmpty
    private String naziv;
    @NotEmpty
    private String interniBroj;
    @NotEmpty
    private Double procenjenaVrednost;

    private Boolean nijePredvidjenaUPlanu;
    private Boolean objavaProcenjeneVrednosti;
    private Boolean zahtevZaElekKomunikaciju;

    @NotEmpty
    private String kratakOpis;
    @NotEmpty
    private Date rokZaPodnosenjePonuda;
    @NotEmpty
    private Integer rokVazenjaPonudeUDanima;
    @NotEmpty
    private Date datumOtvaranjaPonuda;
    @NotEmpty
    private String opis;
    @NotEmpty
    private Boolean jelMala;
    @NotEmpty
    private Long komisija_id;
    @NotEmpty
    private Boolean komisijaOdobrila;
    @NotEmpty
    private Long statusJavneNabavke_id;
    @NotEmpty
    private Long vrstaPostupka_id;
    @NotEmpty
    private Long vrstaPredmeta_id;
    @NotEmpty
    private Long narucilac_id;

    public JavnaNabavkaCreateDto(@NotEmpty String naziv, @NotEmpty String interniBroj, @NotEmpty Double procenjenaVrednost, Boolean nijePredvidjenaUPlanu,
                                 Boolean objavaProcenjeneVrednosti, Boolean zahtevZaElekKomunikaciju, @NotEmpty String kratakOpis,
                                 @NotEmpty Date rokZaPodnosenjePonuda, @NotEmpty Integer rokVazenjaPonudeUDanima, @NotEmpty Date datumOtvaranjaPonuda,
                                 @NotEmpty String opis, @NotEmpty Boolean jelMala, @NotEmpty Long komisija_id, @NotEmpty Boolean komisijaOdobrila,
                                 @NotEmpty Long statusJavneNabavke_id, @NotEmpty Long vrstaPostupka_id, @NotEmpty Long vrstaPredmeta_id,
                                 @NotEmpty Long narucilac_id) {
        this.naziv = naziv;
        this.interniBroj = interniBroj;
        this.procenjenaVrednost = procenjenaVrednost;
        this.nijePredvidjenaUPlanu = nijePredvidjenaUPlanu;
        this.objavaProcenjeneVrednosti = objavaProcenjeneVrednosti;
        this.zahtevZaElekKomunikaciju = zahtevZaElekKomunikaciju;
        this.kratakOpis = kratakOpis;
        this.rokZaPodnosenjePonuda = rokZaPodnosenjePonuda;
        this.rokVazenjaPonudeUDanima = rokVazenjaPonudeUDanima;
        this.datumOtvaranjaPonuda = datumOtvaranjaPonuda;
        this.opis = opis;
        this.jelMala = jelMala;
        this.komisija_id = komisija_id;
        this.komisijaOdobrila = komisijaOdobrila;
        this.statusJavneNabavke_id = statusJavneNabavke_id;
        this.vrstaPostupka_id = vrstaPostupka_id;
        this.vrstaPredmeta_id = vrstaPredmeta_id;
        this.narucilac_id = narucilac_id;
    }

    public Long getKomisija_id() {
        return komisija_id;
    }

    public void setKomisija_id(Long komisija_id) {
        this.komisija_id = komisija_id;
    }

    public Boolean getKomisijaOdobrila() {
        return komisijaOdobrila;
    }

    public void setKomisijaOdobrila(Boolean komisijaOdobrila) {
        this.komisijaOdobrila = komisijaOdobrila;
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

    public Boolean getNijePredvidjenaUPlanu() {
        return nijePredvidjenaUPlanu;
    }

    public void setNijePredvidjenaUPlanu(Boolean nijePredvidjenaUPlanu) {
        this.nijePredvidjenaUPlanu = nijePredvidjenaUPlanu;
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

    public Long getStatusJavneNabavke_id() {
        return statusJavneNabavke_id;
    }

    public void setStatusJavneNabavke_id(Long statusJavneNabavke_id) {
        this.statusJavneNabavke_id = statusJavneNabavke_id;
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

    public Long getNarucilac_id() {
        return narucilac_id;
    }

    public void setNarucilac_id(Long narucilac_id) {
        this.narucilac_id = narucilac_id;
    }
}
