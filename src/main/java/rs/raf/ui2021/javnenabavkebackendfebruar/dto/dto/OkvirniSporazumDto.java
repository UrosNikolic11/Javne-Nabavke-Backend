package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import javax.validation.constraints.NotNull;

public class OkvirniSporazumDto {

    private Long id;
    private Long javnaNabavkaId;
    private Long narucilacId;
    private Long ponudjacId;

    public OkvirniSporazumDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
