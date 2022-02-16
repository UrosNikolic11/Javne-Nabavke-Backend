package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class PreduzeceUpdateDto {
	
	private String nazivPreduzeca;

	public PreduzeceUpdateDto(String nazivPreduzeca, Long narucilac_id) {
		this.nazivPreduzeca = nazivPreduzeca;
	}

	public PreduzeceUpdateDto() {
		super();
	}

	public String getNazivPreduzeca() {
		return nazivPreduzeca;
	}

	public void setNazivPreduzeca(String nazivPreduzeca) {
		this.nazivPreduzeca = nazivPreduzeca;
	}


}
