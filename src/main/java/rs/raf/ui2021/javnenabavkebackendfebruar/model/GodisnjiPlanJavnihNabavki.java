package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GodisnjiPlanJavnihNabavki {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean objavljen;

    @Column(nullable = false)
    private String godina;

    @OneToMany
    private List<PlanJavneNabavke> planJavneNabavkeList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "preduzece_id", nullable = false)
    private Preduzece preduzece;


    public GodisnjiPlanJavnihNabavki() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getObjavljen() {
        return objavljen;
    }

    public void setObjavljen(Boolean objavljen) {
        this.objavljen = objavljen;
    }

    public String getGodina() {
        return godina;
    }

    public void setGodina(String godina) {
        this.godina = godina;
    }

    public List<PlanJavneNabavke> getPlanJavneNabavkeList() {
        return planJavneNabavkeList;
    }

    public void setPlanJavneNabavkeList(List<PlanJavneNabavke> planJavneNabavkeList) {
        this.planJavneNabavkeList = planJavneNabavkeList;
    }

    public Preduzece getPreduzece() {
        return preduzece;
    }

    public void setPreduzece(Preduzece preduzece) {
        this.preduzece = preduzece;
    }
}
