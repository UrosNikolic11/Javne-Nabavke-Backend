package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class LoginDto {

    private NarucilacDto narucilac;
    private PonudjacDto ponudjac;
    private RadnikDto radnik;

    public LoginDto() {
    }

    public NarucilacDto getNarucilac() {
        return narucilac;
    }

    public void setNarucilac(NarucilacDto narucilac) {
        this.narucilac = narucilac;
    }

    public PonudjacDto getPonudjac() {
        return ponudjac;
    }

    public void setPonudjac(PonudjacDto ponudjac) {
        this.ponudjac = ponudjac;
    }

    public RadnikDto getRadnik() {
        return radnik;
    }

    public void setRadnik(RadnikDto radnik) {
        this.radnik = radnik;
    }
}