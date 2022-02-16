package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import java.util.Date;

public class ObjavaPlanaDto {
    private Long id;

    private Date datumObjave;

    private String statusObjave;

    public ObjavaPlanaDto() {
    }

    public ObjavaPlanaDto(Long id, Date datumObjave, String statusObjave) {
        this.id = id;
        this.datumObjave = datumObjave;
        this.statusObjave = statusObjave;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
