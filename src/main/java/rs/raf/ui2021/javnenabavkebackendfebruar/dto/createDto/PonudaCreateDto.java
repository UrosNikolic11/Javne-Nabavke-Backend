package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class PonudaCreateDto {
    @NotNull(message = "Samostalna ili grupa ponudjaca polje je obavezno.")
    private Integer samostalnaIliGrupaPonudjaca;
    @NotBlank(message = "Status ponude je obavezan.")
    private String statusPonude;
    @NotBlank(message = "Interni broj je obavezan.")
    private String interniBr;
    @NotEmpty
    private String rokVazenja;
    @NotNull(message = "Ukupna cena je obavezna.")
    private Double ukupnaCena;
    @NotNull(message = "Ukupna cena Pdv je obavezna.")
    private Double ukupnaCenaPdv;
    @NotBlank(message = "Valuta je obavezna.")
    private String valuta;
    @NotEmpty
    private String rokPlacanja;
    @NotBlank(message = "Nacin placanja je obavezan.")
    private String nacinPlacanja;
    @NotNull(message = "Koriste se pod izvodjaci polje je obavezno.")
    private Integer koristeSePodIzvodjaci;
    @NotNull(message = "Javna nabavka id je obavezan.")
    private Long javnaNabavkaId;
    @NotNull(message = "Ponudjac id je obavezan.")
    private Long ponudjacId;

    public PonudaCreateDto() {
    }

    public Integer getSamostalnaIliGrupaPonudjaca() {
        return samostalnaIliGrupaPonudjaca;
    }

    public Long getJavnaNabavkaId() {
        return javnaNabavkaId;
    }

    public void setJavnaNabavkaId(Long javnaNabavkaId) {
        this.javnaNabavkaId = javnaNabavkaId;
    }

    public Long getPonudjacId() {
        return ponudjacId;
    }

    public void setPonudjacId(Long ponudjacId) {
        this.ponudjacId = ponudjacId;
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

    public String getRokVazenja() {
        return rokVazenja;
    }

    public void setRokVazenja(String rokVazenja) {
        this.rokVazenja = rokVazenja;
    }

    public String getRokPlacanja() {
        return rokPlacanja;
    }

    public void setRokPlacanja(String rokPlacanja) {
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
