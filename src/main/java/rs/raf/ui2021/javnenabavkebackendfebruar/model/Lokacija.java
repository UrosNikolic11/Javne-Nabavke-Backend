package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//dodat zbog veze sa entitetom Narucilac

import javax.persistence.*;

@Entity
@Table(name = "lokacija")
public class Lokacija {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "adresaSedista", nullable = false)
	private String adresaSedista;
	@Column(name = "mesto", nullable = false)
	private String mesto;
	@Column(name = "postanskiBroj", nullable = false)
	private String postanskiBr;
	@Column(name = "drzava", nullable = false)
	private String drzava;
	
	@OneToOne(mappedBy = "lokacija")
	   private Ponudjac ponudjac;

	public Lokacija() {
	}

	public Lokacija(Long id, String adresaSedista, String mesto, String postanskiBr, String drzava, Ponudjac ponudjac) {
		this.id = id;
		this.adresaSedista = adresaSedista;
		this.mesto = mesto;
		this.postanskiBr = postanskiBr;
		this.drzava = drzava;
		this.ponudjac=ponudjac;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdresaSedista() {
		return adresaSedista;
	}

	public void setAdresaSedista(String adresaSedista) {
		this.adresaSedista = adresaSedista;
	}

	public String getMesto() {
		return mesto;
	}

	public void setMesto(String mesto) {
		this.mesto = mesto;
	}

	public String getPostanskiBr() {
		return postanskiBr;
	}

	public void setPostanskiBr(String postanskiBr) {
		this.postanskiBr = postanskiBr;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public Ponudjac getPonudjac() {
		return ponudjac;
	}

	public void setPonudjac(Ponudjac ponudjac) {
		this.ponudjac = ponudjac;
	}
	
	
}

