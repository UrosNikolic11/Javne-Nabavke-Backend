package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;

@Entity
public class Zalba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ponudjac_id", nullable = false)
    private Ponudjac ponudjac;

    @ManyToOne
    @JoinColumn(name = "komisija_id", nullable = false)
    private Komisija komisija;

    @ManyToOne
    @JoinColumn(name = "obavestenjeOIzabranomPonudjacu_id", nullable = false)
    private ObavestenjeOIzabranomPonudjacu obavestenjeOIzabranomPonudjacu;

    @ManyToOne
    @JoinColumn(name = "javnaNabavka_id", nullable = false)
    private JavnaNabavka javnaNabavka;

    public Zalba() {
    }

    public Ponudjac getPonudjac() {
		return ponudjac;
	}

	public void setPonudjac(Ponudjac ponudjac) {
		this.ponudjac = ponudjac;
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

    public ObavestenjeOIzabranomPonudjacu getObavestenjeOIzabranomPonudjacu() {
        return obavestenjeOIzabranomPonudjacu;
    }

    public void setObavestenjeOIzabranomPonudjacu(ObavestenjeOIzabranomPonudjacu obavestenjeOIzabranomPonudjacu) {
        this.obavestenjeOIzabranomPonudjacu = obavestenjeOIzabranomPonudjacu;
    }

    public JavnaNabavka getJavnaNabavka() {
        return javnaNabavka;
    }

    public void setJavnaNabavka(JavnaNabavka javnaNabavka) {
        this.javnaNabavka = javnaNabavka;
    }
}
