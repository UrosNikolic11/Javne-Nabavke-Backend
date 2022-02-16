package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import java.util.List;

import javax.persistence.*;

//dodat zbog veze sa entitetom Preduzece

@Entity
@Table(name = "radnik")
public class Radnik {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(length = 200)
	 private  String ulogaUPreduzecu;
	 
     @Column
	 private  Integer odgovornoLice;
     
	 @Column
	 private  Integer kreiranOdStrane;

	  @OneToOne
	  @JoinColumn(name = "korisnik_id", referencedColumnName = "id")
	  private   Korisnik korisnik;
	
	@ManyToOne
	@JoinColumn(name = "preduzece_id", referencedColumnName = "id")
	private Preduzece preduzece;

	@ManyToMany(mappedBy = "radnici")
	private List<PredlogNabavke> predlogNabavkes;


	public Radnik() {
	}

	public void setOdgovornoLice(Integer odgovornoLice) {
		this.odgovornoLice = odgovornoLice;
	}

	public void setKreiranOdStrane(Integer kreiranOdStrane) {
		this.kreiranOdStrane = kreiranOdStrane;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUlogaUPreduzecu() {
		return ulogaUPreduzecu;
	}

	public void setUlogaUPreduzecu(String ulogaUPreduzecu) {
		this.ulogaUPreduzecu = ulogaUPreduzecu;
	}

	public int getOdgovornoLice() {
		return odgovornoLice;
	}

	public void setOdgovornoLice(int odgovornoLice) {
		this.odgovornoLice = odgovornoLice;
	}

	public int getKreiranOdStrane() {
		return kreiranOdStrane;
	}

	public void setKreiranOdStrane(int kreiranOdStrane) {
		this.kreiranOdStrane = kreiranOdStrane;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public Preduzece getPreduzece() {
		return preduzece;
	}

	public void setPreduzece(Preduzece preduzece) {
		this.preduzece = preduzece;
	}

	public List<PredlogNabavke> getPredlogNabavkes() {
		return predlogNabavkes;
	}

	public void setPredlogNabavkes(List<PredlogNabavke> predlogNabavkes) {
		this.predlogNabavkes = predlogNabavkes;
	}

	@Override
	public String toString() {
		return "Radnik{" +
				"id=" + id +
				", ulogaUPreduzecu='" + ulogaUPreduzecu + '\'' +
				", odgovornoLice=" + odgovornoLice +
				", kreiranOdStrane=" + kreiranOdStrane +
				", korisnik=" + korisnik +
				", preduzece=" + preduzece +

				'}';
	}
}



