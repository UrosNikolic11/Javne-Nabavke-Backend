package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table
public class Obavestenje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private String naziv;

    @Column
    @NotNull
    private Date datumSlanja;

    @Column
    @NotNull
    private String tekst;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "JavnaNabavka_id", referencedColumnName = "id")
    private JavnaNabavka javnaNabavka;

    public Obavestenje() {}

    public Obavestenje(Long id, @NotNull String naziv, @NotNull Date datumSlanja, @NotNull String tekst, JavnaNabavka javnaNabavka) {
        this.id = id;
        this.naziv = naziv;
        this.datumSlanja = datumSlanja;
        this.tekst = tekst;
        this.javnaNabavka = javnaNabavka;
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

    public Date getDatumSlanja() {
        return datumSlanja;
    }

    public void setDatumSlanja(Date datumSlanja) {
        this.datumSlanja = datumSlanja;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public JavnaNabavka getJavnaNabavka() {
        return javnaNabavka;
    }

    public void setJavnaNabavka(JavnaNabavka javnaNabavka) {
        this.javnaNabavka = javnaNabavka;
    }
}