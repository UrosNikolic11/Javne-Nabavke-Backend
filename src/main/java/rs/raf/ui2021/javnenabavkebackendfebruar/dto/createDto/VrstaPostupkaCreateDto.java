package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotBlank;

public class VrstaPostupkaCreateDto {
    @NotBlank
    private String naziv;

    public VrstaPostupkaCreateDto() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
