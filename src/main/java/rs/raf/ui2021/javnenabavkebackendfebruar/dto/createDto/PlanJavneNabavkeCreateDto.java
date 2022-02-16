package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class PlanJavneNabavkeCreateDto {
    @NotNull(message = "Godina plana je obavezna.")
    private Integer godinaPlana;

    @NotEmpty(message = "Status plana je obavezan.")
    @Length(max = 200)
    private String statusPlana;

    @NotNull(message = "Verzija plana je obavezna.")
    private Integer verzijaPlana;

    @NotNull(message = "Datum usvajanja je obavezan.")
    private Date datumUsvajanja;

    @NotNull(message = "Datum slanja na objavu je obavezan.")
    private Date datumSlanjaNaObjavu;

    @NotNull(message = "ID godisnjeg plana javnih nabavki je obavezan.")
    private Long godisnjiPlanJavnihNabavkiId;

    @NotNull(message = "ID predloga nabavki je obavezan.")
    private Long predlogNabavkeId;

    @NotNull(message = "ID narucioca je obavezan.")
    private Long narucilacId;

    private Long objavaPlanaId;

    public PlanJavneNabavkeCreateDto() {
    }

    public PlanJavneNabavkeCreateDto(Integer godinaPlana, String statusPlana, Integer verzijaPlana, Date datumUsvajanja, Date datumSlanjaNaObjavu,
                                     Long godisnjiPlanJavnihNabavkiId, Long predlogNabavkeId, Long narucilacId, Long objavaPlanaId) {
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
}
