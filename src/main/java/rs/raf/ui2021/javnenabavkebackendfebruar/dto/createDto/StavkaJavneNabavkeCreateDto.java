package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class StavkaJavneNabavkeCreateDto {
    @NotNull(message = "procenjenaVrednost cant be empty")
    private Float procenjenaVrednost;

    private Boolean objavaProcenjeneVrednosti;

    @NotNull(message = "okvirnoVreme cant be empty")
    private Integer okvirnoVreme;

    @NotEmpty(message = "kratakOpis cant be empty")
    private String kratakOpis;

    @NotEmpty(message = "CPVOznaka cant be empty")
    private String CPVOznaka;

    @NotEmpty(message = "NSTJIzvsenja cant be empty")
    private String NSTJIzvsenja;

    private String komentar;

    @NotNull(message = "javnaNabavka_id cant be empty")
    private Long javnaNabavka_id;

    @NotNull(message = "planJavneNabavke_id cant be empty")
    private Long planJavneNabavke_id;

    public StavkaJavneNabavkeCreateDto() {
    }

    public StavkaJavneNabavkeCreateDto(Float procenjenaVrednost, Boolean objavaProcenjeneVrednosti, Integer okvirnoVreme, String kratakOpis,
                                       String CPVOznaka, String NSTJIzvsenja, String komentar, Long javnaNabavka_id, Long planJavneNabavke_id) {
        this.procenjenaVrednost = procenjenaVrednost;
        this.objavaProcenjeneVrednosti = objavaProcenjeneVrednosti;
        this.okvirnoVreme = okvirnoVreme;
        this.kratakOpis = kratakOpis;
        this.CPVOznaka = CPVOznaka;
        this.NSTJIzvsenja = NSTJIzvsenja;
        this.komentar = komentar;
        this.javnaNabavka_id = javnaNabavka_id;
        this.planJavneNabavke_id = planJavneNabavke_id;
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
