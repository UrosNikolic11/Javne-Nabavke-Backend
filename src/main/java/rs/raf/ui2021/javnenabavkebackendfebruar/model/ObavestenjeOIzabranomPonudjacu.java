package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "obavestenjeoizabranomponudjacu")
public class ObavestenjeOIzabranomPonudjacu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name="Komisija_id", referencedColumnName = "id")
    @ManyToOne
    private Komisija komisija;
    @JoinColumn(name="JavnaNabavka_id", referencedColumnName = "id")
    @ManyToOne
    private JavnaNabavka javnaNabavka;


    public ObavestenjeOIzabranomPonudjacu() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Komisija getKomisija() {
        return komisija;
    }

    public void setKomisija(Komisija komisija) {
        this.komisija = komisija;
    }

    public JavnaNabavka getJavnaNabavka() {
        return javnaNabavka;
    }

    public void setJavnaNabavka(JavnaNabavka javnaNabavka) {
        this.javnaNabavka = javnaNabavka;
    }
}

