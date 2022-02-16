package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class VrstaJavnogNaruciocaDto {
	private Long id;
	private String naziv;

	public VrstaJavnogNaruciocaDto(String naziv) {
		this.naziv = naziv;
	}
	
	public VrstaJavnogNaruciocaDto() {
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
