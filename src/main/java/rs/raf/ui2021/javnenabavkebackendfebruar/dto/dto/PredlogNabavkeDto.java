package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;


public class PredlogNabavkeDto {
    private Long id;
    private Boolean odobren;

    public PredlogNabavkeDto() {
    }

    public PredlogNabavkeDto(Long id, Boolean odobren) {
        this.id = id;
        this.odobren = odobren;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getOdobren() {
        return odobren;
    }

    public void setOdobren(Boolean odobren) {
        this.odobren = odobren;
    }
}
