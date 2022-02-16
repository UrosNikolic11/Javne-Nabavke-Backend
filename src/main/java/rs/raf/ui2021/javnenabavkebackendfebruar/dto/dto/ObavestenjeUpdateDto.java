package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import java.util.Date;

public class ObavestenjeUpdateDto {

    private String naziv;
    private Date datumSlanja;
    private String tekst;

    public ObavestenjeUpdateDto() {
    }

    public ObavestenjeUpdateDto(String naziv, Date datumSlanja, String tekst) {
        this.naziv = naziv;
        this.datumSlanja = datumSlanja;
        this.tekst = tekst;
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
}
