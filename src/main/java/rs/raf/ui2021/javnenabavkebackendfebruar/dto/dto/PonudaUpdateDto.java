package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import java.util.Date;

public class PonudaUpdateDto {
    private Integer samostalnaIliGrupaPonudjaca;
    private String statusPonude;
    private String interniBr;
    private Date rokVazenja;
    private Double ukupnaCena;
    private Double ukupnaCenaPdv;
    private String valuta;
    private Date rokPlacanja;
    private String nacinPlacanja;
    private Integer koristeSePodIzvodjaci;

    public PonudaUpdateDto() {
    }


    public Integer getSamostalnaIliGrupaPonudjaca() {
        return samostalnaIliGrupaPonudjaca;
    }

    public void setSamostalnaIliGrupaPonudjaca(Integer samostalnaIliGrupaPonudjaca) {
        this.samostalnaIliGrupaPonudjaca = samostalnaIliGrupaPonudjaca;
    }

    public String getStatusPonude() {
        return statusPonude;
    }

    public void setStatusPonude(String statusPonude) {
        this.statusPonude = statusPonude;
    }

    public String getInterniBr() {
        return interniBr;
    }

    public void setInterniBr(String interniBr) {
        this.interniBr = interniBr;
    }

    public Date getRokVazenja() {
        return rokVazenja;
    }

    public void setRokVazenja(Date rokVazenja) {
        this.rokVazenja = rokVazenja;
    }

    public Double getUkupnaCena() {
        return ukupnaCena;
    }

    public void setUkupnaCena(Double ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
    }

    public Double getUkupnaCenaPdv() {
        return ukupnaCenaPdv;
    }

    public void setUkupnaCenaPdv(Double ukupnaCenaPdv) {
        this.ukupnaCenaPdv = ukupnaCenaPdv;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public Date getRokPlacanja() {
        return rokPlacanja;
    }

    public void setRokPlacanja(Date rokPlacanja) {
        this.rokPlacanja = rokPlacanja;
    }

    public String getNacinPlacanja() {
        return nacinPlacanja;
    }

    public void setNacinPlacanja(String nacinPlacanja) {
        this.nacinPlacanja = nacinPlacanja;
    }

    public Integer getKoristeSePodIzvodjaci() {
        return koristeSePodIzvodjaci;
    }

    public void setKoristeSePodIzvodjaci(Integer koristeSePodIzvodjaci) {
        this.koristeSePodIzvodjaci = koristeSePodIzvodjaci;
    }
}
