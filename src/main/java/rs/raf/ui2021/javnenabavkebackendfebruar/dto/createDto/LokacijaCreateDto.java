package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotBlank;

public class LokacijaCreateDto {
    @NotBlank(message = "Adresa sedista je obavezna.")
    private String adresaSedista;
    @NotBlank(message = "Mesto je obavezno.")
    private String mesto;
    @NotBlank(message = "Postanski broj je obavezan.")
    private String postanskiBr;
    @NotBlank(message = "Drzava je obavezna.")
    private String drzava;

    public LokacijaCreateDto() {
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