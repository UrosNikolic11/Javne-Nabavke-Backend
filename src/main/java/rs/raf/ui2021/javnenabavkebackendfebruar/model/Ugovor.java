package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;


@Entity
@Table(name = "ugovor")
public class Ugovor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JoinColumn(name="idNarucioca", referencedColumnName = "id")
	@ManyToOne
	private Narucilac narucilac;

	@JoinColumn(name="idPonudjaca", referencedColumnName = "id")
	@ManyToOne
	private Ponudjac ponudjac;

	@JoinColumn(name="JavnaNabavka_id", referencedColumnName = "id")
	@OneToOne
	private JavnaNabavka javnaNabavka;

	@JoinColumn(name="okvirniSporazum_id", referencedColumnName = "id")
	@OneToOne
	private OkvirniSporazum okvirniSporazum;


	public Ugovor() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Narucilac getNarucilac() {
		return narucilac;
	}

	public void setNarucilac(Narucilac narucilac) {
		this.narucilac = narucilac;
	}

	public Ponudjac getPonudjac() {
		return ponudjac;
	}

	public void setPonudjac(Ponudjac ponudjac) {
		this.ponudjac = ponudjac;
	}

	public JavnaNabavka getJavnaNabavka() {
		return javnaNabavka;
	}

	public void setJavnaNabavka(JavnaNabavka javnaNabavka) {
		this.javnaNabavka = javnaNabavka;
	}

	public OkvirniSporazum getOkvirniSporazum() {
		return okvirniSporazum;
	}

	public void setOkvirniSporazum(OkvirniSporazum okvirniSporazum) {
		this.okvirniSporazum = okvirniSporazum;
	}
}