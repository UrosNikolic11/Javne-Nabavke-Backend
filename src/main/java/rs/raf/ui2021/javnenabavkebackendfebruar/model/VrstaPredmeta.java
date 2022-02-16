package rs.raf.ui2021.javnenabavkebackendfebruar.model;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class VrstaPredmeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45)
    @NotNull
    @NotEmpty
    private String naziv;

    public VrstaPredmeta() {}

    public VrstaPredmeta(Long id, String naziv) {
        this.id = id;
        this.naziv = naziv;
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
}