package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Narucilac {
	
	//ToDo
	//povezati entitet OsnovnaDelatnost sa ovom 
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column
	private Integer obavljaSektorskuDelatnost;
	@ManyToOne
	@JoinColumn(name = "vrstaJavnogNarucioca_id", referencedColumnName = "id")
	private VrstaJavnogNarucioca vrstaJavnogNarucioca;
	
	@OneToOne(mappedBy = "narucilac")
	private Preduzece preduzece;
	
	@ManyToOne
	 @JoinColumn(name = "osnovnaDelatnost_id")
	OsnovnaDelatnost osnovnaDelatnost;
	
	@OneToMany(mappedBy = "narucilac") 
	private List<Ugovor> ugovori = new ArrayList<Ugovor>();
	
	@OneToMany(mappedBy = "narucilac") 
	private List<JavnaNabavka> javneNabavke = new ArrayList<JavnaNabavka>();
	
	@OneToMany(mappedBy = "narucilac") 
	private List<PlanJavneNabavke> planoviJavnihNabavki = new ArrayList<PlanJavneNabavke>();
	@ManyToOne
	@JoinColumn(name = "lokacija_id", referencedColumnName = "id")
	private Lokacija lokacija;
	@OneToOne
	@JoinColumn(name = "korisnik_id", referencedColumnName = "id")
	private Korisnik korisnik;
//	@OneToMany(mappedBy = "narucilac")
//	private List<Ponudjac> ponudjac;
	
	public Narucilac() {
	
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getObavljaSektorskuDelatnost() {
		return obavljaSektorskuDelatnost;
	}
	public void setObavljaSektorskuDelatnost(Integer obavljaSektorskuDelatnost) {
		this.obavljaSektorskuDelatnost = obavljaSektorskuDelatnost;
	}
	public VrstaJavnogNarucioca getVrstaJavnogNarucioca() {
		return vrstaJavnogNarucioca;
	}
	public void setVrstaJavnogNarucioca(VrstaJavnogNarucioca vrstaJavnogNarucioca) {
		this.vrstaJavnogNarucioca = vrstaJavnogNarucioca;
	}
	public Preduzece getPreduzece() {
		return preduzece;
	}
	public void setPreduzece(Preduzece preduzece) {
		this.preduzece = preduzece;
	}

	public List<Ugovor> getUgovori() {
		return ugovori;
	}

	public void setUgovori(List<Ugovor> ugovori) {
		this.ugovori = ugovori;
	}

	public List<JavnaNabavka> getJavneNabavke() {
		return javneNabavke;
	}

	public void setJavneNabavke(List<JavnaNabavka> javneNabavke) {
		this.javneNabavke = javneNabavke;
	}

	public List<PlanJavneNabavke> getPlanoviJavnihNabavki() {
		return planoviJavnihNabavki;
	}

	public void setPlanoviJavnihNabavki(List<PlanJavneNabavke> planoviJavnihNabavki) {
		this.planoviJavnihNabavki = planoviJavnihNabavki;
	}

	public Lokacija getLokacija() {
		return lokacija;
	}

	public void setLokacija(Lokacija lokacija) {
		this.lokacija = lokacija;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public OsnovnaDelatnost getOsnovnaDelatnost() {
		return osnovnaDelatnost;
	}

	public void setOsnovnaDelatnost(OsnovnaDelatnost osnovnaDelatnost) {
		this.osnovnaDelatnost = osnovnaDelatnost;
	}

//	public List<Ponudjac> getPonudjac() {
//		return ponudjac;
//	}
//
//	public void setPonudjac(List<Ponudjac> ponudjac) {
//		this.ponudjac = ponudjac;
//	}
	
	


	
	

}
