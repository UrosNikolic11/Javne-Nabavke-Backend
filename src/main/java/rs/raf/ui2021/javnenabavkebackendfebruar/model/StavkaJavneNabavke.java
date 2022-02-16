package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;

@Entity
public class StavkaJavneNabavke {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Float procenjenaVrednost;

    private Boolean objavaProcenjeneVrednosti;

    @Column(nullable = false)
    private Integer okvirnoVreme;

    @Column(length = 200, nullable = false)
    private String kratakOpis;

    @Column(length = 200, nullable = false)
    private String CPVOznaka;

    @Column(length = 200, nullable = false)
    private String NSTJIzvsenja;

    private String komentar;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "JavnaNabavka_id")//todo referencedColumnName = "id" mozda ovo da se doda
    private JavnaNabavka javnaNabavka;

    @OneToOne
    @JoinColumn(name = "planJavneNabavke_id")
    private PlanJavneNabavke planJavneNabavke;

    public StavkaJavneNabavke() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getProcenjenaVrednost() {
        return procenjenaVrednost;
    }

    public void setProcenjenaVrednost(Float procenjenaVrednost) {
        this.procenjenaVrednost = procenjenaVrednost;
    }

    public Boolean getObjavaProcenjeneVrednosti() {
        return objavaProcenjeneVrednosti;
    }

    public void setObjavaProcenjeneVrednosti(Boolean objavaProcenjeneVrednosti) {
        this.objavaProcenjeneVrednosti = objavaProcenjeneVrednosti;
    }

    public Integer getOkvirnoVreme() {
        return okvirnoVreme;
    }

    public void setOkvirnoVreme(Integer okvirnoVreme) {
        this.okvirnoVreme = okvirnoVreme;
    }

    public String getKratakOpis() {
        return kratakOpis;
    }

    public void setKratakOpis(String kratakOpis) {
        this.kratakOpis = kratakOpis;
    }

    public String getCPVOznaka() {
        return CPVOznaka;
    }

    public void setCPVOznaka(String CPVOznaka) {
        this.CPVOznaka = CPVOznaka;
    }

    public String getNSTJIzvsenja() {
        return NSTJIzvsenja;
    }

    public void setNSTJIzvsenja(String NSTJIzvsenja) {
        this.NSTJIzvsenja = NSTJIzvsenja;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public JavnaNabavka getJavnaNabavka() {
        return javnaNabavka;
    }

    public void setJavnaNabavka(JavnaNabavka javnaNabavka) {
        this.javnaNabavka = javnaNabavka;
    }

    public PlanJavneNabavke getPlanJavneNabavke() {
        return planJavneNabavke;
    }

    public void setPlanJavneNabavke(PlanJavneNabavke planJavneNabavke) {
        this.planJavneNabavke = planJavneNabavke;
    }
}
