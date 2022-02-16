package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class NarucilacDto {
	private Long id;
	private Integer obavljaSektorskuDelatnost;
	private Long lokacija_id;
	private Long vrstaJavnogNarucioca_id;
	//private Integer osnovnaDelatnost_id;
	private Long korisnik_id;

	public NarucilacDto(Integer obavljaSektorskuDelatnost, Long lokacija_id, 
			Long vrstaJavnogNarucioca_id, /*Integer osnovnaDelatnost_id,*/ Long korisnik_id) {
		this.obavljaSektorskuDelatnost = obavljaSektorskuDelatnost;
		this.lokacija_id = lokacija_id;
		this.vrstaJavnogNarucioca_id = vrstaJavnogNarucioca_id;
		//this.osnovnaDelatnost_id = osnovnaDelatnost_id;
		this.korisnik_id = korisnik_id;
	}

	public NarucilacDto() {
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

	public void setVrstaJavnogNarucioca_id(Long id) {
		this.vrstaJavnogNarucioca_id = id;
	}

	/*public Integer getOsnovnaDelatnost_id() {
		return osnovnaDelatnost_id;
	}

	public void setOsnovnaDelatnost_id(Integer osnovnaDelatnost_id) {
		this.osnovnaDelatnost_id = osnovnaDelatnost_id;
	}*/

	public Long getKorisnik_id() {
		return korisnik_id;
	}

	public void setKorisnik_id(Long korisnik_id) {
		this.korisnik_id = korisnik_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
