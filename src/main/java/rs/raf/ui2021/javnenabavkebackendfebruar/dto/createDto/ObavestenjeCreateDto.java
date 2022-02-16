package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class ObavestenjeCreateDto {

    @NotEmpty(message = "Naziv je obavezan.")
    @Max(value = 200)
    private String naziv;

    @NotEmpty(message = "Datum slanja je obavezan.")
    private Date datumSlanja;

    @NotEmpty(message = "Tekst je obavezan.")
    @Max(value = 200)
    private String tekst;

    @NotEmpty(message = "ID javne nabavke je obavezan.")
    private Long javnaNabavka;

    public ObavestenjeCreateDto(String naziv, Date datumSlanja, String tekst, Long javnaNabavka) {
        this.naziv = naziv;
        this.datumSlanja = datumSlanja;
        this.tekst = tekst;
        this.javnaNabavka = javnaNabavka;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatumSlanja() {
        return datumSlanja;
    }

    public void setDatumSlanja(Date datumSlanja) {
        this.datumSlanja = datumSlanja;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public Long getJavnaNabavka() {
        return javnaNabavka;
    }

    public void setJavnaNabavka(Long javnaNabavka) {
        this.javnaNabavka = javnaNabavka;
    }

}
