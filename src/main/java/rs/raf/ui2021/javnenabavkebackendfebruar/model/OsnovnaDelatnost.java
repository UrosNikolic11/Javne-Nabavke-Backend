package rs.raf.ui2021.javnenabavkebackendfebruar.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "osnovnaDelatnost")
public class OsnovnaDelatnost {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   
	   @Column(length = 200)
	   private String naziv;
	   
	   @OneToMany(mappedBy = "osnovnaDelatnost")
	   private List<Narucilac> narucilac;
	   
	   public OsnovnaDelatnost() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<Narucilac> getNarucilac() {
		return narucilac;
	}

	public void setNarucilac(List<Narucilac> narucilac) {
		this.narucilac = narucilac;
	}
	

}