package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotNull;

public class ZalbaCreateDto {
    @NotNull(message = "ponudjac_id cant be empty")
    private Long ponudjac_id;

    @NotNull(message = "komisija_id cant be empty")
    private Long komisija_id;

    @NotNull(message = "obavestenjeOIzabranomPonudjacu_id cant be empty")
    private Long obavestenjeOIzabranomPonudjacu_id;

    @NotNull(message = "javnaNabavka_id cant be empty")
    private Long javnaNabavka_id;

    public ZalbaCreateDto() {
    }

    public ZalbaCreateDto(Long ponudjac_id, Long komisija_id, Long obavestenjeOIzabranomPonudjacu_id, Long javnaNabavka_id) {
        this.ponudjac_id = ponudjac_id;
        this.komisija_id = komisija_id;
        this.obavestenjeOIzabranomPonudjacu_id = obavestenjeOIzabranomPonudjacu_id;
        this.javnaNabavka_id = javnaNabavka_id;
    }

    public Long getPonudjac_id() {
        return ponudjac_id;
    }

    public void setPonudjac_id(Long ponudjac_id) {
        this.ponudjac_id = ponudjac_id;
    }

    public Long getKomisija_id() {
        return komisija_id;
    }

    public void setKomisija_id(Long komisija_id) {
        this.komisija_id = komisija_id;
    }

    public Long getObavestenjeOIzabranomPonudjacu_id() {
        return obavestenjeOIzabranomPonudjacu_id;
    }

    public void setObavestenjeOIzabranomPonudjacu_id(Long obavestenjeOIzabranomPonudjacu_id) {
        this.obavestenjeOIzabranomPonudjacu_id = obavestenjeOIzabranomPonudjacu_id;
    }

    public Long getJavnaNabavka_id() {
        return javnaNabavka_id;
    }

    public void setJavnaNabavka_id(Long javnaNabavka_id) {
        this.javnaNabavka_id = javnaNabavka_id;
    }
}
