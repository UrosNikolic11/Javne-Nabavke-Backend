package rs.raf.ui2021.javnenabavkebackendfebruar.mapper;

import org.springframework.stereotype.Component;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto.ObavestenjeOIzabranomPonudjacuCreateDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto.ObavestenjeOIzabranomPonudjacuDto;
import rs.raf.ui2021.javnenabavkebackendfebruar.exception.NotFoundException;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.JavnaNabavka;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.Komisija;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.ObavestenjeOIzabranomPonudjacu;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.JavnaNabavkaRepository;
import rs.raf.ui2021.javnenabavkebackendfebruar.repository.KomisijaRepository;

import java.util.Optional;

@Component
public class ObavestenjeOIzabranomPonudjacuMapper {

    private KomisijaRepository komisijaRepository;
    private JavnaNabavkaRepository javnaNabavkaRepository;

    public ObavestenjeOIzabranomPonudjacuMapper(KomisijaRepository komisijaRepository, JavnaNabavkaRepository javnaNabavkaRepository) {
        this.komisijaRepository = komisijaRepository;
        this.javnaNabavkaRepository = javnaNabavkaRepository;
    }

    public ObavestenjeOIzabranomPonudjacu createDtoToOriginal(ObavestenjeOIzabranomPonudjacuCreateDto obavestenjeOIzabranomPonudjacuCreateDto){
        ObavestenjeOIzabranomPonudjacu obavestenjeOIzabranomPonudjacu = new ObavestenjeOIzabranomPonudjacu();
        Optional<Komisija> komisija = komisijaRepository.findById(obavestenjeOIzabranomPonudjacuCreateDto.getKomisijaId());
        Optional<JavnaNabavka> javnaNabavka = javnaNabavkaRepository.findById(obavestenjeOIzabranomPonudjacuCreateDto.getJavnaNabavkaId());

        if(!komisija.isPresent())
            throw new NotFoundException("Komisija sa datim id ne postoji.");
        if(!javnaNabavka.isPresent()){
            throw new NotFoundException("Javna nabavka sa datim id ne postoji.");
        }

        obavestenjeOIzabranomPonudjacu.setJavnaNabavka(javnaNabavka.get());
        obavestenjeOIzabranomPonudjacu.setKomisija(komisija.get());

        return obavestenjeOIzabranomPonudjacu;
    }

    public ObavestenjeOIzabranomPonudjacuDto originalToDto(ObavestenjeOIzabranomPonudjacu obavestenjeOIzabranomPonudjacu){
        ObavestenjeOIzabranomPonudjacuDto obavestenjeOIzabranomPonudjacuDto = new ObavestenjeOIzabranomPonudjacuDto();
        obavestenjeOIzabranomPonudjacuDto.setId(obavestenjeOIzabranomPonudjacu.getId());
        obavestenjeOIzabranomPonudjacuDto.setJavnaNabavkaId(obavestenjeOIzabranomPonudjacu.getJavnaNabavka().getId());
        obavestenjeOIzabranomPonudjacuDto.setKomisijaId(obavestenjeOIzabranomPonudjacu.getKomisija().getId());

        return obavestenjeOIzabranomPonudjacuDto;
    }

}
