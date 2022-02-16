package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class PredlogNabavke {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Boolean odobren;

    @ManyToMany
    @JoinTable (name = "predlogNabavke_has_Radnik",joinColumns = {@JoinColumn(name = "radnik_id")}, inverseJoinColumns = {@JoinColumn(name = "predlogNabavke_id")})//todo mozda mora da se okrenu ids
    private List<Radnik> radnici;

    public PredlogNabavke() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getOdobren() {
        return odobren;
    }

    public void setOdobren(Boolean odobren) {
        this.odobren = odobren;
    }

    public List<Radnik> getRadnici() {
        return radnici;
    }

    public void setRadnici(List<Radnik> radnici) {
        this.radnici = radnici;
    }
}
