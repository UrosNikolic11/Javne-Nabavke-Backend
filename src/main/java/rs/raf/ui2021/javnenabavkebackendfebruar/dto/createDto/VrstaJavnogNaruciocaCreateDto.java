package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotEmpty;

public class VrstaJavnogNaruciocaCreateDto {
	
	@NotEmpty(message = "Unesite vrednost za polje naziv")
	private String naziv;

	public VrstaJavnogNaruciocaCreateDto(String naziv) {
		this.naziv = naziv;
	}

	public VrstaJavnogNaruciocaCreateDto() {
		super();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	

}
