package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import javax.persistence.Column;

public class RadnikUpdateDto {
	
	 
	 private  String ulogaUPreduzecu;
    
	 private  int odgovornoLice;
    
	 private  int kreiranOdStrane;
	 
	 public RadnikUpdateDto() {
		// TODO Auto-generated constructor stub
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
