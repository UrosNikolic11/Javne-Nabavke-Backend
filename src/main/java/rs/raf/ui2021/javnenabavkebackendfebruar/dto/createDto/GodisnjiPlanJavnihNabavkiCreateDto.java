package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Date;

public class GodisnjiPlanJavnihNabavkiCreateDto {
    private Boolean objavljen;

    @NotNull(message = "Datum godisnjeg plana je obavezan.")
    @Pattern(regexp = "[0-9]{4}")
    private String godina;

    @NotNull(message = "ID preduzeca je obavezan.")
    private Long preduzeceId;

    public GodisnjiPlanJavnihNabavkiCreateDto() {
    }

    public GodisnjiPlanJavnihNabavkiCreateDto(Boolean objavljen, String godina, Long preduzeceId) {
        this.objavljen = objavljen;
        this.godina = godina;
        this.preduzeceId = preduzeceId;
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
