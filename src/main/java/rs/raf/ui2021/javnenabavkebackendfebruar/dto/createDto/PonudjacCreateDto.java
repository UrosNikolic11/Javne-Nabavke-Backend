package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

public class PonudjacCreateDto {
	
	private String oblastInteresovanja;
	private Long lokacija_id;
	private Long korisnik_id;
	
	public PonudjacCreateDto() {
		
	}

	public String getOblastInteresovanja() {
		return oblastInteresovanja;
	}

	public void setOblastInteresovanja(String oblastInteresovanja) {
		this.oblastInteresovanja = oblastInteresovanja;
	}

	public Long getLokacija_id() {
		return lokacija_id;
	}

	public void setLokacija_id(Long lokacija_id) {
		this.lokacija_id = lokacija_id;
	}

	public Long getKorisnik_id() {
		return korisnik_id;
	}

	public void setKorisnik_id(Long korisnik_id) {
		this.korisnik_id = korisnik_id;
	}
	
	
}
