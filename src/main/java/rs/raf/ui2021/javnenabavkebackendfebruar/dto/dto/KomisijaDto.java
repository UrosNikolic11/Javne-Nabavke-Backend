package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class KomisijaDto {

    private Long id;
    private String glavni;

    public KomisijaDto() {
    }

    public KomisijaDto(String glavni) {
        this.glavni = glavni;
    }

    public String getGlavni() {
        return glavni;
    }

    public void setGlavni(String glavni) {
        this.glavni = glavni;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
