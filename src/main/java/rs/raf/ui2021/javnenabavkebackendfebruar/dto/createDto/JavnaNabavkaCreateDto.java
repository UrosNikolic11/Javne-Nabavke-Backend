package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class JavnaNabavkaCreateDto {

    @NotEmpty
    private String naziv;
    @NotEmpty
    private String interniBroj;
    @NotNull
    private Double procenjenaVrednost;

    private Boolean nijePredvidjenaUPlanu;
    private Boolean objavaProcenjeneVrednosti;
    private Boolean zahtevZaElekKomunikaciju;

    @NotEmpty
    private String kratakOpis;
    @NotEmpty
    private String rokZaPodnosenjePonuda;
    @NotNull
    private Integer rokVazenjaPonudeUDanima;
    @NotEmpty
    private String datumOtvaranjaPonuda;
    @NotEmpty
    private String opis;
    @NotNull
    private Boolean jelMala;
    @NotNull
    private Long komisija_id;
    @NotNull
    private Boolean komisijaOdobrila;
    @NotNull
    private Long statusJavneNabavke_id;
    @NotNull
    private Long vrstaPostupka_id;
    @NotNull
    private Long vrstaPredmeta_id;
    @NotNull
    private Long narucilac_id;

    public JavnaNabavkaCreateDto() {

    }

    public String getDatumOtvaranjaPonuda() {
        return datumOtvaranjaPonuda;
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

    public String getRokZaPodnosenjePonuda() {
        return rokZaPodnosenjePonuda;
    }

    public void setRokZaPodnosenjePonuda(String rokZaPodnosenjePonuda) {
        this.rokZaPodnosenjePonuda = rokZaPodnosenjePonuda;
    }

    public void setDatumOtvaranjaPonuda(String datumOtvaranjaPonuda) {
        this.datumOtvaranjaPonuda = datumOtvaranjaPonuda;
    }

    public Integer getRokVazenjaPonudeUDanima() {
        return rokVazenjaPonudeUDanima;
    }

    public void setRokVazenjaPonudeUDanima(Integer rokVazenjaPonudeUDanima) {
        this.rokVazenjaPonudeUDanima = rokVazenjaPonudeUDanima;
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
