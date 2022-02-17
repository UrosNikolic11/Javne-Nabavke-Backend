package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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

    @Column(nullable = false)
    private String kratakOpis;

    @Column
    private String cpvOznaka;

    @Column
    private String nstjOznaka;

    private String komentar;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "JavnaNabavka_id", referencedColumnName = "id")//todo referencedColumnName = "id" mozda ovo da se doda
    private JavnaNabavka javnaNabavka;

    @OneToOne
    @JoinColumn(name = "planJavneNabavke_id", referencedColumnName = "id")
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

    public String getCpvOznaka() {
        return cpvOznaka;
    }

    public void setCpvOznaka(String cpvOznaka) {
        this.cpvOznaka = cpvOznaka;
    }

    public String getNstjOznaka() {
        return nstjOznaka;
    }

    public void setNstjOznaka(String nstjOznaka) {
        this.nstjOznaka = nstjOznaka;
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
