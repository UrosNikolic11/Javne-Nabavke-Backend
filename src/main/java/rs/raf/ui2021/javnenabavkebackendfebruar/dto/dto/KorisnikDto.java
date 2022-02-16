package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import rs.raf.ui2021.javnenabavkebackendfebruar.model.Narucilac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Ponudjac;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Radnik;

public class KorisnikDto {

    private Long id;
    private String korisnickoIme;
    private String ime;
    private String prezime;
    private String email;
    private String pol;
    private String naziv;
    private String maticniBroj;
    private String telefon;
    private String faks;
    private String tip;
    private String internetStranica;
    private Integer poreskiIdBroj;
    private String nstjOznaka;
    private String osobaZaKontakt;
    private Radnik radnik;
    private Narucilac narucilac;
    private Ponudjac ponudjac;

    public KorisnikDto() {
    }

    public KorisnikDto(Long id, String korisnickoIme, String ime, String prezime, String email, String pol, String naziv,
                       String maticniBroj, String telefon, String faks, String tip, String internetStranica,
                       Integer poreskiIdBroj, String nstjOznaka, String osobaZaKontakt,
                       Radnik radnik, Narucilac narucilac, Ponudjac ponudjac) {
        this.id = id;
        this.korisnickoIme = korisnickoIme;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.pol = pol;
        this.naziv = naziv;
        this.maticniBroj = maticniBroj;
        this.telefon = telefon;
        this.faks = faks;
        this.tip = tip;
        this.internetStranica = internetStranica;
        this.poreskiIdBroj = poreskiIdBroj;
        this.nstjOznaka = nstjOznaka;
        this.osobaZaKontakt = osobaZaKontakt;
        this.radnik = radnik;
        this.narucilac = narucilac;
        this.ponudjac = ponudjac;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(String maticniBroj) {
        this.maticniBroj = maticniBroj;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getFaks() {
        return faks;
    }

    public void setFaks(String faks) {
        this.faks = faks;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getInternetStranica() {
        return internetStranica;
    }

    public void setInternetStranica(String internetStranica) {
        this.internetStranica = internetStranica;
    }

    public Integer getPoreskiIdBroj() {
        return poreskiIdBroj;
    }

    public void setPoreskiIdBroj(Integer poreskiIdBroj) {
        this.poreskiIdBroj = poreskiIdBroj;
    }

    public String getNstjOznaka() {
        return nstjOznaka;
    }

    public void setNstjOznaka(String nstjOznaka) {
        this.nstjOznaka = nstjOznaka;
    }

    public String getOsobaZaKontakt() {
        return osobaZaKontakt;
    }

    public void setOsobaZaKontakt(String osobaZaKontakt) {
        this.osobaZaKontakt = osobaZaKontakt;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public Narucilac getNarucilac() {
        return narucilac;
    }

    public void setNarucilac(Narucilac narucilac) {
        this.narucilac = narucilac;
    }

    public Ponudjac getPonudjac() {
        return ponudjac;
    }

    public void setPonudjac(Ponudjac ponudjac) {
        this.ponudjac = ponudjac;
    }
}
