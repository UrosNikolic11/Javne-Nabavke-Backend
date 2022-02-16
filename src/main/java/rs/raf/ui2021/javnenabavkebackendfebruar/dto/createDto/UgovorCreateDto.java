package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;


import javax.validation.constraints.NotNull;

public class UgovorCreateDto {

    @NotNull(message = "Narucilac id je obavezan")
    private Long narucilacId;
    @NotNull(message = "Ponudjac id je obavezan")
    private Long ponudjacId;
    @NotNull(message = "Javna nabavka id je obavezan")
    private Long javnaNabavkaId;
    private Long okvirniSporazumId;

    public UgovorCreateDto() {
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
