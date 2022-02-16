package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class RadnikDto {
	
	 private Long id;
	   private  String ulogaUPreduzecu;
	   
	   private  int odgovornoLice;
	   
	   private  int kreiranOdStrane;
	   
	   private Long korisnik_id;
	   private Long preduzece_id;
	   public RadnikDto() {
		// TODO Auto-generated constructor stub
	}


	   
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}




	public Long getKorisnik_id() {
		return korisnik_id;
	}
	public void setKorisnik_id(Long korisnik_id) {
		this.korisnik_id = korisnik_id;
	}
	public Long getPreduzece_id() {
		return preduzece_id;
	}
	public void setPreduzece_id(Long preduzece_id) {
		this.preduzece_id = preduzece_id;
	}
	public String getUlogaUPreduzecu() {
		return ulogaUPreduzecu;
	}

	public void setUlogaUPreduzecu(String ulogaUPreduzecu) {
		this.ulogaUPreduzecu = ulogaUPreduzecu;
	}

	public int getOdgovornoLice() {
		return odgovornoLice;
	}

	public void setOdgovornoLice(int odgovornoLice) {
		this.odgovornoLice = odgovornoLice;
	}

	public int getKreiranOdStrane() {
		return kreiranOdStrane;
	}

	public void setKreiranOdStrane(int kreiranOdStrane) {
		this.kreiranOdStrane = kreiranOdStrane;
	}
}