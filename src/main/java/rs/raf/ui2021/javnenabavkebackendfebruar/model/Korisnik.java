package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;

// dodat zbog veze sa entitetom Narucilac 

@Entity
public class Korisnik {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column
	private String korisnickoIme;
	@Column
	private String lozinka;
	@Column
	private String ime;
	@Column
	private String prezime;
	@Column
	private String pol;
	@Column
	private String naziv;
	@Column
	private String maticniBroj;
	@Column
	private String email;
	@Column
	private String telefon;
	@Column
	private String faks;
	@Column
	private String tip;
	@Column
	private String internetStranica;
	@Column
	private Integer poreskiIdBroj;
	@Column
	private String nstjOznaka;
	@Column
	private String osobaZaKontakt;

    @OneToOne(mappedBy = "korisnik")
    private Narucilac narucilac;
    
    @OneToOne(mappedBy = "korisnik")
	private Ponudjac ponudjac;
    
    @OneToOne(mappedBy = "korisnik")
	private  Radnik radnik;

	public Korisnik() {

	}

	public Korisnik(String korisnickoIme, String lozinka, String ime, String prezime, String pol,
					String naziv, String maticniBroj, String email, String telefon, String faks,
					String tip, String internetStranica, Integer poreskiIdBroj, String nstjOznaka,
					String osobaZaKontakt, Narucilac narucilac, Ponudjac ponudjac, Radnik radnik) {
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.naziv = naziv;
		this.maticniBroj = maticniBroj;
		this.email = email;
		this.telefon = telefon;
		this.faks = faks;
		this.tip = tip;
		this.internetStranica = internetStranica;
		this.poreskiIdBroj = poreskiIdBroj;
		this.nstjOznaka = nstjOznaka;
		this.osobaZaKontakt = osobaZaKontakt;
		this.narucilac = narucilac;
		this.ponudjac = ponudjac;
		this.radnik = radnik;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Radnik getRadnik() {
		return radnik;
	}
	public void setRadnik(Radnik radnik) {
		this.radnik = radnik;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

}
