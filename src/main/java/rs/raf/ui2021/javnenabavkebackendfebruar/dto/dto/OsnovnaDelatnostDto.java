package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class OsnovnaDelatnostDto {
	
	private Long id;
	
	 private String naziv;
	 
	 public OsnovnaDelatnostDto() {
		// TODO Auto-generated constructor stub
	}
	 
	 public OsnovnaDelatnostDto(Long id, String naziv ){
		 this.id=id;
		 this.naziv=naziv;
		 
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	   
	 

}
