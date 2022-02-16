package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;


@Entity
@Table(name = "okvirnisporazum")
public class OkvirniSporazum {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JoinColumn(name="JavnaNabavka_id", referencedColumnName = "id")
	@OneToOne
	private JavnaNabavka javnaNabavka;

	@JoinColumn(name="Narucilac_id", referencedColumnName = "id")
	@ManyToOne
	private Narucilac narucilac;

	@JoinColumn(name="Ponudjac_id", referencedColumnName = "id")
	@ManyToOne
	private Ponudjac ponudjac;




	public OkvirniSporazum() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public JavnaNabavka getJavnaNabavka() {
		return javnaNabavka;
	}

	public void setJavnaNabavka(JavnaNabavka javnaNabavka) {
		this.javnaNabavka = javnaNabavka;
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
}
