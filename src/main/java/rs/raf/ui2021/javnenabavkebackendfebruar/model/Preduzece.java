package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Preduzece { // zapoceto zbog tabele GodisnjiPlanJavnihNabavki koja pripada grupi 3
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 200)
    private String nazivPreduzeca;

    @OneToMany
    @JoinColumn(name = "fk_preduzece")
    private List<GodisnjiPlanJavnihNabavki> godisnjiPlanJavnihNabavkiList = new ArrayList<>();
    
    @OneToOne
    @JoinColumn(name = "fk_narucilacId")
    private Narucilac narucilac;
    
 
	@OneToMany(mappedBy = "preduzece") 
    private List<Radnik> radnici = new ArrayList<Radnik>();
    

    public Preduzece() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<GodisnjiPlanJavnihNabavki> getGodisnjiPlanJavnihNabavkiList() {
        return godisnjiPlanJavnihNabavkiList;
    }

    public void setGodisnjiPlanJavnihNabavkiList(List<GodisnjiPlanJavnihNabavki> godisnjiPlanJavnihNabavkiList) {
        this.godisnjiPlanJavnihNabavkiList = godisnjiPlanJavnihNabavkiList;
    }

	public String getNazivPreduzeca() {
		return nazivPreduzeca;
	}

	public void setNazivPreduzeca(String nazivPreduzeca) {
		this.nazivPreduzeca = nazivPreduzeca;
	}

	public Narucilac getNarucilac() {
		return narucilac;
	}

	public void setNarucilac(Narucilac narucilac) {
		this.narucilac = narucilac;
	}

	public List<Radnik> getRadnici() {
		return radnici;
	}

	public void setRadnici(List<Radnik> radnici) {
		this.radnici = radnici;
	}
    
}
