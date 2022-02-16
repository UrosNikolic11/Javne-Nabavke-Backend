package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import java.sql.Date;

public class GodisnjiPlanJavnihNabavkiDto {
    private Long id;

    private Boolean objavljen;

    private String godina;

    private Long preduzeceId;

    public GodisnjiPlanJavnihNabavkiDto() {
    }

    public GodisnjiPlanJavnihNabavkiDto(Long id, Boolean objavljen, String godina, Long preduzeceId) {
        this.id = id;
        this.objavljen = objavljen;
        this.godina = godina;
        this.preduzeceId = preduzeceId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getObjavljen() {
        return objavljen;
    }

    public void setObjavljen(Boolean objavljen) {
        this.objavljen = objavljen;
    }

    public String getGodina() {
        return godina;
    }

    public void setGodina(String godina) {
        this.godina = godina;
    }

    public Long getPreduzeceId() {
        return preduzeceId;
    }

    public void setPreduzeceId(Long preduzeceId) {
        this.preduzeceId = preduzeceId;
    }
}
