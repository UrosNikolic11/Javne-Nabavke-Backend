package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class LokacijaDto {
    private Long id;
    private String adresaSedista;
    private String mesto;
    private String postanskiBr;
    private String drzava;

    public LokacijaDto() {
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
}