package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class ObavestenjeOIzabranomPonudjacuDto {
    private Long id;
    private Long komisijaId;
    private Long javnaNabavkaId;

    public ObavestenjeOIzabranomPonudjacuDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
