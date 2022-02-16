package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import rs.raf.ui2021.javnenabavkebackendfebruar.exception.BadRequestException;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Entity
@Table(name = "Ponuda")
public class Ponuda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "samostalnoIliGrupaPonudjaca", nullable = false)
    private Integer samostalnoIliGrupaPonudjaca;
    @Column(name = "statusPonude", nullable = false)
    private String statusPonude;
    @Column(name = "interniBroj", nullable = false)
    private String interniBr;
    @Column(name = "rokVazenjaPonude", nullable = false)
    private Date rokVazenja;
    @Column(name = "ukupnaCena", nullable = false)
    private Double ukupnaCena;
    @Column(name = "ukupnaCenaSaPDV", nullable = false)
    private Double ukupnaCenaPdv;
    @Column(nullable = false)
    private String valuta;
    @Column(name = "rokPlacanja", nullable = false)
    private Date rokPlacanja;
    @Column(name = "nacinPlacanja", nullable = false)
    private String nacinPlacanja;
    @Column(name = "koristeSePodIzvodjaci")
    private Integer koristeSePodIzvodjaci;

    @JoinColumn(name="Ponudjac_id", referencedColumnName = "id")
    @ManyToOne
    private Ponudjac ponudjac;

    @JoinColumn(name="JavnaNabavka_id", referencedColumnName = "id")
    @ManyToOne
    private JavnaNabavka javnaNabavka;
    
  


    public Ponuda() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date parseDate(String s){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(s);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        throw new BadRequestException("Pogresan unos datuma '"+s+"'");
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

    public Integer getSamostalnoIliGrupaPonudjaca() {
        return samostalnoIliGrupaPonudjaca;
    }

    public void setSamostalnoIliGrupaPonudjaca(Integer samostalnoIliGrupaPonudjaca) {
        this.samostalnoIliGrupaPonudjaca = samostalnoIliGrupaPonudjaca;
    }

    public Ponudjac getPonudjac() {
        return ponudjac;
    }

    public void setPonudjac(Ponudjac ponudjac) {
        this.ponudjac = ponudjac;
    }

    public JavnaNabavka getJavnaNabavka() {
        return javnaNabavka;
    }

    public void setJavnaNabavka(JavnaNabavka javnaNabavka) {
        this.javnaNabavka = javnaNabavka;
    }
    
    
}