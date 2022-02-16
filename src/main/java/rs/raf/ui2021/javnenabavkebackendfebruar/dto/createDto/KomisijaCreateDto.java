package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotEmpty;

public class KomisijaCreateDto {

    @NotEmpty
    private String glavni;

    public KomisijaCreateDto() {
    }

    public String getGlavni() {
        return glavni;
    }

    public void setGlavni(String glavni) {
        this.glavni = glavni;
    }
}
