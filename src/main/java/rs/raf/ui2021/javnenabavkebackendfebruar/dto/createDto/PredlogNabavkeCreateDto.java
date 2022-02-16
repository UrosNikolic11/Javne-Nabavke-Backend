package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotNull;

public class PredlogNabavkeCreateDto {
    @NotNull(message = "odobren cant be empty")
    private Boolean odobren;

    public PredlogNabavkeCreateDto() {
    }

    public PredlogNabavkeCreateDto(Boolean odobren) {
        this.odobren = odobren;
    }

    public Boolean getOdobren() {
        return odobren;
    }

    public void setOdobren(Boolean odobren) {
        this.odobren = odobren;
    }
}
