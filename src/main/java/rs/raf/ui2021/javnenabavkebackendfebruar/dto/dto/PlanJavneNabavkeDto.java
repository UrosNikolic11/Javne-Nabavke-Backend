package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import java.util.Date;

public class PlanJavneNabavkeDto {
    private Long id;

    private Integer godinaPlana;

    private String statusPlana;

    private Integer verzijaPlana;

    private Date datumUsvajanja;

    private Date datumSlanjaNaObjavu;

    private Long godisnjiPlanJavnihNabavkiId;

    private Long predlogNabavkeId;

    private Long narucilacId;

    private Long objavaPlanaId;

    public PlanJavneNabavkeDto() {
    }

    public PlanJavneNabavkeDto(Long id, Integer godinaPlana, String statusPlana, Integer verzijaPlana, Date datumUsvajanja,
                               Date datumSlanjaNaObjavu, Long godisnjiPlanJavnihNabavkiId, Long predlogNabavkeId, Long narucilacId, Long objavaPlanaId) {
        this.id = id;
        this.godinaPlana = godinaPlana;
        this.statusPlana = statusPlana;
        this.verzijaPlana = verzijaPlana;
        this.datumUsvajanja = datumUsvajanja;
        this.datumSlanjaNaObjavu = datumSlanjaNaObjavu;
        this.godisnjiPlanJavnihNabavkiId = godisnjiPlanJavnihNabavkiId;
        this.predlogNabavkeId = predlogNabavkeId;
        this.narucilacId = narucilacId;
        this.objavaPlanaId = objavaPlanaId;
    }

    public Integer getGodinaPlana() {
        return godinaPlana;
    }

    public void setGodinaPlana(Integer godinaPlana) {
        this.godinaPlana = godinaPlana;
    }

    public String getStatusPlana() {
        return statusPlana;
    }

    public void setStatusPlana(String statusPlana) {
        this.statusPlana = statusPlana;
    }

    public Integer getVerzijaPlana() {
        return verzijaPlana;
    }

    public void setVerzijaPlana(Integer verzijaPlana) {
        this.verzijaPlana = verzijaPlana;
    }

    public Date getDatumUsvajanja() {
        return datumUsvajanja;
    }

    public void setDatumUsvajanja(Date datumUsvajanja) {
        this.datumUsvajanja = datumUsvajanja;
    }

    public Date getDatumSlanjaNaObjavu() {
        return datumSlanjaNaObjavu;
    }

    public void setDatumSlanjaNaObjavu(Date datumSlanjaNaObjavu) {
        this.datumSlanjaNaObjavu = datumSlanjaNaObjavu;
    }

    public Long getGodisnjiPlanJavnihNabavkiId() {
        return godisnjiPlanJavnihNabavkiId;
    }

    public void setGodisnjiPlanJavnihNabavkiId(Long godisnjiPlanJavnihNabavkiId) {
        this.godisnjiPlanJavnihNabavkiId = godisnjiPlanJavnihNabavkiId;
    }

    public Long getPredlogNabavkeId() {
        return predlogNabavkeId;
    }

    public void setPredlogNabavkeId(Long predlogNabavkeId) {
        this.predlogNabavkeId = predlogNabavkeId;
    }

    public Long getNarucilacId() {
        return narucilacId;
    }

    public void setNarucilacId(Long narucilacId) {
        this.narucilacId = narucilacId;
    }

    public Long getObjavaPlanaId() {
        return objavaPlanaId;
    }

    public void setObjavaPlanaId(Long objavaPlanaId) {
        this.objavaPlanaId = objavaPlanaId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
