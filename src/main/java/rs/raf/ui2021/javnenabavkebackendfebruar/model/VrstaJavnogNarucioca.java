package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class VrstaJavnogNarucioca {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200)
	private String naziv;
	@OneToMany(mappedBy = "vrstaJavnogNarucioca")
	private List<Narucilac> narucioci = new ArrayList<Narucilac>();
	
	public VrstaJavnogNarucioca() {
	
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Narucilac> getNarucioci() {
		return narucioci;
	}
	public void setNarucioci(List<Narucilac> narucioci) {
		this.narucioci = narucioci;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	

}
