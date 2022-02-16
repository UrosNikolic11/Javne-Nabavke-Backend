package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;


@Entity
public class PredmetJavneNabavke {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String naziv;

    @Column(nullable = false)
    private String vrsta;

    @Column(nullable = false)
    private String kategorija;

    @OneToOne
    @JoinColumn(name = "stavkaJavneNabavke_id",referencedColumnName = "id")//todo proveri da li je ovo dobro
    private StavkaJavneNabavke stavkaJavneNabavke;

    public PredmetJavneNabavke() {
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

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public StavkaJavneNabavke getStavkaJavneNabavke() {
        return stavkaJavneNabavke;
    }

    public void setStavkaJavneNabavke(StavkaJavneNabavke stavkaJavneNabavke) {
        this.stavkaJavneNabavke = stavkaJavneNabavke;
    }
}
