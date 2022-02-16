package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import rs.raf.ui2021.javnenabavkebackendfebruar.exception.BadRequestException;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class JavnaNabavka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "boolean default false")
    private Boolean nijePredvidjenaUPlanu;

    @Column(length = 200)
    @NotNull
    private String naziv;

    @Column(unique = true, length = 200)
    @NotNull
    private String interniBroj;

    @Column
    @NotNull
    private Double procenjenaVrednost;

    @Column(columnDefinition = "boolean default true")
    private Boolean objavaProcenjeneVrednosti;

    @Column(columnDefinition = "boolean default false")
    private Boolean zahtevZaElekKomunikaciju;

    @Column(length = 1000)
    @NotNull
    private String kratakOpis;

    @Column
    @NotNull
    private Date rokZaPodnosenjePonuda;

    @Column
    @NotNull
    private Integer rokVazenjaPonudeUDanima;

    @Column
    @NotNull
    private Date datumOtvaranjaPonuda;

    @Column(length = 2500)
    @NotNull
    private String opis;

    @Column
    @NotNull
    private Boolean jelMala;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Komisija_id", referencedColumnName = "id")
    private Komisija komisija;

    @Column
    @NotNull
    private Boolean komisijaOdobrila;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "StatusJavneNabavke_id", referencedColumnName = "id")
    private StatusJavneNabavke statusJavneNabavke;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "VrstaPostupka_id", referencedColumnName = "id")
    private VrstaPostupka vrstaPostupka;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "VrstaPredmeta_id", referencedColumnName = "id")
    private VrstaPredmeta vrstaPredmeta;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Narucilac_id", referencedColumnName = "id")
    private Narucilac narucilac;

    public JavnaNabavka() {
    }

    public Date parseDate(String s){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(s);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        throw new BadRequestException("Pogresan unos datuma '"+s+"'");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Komisija getKomisija() {
        return komisija;
    }

    public void setKomisija(Komisija komisija) {
        this.komisija = komisija;
    }

    public Boolean getKomisijaOdobrila() {
        return komisijaOdobrila;
    }

    public void setKomisijaOdobrila(Boolean komisijaOdobrila) {
        this.komisijaOdobrila = komisijaOdobrila;
    }

    public StatusJavneNabavke getStatusJavneNabavke() {
        return statusJavneNabavke;
    }

    public void setStatusJavneNabavke(StatusJavneNabavke statusJavneNabavke) {
        this.statusJavneNabavke = statusJavneNabavke;
    }

    public VrstaPostupka getVrstaPostupka() {
        return vrstaPostupka;
    }

    public void setVrstaPostupka(VrstaPostupka vrstaPostupka) {
        this.vrstaPostupka = vrstaPostupka;
    }

    public VrstaPredmeta getVrstaPredmeta() {
        return vrstaPredmeta;
    }

    public void setVrstaPredmeta(VrstaPredmeta vrstaPredmeta) {
        this.vrstaPredmeta = vrstaPredmeta;
    }

    public Narucilac getNarucilac() {
        return narucilac;
    }

    public void setNarucilac(Narucilac narucilac) {
        this.narucilac = narucilac;
    }
}
