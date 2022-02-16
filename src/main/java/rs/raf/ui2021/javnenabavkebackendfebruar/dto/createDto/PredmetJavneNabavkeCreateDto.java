package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class PredmetJavneNabavkeCreateDto {
    @NotEmpty(message = "naziv cant be empty") 
    private String naziv;

    @NotEmpty(message = "vrsta cant be empty")
    private String vrsta;

    @NotEmpty(message = "kategorija cant be empty")
    private String kategorija;

    @NotNull(message = "stavkaJavneNabavke_id cant be empty")
    private Long stavkaJavneNabavke_id;


    public PredmetJavneNabavkeCreateDto() {
    }

    public PredmetJavneNabavkeCreateDto(String naziv, String vrsta, String kategorija, Long stavkaJavneNabavke_id) {
        this.naziv = naziv;
        this.vrsta = vrsta;
        this.kategorija = kategorija;
        this.stavkaJavneNabavke_id = stavkaJavneNabavke_id;
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
