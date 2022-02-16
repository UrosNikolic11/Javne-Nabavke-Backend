package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.sql.Date;

public class ObjavaPlanaCreateDto {
    @NotNull(message = "Datum objave plana je obavezan.")
    private Date datumObjave;

    @NotEmpty(message = "Status objave je obavezan.")
    @Length(max = 200)
    private String statusObjave;

    public ObjavaPlanaCreateDto() {
    }

    public ObjavaPlanaCreateDto(Date datumObjave, String statusObjave) {
        this.datumObjave = datumObjave;
        this.statusObjave = statusObjave;
    }

    public Date getDatumObjave() {
        return datumObjave;
    }

    public void setDatumObjave(Date datumObjave) {
        this.datumObjave = datumObjave;
    }

    public String getStatusObjave() {
        return statusObjave;
    }

    public void setStatusObjave(String statusObjave) {
        this.statusObjave = statusObjave;
    }
}
