package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class StatusJavneNabavke {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    @NotNull
    @NotEmpty
    private String naziv;

    public StatusJavneNabavke() {}

    public StatusJavneNabavke(Long id, String naziv) {
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