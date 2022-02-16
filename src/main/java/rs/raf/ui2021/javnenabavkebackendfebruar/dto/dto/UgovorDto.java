package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import javax.validation.constraints.NotNull;

public class UgovorDto {

    private Long id;
    private Long narucilacId;
    private Long ponudjacId;
    private Long javnaNabavkaId;
    private Long okvirniSporazumId;

    public UgovorDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getJavnaNabavkaId() {
        return javnaNabavkaId;
    }

    public void setJavnaNabavkaId(Long javnaNabavkaId) {
        this.javnaNabavkaId = javnaNabavkaId;
    }

    public Long getOkvirniSporazumId() {
        return okvirniSporazumId;
    }

    public void setOkvirniSporazumId(Long okvirniSporazumId) {
        this.okvirniSporazumId = okvirniSporazumId;
    }
}
