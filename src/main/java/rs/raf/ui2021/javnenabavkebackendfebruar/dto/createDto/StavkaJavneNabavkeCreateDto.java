package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.persistence.Column;

public class StavkaJavneNabavkeCreateDto {


    private Float procenjenaVrednost;

    private Boolean objavaProcenjeneVrednosti;


    private Integer okvirnoVreme;


    private String kratakOpis;


    private String cpvOznaka;


    private String nstjOznaka;

    private String komentar;

    private Long javnaNabavka_id;

    private Long planJavneNabavke_id;

    public StavkaJavneNabavkeCreateDto() {
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

    public Long getJavnaNabavka_id() {
        return javnaNabavka_id;
    }

    public void setJavnaNabavka_id(Long javnaNabavka_id) {
        this.javnaNabavka_id = javnaNabavka_id;
    }

    public Long getPlanJavneNabavke_id() {
        return planJavneNabavke_id;
    }

    public void setPlanJavneNabavke_id(Long planJavneNabavke_id) {
        this.planJavneNabavke_id = planJavneNabavke_id;
    }
}
