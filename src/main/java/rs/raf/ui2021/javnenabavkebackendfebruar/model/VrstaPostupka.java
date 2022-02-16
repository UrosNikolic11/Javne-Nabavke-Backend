package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class VrstaPostupka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private String naziv;

    public VrstaPostupka() {}

    public VrstaPostupka(Long id, @NotNull String naziv) {
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
