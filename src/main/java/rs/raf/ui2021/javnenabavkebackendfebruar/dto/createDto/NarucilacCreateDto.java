package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class NarucilacCreateDto {
	
	@NotNull(message = "Unesite vrednost za polje obavljaSektorskuDelatnost")
	private Integer obavljaSektorskuDelatnost;
	@NotNull(message = "Unesite vrednost za polje lokacja_id")
	private Long lokacija_id;
	@NotNull(message = "Unesite vrednost za polje vrstaJavnogNarucioca_id")
	private Long vrstaJavnogNarucioca_id;
	@NotNull(message = "Unesite vrednost za polje osnovnaDelatnost_id")
	private Long osnovnaDelatnost_id;
	@NotNull(message = "Unesite vrednost za polje korisnik_id")
	private Long korisnik_id;

	public NarucilacCreateDto(Integer obavljaSektorskuDelatnost, Long lokacija_id,
								Long vrstaJavnogNarucioca, Long osnovnaDelatnost_id, Long korisnik_id) {
		this.obavljaSektorskuDelatnost = obavljaSektorskuDelatnost;
		this.lokacija_id = lokacija_id;
		this.korisnik_id = korisnik_id;
		this.osnovnaDelatnost_id = osnovnaDelatnost_id;
		this.vrstaJavnogNarucioca_id = vrstaJavnogNarucioca;
	}
	
	public NarucilacCreateDto() {
		super();
	}

	public Integer getObavljaSektorskuDelatnost() {
		return obavljaSektorskuDelatnost;
	}

	public void setObavljaSektorskuDelatnost(Integer obavljaSektorskuDelatnost) {
		this.obavljaSektorskuDelatnost = obavljaSektorskuDelatnost;
	}

	public Long getLokacija_id() {
		return lokacija_id;
	}

	public void setLokacija_id(Long lokacija_id) {
		this.lokacija_id = lokacija_id;
	}

	public Long getVrstaJavnogNarucioca_id() {
		return vrstaJavnogNarucioca_id;
	}

	public void setVrstaJavnogNarucioca_id(Long vrstaJavnogNarucioca_id) {
		this.vrstaJavnogNarucioca_id = vrstaJavnogNarucioca_id;
	}

	public Long getOsnovnaDelatnost_id() {
		return osnovnaDelatnost_id;
	}

	public void setOsnovnaDelatnost_id(Long osnovnaDelatnost_id) {
		this.osnovnaDelatnost_id = osnovnaDelatnost_id;
	}

	public Long getKorisnik_id() {
		return korisnik_id;
	}

	public void setKorisnik_id(Long korisnik_id) {
		this.korisnik_id = korisnik_id;
	}
	
	

	
	
	
	

}
