package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotNull;

public class ObavestenjeOIzabranomPonudjacuCreateDto {

    @NotNull(message = "Komisija id je obavezan.")
    private Long komisijaId;

    @NotNull(message = "Javna nabavka id je obavezan.")
    private Long javnaNabavkaId;


    public ObavestenjeOIzabranomPonudjacuCreateDto() {
    }

    public Long getKomisijaId() {
        return komisijaId;
    }

    public void setKomisijaId(Long komisijaId) {
        this.komisijaId = komisijaId;
    }

    public Long getJavnaNabavkaId() {
        return javnaNabavkaId;
    }

    public void setJavnaNabavkaId(Long javnaNabavkaId) {
        this.javnaNabavkaId = javnaNabavkaId;
    }
}
