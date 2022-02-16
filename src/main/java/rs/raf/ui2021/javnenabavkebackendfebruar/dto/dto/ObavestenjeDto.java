package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;


import java.util.Date;

public class ObavestenjeDto {

    private Long id;
    private String naziv;
    private Date datumSlanja;
    private String tekst;
    private Long javnaNabavka;

    public ObavestenjeDto(){}

    public ObavestenjeDto(Long id,String naziv, Date datumSlanja, String tekst, Long javnaNabavka) {
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
