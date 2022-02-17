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

    @NotEmpty(message = "Datum usvajanja je obavezan.")
    private String datumUsvajanja;

    @NotEmpty(message = "Datum slanja na objavu je obavezan.")
    private String datumSlanjaNaObjavu;

    @NotNull(message = "ID godisnjeg plana javnih nabavki je obavezan.")
    private Long godisnjiPlanJavnihNabavkiId;

    @NotNull(message = "ID predloga nabavki je obavezan.")
    private Long predlogNabavkeId;

    @NotNull(message = "ID narucioca je obavezan.")
    private Long narucilacId;

    private Long objavaPlanaId;

    public PlanJavneNabavkeCreateDto() {
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

    public String getDatumUsvajanja() {
        return datumUsvajanja;
    }

    public void setDatumUsvajanja(String datumUsvajanja) {
        this.datumUsvajanja = datumUsvajanja;
    }

    public String getDatumSlanjaNaObjavu() {
        return datumSlanjaNaObjavu;
    }

    public void setDatumSlanjaNaObjavu(String datumSlanjaNaObjavu) {
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
