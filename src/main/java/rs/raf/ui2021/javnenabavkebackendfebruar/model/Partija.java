package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;

@Entity
@Table
public class Partija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String statusPartije;

    @Column(length = 200)
    private String naziv;

    @Column(length = 10)
    private String valuta;

    @Column(length = 1000)
    private String kriterijumiZaDodeluUgovora;

    @Column(length = 200)
    private String glavnoMestoIzvrsenja;

    @Column(length = 200)
    private String NSTJIzvrsenja;

    @Column
    private Integer trajanjeUgovoraUMesecima;

    @Column(length = 500)
    private String dokumentiKojiSeZahtevaju;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "JavnaNabavka_id", referencedColumnName = "id")
    private JavnaNabavka javnaNabavka;

    public Partija() {}

    public Partija(Long id, String statusPartije, String naziv, String valuta, String kriterijumiZaDodeluUgovora,
                   String glavnoMestoIzvrsenja, String NSTJIzvrsenja, Integer trajanjeUgovoraUMesecima,
                   String dokumentiKojiSeZahtevaju, JavnaNabavka javnaNabavka) {
        this.id = id;
        this.statusPartije = statusPartije;
        this.naziv = naziv;
        this.valuta = valuta;
        this.kriterijumiZaDodeluUgovora = kriterijumiZaDodeluUgovora;
        this.glavnoMestoIzvrsenja = glavnoMestoIzvrsenja;
        this.NSTJIzvrsenja = NSTJIzvrsenja;
        this.trajanjeUgovoraUMesecima = trajanjeUgovoraUMesecima;
        this.dokumentiKojiSeZahtevaju = dokumentiKojiSeZahtevaju;
        this.javnaNabavka = javnaNabavka;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusPartije() {
        return statusPartije;
    }

    public void setStatusPartije(String statusPartije) {
        this.statusPartije = statusPartije;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public String getKriterijumiZaDodeluUgovora() {
        return kriterijumiZaDodeluUgovora;
    }

    public void setKriterijumiZaDodeluUgovora(String kriterijumiZaDodeluUgovora) {
        this.kriterijumiZaDodeluUgovora = kriterijumiZaDodeluUgovora;
    }

    public String getGlavnoMestoIzvrsenja() {
        return glavnoMestoIzvrsenja;
    }

    public void setGlavnoMestoIzvrsenja(String glavnoMestoIzvrsenja) {
        this.glavnoMestoIzvrsenja = glavnoMestoIzvrsenja;
    }

    public String getNSTJIzvrsenja() {
        return NSTJIzvrsenja;
    }

    public void setNSTJIzvrsenja(String NSTJIzvrsenja) {
        this.NSTJIzvrsenja = NSTJIzvrsenja;
    }

    public Integer getTrajanjeUgovoraUMesecima() {
        return trajanjeUgovoraUMesecima;
    }

    public void setTrajanjeUgovoraUMesecima(Integer trajanjeUgovoraUMesecima) {
        this.trajanjeUgovoraUMesecima = trajanjeUgovoraUMesecima;
    }

    public String getDokumentiKojiSeZahtevaju() {
        return dokumentiKojiSeZahtevaju;
    }

    public void setDokumentiKojiSeZahtevaju(String dokumentiKojiSeZahtevaju) {
        this.dokumentiKojiSeZahtevaju = dokumentiKojiSeZahtevaju;
    }

    public JavnaNabavka getJavnaNabavka() {
        return javnaNabavka;
    }

    public void setJavnaNabavka(JavnaNabavka javnaNabavka) {
        this.javnaNabavka = javnaNabavka;
    }
}