package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class PreduzeceDto {
	private Long id;
	private String nazivPreduzeca;
	private Long narucilac_id;




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PreduzeceDto() {
		super();
	}

	public String getNazivPreduzeca() {
		return nazivPreduzeca;
	}

	public void setNazivPreduzeca(String nazivPreduzeca) {
		this.nazivPreduzeca = nazivPreduzeca;
	}

	public Long getNarucilac_id() {
		return narucilac_id;
	}

	public void setNarucilac_id(Long narucilac_id) {
		this.narucilac_id = narucilac_id;
	}
	
	
	
}
