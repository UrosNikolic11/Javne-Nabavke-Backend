package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import javassist.NotFoundException;
import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ZalbaCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ZalbaDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Zalba;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.*;

@Component
public class ZalbaMapper {
    private final PonudjacRepository ponudjacRepository;
    private final KomisijaRepository komisijaRepository;
    private final ObavestenjeOIzabranomPonudjacuRepository obavestenjeOIzabranomPonudjacuRepository;
    private final JavnaNabavkaRepository javnaNabavkaRepository;

    public ZalbaMapper(PonudjacRepository ponudjacRepository, KomisijaRepository komisijaRepository,
                       ObavestenjeOIzabranomPonudjacuRepository obavestenjeOIzabranomPonudjacuRepository, JavnaNabavkaRepository javnaNabavkaRepository) {
        this.ponudjacRepository = ponudjacRepository;
        this.komisijaRepository = komisijaRepository;
        this.obavestenjeOIzabranomPonudjacuRepository = obavestenjeOIzabranomPonudjacuRepository;
        this.javnaNabavkaRepository = javnaNabavkaRepository;
    }

    public ZalbaDto zalbaToZalbaDto(Zalba zalba){
        ZalbaDto zalbaDto = new ZalbaDto();
        zalbaDto.setId(zalba.getId());
        zalbaDto.setPonudjac_id(zalba.getPonudjac().getId());
        zalbaDto.setKomisija_id(zalba.getKomisija().getId());
        zalbaDto.setObavestenjeOIzabranomPonudjacu_id(zalba.getObavestenjeOIzabranomPonudjacu().getId());
        zalbaDto.setJavnaNabavka_id(zalba.getJavnaNabavka().getId());
        return zalbaDto;
    }

    public Zalba zalbaCreateDtoToZalba (ZalbaCreateDto zalbaCreateDto) throws NotFoundException {
        Zalba zalba = new Zalba();
        zalba.setPonudjac(ponudjacRepository.findById(zalbaCreateDto.getPonudjac_id())
                .orElseThrow(() -> new NotFoundException(String
                        .format("Ponudjac sa ID-jem '%d' ne postoji.", zalbaCreateDto.getPonudjac_id()))));

        zalba.setKomisija(komisijaRepository.findById(zalbaCreateDto.getKomisija_id())
                .orElseThrow(() -> new NotFoundException(String
                        .format("Komisija sa ID-jem '%d' ne postoji.", zalbaCreateDto.getKomisija_id()))));

        zalba.setObavestenjeOIzabranomPonudjacu(obavestenjeOIzabranomPonudjacuRepository.findById(zalbaCreateDto.getObavestenjeOIzabranomPonudjacu_id())
                .orElseThrow(() -> new NotFoundException(String
                        .format("Obavestenje o izabranom ponudjacu sa ID-jem '%d' ne postoji.", zalbaCreateDto.getObavestenjeOIzabranomPonudjacu_id()))));

        zalba.setJavnaNabavka(javnaNabavkaRepository.findById(zalbaCreateDto.getJavnaNabavka_id())
                .orElseThrow(() -> new NotFoundException(String
                        .format("Javna nabavka sa ID-jem '%d' ne postoji.", zalbaCreateDto.getJavnaNabavka_id()))));
        return zalba;
    }
}
