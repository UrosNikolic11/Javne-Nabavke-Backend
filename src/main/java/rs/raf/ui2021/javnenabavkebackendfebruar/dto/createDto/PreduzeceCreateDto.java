package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class PreduzeceCreateDto {
	
	@NotNull(message = "Unesite vrednost za polje nazivPreduzeca")
	private String nazivPreduzeca;
	@NotNull(message = "Unesite vrednost za polje narucilac_id")
	private Long narucilac_id;

	public PreduzeceCreateDto(String nazivPreduzeca, Long narucilac_id) {
		this.nazivPreduzeca = nazivPreduzeca;
		this.narucilac_id = narucilac_id;
	}
	
	public PreduzeceCreateDto() {
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
