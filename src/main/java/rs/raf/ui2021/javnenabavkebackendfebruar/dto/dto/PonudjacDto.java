package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class PonudjacDto {
	
	private Long id;
	
	private String oblastInteresovanja;
	
	private Long lokacija_id;
	private Long korisnik_id;
	
	public PonudjacDto() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getOblastInteresovanja() {
		return oblastInteresovanja;
	}

	public void setOblastInteresovanja(String oblastInteresovanja) {
		this.oblastInteresovanja = oblastInteresovanja;
	}
	
	
}