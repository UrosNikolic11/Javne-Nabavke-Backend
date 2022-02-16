package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class VrstaPostupkaDto {
    private Long id;
    private String naziv;

    public VrstaPostupkaDto() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

