package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ponudjac")
public class Ponudjac {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 200)
    String oblastInteresovanja;

    @OneToOne
    @JoinColumn(name = "korisnik_id", referencedColumnName = "id")
    private Korisnik korisnik;
    
    @OneToOne
    @JoinColumn(name = "lokacija_id", referencedColumnName = "id")
    private Lokacija lokacija;
    
    @OneToMany(mappedBy = "ponudjac")
    private List<OkvirniSporazum> okvirniSporazum;
    
    @OneToMany(mappedBy = "ponudjac")
    private List< Ponuda> ponuda;
    
//    @ManyToOne
//    @JoinColumn(name = "narucilac_id")
//    private Narucilac narucilac;
    @OneToMany
    @JoinColumn(name = "fk_ponudjac")
    private List<Zalba> zalba;//dodato da ne bi bacalo error grupi 3
    
    public Ponudjac() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOblastInteresovanja() {
		return oblastInteresovanja;
	}

	public void setOblastInteresovanja(String oblastInteresovanja) {
		this.oblastInteresovanja = oblastInteresovanja;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public List<OkvirniSporazum> getOkvirniSporazum() {
		return okvirniSporazum;
	}

	public void setOkvirniSporazum(List<OkvirniSporazum> okvirniSporazum) {
		this.okvirniSporazum = okvirniSporazum;
	}

	public List<Ponuda> getPonuda() {
		return ponuda;
	}

	public void setPonuda(List<Ponuda> ponuda) {
		this.ponuda = ponuda;
	}

//	public Narucilac getNarucilac() {
//		return narucilac;
//	}
//
//	public void setNarucilac(Narucilac narucilac) {
//		this.narucilac = narucilac;
//	}

	public List<Zalba> getZalba() {
		return zalba;
	}

	public void setZalba(List<Zalba> zalba) {
		this.zalba = zalba;
	}

	public Lokacija getLokacija() {
		return lokacija;
	}

	public void setLokacija(Lokacija lokacija) {
		this.lokacija = lokacija;
	}

}
