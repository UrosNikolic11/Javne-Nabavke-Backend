package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

import rs.raf.ui2021.javnenabavkebackendfebruar.model.ObavestenjeOIzabranomPonudjacu;

public class ZalbaDto {
    private Long id;
    private Long ponudjac_id;
    private Long komisija_id;
    private Long obavestenjeOIzabranomPonudjacu_id;
    private Long javnaNabavka_id;

    public ZalbaDto() {
    }

    public ZalbaDto(Long id, Long ponudjac_id, Long komisija_id, Long obavestenjeOIzabranomPonudjacu_id, Long javnaNabavka_id) {
        this.id = id;
        this.ponudjac_id = ponudjac_id;
        this.komisija_id = komisija_id;
        this.obavestenjeOIzabranomPonudjacu_id = obavestenjeOIzabranomPonudjacu_id;
        this.javnaNabavka_id = javnaNabavka_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
