package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import rs.raf.ui2021.javnenabavkebackendfebruar.model.StavkaJavneNabavke;

public class PredmetJavneNabavkeDto {
    private Long id;
    private String naziv;
    private String vrsta;
    private String kategorija;
    private Long stavkaJavneNabavke_id;

    public PredmetJavneNabavkeDto() {
    }

    public PredmetJavneNabavkeDto(Long id, String naziv, String vrsta, String kategorija, Long stavkaJavneNabavke_id) {
        this.id = id;
        this.naziv = naziv;
        this.vrsta = vrsta;
        this.kategorija = kategorija;
        this.stavkaJavneNabavke_id = stavkaJavneNabavke_id;
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

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public Long getStavkaJavneNabavke_id() {
        return stavkaJavneNabavke_id;
    }

    public void setStavkaJavneNabavke_id(Long stavkaJavneNabavke_id) {
        this.stavkaJavneNabavke_id = stavkaJavneNabavke_id;
    }

}
