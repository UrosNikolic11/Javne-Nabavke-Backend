package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotNull;

public class OkvirniSporazumCreateDto {

    @NotNull(message = "Javna nabavka id je obavezan.")
    private Long javnaNabavkaId;
    @NotNull(message = "Narucilac id je obavezan.")
    private Long narucilacId;
    @NotNull(message = "Ponudjac id je obavezan.")
    private Long ponudjacId;

    public OkvirniSporazumCreateDto() {
    }

    public Long getJavnaNabavkaId() {
        return javnaNabavkaId;
    }

    public void setJavnaNabavkaId(Long javnaNabavkaId) {
        this.javnaNabavkaId = javnaNabavkaId;
    }

    public Long getNarucilacId() {
        return narucilacId;
    }

    public void setNarucilacId(Long narucilacId) {
        this.narucilacId = narucilacId;
    }

    public Long getPonudjacId() {
        return ponudjacId;
    }

    public void setPonudjacId(Long ponudjacId) {
        this.ponudjacId = ponudjacId;
    }
}
